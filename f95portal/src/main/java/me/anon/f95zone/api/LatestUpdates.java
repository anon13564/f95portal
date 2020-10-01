package me.anon.f95zone.api;

public class LatestUpdates
{
    private Request request;
    
    public void refresh()
    {
        request = new Request("new_latest.php", "cmd=list", "cat=games", "page=1", "sort=date", "_=" + System.currentTimeMillis());
        JSONResponse res = request.getJSONResponse();
        //
    }
}
