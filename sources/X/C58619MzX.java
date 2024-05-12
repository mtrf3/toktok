package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MzX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58619MzX extends AbstractC65781Prl implements InterfaceC88472Yns<String, Long> {
    public static final C58619MzX LJLIL = new C58619MzX();

    public C58619MzX() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Long invoke(String str) {
        String it = str;
        o.LJIIIZ(it, "it");
        return Long.valueOf(R1W.LIZIZ().getLong(it, 0L));
    }
}
