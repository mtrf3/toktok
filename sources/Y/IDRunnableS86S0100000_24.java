package Y;

import X.BinderC90624ZhU;
import X.C16880lQ;
import X.C90101ZXt;
import X.C90115ZYh;
import X.C90120ZYm;
import X.C90414Ze6;
import X.C90421ZeD;
import X.C90436ZeS;
import X.C90442ZeY;
import X.C90459Zep;
import X.C90467Zex;
import X.C90469Zez;
import X.C90505ZfZ;
import X.C90506Zfa;
import X.C90547ZgF;
import X.C90552ZgK;
import X.C90613ZhJ;
import X.C90639Zhj;
import X.C90776Zjw;
import X.C90777Zjx;
import X.C90778Zjy;
import X.C90780Zk0;
import X.C90801ZkL;
import X.C90802ZkM;
import X.C90803ZkN;
import X.C90848Zl6;
import X.C90849Zl7;
import X.C90851Zl9;
import X.C90853ZlB;
import X.C90928ZmO;
import X.C90929ZmP;
import X.C90930ZmQ;
import X.DialogC90914ZmA;
import X.InterfaceC90111ZYd;
import X.InterfaceC90501ZfV;
import X.InterfaceC90503ZfX;
import X.QH7;
import X.ServiceConnectionC90609ZhF;
import X.X1D;
import X.ZWQ;
import X.ZXC;
import X.ZXG;
import X.ZY1;
import X.ZY4;
import X.ZY5;
import X.ZY7;
import X.ZYD;
import X.ZYJ;
import X.ZYS;
import android.os.RemoteException;
import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.Logger;
import com.byted.cast.common.Monitor;
import com.byted.cast.common.api.IBindSdkInfoListener;
import com.byted.cast.common.api.IBrowseListener;
import com.byted.cast.common.api.ICastSink;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.async.ConcurrentSubject;
import com.byted.cast.common.bean.DramaBean;
import com.byted.cast.common.config.ConfigManager;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.discovery.INsdHelper;
import com.byted.cast.common.sink.CallbackServerInfo;
import com.byted.cast.common.sink.Statistics;
import com.byted.cast.common.source.ServiceInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.cast.MediaStatus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes29.dex */
public class IDRunnableS86S0100000_24 implements Runnable {
    public final int $t;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            case 22:
                run$22(this);
                return;
            case 23:
                run$23(this);
                return;
            case 24:
                run$24(this);
                return;
            case 25:
                run$25(this);
                return;
            case 26:
                run$26(this);
                return;
            case 27:
                run$27(this);
                return;
            case 28:
                run$28(this);
                return;
            case 29:
                run$29(this);
                return;
            case 30:
                run$30(this);
                return;
            case 31:
                run$31(this);
                return;
            case 32:
                run$32(this);
                return;
            case 33:
                run$33(this);
                return;
            case 34:
                run$34(this);
                return;
            case 35:
                run$35(this);
                return;
            case 36:
                run$36(this);
                return;
            case 37:
                run$37(this);
                return;
            case 38:
                run$38(this);
                return;
            case 39:
                run$39(this);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                run$40(this);
                return;
            case 41:
                run$41(this);
                return;
            case 42:
                run$42(this);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                run$43(this);
                return;
            case 44:
                run$44(this);
                return;
            case 45:
                run$45(this);
                return;
            case 46:
                run$46(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        CastLogger castLogger = ((C90802ZkM) this.l0).LIZIZ.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set Auth by local, bind sdk info listener size:");
        LIZ.append(((CopyOnWriteArrayList) ((C90802ZkM) this.l0).LIZIZ.LJJIZ).size());
        castLogger.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
        IInitListener iInitListener = ((C90802ZkM) this.l0).LIZ;
        if (iInitListener != null) {
            iInitListener.onSuccess();
        }
        Iterator it = ((CopyOnWriteArrayList) ((C90802ZkM) this.l0).LIZIZ.LJJIZ).iterator();
        while (it.hasNext()) {
            ((IBindSdkInfoListener) it.next()).onByteCastSuccess();
        }
    }

    public final void LIZ$1() {
        C90467Zex c90467Zex = (C90467Zex) this.l0;
        if (c90467Zex.LJFF != null) {
            c90467Zex.LJ("Ble_Stop_Scan");
            try {
                C90467Zex c90467Zex2 = (C90467Zex) this.l0;
                c90467Zex2.LJFF.stopScan(c90467Zex2.LIZJ);
                ((C90467Zex) this.l0).LJ = false;
            } catch (Exception e) {
                ((C90467Zex) this.l0).LJIIJJI.e("BleClient", e.getMessage());
            }
        }
    }

    public final void LIZ$10() {
        Statistics statistics = new Statistics();
        Iterator it = ((ConcurrentHashMap) ((C90547ZgF) this.l0).LJIIIIZZ).keySet().iterator();
        while (it.hasNext()) {
            Statistics statistics2 = ((ICastSink) ((ConcurrentHashMap) ((C90547ZgF) this.l0).LJIIIIZZ).get(it.next())).getStatistics();
            if (statistics2 != null) {
                statistics.arx.addAll(statistics2.arx);
                statistics.vrx.addAll(statistics2.vrx);
                statistics.nx.addAll(statistics2.nx);
                statistics.cx.addAll(statistics2.cx);
            }
        }
        C90851Zl9 c90851Zl9 = ((C90547ZgF) this.l0).LJIL;
        if (c90851Zl9 != null) {
            c90851Zl9.onStatistics(statistics);
        }
        ((C90547ZgF) this.l0).getClass();
    }

    public final void LIZ$2() {
        try {
            C90506Zfa c90506Zfa = (C90506Zfa) this.l0;
            C90613ZhJ c90613ZhJ = c90506Zfa.LJIIIIZZ;
            if (c90613ZhJ == null) {
                c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "CastSession is null.");
                return;
            }
            double LJIIIZ = c90613ZhJ.LJIIIZ();
            CastLogger castLogger = ((C90506Zfa) this.l0).LJIJJLI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("currentVolume: ");
            LIZ.append(LJIIIZ);
            castLogger.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
            try {
                ((C90506Zfa) this.l0).LJIIIIZZ.LJIIJJI(LJIIIZ - 0.1d);
            } catch (IOException e) {
                ((C90506Zfa) this.l0).LJIJJLI.e("ChromeCastSourceImpl", e.getMessage());
            }
        } catch (IllegalStateException e2) {
            ((C90506Zfa) this.l0).LJIJJLI.e("ChromeCastSourceImpl", e2.getMessage());
            ((C90506Zfa) this.l0).LJIIZILJ = false;
        }
    }

    public final void LIZ$3() {
        try {
            C90506Zfa c90506Zfa = (C90506Zfa) this.l0;
            C90613ZhJ c90613ZhJ = c90506Zfa.LJIIIIZZ;
            if (c90613ZhJ == null) {
                c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "CastSession is null.");
                return;
            }
            double LJIIIZ = c90613ZhJ.LJIIIZ();
            CastLogger castLogger = ((C90506Zfa) this.l0).LJIJJLI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("currentVolume: ");
            LIZ.append(LJIIIZ);
            castLogger.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
            try {
                ((C90506Zfa) this.l0).LJIIIIZZ.LJIIJJI(LJIIIZ - 1.0d);
            } catch (IOException e) {
                ((C90506Zfa) this.l0).LJIJJLI.e("ChromeCastSourceImpl", e.getMessage());
            }
        } catch (IllegalStateException e2) {
            ((C90506Zfa) this.l0).LJIJJLI.e("ChromeCastSourceImpl", e2.getMessage());
            ((C90506Zfa) this.l0).LJIIZILJ = false;
        }
    }

    public final void LIZ$4() {
        try {
            ((C90506Zfa) this.l0).LJII.LIZ().LJ(((C90506Zfa) this.l0).LJIJ, C90613ZhJ.class);
            C90506Zfa c90506Zfa = (C90506Zfa) this.l0;
            ZYJ zyj = c90506Zfa.LJII;
            C90505ZfZ c90505ZfZ = c90506Zfa.LJIJI;
            zyj.getClass();
            QH7.LJ("Must be called from the main thread.");
            if (c90505ZfZ != null) {
                ZYS zys = zyj.LIZJ;
                zys.getClass();
                try {
                    zys.LIZ.LJLJJL(new BinderC90624ZhU(c90505ZfZ));
                } catch (RemoteException unused) {
                    C90469Zez c90469Zez = ZYS.LIZJ;
                    C16880lQ.LJLLJ(InterfaceC90111ZYd.class);
                    c90469Zez.getClass();
                }
            }
            C90506Zfa c90506Zfa2 = (C90506Zfa) this.l0;
            c90506Zfa2.LJIIJ.LJI(c90506Zfa2.LJIIJJI);
        } catch (Exception e) {
            ((C90506Zfa) this.l0).LJIJJLI.e("ChromeCastSourceImpl", e.getMessage());
            ((C90506Zfa) this.l0).LJIIZILJ = false;
        }
    }

    public final void LIZ$5() {
        try {
            C90639Zhj LJ = ((C90506Zfa) this.l0).LJ(null);
            if (LJ == null) {
                ((C90506Zfa) this.l0).LJIJJLI.w("ChromeCastSourceImpl", " RemoteMediaClient is null.");
                return;
            }
            QH7.LJ("Must be called from the main thread.");
            if (!LJ.LJJIII()) {
                C90639Zhj.LJIJJLI();
            } else {
                C90639Zhj.LJJIIJ(new C90930ZmQ(LJ));
            }
        } catch (Exception e) {
            ((C90506Zfa) this.l0).LJIJJLI.e("ChromeCastSourceImpl", e.getMessage());
            ((C90506Zfa) this.l0).LJIIZILJ = false;
        }
    }

    public final void LIZ$6() {
        try {
            C90639Zhj LJ = ((C90506Zfa) this.l0).LJ(null);
            if (LJ == null) {
                ((C90506Zfa) this.l0).LJIJJLI.w("ChromeCastSourceImpl", " RemoteMediaClient is null.");
                return;
            }
            QH7.LJ("Must be called from the main thread.");
            if (!LJ.LJJIII()) {
                C90639Zhj.LJIJJLI();
            } else {
                C90639Zhj.LJJIIJ(new C90928ZmO(LJ));
            }
        } catch (Exception e) {
            ((C90506Zfa) this.l0).LJIJJLI.e("ChromeCastSourceImpl", e.getMessage());
            ((C90506Zfa) this.l0).LJIIZILJ = false;
        }
    }

    public final void LIZ$7() {
        try {
            C90639Zhj LJ = ((C90506Zfa) this.l0).LJ(null);
            if (LJ == null) {
                ((C90506Zfa) this.l0).LJIJJLI.w("ChromeCastSourceImpl", " RemoteMediaClient is null.");
                return;
            }
            QH7.LJ("Must be called from the main thread.");
            if (!LJ.LJJIII()) {
                C90639Zhj.LJIJJLI();
            } else {
                C90639Zhj.LJJIIJ(new C90929ZmP(LJ));
            }
        } catch (Exception e) {
            ((C90506Zfa) this.l0).LJIJJLI.e("ChromeCastSourceImpl", e.getMessage());
            ((C90506Zfa) this.l0).LJIIZILJ = false;
        }
    }

    public final void LIZ$8() {
        try {
            C90506Zfa c90506Zfa = (C90506Zfa) this.l0;
            C90613ZhJ c90613ZhJ = c90506Zfa.LJIIIIZZ;
            if (c90613ZhJ == null) {
                c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "CastSession is null.");
                return;
            }
            double LJIIIZ = c90613ZhJ.LJIIIZ();
            CastLogger castLogger = ((C90506Zfa) this.l0).LJIJJLI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("currentVolume: ");
            LIZ.append(LJIIIZ);
            castLogger.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
            try {
                ((C90506Zfa) this.l0).LJIIIIZZ.LJIIJJI(LJIIIZ + 0.1d);
            } catch (IOException e) {
                ((C90506Zfa) this.l0).LJIJJLI.e("ChromeCastSourceImpl", e.getMessage());
            }
        } catch (IllegalStateException e2) {
            ((C90506Zfa) this.l0).LJIJJLI.e("ChromeCastSourceImpl", e2.getMessage());
            ((C90506Zfa) this.l0).LJIIZILJ = false;
        }
    }

    public final void LIZ$9() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set Auth by local, bind sdk info listener size:");
        LIZ.append(((ArrayList) ((C90848Zl6) this.l0).LIZIZ.LJJI).size());
        Logger.d("ByteCastSinkImpl", X1D.LIZIZ(LIZ));
        IInitListener iInitListener = ((C90848Zl6) this.l0).LIZ;
        if (iInitListener != null) {
            iInitListener.onSuccess();
        }
        Iterator it = ((ArrayList) ((C90848Zl6) this.l0).LIZIZ.LJJI).iterator();
        while (it.hasNext()) {
            ((IBindSdkInfoListener) it.next()).onByteCastSuccess();
        }
    }

    public static final void run$0(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        String str;
        ZWQ zwq = (ZWQ) iDRunnableS86S0100000_24.l0;
        INsdHelper iNsdHelper = zwq.LIZ;
        if (iNsdHelper != null && (str = zwq.LJII) != null) {
            iNsdHelper.unregisterService(str);
            zwq.LIZ = null;
        }
    }

    public static final void run$1(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            DialogC90914ZmA dialogC90914ZmA = (DialogC90914ZmA) iDRunnableS86S0100000_24.l0;
            dialogC90914ZmA.LJJ(true);
            dialogC90914ZmA.LLI.requestLayout();
            dialogC90914ZmA.LLI.getViewTreeObserver().addOnGlobalLayoutListener(new ZXC(dialogC90914ZmA));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            ((C90780Zk0) iDRunnableS86S0100000_24.l0).LIZ.onLoading();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            ((C90780Zk0) iDRunnableS86S0100000_24.l0).LIZ.onStart();
            ((C90780Zk0) iDRunnableS86S0100000_24.l0).LIZIZ.getClass();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            ((C90780Zk0) iDRunnableS86S0100000_24.l0).LIZ.onPause();
            ((C90780Zk0) iDRunnableS86S0100000_24.l0).LIZIZ.getClass();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            ((C90780Zk0) iDRunnableS86S0100000_24.l0).LIZ.onCompletion();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            ((C90780Zk0) iDRunnableS86S0100000_24.l0).LIZ.onStop();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            ((C90421ZeD) iDRunnableS86S0100000_24.l0).LIZ.stopSsdpServer();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        ((C90801ZkL) iDRunnableS86S0100000_24.l0).LJJJLZIJ.onBrowse(2, new ArrayList());
    }

    public static final void run$17(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        ((C90801ZkL) iDRunnableS86S0100000_24.l0).LJJL.onFail(1702000003, "send message timeout");
    }

    public static final void run$18(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            iDRunnableS86S0100000_24.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            IInitListener iInitListener = ((C90803ZkN) iDRunnableS86S0100000_24.l0).LIZ;
            if (iInitListener != null) {
                iInitListener.onSuccess();
            }
            Iterator it = ((CopyOnWriteArrayList) ((C90803ZkN) iDRunnableS86S0100000_24.l0).LIZIZ.LJJIZ).iterator();
            while (it.hasNext()) {
                ((IBindSdkInfoListener) it.next()).onByteCastSuccess();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            DialogC90914ZmA dialogC90914ZmA = ((ZXG) iDRunnableS86S0100000_24.l0).LJLILLLLZI;
            if (dialogC90914ZmA.LLIIJI != null) {
                dialogC90914ZmA.LLIIJI = null;
                if (dialogC90914ZmA.LLIZ) {
                    dialogC90914ZmA.LJJIIJ(dialogC90914ZmA.LLIZLLLIL);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        C90436ZeS.LIZLLL((C90436ZeS) iDRunnableS86S0100000_24.l0);
    }

    public static final void run$21(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        ((C90442ZeY) iDRunnableS86S0100000_24.l0).LJIIIIZZ(210010, 210016);
    }

    public static final void run$22(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        ((C90459Zep) iDRunnableS86S0100000_24.l0).LIZ.LIZ();
    }

    public static final void run$23(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        ((C90459Zep) iDRunnableS86S0100000_24.l0).LIZ.stopBrowse();
    }

    public static final void run$24(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        ((C90459Zep) iDRunnableS86S0100000_24.l0).LIZ.startBrowse();
    }

    public static final void run$25(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        IInitListener iInitListener = (IInitListener) iDRunnableS86S0100000_24.l0;
        if (iInitListener != null) {
            iInitListener.onSuccess();
        }
    }

    public static final void run$26(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            iDRunnableS86S0100000_24.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$27(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        InterfaceC90501ZfV interfaceC90501ZfV;
        C90506Zfa c90506Zfa = (C90506Zfa) iDRunnableS86S0100000_24.l0;
        ZY5 zy5 = c90506Zfa.LJIIJ;
        C90101ZXt c90101ZXt = c90506Zfa.LJIILJJIL;
        zy5.getClass();
        boolean LJFF = ZY5.LJFF(c90101ZXt, 1);
        CastLogger castLogger = c90506Zfa.LJIJJLI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isRouterAvailable: ");
        LIZ.append(LJFF);
        castLogger.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
        c90506Zfa.LJIIJ.getClass();
        ZY5.LIZIZ();
        ArrayList arrayList = new ArrayList(ZY5.LIZJ.LJ);
        ((ConcurrentHashMap) C90506Zfa.LJJIJIIJI).clear();
        CastLogger castLogger2 = c90506Zfa.LJIJJLI;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("routeInfoList: ");
        LIZ2.append(arrayList);
        castLogger2.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ2));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ZY4 zy4 = (ZY4) it.next();
            if (zy4 == null || zy4.LJIIL != 1) {
                c90506Zfa.LJIJJLI.d("ChromeCastSourceImpl", "routeInfo is not right");
            } else {
                CastLogger castLogger3 = c90506Zfa.LJIJJLI;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("routeInfo: ");
                LIZ3.append(zy4.LIZJ);
                castLogger3.i("ChromeCastSourceImpl", X1D.LIZIZ(LIZ3));
                C90101ZXt c90101ZXt2 = c90506Zfa.LJIILJJIL;
                if (c90101ZXt2 != null && zy4.LJII(c90101ZXt2) && zy4.LJI) {
                    c90506Zfa.LJIJJLI.d("ChromeCastSourceImpl", "routeInfo is right");
                    ((ConcurrentHashMap) C90506Zfa.LJJIJIIJI).put(zy4.LIZJ, zy4);
                }
            }
        }
        if (c90506Zfa.LIZJ && (interfaceC90501ZfV = c90506Zfa.LIZ) != null) {
            ArrayList arrayList2 = new ArrayList(((ConcurrentHashMap) C90506Zfa.LJJIJIIJI).values());
            C90778Zjy c90778Zjy = (C90778Zjy) interfaceC90501ZfV;
            if (c90778Zjy.LIZ != null) {
                c90778Zjy.LIZIZ.LIZIZ.execute(new IDRunnableS1S0201000_24(c90778Zjy, arrayList2, 1, 1));
            }
        }
    }

    public static final void run$28(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        C90506Zfa c90506Zfa = (C90506Zfa) iDRunnableS86S0100000_24.l0;
        c90506Zfa.LJIIJ.LIZ(c90506Zfa.LJIILJJIL, c90506Zfa.LJIIJJI, 1);
    }

    public static final void run$29(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        int i;
        C90506Zfa c90506Zfa = (C90506Zfa) iDRunnableS86S0100000_24.l0;
        c90506Zfa.getClass();
        try {
            C90639Zhj LJ = c90506Zfa.LJ(null);
            if (LJ != null) {
                MediaStatus LJI = LJ.LJI();
                if (LJI == null) {
                    c90506Zfa.LJIJJLI.w("ChromeCastSourceImpl", "mediaStatus is null.");
                    return;
                }
                int i2 = LJI.zzc;
                C90120ZYm LJFF = LJ.LJFF();
                LJFF.getClass();
                QH7.LJ("Must be called from the main thread.");
                int i3 = LJFF.LJ.get(i2, -1);
                if (i3 < 0) {
                    CastLogger castLogger = c90506Zfa.LJIJJLI;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("index is not satisfied, index: ");
                    LIZ.append(i3);
                    castLogger.w("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
                    return;
                }
                CastLogger castLogger2 = c90506Zfa.LJIJJLI;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("itemId: ");
                LIZ2.append(i2);
                LIZ2.append(", tempDataIndex: ");
                LIZ2.append(i3);
                castLogger2.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ2));
                CastLogger castLogger3 = c90506Zfa.LJIJJLI;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("dramaList: ");
                LIZ3.append(Arrays.toString(c90506Zfa.LJJII));
                castLogger3.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ3));
                String[] strArr = c90506Zfa.LJJIFFI;
                if (strArr != null && i3 < strArr.length && c90506Zfa.LJI != null) {
                    DramaBean dramaBean = c90506Zfa.LJJII[i3];
                    if (dramaBean != null && dramaBean.getMediaAssetBean() != null) {
                        i = dramaBean.getMediaAssetBean().getMimeType();
                    } else {
                        i = c90506Zfa.LJJI;
                    }
                    c90506Zfa.LJJI = i;
                    ((C90780Zk0) c90506Zfa.LJI).LIZ(c90506Zfa.LJJIII, strArr[i3]);
                }
                InterfaceC90503ZfX interfaceC90503ZfX = c90506Zfa.LJI;
                if (interfaceC90503ZfX != null) {
                    ((C90780Zk0) interfaceC90503ZfX).LIZIZ(c90506Zfa.LJJIII, c90506Zfa.LJJII);
                }
            }
        } catch (Exception e) {
            c90506Zfa.LJIJJLI.e("ChromeCastSourceImpl", e.getMessage());
        }
    }

    public static final void run$3(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            ZY7 zy7 = (ZY7) iDRunnableS86S0100000_24.l0;
            int size = zy7.LJLJLJ.size();
            for (int i = 0; i < size; i++) {
                zy7.LJLJLJ.valueAt(i).LIZ(null, null);
            }
            zy7.LJLJLJ.clear();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$30(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            iDRunnableS86S0100000_24.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$31(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            iDRunnableS86S0100000_24.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$32(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            try {
                ((C90506Zfa) iDRunnableS86S0100000_24.l0).LJIIJ.getClass();
                ZY5.LJII(2);
            } catch (Exception e) {
                ((C90506Zfa) iDRunnableS86S0100000_24.l0).LJIJJLI.e("ChromeCastSourceImpl", e.getMessage());
                ((C90506Zfa) iDRunnableS86S0100000_24.l0).LJIIZILJ = false;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$33(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            iDRunnableS86S0100000_24.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$34(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            iDRunnableS86S0100000_24.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$35(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            iDRunnableS86S0100000_24.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$36(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            iDRunnableS86S0100000_24.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$37(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            iDRunnableS86S0100000_24.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$38(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        ((ZY1) iDRunnableS86S0100000_24.l0).LIZIZ();
    }

    public static final void run$39(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        ((ZY1) iDRunnableS86S0100000_24.l0).LIZIZ();
    }

    public static final void run$4(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            ZY7 zy7 = (ZY7) iDRunnableS86S0100000_24.l0;
            ServiceConnectionC90609ZhF serviceConnectionC90609ZhF = zy7.LJLJLLL;
            if (serviceConnectionC90609ZhF.LJLLL == zy7) {
                serviceConnectionC90609ZhF.LJIJI();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$40(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            iDRunnableS86S0100000_24.LIZ$9();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$41(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            IInitListener iInitListener = ((C90849Zl7) iDRunnableS86S0100000_24.l0).LIZ;
            if (iInitListener != null) {
                iInitListener.onSuccess();
            }
            Iterator it = ((ArrayList) ((C90849Zl7) iDRunnableS86S0100000_24.l0).LIZIZ.LJJI).iterator();
            while (it.hasNext()) {
                ((IBindSdkInfoListener) it.next()).onByteCastSuccess();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$42(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            iDRunnableS86S0100000_24.LIZ$10();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$43(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        ((C90552ZgK) iDRunnableS86S0100000_24.l0).LIZ.LIZIZ();
    }

    public static final void run$44(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        C90547ZgF c90547ZgF = ((C90552ZgK) iDRunnableS86S0100000_24.l0).LIZ;
        c90547ZgF.getClass();
        String serviceName = ConfigManager.getInstance().getInitConfig().getServiceName();
        if (TextUtils.isEmpty(serviceName)) {
            serviceName = "ByteCast";
        }
        synchronized (c90547ZgF) {
            if (c90547ZgF.LJJIIJ) {
                Logger.d("ByteCastSinkImpl", "startServer, service already start");
                if (((ConcurrentHashMap) c90547ZgF.LJIIIIZZ).containsKey("ChromeCast")) {
                    c90547ZgF.LJI.startServer(serviceName);
                }
                return;
            }
            c90547ZgF.LJJIJL = false;
            c90547ZgF.LJJIIJ = true;
            Monitor.sendByteCastSinkEvent("bytecast_start_server", "", (String) null, (String) null);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startServer serviceName:");
            LIZ.append(serviceName);
            LIZ.append(", verify:");
            LIZ.append(c90547ZgF.LJJIJIIJI);
            LIZ.append(", gitInfo:");
            LIZ.append("1.ccb4d03");
            Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ));
            if (c90547ZgF.LJJIJIIJI) {
                C90115ZYh c90115ZYh = c90547ZgF.LJJIJLIJ;
                c90115ZYh.getClass();
                o.LJIIJ(serviceName, "serviceName");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("startServer, name:");
                LIZ2.append(serviceName);
                Logger.i("CastRelay", X1D.LIZIZ(LIZ2));
                ICastSource iCastSource = c90115ZYh.LIZ;
                if (iCastSource != null) {
                    iCastSource.startServer(serviceName);
                }
                synchronized (c90547ZgF.LJJIII) {
                    if (c90547ZgF.LJJII == null) {
                        c90547ZgF.LJIIIIZZ(c90547ZgF.LJIJ, c90547ZgF.LJIJI);
                    }
                    ConcurrentSubject<CallbackServerInfo> concurrentSubject = c90547ZgF.LJJII;
                    concurrentSubject.setTimeout(20L, TimeUnit.SECONDS);
                    concurrentSubject.addObserver(new C90853ZlB(c90547ZgF));
                }
                for (String str : ((ConcurrentHashMap) c90547ZgF.LJIIIIZZ).keySet()) {
                    ICastSink iCastSink = (ICastSink) ((ConcurrentHashMap) c90547ZgF.LJIIIIZZ).get(str);
                    if (iCastSink != null) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(str);
                        LIZ3.append(" startServer serviceName:");
                        LIZ3.append(serviceName);
                        Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ3));
                        if ("BDDLNA".equals(str)) {
                            iCastSink.setOption(10044, c90547ZgF.LJIJJ);
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("device");
                            LIZ4.append(c90547ZgF.LJIJJ);
                            Monitor.sendSinkEvent("bytecast_manufacturer_v2", X1D.LIZIZ(LIZ4));
                        }
                        iCastSink.startServer(serviceName);
                    }
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("startServer, protocols:");
                LIZ5.append(c90547ZgF.LJIILL);
                Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ5));
                List<String> list = c90547ZgF.LJIILL;
                if (list != null && (((ArrayList) list).contains("BDLink") || ((ArrayList) c90547ZgF.LJIILL).contains("ByteLink"))) {
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("mServerProxy.startServer, protocols:");
                    LIZ6.append(c90547ZgF.LJIILL);
                    Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ6));
                    c90547ZgF.LJII.LIZ(serviceName, c90547ZgF.LJIILL);
                }
                c90547ZgF.LIZLLL(c90547ZgF.LJIJ);
                if (c90547ZgF.LJJIJIIJI) {
                    Logger.d("ByteCastSinkImpl", "requestQRPingInfo ");
                }
                Dispatcher.getInstance().printThreadPool(null, "sink", "start server");
            }
        }
    }

    public static final void run$45(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        ((C90552ZgK) iDRunnableS86S0100000_24.l0).LIZ.LJIIJJI();
    }

    public static final void run$46(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        IInitListener iInitListener = (IInitListener) iDRunnableS86S0100000_24.l0;
        if (iInitListener != null) {
            iInitListener.onSuccess();
        }
    }

    public static final void run$5(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            ((ZYD) iDRunnableS86S0100000_24.l0).LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        boolean LIZ;
        try {
            IDRunnableS30S0200000_24 iDRunnableS30S0200000_24 = (IDRunnableS30S0200000_24) iDRunnableS86S0100000_24.l0;
            C90414Ze6 c90414Ze6 = (C90414Ze6) iDRunnableS30S0200000_24.l1;
            ServiceInfo serviceInfo = (ServiceInfo) iDRunnableS30S0200000_24.l0;
            c90414Ze6.getClass();
            Dispatcher.getInstance().enqueue(new IDRunnableS30S0200000_24(c90414Ze6, serviceInfo, 0));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        ((C90777Zjx) iDRunnableS86S0100000_24.l0).LJFF();
    }

    public static final void run$8(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        C90777Zjx c90777Zjx = (C90777Zjx) iDRunnableS86S0100000_24.l0;
        IBrowseListener iBrowseListener = c90777Zjx.LJII;
        if (iBrowseListener != null) {
            iBrowseListener.onBrowse(1, new ArrayList(((ConcurrentHashMap) c90777Zjx.LJIILJJIL).values()));
        }
    }

    public static final void run$9(IDRunnableS86S0100000_24 iDRunnableS86S0100000_24) {
        IBrowseListener iBrowseListener = ((C90776Zjw) iDRunnableS86S0100000_24.l0).LIZ.LJII;
        if (iBrowseListener != null) {
            iBrowseListener.onBrowse(2, new ArrayList());
        }
    }

    public IDRunnableS86S0100000_24(C90506Zfa c90506Zfa, int i) {
        this.$t = i;
        switch (i) {
            case 27:
            case 28:
            case 29:
                this.l0 = c90506Zfa;
                return;
            default:
                this.l0 = c90506Zfa;
                return;
        }
    }

    public IDRunnableS86S0100000_24(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
