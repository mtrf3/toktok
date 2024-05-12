package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.QnD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68047QnD implements Runnable {
    public final /* synthetic */ AtomicReference LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C68082Qnm LJLJJL;

    public RunnableC68047QnD(C68082Qnm c68082Qnm, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.LJLJJL = c68082Qnm;
        this.LJLIL = atomicReference;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C68022Qmo LJIJJ = this.LJLJJL.LIZ.LJIJJ();
            AtomicReference atomicReference = this.LJLIL;
            String str = this.LJLILLLLZI;
            String str2 = this.LJLJI;
            boolean z = this.LJLJJI;
            LJIJJ.LJFF();
            LJIJJ.LJI();
            LJIJJ.LJIIZILJ(new RunnableC68043Qn9(LJIJJ, atomicReference, str, str2, LJIJJ.LJIILJJIL(false), z));
        } finally {
            if (LIZ) {
            }
        }
    }
}
