package X;

import android.content.Context;
import android.media.MediaRouter;

/* renamed from: X.ZnG, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90982ZnG extends C90915ZmB {
    @Override // X.C90868ZlQ
    public final Object LJIJJLI() {
        return ((MediaRouter) this.LJLL).getDefaultRoute();
    }

    @Override // X.C90868ZlQ
    public final void LJJIIJZLJL() {
        if (this.LJLLLLLL) {
            ((MediaRouter) this.LJLL).removeCallback((MediaRouter.Callback) this.LJLLI);
        }
        this.LJLLLLLL = true;
        Object obj = this.LJLL;
        MediaRouter mediaRouter = (MediaRouter) obj;
        mediaRouter.addCallback(this.LJLLL, (MediaRouter.Callback) this.LJLLI, (this.LJLLLL ? 1 : 0) | 2);
    }

    @Override // X.C90868ZlQ
    public final void LJJIIJ(Object obj) {
        ((MediaRouter) this.LJLL).selectRoute(8388611, (MediaRouter.RouteInfo) obj);
    }

    @Override // X.C90868ZlQ
    public final void LJJIIZI(ZYG zyg) {
        super.LJJIIZI(zyg);
        ((MediaRouter.UserRouteInfo) zyg.LIZIZ).setDescription(zyg.LIZ.LJ);
    }

    @Override // X.C90915ZmB
    public final boolean LJJIJ(ZYF zyf) {
        return ((MediaRouter.RouteInfo) zyf.LIZ).isConnecting();
    }

    public C90982ZnG(Context context, ZYH zyh) {
        super(context, zyh);
    }

    @Override // X.C90915ZmB, X.C90868ZlQ
    public void LJJ(ZYF zyf, C90088ZXg c90088ZXg) {
        super.LJJ(zyf, c90088ZXg);
        CharSequence description = ((MediaRouter.RouteInfo) zyf.LIZ).getDescription();
        if (description != null) {
            c90088ZXg.LIZ.putString("status", description.toString());
        }
    }
}
