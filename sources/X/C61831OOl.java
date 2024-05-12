package X;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomNetworkInterceptorSwitch;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageNodeMonitorService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import ujb.o;
import ujb.s;

/* renamed from: X.OOl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61831OOl {
    public static android.net.Uri LIZ;
    public static final LruCache<String, String> LIZIZ = new LruCache<>(15);
    public static final LruCache<String, C61833OOn> LIZJ = new LruCache<>(5);
    public static final LruCache<W5O, C61830OOk> LIZLLL = new LruCache<>(50);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(ENA.LJLIL);

    public static final Float LIZJ(String str) {
        Float f = null;
        if (str == null) {
            return null;
        }
        if (s.LJLJJL(str, new String[]{"x"}, 0, 6).size() != 2) {
            return null;
        }
        try {
            f = Float.valueOf(CastIntegerProtector.parseInt((String) ListProtector.get(r2, 0)) * CastIntegerProtector.parseInt((String) ListProtector.get(r2, 1)));
            return f;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return f;
        }
    }

    public static final void LJFF(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
        List<Object> list = null;
        if (interfaceC78280Uns != null) {
            String string = interfaceC78280Uns.getString("containerID");
            InterfaceC78502UrS array = interfaceC78280Uns.getArray("imageList");
            if (array != null) {
                list = array.LIZ();
            }
            if (string == null || list == null) {
                return;
            }
            Iterator<Object> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                String path = UriProtector.parse((String) it.next()).getPath();
                LruCache<String, String> lruCache = LIZIZ;
                if (lruCache.get(path) == null) {
                    lruCache.put(path, string);
                    i++;
                }
            }
            LIZJ.put(string, new C61833OOn(i));
        }
    }

    public static final boolean LJIIIZ(String str) {
        if (str == null) {
            return false;
        }
        EcomNetworkInterceptorSwitch.EcomNetworkInterceptorSwitchModel ecomNetworkInterceptorSwitchModel = EcomNetworkInterceptorSwitch.LIZ;
        if (!ecomNetworkInterceptorSwitchModel.getSwitch() || o.LJJJJJL(ecomNetworkInterceptorSwitchModel.getImageHost()) || !ORY.LJJIJIIJIL(str, (Object[]) LJ.getValue())) {
            return false;
        }
        return true;
    }

    public static final void LJI(W5O request, Long l) {
        Long l2;
        Integer num;
        String str;
        kotlin.jvm.internal.o.LJIIIZ(request, "request");
        if (l != null) {
            long longValue = l.longValue();
            String uri = request.LIZIZ.toString();
            kotlin.jvm.internal.o.LJIIIIZZ(uri, "request.sourceUri.toString()");
            if (!C58403Mw3.LIZ.containsKey(uri)) {
                C61830OOk remove = LIZLLL.remove(request);
                android.net.Uri uri2 = request.LIZIZ;
                kotlin.jvm.internal.o.LJIIIIZZ(uri2, "request.sourceUri");
                JSONObject jSONObject = null;
                if (remove != null) {
                    jSONObject = remove.LJLILLLLZI;
                    l2 = Long.valueOf(remove.LJLJI);
                    num = Integer.valueOf(remove.LJLJJI);
                    str = remove.LJLJJL;
                } else {
                    l2 = null;
                    num = null;
                    str = null;
                }
                LIZ(uri2, num, null, null, l2, C44847Hit.LIZ(longValue), str, null, null, jSONObject, true);
            }
        }
        String path = request.LIZIZ.getPath();
        if (path == null) {
            return;
        }
        PageNodeMonitorService.LJIIIZ().LIZJ(path);
        LruCache<String, String> lruCache = LIZIZ;
        String str2 = lruCache.get(path);
        if (str2 == null) {
            return;
        }
        lruCache.remove(path);
        LruCache<String, C61833OOn> lruCache2 = LIZJ;
        C61833OOn c61833OOn = lruCache2.get(str2);
        if (c61833OOn == null) {
            return;
        }
        int i = c61833OOn.LJLILLLLZI + 1;
        c61833OOn.LJLILLLLZI = i;
        if (i == c61833OOn.LJLIL) {
            lruCache2.remove(str2);
            IEventCenter LJ2 = EventCenter.LJ();
            JSONObject LIZJ2 = C65232Piu.LIZJ("container_id", str2);
            LIZJ2.put("finish_timestamp", System.currentTimeMillis());
            String jSONObject2 = LIZJ2.toString();
            kotlin.jvm.internal.o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
            LJ2.LIZ("ec_perf_lynx_image_finish_event", jSONObject2);
        }
    }

    public static final Long LJII(String str, JSONObject jSONObject) {
        boolean has;
        long optLong;
        if (jSONObject.has("nameValuePairs")) {
            has = JSONObjectProtectorUtils.getJSONObject(jSONObject, "nameValuePairs").has(str);
        } else {
            has = jSONObject.has(str);
        }
        if (has) {
            if (jSONObject.has("nameValuePairs")) {
                optLong = JSONObjectProtectorUtils.getJSONObject(jSONObject, "nameValuePairs").optLong(str);
            } else {
                optLong = jSONObject.optLong(str);
            }
            return Long.valueOf(optLong);
        }
        return null;
    }

    public static final String LJIIIIZZ(String str, JSONObject jSONObject) {
        String optString;
        if (jSONObject.has("nameValuePairs")) {
            optString = JSONObjectProtectorUtils.getJSONObject(jSONObject, "nameValuePairs").optString(str);
            kotlin.jvm.internal.o.LJIIIIZZ(optString, "{\n        getJSONObject(…RS).optString(name)\n    }");
        } else {
            optString = jSONObject.optString(str);
            kotlin.jvm.internal.o.LJIIIIZZ(optString, "{\n        optString(name)\n    }");
        }
        if (C78685UuP.LJJJZ(optString)) {
            return optString;
        }
        return null;
    }

    public static final C81392Vwy LJIIJ(C79266V9a c79266V9a, V91 v91) {
        W6U w6u;
        if (!LJIIIZ(c79266V9a.LIZIZ.getHost())) {
            return null;
        }
        String src = v91.LIZ;
        kotlin.jvm.internal.o.LJIIIIZZ(src, "src");
        ConcurrentHashMap<String, C79238V7y> concurrentHashMap = C58403Mw3.LIZIZ;
        C79238V7y c79238V7y = concurrentHashMap.get(src);
        if (c79238V7y == null) {
            c79238V7y = c79266V9a.LJIIIIZZ;
        }
        V85 v85 = c79266V9a.LJIIIZ;
        C81810W8w c81810W8w = c79266V9a.LJII;
        VA3 va3 = c79266V9a.LJIILLIIL;
        if (va3 != null) {
            w6u = va3.getPostprocessorCacheKey();
        } else {
            w6u = null;
        }
        C81392Vwy LJFF = W5I.LIZ().LIZLLL.LJFF(new V91(src, c79238V7y, v85, c81810W8w, w6u, "com.ss.android.ugc.aweme.ecommerce.preloader.EcomRoundedCornerPostprocessor", null));
        if (LJFF != null && LJFF.LJI() != null && (LJFF.LJI() instanceof W5C)) {
            return LJFF;
        }
        C79238V7y c79238V7y2 = concurrentHashMap.get(src);
        if (c79238V7y2 == null) {
            c79238V7y2 = c79266V9a.LJIIIIZZ;
        }
        C81392Vwy LJFF2 = W5I.LIZ().LIZLLL.LJFF(new V91(src, c79238V7y2, c79266V9a.LJIIIZ, c79266V9a.LJII, null, null, null));
        if (LJFF2 == null || LJFF2.LJI() == null || !(LJFF2.LJI() instanceof W5C)) {
            return null;
        }
        return LJFF2;
    }

    public static final void LJ(Object obj, C34K c34k, IHD<Object> ihd, android.net.Uri uri) {
        String str;
        Object LIZ2;
        W4W w4w;
        if (C16880lQ.LLLLIIIILLL() == new Handler(C16880lQ.LLJJJJ()).getLooper().getThread()) {
            return;
        }
        String str2 = null;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        if (!LJIIIZ(str)) {
            return;
        }
        if (uri != null) {
            String uri2 = uri.toString();
            kotlin.jvm.internal.o.LJIIIIZZ(uri2, "toString()");
            Object LIZ3 = C58403Mw3.LIZ(uri2, "page_name");
            if ((LIZ3 == null || (str2 = LIZ3.toString()) == null) && (str2 = C78926UyI.LJJJJI(uri, "page_name")) == null && ((LIZ2 = C58403Mw3.LIZ(uri2, "ec_biz_scene")) == null || (str2 = LIZ2.toString()) == null)) {
                str2 = C78926UyI.LJJJJI(uri, "ec_biz_scene");
            }
        }
        if (!(obj instanceof W4W) || (w4w = (W4W) obj) == null) {
            return;
        }
        C34K c34k2 = new C34K();
        C60642Zo.LIZ.getClass();
        if (str2 == null) {
            return;
        }
        if (!C60642Zo.LIZJ.contains(str2)) {
            Iterator<String> it = C60642Zo.LIZIZ.getPages().iterator();
            while (it.hasNext()) {
                if (s.LJJJLZIJ(str2, it.next(), false)) {
                }
            }
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = new Handler(C16880lQ.LLJJJJ());
        Message obtain = Message.obtain(handler, new RunnableC48393Iyz(ihd, w4w, str2, uri, c34k2, c34k, elapsedRealtime));
        C60642Zo.LIZ.getClass();
        if (C60642Zo.LIZIZ.getOptimize()) {
            if (Build.VERSION.SDK_INT >= 22) {
                obtain.setAsynchronous(true);
                c34k2.element = true;
            }
            c34k.element = handler.sendMessageAtFrontOfQueue(obtain);
            return;
        }
        c34k.element = handler.sendMessage(obtain);
    }

    public static final boolean LIZLLL(IHD<Object> dataSubscriber, Executor executor, boolean z, boolean z2, Object obj) {
        android.net.Uri uri;
        kotlin.jvm.internal.o.LJIIIZ(dataSubscriber, "dataSubscriber");
        kotlin.jvm.internal.o.LJIIIZ(executor, "executor");
        if (z || z2) {
            return false;
        }
        C60642Zo.LIZ.getClass();
        if (!C60642Zo.LIZIZ.getEnable()) {
            return false;
        }
        C34K c34k = new C34K();
        try {
            if (obj instanceof W6Q) {
                W5O w5o = ((W6Q) obj).LJI.LIZ;
                if (w5o != null) {
                    uri = w5o.LIZIZ;
                } else {
                    uri = null;
                }
                LIZ = uri;
            }
            if ((dataSubscriber instanceof AbstractC32664Crs) && (executor instanceof FT1)) {
                LJ(obj, c34k, dataSubscriber, LIZ);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return c34k.element;
    }

    public static final void LIZ(android.net.Uri uri, Integer num, Integer num2, Integer num3, Long l, Long l2, String str, String str2, java.util.Map map, JSONObject jSONObject, boolean z) {
        C10K.LIZJ(new N3V(uri, num3, num, num2, l, l2, str2, str, map, jSONObject, z));
    }
}
