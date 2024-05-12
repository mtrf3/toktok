package ms.bd.o;

import java.util.Locale;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class x0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        String str2;
        try {
            Locale locale = a.LIZIZ.LIZ.getResources().getConfiguration().locale;
            String language = locale.getLanguage();
            String country = locale.getCountry();
            StringBuilder sb = new StringBuilder();
            sb.append(language);
            sb.append((String) k.a(16777217, 0, 0L, "f73a5a", new byte[]{72}));
            sb.append(country);
            str2 = sb.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        return w2.LIZ(str2);
    }
}
