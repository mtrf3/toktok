package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Fpg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40172Fpg {
    public static final C40172Fpg LIZ = new C40172Fpg();

    public static void LIZLLL(SparkContext sparkContext, SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        if (sparkContext == null) {
            C58582Rq.LIZ("loadUrl() sparkContext is empty", null);
            return;
        }
        sparkContext.LJII(C38311F1v.class, new C38311F1v(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS));
        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJIIJJI(sparkContext);
        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LIZIZ();
    }

    public final C40177Fpl LIZJ(Context context, String schema, Bundle bundle, String accessKey, AbstractC60800Ntc loadCallback, F23 f23) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(schema, "schema");
        o.LJIIIZ(accessKey, "accessKey");
        o.LJIIIZ(loadCallback, "loadCallback");
        AdSparkHybridContext LIZIZ = LIZIZ(this, context, schema, accessKey, bundle, f23, null, null, null, 480);
        LIZIZ.LJJIL(loadCallback);
        C40343FsR.LJIILJJIL.getClass();
        return new C40177Fpl(LIZIZ, C40343FsR.LIZ(C40342FsQ.LIZ(context, LIZIZ)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0017, code lost:
    
        if (r5 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridContext LIZ(android.content.Context r3, java.lang.String r4, java.lang.String r5, android.os.Bundle r6, X.F23 r7, X.InterfaceC60850NuQ r8, X.InterfaceC60844NuK r9, X.NZ1 r10, boolean r11) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridContext r2 = new com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridContext
            r2.<init>()
            if (r5 == 0) goto L12
            boolean r0 = ujb.o.LJJJJJL(r5)
            if (r0 == 0) goto L19
        L12:
            java.lang.String r0 = "no ak, please confirm"
            X.C58582Rq.LIZIZ(r3, r0)
            if (r5 == 0) goto L23
        L19:
            java.lang.Class<X.Fq9> r1 = X.AbstractC40201Fq9.class
            X.Fph r0 = new X.Fph
            r0.<init>(r5)
            r2.LJII(r1, r0)
        L23:
            if (r4 == 0) goto L28
            r2.LJJIJLIJ(r4)
        L28:
            X.F1u r0 = new X.F1u
            r0.<init>(r3, r6, r7)
            r2.LJJIL(r0)
            if (r7 == 0) goto L3b
            X.Ntc r0 = r7.LIZLLL()
            if (r0 == 0) goto L3b
            r2.LJJIL(r0)
        L3b:
            if (r8 == 0) goto L40
            r2.LJJIJIIJI(r8)
        L40:
            if (r11 != 0) goto L4c
            X.Fpe r1 = new X.Fpe
            r1.<init>()
            java.lang.Class<X.M2K> r0 = X.M2K.class
            r2.LJII(r0, r1)
        L4c:
            if (r10 == 0) goto L53
            java.lang.Class<X.NZ1> r0 = X.NZ1.class
            r2.LJII(r0, r10)
        L53:
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r2.LJII(r0, r6)
            if (r9 == 0) goto L5d
            r2.LJJIJL(r9)
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40172Fpg.LIZ(android.content.Context, java.lang.String, java.lang.String, android.os.Bundle, X.F23, X.NuQ, X.NuK, X.NZ1, boolean):com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridContext");
    }

    public static /* synthetic */ AdSparkHybridContext LIZIZ(C40172Fpg c40172Fpg, Context context, String str, String str2, Bundle bundle, F23 f23, InterfaceC60850NuQ interfaceC60850NuQ, InterfaceC60844NuK interfaceC60844NuK, NZ1 nz1, int i) {
        InterfaceC60844NuK interfaceC60844NuK2 = interfaceC60844NuK;
        InterfaceC60850NuQ interfaceC60850NuQ2 = interfaceC60850NuQ;
        NZ1 nz12 = null;
        if ((i & 32) != 0) {
            interfaceC60850NuQ2 = null;
        }
        if ((i & 64) != 0) {
            interfaceC60844NuK2 = null;
        }
        if ((i & 128) == 0) {
            nz12 = nz1;
        }
        c40172Fpg.getClass();
        return LIZ(context, str, str2, bundle, f23, interfaceC60850NuQ2, interfaceC60844NuK2, nz12, false);
    }

    public static AdSparkHybridContext LJ(Context context, String str, String str2, Bundle bundle, F23 f23, InterfaceC60850NuQ interfaceC60850NuQ, InterfaceC60844NuK interfaceC60844NuK, NZ1 nz1, CN8 cn8, boolean z, int i) {
        InterfaceC60819Ntv LIZIZ;
        boolean z2 = z;
        NZ1 nz12 = nz1;
        CN8 cn82 = null;
        if ((i & 128) != 0) {
            nz12 = null;
        }
        if ((i & 256) == 0) {
            cn82 = cn8;
        }
        if ((i & 512) != 0) {
            z2 = false;
        }
        AdSparkHybridContext LIZ2 = LIZ(context, str, str2, bundle, f23, interfaceC60850NuQ, interfaceC60844NuK, nz12, z2);
        if (f23 != null && (LIZIZ = f23.LIZIZ(LIZ2, context, str, bundle)) != null) {
            LIZ2.LJII(InterfaceC60819Ntv.class, LIZIZ);
        }
        if (bundle != null) {
            for (String key : bundle.keySet()) {
                if (!o.LJ("url", key)) {
                    Object LLJJIII = C16880lQ.LLJJIII(bundle, key);
                    if (LLJJIII instanceof Boolean) {
                        o.LJIIIIZZ(key, "key");
                        LIZ2.LJJIIJZLJL(key, ((Boolean) LLJJIII).booleanValue());
                    } else if (LLJJIII instanceof Double) {
                        o.LJIIIIZZ(key, "key");
                        LIZ2.LJJII(key, ((Number) LLJJIII).doubleValue());
                    } else if (LLJJIII instanceof Integer) {
                        o.LJIIIIZZ(key, "key");
                        LIZ2.LJJIFFI(((Number) LLJJIII).intValue(), key);
                    } else if (LLJJIII instanceof String) {
                        o.LJIIIIZZ(key, "key");
                        LIZ2.LJJIIJ(key, (String) LLJJIII);
                    }
                }
            }
        }
        if (cn82 != null) {
            LIZ2.LJJIJIIJIL(new CN7(cn82));
        }
        C40343FsR.LJIILJJIL.getClass();
        C40342FsQ.LIZ(context, LIZ2).LIZIZ();
        return LIZ2;
    }
}
