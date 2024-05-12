package Y;

import X.C141335gf;
import X.C1E4;
import X.C27739Aud;
import X.C3C5;
import X.C61830OOk;
import X.C61831OOl;
import X.C76800UCe;
import X.C78983UzD;
import X.W5O;
import android.net.Uri;
import android.util.Log;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class ACallableS4S0300100_10 implements Callable {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0294 A[Catch: all -> 0x02bb, TryCatch #5 {all -> 0x02bb, blocks: (B:114:0x0288, B:116:0x0294, B:118:0x02a7, B:119:0x02ad), top: B:113:0x0288 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$0(Y.ACallableS4S0300100_10 r12) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS4S0300100_10.call$0(Y.ACallableS4S0300100_10):java.lang.Object");
    }

    public static final Object call$1(ACallableS4S0300100_10 aCallableS4S0300100_10) {
        Object LIZ;
        long j;
        int LJII;
        boolean has;
        Object obj = aCallableS4S0300100_10.l0;
        long j2 = aCallableS4S0300100_10.j3;
        Throwable th = (Throwable) aCallableS4S0300100_10.l1;
        W5O w5o = (W5O) aCallableS4S0300100_10.l2;
        try {
            JSONObject jSONObject = new JSONObject(C27739Aud.LJI(obj));
            Iterator<String> keys = jSONObject.keys();
            o.LJIIIIZZ(keys, "infoJsonObj.keys()");
            long j3 = 0;
            JSONObject jSONObject2 = null;
            while (keys.hasNext()) {
                Object obj2 = jSONObject.get(keys.next());
                if (obj2 instanceof JSONObject) {
                    JSONObject jSONObject3 = (JSONObject) obj2;
                    if (jSONObject3.has("nameValuePairs")) {
                        has = JSONObjectProtectorUtils.getJSONObject(jSONObject3, "nameValuePairs").has("image_monitor_data");
                    } else {
                        has = jSONObject3.has("image_monitor_data");
                    }
                    if (has) {
                        jSONObject2 = (JSONObject) obj2;
                    }
                }
                if (obj2 instanceof Long) {
                    j3 = ((Number) obj2).longValue();
                }
            }
            if (jSONObject2 != null) {
                Long valueOf = Long.valueOf(j3);
                if (valueOf != null) {
                    j = j2 - valueOf.longValue();
                } else {
                    j = -1;
                }
                if (th == null) {
                    LJII = 200;
                } else {
                    LJII = C1E4.LJII(th);
                }
                String stackTraceString = Log.getStackTraceString(th);
                o.LJIIIIZZ(stackTraceString, "getStackTraceString(throwable)");
                if (th != null) {
                    Uri uri = w5o.LIZIZ;
                    o.LJIIIIZZ(uri, "request.sourceUri");
                    C61831OOl.LIZ(uri, Integer.valueOf(LJII), null, null, null, Long.valueOf(j), stackTraceString, null, null, jSONObject2, false);
                } else {
                    LruCache<W5O, C61830OOk> lruCache = C61831OOl.LIZLLL;
                    Uri uri2 = w5o.LIZIZ;
                    o.LJIIIIZZ(uri2, "request.sourceUri");
                    lruCache.put(w5o, new C61830OOk(uri2, jSONObject2, j, LJII, stackTraceString));
                }
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th2) {
            LIZ = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl == null) {
            return null;
        }
        if (!(m10exceptionOrNullimpl instanceof ConcurrentModificationException)) {
            C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
        }
        return m10exceptionOrNullimpl;
    }

    public ACallableS4S0300100_10(long j, Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.j3 = j;
        this.l1 = obj3;
        this.l2 = obj;
    }
}
