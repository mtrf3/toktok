package com.ss.android.ugc.aweme.im.service.appsettings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class RecommendedChatDelaySettingsModel extends F9E {

    @InterfaceC65349Pkn("im_recommended_chat_inbox_tab_click_delay")
    public final long inboxClickDelay;

    @InterfaceC65349Pkn("im_recommended_chat_push_delay")
    public final long pushDelay;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecommendedChatDelaySettingsModel() {
        /*
            r7 = this;
            r1 = 0
            r5 = 3
            r6 = 0
            r0 = r7
            r3 = r1
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.appsettings.RecommendedChatDelaySettingsModel.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.inboxClickDelay), Long.valueOf(this.pushDelay)};
    }

    public RecommendedChatDelaySettingsModel(long j, long j2) {
        this.inboxClickDelay = j;
        this.pushDelay = j2;
    }

    public /* synthetic */ RecommendedChatDelaySettingsModel(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 5L : j, (i & 2) != 0 ? 60L : j2);
    }
}
