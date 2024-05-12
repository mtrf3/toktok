package X;

import android.graphics.Canvas;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Wh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34311Wh extends AbstractC17600ma {
    public final C1W5 LIZIZ;
    public boolean LIZJ;
    public final C17500mQ LIZLLL;
    public InterfaceC65784Pro<C76800UCe> LJ;
    public final ParcelableSnapshotMutableState LJFF;
    public float LJI;
    public float LJII;
    public long LJIIIIZZ;
    public final IDqS416S0100000 LJIIIZ;

    public final String toString() {
        String str = "Params: \tname: " + this.LIZIZ.LJIIIIZZ + "\n\tviewportWidth: " + this.LJI + "\n\tviewportHeight: " + this.LJII + "\n";
        o.LJIIIIZZ(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public C34311Wh() {
        C1W5 c1w5 = new C1W5();
        c1w5.LJIIJ = 0.0f;
        c1w5.LJIILLIIL = true;
        c1w5.LIZJ();
        c1w5.LJIIJJI = 0.0f;
        c1w5.LJIILLIIL = true;
        c1w5.LIZJ();
        c1w5.LIZLLL(new IDqS420S0100000(this, 133));
        this.LIZIZ = c1w5;
        this.LIZJ = true;
        this.LIZLLL = new C17500mQ();
        this.LJ = C22X.LJLIL;
        this.LJFF = C78966Uyw.LJJJIL(null);
        this.LJIIIIZZ = C10430b1.LIZJ;
        this.LJIIIZ = new IDqS416S0100000(this, 254);
    }

    @Override // X.AbstractC17600ma
    public final void LIZ(InterfaceC33691Tx interfaceC33691Tx) {
        o.LJIIIZ(interfaceC33691Tx, "<this>");
        LJ(interfaceC33691Tx, 1.0f, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ(InterfaceC33691Tx interfaceC33691Tx, float f, C11890dN c11890dN) {
        C11890dN c11890dN2 = c11890dN;
        o.LJIIIZ(interfaceC33691Tx, "<this>");
        if (c11890dN2 == null) {
            c11890dN2 = (C11890dN) this.LJFF.getValue();
        }
        if (this.LIZJ || !C10430b1.LIZ(this.LJIIIIZZ, interfaceC33691Tx.LIZIZ())) {
            C1W5 c1w5 = this.LIZIZ;
            c1w5.LJIIL = C10430b1.LIZLLL(interfaceC33691Tx.LIZIZ()) / this.LJI;
            c1w5.LJIILLIIL = true;
            c1w5.LIZJ();
            C1W5 c1w52 = this.LIZIZ;
            c1w52.LJIILIIL = C10430b1.LIZIZ(interfaceC33691Tx.LIZIZ()) / this.LJII;
            c1w52.LJIILLIIL = true;
            c1w52.LIZJ();
            C17500mQ c17500mQ = this.LIZLLL;
            long LIZIZ = C78996UzQ.LIZIZ((int) Math.ceil(C10430b1.LIZLLL(interfaceC33691Tx.LIZIZ())), (int) Math.ceil(C10430b1.LIZIZ(interfaceC33691Tx.LIZIZ())));
            EnumC23500w6 layoutDirection = interfaceC33691Tx.getLayoutDirection();
            IDqS416S0100000 block = this.LJIIIZ;
            c17500mQ.getClass();
            o.LJIIIZ(layoutDirection, "layoutDirection");
            o.LJIIIZ(block, "block");
            c17500mQ.LIZJ = interfaceC33691Tx;
            C1QV c1qv = c17500mQ.LIZ;
            C1QR c1qr = c17500mQ.LIZIZ;
            if (c1qv == null || c1qr == null || ((int) (LIZIZ >> 32)) > c1qv.getWidth() || C23490w5.LIZIZ(LIZIZ) > c1qv.getHeight()) {
                c1qv = C78966Uyw.LIZ((int) (LIZIZ >> 32), C23490w5.LIZIZ(LIZIZ), 0, 28);
                c1qr = new C1QR();
                c1qr.LIZ = new Canvas(C78688UuS.LJ(c1qv));
                c17500mQ.LIZ = c1qv;
                c17500mQ.LIZIZ = c1qr;
            }
            c17500mQ.LIZLLL = LIZIZ;
            C43011mT c43011mT = c17500mQ.LJ;
            long LJJJJIZL = C78996UzQ.LJJJJIZL(LIZIZ);
            C14680hs c14680hs = c43011mT.LJLIL;
            InterfaceC23370vt interfaceC23370vt = c14680hs.LIZ;
            EnumC23500w6 enumC23500w6 = c14680hs.LIZIZ;
            InterfaceC11750d9 interfaceC11750d9 = c14680hs.LIZJ;
            long j = c14680hs.LIZLLL;
            c14680hs.LIZ = interfaceC33691Tx;
            c14680hs.LIZIZ = layoutDirection;
            c14680hs.LIZJ = c1qr;
            c14680hs.LIZLLL = LJJJJIZL;
            c1qr.LJIIL();
            C14720hw.LJIIIIZZ(c43011mT, C11850dJ.LIZIZ, 0L, 0L, 0.0f, null, 62);
            block.invoke(c43011mT);
            c1qr.LJIIJ();
            C14680hs c14680hs2 = c43011mT.LJLIL;
            c14680hs2.getClass();
            o.LJIIIZ(interfaceC23370vt, "<set-?>");
            c14680hs2.LIZ = interfaceC23370vt;
            o.LJIIIZ(enumC23500w6, "<set-?>");
            c14680hs2.LIZIZ = enumC23500w6;
            o.LJIIIZ(interfaceC11750d9, "<set-?>");
            c14680hs2.LIZJ = interfaceC11750d9;
            c14680hs2.LIZLLL = j;
            c1qv.LIZIZ.prepareToDraw();
            this.LIZJ = false;
            this.LJIIIIZZ = interfaceC33691Tx.LIZIZ();
        }
        C17500mQ c17500mQ2 = this.LIZLLL;
        c17500mQ2.getClass();
        C1QV c1qv2 = c17500mQ2.LIZ;
        if (c1qv2 != null) {
            C14720hw.LIZLLL(interfaceC33691Tx, c1qv2, 0L, c17500mQ2.LIZLLL, 0L, f, c11890dN2, 0, 858);
        } else {
            "drawCachedImage must be invoked first before attempting to draw the result into another destination".toString();
            throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
    }
}
