package X;

import android.content.Intent;

/* renamed from: X.ObC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62206ObC implements InterfaceC27436Apk {
    public final /* synthetic */ AbstractC62203Ob9 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public C62206ObC(C62202Ob8 c62202Ob8, boolean z) {
        this.LJLIL = c62202Ob8;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC27436Apk
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return this.LJLIL.LIZ(i, i2, intent, false, this.LJLILLLLZI);
    }
}
