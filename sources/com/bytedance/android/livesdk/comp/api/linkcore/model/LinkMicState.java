package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C47261Igj;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class LinkMicState {
    public static final Companion Companion = new Companion();
    public static final List<String> stateString = C47261Igj.LJJIJIIJI("idle", "initialized", "waiting", "joining_channel", "joined_channel", "frame_linked", "finished");

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final String castStateToString(int i) {
            List<String> list = LinkMicState.stateString;
            if (i < list.size()) {
                return (String) ListProtector.get(list, i);
            }
            return "";
        }
    }
}
