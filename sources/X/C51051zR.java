package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1zR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51051zR extends AbstractC65781Prl implements InterfaceC88473Ynt<List<? extends InterfaceC274115t>, Integer, Integer, Integer> {
    public static final C51051zR LJLIL = new C51051zR();

    public C51051zR() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final Integer invoke(List<? extends InterfaceC274115t> list, Integer num, Integer num2) {
        List<? extends InterfaceC274115t> measurables = list;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        o.LJIIIZ(measurables, "measurables");
        C50771yz c50771yz = C50771yz.LJLIL;
        C50811z3 c50811z3 = C50811z3.LJLIL;
        EnumC09360Yi enumC09360Yi = EnumC09360Yi.Vertical;
        return Integer.valueOf(C38901fq.LIZ(measurables, c50771yz, c50811z3, intValue, intValue2, enumC09360Yi, enumC09360Yi));
    }
}
