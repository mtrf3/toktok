package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.KMP;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class KickOutReason {
    public static final Companion Companion = new Companion();

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isKickoutException(int i) {
            return i == 1 || i == 3 || i == 4;
        }

        public final int toExceptionType(int i) {
            if (i == 1) {
                return LiveChatShowDelayForHotLiveSetting.DEFAULT;
            }
            if (i != 3) {
                return i != 4 ? 499 : 402;
            }
            return 401;
        }

        public Companion() {
        }

        public final String stateToString(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return KMP.LJ("unknown: ", i);
                            }
                            return "kick_out_reason_by_admin";
                        }
                        return "kick_out_reason_by_punish";
                    }
                    return "rtc_lost_connection";
                }
                return "reason_by_host";
            }
            return "first_frame_timeout";
        }
    }
}
