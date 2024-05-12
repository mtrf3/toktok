package com.bytedance.android.livesdk.module;

import X.ActivityC45651qj;
import X.C29306Beo;
import X.C29706BlG;
import X.C29714BlO;
import X.C29715BlP;
import X.C30874C9u;
import X.C37724ErI;
import X.C40342FsQ;
import X.C40343FsR;
import X.C42193GhB;
import X.C58310MuY;
import X.C60827Nu3;
import X.C60828Nu4;
import X.C76800UCe;
import X.InterfaceC40159FpT;
import X.InterfaceC60833Nu9;
import X.InterfaceC88472Yns;
import X.KMP;
import X.OKG;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.content.Context;
import android.content.MutableContextWrapper;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.hybrid.spark.SparkContext;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class HybridContainerService implements IHybridContainerService {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.browser.IHybridContainerService
    public final void Uu() {
        SparkContext sparkContext;
        InterfaceC40159FpT LJIILL;
        Iterator<Map.Entry<String, WeakReference<SparkContext>>> it = C30874C9u.LIZ.entrySet().iterator();
        while (it.hasNext()) {
            WeakReference<SparkContext> value = it.next().getValue();
            if (value != null && (sparkContext = value.get()) != null && (LJIILL = sparkContext.LJIILL()) != null) {
                LJIILL.close();
            }
        }
        C30874C9u.LIZ.clear();
    }

    @Override // com.bytedance.android.live.browser.IHybridContainerService
    public final SparkContext Vs0(Context context, String schema, InterfaceC88472Yns<? super SparkContext, C76800UCe> interfaceC88472Yns) {
        ActivityC45651qj LIZ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(schema, "schema");
        SparkContext LIZIZ = C42193GhB.LIZIZ(C29706BlG.LIZIZ(schema));
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(LIZIZ);
        }
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        if (!(context instanceof MutableContextWrapper) && (LIZ = C29306Beo.LIZ(context)) != null) {
            context = LIZ;
        }
        OKG.LIZLLL(c40342FsQ, context, LIZIZ);
        return LIZIZ;
    }

    @Override // com.bytedance.android.live.browser.IHybridContainerService
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS R70(Context context, String str, String str2, InterfaceC88472Yns<? super SparkContext, C76800UCe> interfaceC88472Yns) {
        InterfaceC60833Nu9 LIZIZ = C60827Nu3.LIZIZ(C58310MuY.LIZIZ, context, C29706BlG.LIZIZ(str), str2);
        if (LIZIZ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) LIZIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext() != null) {
                SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext();
                o.LJI(sparkContext);
                interfaceC88472Yns.invoke(sparkContext);
            }
            return (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) LIZIZ;
        }
        C37724ErI.LIZIZ.getClass();
        InterfaceC60833Nu9 LIZIZ2 = C60828Nu4.LIZIZ(context, str, str2, null);
        if (!(LIZIZ2 instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS)) {
            return null;
        }
        return (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) LIZIZ2;
    }

    @Override // com.bytedance.android.live.browser.IHybridContainerService
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS cZ(Context context, String schema, boolean z, InterfaceC88472Yns<? super SparkContext, C76800UCe> interfaceC88472Yns) {
        ActivityC45651qj LIZ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(schema, "schema");
        SparkContext LIZIZ = C42193GhB.LIZIZ(C29706BlG.LIZIZ(schema));
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(LIZIZ);
        }
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        if (!(context instanceof MutableContextWrapper) && (LIZ = C29306Beo.LIZ(context)) != null) {
            context = LIZ;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZJ = KMP.LIZJ(c40342FsQ, context, LIZIZ);
        if (z) {
            LIZJ.LIZIZ();
        }
        return LIZJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r2 != null) goto L16;
     */
    @Override // com.bytedance.android.live.browser.IHybridContainerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS Lm0(android.content.Context r7, java.lang.String r8, java.lang.String r9, boolean r10, X.InterfaceC88471Ynr<? super com.bytedance.hybrid.spark.SparkContext, ? super java.lang.Integer, X.C76800UCe> r11) {
        /*
            r6 = this;
            java.lang.String r0 = "schema"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r5 = X.C29706BlG.LIZIZ(r8)
            r4 = 0
            if (r9 == 0) goto L4b
            int r0 = r9.length()
            if (r0 <= 0) goto L4b
            r0 = 1
            r3 = 0
            if (r0 == 0) goto L4b
            X.Nu3 r1 = X.C58310MuY.LIZIZ
            r0 = 24
            X.Nu7 r2 = X.C60827Nu3.LIZLLL(r1, r7, r5, r9, r0)
            boolean r0 = r2 instanceof X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS
            if (r0 == 0) goto L26
            X.NtS r2 = (X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) r2
            if (r2 != 0) goto L37
        L26:
            X.Nu4 r0 = X.C37724ErI.LIZIZ
            r0.getClass()
            X.Nu9 r2 = X.C60828Nu4.LIZIZ(r7, r5, r9, r3)
            boolean r0 = r2 instanceof X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS
            if (r0 == 0) goto L4b
            X.NtS r2 = (X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) r2
            if (r2 == 0) goto L4b
        L37:
            com.bytedance.hybrid.spark.SparkContext r1 = r2.getSparkContext()
            if (r1 == 0) goto L4b
            if (r11 == 0) goto L4a
            int r0 = r2.getOptimization()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.invoke(r1, r0)
        L4a:
            return r2
        L4b:
            com.bytedance.hybrid.spark.SparkContext r3 = X.C42193GhB.LIZIZ(r5)
            if (r11 == 0) goto L58
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r11.invoke(r3, r0)
        L58:
            X.FsQ r2 = X.C40343FsR.LJIILJJIL
            boolean r0 = r7 instanceof android.content.MutableContextWrapper
            if (r0 == 0) goto L68
        L5e:
            X.NtS r0 = X.KMP.LIZJ(r2, r7, r3)
            if (r10 == 0) goto L67
            r0.LIZIZ()
        L67:
            return r0
        L68:
            android.content.MutableContextWrapper r1 = new android.content.MutableContextWrapper
            X.1qj r0 = X.C29306Beo.LIZ(r7)
            if (r0 == 0) goto L71
            r7 = r0
        L71:
            r1.<init>(r7)
            r7 = r1
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.module.HybridContainerService.Lm0(android.content.Context, java.lang.String, java.lang.String, boolean, X.Ynr):X.NtS");
    }

    @Override // com.bytedance.android.live.browser.IHybridContainerService
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS ti0(Context context, String str, boolean z, boolean z2, InterfaceC88472Yns<? super SparkContext, C76800UCe> interfaceC88472Yns) {
        C29714BlO LIZ = C29715BlP.LIZ(str);
        LIZ.LJI(z);
        String uri = LIZ.LIZ().toString();
        o.LJIIIIZZ(uri, "SparkSchemaBuilder.useWe…)\n            .toString()");
        return cZ(context, uri, z2, interfaceC88472Yns);
    }

    @Override // com.bytedance.android.live.browser.IHybridContainerService
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS Si0(Context context, String str, String str2, boolean z, boolean z2, InterfaceC88472Yns<? super SparkContext, C76800UCe> interfaceC88472Yns) {
        C29714BlO c29714BlO = new C29714BlO();
        c29714BlO.LJII(str);
        c29714BlO.LIZIZ.authority("lynxview");
        if (str2 != null && str2.length() != 0) {
            c29714BlO.LJFF(str2);
        }
        c29714BlO.LJI(z);
        String uri = c29714BlO.LIZ().toString();
        o.LJIIIIZZ(uri, "SparkSchemaBuilder.useLy…)\n            .toString()");
        return cZ(context, uri, z2, interfaceC88472Yns);
    }
}
