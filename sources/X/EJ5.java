package X;

import com.ss.android.ugc.aweme.request_combine.request.SettingRequestExtraInfoImpl;
import com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EJ5<T, R> implements InterfaceC48038ItG {
    public static final EJ5<T, R> LJLIL = new EJ5<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        EJ6 ej6;
        String str;
        C64797Pbt it = (C64797Pbt) obj;
        o.LJIIIZ(it, "it");
        List<EJ6> list = it.LIZ.LIZLLL;
        o.LJIIIIZZ(list, "it.headers()");
        Iterator<EJ6> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                ej6 = it2.next();
                if (o.LJ(ej6.LIZ, "x-tt-logid")) {
                    break;
                }
            } else {
                ej6 = null;
                break;
            }
        }
        EJ6 ej62 = ej6;
        if (ej62 != null && (str = ej62.LIZIZ) != null) {
            LinkedHashMap LIZ = C0JU.LIZ("x-tt-logid", str);
            String str2 = it.LIZ.LIZ;
            o.LJIIIIZZ(str2, "it.raw().url");
            LIZ.put("url", str2);
            ISettingRequestExtraInfo LIZJ = SettingRequestExtraInfoImpl.LIZJ();
            if (LIZJ != null) {
                LIZJ.LIZIZ(LIZ);
            }
        }
        return it.LIZIZ;
    }
}
