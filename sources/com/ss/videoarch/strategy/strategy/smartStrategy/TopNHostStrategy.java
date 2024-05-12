package com.ss.videoarch.strategy.strategy.smartStrategy;

import X.C16880lQ;
import X.C79326VBi;
import X.C79346VCc;
import X.C79357VCn;
import X.C79364VCu;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class TopNHostStrategy extends BaseSmartStrategy {
    public static volatile TopNHostStrategy LJI;
    public final C79364VCu LIZIZ;
    public final Map<String, Integer> LIZ = new ConcurrentHashMap();
    public long LIZJ = 0;
    public boolean LIZLLL = false;
    public final int LJ = -1;
    public int LJFF = 0;

    private native void nativeAddDomainUsedCount(String str, int i);

    private native void nativeClearRecords();

    private native String nativeRunStrategy();

    public static TopNHostStrategy LIZJ() {
        if (LJI == null) {
            synchronized (TopNHostStrategy.class) {
                if (LJI == null) {
                    LJI = new TopNHostStrategy();
                }
            }
        }
        return LJI;
    }

    public TopNHostStrategy() {
        this.mStrategyName = "live_stream_strategy_topn_host";
        C79357VCn c79357VCn = this.mStrategyConfigInfo;
        if (c79357VCn != null) {
            c79357VCn.LIZ = "live_stream_strategy_topn_host";
        }
        this.mProjectKey = "2";
        this.LIZIZ = new C79364VCu();
    }

    public final void LIZIZ() {
        if (C79346VCc.LIZLLL().LJJIJLIJ == 1) {
            if (C79326VBi.LIZ()) {
                nativeClearRecords();
            }
        } else {
            ((ConcurrentHashMap) this.LIZ).clear();
            this.LIZLLL = true;
        }
    }

    @Override // com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy
    public final JSONObject runStrategy() {
        if (C79346VCc.LIZLLL().LJJIJLIJ == 1) {
            JSONObject jSONObject = null;
            if (!C79326VBi.LIZ()) {
                return null;
            }
            String nativeRunStrategy = nativeRunStrategy();
            if (TextUtils.isEmpty(nativeRunStrategy) || Objects.equals(nativeRunStrategy, LiveGiftNewGifterBadgeSetting.DEFAULT)) {
                return null;
            }
            try {
                jSONObject = new JSONObject(nativeRunStrategy);
                return jSONObject;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return jSONObject;
            }
        }
        return super.runStrategy();
    }

    public static Set LIZLLL(JSONObject jSONObject) {
        JSONArray optJSONArray;
        if (jSONObject == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (jSONObject.has("host_name") && (optJSONArray = jSONObject.optJSONArray("host_name")) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                hashSet.add(optJSONArray.optString(i));
            }
        }
        return hashSet;
    }

    public final void LIZ(String str) {
        Integer num;
        int i = 1;
        if (C79346VCc.LIZLLL().LJJIJLIJ == 1) {
            if (C79326VBi.LIZ()) {
                nativeAddDomainUsedCount(str, 1);
            }
        } else {
            if (((ConcurrentHashMap) this.LIZ).containsKey(str) && (num = (Integer) ((ConcurrentHashMap) this.LIZ).get(str)) != null) {
                i = 1 + num.intValue();
            }
            ((ConcurrentHashMap) this.LIZ).put(str, Integer.valueOf(i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x010c, code lost:
    
        if (r10 != null) goto L66;
     */
    @Override // com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject runLocalStrategy(org.json.JSONObject r19) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.strategy.strategy.smartStrategy.TopNHostStrategy.runLocalStrategy(org.json.JSONObject):org.json.JSONObject");
    }

    @Override // com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy
    public final JSONObject runSmartStrategy(JSONObject jSONObject) {
        if (C79346VCc.LIZLLL().LJJIJLIJ == 1) {
            return null;
        }
        return super.runSmartStrategy(jSONObject);
    }
}
