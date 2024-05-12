package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.DvS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35434DvS extends AbstractC65781Prl implements InterfaceC88472Yns<String, String> {
    public static final C35434DvS LJLIL = new C35434DvS();

    public C35434DvS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(String str) {
        String item = str;
        o.LJIIJ(item, "item");
        Locale locale = Locale.ROOT;
        o.LJFF(locale, "Locale.ROOT");
        String lowerCase = item.toLowerCase(locale);
        o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
