package X;

import com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;

/* renamed from: X.Nai, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59628Nai implements F0F<AbsActivityContainer> {
    public final /* synthetic */ C59613NaT LIZ;

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

    public C59628Nai(C59613NaT c59613NaT) {
        this.LIZ = c59613NaT;
    }
}
