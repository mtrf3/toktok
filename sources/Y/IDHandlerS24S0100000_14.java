package Y;

import X.C42299Git;
import X.C44687HgJ;
import X.C44694HgQ;
import X.C45697Hwb;
import X.C48315Ixj;
import X.C48651J7n;
import X.C77413UZt;
import X.C79332VBo;
import X.C79346VCc;
import X.C79347VCd;
import X.C79350VCg;
import X.C80015Val;
import X.C80024Vau;
import X.C83489Wph;
import X.C83492Wpk;
import X.C83540WqW;
import X.C84091WzP;
import X.InterfaceC80022Vas;
import X.InterfaceC83500Wps;
import X.J7Z;
import X.PMX;
import X.VAK;
import X.VAT;
import X.VBW;
import X.VDN;
import X.VDR;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sticker.EffectSdkExtra;
import com.ss.videoarch.strategy.LiveStrategyManager;
import com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer;
import com.ss.videoarch.strategy.strategy.smartStrategy.TopNHostStrategy;
import com.ss.videoarch.strategy.utils.smartStrategy.PitayaWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class IDHandlerS24S0100000_14 extends Handler {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                handleMessage$0(this, message);
                return;
            case 1:
                handleMessage$1(this, message);
                return;
            case 2:
                handleMessage$2(this, message);
                return;
            case 3:
                handleMessage$3(this, message);
                return;
            case 4:
                handleMessage$4(this, message);
                return;
            case 5:
                handleMessage$5(this, message);
                return;
            case 6:
                handleMessage$6(this, message);
                return;
            case 7:
                handleMessage$7(this, message);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    public static final void handleMessage$0(IDHandlerS24S0100000_14 iDHandlerS24S0100000_14, Message message) {
        if (message == null) {
            return;
        }
        switch (message.what) {
            case 1024:
                ((LiveStrategyManager) iDHandlerS24S0100000_14.l0).mReceiveMessage++;
                if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableDnsOptimizer == 1 && C79346VCc.LIZLLL().LJIIL.LIZLLL.mNodeLocalDnsRequestInterval != 0 && ((LiveStrategyManager) iDHandlerS24S0100000_14.l0).mReceiveMessage % C79346VCc.LIZLLL().LJIIL.LIZLLL.mNodeLocalDnsRequestInterval == 0) {
                    JSONObject runStrategy = TopNHostStrategy.LIZJ().runStrategy();
                    TopNHostStrategy.LIZJ().getClass();
                    Set<String> LIZLLL = TopNHostStrategy.LIZLLL(runStrategy);
                    if (LIZLLL != null && ((HashSet) LIZLLL).size() > 0) {
                        DnsOptimizer.LJFF().LJIIZILJ = LIZLLL;
                    }
                    DnsOptimizer.LJFF().LJIIJ(((LiveStrategyManager) iDHandlerS24S0100000_14.l0).mOnParseDnsCompletionListener, null);
                    return;
                }
                PMX.LIZIZ().LIZIZ.LIZIZ(null, false);
                return;
            case 1025:
            default:
                return;
            case 1026:
                ((LiveStrategyManager) iDHandlerS24S0100000_14.l0).mThreadPool.submit(new ARunnableS50S0100000_14(iDHandlerS24S0100000_14, 130));
                return;
            case 1027:
                C79350VCg.LJ().LIZLLL();
                ((LiveStrategyManager) iDHandlerS24S0100000_14.l0).mHandler.removeMessages(1027);
                ((LiveStrategyManager) iDHandlerS24S0100000_14.l0).mHandler.sendEmptyMessageDelayed(1027, C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableCollectTime);
                return;
            case 1028:
                ((LiveStrategyManager) iDHandlerS24S0100000_14.l0).mThreadPool.submit(new ARunnableS20S0000000_14(5));
                return;
            case 1029:
                if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableUpdateCharToLiveIO == 1) {
                    C79332VBo.LIZ().runStrategy();
                }
                ((LiveStrategyManager) iDHandlerS24S0100000_14.l0).mHandler.removeMessages(1029);
                ((LiveStrategyManager) iDHandlerS24S0100000_14.l0).mHandler.sendEmptyMessageDelayed(1029, C79346VCc.LIZLLL().LJIIL.LIZLLL.mUpdateCharToLiveIOTimer);
                return;
        }
    }

    public static final void handleMessage$1(IDHandlerS24S0100000_14 iDHandlerS24S0100000_14, Message message) {
        if (message == null) {
            return;
        }
        switch (message.what) {
            case 1024:
                ((LiveStrategyManager) iDHandlerS24S0100000_14.l0).mReceiveMessage++;
                if (C79346VCc.LIZLLL().LJIILLIIL == 1) {
                    long currentTimeMillis = System.currentTimeMillis();
                    LiveStrategyManager liveStrategyManager = (LiveStrategyManager) iDHandlerS24S0100000_14.l0;
                    if ((currentTimeMillis - liveStrategyManager.mLastEndTS) - (liveStrategyManager.mTTLMs + C79346VCc.LIZLLL().LJJIII) > 0) {
                        C79346VCc.LIZLLL().LJJIIJ++;
                    } else {
                        C79346VCc LIZLLL = C79346VCc.LIZLLL();
                        C79346VCc LIZLLL2 = C79346VCc.LIZLLL();
                        int i = LIZLLL2.LJJIIJ - 1;
                        LIZLLL2.LJJIIJ = i;
                        LIZLLL.LJJIIJ = Math.max(i, 0);
                    }
                    C79346VCc.LIZLLL().LJJIII = Math.min(C79346VCc.LIZLLL().LJJIIJ * C79346VCc.LIZLLL().LJJIIJ, 10) * 60 * 1000;
                    ((LiveStrategyManager) iDHandlerS24S0100000_14.l0).mHandler.postDelayed(new ARunnableS50S0100000_14(iDHandlerS24S0100000_14, 133), C79346VCc.LIZLLL().LJJIII);
                    return;
                }
                if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableDnsOptimizer == 1 && C79346VCc.LIZLLL().LJIIL.LIZLLL.mNodeLocalDnsRequestInterval != 0 && ((LiveStrategyManager) iDHandlerS24S0100000_14.l0).mReceiveMessage % C79346VCc.LIZLLL().LJIIL.LIZLLL.mNodeLocalDnsRequestInterval == 0) {
                    DnsOptimizer.LJFF().LJIIJ(((LiveStrategyManager) iDHandlerS24S0100000_14.l0).mOnParseDnsCompletionListener, null);
                    return;
                } else {
                    PMX.LIZIZ().LIZIZ.LIZIZ(null, false);
                    return;
                }
            case 1025:
                if (LiveStrategyManager.mSRPredictEngine == null || VBW.LIZIZ().LIZIZ == 1) {
                    VBW.LIZIZ().LIZ();
                    return;
                } else {
                    LiveStrategyManager.mSRPredictEngine.LIZ();
                    return;
                }
            case 1026:
                ((LiveStrategyManager) iDHandlerS24S0100000_14.l0).mThreadPool.submit(new ARunnableS50S0100000_14(iDHandlerS24S0100000_14, 134));
                return;
            case 1027:
                C79350VCg.LJ().LIZLLL();
                ((LiveStrategyManager) iDHandlerS24S0100000_14.l0).mHandler.removeMessages(1027);
                ((LiveStrategyManager) iDHandlerS24S0100000_14.l0).mHandler.sendEmptyMessageDelayed(1027, C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableCollectTime);
                return;
            case 1028:
                if (!C79347VCd.LIZ().LIZ || C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableUsePTY != 1 || !PitayaCoreFactory.getCore(PitayaWrapper.LIZIZ().LIZIZ).isReady()) {
                    return;
                }
                C79347VCd.LIZ().LIZ = false;
                C79347VCd.LIZ().runStrategy();
                C79347VCd.LIZ().LIZIZ(-1L);
                return;
            case 1029:
                if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableUpdateCharToLiveIO == 1) {
                    C79332VBo.LIZ().runStrategy();
                }
                ((LiveStrategyManager) iDHandlerS24S0100000_14.l0).mHandler.removeMessages(1029);
                ((LiveStrategyManager) iDHandlerS24S0100000_14.l0).mHandler.sendEmptyMessageDelayed(1029, C79346VCc.LIZLLL().LJIIL.LIZLLL.mUpdateCharToLiveIOTimer);
                return;
            default:
                return;
        }
    }

    public static final void handleMessage$2(IDHandlerS24S0100000_14 iDHandlerS24S0100000_14, Message message) {
        switch (message.what) {
            case 10001:
                long currentTimeMillis = System.currentTimeMillis();
                VAK vak = (VAK) iDHandlerS24S0100000_14.l0;
                if (currentTimeMillis - vak.LIZJ < vak.LIZIZ) {
                    vak.LJFF(-100015);
                    ((VAT) ((VAK) iDHandlerS24S0100000_14.l0).LIZ).LIZ(false);
                    VAK vak2 = (VAK) iDHandlerS24S0100000_14.l0;
                    vak2.LJIIZILJ.sendEmptyMessageDelayed(10001, vak2.LIZLLL);
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("stallTime", Long.valueOf(currentTimeMillis - ((VAK) iDHandlerS24S0100000_14.l0).LIZJ));
                ((VAK) iDHandlerS24S0100000_14.l0).LIZ(-1, new C48315Ixj(-100007, "Stall retry timeout", hashMap));
                return;
            case 10002:
            case 10003:
                ((VAK) iDHandlerS24S0100000_14.l0).LIZ(2, null);
                return;
            case 10004:
                ((VAK) iDHandlerS24S0100000_14.l0).LIZ(1, null);
                return;
            case 10005:
                ((VAK) iDHandlerS24S0100000_14.l0).LIZ(7, null);
                return;
            case 10006:
                ((VAK) iDHandlerS24S0100000_14.l0).LIZ(9, null);
                return;
            default:
                return;
        }
    }

    public static final void handleMessage$3(IDHandlerS24S0100000_14 iDHandlerS24S0100000_14, Message msg) {
        int i;
        int i2;
        boolean z;
        Bundle data;
        ArrayList<String> stringArrayList;
        EffectSdkExtra effectSdkExtra;
        C83492Wpk c83492Wpk;
        String str;
        o.LJIIIZ(msg, "msg");
        int i3 = msg.what;
        if (i3 != 1001) {
            if (i3 != 1004 || (stringArrayList = (data = msg.getData()).getStringArrayList("img_list")) == null || (effectSdkExtra = (EffectSdkExtra) data.getParcelable("effect_sdk_extra")) == null || stringArrayList.isEmpty() || effectSdkExtra.getPl().getAlg().isEmpty() || (str = (c83492Wpk = (C83492Wpk) iDHandlerS24S0100000_14.l0).LJ) == null) {
                return;
            }
            c83492Wpk.LJII.LIZ(str, stringArrayList, effectSdkExtra, c83492Wpk.LJI);
            return;
        }
        Message obtain = Message.obtain();
        C83492Wpk c83492Wpk2 = (C83492Wpk) iDHandlerS24S0100000_14.l0;
        Context context = c83492Wpk2.LJIIIIZZ;
        int i4 = c83492Wpk2.LJIIIZ;
        C83489Wph c83489Wph = c83492Wpk2.LJIIJ;
        boolean z2 = c83492Wpk2.LJIIJJI;
        o.LJIIIZ(context, "context");
        ArrayList arrayList = new ArrayList();
        C83540WqW.LIZ.getValue().getClass();
        List<MediaModel> LIZIZ = C45697Hwb.LIZIZ(context, false, i4, 0, null);
        if (C77413UZt.LJIILL(LIZIZ)) {
            arrayList = null;
        } else {
            if (c83489Wph != null && z2) {
                i = c83489Wph.LJ.getPl().getMinFilterWidth();
                i2 = c83489Wph.LJ.getPl().getMinFilterHeight();
            } else {
                i = -1;
                i2 = -1;
            }
            for (MediaModel mediaModel : LIZIZ) {
                if (C44687HgJ.LIZIZ(mediaModel.fileLocalUriPath) && C44694HgQ.LJIJJ(mediaModel)) {
                    int i5 = mediaModel.width;
                    int i6 = mediaModel.height;
                    if (i5 <= 0 || i6 <= 0) {
                        int[] LIZJ = C42299Git.LIZJ(mediaModel.fileLocalUriPath);
                        i5 = LIZJ[0];
                        i6 = LIZJ[1];
                    }
                    float f = i5;
                    float f2 = i6;
                    if (f > f2 * 2.5f || f2 > f * 2.5f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i != -1) {
                        if (i2 != -1) {
                            if (i5 >= i && i6 >= i2 && !z) {
                                arrayList.add(mediaModel.fileLocalUriPath);
                            }
                        } else if (i != -1) {
                            if (i5 >= i && !z) {
                                arrayList.add(mediaModel.fileLocalUriPath);
                            }
                        }
                    }
                    if (i2 != -1) {
                        if (i6 >= i2 && !z) {
                            arrayList.add(mediaModel.fileLocalUriPath);
                        }
                    } else if (i5 >= 360 && i6 >= 480 && !z) {
                        arrayList.add(mediaModel.fileLocalUriPath);
                    }
                }
            }
        }
        obtain.obj = arrayList;
        obtain.what = 1001;
        IDHandlerS24S0100000_14 iDHandlerS24S0100000_142 = ((C83492Wpk) iDHandlerS24S0100000_14.l0).LIZJ;
        if (iDHandlerS24S0100000_142 == null) {
            return;
        }
        iDHandlerS24S0100000_142.sendMessage(obtain);
    }

    public static final void handleMessage$4(IDHandlerS24S0100000_14 iDHandlerS24S0100000_14, Message msg) {
        InterfaceC83500Wps interfaceC83500Wps;
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i != 1001) {
            if (i != 1002) {
                return;
            }
            Object obj = msg.obj;
            if (obj != null) {
                C83489Wph c83489Wph = (C83489Wph) obj;
                String str = ((C83492Wpk) iDHandlerS24S0100000_14.l0).LJ;
                if (str == null || !o.LJ(str, c83489Wph.LIZLLL)) {
                    return;
                }
                C83492Wpk c83492Wpk = (C83492Wpk) iDHandlerS24S0100000_14.l0;
                InterfaceC83500Wps interfaceC83500Wps2 = c83492Wpk.LIZLLL;
                if (interfaceC83500Wps2 != null) {
                    interfaceC83500Wps2.LIZJ(c83489Wph);
                }
                if (TextUtils.isEmpty(c83489Wph.LIZIZ) || !o.LJ(c83489Wph.LIZIZ, c83492Wpk.LJFF) || (interfaceC83500Wps = c83492Wpk.LIZLLL) == null) {
                    return;
                }
                interfaceC83500Wps.LIZLLL();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.data.UploadPicData");
        }
        ArrayList arrayList = new ArrayList();
        Object obj2 = msg.obj;
        if (obj2 != null) {
            arrayList = (ArrayList) obj2;
        }
        InterfaceC83500Wps interfaceC83500Wps3 = ((C83492Wpk) iDHandlerS24S0100000_14.l0).LIZLLL;
        if (interfaceC83500Wps3 == null) {
            return;
        }
        interfaceC83500Wps3.LIZIZ(arrayList);
    }

    public static final void handleMessage$5(IDHandlerS24S0100000_14 iDHandlerS24S0100000_14, Message message) {
        if (message != null && message.what == 1024) {
            VDR vdr = (VDR) iDHandlerS24S0100000_14.l0;
            if (vdr.LJIIL) {
                vdr.LJIIJ();
            } else {
                VDN.LIZIZ().LIZJ.LIZ();
            }
        }
    }

    public static final void handleMessage$6(IDHandlerS24S0100000_14 iDHandlerS24S0100000_14, Message message) {
        super.handleMessage(message);
        ((C84091WzP) iDHandlerS24S0100000_14.l0).LJIIIZ(message);
    }

    public static final void handleMessage$7(IDHandlerS24S0100000_14 iDHandlerS24S0100000_14, Message message) {
        InterfaceC80022Vas interfaceC80022Vas;
        super.handleMessage(message);
        C80024Vau c80024Vau = ((C80015Val) ((AqS164S0100000_14) iDHandlerS24S0100000_14.l0).l0).LJLIL;
        if (c80024Vau != null && (interfaceC80022Vas = c80024Vau.LJLJJL) != null && message != null && message.what == 1 && interfaceC80022Vas.LJ().isPlayingState()) {
            J7Z.LIZIZ(C80015Val.LJLJL, "AUDIOFOCUS_LOSS, and pause the play");
            interfaceC80022Vas.LIZIZ(new C48651J7n("PAUSE_FROM_LOSS_FOCUS"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS24S0100000_14(Object obj, Looper looper, int i) {
        super(looper);
        this.$t = i;
        this.l0 = obj;
    }
}
