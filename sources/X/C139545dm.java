package X;

/* renamed from: X.5dm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139545dm {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void LIZ(InterfaceC139535dl interfaceC139535dl, OSZ osz, EnumC157656Gr enumC157656Gr, int i) {
        if ((i & 1) != 0) {
            osz = null;
        }
        if ((i & 2) != 0) {
            enumC157656Gr = null;
        }
        interfaceC139535dl.Mc(osz, enumC157656Gr);
    }

    public static /* synthetic */ void LIZIZ(InterfaceC139535dl interfaceC139535dl, boolean z, String str, int i, EnumC159956Pn enumC159956Pn, Integer num, Integer num2, Integer num3, int i2) {
        Integer num4 = num;
        EnumC159956Pn enumC159956Pn2 = enumC159956Pn;
        Integer num5 = num2;
        if ((i2 & 8) != 0) {
            enumC159956Pn2 = EnumC159956Pn.BOTTOM;
        }
        Integer num6 = null;
        if ((i2 & 16) != 0) {
            num4 = null;
        }
        if ((i2 & 32) != 0) {
            num5 = null;
        }
        if ((i2 & 64) == 0) {
            num6 = num3;
        }
        interfaceC139535dl.Fp(z, str, i, enumC159956Pn2, num4, num5, num6);
    }
}
