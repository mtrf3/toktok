package X;

import Y.ARunnableS49S0100000_13;
import android.view.View;
import java.util.HashMap;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UYw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77390UYw implements InterfaceC74940Tb6 {
    public static final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C77391UYx.LJLIL);
    public String LIZ = "";
    public String LIZIZ = "";
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public boolean LJIIIIZZ;

    @Override // X.InterfaceC74940Tb6
    public final void LIZIZ() {
        LJII(new AqS163S0100000_13(this, 22), this.LJ);
    }

    @Override // X.InterfaceC74940Tb6
    public final void LIZLLL() {
        LJII(new AqS163S0100000_13(this, 20), this.LJI);
    }

    @Override // X.InterfaceC74940Tb6
    public final void LJ() {
        LJII(new AqS163S0100000_13(this, 21), this.LJFF);
    }

    @Override // X.InterfaceC74940Tb6
    public final void LJFF() {
        LJII(new AqS163S0100000_13(this, 23), this.LIZLLL);
    }

    @Override // X.InterfaceC74940Tb6
    public final void LIZJ(View view) {
        o.LJIIIZ(view, "view");
        view.post(new ARunnableS49S0100000_13(this, 4));
    }

    @Override // X.InterfaceC74940Tb6
    public final void LIZ(String str, String str2) {
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("scene=");
        LIZ.append(str);
        LIZ.append(", source=");
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LJII("MultiGuestPageFirstFrameLogHelper", LIZIZ);
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
        this.LJ = 0L;
        this.LJFF = 0L;
        this.LJI = 0L;
        this.LJII = 0L;
        this.LJIIIIZZ = true;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = System.currentTimeMillis();
    }

    public final void LJII(InterfaceC65784Pro interfaceC65784Pro, long j) {
        if (j <= 0 && this.LJIIIIZZ) {
            interfaceC65784Pro.invoke();
        }
    }

    public static HashMap LJI(HashMap hashMap, String str, long j, long j2) {
        if (j > 0 && j2 > 0 && j >= j2) {
            C7MY.LJFF(j, j2, hashMap, str);
        }
        return hashMap;
    }
}
