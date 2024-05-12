package X;

import kotlin.jvm.internal.AqS74S1100000_7;

/* renamed from: X.HNh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43965HNh implements I0Z {
    public final /* synthetic */ C82634Wbu LIZ;

    @Override // X.I0Z
    public final void LIZ(boolean z) {
    }

    public C43965HNh(C82634Wbu c82634Wbu) {
        this.LIZ = c82634Wbu;
    }

    @Override // X.I0Z
    public final void LIZIZ(boolean z, String str, int i, Exception exc) {
        String LJII;
        int i2 = !z ? 1 : 0;
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("error_code", String.valueOf(i));
        if (exc == null) {
            LJII = "";
        } else {
            LJII = J7I.LJII(exc);
        }
        c6bk.LIZ.put("exception", LJII);
        C43882HKc.LIZLLL(i2, "download_aec_model", c6bk.LJ(), true);
        if (z) {
            C6QQ.LIZ(new AqS74S1100000_7(this.LIZ, str, 3));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordBGMComponent AEC download result: ");
        LIZ.append(z);
        H7B.LIZ(X1D.LIZIZ(LIZ));
    }
}
