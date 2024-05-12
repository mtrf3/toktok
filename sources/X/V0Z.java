package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import ujb.o;

/* loaded from: classes14.dex */
public final class V0Z {
    public static final ConcurrentHashMap<String, C79033V0b> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, CountDownLatch> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZIZ(String str) {
        for (Map.Entry<String, C79033V0b> entry : LIZ.entrySet()) {
            if (o.LJJJLIIL(entry.getKey(), str, false)) {
                LIZ.remove(entry.getKey());
            }
        }
        for (Map.Entry<String, CountDownLatch> entry2 : LIZIZ.entrySet()) {
            if (o.LJJJLIIL(entry2.getKey(), str, false)) {
                LIZ.remove(entry2.getKey());
            }
        }
    }

    public static void LIZ(Context context, C79033V0b c79033V0b) {
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        if (c79033V0b.LIZIZ != 0) {
            ConcurrentHashMap<String, C79033V0b> concurrentHashMap = LIZ;
            if (concurrentHashMap.containsKey(c79033V0b.LIZ) || c79033V0b.LJ || c79033V0b.LJFF) {
                return;
            }
            concurrentHashMap.put(c79033V0b.LIZ, c79033V0b);
            if (c79033V0b.LJFF || c79033V0b.LJ) {
                return;
            }
            c79033V0b.LJFF = true;
            new C15Y(new MutableContextWrapper(context)).LIZ(c79033V0b.LIZIZ, c79033V0b.LIZJ, new C79032V0a(c79033V0b));
        }
    }

    public static View LIZJ(Context context, int i, ViewGroup viewGroup, String key, LayoutInflater layoutInflater) {
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        kotlin.jvm.internal.o.LJIIIZ(key, "key");
        MutableContextWrapper mutableContextWrapper = null;
        if (!TextUtils.isEmpty(key)) {
            ConcurrentHashMap<String, C79033V0b> concurrentHashMap = LIZ;
            if (concurrentHashMap.containsKey(key)) {
                C79033V0b c79033V0b = concurrentHashMap.get(key);
                CountDownLatch countDownLatch = LIZIZ.get(key);
                if (c79033V0b != null) {
                    View view = c79033V0b.LIZLLL;
                    if (view == null && c79033V0b.LJFF && countDownLatch != null) {
                        try {
                            countDownLatch.await();
                        } catch (InterruptedException e) {
                            H7B.LIZJ(e.getLocalizedMessage());
                        }
                    }
                    if (view != null) {
                        c79033V0b.LIZLLL = null;
                        c79033V0b.LIZJ = null;
                        LIZ.remove(key);
                        LIZIZ.remove(key);
                        Context context2 = view.getContext();
                        if (context2 instanceof MutableContextWrapper) {
                            mutableContextWrapper = (MutableContextWrapper) context2;
                        }
                        if (mutableContextWrapper != null) {
                            mutableContextWrapper.setBaseContext(context);
                        }
                        return view;
                    }
                    c79033V0b.LJ = true;
                }
            }
        }
        if (layoutInflater == null) {
            return null;
        }
        return C16880lQ.LLLLIILL(layoutInflater, i, viewGroup, false);
    }
}
