package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gvr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43103Gvr extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C43103Gvr LJLIL = new C43103Gvr();

    public C43103Gvr() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String str) {
        String path = str;
        o.LJIIIZ(path, "path");
        return Boolean.valueOf(!ujb.o.LJJJJJL(path));
    }
}
