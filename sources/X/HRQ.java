package X;

import android.content.ComponentCallbacks2;

/* loaded from: classes8.dex */
public final class HRQ {
    public static final InterfaceC44086HRy LIZ(WM7 wm7) {
        if (wm7 == null) {
            return null;
        }
        InterfaceC36571c5 LJIJ = C86793Y4n.LJIJ(wm7);
        if (LJIJ instanceof InterfaceC44086HRy) {
            return (InterfaceC44086HRy) LJIJ;
        }
        ComponentCallbacks2 componentCallbacks2 = wm7.mActivity;
        if (!(componentCallbacks2 instanceof InterfaceC44086HRy)) {
            return null;
        }
        return (InterfaceC44086HRy) componentCallbacks2;
    }
}
