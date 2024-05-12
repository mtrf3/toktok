package X;

import android.content.Intent;

/* renamed from: X.Ci1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32053Ci1 implements InterfaceC58316Mue {
    public final /* synthetic */ AbstractC32054Ci2<P, R> LIZ;

    public C32053Ci1(AbstractC32054Ci2<P, R> abstractC32054Ci2) {
        this.LIZ = abstractC32054Ci2;
    }

    @Override // X.InterfaceC58316Mue
    public final void onActivityResult(int i, int i2, Intent intent) {
        AbstractC32054Ci2<P, R> abstractC32054Ci2 = this.LIZ;
        if (abstractC32054Ci2.LJLILLLLZI == null) {
            return;
        }
        if (abstractC32054Ci2.LJLIL) {
            i &= 65535;
        }
        abstractC32054Ci2.onActivityResult(i, i2, intent);
    }
}
