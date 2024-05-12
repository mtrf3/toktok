package X;

import android.view.Surface;
import com.bytedance.android.live.base.service.IHostMonitorAndLog;
import com.bytedance.android.livesdk.livesetting.performance.degrade.PullStreamDownOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.previewlive.LivePreviewCardResourceOpt;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VBU implements InterfaceC48269Iwz {
    public C79334VBq LIZ;
    public VBG LIZIZ;
    public final C78429UqH LIZJ;

    public final void LIZJ() {
        VBG vbg = this.LIZIZ;
        if (vbg != null) {
            B4I.LIZ("LivePlayController", "player callback onFirstFrame()");
            BQ5 bq5 = ((C79340VBw) vbg).LJZ;
            if (bq5 instanceof BQF) {
                try {
                    ((BQF) bq5).LJI();
                } catch (Exception unused) {
                }
            }
        }
        LIZ(EnumC79337VBt.RENDERING_START, 0, "player start render");
    }

    public VBU(C78429UqH c78429UqH) {
        this.LIZJ = c78429UqH;
    }

    public final void LIZIZ(C48315Ixj c48315Ixj) {
        HashMap hashMap;
        EnumC79337VBt enumC79337VBt;
        if (c48315Ixj != null) {
            Gson gson = C09650Zl.LIZJ;
            if (c48315Ixj.info == null) {
                hashMap = new HashMap(2);
            } else {
                hashMap = new HashMap(c48315Ixj.info);
            }
            hashMap.put("error_code", String.valueOf(c48315Ixj.code));
            if (c48315Ixj.code != 0) {
                enumC79337VBt = EnumC79337VBt.PREPARE_FAILED;
            } else {
                enumC79337VBt = EnumC79337VBt.MEDIA_ERROR;
            }
            hashMap.put("error_description", enumC79337VBt.name());
            String json = GsonProtectorUtils.toJson(gson, hashMap);
            int i = c48315Ixj.code;
            if (i != 0) {
                EnumC79337VBt enumC79337VBt2 = EnumC79337VBt.PREPARE_FAILED;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("prepare failed.code:");
                LIZ.append(c48315Ixj.code);
                LIZ(enumC79337VBt2, i, X1D.LIZIZ(LIZ));
            }
            LIZ(EnumC79337VBt.MEDIA_ERROR, c48315Ixj.code, json);
        }
    }

    public final void LJ(String str) {
        PullStreamDownOptSetting pullStreamDownOptSetting = PullStreamDownOptSetting.INSTANCE;
        if (!pullStreamDownOptSetting.isDowngradeALog() && !pullStreamDownOptSetting.isDowngradeAll()) {
            C0NB.LIZIZ("TTLivePlayerReportALog", str);
        }
    }

    public final void LJFF(Surface surface) {
        C79334VBq c79334VBq = this.LIZ;
        if (c79334VBq == null) {
            return;
        }
        EnumC79337VBt enumC79337VBt = EnumC79337VBt.TEXTURE_RENDER_DRAW_FRAME;
        if (c79334VBq.LJIJJ(enumC79337VBt)) {
            this.LIZ.LJJJJJL(enumC79337VBt, 0, surface);
        }
    }

    public final void LIZLLL(String str, JSONObject jSONObject) {
        boolean z;
        String str2;
        BQ7 bq7;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("player==>liveLogSender==null is ");
        if (this.LIZJ == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        C0NB.LIZIZ("LiveAppBundleUtils", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("player==>player info ");
        if (jSONObject == null) {
            str2 = "event is null";
        } else {
            str2 = "event is not null";
        }
        C31811Ce7.LJ(LIZ2, str2, LIZ2, "LiveAppBundleUtils");
        if (this.LIZJ != null) {
            C0NB.LIZIZ("PlayerLogger", jSONObject.optString("event_key"));
            C79340VBw c79340VBw = (C79340VBw) this.LIZJ.LIZ;
            c79340VBw.getClass();
            if (!LivePreviewCardResourceOpt.INSTANCE.isOpt()) {
                c79340VBw.LJJLI(jSONObject);
            }
            PullStreamDownOptSetting pullStreamDownOptSetting = PullStreamDownOptSetting.INSTANCE;
            if (!pullStreamDownOptSetting.isDowngradeAll() && !pullStreamDownOptSetting.isDowngradeAppMonitor()) {
                SoftReference<BQ7> softReference = c79340VBw.LLD;
                if (softReference == null || (bq7 = softReference.get()) == null) {
                    c79340VBw.LL.LIZ(str, jSONObject);
                } else {
                    bq7.LIZ(str, jSONObject);
                }
            }
            InterfaceC28641BLx interfaceC28641BLx = c79340VBw.LLIIIL;
            if (interfaceC28641BLx != null) {
                interfaceC28641BLx.LIZ(jSONObject);
            }
            try {
                if ("live_client_monitor_log".equals(str) && "playing".equals(jSONObject.optString("event_key"))) {
                    ((IHostMonitorAndLog) CN1.LIZ(IHostMonitorAndLog.class)).qa0(jSONObject);
                }
            } catch (Exception e) {
                C0NB.LJI("LivePlayController", e);
            }
        }
    }

    public final void LIZ(EnumC79337VBt enumC79337VBt, int i, String str) {
        C79334VBq c79334VBq = this.LIZ;
        if (c79334VBq == null) {
            return;
        }
        c79334VBq.LJJJJJL(enumC79337VBt, i, str);
    }
}
