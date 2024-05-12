package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MultiGuestFeSchemaConfig {

    @InterfaceC65349Pkn("feedback")
    public String feedback;

    @InterfaceC65349Pkn("guest_overview")
    public String guestOverview;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiGuestFeSchemaConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public MultiGuestFeSchemaConfig(String feedback, String guestOverview) {
        o.LJIIIZ(feedback, "feedback");
        o.LJIIIZ(guestOverview, "guestOverview");
        this.feedback = feedback;
        this.guestOverview = guestOverview;
    }

    public /* synthetic */ MultiGuestFeSchemaConfig(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
