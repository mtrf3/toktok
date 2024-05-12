package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.9aC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C239249aC extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C239249aC LJLIL = new C239249aC();

    public C239249aC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        String str = C64707PaR.LIZJ;
        o.LJIIIIZZ(str, "getUserRegion()");
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
