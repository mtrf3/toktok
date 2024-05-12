package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveForceRefreshRateSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencyPeriodIntervalSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CHK implements CHP {
    public final String LIZ;
    public final int LIZIZ;
    public final InterfaceC31062CHa LIZJ;
    public boolean LIZLLL;
    public final CHP LJ;
    public double LJFF;
    public JSONObject LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public long LJIIIZ;
    public CHO LJIIJ;
    public final java.util.Map<String, String> LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public final int LJIILJJIL;
    public OSZ<Float, Float> LJIILL;
    public java.util.Map<String, String> LJIILLIIL;
    public InterfaceC65784Pro<? extends java.util.Map<String, String>> LJIIZILJ;
    public final C62822Ol8 LJIJ;

    @Override // X.CHP
    public final void LIZ(CHZ chz) {
    }

    @Override // X.CHP
    public final void LIZIZ(CHY chy) {
    }

    @Override // X.CHP
    public final void stop() {
        int value;
        CGV cgv;
        this.LJIIIIZZ = false;
        long currentTimeMillis = System.currentTimeMillis();
        this.LJIILIIL = currentTimeMillis;
        if (this.LIZLLL && (value = (int) (((currentTimeMillis - this.LJIIL) + ((int) LiveFluencyPeriodIntervalSetting.INSTANCE.getValue())) / 1000)) > 0 && (cgv = C88207Yjb.LJIIIZ) != null) {
            this.LJIILL = cgv.LIZ(value);
        }
        this.LJ.stop();
    }

    @Override // X.CHP
    public final void start() {
        if (((Number) this.LJIJ.getValue()).longValue() % this.LIZIZ != 0) {
            return;
        }
        this.LJIIL = System.currentTimeMillis();
        this.LJ.start();
        this.LJIIIIZZ = true;
    }

    public final void LIZJ(boolean z) {
        Integer num;
        Integer num2;
        long currentTimeMillis = System.currentTimeMillis();
        this.LJIILIIL = currentTimeMillis;
        JSONObject jSONObject = this.LJI;
        if (jSONObject != null) {
            float f = 1000;
            float f2 = (((float) (currentTimeMillis - this.LJIIL)) * this.LJIILJJIL) / f;
            Iterator<String> keys = jSONObject.keys();
            o.LJIIIIZZ(keys, "dropFrames.keys()");
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (keys.hasNext()) {
                String key = keys.next();
                int optInt = jSONObject.optInt(key);
                o.LJIIIIZZ(key, "key");
                Integer LJJIL = C38350F3i.LJJIL(key);
                if (LJJIL != null) {
                    int intValue = LJJIL.intValue();
                    if (3 <= intValue) {
                        if (intValue < 7) {
                            i5 += optInt;
                            i6 += intValue * optInt;
                        } else if (7 <= intValue) {
                            if (intValue < 16) {
                                i7 += optInt;
                                i8 += intValue * optInt;
                            } else if (16 <= intValue) {
                                if (intValue < 25) {
                                    i9 += optInt;
                                    i10 += intValue * optInt;
                                } else if (25 <= intValue) {
                                    if (intValue < 41) {
                                        i11 += optInt;
                                        i += intValue * optInt;
                                    } else {
                                        i12 += optInt;
                                        i4 += intValue * optInt;
                                    }
                                }
                            }
                        }
                    }
                    i3 += optInt;
                    i2 = C0EH.LIZ(intValue, 1, optInt, i2);
                }
            }
            float f3 = i2;
            if (f3 > f2) {
                f2 = f3;
            }
            float min = Math.min(f3 / f2, 1.0f);
            C31014CFe.LIZLLL.put("fps", String.valueOf(this.LJFF));
            BZI LIZ = C28787BRn.LIZ("livesdk_fluency");
            LIZ.LJIIZILJ();
            Room LJJIL2 = C29306Beo.LJJIL(DataChannelGlobal.LJLJJI);
            java.util.Map<String, String> map = null;
            if (LJJIL2 != null) {
                InterfaceC31062CHa interfaceC31062CHa = this.LIZJ;
                if (interfaceC31062CHa != null) {
                    num = Integer.valueOf(interfaceC31062CHa.u4(LJJIL2.getId()));
                } else {
                    num = null;
                }
                LIZ.LJIJJ(num, "server_heat_level");
                InterfaceC31062CHa interfaceC31062CHa2 = this.LIZJ;
                if (interfaceC31062CHa2 != null) {
                    num2 = Integer.valueOf(interfaceC31062CHa2.F(LJJIL2.getId()));
                } else {
                    num2 = null;
                }
                LIZ.LJIJJ(num2, "client_heat_level");
            }
            OSZ<Float, Float> osz = this.LJIILL;
            if (osz != null) {
                LIZ.LJIL("avg_qps", osz.getFirst());
                LIZ.LJIL("max_qps", osz.getSecond());
            }
            LIZ.LJIJJ(this.LIZ, WM7.SCENE_SERVICE);
            LIZ.LJIJJ(Integer.valueOf(i5), "drop_3");
            LIZ.LJIJJ(Integer.valueOf(i7), "drop_7");
            LIZ.LJIJJ(Integer.valueOf(i9), "drop_16");
            LIZ.LJIJJ(Integer.valueOf(i11), "drop_25");
            LIZ.LJIJJ(Integer.valueOf(i12), "drop_41");
            LIZ.LJIL("ui_drawing_dur_proportion", Float.valueOf(min));
            if (!z) {
                LIZ.LJIJJLI("fps", Double.valueOf(this.LJFF));
                LIZ.LJIL("drop_3_duration_ratio", Float.valueOf((((((i6 + i8) + i10) + i) + i4) / f3) * f));
                LIZ.LJIL("drop_3_7_duration_ratio", Float.valueOf((i6 / f3) * f));
                LIZ.LJIL("drop_7_16_duration_ratio", Float.valueOf((i8 / f3) * f));
                LIZ.LJIL("drop_16_25_duration_ratio", Float.valueOf((i10 / f3) * f));
                LIZ.LJIL("drop_25_41_duration_ratio", Float.valueOf((i / f3) * f));
                LIZ.LJIL("drop_41_duration_ratio", Float.valueOf((i4 / f3) * f));
            }
            double d = this.LJFF;
            double d2 = this.LJIILJJIL;
            LIZ.LJIJJLI("fps_total_sampling_android", Double.valueOf(((d - d2) * min) + d2));
            LIZ.LJIL("drop_3_duration_ratio_total_sampling_android", Float.valueOf((((((i6 + i8) + i10) + i) + i4) / f2) * f));
            LIZ.LJIL("drop_3_7_duration_ratio_total_sampling_android", Float.valueOf((i6 / f2) * f));
            LIZ.LJIL("drop_7_16_duration_ratio_total_sampling_android", Float.valueOf((i8 / f2) * f));
            LIZ.LJIL("drop_16_25_duration_ratio_total_sampling_android", Float.valueOf((i10 / f2) * f));
            LIZ.LJIL("drop_25_41_duration_ratio_total_sampling_android", Float.valueOf((i / f2) * f));
            LIZ.LJIL("drop_41_duration_ratio_total_sampling_android", Float.valueOf((i4 / f2) * f));
            LIZ.LJIJJ(Integer.valueOf(i3), "drop_total");
            LIZ.LJIJJ(Long.valueOf(this.LJIIIZ), "gift_id");
            LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(this.LJII)) ? 1 : 0), "is_anchor");
            LIZ.LJJIFFI(C04510Fr.LIZ);
            CHO cho = this.LJIIJ;
            if (cho != null) {
                if (!TextUtils.isEmpty(cho.LJLILLLLZI)) {
                    this.LJIIJJI.put("rank_anim_name", cho.LJLILLLLZI);
                }
                int i13 = cho.LJLIL;
                if (i13 != -1) {
                    this.LJIIJJI.put("rank_type", String.valueOf(i13));
                }
            }
            LIZ.LJJIFFI(this.LJIIJJI);
            LIZ.LJJIFFI(this.LJIILLIIL);
            InterfaceC65784Pro<? extends java.util.Map<String, String>> interfaceC65784Pro = this.LJIIZILJ;
            if (interfaceC65784Pro != null) {
                map = interfaceC65784Pro.invoke();
            }
            LIZ.LJJIFFI(map);
            JSONArray jSONArray = new JSONArray();
            JSONObject LIZJ = C65232Piu.LIZJ("metric_name", "fps");
            LIZJ.put("start_time", this.LJIIL);
            LIZJ.put("end_time", this.LJIILIIL);
            jSONArray.put(LIZJ);
            LIZ.LJIJJ(jSONArray.toString(), "metric_extra");
            LIZ.LJJIIJZLJL();
        }
    }

    public CHK(String scene, int i, InterfaceC31062CHa interfaceC31062CHa, int i2) {
        interfaceC31062CHa = (i2 & 4) != 0 ? null : interfaceC31062CHa;
        o.LJIIIZ(scene, "scene");
        this.LIZ = scene;
        this.LIZIZ = i;
        this.LIZJ = interfaceC31062CHa;
        this.LIZLLL = false;
        IHostPerformanceMonitor iHostPerformanceMonitor = (IHostPerformanceMonitor) CN1.LIZ(IHostPerformanceMonitor.class);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("live_fluency_");
        LIZ.append(scene);
        PMC IW = iHostPerformanceMonitor.IW(X1D.LIZIZ(LIZ));
        this.LJ = IW;
        this.LJIIJJI = new LinkedHashMap();
        this.LJIILJJIL = 60;
        this.LJIJ = C221108m2.LIZIZ(C28191B4p.LJLIL);
        IW.LIZ(new CHS(this));
        IW.LIZIZ(new CHR(this));
        IW.LIZLLL(new CHN(this));
        if (!LiveForceRefreshRateSetting.INSTANCE.getValue()) {
            this.LJIILJJIL = PMC.LIZJ();
        }
    }
}
