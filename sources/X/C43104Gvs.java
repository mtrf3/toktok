package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gvs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43104Gvs extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C43104Gvs LJLIL = new C43104Gvs();

    public C43104Gvs() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String str) {
        String path = str;
        o.LJIIIZ(path, "path");
        return Boolean.valueOf(!ujb.o.LJJJJJL(path));
    }
}
