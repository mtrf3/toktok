package X;

import Y.ARunnableS0S1201100_13;
import Y.ARunnableS0S1202000_13;
import Y.ARunnableS0S1202100_13;
import Y.ARunnableS0S1301000_13;
import Y.ARunnableS2S1101100_13;
import Y.ARunnableS2S1200100_13;
import Y.ARunnableS3S0401000_13;
import Y.ARunnableS4S1201000_13;
import Y.ARunnableS4S1400000_13;
import Y.ARunnableS5S0301000_4;
import com.bytedance.android.live.base.service.IHostMonitorAndLog;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHotRoomLogOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLogDeepCopySetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveTTLSDataReportSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import defpackage.i0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.UqV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78443UqV implements InterfaceC31203CMl {
    public static IHostMonitorAndLog LJJI() {
        return (IHostMonitorAndLog) CN1.LIZ(IHostMonitorAndLog.class);
    }

    public static JSONObject LJIL(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            jSONObject2.put("ttlive_sdk_version", C30443Bx9.LIZ());
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException e) {
            C0NB.LJ("LiveSlardarMonitor", e.getMessage());
        }
        return jSONObject2;
    }

    public static void LJJ(Runnable runnable) {
        if (LiveHotRoomLogOptSetting.INSTANCE.getEnable()) {
            C38995FSd.LIZIZ().submit(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // X.InterfaceC31203CMl
    public final void LJIIZILJ(final float f) {
        if (LJJI() == null || LiveEnableSlardarSetting.INSTANCE.isDisable("")) {
            return;
        }
        LJJ(new Runnable() { // from class: X.UqW
            public final /* synthetic */ String LJLILLLLZI = "hotsoon_image_load";
            public final /* synthetic */ String LJLJI = "load_time";

            @Override // java.lang.Runnable
            public final void run() {
                C78443UqV c78443UqV = C78443UqV.this;
                String str = this.LJLILLLLZI;
                String str2 = this.LJLJI;
                float f2 = f;
                c78443UqV.getClass();
                C78443UqV.LJJI().monitorDirectOnTimer(str, str2, f2);
            }
        });
    }

    @Override // X.InterfaceC31203CMl
    public final void LJIJ(JSONObject jSONObject) {
        if (LJJI() == null || LiveEnableSlardarSetting.INSTANCE.isDisable("bd_hybrid_monitor_service_all_in_one")) {
            return;
        }
        C38995FSd.LIZIZ().submit(new ARunnableS0S1301000_13(this, jSONObject, 1));
    }

    @Override // X.InterfaceC31203CMl
    public final void LJIJI(JSONObject jSONObject) {
        if (LJJI() == null) {
            return;
        }
        C38995FSd.LIZIZ().submit(new ARunnableS4S1201000_13(this, jSONObject, 2));
    }

    @Override // X.InterfaceC31203CMl
    public final void LIZIZ(final long j, final String str) {
        LJJ(new Runnable() { // from class: X.UqX
            public final /* synthetic */ int LJLJI = 0;
            public final /* synthetic */ int LJLJJI = 0;

            @Override // java.lang.Runnable
            public final void run() {
                C78443UqV c78443UqV = C78443UqV.this;
                String str2 = str;
                int i = this.LJLJI;
                int i2 = this.LJLJJI;
                long j2 = j;
                c78443UqV.getClass();
                if (!C30757C5h.LIZIZ(i, str2)) {
                    c78443UqV.LJIILJJIL(i2, j2, str2);
                }
            }
        });
    }

    @Override // X.InterfaceC31203CMl
    public final void LJFF(long j, JSONObject jSONObject) {
        LJJ(new ARunnableS0S1201100_13(j, this, jSONObject, 1));
    }

    @Override // X.InterfaceC31203CMl
    public final void LJII(int i, JSONObject jSONObject) {
        LJJ(new ARunnableS0S1202000_13(this, i, jSONObject, 3));
    }

    @Override // X.InterfaceC31203CMl
    public final void LJIILLIIL(String str, Throwable th) {
        if (LJJI() == null || LiveEnableSlardarSetting.INSTANCE.isDisable("")) {
            return;
        }
        C38995FSd.LIZIZ().submit(new ARunnableS5S0301000_4(0, this, th, str, 1));
    }

    public static void LJJII(String str, String str2, JSONObject jSONObject) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            C0NB.LJ("LiveSlardarMonitor", e.getMessage());
        }
    }

    @Override // X.InterfaceC31203CMl
    public final void LIZJ(int i, String str, JSONObject jSONObject) {
        LJJ(new ARunnableS0S1202000_13(this, str, i, jSONObject, 0));
    }

    @Override // X.InterfaceC31203CMl
    public final void LIZLLL(int i, String str, JSONObject jSONObject) {
        if (LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            return;
        }
        C30326BvG.LIZ(new ARunnableS4S1201000_13(i, this, str, jSONObject, 0));
    }

    @Override // X.InterfaceC31203CMl
    public final void LJIIIIZZ(final Throwable th, final String str, final java.util.Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            LJIILLIIL(str, th);
        } else {
            if (LJJI() == null || LiveEnableSlardarSetting.INSTANCE.isDisable("")) {
                return;
            }
            C38995FSd.LIZIZ().submit(new Runnable() { // from class: X.9KG
                @Override // java.lang.Runnable
                public final void run() {
                    C78443UqV c78443UqV = C78443UqV.this;
                    Throwable th2 = th;
                    String str2 = str;
                    java.util.Map<String, String> map2 = map;
                    c78443UqV.getClass();
                    C78443UqV.LJJI().ensureNotReachHere(th2, str2, map2);
                }
            });
        }
    }

    @Override // X.InterfaceC31203CMl
    public final void LJIIJ(String str, long j, JSONObject jSONObject) {
        if (LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            return;
        }
        C30326BvG.LIZ(new ARunnableS2S1200100_13(this, jSONObject, str, j, 0));
    }

    @Override // X.InterfaceC31203CMl
    public final void LJIILJJIL(int i, long j, String str) {
        if (LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            return;
        }
        C38995FSd.LIZIZ().submit(new ARunnableS2S1101100_13(this, str, i, j, 0));
    }

    @Override // X.InterfaceC31203CMl
    public final void LJIJJ(int i, String str, java.util.Map map) {
        if (LJJI() == null || LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            return;
        }
        C38995FSd.LIZIZ().submit(new ARunnableS4S1201000_13(this, map, str, i, 1));
    }

    @Override // X.InterfaceC31203CMl
    public final void monitorCommonLog(String str, String str2, JSONObject jSONObject) {
        if (LJJI() == null) {
            return;
        }
        LJJ(new ARunnableS3S0401000_13(this, 0, jSONObject, str2, str, 1));
    }

    @Override // X.InterfaceC31203CMl
    public final void monitorStatus(String str, int i, JSONObject jSONObject) {
        if (LJJI() == null || LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            return;
        }
        C38995FSd.LIZIZ().submit(new ARunnableS4S1201000_13(i, this, str, jSONObject, 4));
    }

    @Override // X.InterfaceC31203CMl
    public final void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        if (LJJI() == null || LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            return;
        }
        LJJ(new ARunnableS4S1201000_13(i, this, str, jSONObject, 3));
    }

    @Override // X.InterfaceC31203CMl
    public final void LIZ(String str, java.util.Map<String, Object> map, java.util.Map<String, Object> map2, java.util.Map<String, Object> map3) {
        LJJ(new ARunnableS4S1400000_13(this, str, map, map2, map3, 1));
    }

    @Override // X.InterfaceC31203CMl
    public final void LJ(int i, int i2, String str, java.util.Map map) {
        LJJ(new ARunnableS0S1202000_13(this, str, i2, i, map, 2));
    }

    @Override // X.InterfaceC31203CMl
    public final void LJI(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (LJJI() == null || LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            return;
        }
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        if (!str.startsWith("ttlive_")) {
            str = i0.LJFF("ttlive_", str);
        }
        LJJII("tag", "ttlive_sdk", jSONObject3);
        LJJII("ttlive_sdk_version", C30443Bx9.LIZ(), jSONObject3);
        LJJI().a3(str, jSONObject, jSONObject2, LJIL(jSONObject3));
    }

    @Override // X.InterfaceC31203CMl
    public final void LJIIIZ(int i, int i2, String str, JSONObject jSONObject) {
        LJJ(new ARunnableS0S1202000_13(this, str, i2, i, jSONObject, 1));
    }

    @Override // X.InterfaceC31203CMl
    public final void LJIIJJI(int i, long j, String str, java.util.Map map) {
        LJJ(new ARunnableS0S1202100_13(this, str, i, j, map, 1));
    }

    @Override // X.InterfaceC31203CMl
    public final void LJIIL(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (LJJI() == null || LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            return;
        }
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        if (!str.startsWith("ttlive_")) {
            str = i0.LJFF("ttlive_", str);
        }
        LJJII("tag", "ttlive_sdk", jSONObject3);
        LJJII("ttlive_sdk_version", C30443Bx9.LIZ(), jSONObject3);
        JSONObject LJIL = LJIL(jSONObject3);
        if (!LiveLogDeepCopySetting.getEnable()) {
            LJJI().a3(str, jSONObject, jSONObject2, LJIL);
        } else {
            LJJI().m2(str, jSONObject, jSONObject2, LJIL);
        }
    }

    @Override // X.InterfaceC31203CMl
    public final void LJIILIIL(int i, long j, String str, JSONObject jSONObject) {
        if (LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            return;
        }
        C30326BvG.LIZ(new ARunnableS0S1201100_13(i, j, this, str, jSONObject, 2));
    }

    @Override // X.InterfaceC31203CMl
    public final void LJIJJLI(long j, int i, String str, java.util.Map map) {
        if (LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            return;
        }
        C30326BvG.LIZ(new ARunnableS0S1201100_13(i, j, this, str, map, 0));
    }

    @Override // X.InterfaceC31203CMl
    public final void a3(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        LJJIFFI(Boolean.TRUE, str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // X.InterfaceC31203CMl
    public final void m2(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        LJJIFFI(Boolean.FALSE, str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // X.InterfaceC31203CMl
    public final void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        if (LJJI() == null || LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            return;
        }
        if ("bd_hybrid_monitor_service_all_in_one".equals(str) && LiveTTLSDataReportSettings.INSTANCE.isLynxOptEnabled()) {
            return;
        }
        C38995FSd.LIZIZ().submit(new ARunnableS0S1301000_13(i, this, str, jSONObject2, jSONObject, 2));
    }

    @Override // X.InterfaceC31203CMl
    public final void LJIILL(int i, int i2, long j, String str, JSONObject jSONObject) {
        LJJ(new ARunnableS0S1202100_13(this, str, i2, i, j, jSONObject, 0));
    }

    public final void LJJIFFI(final Boolean bool, final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3) {
        if (LJJI() == null || LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            return;
        }
        LJJ(new Runnable() { // from class: X.Ce2
            @Override // java.lang.Runnable
            public final void run() {
                C78443UqV c78443UqV = C78443UqV.this;
                JSONObject jSONObject4 = jSONObject3;
                JSONObject jSONObject5 = jSONObject;
                String str2 = str;
                Boolean bool2 = bool;
                JSONObject jSONObject6 = jSONObject2;
                c78443UqV.getClass();
                C78443UqV.LJJII("tag", "ttlive_sdk", jSONObject4);
                C78443UqV.LJJII("ttlive_sdk_version", String.valueOf(3060), jSONObject4);
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                C28246B6s c28246B6s = (C28246B6s) dataChannelGlobal.mv0(C29049Baf.class);
                if (c28246B6s != null) {
                    try {
                        jSONObject5.put("is_anchor", C29306Beo.LJIIJJI(dataChannelGlobal) ? 1 : 0);
                        jSONObject4.put("anchor_id", c28246B6s.LIZJ);
                        BJL bjl = c28246B6s.LJFF;
                        if (bjl != null) {
                            jSONObject5.put("enter_method", bjl.LIZ);
                            jSONObject5.put("enter_from_merge", c28246B6s.LJFF.LIZIZ);
                        }
                        Room room = c28246B6s.LIZIZ;
                        if (room != null) {
                            jSONObject4.put("room_id", room.getId());
                        }
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                if (!str2.startsWith("ttlive_")) {
                    str2 = i0.LJFF("ttlive_", str2);
                }
                if (bool2.booleanValue() || !LiveLogDeepCopySetting.getEnable()) {
                    C78443UqV.LJJI().a3(str2, jSONObject5, jSONObject6, jSONObject4);
                } else {
                    C78443UqV.LJJI().m2(str2, jSONObject5, jSONObject6, jSONObject4);
                }
            }
        });
    }
}
