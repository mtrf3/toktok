package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class CanvasStyle extends F9E {

    @InterfaceC65349Pkn("type")
    public final int type;

    public CanvasStyle() {
        this(0, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.type)};
    }

    public CanvasStyle(int i) {
        this.type = i;
    }

    public /* synthetic */ CanvasStyle(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 4 : i);
    }
}
