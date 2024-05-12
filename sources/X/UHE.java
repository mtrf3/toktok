package X;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UHE implements InterfaceC75158Tec {
    @Override // X.InterfaceC75158Tec
    public final void LJ() {
    }

    @Override // X.InterfaceC75158Tec
    public final void LJFF(Animatable animatable) {
        o.LJIIIZ(animatable, "animatable");
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        C0NB.LJ("GameShortVideoAdDetailFragment", "imageLoad onLoadFailed");
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        C0NB.LIZIZ("GameShortVideoAdDetailFragment", "imageLoad onLoadSuccess");
    }
}
