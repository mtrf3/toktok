package X;

import android.os.Build;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.YBi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86970YBi {
    public static final C86970YBi LIZ = new C86970YBi();
    public static final InterfaceC80833Ff LIZIZ;

    static {
        InterfaceC80833Ff c86967YBf;
        Locale LIZ2 = C39419FdX.LIZ();
        o.LJIIIIZZ(LIZ2, "getCurrentLocale()");
        ArrayList arrayList = new ArrayList();
        arrayList.add(LIZ2);
        if (Build.VERSION.SDK_INT > 24) {
            String language = LIZ2.getLanguage();
            if (o.LJ(language, Locale.CHINESE.getLanguage())) {
                c86967YBf = new C86969YBh(arrayList);
            } else if (o.LJ(language, Locale.ENGLISH.getLanguage())) {
                c86967YBf = new C86969YBh(arrayList);
            } else if (o.LJ(language, Locale.JAPANESE.getLanguage())) {
                Locale CHINESE = Locale.CHINESE;
                o.LJIIIIZZ(CHINESE, "CHINESE");
                arrayList.add(CHINESE);
                c86967YBf = new C86971YBj(arrayList);
            } else if (o.LJ(language, Locale.KOREAN.getLanguage())) {
                c86967YBf = new C86972YBk(arrayList);
            } else {
                c86967YBf = new C86968YBg(arrayList);
            }
        } else {
            c86967YBf = new C86967YBf();
        }
        LIZIZ = c86967YBf;
    }
}
