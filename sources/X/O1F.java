package X;

import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class O1F {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(android.net.Uri getUriWithoutQuery) {
        o.LJIIJ(getUriWithoutQuery, "$this$getUriWithoutQuery");
        if (!getUriWithoutQuery.isHierarchical()) {
            String uri = getUriWithoutQuery.toString();
            o.LJFF(uri, "toString()");
            return uri;
        }
        try {
            String builder = getUriWithoutQuery.buildUpon().clearQuery().toString();
            o.LJFF(builder, "buildUpon().clearQuery().toString()");
            return builder;
        } catch (Throwable unused) {
            String uri2 = getUriWithoutQuery.toString();
            o.LJFF(uri2, "toString()");
            return uri2;
        }
    }

    public static boolean LIZLLL(String str) {
        if (str != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public static String LIZ(String channel, String bundle) {
        o.LJIIJ(channel, "channel");
        o.LJIIJ(bundle, "bundle");
        if (bundle.length() == 0) {
            return channel;
        }
        StringBuilder LJFF = C72972SkS.LJFF(channel, '/');
        LJFF.append(s.LJJLL("/", bundle));
        return X1D.LIZIZ(LJFF);
    }

    public static GeckoConfig LIZIZ(O1E getGeckoConfig, String ak) {
        o.LJIIJ(getGeckoConfig, "$this$getGeckoConfig");
        o.LJIIJ(ak, "ak");
        GeckoConfig geckoConfig = getGeckoConfig.LJIIJ.get(ak);
        if (geckoConfig != null) {
            return geckoConfig;
        }
        return getGeckoConfig.LJIIIZ;
    }
}
