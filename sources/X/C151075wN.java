package X;

import android.app.Activity;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* renamed from: X.5wN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151075wN implements InterfaceC151265wg {
    public final /* synthetic */ C151055wL LIZ;

    public C151075wN(C151055wL c151055wL) {
        this.LIZ = c151055wL;
    }

    @Override // X.InterfaceC151265wg
    public final void LIZ(C151225wc c151225wc) {
        C151325wm c151325wm;
        SurfaceHolder holder;
        C66Y LLJJJJ;
        C1548265u c1548265u;
        C153065za c153065za;
        Activity activity = this.LIZ.mActivity;
        if (activity != null && !activity.isFinishing()) {
            C151055wL c151055wL = this.LIZ;
            c151055wL.LJLLL = c151225wc;
            C1548165t c1548165t = (C1548165t) c151055wL.findSceneByTag("EditInfoStickerScene");
            if (c1548165t != null && (LLJJJJ = c1548165t.LLJJJJ()) != null && (c1548265u = LLJJJJ.LJLJI) != null && (c153065za = c1548265u.LJLJLJ) != null) {
                c153065za.LJFF.LJLILLLLZI = this.LIZ.LL;
            }
            if (this.LIZ.getSceneContext() != null) {
                C151055wL c151055wL2 = this.LIZ;
                C151225wc c151225wc2 = c151055wL2.LJLLL;
                if (c151225wc2 != null && (c151325wm = c151225wc2.LIZ) != null) {
                    SurfaceView LLJJIII = c151055wL2.LLJJIII();
                    C151055wL c151055wL3 = this.LIZ;
                    c151325wm.LIZ = LLJJIII;
                    c151325wm.getClass();
                    c151325wm.LIZIZ = new SurfaceHolderCallbackC151355wp(c151325wm, c151055wL3, null);
                    SurfaceView surfaceView = c151325wm.LIZ;
                    if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
                        holder.addCallback(c151325wm.LIZIZ);
                    }
                }
                this.LIZ.LLJJIII().setVisibility(0);
            }
        }
    }
}
