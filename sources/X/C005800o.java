package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.Surface;
import com.byted.cast.common.api.MirrorInfo;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.source.IMessageListener;
import com.byted.cast.common.source.IMirrorListener;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.source.Statistics;
import com.bytedance.android.live.broadcast.mirror.message.DualCameraCaptureSizeMessage;
import com.bytedance.android.live.broadcast.mirror.message.DualCameraStateMessage;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameDualDeviceSourceSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.00o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C005800o {
    public static final boolean LJIIIZ = C30922CBq.LIZIZ;
    public C90459Zep LIZ;
    public ServiceInfo LIZIZ;
    public ServiceInfo LIZJ;
    public boolean LIZLLL;
    public WeakReference<InterfaceC005900p> LJFF;
    public int LJIIIIZZ;
    public int LJ = -1;
    public int LJI = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
    public int LJII = 360;

    public final synchronized void LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("try to connect, hasInit: ");
        LIZ.append(this.LJ);
        C0NB.LIZIZ("GameDualDeviceSourceLink", X1D.LIZIZ(LIZ));
        if (this.LJ == 1) {
            try {
                C90459Zep c90459Zep = this.LIZ;
                if (c90459Zep != null) {
                    c90459Zep.LIZ(this.LIZJ);
                }
            } catch (NoClassDefFoundError e) {
                if (!C276716t.LIZ) {
                    C0NB.LJFF("GameCastLink", "NoClassDefFoundError the df_live_plugin is not ready", e);
                } else {
                    throw e;
                }
            }
        }
    }

    public final void LJIIIIZZ() {
        C90436ZeS LIZLLL;
        C0NB.LIZIZ("GameDualDeviceSourceLink", "real release sdk");
        try {
            WeakReference<InterfaceC005900p> weakReference = this.LJFF;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.LJFF = null;
            C90459Zep c90459Zep = this.LIZ;
            if (c90459Zep != null && (LIZLLL = c90459Zep.LIZLLL()) != null) {
                LIZLLL.LJIIL();
            }
            C90459Zep c90459Zep2 = this.LIZ;
            if (c90459Zep2 != null) {
                c90459Zep2.LIZIZ();
            }
            this.LIZ = null;
        } catch (NoClassDefFoundError e) {
            if (!C276716t.LIZ) {
                C0NB.LJFF("GameCastLink", "NoClassDefFoundError the df_live_plugin is not ready", e);
                return;
            }
            throw e;
        }
    }

    public final void LJIIJJI() {
        C90436ZeS LIZLLL;
        C0NB.LIZIZ("GameDualDeviceSourceLink", "set cast play listener");
        C90459Zep c90459Zep = this.LIZ;
        if (c90459Zep != null && (LIZLLL = c90459Zep.LIZLLL()) != null) {
            LIZLLL.LJIIIIZZ(new IMirrorListener() { // from class: X.1h7
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
                    InterfaceC005900p interfaceC005900p;
                    if (i != 3) {
                        return;
                    }
                    C0NB.LJ("GameDualDeviceSourceLink", "onStar - less");
                    C005800o c005800o = C005800o.this;
                    c005800o.LIZLLL = true;
                    WeakReference<InterfaceC005900p> weakReference = c005800o.LJFF;
                    if (weakReference != null && (interfaceC005900p = weakReference.get()) != null) {
                        interfaceC005900p.onStart();
                    }
                }

                @Override // com.byted.cast.common.source.IMirrorListener
                public final void onStop(int i) {
                    InterfaceC005900p interfaceC005900p;
                    if (i != 3) {
                        return;
                    }
                    C0NB.LIZIZ("GameDualDeviceSourceLink", "onStop wireless - m");
                    C005800o c005800o = C005800o.this;
                    c005800o.LIZLLL = false;
                    WeakReference<InterfaceC005900p> weakReference = c005800o.LJFF;
                    if (weakReference != null && (interfaceC005900p = weakReference.get()) != null) {
                        interfaceC005900p.onStop();
                    }
                }

                @Override // com.byted.cast.common.api.IConnectListener
                public final void onConnect(ServiceInfo serviceInfo, int i) {
                    InterfaceC005900p interfaceC005900p;
                    o.LJIIIZ(serviceInfo, "serviceInfo");
                    if (!o.LJ(serviceInfo.protocols, "ByteLink")) {
                        return;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onConnect serviceInfo ");
                    LIZ.append(serviceInfo);
                    LIZ.append(", extra: ");
                    LIZ.append(i);
                    C0NB.LIZIZ("GameDualDeviceSourceLink", X1D.LIZIZ(LIZ));
                    WeakReference<InterfaceC005900p> weakReference = C005800o.this.LJFF;
                    if (weakReference != null && (interfaceC005900p = weakReference.get()) != null) {
                        interfaceC005900p.onConnect(serviceInfo, i);
                    }
                    C005800o.this.getClass();
                    C005800o c005800o = C005800o.this;
                    c005800o.LIZIZ = serviceInfo;
                    c005800o.LJIILIIL();
                }

                @Override // com.byted.cast.common.api.IConnectListener
                public final void onDisconnect(ServiceInfo serviceInfo, int i, int i2) {
                    String str;
                    InterfaceC005900p interfaceC005900p;
                    if (serviceInfo != null) {
                        str = serviceInfo.protocols;
                    } else {
                        str = null;
                    }
                    if (!o.LJ(str, "ByteLink")) {
                        return;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onDisconnect, what: ");
                    LIZ.append(i);
                    LIZ.append(", extra: ");
                    LIZ.append(i2);
                    C0NB.LIZIZ("GameDualDeviceSourceLink", X1D.LIZIZ(LIZ));
                    C005800o c005800o = C005800o.this;
                    c005800o.LIZLLL = false;
                    WeakReference<InterfaceC005900p> weakReference = c005800o.LJFF;
                    if (weakReference != null && (interfaceC005900p = weakReference.get()) != null) {
                        interfaceC005900p.LIZ(i, i2);
                    }
                }

                @Override // com.byted.cast.common.source.IMirrorListener
                public final void onError(int i, int i2, int i3, String str) {
                    InterfaceC005900p interfaceC005900p;
                    if (i != 3) {
                        return;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("mirror_play_error what=");
                    LIZ.append(i2);
                    LIZ.append(",extra=");
                    LIZ.append(i3);
                    C0NB.LJ("GameDualDeviceSourceLink", X1D.LIZIZ(LIZ));
                    WeakReference<InterfaceC005900p> weakReference = C005800o.this.LJFF;
                    if (weakReference != null && (interfaceC005900p = weakReference.get()) != null) {
                        interfaceC005900p.onError(i2, i3, str);
                    }
                }

                @Override // com.byted.cast.common.source.IMirrorListener
                public final void onInfo(int i, int i2, int i3, String str) {
                    InterfaceC005900p interfaceC005900p;
                    if (i != 3) {
                        return;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onInfo what=");
                    LIZ.append(i2);
                    LIZ.append(",extra=");
                    LIZ.append(i3);
                    C0NB.LJ("GameDualDeviceSourceLink", X1D.LIZIZ(LIZ));
                    WeakReference<InterfaceC005900p> weakReference = C005800o.this.LJFF;
                    if (weakReference != null && (interfaceC005900p = weakReference.get()) != null) {
                        interfaceC005900p.onInfo(i2, i3, str);
                    }
                }
            });
        }
    }

    public C005800o() {
        C0NB.LIZIZ("GameDualDeviceSourceLink", "initBindSdk");
        if (C21090sD.LIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context())) {
            C90459Zep c90459Zep = new C90459Zep();
            this.LIZ = c90459Zep;
            C0JW c0jw = C0JW.LIZ;
            c0jw.getClass();
            C0JW.LJI(c90459Zep);
            C90459Zep c90459Zep2 = this.LIZ;
            if (c90459Zep2 != null) {
                c0jw.getClass();
                C0JW.LJFF(c90459Zep2);
            }
        }
    }

    public final void LIZLLL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("try to disConnect, hasInit: ");
        C1DD.LJFF(LIZ, this.LJ, LIZ, "GameDualDeviceSourceLink");
        if (this.LJ == 1) {
            try {
                C90459Zep c90459Zep = this.LIZ;
                if (c90459Zep != null) {
                    c90459Zep.LIZJ(this.LIZJ);
                }
            } catch (NoClassDefFoundError e) {
                if (!C276716t.LIZ) {
                    C0NB.LJFF("GameCastLink", "NoClassDefFoundError the df_live_plugin is not ready", e);
                    return;
                }
                throw e;
            }
        }
    }

    public final void LJIILIIL() {
        C90436ZeS LIZLLL;
        C90436ZeS LIZLLL2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start mirror, device info: ");
        LIZ.append(this.LIZIZ);
        C0NB.LIZIZ("GameDualDeviceSourceLink", X1D.LIZIZ(LIZ));
        try {
            C90459Zep c90459Zep = this.LIZ;
            if (c90459Zep != null) {
                c90459Zep.LJIIJJI(10013, "xxx-v-display");
            }
            C90459Zep c90459Zep2 = this.LIZ;
            if (c90459Zep2 != null) {
                c90459Zep2.LJIIJJI(10053, Boolean.TRUE);
            }
            MirrorInfo mirrorInfo = new MirrorInfo();
            mirrorInfo.enableEncodeSizeToScreen(true);
            mirrorInfo.setVirtualDisplayFlag(2);
            mirrorInfo.setVirtualDisplayName("xxx-v-display");
            LiveGameDualDeviceSourceSetting liveGameDualDeviceSourceSetting = LiveGameDualDeviceSourceSetting.INSTANCE;
            mirrorInfo.setFps(liveGameDualDeviceSourceSetting.getFPS());
            mirrorInfo.setServiceInfo(this.LIZIZ);
            mirrorInfo.setAudioEnable(false);
            C90459Zep c90459Zep3 = this.LIZ;
            if (c90459Zep3 != null) {
                c90459Zep3.LJIIJJI(10017, Boolean.FALSE);
            }
            mirrorInfo.setAutoBitrate(false);
            C0JW c0jw = C0JW.LIZ;
            int bitRate = liveGameDualDeviceSourceSetting.getBitRate();
            c0jw.getClass();
            int i = 5;
            if (bitRate != 5) {
                i = 6;
                if (bitRate != 6) {
                    i = 4;
                }
            }
            mirrorInfo.setBitRateLevel(i);
            mirrorInfo.setVideoSrc(1);
            mirrorInfo.setCameraId(this.LJIIIIZZ);
            mirrorInfo.setServerMode(1);
            mirrorInfo.setEncodeWidth(this.LJI);
            mirrorInfo.setEncodeHeight(this.LJII);
            C90459Zep c90459Zep4 = this.LIZ;
            if (c90459Zep4 != null && (LIZLLL2 = c90459Zep4.LIZLLL()) != null) {
                LIZLLL2.LJII(mirrorInfo);
            }
            C90459Zep c90459Zep5 = this.LIZ;
            if (c90459Zep5 != null && (LIZLLL = c90459Zep5.LIZLLL()) != null) {
                LIZLLL.LJIIIZ("ByteLink");
            }
        } catch (NoClassDefFoundError e) {
            if (!C276716t.LIZ) {
                C0NB.LJFF("GameCastLink", "NoClassDefFoundError the df_live_plugin is not ready", e);
                return;
            }
            throw e;
        }
    }

    public final void LIZ(Surface surface) {
        C90436ZeS LIZLLL;
        if (surface == null) {
            return;
        }
        try {
            C90459Zep c90459Zep = this.LIZ;
            if (c90459Zep != null && (LIZLLL = c90459Zep.LIZLLL()) != null) {
                LIZLLL.LIZIZ(surface);
            }
        } catch (NoClassDefFoundError e) {
            if (!C276716t.LIZ) {
                C0NB.LJFF("GameCastLink", "NoClassDefFoundError the df_live_plugin is not ready", e);
                return;
            }
            throw e;
        }
    }

    public final void LIZIZ(int i) {
        C90436ZeS LIZLLL;
        if (i == this.LJIIIIZZ || !this.LIZLLL) {
            return;
        }
        try {
            C90459Zep c90459Zep = this.LIZ;
            if (c90459Zep != null && (LIZLLL = c90459Zep.LIZLLL()) != null) {
                LIZLLL.LIZJ(i);
            }
            this.LJIIIIZZ = i;
        } catch (NoClassDefFoundError e) {
            if (!C276716t.LIZ) {
                C0NB.LJFF("GameCastLink", "NoClassDefFoundError the df_live_plugin is not ready", e);
                return;
            }
            throw e;
        }
    }

    public final void LJ(DualCameraCaptureSizeMessage msg) {
        C90436ZeS LIZLLL;
        o.LJIIIZ(msg, "msg");
        int i = msg.width;
        int i2 = msg.height;
        if (i > 0 && i2 > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleCameraSizeMsg, w: ");
            LIZ.append(i);
            LIZ.append(", h: ");
            LIZ.append(i2);
            C0NB.LIZIZ("GameDualDeviceSourceLink", X1D.LIZIZ(LIZ));
            C90459Zep c90459Zep = this.LIZ;
            if (c90459Zep != null && (LIZLLL = c90459Zep.LIZLLL()) != null) {
                LIZLLL.LJIIJJI("ByteLink");
            }
            this.LJI = i;
            this.LJII = i2;
        }
    }

    public final void LJFF(InterfaceC005900p interfaceC005900p) {
        if (interfaceC005900p == null) {
            return;
        }
        C0NB.LIZIZ("GameDualDeviceSourceLink", "setSourceLinkListener");
        Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        this.LJFF = new WeakReference<>(interfaceC005900p);
        try {
            LJIIJJI();
            C90459Zep c90459Zep = this.LIZ;
            if (c90459Zep != null) {
                C0JW c0jw = C0JW.LIZ;
                boolean z = LJIIIZ;
                c0jw.getClass();
                c90459Zep.LJII(context, C0JW.LIZJ("ByteCast", z), new IInitListener() { // from class: X.17j
                    @Override // com.byted.cast.common.config.IInitListener
                    public final void onSuccess() {
                        boolean z2;
                        InterfaceC005900p interfaceC005900p2;
                        C0NB.LIZIZ("GameDualDeviceSourceLink", "init success");
                        C005800o c005800o = C005800o.this;
                        if (c005800o.LJ == -1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c005800o.LJ = 1;
                        WeakReference<InterfaceC005900p> weakReference = c005800o.LJFF;
                        if (weakReference != null && (interfaceC005900p2 = weakReference.get()) != null) {
                            interfaceC005900p2.LIZIZ(z2);
                        }
                    }

                    @Override // com.byted.cast.common.config.IInitListener
                    public final void onFail(int i, String str, Exception exc) {
                        InterfaceC005900p interfaceC005900p2;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("init failed:");
                        LIZ.append(i);
                        LIZ.append(", errMsg:");
                        LIZ.append(str);
                        C0NB.LIZIZ("GameDualDeviceSourceLink", X1D.LIZIZ(LIZ));
                        C005800o c005800o = C005800o.this;
                        c005800o.LJ = 0;
                        WeakReference<InterfaceC005900p> weakReference = c005800o.LJFF;
                        if (weakReference != null && (interfaceC005900p2 = weakReference.get()) != null) {
                            interfaceC005900p2.LIZJ(i, str);
                        }
                    }
                });
            }
        } catch (NoClassDefFoundError e) {
            if (!C276716t.LIZ) {
                C0NB.LJFF("GameCastLink", "NoClassDefFoundError the df_live_plugin is not ready", e);
                return;
            }
            throw e;
        }
    }

    public final void LJII(boolean z) {
        C90436ZeS LIZLLL;
        C90436ZeS LIZLLL2;
        if (!this.LIZLLL) {
            return;
        }
        try {
            if (z) {
                C90459Zep c90459Zep = this.LIZ;
                if (c90459Zep != null && (LIZLLL2 = c90459Zep.LIZLLL()) != null) {
                    LIZLLL2.LJIIJ();
                }
            } else {
                C90459Zep c90459Zep2 = this.LIZ;
                if (c90459Zep2 != null && (LIZLLL = c90459Zep2.LIZLLL()) != null) {
                    LIZLLL.LJIIL();
                }
            }
        } catch (NoClassDefFoundError e) {
            if (!C276716t.LIZ) {
                C0NB.LJFF("GameCastLink", "NoClassDefFoundError the df_live_plugin is not ready", e);
                return;
            }
            throw e;
        }
    }

    public final void LJIIIZ(Surface surface) {
        C90436ZeS LIZLLL;
        if (surface == null) {
            return;
        }
        try {
            C90459Zep c90459Zep = this.LIZ;
            if (c90459Zep != null && (LIZLLL = c90459Zep.LIZLLL()) != null) {
                LIZLLL.LJ(surface);
            }
        } catch (NoClassDefFoundError e) {
            if (!C276716t.LIZ) {
                C0NB.LJFF("GameCastLink", "NoClassDefFoundError the df_live_plugin is not ready", e);
                return;
            }
            throw e;
        }
    }

    public final void LJIIJ(boolean z) {
        int i;
        try {
            if (z) {
                LJII(false);
                i = 0;
            } else {
                LJII(true);
                i = 1;
            }
            if (this.LIZJ != null) {
                C0JW c0jw = C0JW.LIZ;
                DualCameraStateMessage dualCameraStateMessage = new DualCameraStateMessage(i);
                c0jw.getClass();
                String LIZ = C0JW.LIZ(dualCameraStateMessage);
                if (LIZ != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("send camera on or off msg, state : ");
                    LIZ2.append(z);
                    C0NB.LIZIZ("GameDualDeviceSourceLink", X1D.LIZIZ(LIZ2));
                    C90459Zep c90459Zep = this.LIZ;
                    if (c90459Zep != null) {
                        c90459Zep.LJIIJJI(10035, LIZ);
                    }
                }
            }
        } catch (NoClassDefFoundError e) {
            if (!C276716t.LIZ) {
                C0NB.LJFF("GameCastLink", "NoClassDefFoundError the df_live_plugin is not ready", e);
                return;
            }
            throw e;
        }
    }

    public final void LJIIL(IMessageListener iMessageListener) {
        C90459Zep c90459Zep = this.LIZ;
        if (c90459Zep != null) {
            c90459Zep.LJIIJ(iMessageListener);
        }
    }

    public final void LJI(int i, int i2, int i3, int i4, String str) {
        StringBuilder LIZ = C06830Op.LIZ("initAndTryToConnect， port: ", i, ", ip:$", str, ", version: ");
        C1DD.LJFF(LIZ, i4, LIZ, "GameDualDeviceSourceLink");
        this.LJI = i2;
        this.LJII = i3;
        if (i <= 0 || TextUtils.isEmpty(str) || i4 > 1) {
            C0NB.LJ("GameDualDeviceSourceLink", "ip or port is wrong, show wrong page");
            return;
        }
        try {
            ServiceInfo serviceInfo = new ServiceInfo();
            serviceInfo.port = -1;
            serviceInfo.portMirror = i;
            serviceInfo.ip = str;
            serviceInfo.protocols = "ByteLink";
            this.LIZJ = serviceInfo;
            LIZJ();
        } catch (NoClassDefFoundError e) {
            if (!C276716t.LIZ) {
                C0NB.LJFF("GameCastLink", "NoClassDefFoundError the df_live_plugin is not ready", e);
                return;
            }
            throw e;
        }
    }
}
