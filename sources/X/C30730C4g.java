package X;

import android.os.Build;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.broadcast.setting.PushStreamAppLogSwitch;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.livesetting.broadcast.CameraTypeSettingSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.C4g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30730C4g implements InterfaceC15330iv {
    public final String LIZ;
    public final InterfaceC30734C4k LIZIZ;

    public C30730C4g() {
        this.LIZ = "default";
        this.LIZIZ = new InterfaceC30734C4k() { // from class: X.C4i
            @Override // X.InterfaceC30734C4k
            public final int LIZ(String str) {
                return ((IInteractService) CN1.LIZ(IInteractService.class)).MS(str);
            }
        };
    }

    public C30730C4g(String str) {
        this.LIZ = "default";
        this.LIZIZ = new C279117r();
        this.LIZ = str;
    }

    public static int LIZJ(List list) {
        int intValue = InterfaceC30442Bx8.LJIJI.LIZJ().intValue();
        if (intValue >= list.size() || intValue >= list.size() || intValue < 0) {
            return 0;
        }
        return intValue;
    }

    public static void LIZIZ(String str, JSONObject jSONObject) {
        IGameService iGameService;
        IGameService iGameService2;
        try {
            if ("live_client_monitor_log".equals(str) && jSONObject != null && "push_stream".equals(JSONObjectProtectorUtils.getString(jSONObject, "event_key")) && (iGameService2 = (IGameService) CN1.LIZ(IGameService.class)) != null) {
                iGameService2.wk0(jSONObject);
            }
            if ("live_client_monitor_log".equals(str) && jSONObject != null && "bitrate_adjust".equals(JSONObjectProtectorUtils.getString(jSONObject, "event_key")) && (iGameService = (IGameService) CN1.LIZ(IGameService.class)) != null) {
                iGameService.Hc(jSONObject);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC15330iv
    public final void LIZ(String str, JSONObject jSONObject) {
        String str2;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String filterPath;
        boolean z;
        String scene = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
        o.LJIIIZ(scene, "scene");
        java.util.Map<String, String> map = C31014CFe.LIZLLL;
        map.put("broadcast_scene", scene);
        if (((IInteractService) CN1.LIZ(IInteractService.class)).isNeedPublishFrame() && "normal_video_live".equals(((LinkedHashMap) map).get("broadcast_scene"))) {
            map.put("broadcast_scene", "video_anchor_guest_connect");
        }
        if (jSONObject != null && "rtc_push_stream".equals(jSONObject.opt("event_key"))) {
            C31014CFe.LJIIL(jSONObject, this.LIZIZ);
        } else {
            C31014CFe.LJIIL(jSONObject, null);
            if (C30731C4h.LJJIFFI) {
                if (jSONObject != null) {
                    str2 = jSONObject.optString("event_key");
                } else {
                    str2 = null;
                }
                if (o.LJ(str2, "push_stream")) {
                    try {
                        Double LIZ = C30731C4h.LIZ(jSONObject, "real_video_framerate", C30731C4h.LIZIZ);
                        if (LIZ != null) {
                            d = LIZ.doubleValue();
                        } else {
                            d = C30731C4h.LIZIZ;
                        }
                        C30731C4h.LIZIZ = d;
                        Double LIZ2 = C30731C4h.LIZ(jSONObject, "preview_fps", C30731C4h.LIZJ);
                        if (LIZ2 != null) {
                            d2 = LIZ2.doubleValue();
                        } else {
                            d2 = C30731C4h.LIZJ;
                        }
                        C30731C4h.LIZJ = d2;
                        Double LIZ3 = C30731C4h.LIZ(jSONObject, "in_cap_fps", C30731C4h.LIZLLL);
                        if (LIZ3 != null) {
                            d3 = LIZ3.doubleValue();
                        } else {
                            d3 = C30731C4h.LIZLLL;
                        }
                        C30731C4h.LIZLLL = d3;
                        Double LIZ4 = C30731C4h.LIZ(jSONObject, "out_cap_fps", C30731C4h.LJ);
                        if (LIZ4 != null) {
                            d4 = LIZ4.doubleValue();
                        } else {
                            d4 = C30731C4h.LJ;
                        }
                        C30731C4h.LJ = d4;
                        Double LIZ5 = C30731C4h.LIZ(jSONObject, "encode_fps", C30731C4h.LJFF);
                        if (LIZ5 != null) {
                            d5 = LIZ5.doubleValue();
                        } else {
                            d5 = C30731C4h.LJFF;
                        }
                        C30731C4h.LJFF = d5;
                        try {
                            JSONArray jSONArray = new JSONArray(new JSONObject(jSONObject.optString("message")).optString("video_frame_elapse_v2"));
                            Integer LIZIZ = C30731C4h.LIZIZ(0, C30731C4h.LJI, jSONArray);
                            if (LIZIZ != null) {
                                i = LIZIZ.intValue();
                            } else {
                                i = C30731C4h.LJI;
                            }
                            C30731C4h.LJI = i;
                            Integer LIZIZ2 = C30731C4h.LIZIZ(1, C30731C4h.LJII, jSONArray);
                            if (LIZIZ2 != null) {
                                i2 = LIZIZ2.intValue();
                            } else {
                                i2 = C30731C4h.LJII;
                            }
                            C30731C4h.LJII = i2;
                            Integer LIZIZ3 = C30731C4h.LIZIZ(2, C30731C4h.LJIIIIZZ, jSONArray);
                            if (LIZIZ3 != null) {
                                i3 = LIZIZ3.intValue();
                            } else {
                                i3 = C30731C4h.LJIIIIZZ;
                            }
                            C30731C4h.LJIIIIZZ = i3;
                            Integer LIZIZ4 = C30731C4h.LIZIZ(3, C30731C4h.LJIIIZ, jSONArray);
                            if (LIZIZ4 != null) {
                                i4 = LIZIZ4.intValue();
                            } else {
                                i4 = C30731C4h.LJIIIZ;
                            }
                            C30731C4h.LJIIIZ = i4;
                            Integer LIZIZ5 = C30731C4h.LIZIZ(4, C30731C4h.LJIIJ, jSONArray);
                            if (LIZIZ5 != null) {
                                i5 = LIZIZ5.intValue();
                            } else {
                                i5 = C30731C4h.LJIIJ;
                            }
                            C30731C4h.LJIIJ = i5;
                            Integer LIZIZ6 = C30731C4h.LIZIZ(5, C30731C4h.LJIIJJI, jSONArray);
                            if (LIZIZ6 != null) {
                                i6 = LIZIZ6.intValue();
                            } else {
                                i6 = C30731C4h.LJIIJJI;
                            }
                            C30731C4h.LJIIJJI = i6;
                            Integer LIZIZ7 = C30731C4h.LIZIZ(6, C30731C4h.LJIIL, jSONArray);
                            if (LIZIZ7 != null) {
                                i7 = LIZIZ7.intValue();
                            } else {
                                i7 = C30731C4h.LJIIL;
                            }
                            C30731C4h.LJIIL = i7;
                            Integer LIZIZ8 = C30731C4h.LIZIZ(7, C30731C4h.LJIILIIL, jSONArray);
                            if (LIZIZ8 != null) {
                                i8 = LIZIZ8.intValue();
                            } else {
                                i8 = C30731C4h.LJIILIIL;
                            }
                            C30731C4h.LJIILIIL = i8;
                            Integer LIZIZ9 = C30731C4h.LIZIZ(8, C30731C4h.LJIILJJIL, jSONArray);
                            if (LIZIZ9 != null) {
                                i9 = LIZIZ9.intValue();
                            } else {
                                i9 = C30731C4h.LJIILJJIL;
                            }
                            C30731C4h.LJIILJJIL = i9;
                            Integer LIZIZ10 = C30731C4h.LIZIZ(9, C30731C4h.LJIILL, jSONArray);
                            if (LIZIZ10 != null) {
                                i10 = LIZIZ10.intValue();
                            } else {
                                i10 = C30731C4h.LJIILL;
                            }
                            C30731C4h.LJIILL = i10;
                            Integer LIZIZ11 = C30731C4h.LIZIZ(10, C30731C4h.LJIILLIIL, jSONArray);
                            if (LIZIZ11 != null) {
                                i11 = LIZIZ11.intValue();
                            } else {
                                i11 = C30731C4h.LJIILLIIL;
                            }
                            C30731C4h.LJIILLIIL = i11;
                        } catch (Throwable unused) {
                        }
                        C0NB.LJ("push_params", "pushFps = " + C30731C4h.LIZIZ + ", previewFps = " + C30731C4h.LIZJ + ", inCapFps = " + C30731C4h.LIZLLL + ", outCapFps = " + C30731C4h.LJ + ", encodeFps = " + C30731C4h.LJFF + ", cameraCaptureTime = " + C30731C4h.LJI + ", cameraToProcessorLatency = " + C30731C4h.LJII + ", updateTexImageTime = " + C30731C4h.LJIIIIZZ + ", oesTo2dTime = " + C30731C4h.LJIIIZ + ", effectProcessTime = " + C30731C4h.LJIIJ + ", afterEffectGlFinishTime = " + C30731C4h.LJIIJJI + ", postProcessAlgorithmTime = " + C30731C4h.LJIIL + ", processToRenderLatency = " + C30731C4h.LJIILIIL + ", renderTime = " + C30731C4h.LJIILJJIL + ", processToEncoderLatency = " + C30731C4h.LJIILL + ", encoderDrawSurfaceTime = " + C30731C4h.LJIILLIIL + ',');
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
        PushStreamAppLogSwitch pushStreamAppLogSwitch = PushStreamAppLogSwitch.INSTANCE;
        if (pushStreamAppLogSwitch.getValue() == 0) {
            LIZIZ(str, jSONObject);
        } else if ("screen".equals(this.LIZ)) {
            LIZIZ(str, jSONObject);
        }
        if (LiveEnableSlardarSetting.INSTANCE.isDisable("live_stream_common_log")) {
            return;
        }
        if (!"live_client_monitor_log".equals(str)) {
            C0K2.LIZJ(str, null, jSONObject);
            return;
        }
        if (jSONObject != null) {
            try {
                String string = JSONObjectProtectorUtils.getString(jSONObject, "mode");
                if ("live_client_monitor_log".equals(str) && "rtc".equals(string)) {
                    if (pushStreamAppLogSwitch.getValue() == 3 || pushStreamAppLogSwitch.getValue() == 4) {
                        if (((IPullStreamService) CN1.LIZ(IPullStreamService.class)).h0() != null) {
                            BZI bzi = new BZI("ttls_push_event", false);
                            bzi.LJJ(jSONObject);
                            bzi.LJJIIJZLJL();
                            return;
                        }
                        return;
                    }
                    C0K2.LIZJ(str, null, jSONObject);
                    return;
                }
            } catch (Exception e) {
                C0NB.LJ("uploadLog", e.getMessage());
            }
        }
        if (PushStreamAppLogSwitch.INSTANCE.getValue() == 0) {
            try {
                int cameraType = CameraTypeSettingSetting.INSTANCE.getValue().getCameraType();
                if (Build.VERSION.SDK_INT >= 28) {
                    cameraType = 2;
                }
                jSONObject.put("camera", cameraType);
                List<? extends LiveEffect> LIZ6 = C30355Bvj.LJIIIZ().LIZ();
                if (!C32151Nz.LJJIIJZLJL(LIZ6)) {
                    if (LIZ6.isEmpty()) {
                        filterPath = "";
                    } else {
                        filterPath = ((LiveEffect) ListProtector.get(LIZ6, LIZJ(LIZ6))).getFilterPath();
                    }
                    if (!C38354F3m.LJ(filterPath)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jSONObject.put("filter_opened", z);
                    jSONObject.put("filter_name", ((LiveEffect) ListProtector.get(LIZ6, LIZJ(LIZ6))).getName());
                }
                LiveBeautyParamSetting liveBeautyParamSetting = LiveBeautyParamSetting.INSTANCE;
                jSONObject.put("beauty_white", liveBeautyParamSetting.getValue().brightening.scale * InterfaceC30442Bx8.LJJI.LIZJ().floatValue());
                jSONObject.put("beauty_skin", liveBeautyParamSetting.getValue().beauty.scale * InterfaceC30442Bx8.LJJIFFI.LIZJ().floatValue());
                jSONObject.put("beauty_eye", liveBeautyParamSetting.getValue().bigEyes.scale * InterfaceC30442Bx8.LJJII.LIZJ().floatValue());
                jSONObject.put("beauty_face", liveBeautyParamSetting.getValue().lift.scale * InterfaceC30442Bx8.LJJIII.LIZJ().floatValue());
            } catch (Throwable th) {
                C0NB.LJI("StreamLog", th);
            }
        }
        try {
            jSONObject.put("live_platform_version", C30443Bx9.LIZ());
        } catch (Throwable th2) {
            C0NB.LJI("StreamLog", th2);
        }
        try {
            InterfaceC28738BPq h0 = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).h0();
            if (h0 != null) {
                if ("screen".equals(this.LIZ)) {
                    h0.LJJIL(str, jSONObject);
                    return;
                }
                int value = PushStreamAppLogSwitch.INSTANCE.getValue();
                if (value != 1) {
                    if (value != 2) {
                        if (value != 3) {
                            if (value != 4) {
                                h0.LJJIL(str, jSONObject);
                                return;
                            }
                        }
                    }
                    h0.LJIIIIZZ(jSONObject, false);
                    return;
                }
                h0.LJIIIIZZ(jSONObject, true);
            }
        } catch (Throwable th3) {
            C0NB.LJI("SteamLogUploader", th3);
        }
    }
}
