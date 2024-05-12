package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1zO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51021zO extends AbstractC65781Prl implements InterfaceC88473Ynt<List<? extends InterfaceC274115t>, Integer, Integer, Integer> {
    public static final C51021zO LJLIL = new C51021zO();

    public C51021zO() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final Integer invoke(List<? extends InterfaceC274115t> list, Integer num, Integer num2) {
        List<? extends InterfaceC274115t> measurables = list;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        o.LJIIIZ(measurables, "measurables");
        C50661yo c50661yo = C50661yo.LJLIL;
        C50671yp c50671yp = C50671yp.LJLIL;
        EnumC09360Yi enumC09360Yi = EnumC09360Yi.Horizontal;
        return Integer.valueOf(C38901fq.LIZ(measurables, c50661yo, c50671yp, intValue, intValue2, enumC09360Yi, enumC09360Yi));
    }
}
