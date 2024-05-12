package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.1g6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39061g6 implements InterfaceC104994Ad {
    public final /* synthetic */ int LIZIZ;
    public Object LIZJ;

    public final String LIZJ() {
        return ((C38281F0r) this.LIZJ).LJ();
    }

    public final String toString() {
        switch (this.LIZIZ) {
            case 3:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("SplashCanvasInfo{mSiteId='");
                return C77800Ug8.LIZJ(LIZ, (String) this.LIZJ, '\'', '}', LIZ);
            default:
                return super.toString();
        }
    }

    public C39061g6(int i) {
        this.LIZIZ = i;
        if (i != 4) {
            return;
        }
        this.LIZJ = new LinkedHashMap();
    }

    public C39061g6(InterfaceC73114Smk view) {
        this.LIZIZ = 1;
        o.LJIIIZ(view, "view");
        this.LIZJ = new C73112Smi(view);
    }

    public C39061g6(String str) {
        this.LIZIZ = 5;
        this.LIZJ = new C38281F0r(str);
    }

    public /* synthetic */ C39061g6(int i, Object obj) {
        this.LIZIZ = i;
        this.LIZJ = obj;
    }

    public final void LIZ(int i, String str) {
        ((C38281F0r) this.LIZJ).LIZ(i, str);
        C58590Mz4 c58590Mz4 = C61200O0e.LIZLLL().LIZ;
        if (c58590Mz4.LIZ == null) {
            c58590Mz4.LIZ = new ArrayList<>();
        }
        c58590Mz4.LIZ.add(str);
    }

    public final void LIZIZ(String str, String str2) {
        ((C38281F0r) this.LIZJ).LIZLLL(str, str2);
        C58590Mz4 c58590Mz4 = C61200O0e.LIZLLL().LIZ;
        if (c58590Mz4.LIZIZ == null) {
            c58590Mz4.LIZIZ = new ArrayList<>();
        }
        c58590Mz4.LIZIZ.add(str);
    }
}
