package X;

import com.google.gson.j;
import com.ss.android.ugc.aweme.request_combine.request.SettingRequestExtraInfoImpl;
import com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EJ3<T, R> implements InterfaceC48038ItG {
    public static final EJ3<T, R> LJLIL = new EJ3<>();

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
                String str2 = ej6.LIZ;
                o.LJIIIIZZ(str2, "header.name");
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (o.LJ(lowerCase, "x-tt-logid")) {
                    break;
                }
            } else {
                ej6 = null;
                break;
            }
        }
        EJ6 ej62 = ej6;
        if (ej62 != null && (str = ej62.LIZIZ) != null) {
            ISettingsRequestService LJIILLIIL = SettingsRequestServiceImpl.LJIILLIIL();
            if (LJIILLIIL != null) {
                LJIILLIIL.LJIIJ(C113554cx.LJJLIIIIJ(new OSZ("commonLogId", str)));
            }
            if (C35232DsC.LIZ()) {
                LinkedHashMap LIZ = C0JU.LIZ("x-tt-logid", str);
                String str3 = it.LIZ.LIZ;
                if (str3 == null) {
                    str3 = "";
                }
                LIZ.put("url", str3);
                ISettingRequestExtraInfo LIZJ = SettingRequestExtraInfoImpl.LIZJ();
                if (LIZJ != null) {
                    LIZJ.LIZIZ(LIZ);
                }
            }
        }
        String str4 = it.LIZ.LIZ;
        o.LJIIIIZZ(str4, "it.raw().url");
        T t = it.LIZIZ;
        o.LJIIIIZZ(t, "it.body()");
        return new E29(str4, (j) t);
    }
}
