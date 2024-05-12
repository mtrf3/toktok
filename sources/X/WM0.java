package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WM0 implements InterfaceC81994WFy {
    public final /* synthetic */ ViewOnTouchListenerC82148WLw LIZ;

    public WM0(ViewOnTouchListenerC82148WLw viewOnTouchListenerC82148WLw) {
        this.LIZ = viewOnTouchListenerC82148WLw;
    }

    @Override // X.InterfaceC81994WFy
    public final void LIZ(float f) {
        int i = (int) (f * r2.LJZ);
        WG4 wg4 = this.LIZ.LJLJJLL;
        if (wg4 != null) {
            wg4.setTimeBubble(i);
        } else {
            o.LJIJI("cutMusicLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC81994WFy
    public final void LIZIZ(float f) {
        ViewOnTouchListenerC82148WLw viewOnTouchListenerC82148WLw = this.LIZ;
        viewOnTouchListenerC82148WLw.LJLLL = (int) (f * viewOnTouchListenerC82148WLw.LJZ);
        C82150WLy c82150WLy = viewOnTouchListenerC82148WLw.LLFFF;
        if (c82150WLy != null) {
            c82150WLy.LIZ();
        }
    }
}
