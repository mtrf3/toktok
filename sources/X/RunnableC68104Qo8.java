package X;

import android.os.RemoteException;

/* renamed from: X.Qo8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68104Qo8 implements Runnable {
    public final /* synthetic */ Object LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    public final void LIZ() {
        C68022Qmo c68022Qmo = (C68022Qmo) this.LJLILLLLZI;
        InterfaceC68041Qn7 interfaceC68041Qn7 = c68022Qmo.LIZLLL;
        if (interfaceC68041Qn7 == null) {
            c68022Qmo.LIZ.LIZJ().LJFF.LIZ("Failed to send current screen to service");
            return;
        }
        try {
            C68132Qoa c68132Qoa = (C68132Qoa) this.LJLIL;
            if (c68132Qoa == null) {
                interfaceC68041Qn7.A(0L, null, null, c68022Qmo.LIZ.LIZ.getPackageName());
            } else {
                interfaceC68041Qn7.A(c68132Qoa.LIZJ, c68132Qoa.LIZ, c68132Qoa.LIZIZ, c68022Qmo.LIZ.LIZ.getPackageName());
            }
            ((C68022Qmo) this.LJLILLLLZI).LJIILLIIL();
        } catch (RemoteException e) {
            ((C68048QnE) this.LJLILLLLZI).LIZ.LIZJ().LJFF.LIZIZ(e, "Failed to send current screen to the service");
        }
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

    public /* synthetic */ RunnableC68104Qo8(C68022Qmo c68022Qmo, Object obj) {
        this.LJLILLLLZI = c68022Qmo;
        this.LJLIL = obj;
    }
}
