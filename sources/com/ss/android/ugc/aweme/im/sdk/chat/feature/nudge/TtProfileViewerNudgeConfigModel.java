package com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class TtProfileViewerNudgeConfigModel extends F9E {

    @InterfaceC65349Pkn("frequency")
    public final long frequency;

    public TtProfileViewerNudgeConfigModel() {
        this(0L, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.frequency)};
    }

    public TtProfileViewerNudgeConfigModel(long j) {
        this.frequency = j;
    }

    public /* synthetic */ TtProfileViewerNudgeConfigModel(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 60L : j);
    }
}
