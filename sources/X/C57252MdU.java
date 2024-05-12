package X;

import java.util.ArrayList;

/* renamed from: X.MdU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57252MdU {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C57249MdR.LJLIL);

    public static void LIZ(InterfaceC57255MdX interfaceC57255MdX) {
        AbstractChoreographerFrameCallbackC57253MdV abstractChoreographerFrameCallbackC57253MdV;
        if (interfaceC57255MdX != null && (abstractChoreographerFrameCallbackC57253MdV = (AbstractChoreographerFrameCallbackC57253MdV) LIZ.getValue()) != null) {
            ((ArrayList) abstractChoreographerFrameCallbackC57253MdV.LJLILLLLZI).remove(interfaceC57255MdX);
            if (((ArrayList) abstractChoreographerFrameCallbackC57253MdV.LJLILLLLZI).isEmpty() && abstractChoreographerFrameCallbackC57253MdV.LJLJI) {
                C16880lQ.LLIIIJ().removeFrameCallback(abstractChoreographerFrameCallbackC57253MdV);
                abstractChoreographerFrameCallbackC57253MdV.LJLJI = false;
                abstractChoreographerFrameCallbackC57253MdV.LIZJ();
            }
        }
    }
}
