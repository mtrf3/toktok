package X;

import androidx.mediarouter.app.MediaRouteActionProvider;
import java.lang.ref.WeakReference;

/* renamed from: X.Zgc, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90570Zgc extends AbstractC90102ZXu {
    public final WeakReference<MediaRouteActionProvider> LIZ;

    public C90570Zgc(MediaRouteActionProvider mediaRouteActionProvider) {
        this.LIZ = new WeakReference<>(mediaRouteActionProvider);
    }

    @Override // X.AbstractC90102ZXu
    public final void LIZ(ZY5 zy5) {
        LJIILIIL(zy5);
    }

    @Override // X.AbstractC90102ZXu
    public final void LIZIZ(ZY5 zy5) {
        LJIILIIL(zy5);
    }

    @Override // X.AbstractC90102ZXu
    public final void LIZJ(ZY5 zy5) {
        LJIILIIL(zy5);
    }

    public final void LJIILIIL(ZY5 zy5) {
        MediaRouteActionProvider mediaRouteActionProvider = this.LIZ.get();
        if (mediaRouteActionProvider != null) {
            InterfaceC16130kD interfaceC16130kD = mediaRouteActionProvider.LIZIZ;
            if (interfaceC16130kD != null) {
                mediaRouteActionProvider.LIZIZ();
                C281318n c281318n = ((C281518p) interfaceC16130kD).LIZ.LJIILIIL;
                c281318n.LJII = true;
                c281318n.LJIILL(true);
                return;
            }
            return;
        }
        zy5.LJI(this);
    }

    @Override // X.AbstractC90102ZXu
    public final void LIZLLL(ZY5 zy5, ZY4 zy4) {
        LJIILIIL(zy5);
    }

    @Override // X.AbstractC90102ZXu
    public final void LJ(ZY5 zy5, ZY4 zy4) {
        LJIILIIL(zy5);
    }

    @Override // X.AbstractC90102ZXu
    public final void LJI(ZY5 zy5, ZY4 zy4) {
        LJIILIIL(zy5);
    }
}
