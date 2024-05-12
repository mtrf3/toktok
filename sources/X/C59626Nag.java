package X;

import com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;

/* renamed from: X.Nag, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59626Nag implements F0F<AbsActivityContainer> {
    public final /* synthetic */ C59612NaS LIZ;

    @Override // X.F0F
    public final void release() {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer, X.NZd] */
    @Override // X.F0F
    public final AbsActivityContainer LIZIZ() {
        ?? iCrossPlatformActivityContainer = this.LIZ.getICrossPlatformActivityContainer();
        if (iCrossPlatformActivityContainer == 0 || !(iCrossPlatformActivityContainer instanceof AbsActivityContainer)) {
            return null;
        }
        return iCrossPlatformActivityContainer;
    }

    public C59626Nag(C59612NaS c59612NaS) {
        this.LIZ = c59612NaS;
    }
}
