package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.LBx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53861LBx extends AbstractC26257ASf {
    public final /* synthetic */ C53860LBw LIZ;

    public C53861LBx(C53860LBw c53860LBw) {
        this.LIZ = c53860LBw;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZ(View bottomSheet, float f) {
        EnumC53863LBz enumC53863LBz;
        o.LJIIIZ(bottomSheet, "bottomSheet");
        C53860LBw c53860LBw = this.LIZ;
        if (!c53860LBw.LJLIL) {
            c53860LBw.LJLIL = true;
            c53860LBw.LJLILLLLZI = f;
        }
        float f2 = c53860LBw.LJLILLLLZI;
        if (f > f2) {
            enumC53863LBz = EnumC53863LBz.TOP;
        } else if (f < f2) {
            enumC53863LBz = EnumC53863LBz.BOTTOM;
        } else {
            enumC53863LBz = EnumC53863LBz.DEFAULT;
        }
        c53860LBw.LIZ(enumC53863LBz);
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View bottomSheet) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
        if (i != 3 && i != 4 && i != 5 && i != 6) {
            return;
        }
        C53860LBw c53860LBw = this.LIZ;
        c53860LBw.LJLIL = false;
        c53860LBw.LIZ(EnumC53863LBz.DEFAULT);
    }
}
