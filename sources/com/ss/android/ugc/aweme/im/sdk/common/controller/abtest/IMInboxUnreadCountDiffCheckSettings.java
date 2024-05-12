package com.ss.android.ugc.aweme.im.sdk.common.controller.abtest;

import X.C221108m2;
import X.C39K;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class IMInboxUnreadCountDiffCheckSettings {
    public static final DifferenceCheckConfig LIZ = new DifferenceCheckConfig(true, 60000, 1);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C39K.LJLIL);

    /* loaded from: classes2.dex */
    public static final class DifferenceCheckConfig {

        @InterfaceC65349Pkn("interval")
        public final int checkInterval;

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("event_tracking")
        public final int eventTrackingConfig;

        public DifferenceCheckConfig(boolean z, int i, int i2) {
            this.enable = z;
            this.checkInterval = i;
            this.eventTrackingConfig = i2;
        }
    }
}
