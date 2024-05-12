package X;

import com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VCd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79347VCd extends BaseSmartStrategy {
    public static volatile C79347VCd LIZIZ;
    public boolean LIZ = true;

    public static C79347VCd LIZ() {
        if (LIZIZ == null) {
            synchronized (C79347VCd.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C79347VCd();
                }
            }
        }
        return LIZIZ;
    }

    public C79347VCd() {
        this.mStrategyName = "live_stream_strategy_first_play_time_predict";
        this.mProjectKey = "2";
        C79357VCn c79357VCn = this.mStrategyConfigInfo;
        if (c79357VCn != null) {
            c79357VCn.LIZ = "live_stream_strategy_first_play_time_predict";
            c79357VCn.LJIIJ = new JSONArray().put("PLAY-FirstStartTime").put("PLAY-FirstStartTimeStamp").put("USER-FeaturesBundle").put("NETWORK-NetworkLevel").put("DEVICE-Battery");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(long r11) {
        /*
            r10 = this;
            java.lang.String r0 = r10.mStrategyName
            r9 = 0
            int r0 = r10.getEnableStrategy(r0, r9)
            r4 = 1
            if (r0 == r4) goto Lb
            return
        Lb:
            r8 = 0
            r2 = -1
            int r7 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r7 == 0) goto L26
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1e
            r1.<init>()     // Catch: org.json.JSONException -> L1e
            java.lang.String r0 = "result"
            org.json.JSONObject r0 = r1.put(r0, r11)     // Catch: org.json.JSONException -> L1e
            goto L23
        L1e:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            r0 = r8
        L23:
            r10.uploadGroundTruth(r0)
        L26:
            X.VCc r0 = X.C79346VCc.LIZLLL()
            X.VCy r0 = r0.LJIILIIL
            int r0 = r0.LJII
            if (r0 == r4) goto L31
            return
        L31:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            X.VCd r0 = LIZ()
            java.lang.String r0 = r0.mStrategyName
            r1.append(r0)
            java.lang.String r4 = "_data"
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.VCv r5 = X.C79353VCj.LJJLIIIIJ(r0)
            java.lang.String r6 = ""
            if (r5 == 0) goto L63
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L57
            java.lang.String r0 = r5.LIZIZ     // Catch: org.json.JSONException -> L57
            r1.<init>(r0)     // Catch: org.json.JSONException -> L57
            r8 = r1
        L57:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L63
            java.lang.String r0 = r5.LIZJ     // Catch: org.json.JSONException -> L63
            r1.<init>(r0)     // Catch: org.json.JSONException -> L63
            java.lang.String r5 = r1.toString()     // Catch: org.json.JSONException -> L63
            goto L64
        L63:
            r5 = r6
        L64:
            if (r7 == 0) goto L9f
            if (r8 != 0) goto L81
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            r6 = 0
        L6e:
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch: org.json.JSONException -> L7d
            r0 = -1
            r8.put(r1, r0)     // Catch: org.json.JSONException -> L7d
            int r6 = r6 + 1
            r0 = 10
            if (r6 >= r0) goto L81
            goto L6e
        L7d:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L81:
            r7 = 9
        L83:
            java.lang.String r6 = java.lang.String.valueOf(r7)     // Catch: org.json.JSONException -> La2
            int r7 = r7 + (-1)
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch: org.json.JSONException -> La2
            long r0 = r8.optLong(r0, r2)     // Catch: org.json.JSONException -> La2
            r8.put(r6, r0)     // Catch: org.json.JSONException -> La2
            if (r7 <= 0) goto L97
            goto L83
        L97:
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch: org.json.JSONException -> La2
            r8.put(r0, r11)     // Catch: org.json.JSONException -> La2
            goto La6
        L9f:
            if (r8 == 0) goto Laa
            goto La6
        La2:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        La6:
            java.lang.String r6 = r8.toString()
        Laa:
            org.json.JSONObject r0 = r10.mStrategyResult
            if (r0 == 0) goto Lb2
            java.lang.String r5 = r0.toString()
        Lb2:
            X.VCv r3 = new X.VCv
            r3.<init>()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r10.mStrategyName
            java.lang.String r0 = X.JBR.LJFF(r1, r0, r4, r1)
            r3.LIZ = r0
            r3.LIZIZ = r6
            r3.LIZJ = r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r3)
            X.C79353VCj.LJJL(r0)
            java.util.Map<java.lang.String, X.VCv> r2 = X.C79353VCj.LJLLLLLL
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r10.mStrategyName
            java.lang.String r0 = X.JBR.LJFF(r1, r0, r4, r1)
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            r2.put(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79347VCd.LIZIZ(long):void");
    }

    @Override // com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy
    public final JSONObject runLocalStrategy(JSONObject jSONObject) {
        JSONObject jSONObject2 = this.mStrategyResult;
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        JSONObject jSONObject3 = new JSONObject();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZ().mStrategyName);
        LIZ.append("_data");
        C79365VCv LJJLIIIIJ = C79353VCj.LJJLIIIIJ(X1D.LIZIZ(LIZ));
        if (LJJLIIIIJ != null) {
            try {
                return new JSONObject(LJJLIIIIJ.LIZJ);
            } catch (JSONException unused) {
                return jSONObject3;
            }
        }
        return jSONObject3;
    }
}
