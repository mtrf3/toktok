package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1z6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50841z6 extends AbstractC65781Prl implements InterfaceC88475Ynv<Integer, int[], EnumC23500w6, InterfaceC23370vt, int[], C76800UCe> {
    public static final C50841z6 LJLIL = new C50841z6();

    public C50841z6() {
        super(5);
    }

    @Override // X.InterfaceC88475Ynv
    public final C76800UCe invoke(Integer num, int[] iArr, EnumC23500w6 enumC23500w6, InterfaceC23370vt interfaceC23370vt, int[] iArr2) {
        int intValue = num.intValue();
        int[] size = iArr;
        InterfaceC23370vt density = interfaceC23370vt;
        int[] outPosition = iArr2;
        o.LJIIIZ(size, "size");
        o.LJIIIZ(enumC23500w6, "<anonymous parameter 2>");
        o.LJIIIZ(density, "density");
        o.LJIIIZ(outPosition, "outPosition");
        C0YW.LIZJ.LIZJ(density, intValue, size, outPosition);
        return C76800UCe.LIZ;
    }
}
