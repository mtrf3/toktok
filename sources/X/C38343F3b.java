package X;

import kotlin.jvm.internal.o;

/* renamed from: X.F3b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38343F3b extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C38343F3b LJLIL = new C38343F3b();

    public C38343F3b() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String str) {
        return Boolean.valueOf(!o.LJ(str, "cid"));
    }
}
