package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.RoG, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70660RoG {
    public static final ConcurrentHashMap<String, Runnable> LIZ = new ConcurrentHashMap<>();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C70665RoL.INSTANCE);
    public static final LruCache<String, LruCache<String, C70663RoJ>> LIZJ = new LruCache<>(2);
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, C69958Rcw>> LIZLLL = new ConcurrentHashMap<>();

    public static void LIZLLL(String pid) {
        o.LJIIIZ(pid, "pid");
        LIZJ.remove(pid);
        LIZLLL.remove(pid);
        Runnable remove = LIZ.remove(pid);
        if (remove != null) {
            ((Handler) LIZIZ.getValue()).removeCallbacks(remove);
        }
    }

    public static String LIZ(Integer num, String url) {
        String str;
        boolean z;
        o.LJIIIZ(url, "url");
        String LIZ2 = SAM.LIZ();
        if (LIZ2 != null) {
            str = LIZ2.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        } else {
            str = "";
        }
        OSZ LJIIL = C1E4.LJIIL(url);
        if (LJIIL != null) {
            int intValue = ((Number) LJIIL.getFirst()).intValue();
            int intValue2 = ((Number) LJIIL.getSecond()).intValue();
            if (C78866UxK.LJJZZIII(num) == EnumC28000Ayq.TTF) {
                z = true;
            } else {
                z = false;
            }
            OSZ LIZIZ2 = LIZIZ(intValue, intValue2, str, z);
            String LJJIIJZLJL = C1E4.LJJIIJZLJL(((Number) LIZIZ2.getFirst()).intValue(), ((Number) LIZIZ2.getSecond()).intValue(), url);
            int hashCode = str.hashCode();
            if (hashCode != 2267) {
                if (hashCode != 2638) {
                    if (hashCode != 2718 || !str.equals("US")) {
                        return LJJIIJZLJL;
                    }
                } else if (!str.equals("SA")) {
                    return LJJIIJZLJL;
                }
            } else if (!str.equals("GB")) {
                return LJJIIJZLJL;
            }
            return ujb.o.LJJJJZ(LJJIIJZLJL, "resize", "crop", false);
        }
        return null;
    }

    public static Drawable LJ(String pid, String str) {
        boolean z;
        Drawable drawable;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        C70663RoJ c70663RoJ;
        o.LJIIIZ(pid, "pid");
        if (str == null || ujb.o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        LruCache<String, C70663RoJ> lruCache = LIZJ.get(pid);
        if (lruCache != null && (c70663RoJ = lruCache.get(str)) != null) {
            drawable = c70663RoJ.LJFF;
        } else {
            drawable = null;
        }
        if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null && (bitmap = bitmapDrawable.getBitmap()) != null && bitmap.isRecycled()) {
            return null;
        }
        return drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.Map] */
    public static OSZ LIZIZ(int i, int i2, String str, boolean z) {
        OSZ osz;
        String upperCase = str.toUpperCase(Locale.ROOT);
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (!z && !o.LJ(upperCase, "GB") && !o.LJ(upperCase, "US")) {
            return new OSZ(800, 800);
        }
        if (i == i2) {
            if (z) {
                osz = new OSZ(1800, 1800);
            } else {
                osz = new OSZ(800, 800);
            }
        } else if (z) {
            osz = new OSZ(1350, 1800);
        } else {
            osz = new OSZ(800, 1066);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(((Number) osz.getFirst()).intValue());
        LIZ2.append(':');
        LIZ2.append(((Number) osz.getSecond()).intValue());
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        L5T.LIZ.getClass();
        FFL LJIIIZ = FFL.LJIIIZ();
        C93833mF c93833mF = L5T.LIZIZ;
        LJIIIZ.getClass();
        ?? r0 = (java.util.Map) FFL.LJIJ(true, "ec_pdp_header_image_resize", 31744, java.util.Map.class, c93833mF);
        if (r0 != 0) {
            c93833mF = r0;
        }
        String str2 = (String) c93833mF.get(LIZIZ2);
        if (str2 != null) {
            List LJLJJL = s.LJLJJL(str2, new String[]{":"}, 0, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it = LJLJJL.iterator();
            while (it.hasNext()) {
                Integer LJJIL = C38350F3i.LJJIL((String) it.next());
                if (LJJIL != null) {
                    arrayList.add(LJJIL);
                }
            }
            if (arrayList.size() == 2) {
                return new OSZ(ListProtector.get(arrayList, 0), ListProtector.get(arrayList, 1));
            }
            return osz;
        }
        return osz;
    }

    public static void LIZJ(AwemeHostApplication context, String str, String str2, String str3, InterfaceC70422pa viewModelIOScope) {
        o.LJIIIZ(viewModelIOScope, "viewModelIOScope");
        o.LJIIIZ(context, "context");
        if (str == null || ujb.o.LJJJJJL(str) || str3 == null || ujb.o.LJJJJJL(str3) || str2 == null || ujb.o.LJJJJJL(str2)) {
            return;
        }
        LruCache<String, LruCache<String, C70663RoJ>> lruCache = LIZJ;
        LruCache<String, C70663RoJ> lruCache2 = lruCache.get(str);
        if (lruCache2 == null) {
            lruCache2 = new LruCache<>(4);
        }
        lruCache.put(str, lruCache2);
        C70663RoJ c70663RoJ = lruCache2.get(str3);
        if (c70663RoJ != null && o.LJ(str2, c70663RoJ.LIZJ)) {
            return;
        }
        C70663RoJ c70663RoJ2 = new C70663RoJ(context, str, str3, str2, viewModelIOScope);
        if (!ujb.o.LJJJJJL(c70663RoJ2.LIZJ)) {
            XKX.LIZLLL(c70663RoJ2.LIZLLL, C78613UtF.LIZJ, null, new C70661RoH(c70663RoJ2, null), 2);
        }
        lruCache2.put(str3, c70663RoJ2);
    }
}
