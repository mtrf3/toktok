package X;

import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* renamed from: X.Wf5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82831Wf5 implements InterfaceC84907XTz {
    public final /* synthetic */ InterfaceC82842WfG LIZ;
    public final /* synthetic */ C82823Wex LIZIZ;

    @Override // X.InterfaceC84907XTz
    public final void LIZ(Exception exc) {
        this.LIZ.LIZJ();
    }

    @Override // X.InterfaceC84907XTz
    public final void LIZIZ(AVMusic aVMusic) {
        if (aVMusic == null) {
            this.LIZ.LIZJ();
        } else if ((!AVCommerceServiceImpl.LJIIJ().LIZ() || aVMusic.isCommerceMusic()) && C44172HVg.LJI.LJIJJ(aVMusic, this.LIZIZ.LJIIIZ)) {
            this.LIZ.LIZ(aVMusic);
        } else {
            this.LIZ.LJ();
        }
    }

    public C82831Wf5(C82824Wey c82824Wey, C82823Wex c82823Wex) {
        this.LIZ = c82824Wey;
        this.LIZIZ = c82823Wex;
    }
}
