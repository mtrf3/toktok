package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes6.dex */
public final class CNE extends C0KA {
    public int LIZ = 3;
    public final /* synthetic */ List<CNL> LIZIZ;
    public final /* synthetic */ CNL LIZJ;

    public CNE(List<CNL> list, CNL cnl) {
        this.LIZIZ = list;
        this.LIZJ = cnl;
    }

    @Override // X.C0KA
    public final void LIZ(View view, float f) {
        Iterator<CNL> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            View dk = it.next().dk();
            if (dk != null) {
                h0.LJIIL((int) (dk.getHeight() * f), dk);
            }
        }
    }

    @Override // X.C0KA
    public final void LIZIZ(int i, View view) {
        Object LIZ;
        if (i == 5) {
            List<CNL> list = this.LIZIZ;
            CNL cnl = this.LIZJ;
            for (CNL cnl2 : list) {
                if (cnl2 != null && this.LIZ == 2 && !o.LJ(cnl2.getHybridContainerId(), cnl.getHybridContainerId())) {
                    try {
                        cnl2.close();
                        LIZ = C76800UCe.LIZ;
                        C3C5.m7constructorimpl(LIZ);
                    } catch (Throwable th) {
                        LIZ = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ);
                    }
                    C3C5.m6boximpl(LIZ);
                }
            }
        }
        this.LIZ = i;
    }
}
