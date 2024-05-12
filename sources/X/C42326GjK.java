package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.GjK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42326GjK {
    public static final C42326GjK LIZ = new C42326GjK();
    public static final java.util.Map<String, Bundle> LIZIZ = new ConcurrentHashMap();
    public static final java.util.Map<Context, String> LIZJ = new WeakHashMap();
    public static final java.util.Map<Context, String> LIZLLL = new WeakHashMap();
    public static final java.util.Map<Context, Boolean> LJ = new WeakHashMap();
    public static final C42336GjU LJFF = new C42336GjU();
    public static final List<Runnable> LJI = new ArrayList();
    public static final ExecutorService LJII = C38995FSd.LIZLLL();
    public static CountDownLatch LJIIIIZZ = new CountDownLatch(1);

    public static void LIZ(Context context) {
        o.LJIIIZ(context, "context");
        if (!((WeakHashMap) LJ).containsKey(context)) {
            WeakHashMap weakHashMap = (WeakHashMap) LIZJ;
            if (weakHashMap.containsKey(context)) {
                String str = (String) weakHashMap.get(context);
                C65777Prh.LIZJ(LIZIZ).remove(str);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("LargeTransaction, remove memory cache uuid: ");
                LIZ2.append(str);
                H78.LJI(X1D.LIZIZ(LIZ2));
            }
        }
    }

    public static void LIZIZ(Intent intent) {
        int i;
        o.LJIIIZ(intent, "intent");
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI != null) {
            i = C78934UyQ.LJJII(LLJJIJI);
        } else {
            i = 0;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("LargeTransaction, extra size : ");
        LIZ2.append(i);
        H78.LJI(X1D.LIZIZ(LIZ2));
        FFL.LJIIIZ().getClass();
        if (i >= FFL.LJIIJ(31744, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, "creative_large_transaction_size_threshold", true) * 1024) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("LargeTransaction, extra size too large: ");
            LIZ3.append(i);
            LIZ3.append(", intent: ");
            LIZ3.append(intent);
            H78.LJI(X1D.LIZIZ(LIZ3));
            Bundle LLJJIJI2 = C16880lQ.LLJJIJI(intent);
            if (LLJJIJI2 != null) {
                String LIZ4 = AnonymousClass629.LIZ("randomUUID().toString()");
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("LargeTransaction uuid: ");
                LIZ5.append(LIZ4);
                H78.LJI(X1D.LIZIZ(LIZ5));
                ((ConcurrentHashMap) LIZIZ).put(LIZ4, LLJJIJI2);
                Bundle bundle = new Bundle();
                bundle.putString("activity_bundle_uuid", LIZ4);
                intent.replaceExtras(bundle);
            }
        }
    }

    public static void LIZLLL(Intent intent) {
        Bundle LLJJIJI;
        String string;
        if (intent == null || (LLJJIJI = C16880lQ.LLJJIJI(intent)) == null || (string = LLJJIJI.getString("activity_bundle_uuid")) == null || string.length() == 0) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("LargeTransaction, restore uuid: ");
        LIZ2.append(string);
        H78.LJI(X1D.LIZIZ(LIZ2));
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
        Bundle bundle = (Bundle) concurrentHashMap.get(string);
        if (bundle == null) {
            return;
        }
        intent.replaceExtras(C78934UyQ.LJFF(C78934UyQ.LJJIII(bundle)));
        concurrentHashMap.remove(string);
    }

    public static void LJ(Context context, Intent intent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        LIZIZ(intent);
        C16880lQ.LIZJ(context, intent);
    }

    public static void LJI(Context context, Bundle bundle) {
        boolean z;
        Bundle bundle2;
        o.LJIIIZ(context, "context");
        String str = (String) ((WeakHashMap) LIZJ).get(context);
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (bundle2 = (Bundle) ((ConcurrentHashMap) LIZIZ).get(str)) != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("LargeTransaction, ");
            LIZ2.append(C16880lQ.LJLLJ(context.getClass()));
            LIZ2.append(" storeActivityIntent store uuid: ");
            LIZ2.append(str);
            LIZ2.append(", bundle size ");
            LIZ2.append(C78934UyQ.LJJII(bundle2));
            H78.LJI(X1D.LIZIZ(LIZ2));
            LJII(LIZ, str, bundle2);
        }
        if (bundle != null) {
            int LJJII = C78934UyQ.LJJII(bundle);
            FFL.LJIIIZ().getClass();
            if (LJJII >= FFL.LJIIJ(31744, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, "creative_large_transaction_size_threshold", true) * 1024) {
                String LIZ3 = AnonymousClass629.LIZ("randomUUID().toString()");
                Bundle bundle3 = new Bundle(bundle);
                ((ConcurrentHashMap) LIZIZ).put(LIZ3, bundle3);
                ((WeakHashMap) LIZLLL).put(context, LIZ3);
                bundle.clear();
                bundle.putString("save_state_bundle_uuid", LIZ3);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("LargeTransaction, ");
                LIZ4.append(C16880lQ.LJLLJ(context.getClass()));
                LIZ4.append(" storeActivityIntent store state uuid: ");
                LIZ4.append(LIZ3);
                LIZ4.append(", bundle size ");
                LIZ4.append(C78934UyQ.LJJII(bundle3));
                H78.LJI(X1D.LIZIZ(LIZ4));
                LJII(LIZ, LIZ3, bundle3);
            }
        }
        ((WeakHashMap) LJ).put(context, Boolean.TRUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c8, code lost:
    
        if (r0 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.content.Context r5, android.content.Intent r6, android.os.Bundle r7) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "LargeTransaction, restoreActivityIntent"
            X.H78.LJI(r0)
            if (r6 == 0) goto L20
            android.os.Bundle r1 = X.C16880lQ.LLJJIJI(r6)
            if (r1 == 0) goto L20
            java.lang.String r0 = "activity_bundle_uuid"
            java.lang.String r4 = r1.getString(r0)
            if (r4 == 0) goto L20
            int r0 = r4.length()
            if (r0 != 0) goto L7a
        L20:
            if (r7 == 0) goto L30
            java.lang.String r0 = "save_state_bundle_uuid"
            java.lang.String r3 = r7.getString(r0)
            if (r3 == 0) goto L30
            int r0 = r3.length()
            if (r0 != 0) goto L31
        L30:
            return
        L31:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "LargeTransaction, restore state uuid: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.H78.LJI(r0)
            java.util.Map<java.lang.String, android.os.Bundle> r0 = X.C42326GjK.LIZIZ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r3)
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r0 != 0) goto L73
            X.GjU r0 = X.C42326GjK.LJFF
            byte[] r2 = r0.LJ(r3)
            int r0 = r2.length
            if (r0 != 0) goto L5a
            goto L30
        L5a:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "LargeTransaction, restore from disk state uuid: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.H78.LJI(r0)
            android.os.Bundle r0 = X.C78934UyQ.LJFF(r2)
            if (r0 == 0) goto L30
        L73:
            r7.clear()
            r7.putAll(r0)
            goto L30
        L7a:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "LargeTransaction, restore uuid: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.H78.LJI(r0)
            java.util.Map<android.content.Context, java.lang.String> r0 = X.C42326GjK.LIZJ
            java.util.WeakHashMap r0 = (java.util.WeakHashMap) r0
            r0.put(r5, r4)
            java.util.Map<java.lang.String, android.os.Bundle> r3 = X.C42326GjK.LIZIZ
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            java.lang.Object r0 = r3.get(r4)
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r0 != 0) goto Lca
            X.GjU r0 = X.C42326GjK.LJFF
            byte[] r2 = r0.LJ(r4)
            int r0 = r2.length
            if (r0 != 0) goto Lab
            goto L20
        Lab:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "LargeTransaction, restore from disk uuid: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.H78.LJI(r0)
            android.os.Bundle r0 = X.C78934UyQ.LJFF(r2)
            r6.replaceExtras(r0)
            r3.put(r4, r0)
            if (r0 == 0) goto L20
        Lca:
            byte[] r0 = X.C78934UyQ.LJJIII(r0)
            android.os.Bundle r0 = X.C78934UyQ.LJFF(r0)
            r6.replaceExtras(r0)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42326GjK.LIZJ(android.content.Context, android.content.Intent, android.os.Bundle):void");
    }

    public static void LJFF(Activity context, int i, Intent intent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        LIZIZ(intent);
        C16880lQ.LJFF(context, i, intent);
    }

    public static void LJII(C42326GjK c42326GjK, String str, Bundle bundle) {
        c42326GjK.getClass();
        byte[] LJJIII = C78934UyQ.LJJIII(bundle);
        if (LJJIII.length == 0) {
            return;
        }
        RunnableC42328GjM runnableC42328GjM = new RunnableC42328GjM(str, System.currentTimeMillis(), null, LJJIII, false);
        if (LJIIIIZZ.getCount() == 0) {
            LJIIIIZZ = new CountDownLatch(1);
        }
        ((ArrayList) LJI).add(runnableC42328GjM);
        LJII.execute(runnableC42328GjM);
        if (!C84763XOl.LJIIJJI) {
            return;
        }
        try {
            LJIIIIZZ.await(2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
