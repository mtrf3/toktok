package X;

import X.InterfaceC86772Y3s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Y1w, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86724Y1w<T extends InterfaceC86772Y3s> {
    public final ConcurrentHashMap<String, AbstractC73672Svk<Boolean>> LIZ = new ConcurrentHashMap<>();

    public abstract Y20<T> LIZJ();

    public abstract Y2V LIZLLL();

    public abstract AbstractC73672Svk<Boolean> LJII(Aweme aweme, InterfaceC86733Y2f interfaceC86733Y2f, String str);

    public boolean LJIIIIZZ(T t) {
        return true;
    }

    public final T LJ(Aweme aweme, String targetLang) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(targetLang, "targetLang");
        return LIZJ().LIZJ(aweme, targetLang);
    }

    public final void LJFF(InterfaceC86733Y2f interfaceC86733Y2f, String failureMessage) {
        o.LJIIIZ(failureMessage, "failureMessage");
        if (interfaceC86733Y2f != null) {
            interfaceC86733Y2f.LIZJ(LIZLLL(), false, false, null, failureMessage);
        }
    }

    public static void LJI(AbstractC86724Y1w abstractC86724Y1w, InterfaceC86733Y2f interfaceC86733Y2f, Integer num) {
        if (interfaceC86733Y2f != null) {
            interfaceC86733Y2f.LIZJ(abstractC86724Y1w.LIZLLL(), true, false, num, null);
        } else {
            abstractC86724Y1w.getClass();
        }
    }
}
