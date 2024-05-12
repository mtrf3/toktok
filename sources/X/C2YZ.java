package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2YZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2YZ extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C2YZ LJLIL = new C2YZ();

    public C2YZ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String str) {
        String path = str;
        o.LJIIIZ(path, "path");
        return Boolean.valueOf(!ujb.o.LJJJJJL(path));
    }
}
