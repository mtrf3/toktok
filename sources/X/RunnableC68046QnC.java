package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.QnC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68046QnC implements Runnable {
    public final /* synthetic */ AtomicReference LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C68082Qnm LJLJJI;

    public RunnableC68046QnC(C68082Qnm c68082Qnm, AtomicReference atomicReference, String str, String str2) {
        this.LJLJJI = c68082Qnm;
        this.LJLIL = atomicReference;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C68022Qmo LJIJJ = this.LJLJJI.LIZ.LJIJJ();
            AtomicReference atomicReference = this.LJLIL;
            String str = this.LJLILLLLZI;
            String str2 = this.LJLJI;
            LJIJJ.LJFF();
            LJIJJ.LJI();
            LJIJJ.LJIIZILJ(new RunnableC68042Qn8(LJIJJ, atomicReference, str, str2, LJIJJ.LJIILJJIL(false)));
        } finally {
            if (LIZ) {
            }
        }
    }
}
