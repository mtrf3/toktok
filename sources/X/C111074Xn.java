package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4Xn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C111074Xn implements InterfaceC48038ItG {
    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        boolean z;
        if (((Integer) obj).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static void LIZIZ(Number number, InterfaceC07790Sh interfaceC07790Sh, String str, InterfaceC24520xk interfaceC24520xk, int i) {
        number.intValue();
        o.LJIIIZ(interfaceC07790Sh, str);
        interfaceC24520xk.LJJIIJ(i);
    }

    public static C1HQ LIZ(C85323Wm c85323Wm, String str, String str2, String str3, String str4, String str5) {
        o.LJIIIZ(c85323Wm, str);
        C1HQ c1hq = new C1HQ();
        c1hq.put(str2, str3);
        c1hq.put(str4, str5);
        return c1hq;
    }
}
