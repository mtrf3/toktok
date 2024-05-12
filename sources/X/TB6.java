package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TB6 implements InterfaceC49103JOx {
    public static final TB6 LIZ = new TB6();
    public static final HashMap<Integer, TB5> LIZIZ = new HashMap<>();
    public static final C73318Sq2 LIZJ = new C73318Sq2();

    @Override // X.InterfaceC49103JOx
    public final boolean LIZ(long j, String languageCode) {
        o.LJIIIZ(languageCode, "languageCode");
        if (languageCode.length() == 0) {
            return false;
        }
        int LIZIZ2 = LIZIZ(j, languageCode);
        HashMap<Integer, TB5> hashMap = LIZIZ;
        if (hashMap.containsKey(Integer.valueOf(LIZIZ2))) {
            TB5 tb5 = hashMap.get(Integer.valueOf(LIZIZ2));
            if (tb5 != null) {
                if (((Boolean) tb5.LJIIJ.invoke()).booleanValue()) {
                    return true;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return false;
    }

    @Override // X.InterfaceC49103JOx
    public final int LIZIZ(long j, String languageCode) {
        o.LJIIIZ(languageCode, "languageCode");
        return C78841Uwv.LIZ(j ^ languageCode.hashCode()).nextInt();
    }

    @Override // X.InterfaceC49103JOx
    public final TB5 LIZLLL(long j, String languageCode, boolean z) {
        boolean z2;
        o.LJIIIZ(languageCode, "languageCode");
        if (languageCode.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return null;
        }
        int LIZIZ2 = LIZIZ(j, languageCode);
        HashMap<Integer, TB5> hashMap = LIZIZ;
        if (!hashMap.containsKey(Integer.valueOf(LIZIZ2))) {
            return null;
        }
        TB5 tb5 = hashMap.get(Integer.valueOf(LIZIZ2));
        if (tb5 != null) {
            if (!((Boolean) tb5.LJIIJ.invoke()).booleanValue() && !z) {
                return null;
            }
            return hashMap.get(Integer.valueOf(LIZIZ2));
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r1 == null) goto L22;
     */
    @Override // X.InterfaceC49103JOx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(long r17, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, X.C9B2 r23) {
        /*
            r16 = this;
            r9 = r22
            java.lang.String r0 = "languageCode"
            r7 = r21
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            r11 = r17
            r0 = r16
            int r4 = r0.LIZIZ(r11, r7)
            java.util.HashMap<java.lang.Integer, X.TB5> r1 = X.TB6.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = r1.containsKey(r0)
            r10 = r23
            if (r0 == 0) goto L45
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r1.get(r0)
            X.TB5 r1 = (X.TB5) r1
            if (r1 == 0) goto L44
            r1.LIZLLL = r9
            r1.LJ = r10
            kotlin.jvm.internal.AqS162S0100000_12 r0 = r1.LJIIJ
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L44
            X.TB7 r0 = r1.LJ
            if (r0 == 0) goto L44
            r0.LIZIZ(r1)
        L44:
            return
        L45:
            X.TB5 r5 = new X.TB5
            r6 = r19
            r8 = r20
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.put(r0, r5)
            java.lang.String r3 = "empty()"
            com.ss.android.ugc.aweme.translation.api.RealtimeCaptionsTranslationApi$IRealtimeTranslationApi r0 = com.ss.android.ugc.aweme.translation.api.RealtimeCaptionsTranslationApi.LIZ     // Catch: java.util.concurrent.ExecutionException -> L8b
            if (r0 != 0) goto L74
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r2 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.LIZLLL()     // Catch: java.util.concurrent.ExecutionException -> L8b
            java.lang.String r1 = X.EFJ.LIZJ     // Catch: java.util.concurrent.ExecutionException -> L8b
            java.lang.String r0 = "API_URL_PREFIX_SI"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.util.concurrent.ExecutionException -> L8b
            X.38c r1 = r2.create(r1)     // Catch: java.util.concurrent.ExecutionException -> L8b
            java.lang.Class<com.ss.android.ugc.aweme.translation.api.RealtimeCaptionsTranslationApi$IRealtimeTranslationApi> r0 = com.ss.android.ugc.aweme.translation.api.RealtimeCaptionsTranslationApi.IRealtimeTranslationApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.util.concurrent.ExecutionException -> L8b
            com.ss.android.ugc.aweme.translation.api.RealtimeCaptionsTranslationApi$IRealtimeTranslationApi r0 = (com.ss.android.ugc.aweme.translation.api.RealtimeCaptionsTranslationApi.IRealtimeTranslationApi) r0     // Catch: java.util.concurrent.ExecutionException -> L8b
            com.ss.android.ugc.aweme.translation.api.RealtimeCaptionsTranslationApi.LIZ = r0     // Catch: java.util.concurrent.ExecutionException -> L8b
        L74:
            com.ss.android.ugc.aweme.translation.api.RealtimeCaptionsTranslationApi$IRealtimeTranslationApi r10 = com.ss.android.ugc.aweme.translation.api.RealtimeCaptionsTranslationApi.LIZ     // Catch: java.util.concurrent.ExecutionException -> L8b
            if (r10 == 0) goto L85
            if (r9 != 0) goto L7c
            java.lang.String r9 = ""
        L7c:
            r13 = r7
            r14 = r6
            r15 = r9
            X.Svk r1 = r10.getRealtimeSubtitles(r11, r13, r14, r15)     // Catch: java.util.concurrent.ExecutionException -> L8b
            if (r1 != 0) goto L94
        L85:
            X.StY r1 = X.C73536StY.LJLIL     // Catch: java.util.concurrent.ExecutionException -> L8b
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r3)     // Catch: java.util.concurrent.ExecutionException -> L8b
            goto L94
        L8b:
            r0 = move-exception
            X.AbstractC36908Ee8.getCompatibleException(r0)
            X.StY r1 = X.C73536StY.LJLIL
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r3)
        L94:
            X.T0k r0 = X.T16.LIZ()
            X.Sro r1 = r1.LJJL(r0)
            X.T0k r0 = X.T16.LIZ()
            X.SsE r1 = r1.LJJJ(r0)
            X.TB1 r0 = new X.TB1
            r0.<init>(r4)
            X.Sxt r1 = r1.LJJIJL(r0)
            X.T0k r0 = X.C73969T1h.LIZIZ()
            X.SsE r3 = r1.LJJJ(r0)
            Y.AfS20S0001000_12 r2 = new Y.AfS20S0001000_12
            r0 = 2
            r2.<init>(r4, r0)
            Y.AfS20S0001000_12 r1 = new Y.AfS20S0001000_12
            r0 = 3
            r1.<init>(r4, r0)
            X.3kP r1 = r3.LJJJLIIL(r2, r1)
            X.Sq2 r0 = X.TB6.LIZJ
            r0.LIZ(r1)
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TB6.LIZJ(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.9B2):void");
    }
}
