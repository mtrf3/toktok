package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GMx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41407GMx extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C41407GMx LJLIL = new C41407GMx();

    public C41407GMx() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String str) {
        String path = str;
        o.LJIIIZ(path, "path");
        return Boolean.valueOf(!ujb.o.LJJJJJL(path));
    }
}
