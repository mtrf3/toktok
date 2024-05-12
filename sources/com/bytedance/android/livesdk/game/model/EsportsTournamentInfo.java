package com.bytedance.android.livesdk.game.model;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class EsportsTournamentInfo {

    @InterfaceC65349Pkn("tournament_type")
    public int tournamentType;

    @InterfaceC65349Pkn("tournament_id")
    public String tournamentId = "";

    @InterfaceC65349Pkn("tournament_name")
    public String tournamentName = "";

    @InterfaceC65349Pkn("tournament_icon")
    public String tournamentIcon = "";

    @InterfaceC65349Pkn("icon_theme_color")
    public String iconThemeColor = "";

    @InterfaceC65349Pkn("match_info_list")
    public List<EsportsMatchInfo> matchInfoList = new ArrayList();
}
