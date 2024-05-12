package X;

import android.view.View;
import kotlin.jvm.internal.AqS11S2200000_6;

/* renamed from: X.NfD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59907NfD implements VN1 {
    public Long LIZ;
    public final /* synthetic */ C59904NfA LIZIZ;

    public C59907NfD(C59904NfA c59904NfA) {
        this.LIZIZ = c59904NfA;
    }

    @Override // X.VN1
    public final void LIZ(long j) {
        this.LIZ = Long.valueOf(j);
    }

    @Override // X.VN1
    public final void LIZIZ(int i, View view) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        C59904NfA c59904NfA = this.LIZIZ;
        String str = c59904NfA.LJLJI;
        String str2 = c59904NfA.LJLJJI;
        C76542zS.LIZJ("rd_tiktokec_pay_redirect_blank", new AqS11S2200000_6(str, this.LIZ, Boolean.valueOf(z), str2, 0));
    }
}
