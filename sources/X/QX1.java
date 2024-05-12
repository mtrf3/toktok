package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QX1 extends AbstractC65781Prl implements InterfaceC88472Yns<String, Long> {
    public static final QX1 LJLIL = new QX1();

    public QX1() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Long invoke(String str) {
        String it = str;
        o.LJIIIZ(it, "it");
        return Long.valueOf(R1V.LIZIZ().getLong(it, 0L));
    }
}
