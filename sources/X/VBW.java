package X;

import android.os.Bundle;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.texturerender.VideoSurface;
import com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VBW extends BaseSmartStrategy {
    public static volatile VBW LJJI;
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public Handler LIZLLL;
    public final List<Integer> LJ = new ArrayList();
    public int LJFF = 5000;
    public boolean LJI = false;
    public final List<VideoSurface> LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public double LJIIJ;
    public double LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public double LJIILJJIL;
    public double LJIILL;
    public double LJIILLIIL;
    public long LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public final List<Integer> LJIL;
    public int LJJ;

    public static VBW LIZIZ() {
        if (LJJI == null) {
            synchronized (VBW.class) {
                if (LJJI == null) {
                    LJJI = new VBW();
                }
            }
        }
        return LJJI;
    }

    public final void LIZ() {
        int i;
        if (this.LJIIZILJ != -1 && System.currentTimeMillis() - this.LJIIZILJ <= this.LJFF) {
            this.LJIJ = this.LJIJI;
            if (!((CopyOnWriteArrayList) this.LJII).isEmpty()) {
                Iterator it = ((CopyOnWriteArrayList) this.LJII).iterator();
                while (it.hasNext()) {
                    VideoSurface videoSurface = (VideoSurface) it.next();
                    if (videoSurface != null) {
                        if (this.LJIJ != 0) {
                            videoSurface.LJJIIJ(1);
                        } else {
                            videoSurface.LJJIIJ(0);
                        }
                    }
                }
            }
        } else {
            this.LJIIZILJ = System.currentTimeMillis();
            JSONObject runStrategy = runStrategy();
            if (runStrategy != null) {
                if (runStrategy.has("enable_sr")) {
                    i = runStrategy.optInt("enable_sr");
                } else {
                    i = 1;
                }
                uploadPredictValue(runStrategy);
            } else {
                i = 1;
            }
            if (!((CopyOnWriteArrayList) this.LJII).isEmpty()) {
                Iterator it2 = ((CopyOnWriteArrayList) this.LJII).iterator();
                while (it2.hasNext()) {
                    VideoSurface videoSurface2 = (VideoSurface) it2.next();
                    if (this.LJJ == 1 && i != 0) {
                        videoSurface2.LJJIIJ(i);
                    } else {
                        videoSurface2.LJJIIJ(0);
                    }
                }
            }
            this.LJIJ = i;
        }
        if (!((ArrayList) this.LJIL).isEmpty()) {
            this.LIZLLL.sendEmptyMessageDelayed(1025, ((Integer) ListProtector.get(this.LJIL, 0)).intValue());
            ListProtector.remove(this.LJIL, 0);
        }
    }

    public final void LIZJ() {
        JSONObject jSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject;
        boolean z;
        C79357VCn c79357VCn = this.mStrategyConfigInfo;
        if (c79357VCn == null || (jSONObject = c79357VCn.LJI) == null) {
            return;
        }
        try {
            this.LIZ = jSONObject.optInt("EnableSRAysncInit", 0);
            this.LIZIZ = this.mStrategyConfigInfo.LJI.optInt("EnableDynamicSR", 0);
            if (this.LIZ == 1 && (optJSONObject = this.mStrategyConfigInfo.LJI.optJSONObject("SRAysncInitConfig")) != null) {
                int optInt = optJSONObject.optInt("ShorterSideUpperBound", 1300);
                int optInt2 = optJSONObject.optInt("LongerSideUpperBound", 750);
                int optInt3 = optJSONObject.optInt("SRAlgType", 0);
                this.LJIJJ = optInt3;
                int optInt4 = optJSONObject.optInt("OpenMaliSync", 1);
                int optInt5 = optJSONObject.optInt("EnableBMFSR");
                int optInt6 = optJSONObject.optInt("BMFSRBackEnd");
                int optInt7 = optJSONObject.optInt("BMFSRScaleType");
                int optInt8 = optJSONObject.optInt("BMFSRPoolSize");
                String str = (String) C79346VCc.LIZLLL().LIZ("live_stream_strategy_sr_kernal_bin_path", LiveGiftNewGifterBadgeSetting.DEFAULT);
                Bundle bundle = new Bundle();
                bundle.putInt("effect_type", 5);
                bundle.putInt("action", 21);
                bundle.putInt("srAlgType", optInt3);
                bundle.putInt("srMaxSizeWidth", optInt);
                bundle.putInt("srMaxSizeHeight", optInt2);
                bundle.putString("kernelBinPath", str);
                bundle.putString("oclModleName", "test");
                bundle.putString("dspModleName", "test");
                if (optInt4 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                bundle.putBoolean("srIsMaliSync", z);
                bundle.putInt("enable_bmf", optInt5);
                if (optInt5 == 1) {
                    bundle.putInt("sr_backend", optInt6);
                    bundle.putInt("scale_type", optInt7);
                    bundle.putInt("pool_size", optInt8);
                    bundle.putString("programCacheDir", str);
                }
            }
            if (this.LIZIZ == 1) {
                this.mStrategyConfigInfo.LJI.optInt("EnableSRPredictAlgorithum", 0);
                this.LJIIJJI = this.mStrategyConfigInfo.LJI.optDouble("GpuUsageThres", -1.0d);
                this.LJIIJ = this.mStrategyConfigInfo.LJI.optDouble("CpuRateThres", -1.0d);
                this.LJIIL = this.mStrategyConfigInfo.LJI.optLong("AvaliableMemThres", -1L);
                this.LJIILIIL = this.mStrategyConfigInfo.LJI.optLong("TotalMemThres", -1L);
                this.LJIILJJIL = this.mStrategyConfigInfo.LJI.optDouble("BatteryLevelThres", -1.0d);
                this.LJIILL = this.mStrategyConfigInfo.LJI.optDouble("TemperatureThres", -1.0d);
                this.LJIILLIIL = this.mStrategyConfigInfo.LJI.optDouble("FpsThres", -1.0d);
                if (this.mStrategyConfigInfo.LJI.has("PredictTimeList") && (optJSONArray = this.mStrategyConfigInfo.LJI.optJSONArray("PredictTimeList")) != null) {
                    if (!((ArrayList) this.LJ).isEmpty()) {
                        ((ArrayList) this.LJ).clear();
                    }
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        ((ArrayList) this.LJ).add(Integer.valueOf(JSONArrayProtectorUtils.getInt(optJSONArray, i)));
                    }
                }
                this.LJFF = this.mStrategyConfigInfo.LJI.optInt("PredictMinInterval", 20000);
            }
            this.LIZJ = this.mStrategyConfigInfo.LJI.optInt("ScreenResControl", 0);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        this.LJI = true;
    }

    public VBW() {
        new C38891FOd();
        this.LJII = new CopyOnWriteArrayList();
        this.LJIIIIZZ = -1;
        this.LJIIIZ = -1;
        this.LJIIJ = -1.0d;
        this.LJIIJJI = -1.0d;
        this.LJIIL = -1L;
        this.LJIILIIL = -1L;
        this.LJIILJJIL = -1.0d;
        this.LJIILL = -1.0d;
        this.LJIILLIIL = -1.0d;
        this.LJIIZILJ = -1L;
        this.LJIJ = -1;
        this.LJIJI = -1;
        this.LJIJJ = 0;
        this.LJIJJLI = 0;
        this.LJIL = new ArrayList();
        this.LJJ = -1;
        this.mStrategyName = "live_stream_strategy_super_resolution";
        C79357VCn c79357VCn = this.mStrategyConfigInfo;
        if (c79357VCn != null) {
            c79357VCn.LIZ = "live_stream_strategy_super_resolution";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0169  */
    @Override // com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject runLocalStrategy(org.json.JSONObject r31) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VBW.runLocalStrategy(org.json.JSONObject):org.json.JSONObject");
    }
}
