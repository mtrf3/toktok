package X;

import com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;

/* renamed from: X.NZb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59559NZb implements F0F<AbsActivityContainer> {
    public final /* synthetic */ NZQ LIZ;

    @Override // X.F0F
    public final void release() {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer, X.NZd] */
    @Override // X.F0F
    public final AbsActivityContainer LIZIZ() {
        ?? r2 = this.LIZ.LL;
        if (r2 == 0 || !(r2 instanceof AbsActivityContainer)) {
            return null;
        }
        return r2;
    }

    public C59559NZb(NZQ nzq) {
        this.LIZ = nzq;
    }
}
