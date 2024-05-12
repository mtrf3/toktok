package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GQc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41490GQc extends AbstractC65781Prl implements InterfaceC88472Yns<String, String> {
    public static final C41490GQc LJLIL = new C41490GQc();

    public C41490GQc() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(String str) {
        String it = str;
        o.LJIIIZ(it, "it");
        String substring = it.substring(1);
        o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }
}
