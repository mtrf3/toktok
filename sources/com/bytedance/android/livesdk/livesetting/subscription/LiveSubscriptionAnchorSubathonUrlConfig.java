package com.bytedance.android.livesdk.livesetting.subscription;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveSubscriptionAnchorSubathonUrlConfig {

    @InterfaceC65349Pkn("subathon_detail")
    public String subathonDetail;

    @InterfaceC65349Pkn("subathon_detail_live")
    public String subathonDetailLive;

    @InterfaceC65349Pkn("subathon_faq")
    public String subathonFaq;

    @InterfaceC65349Pkn("subathon_faq_live")
    public String subathonFaqLive;

    @InterfaceC65349Pkn("subathon_management")
    public String subathonManagement;

    @InterfaceC65349Pkn("subathon_management_live")
    public String subathonManagementLive;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveSubscriptionAnchorSubathonUrlConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final String getSubathonDetail() {
        return this.subathonDetail;
    }

    public final String getSubathonDetailLive() {
        return this.subathonDetailLive;
    }

    public final String getSubathonFaq() {
        return this.subathonFaq;
    }

    public final String getSubathonFaqLive() {
        return this.subathonFaqLive;
    }

    public final String getSubathonManagement() {
        return this.subathonManagement;
    }

    public final String getSubathonManagementLive() {
        return this.subathonManagementLive;
    }

    public final void setSubathonDetail(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.subathonDetail = str;
    }

    public final void setSubathonDetailLive(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.subathonDetailLive = str;
    }

    public final void setSubathonFaq(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.subathonFaq = str;
    }

    public final void setSubathonFaqLive(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.subathonFaqLive = str;
    }

    public final void setSubathonManagement(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.subathonManagement = str;
    }

    public final void setSubathonManagementLive(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.subathonManagementLive = str;
    }

    public LiveSubscriptionAnchorSubathonUrlConfig(String subathonManagement, String subathonDetail, String subathonManagementLive, String subathonDetailLive, String subathonFaq, String subathonFaqLive) {
        o.LJIIIZ(subathonManagement, "subathonManagement");
        o.LJIIIZ(subathonDetail, "subathonDetail");
        o.LJIIIZ(subathonManagementLive, "subathonManagementLive");
        o.LJIIIZ(subathonDetailLive, "subathonDetailLive");
        o.LJIIIZ(subathonFaq, "subathonFaq");
        o.LJIIIZ(subathonFaqLive, "subathonFaqLive");
        this.subathonManagement = subathonManagement;
        this.subathonDetail = subathonDetail;
        this.subathonManagementLive = subathonManagementLive;
        this.subathonDetailLive = subathonDetailLive;
        this.subathonFaq = subathonFaq;
        this.subathonFaqLive = subathonFaqLive;
    }

    public /* synthetic */ LiveSubscriptionAnchorSubathonUrlConfig(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "");
    }
}
