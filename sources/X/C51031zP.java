package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1zP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51031zP extends AbstractC65781Prl implements InterfaceC88473Ynt<List<? extends InterfaceC274115t>, Integer, Integer, Integer> {
    public static final C51031zP LJLIL = new C51031zP();

    public C51031zP() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final Integer invoke(List<? extends InterfaceC274115t> list, Integer num, Integer num2) {
        List<? extends InterfaceC274115t> measurables = list;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        o.LJIIIZ(measurables, "measurables");
        C50701ys c50701ys = C50701ys.LJLIL;
        C50731yv c50731yv = C50731yv.LJLIL;
        EnumC09360Yi enumC09360Yi = EnumC09360Yi.Vertical;
        return Integer.valueOf(C38901fq.LIZ(measurables, c50701ys, c50731yv, intValue, intValue2, enumC09360Yi, enumC09360Yi));
    }
}
