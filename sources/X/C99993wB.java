package X;

import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS44S0110000_1;
import kotlin.jvm.internal.AqS52S0201000_1;
import kotlin.jvm.internal.AqS91S0101000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3wB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99993wB implements InterfaceC99673vf {
    public static final C99993wB LJLIL = new C99993wB();
    public static final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C76372zB.LJLIL);
    public static final C62822Ol8 LJLJI = C221108m2.LIZIZ(C100003wC.LJLIL);

    public static void LIZ(InterfaceC88472Yns interfaceC88472Yns) {
        XKX.LIZLLL((InterfaceC70422pa) LJLILLLLZI.getValue(), null, null, new C76362zA(interfaceC88472Yns, null), 3);
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void T1(C109544Rq c109544Rq) {
        LIZ(new AqS167S0100000_1(c109544Rq, 423));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void y(C109544Rq c109544Rq) {
        LIZ(new AqS167S0100000_1(c109544Rq, 422));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void M1(List<C109544Rq> list, boolean z) {
        LIZ(new AqS44S0110000_1((List) list, (List<C109544Rq>) z, true));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void ea(C109544Rq c109544Rq, boolean z) {
        LIZ(new AqS44S0110000_1(c109544Rq, z, 6));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void u7(int i, C109544Rq c109544Rq) {
        LIZ(new AqS91S0101000_1(i, c109544Rq, 8));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void v0(List<C109544Rq> list, boolean z) {
        LIZ(new AqS44S0110000_1((List) list, (List<C109544Rq>) z, true));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void y5(int i, C63219OrX c63219OrX) {
        LIZ(new AqS91S0101000_1(i, c63219OrX, 9));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void K7(int i, String str, List list) {
        LIZ(new C99753vn(list, i, str));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void X8(java.util.Map map, int i, List list) {
        Integer num;
        LIZ(new AqS52S0201000_1(map, i, list, 4));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUpdateMessage with ");
        Integer num2 = null;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(" && ");
        if (map != null) {
            num2 = Integer.valueOf(map.size());
        }
        LIZ.append(num2);
        C63322OtC.LIZIZ("GlobalMsgObserver", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void m4(int i, C109544Rq c109544Rq, C63540Owi c63540Owi) {
        LIZ(new AqS52S0201000_1(i, c109544Rq, c63540Owi, 3));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void x6(List<C109544Rq> list, int i, C107074Id extra) {
        o.LJIIIZ(extra, "extra");
        LIZ(new AqS52S0201000_1((List) list, (List<C109544Rq>) i, (int) extra, (C107074Id) 2));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void v6(C109544Rq c109544Rq, java.util.Map<String, List<C32H>> map, java.util.Map<String, List<C32H>> map2, Long l, Long l2) {
        LIZ(new C783035m(c109544Rq, map, map2, l, l2));
    }
}
