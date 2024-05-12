package X;

import java.util.List;
import v5.n;

/* renamed from: X.5jD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC142915jD implements Runnable {
    public final /* synthetic */ C147295qH LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ Runnable LJLJJI;
    public final /* synthetic */ n<C76800UCe> LJLJJL;
    public final /* synthetic */ Runnable LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ Runnable LJLJLLL;

    public RunnableC142915jD(C147295qH c147295qH, C68322mC<String> c68322mC, C76732zl c76732zl, Runnable runnable, n<C76800UCe> nVar, Runnable runnable2, boolean z, boolean z2, Runnable runnable3) {
        this.LJLIL = c147295qH;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = c76732zl;
        this.LJLJJI = runnable;
        this.LJLJJL = nVar;
        this.LJLJJLL = runnable2;
        this.LJLJL = z;
        this.LJLJLJ = z2;
        this.LJLJLLL = runnable3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d3, code lost:
    
        if (r0.canvasVideoData == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC142915jD.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void LIZIZ(C147295qH c147295qH, n<C76800UCe> nVar, List<String> list) {
        InterfaceC153045zY LLLIZZ = c147295qH.LLLIZZ();
        if (LLLIZZ != null && C78983UzD.LJJJJIZL(LLLIZZ)) {
            InterfaceC153045zY LLLIZZ2 = c147295qH.LLLIZZ();
            if (LLLIZZ2 != null && list != null) {
                for (String str : list) {
                    C122034qd LJJI = C17N.LJJI(LLLIZZ2);
                    if (LJJI != null) {
                        LJJI.LJIIIIZZ().LJIL(str);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                return;
            }
            return;
        }
        nVar.LIZJ(null);
    }
}
