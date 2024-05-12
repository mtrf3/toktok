package com.bytedance.android.livesdk.comp.api.linkcore.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class ReplyStatus {
    public static final Companion Companion = new Companion();

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String replyStatusToString(int i) {
            return i == 1 ? "agree" : "reject";
        }

        public Companion() {
        }
    }
}
