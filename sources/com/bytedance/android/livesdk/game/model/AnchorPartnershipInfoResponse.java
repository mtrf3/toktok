package com.bytedance.android.livesdk.game.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import webcast.api.partnership.LabelFilterInfo;
import webcast.api.partnership.PunishInfo;
import webcast.api.partnership.TaskPriceUpdate;

/* loaded from: classes6.dex */
public final class AnchorPartnershipInfoResponse {

    @InterfaceC65349Pkn("has_permission")
    public boolean hasPermission;

    @InterfaceC65349Pkn("label_filter_info")
    public LabelFilterInfo labelFilterInfo;

    @InterfaceC65349Pkn("price_update_list")
    public List<TaskPriceUpdate> priceUpdateList;

    @InterfaceC65349Pkn("punish_info")
    public List<PunishInfo> punishInfo;

    @InterfaceC65349Pkn("sign_agreement")
    public boolean signAgreement;

    @InterfaceC65349Pkn("TaxPayoutConfirm")
    public boolean taxpayoutconfirm;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnchorPartnershipInfoResponse() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.model.AnchorPartnershipInfoResponse.<init>():void");
    }

    public AnchorPartnershipInfoResponse(boolean z, boolean z2) {
        this.hasPermission = z;
        this.signAgreement = z2;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.punishInfo = c61878OQg;
        this.priceUpdateList = c61878OQg;
    }

    public /* synthetic */ AnchorPartnershipInfoResponse(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
