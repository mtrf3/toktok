package Y;

import X.C09900aA;
import X.C198517qh;
import X.C26045AKb;
import X.C38711FHf;
import X.C38739FIh;
import X.C41491GQd;
import X.C62848OlY;
import X.C76800UCe;
import X.EF7;
import X.EL2;
import X.F9J;
import android.app.Activity;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.jar.JarFile;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ACallableS24S0001000_6 implements Callable {
    public final int $t;
    public int i0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS24S0001000_6 aCallableS24S0001000_6) {
        EL2.LIZJ(aCallableS24S0001000_6.i0);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS24S0001000_6 aCallableS24S0001000_6) {
        switch (aCallableS24S0001000_6.i0) {
            case 0:
                try {
                    Field declaredField = Class.forName("libcore.net.url.JarURLConnectionImpl").getDeclaredField("jarCache");
                    declaredField.setAccessible(true);
                    HashMap<URL, JarFile> hashMap = (HashMap) declaredField.get(null);
                    C38739FIh.LIZ = hashMap;
                    synchronized (hashMap) {
                        HashMap<URL, JarFile> hashMap2 = C38739FIh.LIZ;
                        if (hashMap2 != null) {
                            try {
                                Iterator<Map.Entry<URL, JarFile>> it = hashMap2.entrySet().iterator();
                                while (it.hasNext()) {
                                    Map.Entry<URL, JarFile> next = it.next();
                                    URL key = next.getKey();
                                    if (key.toString().endsWith(".apk") || key.toString().endsWith(".jar")) {
                                        try {
                                            next.getValue().close();
                                            it.remove();
                                        } catch (Exception unused) {
                                        }
                                    }
                                }
                            } catch (Exception unused2) {
                            }
                        }
                    }
                } catch (Exception unused3) {
                }
                return null;
            default:
                F9J.LIZIZ(EF7.LIZIZ(), 0, "aweme_friends").edit().clear().commit();
                return null;
        }
    }

    public static final Object call$2(ACallableS24S0001000_6 aCallableS24S0001000_6) {
        int i = aCallableS24S0001000_6.i0;
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity == null) {
            return null;
        }
        C26045AKb c26045AKb = new C26045AKb(validTopActivity);
        c26045AKb.LJ(R.style.ul);
        c26045AKb.LJIIIIZZ(i);
        c26045AKb.LJIIJ();
        return null;
    }

    public static final Object call$3(ACallableS24S0001000_6 aCallableS24S0001000_6) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("requestCount", Integer.valueOf(aCallableS24S0001000_6.i0));
        C09900aA.LJIIJJI("combine_settings_monitor_service", 0, c198517qh.LJ());
        return C76800UCe.LIZ;
    }

    public static final Object call$4(ACallableS24S0001000_6 aCallableS24S0001000_6) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("requestCount", Integer.valueOf(aCallableS24S0001000_6.i0));
        C09900aA.LJIIJJI("combine_settings_monitor_service", 0, c198517qh.LJ());
        return C76800UCe.LIZ;
    }

    public static final Object call$5(ACallableS24S0001000_6 aCallableS24S0001000_6) {
        switch (aCallableS24S0001000_6.i0) {
            case 0:
                return Boolean.valueOf(C62848OlY.LIZJ());
            default:
                try {
                    AVExternalServiceImpl.LIZ().configService().cacheConfig().clearDraftEffectCache();
                    return null;
                } catch (Exception unused) {
                    return null;
                }
        }
    }

    public static final Object call$6(ACallableS24S0001000_6 aCallableS24S0001000_6) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_cache", 0);
            jSONObject.put("is_timeout", aCallableS24S0001000_6.i0);
            AppLogNewUtils.onEventV3("pull_out_cache_video", jSONObject);
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$7(ACallableS24S0001000_6 aCallableS24S0001000_6) {
        switch (aCallableS24S0001000_6.i0) {
            case 0:
                return C41491GQd.LIZ();
            default:
                C38711FHf.LIZ();
                return null;
        }
    }

    public ACallableS24S0001000_6(int i, int i2) {
        this.$t = i2;
        switch (i2) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                this.i0 = i;
                return;
            case 2:
            default:
                this.i0 = i;
                return;
        }
    }
}
