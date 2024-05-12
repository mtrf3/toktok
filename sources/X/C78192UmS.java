package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.AqS102S0300000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UmS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78192UmS extends AbstractC78237UnB {
    public final C32449CoP LIZJ;
    public boolean LIZLLL;
    public InterfaceC32440CoG LJ;
    public C78184UmK LJFF;

    @Override // X.InterfaceC32440CoG
    public final void stop() {
        C32257ClJ.LJIIIIZZ(new AqS163S0100000_13(this, 554));
    }

    public C78192UmS(C32449CoP request) {
        o.LJIIIZ(request, "request");
        this.LIZJ = request;
    }

    @Override // X.InterfaceC32440CoG
    public final void LIZIZ(InterfaceC78213Umn renderView, C32448CoO c32448CoO) {
        o.LJIIIZ(renderView, "renderView");
        C32257ClJ.LJIIIIZZ(new AqS102S0300000_13(this, renderView, c32448CoO, 27));
    }

    public static void LIZJ(InterfaceC78213Umn interfaceC78213Umn, C32449CoP c32449CoP, AbstractC78171Um7 listener) {
        InterfaceC32440CoG create;
        InterfaceC78190UmQ interfaceC78190UmQ = (InterfaceC78190UmQ) C32260ClM.LIZ(InterfaceC78190UmQ.class);
        if (interfaceC78190UmQ == null || (create = interfaceC78190UmQ.create(c32449CoP)) == null) {
            listener.LJFF(EnumC78220Umu.ALPHA_PLAYER, new C78163Ulz(-20, (String) null, 6));
            return;
        }
        C32439CoF c32439CoF = new C32439CoF();
        o.LJIIIZ(listener, "listener");
        c32439CoF.LIZ = listener;
        c32439CoF.LIZIZ = listener;
        create.LIZIZ(interfaceC78213Umn, new C32448CoO(c32439CoF));
    }

    public final void LIZLLL(InterfaceC78213Umn interfaceC78213Umn, List<C32449CoP> list, InterfaceC78206Umg interfaceC78206Umg) {
        int size = list.size();
        C76732zl c76732zl = new C76732zl();
        LIZJ(interfaceC78213Umn, (C32449CoP) ListProtector.get(list, c76732zl.element), new C78193UmT(c76732zl, size, interfaceC78206Umg, this, interfaceC78213Umn, list));
    }
}
