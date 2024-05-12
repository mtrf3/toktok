package X;

import com.ss.android.ugc.aweme.shortvideo.SafeHandler;

/* renamed from: X.Ws4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83636Ws4 implements X03 {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ C29901Fi LIZIZ;
    public final /* synthetic */ C83621Wrp LIZJ;

    @Override // X.X03
    public final void onError() {
    }

    @Override // X.X03
    public final void LIZ(String str) {
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CameraLogicComponent detectLuma onInfo: msg = ");
        LIZ.append(str);
        LIZLLL.d(X1D.LIZIZ(LIZ));
    }

    public C83636Ws4(C83621Wrp c83621Wrp, boolean z, C29901Fi c29901Fi) {
        this.LIZJ = c83621Wrp;
        this.LIZ = z;
        this.LIZIZ = c29901Fi;
    }

    @Override // X.X03
    public final void onSuccess(int i, final float f, int i2) {
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CameraLogicComponent detectLuma onSuccess: result = ");
        LIZ.append(f);
        LIZ.append(" flag = ");
        LIZ.append(i);
        LIZLLL.d(X1D.LIZIZ(LIZ));
        if (i != 27) {
            return;
        }
        SafeHandler safeHandler = this.LIZJ.LLJ;
        final boolean z = this.LIZ;
        final C29901Fi c29901Fi = this.LIZIZ;
        safeHandler.post(new Runnable() { // from class: X.Wsd
            @Override // java.lang.Runnable
            public final void run() {
                C83636Ws4 c83636Ws4 = C83636Ws4.this;
                float f2 = f;
                boolean z2 = z;
                C29901Fi c29901Fi2 = c29901Fi;
                if (f2 == 0.0f) {
                    c83636Ws4.LIZJ.G0();
                } else {
                    c83636Ws4.getClass();
                }
                if (z2) {
                    c29901Fi2.LJII(new IA8("normal"));
                }
            }
        });
    }
}
