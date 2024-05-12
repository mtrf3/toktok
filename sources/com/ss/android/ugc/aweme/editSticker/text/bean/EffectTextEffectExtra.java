package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class EffectTextEffectExtra extends F9E {
    public final boolean LJLIL;

    @InterfaceC65349Pkn("ifstandard")
    public final boolean ifStandard;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EffectTextEffectExtra() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextEffectExtra.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.ifStandard), Boolean.valueOf(this.LJLIL)};
    }

    public EffectTextEffectExtra(boolean z, boolean z2) {
        this.ifStandard = z;
        this.LJLIL = z2;
    }

    public /* synthetic */ EffectTextEffectExtra(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
