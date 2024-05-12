package X;

import android.view.View;
import kotlin.jvm.internal.AqS11S2200000_6;

/* renamed from: X.NfC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59906NfC implements VN1 {
    public Long LIZ;
    public final /* synthetic */ C59905NfB LIZIZ;

    public C59906NfC(C59905NfB c59905NfB) {
        this.LIZIZ = c59905NfB;
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
        C59905NfB c59905NfB = this.LIZIZ;
        String str = c59905NfB.LJLJI;
        String str2 = c59905NfB.LJLJJI;
        C76542zS.LIZJ("rd_tiktokec_pay_redirect_blank", new AqS11S2200000_6(str, this.LIZ, Boolean.valueOf(z), str2, 0));
    }
}
