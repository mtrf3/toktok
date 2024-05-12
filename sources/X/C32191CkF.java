package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CkF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32191CkF implements InterfaceC32199CkN {
    public final /* synthetic */ C32186CkA LIZ;

    public C32191CkF(C32186CkA c32186CkA) {
        this.LIZ = c32186CkA;
    }

    @Override // X.InterfaceC32199CkN
    public final void LIZ(List messageTypeList, C76308TxA imListener) {
        o.LJIIIZ(messageTypeList, "messageTypeList");
        o.LJIIIZ(imListener, "imListener");
        InterfaceC32193CkH interfaceC32193CkH = this.LIZ.LJIILJJIL;
        if (interfaceC32193CkH != null) {
            interfaceC32193CkH.LIZ(messageTypeList, imListener);
        }
    }

    @Override // X.InterfaceC32199CkN
    public final void LIZIZ(List messageTypeList, C76308TxA imListener) {
        o.LJIIIZ(messageTypeList, "messageTypeList");
        o.LJIIIZ(imListener, "imListener");
        InterfaceC32193CkH interfaceC32193CkH = this.LIZ.LJIILJJIL;
        if (interfaceC32193CkH != null) {
            interfaceC32193CkH.LIZIZ(messageTypeList, imListener);
        }
    }
}
