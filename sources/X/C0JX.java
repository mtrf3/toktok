package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.view.Surface;
import androidx.fragment.app.Fragment;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.common.api.MirrorInfo;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.source.IMirrorListener;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.source.Statistics;
import com.bytedance.android.live.broadcast.mirror.widget.GameCastWiredWidget;
import com.bytedance.android.live.broadcast.service.ForegroundMirrorCastService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0JX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0JX {
    public static C90459Zep LIZ;
    public static InterfaceC05420Je LIZJ;
    public static C05380Ja LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static C73666Sve LJIIIIZZ;
    public static long LJIIIZ;
    public static final boolean LIZIZ = C30922CBq.LIZIZ;
    public static boolean LJII = true;

    public static void LIZIZ() {
        C05380Ja c05380Ja = LIZLLL;
        if (c05380Ja != null) {
            c05380Ja.LIZIZ();
        }
        C90459Zep c90459Zep = LIZ;
        if (c90459Zep != null) {
            c90459Zep.LIZIZ();
        }
        LIZJ = null;
        LIZ = null;
        LJ = false;
        C73666Sve c73666Sve = LJIIIIZZ;
        if (c73666Sve != null) {
            c73666Sve.dispose();
        }
        LJIIIIZZ = null;
    }

    public static void LJ() {
        C90436ZeS LIZLLL2;
        MirrorInfo mirrorInfo = new MirrorInfo();
        mirrorInfo.enableEncodeSizeToScreen(true);
        mirrorInfo.setFps(30);
        if (Build.VERSION.SDK_INT >= 29) {
            mirrorInfo.setAudioEnable(true);
            mirrorInfo.setAudioSource(3);
        } else {
            mirrorInfo.setAudioEnable(false);
            C90459Zep c90459Zep = LIZ;
            if (c90459Zep != null) {
                c90459Zep.LJIIJJI(10017, Boolean.FALSE);
            }
        }
        mirrorInfo.setAutoBitrate(false);
        mirrorInfo.setBitRateLevel(4);
        mirrorInfo.setVideoSrc(2);
        mirrorInfo.setCameraId(0);
        mirrorInfo.setServerMode(1);
        mirrorInfo.setResolutionLevel(3);
        C90459Zep c90459Zep2 = LIZ;
        if (c90459Zep2 != null && (LIZLLL2 = c90459Zep2.LIZLLL()) != null) {
            LIZLLL2.LJII(mirrorInfo);
        }
    }

    public static void LIZJ(Context context) {
        if (LIZ != null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("hasInit", LJI);
        jSONObject.put("isWireless", false);
        C0K2.LJIIIIZZ("ttlive_game_cast_init_sdk", -1, jSONObject);
        C90459Zep c90459Zep = new C90459Zep();
        C0JW.LIZ.getClass();
        C0JW.LJFF(c90459Zep);
        C0JW.LJI(c90459Zep);
        c90459Zep.LJII(context, C0JW.LIZJ("ByteCast", LIZIZ), new IInitListener() { // from class: X.1GA
            @Override // com.byted.cast.common.config.IInitListener
            public final void onSuccess() {
                C0NB.LIZIZ("GameWiredCastManager", "onSuccess, init --wiredManager");
                C0JX.LJI = true;
                InterfaceC05420Je interfaceC05420Je = C0JX.LIZJ;
                if (interfaceC05420Je != null) {
                    interfaceC05420Je.LIZJ();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("isWireless", false);
                C0K2.LJIIIIZZ("ttlive_game_cast_init_sdk", 1, jSONObject2);
            }

            @Override // com.byted.cast.common.config.IInitListener
            public final void onFail(int i, String str, Exception exc) {
                C0JX.LJI = false;
                C0NB.LIZIZ("GameWiredCastManager", "onFail, init --wiredManager");
                InterfaceC05420Je interfaceC05420Je = C0JX.LIZJ;
                if (interfaceC05420Je != null) {
                    interfaceC05420Je.LJFF(i);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("isWireless", false);
                jSONObject2.put("errCode", i);
                jSONObject2.put("errMsg", str);
                jSONObject2.put("e", exc);
                C0K2.LJIIIIZZ("ttlive_game_cast_init_sdk", 0, jSONObject2);
            }
        });
        C90436ZeS LIZLLL2 = c90459Zep.LIZLLL();
        if (LIZLLL2 != null) {
            LIZLLL2.LJIIIIZZ(new IMirrorListener() { // from class: X.1j9
                @Override // com.byted.cast.common.source.IMirrorListener
                public final void onInfo(int i, int i2, int i3, String str) {
                }

                @Override // com.byted.cast.common.source.IMirrorListener
                public final boolean onInvite(String str, int i) {
                    return false;
                }

                @Override // com.byted.cast.common.source.IMirrorListener
                public final void onMirrorModeChange(int i) {
                }

                @Override // com.byted.cast.common.source.IMirrorListener
                public final boolean onStartMirrorAuthorization() {
                    return true;
                }

                @Override // com.byted.cast.common.source.IMirrorListener
                public final void onStatistics(Statistics statistics) {
                }

                @Override // com.byted.cast.common.source.IMirrorListener
                public final void onStart(int i) {
                    if (i != 10) {
                        return;
                    }
                    C0NB.LIZIZ("GameWiredCastManager", "onStart,  --wiredManager");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("isWireless", false);
                    jSONObject2.put("serviceId", i);
                    C0K2.LJIIIIZZ("ttlive_game_cast_onStart", 1, jSONObject2);
                    InterfaceC05420Je interfaceC05420Je = C0JX.LIZJ;
                    if (interfaceC05420Je != null) {
                        interfaceC05420Je.LIZ();
                    }
                    C05440Jg.LIZJ(GameCastWiredWidget.class, true);
                }

                @Override // com.byted.cast.common.source.IMirrorListener
                public final void onStop(int i) {
                    if (i != 10) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("isWireless", false);
                    jSONObject2.put("serviceId", i);
                    C0K2.LJIIIIZZ("ttlive_game_cast_onStop", 1, jSONObject2);
                    C0NB.LIZIZ("GameWiredCastManager", "onStop,  --wiredManager");
                    InterfaceC05420Je interfaceC05420Je = C0JX.LIZJ;
                    if (interfaceC05420Je != null) {
                        interfaceC05420Je.LIZIZ();
                    }
                    C05440Jg.LIZJ(GameCastWiredWidget.class, false);
                    C0JX.LJIIIZ(C0JX.LJII);
                }

                @Override // com.byted.cast.common.api.IConnectListener
                public final void onConnect(ServiceInfo serviceInfo, int i) {
                    String str;
                    if (serviceInfo != null) {
                        str = serviceInfo.protocols;
                    } else {
                        str = null;
                    }
                    if (!o.LJ(str, "UsbSource")) {
                        return;
                    }
                    C0NB.LIZIZ("GameWiredCastManager", "onConnect,  --wiredManager");
                    InterfaceC05420Je interfaceC05420Je = C0JX.LIZJ;
                    if (interfaceC05420Je != null) {
                        interfaceC05420Je.LJ();
                    }
                    JSONObject LIZLLL3 = C770830u.LIZLLL("extra", i);
                    LIZLLL3.put("serviceInfo", serviceInfo.toString());
                    LIZLLL3.put("isWireless", false);
                    C0K2.LJIIIIZZ("ttlive_game_cast_connect_succeed", 1, LIZLLL3);
                }

                @Override // com.byted.cast.common.api.IConnectListener
                public final void onDisconnect(ServiceInfo serviceInfo, int i, int i2) {
                    String str;
                    String str2;
                    if (serviceInfo != null) {
                        str = serviceInfo.protocols;
                    } else {
                        str = null;
                    }
                    if (!o.LJ(str, "UsbSource")) {
                        return;
                    }
                    C012403c.LJ("onDisconnect,  --wiredManager, what: ", i, "GameWiredCastManager");
                    C0JW.LIZ.getClass();
                    if (i == 406) {
                        str2 = "LS_disconnect";
                    } else {
                        str2 = "error";
                    }
                    C0JV.LJIIIZ(str2, false);
                    InterfaceC05420Je interfaceC05420Je = C0JX.LIZJ;
                    if (interfaceC05420Je != null) {
                        interfaceC05420Je.LIZLLL(i);
                    }
                    C05440Jg.LIZJ(GameCastWiredWidget.class, false);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("isWireless", false);
                    jSONObject2.put("extra", i2);
                    jSONObject2.put("serviceInfo", serviceInfo.toString());
                    jSONObject2.put("what", i);
                    C0K2.LJIIIIZZ("ttlive_game_cast_disConnect", 0, jSONObject2);
                }

                @Override // com.byted.cast.common.source.IMirrorListener
                public final void onError(int i, int i2, int i3, String str) {
                    boolean z;
                    if (i != 10) {
                        return;
                    }
                    StringBuilder LIZJ2 = C06460Ne.LIZJ("onError,  --wiredManager what: ", i2, " code: ", i3, " msg: ");
                    C31811Ce7.LJ(LIZJ2, str, LIZJ2, "GameWiredCastManager");
                    if (i2 != 4001 && i2 != 14004001) {
                        z = true;
                    } else {
                        z = false;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("isWireless", false);
                    jSONObject2.put("id", i);
                    jSONObject2.put("what", i2);
                    jSONObject2.put("errorCode", i3);
                    jSONObject2.put("msg", str);
                    C0K2.LJIIIIZZ("ttlive_game_cast_onError", 1, jSONObject2);
                    C0JX.LJII(z);
                    InterfaceC05420Je interfaceC05420Je = C0JX.LIZJ;
                    if (interfaceC05420Je != null) {
                        interfaceC05420Je.LJFF(i2);
                    }
                    C05440Jg.LIZJ(GameCastWiredWidget.class, false);
                }
            });
        }
        LIZ = c90459Zep;
    }

    public static void LIZLLL(final Fragment fragment) {
        C90436ZeS LIZLLL2;
        C90459Zep c90459Zep = LIZ;
        if (c90459Zep != null && (LIZLLL2 = c90459Zep.LIZLLL()) != null) {
            LIZLLL2.LJFF(new ISurfaceListener() { // from class: X.1GD
                @Override // com.byted.cast.common.api.ISurfaceListener
                public final void surfaceAvailable(Surface surface, int i, int i2) {
                    Object LIZ2;
                    if (surface == null) {
                        return;
                    }
                    C05380Ja c05380Ja = C0JX.LIZLLL;
                    if (c05380Ja != null) {
                        c05380Ja.LIZLLL(i, i2);
                    }
                    C05380Ja c05380Ja2 = C0JX.LIZLLL;
                    if (c05380Ja2 != null) {
                        c05380Ja2.LJ(surface);
                    }
                    Fragment fragment2 = Fragment.this;
                    if (fragment2 != null) {
                        try {
                            ActivityC45651qj requireActivity = fragment2.requireActivity();
                            o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
                            C0JX.LJI(requireActivity);
                            if (!C0JX.LJFF) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("isWireless", false);
                                C0K2.LJIIIIZZ("ttlive_game_cast_start_request", 1, jSONObject);
                                C05380Ja c05380Ja3 = C0JX.LIZLLL;
                                if (c05380Ja3 != null) {
                                    c05380Ja3.LIZJ(20001, fragment2);
                                }
                                C0JX.LJFF = true;
                            }
                            LIZ2 = C76800UCe.LIZ;
                            C3C5.m7constructorimpl(LIZ2);
                        } catch (Throwable th) {
                            LIZ2 = C141335gf.LIZ(th);
                            C3C5.m7constructorimpl(LIZ2);
                        }
                        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
                        if (m10exceptionOrNullimpl != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("isWireless", false);
                            C0K2.LJIIIIZZ("ttlive_game_cast_start_service", 0, jSONObject2);
                            C0JX.LJFF = false;
                            C0NB.LJI("GameWiredCastManager", m10exceptionOrNullimpl);
                        }
                    }
                }
            });
        }
    }

    public static final void LJFF(Fragment fragment) {
        C90436ZeS LIZLLL2;
        if (fragment == null) {
            return;
        }
        if (!LJI) {
            C0NB.LIZIZ("GameWiredCastManager", "startMirror, not init --wiredManager");
            return;
        }
        C0NB.LIZIZ("GameWiredCastManager", "startMirror, start --wiredManager");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWireless", false);
        C0K2.LJIIIIZZ("ttlive_game_cast_start_mirror", 1, jSONObject);
        LJ();
        LIZLLL(fragment);
        C90459Zep c90459Zep = LIZ;
        if (c90459Zep != null && (LIZLLL2 = c90459Zep.LIZLLL()) != null) {
            LIZLLL2.LJIIIZ("UsbSource");
        }
    }

    public static final void LJI(ActivityC45651qj activityC45651qj) {
        if (LJ) {
            C0NB.LIZIZ("GameWiredCastManager", "start fail hasStartService true");
            return;
        }
        C0JW.LIZ.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(activityC45651qj, (Class<?>) ForegroundMirrorCastService.class));
            activityC45651qj.startForegroundService(intent);
        } else {
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(activityC45651qj, (Class<?>) ForegroundMirrorCastService.class));
            C16880lQ.LLLL(activityC45651qj, intent2);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWireless", false);
        C0K2.LJIIIIZZ("ttlive_game_cast_start_service", 1, jSONObject);
        LJ = true;
    }

    public static final void LJII(boolean z) {
        Context context;
        C73666Sve c73666Sve;
        C90436ZeS LIZLLL2;
        if (!LJI) {
            C0NB.LIZIZ("GameWiredCastManager", "not stopMirror, hasInit is false");
            return;
        }
        C0NB.LIZIZ("GameWiredCastManager", "stopMirror, stop --wiredManager");
        LJII = z;
        C90459Zep c90459Zep = LIZ;
        if (c90459Zep != null && (LIZLLL2 = c90459Zep.LIZLLL()) != null) {
            LIZLLL2.LJIIJJI("UsbSource");
        }
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null) {
            context = iHostAppContext.context();
        } else {
            context = null;
        }
        LJIIIIZZ(context);
        try {
            C73666Sve c73666Sve2 = LJIIIIZZ;
            if ((c73666Sve2 == null || !c73666Sve2.isDisposed()) && (c73666Sve = LJIIIIZZ) != null) {
                c73666Sve.dispose();
            }
            LJIIIZ = 0L;
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWireless", false);
        jSONObject.put("needRelease", z);
        C0K2.LJIIIIZZ("ttlive_game_cast_stop_mirror", 1, jSONObject);
    }

    public static final void LJIIIIZZ(Context context) {
        if (context == null) {
            return;
        }
        C0JW.LIZ.getClass();
        C0JW.LJII(context);
        if (!LJ) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWireless", false);
        C0K2.LJIIIIZZ("ttlive_game_cast_stop_service", 1, jSONObject);
        LJ = false;
    }

    public static final void LJIIIZ(boolean z) {
        C10S.LIZ("needRelease: ", z, "GameWiredCastManager");
        if (z) {
            LIZIZ();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isWireless", false);
            C0K2.LJIIIIZZ("ttlive_game_cast_release_sdk", 1, jSONObject);
        }
    }

    public static final void LIZ(int i, int i2, Intent intent) {
        C90436ZeS LIZLLL2;
        long j;
        MediaProjection mediaProjection;
        C90459Zep c90459Zep;
        C90436ZeS LIZLLL3;
        if (i != 20001) {
            return;
        }
        LJFF = false;
        if (i2 == -1 && intent != null) {
            C05380Ja c05380Ja = LIZLLL;
            if (c05380Ja != null) {
                c05380Ja.LJFF(i2, intent);
            }
            C05380Ja c05380Ja2 = LIZLLL;
            if (c05380Ja2 != null) {
                c05380Ja2.LIZ();
            }
            C05380Ja c05380Ja3 = LIZLLL;
            if (c05380Ja3 != null && (mediaProjection = c05380Ja3.LIZLLL) != null && (c90459Zep = LIZ) != null && (LIZLLL3 = c90459Zep.LIZLLL()) != null) {
                LIZLLL3.LJI(mediaProjection);
            }
            InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
            if (LIZIZ2 != null) {
                j = ((C29374Bfu) LIZIZ2).getCurrentUserId();
            } else {
                j = 0;
            }
            LJIIIZ = j;
            LJIIIIZZ = (C73666Sve) ((C29374Bfu) B83.LIZ().LIZIZ()).LJI.LJIIIZ(new InterfaceC64592gB() { // from class: X.1GC
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    long j2;
                    C29383Bg3 c29383Bg3 = (C29383Bg3) obj;
                    long j3 = C0JX.LJIIIZ;
                    InterfaceC29405BgP LIZIZ3 = B83.LIZ().LIZIZ();
                    if (LIZIZ3 != null) {
                        j2 = ((C29374Bfu) LIZIZ3).getCurrentUserId();
                    } else {
                        j2 = 0;
                    }
                    if (j3 != j2 || (c29383Bg3 != null && c29383Bg3.LIZ == EnumC05180Ig.Logout)) {
                        C0JX.LJII(true);
                    }
                }
            });
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isWireless", false);
            jSONObject.put("requestCode", i);
            jSONObject.put("resultCode", i2);
            jSONObject.put("data", intent.toString());
            C0K2.LJIIIIZZ("ttlive_game_cast_result", 1, jSONObject);
            return;
        }
        C90459Zep c90459Zep2 = LIZ;
        if (c90459Zep2 != null && (LIZLLL2 = c90459Zep2.LIZLLL()) != null) {
            LIZLLL2.LJI(null);
        }
        C90459Zep c90459Zep3 = LIZ;
        if (c90459Zep3 != null) {
            c90459Zep3.LJIIIZ();
        }
        LJII(false);
        InterfaceC05420Je interfaceC05420Je = LIZJ;
        if (interfaceC05420Je != null) {
            interfaceC05420Je.LJFF(14004001);
        }
        C05440Jg.LIZJ(GameCastWiredWidget.class, false);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("isWireless", false);
        jSONObject2.put("requestCode", i);
        jSONObject2.put("resultCode", i2);
        jSONObject2.put("data", String.valueOf(intent));
        C0K2.LJIIIIZZ("ttlive_game_cast_result", 0, jSONObject2);
    }
}
