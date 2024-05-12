package X;

import android.os.SystemClock;
import com.google.gson.m;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchShopFragment;

/* loaded from: classes9.dex */
public final class KFO implements InterfaceC66632QDc<m> {
    public final /* synthetic */ DynamicSearchShopFragment LIZ;
    public final /* synthetic */ C34K LIZIZ;
    public final /* synthetic */ C72242sW LIZJ;
    public final /* synthetic */ C68322mC<String> LIZLLL;
    public final /* synthetic */ java.util.Map<String, m> LJ;
    public final /* synthetic */ C76732zl LJFF;
    public final /* synthetic */ C34K LJI;
    public final /* synthetic */ KFN LJII;
    public final /* synthetic */ C72242sW LJIIIIZZ;

    @Override // X.InterfaceC66632QDc
    public final void onComplete() {
        this.LIZ.nm(2, null);
        DynamicSearchShopFragment dynamicSearchShopFragment = this.LIZ;
        C27739Aud.LJI(this.LJII);
        SystemClock.elapsedRealtime();
        dynamicSearchShopFragment.getClass();
    }

    @Override // X.InterfaceC66632QDc
    public final void onFailed(Throwable th) {
        this.LIZ.fm(null, th);
        this.LIZ.nm(3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x014a, code lost:
    
        if (r3 != null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC66632QDc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNext(com.google.gson.m r29) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KFO.onNext(java.lang.Object):void");
    }

    public KFO(DynamicSearchShopFragment dynamicSearchShopFragment, C34K c34k, C72242sW c72242sW, C68322mC<String> c68322mC, java.util.Map<String, m> map, C76732zl c76732zl, C34K c34k2, KFN kfn, C72242sW c72242sW2) {
        this.LIZ = dynamicSearchShopFragment;
        this.LIZIZ = c34k;
        this.LIZJ = c72242sW;
        this.LIZLLL = c68322mC;
        this.LJ = map;
        this.LJFF = c76732zl;
        this.LJI = c34k2;
        this.LJII = kfn;
        this.LJIIIIZZ = c72242sW2;
    }
}
