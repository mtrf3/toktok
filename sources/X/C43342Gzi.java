package X;

import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;

/* renamed from: X.Gzi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43342Gzi {
    public SynthetiseResult LIZ = new SynthetiseResult();
    public C41359GLb LIZIZ = new C41574GTi().LIZ();
    public String LIZJ = "";
    public Throwable LIZLLL;

    public final C42990Gu2 LIZ() {
        C42990Gu2 c42990Gu2;
        if (this.LIZLLL != null) {
            c42990Gu2 = new C42990Gu2(this.LIZLLL, this.LIZ);
        } else {
            c42990Gu2 = new C42990Gu2(this.LIZJ, this.LIZ);
        }
        c42990Gu2.setCancelCause(this.LIZIZ);
        return c42990Gu2;
    }
}
