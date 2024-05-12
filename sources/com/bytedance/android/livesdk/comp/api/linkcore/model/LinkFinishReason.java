package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.KMP;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class LinkFinishReason {
    public static final Companion Companion = new Companion();

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean containsState(int i) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return true;
                default:
                    return false;
            }
        }

        public Companion() {
        }

        public final String stateToString(int i) {
            switch (i) {
                case 0:
                    return "unknown";
                case 1:
                    return "leave_self";
                case 2:
                    return "leave_msg";
                case 3:
                    return "room_close";
                case 4:
                    return "rtc_error";
                case 5:
                    return "leave_only_one";
                case 6:
                    return "first_frame_time_out";
                case 7:
                    return "linked_list_without_me";
                default:
                    return KMP.LJ("unknown", i);
            }
        }
    }
}
