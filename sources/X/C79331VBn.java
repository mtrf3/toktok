package X;

import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.VBn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79331VBn extends BaseSmartStrategy {
    public static volatile C79331VBn LJI;
    public int LIZ = 600;
    public int LIZIZ = 1000;
    public double LIZJ = 0.1d;
    public int LIZLLL = 1000;
    public final int[] LJ = {8, 7, 6, 5, 4, 3, 2};
    public final ConcurrentHashMap<Integer, Pair> LJFF = new ConcurrentHashMap<>();

    public static C79331VBn LIZIZ() {
        if (LJI == null) {
            synchronized (C79331VBn.class) {
                if (LJI == null) {
                    LJI = new C79331VBn();
                }
            }
        }
        return LJI;
    }

    public final void LIZ() {
        int[] iArr;
        JSONObject jSONObject = this.mStrategyConfigInfo.LJI;
        if (jSONObject != null) {
            this.LIZ = jSONObject.optInt("MinStartPlayBuffer", this.LIZ);
            this.LIZIZ = this.mStrategyConfigInfo.LJI.optInt("MaxStartPlayBuffer", this.LIZIZ);
            this.LIZJ = this.mStrategyConfigInfo.LJI.optDouble("AttenuationCoefficient", this.LIZJ);
            this.LIZLLL = this.mStrategyConfigInfo.LJI.optInt("AttenuationTimeOffset", this.LIZLLL);
        }
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        int i = 0;
        double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        while (true) {
            if (i >= this.LJ.length) {
                break;
            }
            d2 += Math.cbrt(8 - r1[i]);
            i++;
        }
        int i2 = this.LIZIZ;
        int i3 = this.LIZ;
        int i4 = i2 - i3;
        int i5 = 1;
        while (true) {
            iArr = this.LJ;
            if (i5 >= iArr.length) {
                break;
            }
            d += Math.cbrt(8 - iArr[i5]);
            int i6 = (int) (((d / d2) * i4) + this.LIZ);
            this.LJFF.put(Integer.valueOf(this.LJ[i5 - 1]), new Pair(Integer.valueOf(i3), Integer.valueOf(i6)));
            i5++;
            i3 = i6;
        }
        if (i5 == iArr.length) {
            this.LJFF.put(Integer.valueOf(this.LJ[i5 - 1]), new Pair(Integer.valueOf(i3), Integer.valueOf(this.LIZIZ)));
        }
    }

    public C79331VBn() {
        new JSONObject();
        this.mStrategyName = "live_stream_strategy_start_play_buffer";
        this.mProjectKey = "2";
        C79357VCn c79357VCn = this.mStrategyConfigInfo;
        if (c79357VCn != null) {
            c79357VCn.LIZ = "live_stream_strategy_start_play_buffer";
            c79357VCn.LJIIJ = new JSONArray().put("NETWORK-NetworkLevel").put("PLAY-RetryTotalCount").put("PLAY-StallTotalCount").put("PLAY-LastRetryTotalCount").put("PLAY-LastStallTotalCount").put("PLAY-LastEndTS");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:14|(1:16)(1:49)|17|(1:19)(1:48)|20|(6:22|(1:26)|27|(1:31)|32|(7:36|37|(1:39)|40|41|42|43))|47|37|(0)|40|41|42|43) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00eb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ec, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    @Override // com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject runLocalStrategy(org.json.JSONObject r13) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79331VBn.runLocalStrategy(org.json.JSONObject):org.json.JSONObject");
    }
}
