package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R1R extends AbstractC65781Prl implements InterfaceC88472Yns<R1S, CharSequence> {
    public static final R1R LJLIL = new R1R();

    public R1R() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(R1S r1s) {
        R1S column = r1s;
        o.LJIIIZ(column, "column");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(column.key);
        LIZ.append(' ');
        LIZ.append(column.type);
        return X1D.LIZIZ(LIZ);
    }
}
