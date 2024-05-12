package X;

import android.content.Context;
import android.text.TextUtils;
import com.byted.cast.common.Logger;
import com.byted.cast.common.api.CodecType;
import com.byted.cast.common.api.IBindSdkInfoListener;
import com.byted.cast.common.api.ISendResultListener;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.sink.CastInfo;
import com.byted.cast.common.sink.ClientInfo;
import com.byted.cast.common.sink.IMessageListener;
import com.byted.cast.common.sink.IMirrorListener;
import com.byted.cast.common.sink.IServerListener;
import com.byted.cast.common.sink.ServerInfo;
import com.byted.cast.common.sink.ServiceInfo;
import com.byted.cast.common.sink.Statistics;
import com.bytedance.android.live.broadcast.mirror.message.DualLiveStateMessage;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.16t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C276716t {
    public static boolean LJFF;
    public static int LJI;
    public static boolean LJII;
    public static C39411gf<InterfaceC277016w> LJIIIIZZ;
    public static C39401ge<InterfaceC276916v> LJIIIZ;
    public static ClientInfo LJIIJ;
    public static final boolean LIZ = C30922CBq.LIZIZ;
    public static final C73849Syb<EnumC12710eh> LIZIZ = new C73849Syb<>();
    public static final C73849Syb<EnumC276816u> LIZJ = C73849Syb.LJJZZI(EnumC276816u.StateIdle);
    public static final C73849Syb<Boolean> LIZLLL = new C73849Syb<>();
    public static final C73849Syb<Boolean> LJ = new C73849Syb<>();
    public static final HashMap<String, CastInfo> LJIIJJI = new HashMap<>();

    public static boolean LIZJ() {
        EnumC276816u LJJZZIII = LIZJ.LJJZZIII();
        if (LJJZZIII == null || LJJZZIII != EnumC276816u.StateConnected) {
            return false;
        }
        return true;
    }

    public static void LJFF() {
        C0NB.LJIIL("GameCastLink", "stop server");
        if (!LJFF) {
            return;
        }
        LIZJ.onNext(EnumC276816u.StateIdle);
        try {
            LJI();
        } catch (NoClassDefFoundError e) {
            if (!LIZ) {
                C0NB.LJFF("GameCastLink", "NoClassDefFoundError the df_live_plugin is not ready", e);
            } else {
                throw e;
            }
        }
        C39411gf<InterfaceC277016w> c39411gf = LJIIIIZZ;
        if (c39411gf != null) {
            c39411gf.LJLIL.clear();
        }
        C39401ge<InterfaceC276916v> c39401ge = LJIIIZ;
        if (c39401ge != null) {
            c39401ge.LJLIL.clear();
        }
        LJFF = false;
    }

    public static void LJI() {
        C90552ZgK.LIZIZ().LJIIIZ();
        C90552ZgK.LIZIZ().LIZ();
    }

    public static void LIZIZ(Context context) {
        C90552ZgK LIZIZ2 = C90552ZgK.LIZIZ();
        boolean z = LIZ;
        if (z) {
            Logger.setLogLevel(4);
        }
        LIZIZ2.LJI(10032, Boolean.FALSE);
        LIZIZ2.LJI(10009, "ByteLink");
        LIZIZ2.LJI(10077, 3);
        LIZIZ2.LJI(10000, new IBindSdkInfoListener() { // from class: X.1gb
            @Override // com.byted.cast.common.api.IBindSdkInfoListener
            public final void onByteCastFail(int i, String str, Exception exc) {
            }

            @Override // com.byted.cast.common.api.IBindSdkInfoListener
            public final void onByteCastSuccess() {
            }

            @Override // com.byted.cast.common.api.IBindSdkInfoListener
            public final void onLelinkFail(int i, String str, Exception exc) {
            }

            @Override // com.byted.cast.common.api.IBindSdkInfoListener
            public final void onLelinkSuccess() {
            }
        });
        LIZIZ2.LJII(new IServerListener() { // from class: X.1ga
            @Override // com.byted.cast.common.sink.IServerListener
            public final void onStop(int i) {
                C276716t.LIZJ.onNext(EnumC276816u.StateServerStop);
                C276716t.LJFF = false;
                B4U.LIZ().LLJIJIL = 0;
            }

            @Override // com.byted.cast.common.sink.IServerListener
            public final void onConnect(int i, ClientInfo clientInfo) {
                if (C276716t.LJIIJ == null) {
                    C276716t.LJIIJ = clientInfo;
                    C276716t.LIZJ.onNext(EnumC276816u.StateConnected);
                }
                B4U.LIZ().LLJIJIL = 1;
            }

            @Override // com.byted.cast.common.sink.IServerListener
            public final void onDisconnect(int i, ClientInfo clientInfo) {
                String str;
                String str2;
                if (clientInfo != null) {
                    str = clientInfo.clientID;
                } else {
                    str = null;
                }
                ClientInfo clientInfo2 = C276716t.LJIIJ;
                if (clientInfo2 != null) {
                    str2 = clientInfo2.clientID;
                } else {
                    str2 = null;
                }
                if (o.LJ(str, str2)) {
                    C276716t.LJIIJ = null;
                    C276716t.LIZJ.onNext(EnumC276816u.StateDisconnected);
                }
                B4U.LIZ().LLJIJIL = 0;
            }

            @Override // com.byted.cast.common.sink.IServerListener
            public final void onStart(int i, ServerInfo serverInfo) {
                int i2;
                if (serverInfo != null) {
                    i2 = serverInfo.serverPort;
                } else {
                    i2 = 0;
                }
                C276716t.LJI = i2;
                C276716t.LIZJ.onNext(EnumC276816u.StateServerStart);
                B4U.LIZ().LLJIJIL = 0;
            }

            @Override // com.byted.cast.common.sink.IServerListener
            public final void onError(int i, int i2, String str) {
                B4U.LIZ().LLJIJIL = 0;
                if (i2 == 10009) {
                    return;
                }
                if (i2 == 1000 && TextUtils.equals(str, "10011002")) {
                    C39401ge<InterfaceC276916v> c39401ge = C276716t.LJIIIZ;
                    if (c39401ge != null) {
                        c39401ge.LIZJ(i2, str);
                        return;
                    }
                    return;
                }
                C276716t.LIZJ.onNext(EnumC276816u.StateServerStop);
                C39401ge<InterfaceC276916v> c39401ge2 = C276716t.LJIIIZ;
                if (c39401ge2 != null) {
                    c39401ge2.LJFF(i2, str);
                }
                C276716t.LJFF = false;
            }
        });
        LIZIZ2.LJFF(new IMirrorListener() { // from class: X.1gZ
            @Override // com.byted.cast.common.sink.IMirrorListener
            public final void onAudioOutput(String str, CodecType.ACODEC_ID acodec_id, byte[] bArr, int i, int i2, int i3, int i4, long j) {
            }

            @Override // com.byted.cast.common.sink.IMirrorListener
            public final void onInviteResult(boolean z2) {
            }

            @Override // com.byted.cast.common.sink.IMirrorListener
            public final void onNotifyLatency(String str, Long l, HashMap<String, Long> hashMap) {
            }

            @Override // com.byted.cast.common.sink.IMirrorListener
            public final void onSinkLatencyStat(int i, String str, String str2) {
            }

            @Override // com.byted.cast.common.sink.IMirrorListener
            public final void onSinkStuckStat(int i, String str, String str2) {
            }

            @Override // com.byted.cast.common.sink.IMirrorListener
            public final void onStatistics(Statistics statistics) {
            }

            @Override // com.byted.cast.common.sink.IMirrorListener
            public final void onVideoOutput(String str, CodecType.VCODEC_ID vcodec_id, byte[] bArr, int i, int i2, long j, int i3) {
            }

            @Override // com.byted.cast.common.sink.IMirrorListener
            public final void onVolume(String str, int i) {
            }

            @Override // com.byted.cast.common.sink.IMirrorListener
            public final void onCast(int i, CastInfo castInfo) {
                C276716t.LIZ(i, castInfo);
            }

            @Override // com.byted.cast.common.sink.IMirrorListener
            public final void onError(String str, int i, String str2) {
                StringBuilder LJ2 = AnonymousClass028.LJ("clientId: ", str, ",  errCode: ", i, ", errMsg: ");
                C1EW.LIZLLL(LJ2, str2, LJ2, "GameCastLink");
                C39401ge<InterfaceC276916v> c39401ge = C276716t.LJIIIZ;
                if (c39401ge != null) {
                    c39401ge.LJIILLIIL(i);
                }
            }
        });
        LIZIZ2.LJ(new IMessageListener() { // from class: X.1gc
            @Override // com.byted.cast.common.sink.IMessageListener
            public final String onMessageSync(String message) {
                o.LJIIIZ(message, "message");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("test onMessageSync from sink:");
                LIZ2.append(message);
                return X1D.LIZIZ(LIZ2);
            }

            @Override // com.byted.cast.common.sink.IMessageListener
            public final void onMessage(ServiceInfo serviceInfo, String message) {
                o.LJIIIZ(serviceInfo, "serviceInfo");
                o.LJIIIZ(message, "message");
                C39411gf<InterfaceC277016w> c39411gf = C276716t.LJIIIIZZ;
                if (c39411gf != null) {
                    c39411gf.LJIILJJIL(serviceInfo.deviceID, message);
                }
            }
        });
        C0JW.LIZ.getClass();
        LIZIZ2.LIZJ(context, C0JW.LIZJ("live_game_cast_device", z), new IInitListener() { // from class: X.1gY
            @Override // com.byted.cast.common.config.IInitListener
            public final void onSuccess() {
                C0NB.LIZIZ("GameCastLink", "init succeed");
                C90552ZgK.LIZIZ().LJIIIIZZ();
            }

            @Override // com.byted.cast.common.config.IInitListener
            public final void onFail(int i, String str, Exception exc) {
                C276716t.LJFF = false;
                C0NB.LJFF("GameCastLink", C012403c.LIZLLL("init failed, errCode", i, ", errMsg: ", str), exc);
                C39401ge<InterfaceC276916v> c39401ge = C276716t.LJIIIZ;
                if (c39401ge != null) {
                    c39401ge.LJIIJ(i, str);
                }
            }
        });
    }

    public static void LIZ(int i, CastInfo castInfo) {
        Integer num;
        C39411gf<InterfaceC277016w> c39411gf;
        if (castInfo != null) {
            num = Integer.valueOf(castInfo.infoType);
        } else {
            num = null;
        }
        if (num == null) {
            return;
        }
        if (num.intValue() == 100) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("server:onCast TYPE_START: ");
            LIZ2.append(i);
            LIZ2.append(", castInfo:");
            LIZ2.append(castInfo);
            C0NB.LIZIZ("GameCastLink", X1D.LIZIZ(LIZ2));
            HashMap<String, CastInfo> hashMap = LJIIJJI;
            String str = castInfo.clientID;
            o.LJIIIIZZ(str, "castInfo.clientID");
            hashMap.put(str, castInfo);
            return;
        }
        if (num == null) {
            return;
        }
        if (num.intValue() == 101) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("server:onCast TYPE_CAST: ");
            LIZ3.append(i);
            LIZ3.append(", castInfo:");
            LIZ3.append(castInfo);
            C0NB.LIZIZ("GameCastLink", X1D.LIZIZ(LIZ3));
            if (castInfo.mimeType != 102) {
                return;
            }
            C39411gf<InterfaceC277016w> c39411gf2 = LJIIIIZZ;
            if (c39411gf2 != null) {
                c39411gf2.LJII(castInfo.clientID);
            }
            LJII = false;
            return;
        }
        int i2 = 1;
        if (num == null) {
            return;
        }
        if (num.intValue() == 103) {
            if (castInfo.mimeType != 102 || castInfo.sizeInfo == null) {
                return;
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("send first frame msg, hasSendFirstFrameMsg: ");
            C19U.LIZJ(LIZ4, LJII, LIZ4, "GameCastLink");
            if (!LJII) {
                LJ(0, 0L);
                LJII = true;
            }
            C39411gf<InterfaceC277016w> c39411gf3 = LJIIIIZZ;
            if (c39411gf3 == null) {
                return;
            }
            String str2 = castInfo.clientID;
            CastInfo.SizeInfo sizeInfo = castInfo.sizeInfo;
            c39411gf3.LJIIIZ(sizeInfo.width, sizeInfo.height, str2);
            return;
        }
        if (num.intValue() != 102) {
            return;
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("server:onCast TYPE_STOP: ");
        LIZ5.append(i);
        LIZ5.append(", castInfo:");
        LIZ5.append(castInfo);
        C0NB.LJIIL("GameCastLink", X1D.LIZIZ(LIZ5));
        String str3 = castInfo.clientID;
        if (str3 != null && (c39411gf = LJIIIIZZ) != null) {
            CastInfo.StopInfo stopInfo = castInfo.stopInfo;
            if (stopInfo != null) {
                i2 = stopInfo.stopReason;
            }
            c39411gf.LJIIIIZZ(i2, str3);
        }
        LJIIJJI.remove(castInfo.clientID);
    }

    public static void LIZLLL(long j, boolean z) {
        int i;
        C10S.LIZ("send live state msg: isLiving: ", z, "GameCastLink");
        if (z) {
            i = 3;
        } else {
            i = 2;
        }
        try {
            LJ(i, j);
        } catch (NoClassDefFoundError e) {
            if (!LIZ) {
                C0NB.LJFF("GameCastLink", "NoClassDefFoundError the df_live_plugin is not ready", e);
                return;
            }
            throw e;
        }
    }

    public static void LJ(int i, long j) {
        String str;
        if (LJIIJ == null) {
            return;
        }
        C0JW c0jw = C0JW.LIZ;
        DualLiveStateMessage dualLiveStateMessage = new DualLiveStateMessage(i, j, System.currentTimeMillis());
        c0jw.getClass();
        String LIZ2 = C0JW.LIZ(dualLiveStateMessage);
        if (LIZ2 != null) {
            HashMap<String, CastInfo> hashMap = LJIIJJI;
            ClientInfo clientInfo = LJIIJ;
            if (clientInfo != null) {
                str = clientInfo.clientID;
            } else {
                str = null;
            }
            CastInfo castInfo = hashMap.get(str);
            if (castInfo != null) {
                C90552ZgK.LIZIZ().LIZLLL(castInfo, LIZ2, new ISendResultListener() { // from class: X.1gd
                    @Override // com.byted.cast.common.api.ISendResultListener
                    public final /* synthetic */ void onReceive(String str2) {
                        C90134ZZa.LIZ(this, str2);
                    }

                    @Override // com.byted.cast.common.api.ISendResultListener
                    public final void onSuccess() {
                        C0NB.LJIIIZ("GameCastLink", "send live state success");
                    }

                    @Override // com.byted.cast.common.api.ISendResultListener
                    public final void onFailure(int i2, String str2) {
                        C0NB.LJIIIZ("GameCastLink", "send live state failure");
                    }
                });
            }
        }
    }
}
