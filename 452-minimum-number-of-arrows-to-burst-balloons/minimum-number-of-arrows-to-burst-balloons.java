class Solution {
    public int findMinArrowShots(int[][] points) {
      Arrays.sort(points,(point1,point2) ->Integer.compare(point1[1],point2[1]));
      int arrow=1;
      int pos=points[0][1];
      for(int i=1;i<points.length;i++){
          if(pos>=points[i][0]){
              continue;
          }
          arrow++;
          pos=points[i][1];
      }
      return arrow;
    }
}