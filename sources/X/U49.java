package X;

import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U49 {
    public static final U49 LIZ = new U49();
    public static final CopyOnWriteArrayList<InterfaceC64395PPb> LIZIZ;
    public static volatile String LIZJ;
    public static volatile String LIZLLL;
    public static final C1HQ<String, String> LJ;
    public static final C1HQ<String, String> LJFF;
    public static final String[] LJI;

    static {
        C16880lQ.LJLLJ(U49.class);
        LIZIZ = new CopyOnWriteArrayList<>();
        LIZJ = "";
        LIZLLL = "";
        LJ = new C1HQ<>();
        C1HQ<String, String> c1hq = new C1HQ<>(64);
        LJFF = c1hq;
        String[] strArr = {"us", "as", "gu", "mp", "pr", "vi", "um"};
        LJI = new String[]{"at", "be", "bg", "ch", "cy", "cz", "de", "dk", "ee", "es", "fi", "fr", "gb", "gf", "gp", "gr", "hr", "hu", "ie", "is", "it", "li", "lt", "lu", "lv", "mf", "mq", "mt", "nl", "no", "pl", "pt", "re", "ro", "se", "si", "sk", "yt"};
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[getStoreRegion]: currentStoreRegionInfo = ");
        LIZ2.append(C66260PzU.LIZ);
        C26946Ahq.LIZ(X1D.LIZIZ(LIZ2));
        String lowerCase = C66260PzU.LIZ.LJLILLLLZI.toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (lowerCase.length() > 0) {
            String orDefault = c1hq.getOrDefault(lowerCase, null);
            if (orDefault == null) {
                orDefault = "row";
            }
            LIZLLL = orDefault;
        }
        for (String str : strArr) {
            LJFF.put(str, "us");
        }
        for (String str2 : LJI) {
            LJFF.put(str2, "eu");
        }
    }
}
