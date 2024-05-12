package X;

import android.view.View;

/* renamed from: X.JHh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48905JHh {
    public static View LIZ(InterfaceC49148JQq interfaceC49148JQq) {
        if (interfaceC49148JQq instanceof InterfaceC48907JHj) {
            return ((InterfaceC48907JHj) interfaceC49148JQq).LJJIJIL();
        }
        return null;
    }

    public static void LIZIZ(InterfaceC49148JQq interfaceC49148JQq) {
        if (interfaceC49148JQq instanceof InterfaceC48907JHj) {
            ((InterfaceC48907JHj) interfaceC49148JQq).LLLLLJLJLL();
        } else if (interfaceC49148JQq instanceof InterfaceC48908JHk) {
            ((InterfaceC48908JHk) interfaceC49148JQq).LLLLLJLJLL();
        }
    }

    public static void LIZJ(InterfaceC49148JQq interfaceC49148JQq, long j) {
        if (interfaceC49148JQq instanceof InterfaceC48907JHj) {
            ((InterfaceC48907JHj) interfaceC49148JQq).LLLJIL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("play normal card ");
            LIZ.append(interfaceC49148JQq);
            C49133JQb.LIZ("ResultAutoPlay", X1D.LIZIZ(LIZ));
            return;
        }
        if (interfaceC49148JQq instanceof InterfaceC48908JHk) {
            ((InterfaceC48908JHk) interfaceC49148JQq).LLLLII(j);
        }
    }
}
