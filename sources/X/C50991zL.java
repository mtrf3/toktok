package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1zL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50991zL extends AbstractC65781Prl implements InterfaceC88473Ynt<List<? extends InterfaceC274115t>, Integer, Integer, Integer> {
    public static final C50991zL LJLIL = new C50991zL();

    public C50991zL() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final Integer invoke(List<? extends InterfaceC274115t> list, Integer num, Integer num2) {
        List<? extends InterfaceC274115t> measurables = list;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        o.LJIIIZ(measurables, "measurables");
        return Integer.valueOf(C38901fq.LIZ(measurables, C50971zJ.LJLIL, C50981zK.LJLIL, intValue, intValue2, EnumC09360Yi.Horizontal, EnumC09360Yi.Vertical));
    }
}
