package webcast.api.game;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class AnchorTagListResult {

    @InterfaceC65349Pkn("game_name")
    public String gameName = "";

    @InterfaceC65349Pkn("game_id")
    public String gameId = "";

    @InterfaceC65349Pkn("game_tag_id")
    public String gameTagId = "";

    @InterfaceC65349Pkn("index")
    public String index = "";

    @InterfaceC65349Pkn("icon_url")
    public String iconUrl = "";

    @InterfaceC65349Pkn("icon_uri")
    public String iconUri = "";

    @InterfaceC65349Pkn("genres")
    public List<GameAnchorCategory> genres = new ArrayList();
}
