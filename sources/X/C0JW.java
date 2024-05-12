package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.media.AudioRecord;
import android.text.TextUtils;
import com.byted.cast.common.api.IAudioRecordAdapter;
import com.byted.cast.common.api.ICameraAdapter;
import com.byted.cast.common.api.IHostAddressAdapter;
import com.byted.cast.common.api.ILibraryLoader;
import com.byted.cast.common.api.ILogger;
import com.byted.cast.common.api.IMonitor;
import com.byted.cast.common.config.Config;
import com.bytedance.android.live.broadcast.mirror.TTHttpNetImpl;
import com.bytedance.android.live.broadcast.mirror.message.DualDeviceMessageJsonPassThroughModel;
import com.bytedance.android.live.broadcast.service.ForegroundMirrorCastService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.google.gson.Gson;
import com.google.gson.m;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0JW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0JW {
    public static final C0JW LIZ = new C0JW();

    public static void LIZIZ(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-4795019708159966990")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    public static boolean LIZLLL() {
        EnumC38440F6u enumC38440F6u = EnumC38440F6u.CAST;
        boolean isPluginAvailable = LiveAppBundleUtils.isPluginAvailable(enumC38440F6u);
        if (!isPluginAvailable) {
            LiveAppBundleUtils.ensurePluginAvailable$default(enumC38440F6u, new F6T() { // from class: X.1G8
                @Override // X.F6T
                public final void LIZ(int i, String str, boolean z) {
                }

                @Override // X.F6T
                public final void onFailed() {
                    C78920UyC.LJI("ttlive_casting_aab_plugin_install", "fail", "result");
                }

                @Override // X.F6T
                public final void onSuccess() {
                    C78920UyC.LJI("ttlive_casting_aab_plugin_install", "success", "result");
                }
            }, false, 4, null);
            C30868C9o.LIZJ(R.string.nnu);
        } else {
            C78920UyC.LJI("livesdk_screencasting_livestudio_btn_click_plugin_result", "PluginInstalled", "result_type");
        }
        return isPluginAvailable;
    }

    public static String LIZ(C15D c15d) {
        try {
            String methodName = c15d.getMethodName();
            Gson gson = C09650Zl.LIZIZ;
            return gson.LJIILL(new DualDeviceMessageJsonPassThroughModel(methodName, gson.LJIJJLI(c15d).LJIIZILJ()));
        } catch (Exception e) {
            C0NB.LJ("CastUtil", android.util.Log.getStackTraceString(e));
            return null;
        }
    }

    public static C15D LJ(String str) {
        String str2;
        m mVar;
        String jVar;
        if (str == null) {
            return null;
        }
        try {
            C0NB.LIZIZ("CastUtil", str);
            Gson gson = C09650Zl.LIZIZ;
            DualDeviceMessageJsonPassThroughModel dualDeviceMessageJsonPassThroughModel = (DualDeviceMessageJsonPassThroughModel) gson.LJI(str, DualDeviceMessageJsonPassThroughModel.class);
            if (dualDeviceMessageJsonPassThroughModel != null && (str2 = dualDeviceMessageJsonPassThroughModel.name) != null && !TextUtils.isEmpty(str2) && dualDeviceMessageJsonPassThroughModel.param != null) {
                C15C.Companion.getClass();
                Class LIZ2 = C15B.LIZ(str2);
                if (LIZ2 != null && (mVar = dualDeviceMessageJsonPassThroughModel.param) != null && (jVar = mVar.toString()) != null) {
                    return (C15D) gson.LJI(jVar, LIZ2);
                }
            }
        } catch (Exception e) {
            C0NB.LJ("CastUtil", android.util.Log.getStackTraceString(e));
        }
        return null;
    }

    public static void LJFF(C90459Zep c90459Zep) {
        c90459Zep.LJIIJJI(100041, new ILibraryLoader() { // from class: X.1G9
            public final /* synthetic */ String LIZ = "cast-loadFromLibrary";

            @Override // com.byted.cast.common.api.ILibraryLoader
            public final boolean loadLibrary(String str) {
                if (str == null || str.length() <= 0) {
                    return false;
                }
                return LiveAppBundleUtils.loadSOByLoader$default(str, this.LIZ, false, 4, null);
            }
        });
    }

    public static void LJI(C90459Zep c90459Zep) {
        c90459Zep.LJIIJJI(100042, new ILogger() { // from class: X.1GB
            @Override // com.byted.cast.common.api.ILogger
            public final void onDebug(String str, String str2) {
                C0NB.LIZIZ(str, str2);
            }

            @Override // com.byted.cast.common.api.ILogger
            public final void onError(String str, String str2) {
                C0NB.LJ(str, str2);
            }

            @Override // com.byted.cast.common.api.ILogger
            public final void onInfo(String str, String str2) {
                C0NB.LJIIIZ(str, str2);
            }

            @Override // com.byted.cast.common.api.ILogger
            public final void onVerbose(String str, String str2) {
                C0NB.LJIIJJI(str, str2);
            }

            @Override // com.byted.cast.common.api.ILogger
            public final void onWarn(String str, String str2) {
                C0NB.LJIIL(str, str2);
            }

            @Override // com.byted.cast.common.api.ILogger
            public final void onError(String str, String str2, Throwable th) {
                C0NB.LJFF(str, str2, th);
            }
        });
    }

    public static void LJII(Context context) {
        o.LJIIIZ(context, "context");
        C0NB.LIZIZ("GameLive_ByteCast", "stopService");
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(context, (Class<?>) ForegroundMirrorCastService.class));
            context.stopService(intent);
        } catch (Throwable th) {
            C0NB.LIZLLL(th.getMessage());
        }
    }

    public static Config LIZJ(String str, boolean z) {
        String str2;
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null) {
            str2 = iHostAppContext.getServerDeviceId();
        } else {
            str2 = null;
        }
        Config.Builder builder = new Config.Builder();
        builder.setLocalProtocols("ByteLink");
        builder.setProjectId("HHNOvjZV0QGBX8P6ihhB");
        builder.setAppId("RNQSVNmaOrgygQd8");
        builder.setDeviceId(str2);
        builder.setLelinkAppId("16454");
        builder.setLelinkAppSecret("e32f4c64cbe76ca46cbb7f96aab93b4b");
        builder.enableDebug(z);
        builder.enableStartLocalServer(true);
        builder.enableFileLog(true);
        builder.setServiceName(str);
        builder.enableForceDnssd(Boolean.TRUE);
        builder.setNetAdapter(new TTHttpNetImpl());
        builder.setAudioRecordAdapter(new IAudioRecordAdapter() { // from class: X.1G5
            @Override // com.byted.cast.common.api.IAudioRecordAdapter
            public final void releaseAudioRecord(AudioRecord audioRecord) {
                if (audioRecord != null) {
                    try {
                        P35 p35 = C63816P2u.LIZ;
                        C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476788483, "bpea-wired_cast_stop_audio");
                        p35.getClass();
                        P35.LIZIZ(audioRecord, LJJIIJ);
                    } catch (Q0C e) {
                        C0NB.LJI("CastUtil", e);
                    }
                }
            }

            @Override // com.byted.cast.common.api.IAudioRecordAdapter
            public final void startAudioRecord(AudioRecord audioRecord) {
                if (audioRecord != null) {
                    try {
                        P35 p35 = C63816P2u.LIZ;
                        C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476788233, "bpea-game_start_audio");
                        p35.getClass();
                        P35.LIZJ(audioRecord, LJJIIJ);
                    } catch (Q0C e) {
                        C0NB.LJI("CastUtil", e);
                    }
                }
            }

            @Override // com.byted.cast.common.api.IAudioRecordAdapter
            public final void stopAudioRecord(AudioRecord audioRecord) {
                if (audioRecord != null) {
                    try {
                        P35 p35 = C63816P2u.LIZ;
                        C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476788483, "bpea-wireless_cast_stop_audio");
                        p35.getClass();
                        P35.LIZLLL(audioRecord, LJJIIJ);
                    } catch (Q0C e) {
                        C0NB.LJI("CastUtil", e);
                    }
                }
            }
        });
        builder.setCameraAdapter(new ICameraAdapter() { // from class: X.1G6
            @Override // com.byted.cast.common.api.ICameraAdapter
            public final Camera openCamera() {
                Camera camera = null;
                try {
                    OHW LJIIJJI = OUP.LJIIJJI(100100, C78857UxB.LJJIIJ(1476788233, "bpea-game_live_dual_device_start_camera"), "camera_open1");
                    C78929UyL.LIZIZ(LJIIJJI, "android/hardware/Camera", "open()Landroid/hardware/Camera;", null);
                    camera = (Camera) C39207Fa7.LIZ(LJIIJJI, C62007OVf.LJLIL);
                    return camera;
                } catch (Q0C e) {
                    C0NB.LJI("CastUtil", e);
                    return camera;
                }
            }

            @Override // com.byted.cast.common.api.ICameraAdapter
            public final Camera openCamera(int i) {
                try {
                    return C62006OVe.LIZ(i, C78857UxB.LJJIIJ(1476788233, "bpea-game_live_dual_device_start_camera"));
                } catch (Q0C e) {
                    C0NB.LJI("CastUtil", e);
                    return null;
                }
            }

            @Override // com.byted.cast.common.api.ICameraAdapter
            public final void releaseCamera(Camera camera) {
                if (camera != null) {
                    try {
                        C62006OVe.LIZIZ(camera, C78857UxB.LJJIIJ(1476788483, "bpea-game_live_dual_device_stop_camera"));
                    } catch (Q0C e) {
                        C0NB.LJI("CastUtil", e);
                    }
                }
            }
        });
        builder.setHostAddressAdapter(new IHostAddressAdapter() { // from class: X.1G7
            /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
            
                r0 = null;
             */
            @Override // com.byted.cast.common.api.IHostAddressAdapter
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.String getHostAddress(java.net.InetAddress r6) {
                /*
                    r5 = this;
                    boolean r0 = r6 instanceof java.net.Inet4Address     // Catch: X.Q0C -> L35
                    r4 = 1476427777(0x58008001, float:5.6514904E14)
                    java.lang.String r3 = "bpea-bytecast_ip"
                    java.lang.String r2 = "it"
                    if (r0 == 0) goto L1e
                    X.P3h r1 = X.C63832P3k.LIZJ     // Catch: X.Q0C -> L35
                    kotlin.jvm.internal.o.LJIIIIZZ(r6, r2)     // Catch: X.Q0C -> L35
                    java.net.Inet4Address r6 = (java.net.Inet4Address) r6     // Catch: X.Q0C -> L35
                    X.UxG r0 = X.C78857UxB.LJJIIJ(r4, r3)     // Catch: X.Q0C -> L35
                    r1.getClass()     // Catch: X.Q0C -> L35
                    java.lang.String r0 = X.C63829P3h.LIZ(r6, r0)     // Catch: X.Q0C -> L35
                    goto L3c
                L1e:
                    boolean r0 = r6 instanceof java.net.Inet6Address     // Catch: X.Q0C -> L35
                    if (r0 == 0) goto L3b
                    X.P3h r1 = X.C63832P3k.LIZJ     // Catch: X.Q0C -> L35
                    kotlin.jvm.internal.o.LJIIIIZZ(r6, r2)     // Catch: X.Q0C -> L35
                    java.net.Inet6Address r6 = (java.net.Inet6Address) r6     // Catch: X.Q0C -> L35
                    X.UxG r0 = X.C78857UxB.LJJIIJ(r4, r3)     // Catch: X.Q0C -> L35
                    r1.getClass()     // Catch: X.Q0C -> L35
                    java.lang.String r0 = X.C63829P3h.LIZIZ(r6, r0)     // Catch: X.Q0C -> L35
                    goto L3c
                L35:
                    r1 = move-exception
                    java.lang.String r0 = "CastUtil"
                    X.C0NB.LJI(r0, r1)
                L3b:
                    r0 = 0
                L3c:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1G7.getHostAddress(java.net.InetAddress):java.lang.String");
            }
        });
        builder.setMonitor(new IMonitor() { // from class: X.1G4
            @Override // com.byted.cast.common.api.IMonitor
            public final void onAppLogEvent(String str3, JSONObject jSONObject) {
                if (str3 == null || jSONObject == null) {
                    return;
                }
                BZI LIZ2 = C28787BRn.LIZ(str3);
                LIZ2.LJJ(jSONObject);
                LIZ2.LJJIIJZLJL();
            }
        });
        Config build = builder.build();
        o.LJIIIIZZ(build, "Builder()\n            .s…r())\n            .build()");
        return build;
    }
}
