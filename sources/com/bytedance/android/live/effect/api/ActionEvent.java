package com.bytedance.android.live.effect.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ActionEvent extends F9E {
    public final float LJLIL;
    public final float LJLILLLLZI;

    @InterfaceC65349Pkn("visible")
    public final boolean visible;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ActionEvent() {
        /*
            r6 = this;
            r1 = 0
            r2 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r3 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.api.ActionEvent.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.visible), Float.valueOf(this.LJLIL), Float.valueOf(this.LJLILLLLZI)};
    }

    public ActionEvent(boolean z, float f, float f2) {
        this.visible = z;
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
    }

    public /* synthetic */ ActionEvent(boolean z, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2);
    }
}
