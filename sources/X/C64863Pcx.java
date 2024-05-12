package X;

import Y.ARunnableS10S1200000_11;
import Y.ARunnableS12S1100000_11;
import Y.ARunnableS22S0300000_11;
import Y.ARunnableS30S0200000_11;
import Y.ARunnableS47S0100000_11;
import okhttp3.Request;

/* renamed from: X.Pcx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64863Pcx extends QXX {
    public final /* synthetic */ C64862Pcw LJLIL;

    @Override // X.QXX
    public final void LLJLLIL() {
        this.LJLIL.LJII(new ARunnableS47S0100000_11(this, 153));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64863Pcx(C64862Pcw c64862Pcw) {
        super((Object) null);
        this.LJLIL = c64862Pcw;
    }

    @Override // X.QXX
    public final void LLLFZ(String str) {
        this.LJLIL.LJII(new ARunnableS12S1100000_11(this, str, 11));
    }

    @Override // X.QXX
    public final void LLLI(C64537PUn c64537PUn) {
        this.LJLIL.LJII(new ARunnableS30S0200000_11(this, c64537PUn, 73));
    }

    @Override // X.QXX
    public final void LLLIIL(PXI pxi) {
        this.LJLIL.LJII(new ARunnableS30S0200000_11(this, pxi, 74));
    }

    @Override // X.QXX
    public final void LLLIIII(PXI pxi, C64598PWw c64598PWw) {
        this.LJLIL.LJII(new ARunnableS22S0300000_11(this, pxi, c64598PWw, 16));
    }

    @Override // X.QXX
    public final void LLJLL(PXI pxi, int i, String str) {
        String str2;
        Request LJIIIIZZ;
        C64626PXy url;
        this.LJLIL.getClass();
        if (pxi != null && (LJIIIIZZ = pxi.LJIIIIZZ()) != null && (url = LJIIIIZZ.url()) != null) {
            str2 = url.LJIIIIZZ;
        } else {
            str2 = "";
        }
        this.LJLIL.LJII(new ARunnableS10S1200000_11(this, pxi, str2, i, str, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    @Override // X.QXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJZIJLIL(X.PXW r9, java.lang.Throwable r10, X.C64598PWw r11) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64863Pcx.LLJZIJLIL(X.PXW, java.lang.Throwable, X.PWw):void");
    }
}
