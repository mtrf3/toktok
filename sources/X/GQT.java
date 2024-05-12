package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GQT extends AbstractC65781Prl implements InterfaceC88472Yns<String, String> {
    public static final GQT LJLIL = new GQT();

    public GQT() {
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
