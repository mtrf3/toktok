package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.medialib.VideoSdkCore;
import com.ss.android.ttve.nativePort.TELogcat;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.runtime.VERuntime;
import java.text.SimpleDateFormat;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.P7q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63942P7q {
    public static java.util.Map<String, Object> LIZ() {
        ConcurrentHashMap<String, Object> concurrentHashMap = C63856P4i.LIZIZ;
        if (concurrentHashMap == null) {
            return null;
        }
        if (concurrentHashMap.containsKey("te_import_video_hw_bit_rate")) {
            C63856P4i.LIZIZ.put("te_import_video_hw_profile", C63856P4i.LIZ);
        }
        if (C63856P4i.LIZIZ.containsKey("te_composition_video_encode_mode")) {
            Object obj = C63856P4i.LIZIZ.get("te_composition_video_encode_mode");
            try {
                if (obj instanceof Integer) {
                    if (((Integer) obj).intValue() == 1) {
                        C63856P4i.LIZJ(new String[]{"te_composition_video_sw_preset", "te_composition_video_sw_crf", "te_composition_video_sw_maxrate", "te_composition_video_sw_gop", "te_composition_video_sw_qpoffset"});
                    } else if (((Integer) obj).intValue() == 0) {
                        C63856P4i.LIZJ(new String[]{"te_composition_video_hw_bit_rate", "te_composition_video_hw_profile"});
                    }
                }
            } catch (Exception unused) {
            }
        } else {
            C63856P4i.LIZJ(new String[]{"te_composition_video_hw_profile"});
        }
        if (C63856P4i.LIZIZ.containsKey("te_record_video_frame_rate")) {
            C63856P4i.LIZJ(new String[]{"te_composition_video_hw_bit_rate", "te_composition_video_hw_profile", "te_composition_video_encode_mode", "te_composition_video_sw_preset", "te_composition_video_sw_crf", "te_composition_video_sw_maxrate", "te_composition_video_sw_gop"});
        }
        if (!C63856P4i.LIZIZ.containsKey("te_record_video_frame_rate") && !C63856P4i.LIZIZ.containsKey("ve_use_camera")) {
            C63856P4i.LIZJ(new String[]{"te_camera_texture_size", "te_camera_preview_size", "te_lens_adaptive_sharpen"});
        } else {
            if (!C63856P4i.LIZIZ.containsKey("te_lens_adaptive_sharpen")) {
                C63856P4i.LIZIZ.put("te_lens_adaptive_sharpen", 0);
            }
            if (!C63856P4i.LIZIZ.containsKey("te_record_video_texture_hd")) {
                C63856P4i.LIZIZ.put("te_record_video_texture_hd", 0);
            }
            C63856P4i.LIZIZ.put("te_record_video_lanczos", Integer.valueOf(VEConfigCenter.getInstance().getValue("ve_enable_titan_opt_lanczos_screen", false).booleanValue() ? 1 : 0));
        }
        if (!C63856P4i.LIZIZ.containsKey("te_edit_Enhance") && C63856P4i.LIZIZ.containsKey("te_is_reencode")) {
            C63856P4i.LIZIZ.put("te_edit_Enhance", 0);
        }
        C63856P4i.LIZJ(new String[]{"ve_use_camera"});
        C63856P4i.LIZIZ.put("te_os", 1);
        ConcurrentHashMap<String, Object> concurrentHashMap2 = C63856P4i.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Android ");
        LIZ.append(Build.VERSION.RELEASE);
        concurrentHashMap2.put("te_system", X1D.LIZIZ(LIZ));
        C63856P4i.LIZIZ.put("te_user_device", Build.MODEL);
        C63856P4i.LIZIZ.put("te_ve_version", "15.0.0.74");
        C63856P4i.LIZIZ.put("te_effect_version", "15.0.0_rel_1_mt_202309080724_1f73e5ecb5");
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap(C63856P4i.LIZIZ);
        ConcurrentHashMap<String, Object> concurrentHashMap4 = C63856P4i.LIZIZ;
        if (concurrentHashMap4 == null) {
            return concurrentHashMap3;
        }
        concurrentHashMap4.clear();
        return concurrentHashMap3;
    }

    public static void LJI(C63946P7u c63946P7u) {
        C63867P4t.LJFF("user_id", c63946P7u.LIZIZ);
        C63867P4t.LJFF("device_id", c63946P7u.LIZJ);
        EnumC36866EdS.LJLILLLLZI.LJLIL.LIZIZ("KEY_DEVICEID", true, c63946P7u.LIZJ);
        C63867P4t.LJFF("app_version", c63946P7u.LIZ);
    }

    public static void LJII(byte b) {
        if (!TextUtils.isEmpty(null)) {
            StringBuilder LIZ = X1D.LIZ();
            P4Q.LIZ = C025908h.LIZIZ(LIZ, P4Q.LIZ, null, "-", LIZ);
        }
        P4Q.LIZIZ = b;
        byte b2 = 1;
        if (b != 1) {
            if (b != 3) {
                if (b != 7) {
                    if (b != 15) {
                        if (b != 31) {
                            b2 = 0;
                        } else {
                            b2 = 16;
                        }
                    } else {
                        b2 = 8;
                    }
                } else {
                    b2 = 4;
                }
            } else {
                b2 = 2;
            }
        }
        TELogcat.nativeSetLogLevel(b2);
    }

    public static void LIZIZ(int i, boolean z) {
        int enableHDByteVC1HWDecoder = VERuntime.getInstance().enableHDByteVC1HWDecoder(z, i);
        if (enableHDByteVC1HWDecoder != -108) {
        } else {
            throw new VEException(enableHDByteVC1HWDecoder, "please set VEEnv or VEEnv#init");
        }
    }

    public static void LIZJ(int i, boolean z) {
        int enableHDH264HWDecoder = VERuntime.getInstance().enableHDH264HWDecoder(z, i);
        if (enableHDH264HWDecoder != -108) {
        } else {
            throw new VEException(enableHDH264HWDecoder, "please set VEEnv or VEEnv#init");
        }
    }

    public static void LJFF(Context context, String str) {
        String string;
        String string2;
        String str2;
        EnumC30412Bwe enumC30412Bwe;
        synchronized (C78866UxK.class) {
            C78866UxK.LJLIL = false;
        }
        VEConfigCenter.getInstance().initByteBench();
        VERuntime.getInstance().init(context, str);
        C63944P7s LIZ = C63944P7s.LIZ();
        LIZ.LIZJ = str;
        for (String str3 : C63944P7s.LJ) {
            EnumC36866EdS enumC36866EdS = EnumC36866EdS.LJLILLLLZI;
            String str4 = "";
            String str5 = (String) enumC36866EdS.LJLIL.LIZ(str3, "");
            if (!str5.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (str3.hashCode() != 2043549244 || !str3.equals("vesdk_log_command")) {
                        P4Q.LIZJ("VECloudCtrlManager", " json contail invalid command ");
                    } else {
                        if (!jSONObject.has("enable")) {
                            string = "false";
                        } else {
                            string = JSONObjectProtectorUtils.getString(jSONObject, "enable");
                        }
                        String str6 = "2018-12-08 00:00:00";
                        if (!jSONObject.has("starttime")) {
                            string2 = "2018-12-08 00:00:00";
                        } else {
                            string2 = JSONObjectProtectorUtils.getString(jSONObject, "starttime");
                        }
                        if (jSONObject.has("endtime")) {
                            str6 = JSONObjectProtectorUtils.getString(jSONObject, "endtime");
                        }
                        if (!jSONObject.has("level")) {
                            str2 = "";
                        } else {
                            str2 = JSONObjectProtectorUtils.getString(jSONObject, "level");
                        }
                        if (jSONObject.has("sign")) {
                            str4 = JSONObjectProtectorUtils.getString(jSONObject, "sign");
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(str3);
                        LIZ2.append(string);
                        LIZ2.append(string2);
                        LIZ2.append(str6);
                        LIZ2.append(str2);
                        if (!LIZ.LIZIZ.LIZ(X1D.LIZIZ(LIZ2), str4)) {
                            enumC36866EdS.LJLIL.LIZIZ(str3, false, "");
                            P4Q.LIZJ("VECloudCtrlManager", "Cloud Ctrl Command Json is doctored");
                        } else {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                            long time = simpleDateFormat.parse(string2).getTime();
                            long time2 = simpleDateFormat.parse(str6).getTime();
                            long currentTimeMillis = System.currentTimeMillis();
                            if (str2.hashCode() != 68 || !str2.equals("D")) {
                                enumC30412Bwe = EnumC30412Bwe.LEVEL3;
                            } else {
                                enumC30412Bwe = EnumC30412Bwe.LEVEL0;
                            }
                            if (!LIZ.LIZ && string.equals("true") && currentTimeMillis >= time && currentTimeMillis < time2) {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append(LIZ.LIZJ);
                                LIZ3.append("/vesdklog");
                                String LIZIZ = X1D.LIZIZ(LIZ3);
                                P4Q.LIZ("VECloudCtrlManager", LIZIZ);
                                int initSpdLog = C63945P7t.LIZ().LIZ.initSpdLog(LIZIZ, enumC30412Bwe.ordinal(), 3);
                                if (initSpdLog < 0) {
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append(" TESpdLog init fail ");
                                    LIZ4.append(initSpdLog);
                                    P4Q.LIZJ("VECloudCtrlManager", X1D.LIZIZ(LIZ4));
                                } else {
                                    C63945P7t.LIZ().LIZ.setLevel(enumC30412Bwe.ordinal());
                                    LIZ.LIZ = true;
                                }
                            } else if (string.equals("false") || (currentTimeMillis < time && currentTimeMillis >= time2)) {
                                if (LIZ.LIZ) {
                                    C63945P7t.LIZ().LIZ.close();
                                    LIZ.LIZ = false;
                                }
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append(str3);
                                LIZ5.append(" expired");
                                P4Q.LIZ("VECloudCtrlManager", X1D.LIZIZ(LIZ5));
                                enumC36866EdS.LJLIL.LIZIZ(str3, false, "");
                            }
                        }
                    }
                } catch (Exception e) {
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append(" json parse failed ");
                    LIZ6.append(e.toString());
                    P4Q.LIZJ("VECloudCtrlManager", X1D.LIZIZ(LIZ6));
                    EnumC36866EdS.LJLILLLLZI.LJLIL.LIZIZ(str3, false, "");
                }
            }
        }
        VEConfigCenter.getInstance().syncConfigToNative();
        if (Integer.valueOf(VEConfigCenter.getInstance().getValue("use_open_gl_three", 1)).intValue() == 1) {
            VERuntime.getInstance().enableGLES3(true);
            VideoSdkCore.enableGLES3(true);
        } else {
            P4Q.LJFF("VESDK", "No gles config");
        }
        VERuntime.nativeEnableAudioSDKApiV2(VEConfigCenter.getInstance().getValue("aeabtest_v2api", false).booleanValue());
    }

    public static void LIZLLL(int i, int i2, boolean z) {
        int enableHighFpsByteVC1HWDecoder = VERuntime.getInstance().enableHighFpsByteVC1HWDecoder(z, i, i2);
        if (enableHighFpsByteVC1HWDecoder != -108) {
        } else {
            throw new VEException(enableHighFpsByteVC1HWDecoder, "please set VEEnv or VEEnv#init");
        }
    }

    public static void LJ(int i, int i2, boolean z) {
        int enableHighFpsH264HWDecoder = VERuntime.getInstance().enableHighFpsH264HWDecoder(z, i, i2);
        if (enableHighFpsH264HWDecoder != -108) {
        } else {
            throw new VEException(enableHighFpsH264HWDecoder, "please set VEEnv or VEEnv#init");
        }
    }
}
