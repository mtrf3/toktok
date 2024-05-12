package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JCb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48769JCb extends AbstractC65781Prl implements InterfaceC88472Yns<INT, Boolean> {
    public static final C48769JCb LJLIL = new C48769JCb();

    public C48769JCb() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(INT r3) {
        INT it = r3;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(!o.LJ(it.LIZ, "force_skip_list"));
    }
}
