package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DropsPageSchemaData {

    @InterfaceC65349Pkn("drops_audience_list")
    public String dropsAudienceList;

    @InterfaceC65349Pkn("drops_guide")
    public String dropsGuide;

    @InterfaceC65349Pkn("drops_host_list")
    public String dropsHostList;

    @InterfaceC65349Pkn("drops_host_task_panel")
    public String dropsHostTaskPanel;

    @InterfaceC65349Pkn("drops_setup")
    public String dropsSetup;

    /* JADX WARN: Multi-variable type inference failed */
    public DropsPageSchemaData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public DropsPageSchemaData(String dropsGuide, String dropsAudienceList, String dropsHostList, String dropsHostTaskPanel, String dropsSetup) {
        o.LJIIIZ(dropsGuide, "dropsGuide");
        o.LJIIIZ(dropsAudienceList, "dropsAudienceList");
        o.LJIIIZ(dropsHostList, "dropsHostList");
        o.LJIIIZ(dropsHostTaskPanel, "dropsHostTaskPanel");
        o.LJIIIZ(dropsSetup, "dropsSetup");
        this.dropsGuide = dropsGuide;
        this.dropsAudienceList = dropsAudienceList;
        this.dropsHostList = dropsHostList;
        this.dropsHostTaskPanel = dropsHostTaskPanel;
        this.dropsSetup = dropsSetup;
    }

    public /* synthetic */ DropsPageSchemaData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "");
    }
}
