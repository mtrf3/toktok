package X;

import X.InterfaceC86772Y3s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class Y20<T extends InterfaceC86772Y3s> {
    public final HashMap<String, T> LIZ = new HashMap<>();

    public boolean LIZ(Aweme aweme, InterfaceC86772Y3s interfaceC86772Y3s, String targetLang) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(targetLang, "targetLang");
        return true;
    }

    public String LIZIZ(Aweme aweme, String targetLang) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(targetLang, "targetLang");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(aweme.getAid());
        LIZ.append(targetLang);
        return X1D.LIZIZ(LIZ);
    }

    public final T LIZJ(Aweme aweme, String targetLang) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(targetLang, "targetLang");
        T t = this.LIZ.get(LIZIZ(aweme, targetLang));
        if (t != null && LIZ(aweme, t, targetLang)) {
            return t;
        }
        return null;
    }

    public final void LIZLLL(Aweme aweme, T t, String targetLang) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(targetLang, "targetLang");
        this.LIZ.put(LIZIZ(aweme, targetLang), t);
    }
}
