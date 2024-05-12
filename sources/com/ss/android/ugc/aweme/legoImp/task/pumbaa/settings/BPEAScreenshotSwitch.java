package com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class BPEAScreenshotSwitch extends F9E {

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    public BPEAScreenshotSwitch() {
        this(false, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable)};
    }

    public BPEAScreenshotSwitch(boolean z) {
        this.enable = z;
    }

    public /* synthetic */ BPEAScreenshotSwitch(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
