package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1zM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51001zM extends AbstractC65781Prl implements InterfaceC88473Ynt<List<? extends InterfaceC274115t>, Integer, Integer, Integer> {
    public static final C51001zM LJLIL = new C51001zM();

    public C51001zM() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final Integer invoke(List<? extends InterfaceC274115t> list, Integer num, Integer num2) {
        List<? extends InterfaceC274115t> measurables = list;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        o.LJIIIZ(measurables, "measurables");
        C51081zU c51081zU = C51081zU.LJLIL;
        C51101zW c51101zW = C51101zW.LJLIL;
        EnumC09360Yi enumC09360Yi = EnumC09360Yi.Horizontal;
        return Integer.valueOf(C38901fq.LIZ(measurables, c51081zU, c51101zW, intValue, intValue2, enumC09360Yi, enumC09360Yi));
    }
}
