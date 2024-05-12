package X;

/* renamed from: X.QPr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66959QPr extends AbstractC67056QTk {
    public final /* synthetic */ String LIZ;

    public C66959QPr(String str) {
        this.LIZ = str;
    }

    @Override // X.AbstractC67055QTj
    public final /* bridge */ /* synthetic */ void onSuccess(QQI qqi) {
    }

    @Override // X.AbstractC67055QTj
    public final void onError(QQI qqi, int i) {
        String str;
        QQK qqk = (QQK) qqi;
        if (qqk != null) {
            if ("session_expired".equalsIgnoreCase(qqk.LJIIIZ)) {
                String str2 = this.LIZ;
                if (C66952QPk.LIZ) {
                    C66953QPl.LJZL.LJ(str2, null, true);
                    return;
                }
                return;
            }
            str = qqk.LJFF;
        } else {
            str = "";
        }
        C38901fq.LJIIIIZZ(i, str);
    }
}
