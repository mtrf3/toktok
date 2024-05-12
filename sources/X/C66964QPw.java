package X;

/* renamed from: X.QPw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66964QPw extends AbstractC68941R3x {
    public final /* synthetic */ String LIZ;

    public C66964QPw(String str) {
        this.LIZ = str;
    }

    @Override // X.AbstractC67055QTj
    public final void onSuccess(R4V r4v) {
        QTX qtx = r4v.LJIIIZ;
        if (qtx != null && qtx.LIZ > 0) {
            C79146V4k.LJJJZ("syn_login_status_error", null);
        }
        C66955QPn.LIZ().LIZJ(this.LIZ, System.currentTimeMillis() + 86400000);
    }

    @Override // X.AbstractC67055QTj
    public final void onError(R4V r4v, int i) {
        C66955QPn.LIZ().LIZJ(this.LIZ, System.currentTimeMillis() + 86400000);
    }
}
