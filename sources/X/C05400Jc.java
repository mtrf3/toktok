package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import androidx.fragment.app.Fragment;
import com.byted.cast.common.CommonOptionConstants;
import com.byted.cast.common.api.IBrowseListener;
import com.byted.cast.common.api.ILogger;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.common.api.MirrorInfo;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.source.IMirrorListener;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.source.Statistics;
import com.bytedance.android.live.broadcast.mirror.MirrorCastDevicesChannel;
import com.bytedance.android.live.broadcast.mirror.MirrorCastInitChannel;
import com.bytedance.android.live.broadcast.mirror.widget.GameCastWirelessWidget;
import com.bytedance.android.live.broadcast.service.ForegroundMirrorCastService;
import com.bytedance.android.livesdk.dataChannel.LiveCastChannel;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0Jc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05400Jc {
    public static C90459Zep LIZJ;
    public static C05380Ja LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static ServiceInfo LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static long LJIIJ;
    public static C73666Sve LJIIJJI;
    public static UUID LJIIL;
    public static final HandlerC05390Jb LJIILIIL;
    public static final C05400Jc LIZ = new C05400Jc();
    public static final boolean LIZIZ = C30922CBq.LIZIZ;
    public static final AtomicBoolean LJIIIZ = new AtomicBoolean(false);

    public static void LIZLLL() {
        LJFF = true;
        DataChannelGlobal.LJLJJI.tv0(LiveCastChannel.class, EnumC135205Si.BROWSING);
        C90459Zep c90459Zep = LIZJ;
        if (c90459Zep != null) {
            c90459Zep.LJIIJJI(10033, Boolean.TRUE);
        }
        LJIIL = UUID.randomUUID();
        HandlerC05390Jb handlerC05390Jb = LJIILIIL;
        Message obtain = Message.obtain();
        obtain.what = 10087;
        obtain.obj = LJIIL;
        handlerC05390Jb.sendMessageDelayed(obtain, 20000L);
        C90459Zep c90459Zep2 = LIZJ;
        if (c90459Zep2 != null) {
            c90459Zep2.LJIILJJIL();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWireless", true);
        C0K2.LJIIIIZZ("ttlive_game_cast_start_browse", 1, jSONObject);
        LIZIZ("on begin device browsing..");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Jb] */
    static {
        final Looper LLJJJJ = C16880lQ.LLJJJJ();
        LJIILIIL = new Handler(LLJJJJ) { // from class: X.0Jb
            @Override // android.os.Handler
            public final void handleMessage(Message msg) {
                o.LJIIIZ(msg, "msg");
                if (msg.what == 10087) {
                    Object obj = msg.obj;
                    if ((obj instanceof UUID) && o.LJ(obj, C05400Jc.LJIIL)) {
                        DataChannelGlobal.LJLJJI.tv0(LiveCastChannel.class, EnumC135205Si.ERROR);
                        C05400Jc.LJIIJJI();
                        C0JV.LJIIJJI(10088, 0);
                    }
                }
            }
        };
        LJ();
    }

    public static void LJ() {
        if (LIZJ != null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isCasting", LJII);
        jSONObject.put("isWireless", true);
        jSONObject.put("bindSdkSucceed", LJIIIIZZ);
        C0K2.LJIIIIZZ("ttlive_game_cast_init_sdk", -1, jSONObject);
        Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        if (C21090sD.LIZ(context)) {
            LIZJ = new C90459Zep();
            LJIIIIZZ();
            C90459Zep c90459Zep = LIZJ;
            if (c90459Zep != null) {
                C0JW c0jw = C0JW.LIZ;
                boolean z = LIZIZ;
                c0jw.getClass();
                c90459Zep.LJII(context, C0JW.LIZJ("ByteCast", z), new IInitListener() { // from class: X.1GJ
                    @Override // com.byted.cast.common.config.IInitListener
                    public final void onSuccess() {
                        C05400Jc.LJIIIIZZ = true;
                        DataChannelGlobal.LJLJJI.tv0(MirrorCastInitChannel.class, Boolean.TRUE);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("isWireless", true);
                        C0K2.LJIIIIZZ("ttlive_game_cast_init_sdk", 1, jSONObject2);
                    }

                    @Override // com.byted.cast.common.config.IInitListener
                    public final void onFail(int i, String str, Exception exc) {
                        C05400Jc.LJIIIIZZ = false;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("isWireless", true);
                        jSONObject2.put("errCode", i);
                        jSONObject2.put("errMsg", str);
                        jSONObject2.put("e", exc);
                        C0K2.LJIIIIZZ("ttlive_game_cast_init_sdk", 0, jSONObject2);
                    }
                });
            }
            C90459Zep c90459Zep2 = LIZJ;
            if (c90459Zep2 != null) {
                C0JW.LIZ.getClass();
                C0JW.LJFF(c90459Zep2);
            }
            LJIIIZ();
            C90459Zep c90459Zep3 = LIZJ;
            if (c90459Zep3 != null) {
                c90459Zep3.LJIIJJI(10018, "ByteLink");
            }
        }
        LJFF();
        o.LJIIIIZZ(context, "context");
        LIZLLL = new C05380Ja(context);
    }

    public static void LJFF() {
        String str;
        C90459Zep c90459Zep = LIZJ;
        if (c90459Zep != null) {
            c90459Zep.LJIIIIZZ(new IBrowseListener() { // from class: X.1GG
                @Override // com.byted.cast.common.api.IBrowseListener
                public final /* synthetic */ void onBrowseInvalidDevice(int i, List list) {
                    ZZR.LIZ(this, i, list);
                }

                @Override // com.byted.cast.common.api.IBrowseListener
                public final /* synthetic */ void onError(int i, String str2) {
                    ZZR.LIZIZ(this, i, str2);
                }

                @Override // com.byted.cast.common.api.IBrowseListener
                public final void onBrowse(int i, List<ServiceInfo> serviceInfos) {
                    C05400Jc.LJIIL = null;
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                    o.LJIIIIZZ(serviceInfos, "serviceInfos");
                    dataChannelGlobal.tv0(MirrorCastDevicesChannel.class, new C1GF(serviceInfos));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("on devices founded, list[");
                    LIZ2.append(serviceInfos);
                    LIZ2.append(']');
                    C05400Jc.LIZIZ(X1D.LIZIZ(LIZ2));
                }
            });
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("byteCast init version: ------> ");
        C90459Zep c90459Zep2 = LIZJ;
        if (c90459Zep2 != null) {
            str = c90459Zep2.LJI();
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZIZ(X1D.LIZIZ(LIZ2));
    }

    public static void LJII() {
        C05380Ja c05380Ja = LIZLLL;
        if (c05380Ja != null) {
            c05380Ja.LIZIZ();
        }
        C90459Zep c90459Zep = LIZJ;
        if (c90459Zep != null) {
            c90459Zep.LIZIZ();
        }
        LIZJ = null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWireless", true);
        C0K2.LJIIIIZZ("ttlive_game_cast_release_sdk", 1, jSONObject);
    }

    public static void LJIIIIZZ() {
        C90436ZeS LIZLLL2;
        C90459Zep c90459Zep = LIZJ;
        if (c90459Zep != null && (LIZLLL2 = c90459Zep.LIZLLL()) != null) {
            LIZLLL2.LJIIIIZZ(new IMirrorListener() { // from class: X.1jA
                @Override // com.byted.cast.common.api.IConnectListener
                public final /* synthetic */ void onConnect(ServiceInfo serviceInfo, int i) {
                    ZZU.LIZ(this, serviceInfo, i);
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
                    if (i != 3) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("isWireless", true);
                    jSONObject.put("serviceId", i);
                    C0K2.LJIIIIZZ("ttlive_game_cast_onStart", 1, jSONObject);
                    C0NB.LJ("cast_wired", "onStar - less");
                    C05440Jg.LIZJ(GameCastWirelessWidget.class, true);
                }

                @Override // com.byted.cast.common.source.IMirrorListener
                public final void onStop(int i) {
                    if (i != 3) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("isWireless", true);
                    jSONObject.put("serviceId", i);
                    C0K2.LJIIIIZZ("ttlive_game_cast_onStop", 1, jSONObject);
                    C0NB.LJ("cast_wired", "onStop wireless - m");
                }

                @Override // com.byted.cast.common.api.IConnectListener
                public final void onDisconnect(ServiceInfo serviceInfo, int i, int i2) {
                    String str;
                    if (serviceInfo != null) {
                        str = serviceInfo.protocols;
                    } else {
                        str = null;
                    }
                    if (!o.LJ(str, "ByteLink")) {
                        return;
                    }
                    C05400Jc.LIZIZ("onDisconnect");
                    C05400Jc.LIZJ(i, i2, false);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("extra", i2);
                    jSONObject.put("serviceInfo", serviceInfo.toString());
                    jSONObject.put("isWireless", true);
                    jSONObject.put("what", i);
                    C0K2.LJIIIIZZ("ttlive_game_cast_disConnect", 0, jSONObject);
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
                @Override // com.byted.cast.common.source.IMirrorListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onError(int r5, int r6, int r7, java.lang.String r8) {
                    /*
                        r4 = this;
                        r0 = 3
                        if (r5 == r0) goto L4
                        return
                    L4:
                        java.lang.Exception r3 = new java.lang.Exception
                        r3.<init>()
                        java.lang.StringBuilder r1 = X.X1D.LIZ()
                        java.lang.String r0 = "Cast_Error, what="
                        r1.append(r0)
                        r1.append(r6)
                        java.lang.String r2 = ",extra="
                        r1.append(r2)
                        r1.append(r7)
                        java.lang.String r0 = X.X1D.LIZIZ(r1)
                        X.C0K2.LIZ(r0, r3)
                        java.lang.StringBuilder r1 = X.X1D.LIZ()
                        java.lang.String r0 = "mirror_play_error what="
                        r1.append(r0)
                        r1.append(r6)
                        r1.append(r2)
                        r1.append(r7)
                        java.lang.String r1 = X.X1D.LIZIZ(r1)
                        java.lang.String r0 = "GameLive_ByteCast"
                        X.C0NB.LJ(r0, r1)
                        r2 = 1
                        X.C05400Jc.LIZJ(r6, r7, r2)
                        r0 = 210010(0x3345a, float:2.94287E-40)
                        if (r6 != r0) goto L78
                        java.lang.String r0 = "on casting devices no response...."
                        X.C05400Jc.LIZIZ(r0)
                    L4d:
                        org.json.JSONObject r3 = new org.json.JSONObject
                        r3.<init>()
                        java.lang.String r1 = "isCasting"
                        boolean r0 = X.C05400Jc.LJII
                        r3.put(r1, r0)
                        java.lang.String r0 = "isWireless"
                        r3.put(r0, r2)
                        java.lang.String r0 = "id"
                        r3.put(r0, r5)
                        java.lang.String r0 = "what"
                        r3.put(r0, r6)
                        java.lang.String r0 = "extra"
                        r3.put(r0, r7)
                        java.lang.String r0 = "msg"
                        r3.put(r0, r8)
                        java.lang.String r0 = "ttlive_game_cast_onError"
                        X.C0K2.LJIIIIZZ(r0, r2, r3)
                        return
                    L78:
                        r1 = 0
                        r0 = 211005(0x3383d, float:2.95681E-40)
                        if (r6 != r0) goto L85
                        r0 = 22008(0x55f8, float:3.084E-41)
                        if (r7 != r0) goto L87
                        X.C05400Jc.LJIIIIZZ = r1
                        goto L4d
                    L85:
                        if (r6 != r0) goto L8e
                    L87:
                        r0 = 30014(0x753e, float:4.2059E-41)
                        if (r7 != r0) goto L9a
                        X.C05400Jc.LJIIIIZZ = r1
                        goto L4d
                    L8e:
                        r0 = 212001(0x33c21, float:2.97077E-40)
                        if (r6 != r0) goto L9a
                        r0 = 2131837448(0x7f114208, float:1.9308091E38)
                        X.C30868C9o.LIZJ(r0)
                        goto L4d
                    L9a:
                        java.lang.StringBuilder r1 = X.X1D.LIZ()
                        java.lang.String r0 = "on casting error.."
                        r1.append(r0)
                        r1.append(r6)
                        java.lang.String r0 = " -> "
                        r1.append(r0)
                        r1.append(r7)
                        java.lang.String r0 = X.X1D.LIZIZ(r1)
                        X.C05400Jc.LIZIZ(r0)
                        goto L4d
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C40961jA.onError(int, int, int, java.lang.String):void");
                }

                @Override // com.byted.cast.common.source.IMirrorListener
                public final void onInfo(int i, int i2, int i3, String str) {
                    if (i != 3) {
                        return;
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("onInfo what=");
                    LIZ2.append(i2);
                    LIZ2.append(",extra=");
                    LIZ2.append(i3);
                    C0NB.LJ("GameLive_ByteCast", X1D.LIZIZ(LIZ2));
                    if (i2 == 211032) {
                        C05400Jc.LIZJ(i2, i3, true);
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("isCasting", C05400Jc.LJII);
                    jSONObject.put("isWireless", true);
                    jSONObject.put("id", i);
                    jSONObject.put("what", i2);
                    jSONObject.put("extra", i3);
                    jSONObject.put("msg", str);
                    C0K2.LJIIIIZZ("ttlive_game_cast_onInfo", 1, jSONObject);
                }
            });
        }
    }

    public static void LJIIIZ() {
        C90459Zep c90459Zep = LIZJ;
        if (c90459Zep != null) {
            c90459Zep.LJIIJJI(100042, new ILogger() { // from class: X.1GH
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
        C90459Zep c90459Zep2 = LIZJ;
        o.LJI(c90459Zep2);
        c90459Zep2.LJIIJJI(CommonOptionConstants.OPTION_SET_FILE_LOG_ENABLED, Boolean.TRUE);
    }

    public static void LJIIJJI() {
        if (!LJFF) {
            return;
        }
        LJFF = false;
        C90459Zep c90459Zep = LIZJ;
        if (c90459Zep != null) {
            c90459Zep.LJIILL();
        }
        LIZIZ("on device browsing stopped...");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWireless", true);
        C0K2.LJIIIIZZ("ttlive_game_cast_stop_browse", 1, jSONObject);
    }

    public final void LIZ() {
        if (!LJIIIIZZ) {
            LJ();
        }
        if (LJFF) {
            return;
        }
        if (LJIIIIZZ) {
            LIZLLL();
        } else {
            DataChannelGlobal.LJLJJI.pv0(MirrorCastInitChannel.class, this, new IDqS416S0100000(this, 46));
        }
    }

    public static void LJIIL() {
        C73666Sve c73666Sve;
        LJIIJJI();
        Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        o.LJIIIIZZ(context, "getService(IHostAppContext::class.java).context()");
        LJIILIIL(context, false);
        try {
            C73666Sve c73666Sve2 = LJIIJJI;
            if ((c73666Sve2 == null || !c73666Sve2.isDisposed()) && (c73666Sve = LJIIJJI) != null) {
                c73666Sve.dispose();
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static void LIZIZ(String str) {
        C0NB.LIZIZ("GameLive_ByteCast", str);
    }

    public static void LJIIJ(ServiceInfo castInfo, final Fragment fragment) {
        int i;
        C90436ZeS LIZLLL2;
        C90436ZeS LIZLLL3;
        C90436ZeS LIZLLL4;
        o.LJIIIZ(castInfo, "castInfo");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("before  start mirror to ");
        LIZ2.append(castInfo);
        LIZIZ(X1D.LIZIZ(LIZ2));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWireless", true);
        C0K2.LJIIIIZZ("ttlive_game_cast_start_mirror", 1, jSONObject);
        LJIIJJI();
        LJI = castInfo;
        C05380Ja c05380Ja = LIZLLL;
        if (c05380Ja != null) {
            c05380Ja.LIZLLL(castInfo.width, castInfo.height);
        }
        C90459Zep c90459Zep = LIZJ;
        if (c90459Zep != null && (LIZLLL4 = c90459Zep.LIZLLL()) != null) {
            LIZLLL4.LJFF(new ISurfaceListener() { // from class: X.1GI
                @Override // com.byted.cast.common.api.ISurfaceListener
                public final void surfaceAvailable(Surface surface, int i2, int i3) {
                    Object LIZ3;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("try request : surface = ");
                    LIZ4.append(surface);
                    C05400Jc.LIZIZ(X1D.LIZIZ(LIZ4));
                    if (surface == null) {
                        DataChannelGlobal.LJLJJI.tv0(LiveCastChannel.class, EnumC135205Si.ERROR);
                        C0JV.LJIIJJI(10089, 0);
                        return;
                    }
                    C05380Ja c05380Ja2 = C05400Jc.LIZLLL;
                    if (c05380Ja2 != null) {
                        o.LJIIIIZZ(surface, "surface");
                        c05380Ja2.LJ(surface);
                    }
                    Fragment fragment2 = Fragment.this;
                    if (fragment2 != null) {
                        try {
                            ActivityC45651qj requireActivity = fragment2.requireActivity();
                            o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
                            C0NB.LIZIZ("GameLive_ByteCast", "startService");
                            C0JW.LIZ.getClass();
                            if (Build.VERSION.SDK_INT >= 26) {
                                Intent intent = new Intent();
                                intent.setComponent(new ComponentName(requireActivity, (Class<?>) ForegroundMirrorCastService.class));
                                requireActivity.startForegroundService(intent);
                            } else {
                                Intent intent2 = new Intent();
                                intent2.setComponent(new ComponentName(requireActivity, (Class<?>) ForegroundMirrorCastService.class));
                                C16880lQ.LLLL(requireActivity, intent2);
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("isWireless", true);
                            C0K2.LJIIIIZZ("ttlive_game_cast_start_service", 1, jSONObject2);
                            C05400Jc.LJ = true;
                            AtomicBoolean atomicBoolean = C05400Jc.LJIIIZ;
                            if (!atomicBoolean.get()) {
                                C05380Ja c05380Ja3 = C05400Jc.LIZLLL;
                                if (c05380Ja3 != null) {
                                    c05380Ja3.LIZJ(20086, fragment2);
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("isWireless", true);
                                C0K2.LJIIIIZZ("ttlive_game_cast_start_request", 1, jSONObject3);
                                atomicBoolean.set(true);
                            }
                            LIZ3 = C76800UCe.LIZ;
                            C3C5.m7constructorimpl(LIZ3);
                        } catch (Throwable th) {
                            LIZ3 = C141335gf.LIZ(th);
                            C3C5.m7constructorimpl(LIZ3);
                        }
                        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ3);
                        if (m10exceptionOrNullimpl != null) {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("isWireless", true);
                            C0K2.LJIIIIZZ("ttlive_game_cast_start_service", 0, jSONObject4);
                            C05400Jc.LJIIIZ.set(false);
                            C0NB.LJI("GameLive_ByteCast", m10exceptionOrNullimpl);
                            C0JV.LJIIJJI(10091, 0);
                        }
                        C05400Jc.LIZIZ("try request for mirror display permission....");
                    }
                }
            });
        }
        C90459Zep c90459Zep2 = LIZJ;
        if (c90459Zep2 != null) {
            c90459Zep2.LJIIJJI(10012, 2);
        }
        C90459Zep c90459Zep3 = LIZJ;
        if (c90459Zep3 != null) {
            c90459Zep3.LJIIJJI(10013, "xxx-v-display");
        }
        MirrorInfo mirrorInfo = new MirrorInfo();
        mirrorInfo.enableEncodeSizeToScreen(true);
        mirrorInfo.setVirtualDisplayFlag(2);
        mirrorInfo.setVirtualDisplayName("xxx-v-display");
        ServiceInfo serviceInfo = LJI;
        if (serviceInfo != null) {
            i = serviceInfo.fps;
        } else {
            i = 30;
        }
        mirrorInfo.setFps(i);
        mirrorInfo.setServiceInfo(LJI);
        if (Build.VERSION.SDK_INT >= 29) {
            mirrorInfo.setAudioEnable(true);
            mirrorInfo.setAudioSource(3);
        } else {
            mirrorInfo.setAudioEnable(false);
            C90459Zep c90459Zep4 = LIZJ;
            if (c90459Zep4 != null) {
                c90459Zep4.LJIIJJI(10017, Boolean.FALSE);
            }
        }
        mirrorInfo.setAutoBitrate(false);
        mirrorInfo.setBitRateLevel(4);
        mirrorInfo.setVideoSrc(2);
        mirrorInfo.setCameraId(0);
        mirrorInfo.setServerMode(1);
        mirrorInfo.setResolutionLevel(3);
        C90459Zep c90459Zep5 = LIZJ;
        if (c90459Zep5 != null && (LIZLLL3 = c90459Zep5.LIZLLL()) != null) {
            LIZLLL3.LJII(mirrorInfo);
        }
        C90459Zep c90459Zep6 = LIZJ;
        if (c90459Zep6 != null && (LIZLLL2 = c90459Zep6.LIZLLL()) != null) {
            LIZLLL2.LJIIIZ("ByteLink");
        }
    }

    public static void LJIILIIL(Context context, boolean z) {
        C90436ZeS LIZLLL2;
        LIZIZ("on mirror stopped..");
        LJII = false;
        LJIIJ = 0L;
        C0NB.LIZIZ("GameLive_ByteCast", "stopService");
        try {
            if (LJ) {
                C0JW.LIZ.getClass();
                C0JW.LJII(context);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isWireless", true);
                C0K2.LJIIIIZZ("ttlive_game_cast_stop_service", 1, jSONObject);
                LJ = false;
            }
        } catch (Throwable th) {
            C0NB.LIZLLL(th.getMessage());
        }
        C90459Zep c90459Zep = LIZJ;
        if (c90459Zep != null && (LIZLLL2 = c90459Zep.LIZLLL()) != null) {
            LIZLLL2.LJIIJJI("ByteLink");
        }
        C05380Ja c05380Ja = LIZLLL;
        if (c05380Ja != null) {
            c05380Ja.LIZIZ();
        }
        if (!z) {
            DataChannelGlobal.LJLJJI.tv0(LiveCastChannel.class, EnumC135205Si.STOPPED);
        }
        C05440Jg.LIZJ(GameCastWirelessWidget.class, false);
        C0NB.LJ("cast_wired", "stopMirror - less");
        LIZIZ("on mirror stopped..");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("isWireless", true);
        C0K2.LJIIIIZZ("ttlive_game_cast_stop_mirror", 1, jSONObject2);
    }

    public static void LIZJ(int i, int i2, boolean z) {
        String str;
        EnumC135205Si enumC135205Si;
        if (LJII || z) {
            C0JV.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2));
        }
        Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        o.LJIIIIZZ(context, "context");
        LJIILIIL(context, z);
        C0JW.LIZ.getClass();
        if (i == 211032) {
            str = "LS_disconnect";
        } else {
            str = "error";
        }
        C0JV.LJIIIZ(str, true);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        if (z) {
            enumC135205Si = EnumC135205Si.ERROR;
        } else {
            enumC135205Si = EnumC135205Si.STOPPED;
        }
        dataChannelGlobal.tv0(LiveCastChannel.class, enumC135205Si);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        if (r11 == 20086) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJI(int r11, int r12, android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05400Jc.LJI(int, int, android.content.Intent):boolean");
    }
}
