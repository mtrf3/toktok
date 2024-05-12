package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PartnershipSchemaConfig {

    @InterfaceC65349Pkn("roma_schema_page_current_promote")
    public String currentPromote;

    @InterfaceC65349Pkn("roma_schema_page_event_qualification")
    public String eventQualification;

    @InterfaceC65349Pkn("roma_schema_page_drop_list")
    public String pageDropList;

    @InterfaceC65349Pkn("roma_schema_page_intro_card")
    public String pageIntroCard;

    @InterfaceC65349Pkn("roma_schema_page_promote_center")
    public String promoteCenter;

    @InterfaceC65349Pkn("roma_schema_page_promote_introduction")
    public String promoteIntroduction;

    @InterfaceC65349Pkn("roma_schema_page_promote_list")
    public String promoteList;

    @InterfaceC65349Pkn("roma_schema_page_user_game_detail_v2")
    public String userGameDetail;

    @InterfaceC65349Pkn("roma_schema_page_user_game_detail")
    public String userGameDetailLandscape;

    /* JADX WARN: Multi-variable type inference failed */
    public PartnershipSchemaConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public PartnershipSchemaConfig(String pageIntroCard, String promoteList, String promoteIntroduction, String promoteCenter, String currentPromote, String eventQualification, String pageDropList, String userGameDetailLandscape, String userGameDetail) {
        o.LJIIIZ(pageIntroCard, "pageIntroCard");
        o.LJIIIZ(promoteList, "promoteList");
        o.LJIIIZ(promoteIntroduction, "promoteIntroduction");
        o.LJIIIZ(promoteCenter, "promoteCenter");
        o.LJIIIZ(currentPromote, "currentPromote");
        o.LJIIIZ(eventQualification, "eventQualification");
        o.LJIIIZ(pageDropList, "pageDropList");
        o.LJIIIZ(userGameDetailLandscape, "userGameDetailLandscape");
        o.LJIIIZ(userGameDetail, "userGameDetail");
        this.pageIntroCard = pageIntroCard;
        this.promoteList = promoteList;
        this.promoteIntroduction = promoteIntroduction;
        this.promoteCenter = promoteCenter;
        this.currentPromote = currentPromote;
        this.eventQualification = eventQualification;
        this.pageDropList = pageDropList;
        this.userGameDetailLandscape = userGameDetailLandscape;
        this.userGameDetail = userGameDetail;
    }

    public /* synthetic */ PartnershipSchemaConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? str9 : "");
    }
}
