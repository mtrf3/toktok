package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.1Un, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33851Un implements InterfaceC16050k5 {
    public final Locale LIZ;

    @Override // X.InterfaceC16050k5
    public final String LIZ() {
        String languageTag = this.LIZ.toLanguageTag();
        o.LJIIIIZZ(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }

    public C33851Un(Locale locale) {
        this.LIZ = locale;
    }
}
