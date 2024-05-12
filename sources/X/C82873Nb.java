package X;

import Y.ARunnableS37S0100000_1;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GifContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupGreetingContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupSystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.NudgeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareChallengeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareCompilationContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareEffectContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveEventContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareMusicContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareProductContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareQnAContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSearchContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStoryContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSubOnlyVideoContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSubscribeInviteContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareWebContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.applaunch.IMGlobalPullFinishedLegoTask;
import com.ss.android.ugc.aweme.im.sdk.common.controller.applaunch.IMInitReadyBootFinishLegoTask;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMServiceProvider;
import com.ss.android.ugc.aweme.im.sdk.common.data.manager.keva.IMCriticalFlowKeva;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.3Nb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82873Nb implements InterfaceC114804ey {
    public static final C82873Nb LIZ = new C82873Nb();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C3QT.LJLIL);
    public static final MutableLiveData<Integer> LIZJ;
    public static final MutableLiveData LIZLLL;

    public static void LJI() {
        String LIZ2 = C80763Ey.LIZ(false);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("onSDKLogin: ");
        LIZ3.append((Object) LIZ2);
        C34B.LJI("ClientBridgeImpl", X1D.LIZIZ(LIZ3));
        if (!C3E8.LIZ() && C3E5.LIZ == null) {
            C3E5.LIZ = C3E3.LIZ;
            ((C4Z2) C96423qQ.LIZ()).LJIIIZ();
        }
        if (C82903Ne.LIZ()) {
            C3NP c3np = C3NW.LIZIZ;
            c3np.LJ();
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C4WC.LIZIZ.LJIJI(c3np);
        }
        if (C82903Ne.LIZIZ() == 1) {
            C3MB observer = (C3MB) C3NW.LIZ.getValue();
            o.LJIIIZ(observer, "observer");
            C82213Kn.LIZ().LIZ(observer);
        }
        C3AB LIZ4 = C96423qQ.LIZ();
        C82983Nm.LIZ.getClass();
        ((C4Z2) LIZ4).LJJ(C82983Nm.LIZIZ);
        C34B.LJI("ClientBridgeImpl", "Pagination Experiment enable");
        C3NP c3np2 = C3NW.LIZIZ;
        c3np2.LJ();
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC.LIZIZ.LJIJI(c3np2);
        if (!C82893Nd.LIZ()) {
            LJIJ();
        }
        if ((((Number) C3O5.LIZ.getValue()).intValue() & 1) == 1) {
            C38995FSd.LIZIZ().execute(new Runnable() { // from class: X.3Nf
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ5;
                    try {
                        C31K.LJIIIZ();
                    } finally {
                        if (LIZ5) {
                        }
                    }
                }
            });
        } else {
            C31K.LJIIIZ();
        }
    }

    static {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(0);
        LIZJ = mutableLiveData;
        LIZLLL = mutableLiveData;
    }

    public static final void LJ() {
        C3K4.LIZJ(C3K4.LIZ, "2");
        if (!C81363Hg.LIZ()) {
            C31N.LIZ();
        }
        C83013Np.LIZ();
        C83003No onChanged = C83013Np.LIZ;
        o.LJIIIZ(onChanged, "onChanged");
        SettingsManager.LIZLLL().LJIIIZ(new F67() { // from class: X.3Nc
            public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL = C83013Np.LIZ;

            @Override // X.F67
            public final void onChanged() {
                int[] iArr = C82873Nb.LJIIIZ().LIZ;
                boolean LIZ2 = C3P4.LIZ();
                int length = iArr.length;
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (iArr[i] == 2) {
                        z = true;
                        break;
                    }
                    i++;
                }
                if (LIZ2 != z) {
                    this.LJLIL.invoke();
                }
            }
        });
        if (C3UM.LIZ() == 1 || C3UM.LIZ() == 4) {
            C36089EEj c36089EEj = new C36089EEj(false, false);
            c36089EEj.LIZIZ(new IMInitReadyBootFinishLegoTask(), true);
            c36089EEj.LIZJ();
        } else {
            C3HV.LIZ();
        }
        C87687YbD.LIZ.getClass();
        if (C87687YbD.LIZLLL()) {
            ((C4Z2) C96423qQ.LIZ()).LJII(C98693u5.LJI);
        }
    }

    public static final void LJFF() {
        C3K4.LIZJ(C3K4.LIZ, "1");
        if (C82893Nd.LIZ()) {
            LJIJ();
        }
        if (C82893Nd.LIZIZ() != 2) {
            if (C82893Nd.LIZIZ() == 3) {
                C43045Guv.LIZIZ(C82953Nj.LJLIL);
                return;
            } else if (C82893Nd.LIZIZ() == 4) {
                LJI();
                return;
            } else {
                C43045Guv.LIZJ(0L, new Runnable() { // from class: X.3OC
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ2;
                        try {
                            if (C100523x2.LIZ()) {
                                C38995FSd.LJFF().execute(new Runnable() { // from class: X.3OE
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean LIZ3;
                                        try {
                                            C82873Nb.LJI();
                                        } finally {
                                            if (LIZ3) {
                                            }
                                        }
                                    }
                                });
                            } else {
                                C82873Nb.LJI();
                            }
                        } finally {
                            if (LIZ2) {
                            }
                        }
                    }
                });
                return;
            }
        }
        C43045Guv.LIZLLL(C82943Ni.LJLIL, 0L);
    }

    public static final C3QU LJIIIZ() {
        return (C3QU) LIZIZ.getValue();
    }

    public static void LJIILJJIL() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onSDKLogout: ");
        LIZ2.append(C80763Ey.LIZLLL());
        LIZ2.append(", ");
        LIZ2.append((Object) C80763Ey.LIZ(false));
        C34B.LJI("ClientBridgeImpl", X1D.LIZIZ(LIZ2));
        if (!C82893Nd.LIZ()) {
            LJIJI();
        }
        IMCriticalFlowKeva.LIZIZ = null;
        IMCriticalFlowKeva.LIZJ = null;
        IMCriticalFlowKeva.LIZLLL = null;
        IMCriticalFlowKeva.LJ = null;
        if (C3E5.LIZ != null) {
            C3AB LIZ3 = C96423qQ.LIZ();
            o.LJI(C3E5.LIZ);
            LIZ3.getClass();
            C63309Osz.LIZLLL().LIZIZ = null;
            C3E5.LIZ = null;
        }
        C31Q c31q = C31Q.LJIILLIIL;
        c31q.LIZJ();
        C3GW c3gw = C3GW.LIZ;
        c3gw.LIZLLL();
        C3NW.LIZIZ.LJ();
        C3MB observer = (C3MB) C3NW.LIZ.getValue();
        o.LJIIIZ(observer, "observer");
        C82213Kn.LIZ().LJ(observer);
        C31L c31l = (C31L) C31K.LIZIZ.getValue();
        if (c31l != null) {
            c31l.LIZ();
        }
        C76002ya c76002ya = c31q.LJIIIIZZ;
        if (c76002ya != null) {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C4WC.LIZIZ.LJIIIZ(c76002ya);
        }
        C76022yc c76022yc = c31q.LJIIIZ;
        if (c76022yc != null) {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C4WC.LIZIZ.LJIIIZ(c76022yc);
        }
        C112444bA LJI = c31q.LJI();
        synchronized (LJI) {
            ((ArrayList) LJI.LJ).clear();
        }
        c3gw.LIZJ();
        C3PK c3pk = C3PK.LJI;
        c3pk.LIZ.LJFF("onSDKLogout clear all combined engines");
        for (C3PI c3pi : c3pk.LIZIZ.values()) {
            C98453th c98453th = (C98453th) c3pi.LJ.getValue();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("clear ");
            LIZ4.append(c3pi.LIZ);
            c98453th.LJFF(X1D.LIZIZ(LIZ4));
            C64962gm c64962gm = c3pi.LIZIZ;
            if (c64962gm != null) {
                C48841JEv.LIZJ(c64962gm, null);
            }
        }
        c3pk.LIZIZ.clear();
    }

    public static final void LJIILL() {
        C3K4.LIZJ(C3K4.LIZ, "3");
        if (C82893Nd.LIZ()) {
            LJIJI();
        }
        if (C82893Nd.LIZIZ() != 2) {
            if (C82893Nd.LIZIZ() == 3) {
                C43045Guv.LIZIZ(C82973Nl.LJLIL);
            } else if (C82893Nd.LIZIZ() == 4) {
                LJIILJJIL();
            } else {
                C43045Guv.LIZJ(0L, new Runnable() { // from class: X.3OD
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ2;
                        try {
                            if (C100523x2.LIZ()) {
                                C38995FSd.LJFF().execute(new Runnable() { // from class: X.3OF
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean LIZ3;
                                        try {
                                            C82873Nb.LJIILJJIL();
                                        } finally {
                                            if (LIZ3) {
                                            }
                                        }
                                    }
                                });
                            } else {
                                C82873Nb.LJIILJJIL();
                            }
                        } finally {
                            if (LIZ2) {
                            }
                        }
                    }
                });
            }
        } else {
            C43045Guv.LIZLLL(C82963Nk.LJLIL, 0L);
        }
        C87687YbD.LIZ.getClass();
        if (C87687YbD.LIZLLL()) {
            ((C4Z2) C96423qQ.LIZ()).LIZJ(C98693u5.LJI);
        }
        IMServiceProvider.INSTANCE.getInboxDmService().onSDKLogout();
        synchronized (C3K5.LJLIL) {
            ((LinkedHashMap) C3K5.LJLILLLLZI).clear();
            C3K5.LJLJI = true;
            C3K5.LJLJJI = true;
            C3K5.LJLJJL = true;
        }
    }

    public static final String LJIIIIZZ() {
        String LIZIZ2 = C85999Xp5.LIZIZ();
        o.LJIIIIZZ(LIZIZ2, "getAppLocale()");
        return LIZIZ2;
    }

    public static final void LJIILLIIL() {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("tt_im_init_performance", C51029K0z.LJJIIZI(new OSZ("duration", String.valueOf(SystemClock.uptimeMillis() - IMService.Companion.get().getInitTimestamp()))));
        synchronized (C3K5.LJLIL) {
            if (((Boolean) C3O7.LIZ.getValue()).booleanValue()) {
                C3K5.LIZJ("init", new AqS151S0100000_1(878));
            }
        }
    }

    public static void LJIJ() {
        if (C3TX.LIZIZ()) {
            C771431a.LIZ().LJIIL();
            C771431a.LIZ().LIZLLL();
        } else {
            C82253Kr LIZIZ2 = C37O.LIZIZ();
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C4WC.LIZIZ.LJFF(LIZIZ2.LL);
            C75782yE.LIZ();
            C4WC.LIZIZ(LIZIZ2.LJZ);
            C55888Lwa.LIZIZ.LJI(LIZIZ2.LJLZ);
            C82213Kn.LIZ().LIZ(LIZIZ2.LJIILL());
            C82233Kp.LIZ();
            C106774Gz.LIZLLL(LIZIZ2);
            LIZIZ2.LJIJJLI();
            C34B.LJI("SessionListManagerV2", "subscribe");
            XKX.LIZLLL(LIZIZ2.LJLJJLL, EXV.LIZ, null, new C37C(LIZIZ2, null), 2);
            C82253Kr LIZIZ3 = C37O.LIZIZ();
            if (C92333jp.LIZIZ()) {
                C96423qQ.LIZ();
                if (C4Z2.LJIILJJIL() != null) {
                    LIZIZ3.LJIIJ();
                } else {
                    new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS37S0100000_1(LIZIZ3, 95), 2000L);
                }
            }
        }
        C3K4.LIZJ(C3K4.LIZ, "13");
        synchronized (C3K5.LJLIL) {
            C3K5.LIZJ("subscribe", C3K8.LJLIL);
        }
    }

    public static void LJIJI() {
        if (C3TX.LIZIZ()) {
            C771431a.LIZ().LJIIJ();
            return;
        }
        C82253Kr LIZIZ2 = C37O.LIZIZ();
        C75782yE c75782yE = C3Q9.LIZ;
        c75782yE.getClass();
        C75782yE.LIZ();
        C4WC c4wc = C4WC.LIZIZ;
        c4wc.LJIIIZ(LIZIZ2.LL);
        C75782yE.LIZ();
        C4WC.LJIL(LIZIZ2.LJZ);
        C55888Lwa.LIZIZ.LJIJ(LIZIZ2.LJLZ);
        C82213Kn.LIZ().LJ(LIZIZ2.LJIILL());
        C82233Kp.LIZ();
        C106774Gz.LJI(LIZIZ2);
        C3K4.LIZJ(C3K4.LIZ, "14");
        C3M9 LJIILL = LIZIZ2.LJIILL();
        LJIILL.LIZ = 0;
        LJIILL.LIZIZ = false;
        ((ConcurrentHashMap) LIZIZ2.LJLJI).clear();
        LIZIZ2.LJLLLL = null;
        C64962gm c64962gm = LIZIZ2.LJLJJLL;
        XIF xif = EXV.LIZ;
        XKX.LIZLLL(c64962gm, xif, null, new C37D(LIZIZ2, null), 2);
        if (C92333jp.LIZIZ()) {
            C96423qQ.LIZ();
            if (C4Z2.LJIILJJIL() != null) {
                C95773pN c95773pN = C95773pN.LJLIL;
                c95773pN.getClass();
                C95773pN.LJLILLLLZI.clear();
                c75782yE.getClass();
                C75782yE.LIZ();
                c4wc.LJIIIZ(c95773pN);
                XKX.LIZLLL(LIZIZ2.LJLJJLL, xif, null, new C37F(LIZIZ2, null), 2);
            }
        }
        ((ConcurrentHashMap) LIZIZ2.LJLJI).clear();
        C82153Kh c82153Kh = LIZIZ2.LJLJL;
        c82153Kh.LIZ.removeMessages(2);
        XKQ xkq = c82153Kh.LJ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        c82153Kh.LJFF = -1;
        ((ConcurrentHashMap) LIZIZ2.LJLJLLL).clear();
        LIZIZ2.LJLLILLLL = null;
        if (C82903Ne.LIZ()) {
            C82213Kn.LIZ().LIZIZ();
        }
        C3LR.LIZ.getClass();
        C3LR.LIZIZ = null;
        C82253Kr.LJJIII(0, true, C61878OQg.INSTANCE);
    }

    public static final void LIZ(int i) {
        C3K4 c3k4 = C3K4.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("4(");
        LIZ2.append(i);
        LIZ2.append(')');
        C3K4.LIZJ(c3k4, X1D.LIZIZ(LIZ2));
    }

    public static final void LJIIL(C109544Rq msg) {
        o.LJIIIZ(msg, "msg");
        java.util.Map<String, String> localExt = msg.getLocalExt();
        o.LJIIIIZZ(localExt, "msg.localExt");
        localExt.put("send_sdk_time", String.valueOf(SystemClock.uptimeMillis()));
        if (C80763Ey.LIZ(false).equals(String.valueOf(C81273Gx.LIZLLL(msg.getConversationId())))) {
            msg.setMsgStatus(2);
        }
    }

    public static final int LJIIZILJ(C91933jB content) {
        o.LJIIIZ(content, "content");
        if (content instanceof BaseContent) {
            if (content instanceof TextContent) {
                return 7;
            }
            if (content instanceof GroupSystemContent) {
                return 1031;
            }
            if (content instanceof GroupGreetingContent) {
                return 1030;
            }
            if (content instanceof SystemContent) {
                return 1;
            }
            if (content instanceof ShareQnAContent) {
                return 33;
            }
            if (content instanceof ShareMusicContent) {
                return 22;
            }
            if (content instanceof ShareAwemeContent) {
                if (content instanceof ShareStoryContent) {
                    return 1025;
                }
                if (content instanceof ShareSubOnlyVideoContent) {
                    return 11;
                }
                return 8;
            }
            if ((content instanceof NudgeContent) || (content instanceof GifContent)) {
                return 5;
            }
            if (content instanceof CommentContent) {
                return 40;
            }
            if (content instanceof ShareChallengeContent) {
                return 19;
            }
            if (content instanceof ShareLiveContent) {
                return 1021;
            }
            if (content instanceof ShareLiveEventContent) {
                return 1034;
            }
            if (content instanceof ShareUserContent) {
                return 25;
            }
            if (content instanceof ShareWebContent) {
                return 26;
            }
            if (content instanceof ShareSearchContent) {
                return 1036;
            }
            if (content instanceof ShareCompilationContent) {
                return 81;
            }
            if (content instanceof ShareEffectContent) {
                return 72;
            }
            if (content instanceof GroupInviteCardContent) {
                return 1033;
            }
            if (content instanceof ShareProductContent) {
                return 43;
            }
            if (content instanceof ShareSubscribeInviteContent) {
                return 1038;
            }
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("error", C62070OXq.LIZIZ(content));
            } catch (Exception e) {
                hashMap.put("error", e.getMessage());
            }
            C36L.LIZLLL("error_msg_content", null, "im_event", hashMap);
        }
        return -1;
    }

    public final void LJII(InterfaceC88472Yns<? super InterfaceC114804ey, C76800UCe> interfaceC88472Yns) {
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS37S0100000_1(interfaceC88472Yns, 70));
    }

    public final MessageBody LJIIJJI(MessageBody body) {
        o.LJIIIZ(body, "body");
        Integer num = body.message_type;
        if (num != null && num.intValue() == 1) {
            try {
                SystemContent systemContent = (SystemContent) C62070OXq.LIZ(SystemContent.class, body.content);
                if (systemContent != null) {
                    long LJI = EF7.LJI();
                    long minVersion = systemContent.getMinVersion();
                    long maxVersion = systemContent.getMaxVersion();
                    if (maxVersion == 0) {
                        maxVersion = LJI;
                    }
                    if (minVersion <= LJI && LJI < maxVersion) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("filter system message:");
                        LIZ2.append(systemContent);
                        C34B.LJI("DmHelper", X1D.LIZIZ(LIZ2));
                        return null;
                    }
                }
            } catch (Exception unused) {
                return body;
            }
        }
        Keva kevaRepo = C105004Ae.LIZ();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        return body;
    }

    public static final void LJIILIIL(int i, int i2) {
        if (i2 == 1 && i == 0) {
            C36089EEj c36089EEj = new C36089EEj(false, false);
            c36089EEj.LIZIZ(new IMGlobalPullFinishedLegoTask(), true);
            c36089EEj.LIZJ();
        }
    }

    @Override // X.InterfaceC114804ey
    public final void LIZIZ(int i, int i2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onPullMsg inbox ");
        LIZ2.append(i);
        LIZ2.append(", reason ");
        LIZ2.append(i2);
        C34B.LJI("ClientBridgeImpl", X1D.LIZIZ(LIZ2));
    }

    @Override // X.InterfaceC114804ey
    public final void LIZLLL(int i, int i2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onSDKInitState inbox=");
        LIZ2.append(i);
        LIZ2.append(" result=");
        LIZ2.append(i2);
        C34B.LJI("ClientBridgeImpl", X1D.LIZIZ(LIZ2));
        LIZJ.setValue(Integer.valueOf(i2));
    }

    public static final void LJIIJ(C63120Opw c63120Opw, C109544Rq c109544Rq, C91933jB content) {
        o.LJIIIZ(content, "content");
        BaseContent baseContent = null;
        if (content instanceof BaseContent) {
            baseContent = (BaseContent) content;
        }
        if (baseContent != null) {
            if (c109544Rq.getMsgType() == 5 && (baseContent instanceof GifContent) && baseContent.type == 504 && !((GifContent) baseContent).isUpdateConversationTime()) {
                c109544Rq.addLocalExt("awe:create_time", String.valueOf(System.currentTimeMillis()));
                c109544Rq.setCreatedAt(c63120Opw.getUpdatedTime() + 1);
            }
            c109544Rq.addLocalExt("send_time", String.valueOf(baseContent.getSendStartTime()));
        }
        String valueOf = String.valueOf(content.hashCode());
        String LIZ2 = C60622Zm.LIZ(valueOf, "process_id");
        if (!TextUtils.isEmpty(LIZ2)) {
            c109544Rq.addLocalExt("process_id", LIZ2);
        }
        String LIZ3 = C60622Zm.LIZ(valueOf, "enter_from");
        if (!TextUtils.isEmpty(LIZ3)) {
            c109544Rq.addLocalExt("enter_from", LIZ3);
        }
        String LIZ4 = C60622Zm.LIZ(valueOf, "panel_source");
        if (C78685UuP.LJJJZ(LIZ4)) {
            c109544Rq.addLocalExt("panel_source", LIZ4);
        }
        String LIZ5 = C60622Zm.LIZ(valueOf, "message_type");
        if (!TextUtils.isEmpty(LIZ5)) {
            c109544Rq.addLocalExt("message_type", LIZ5);
        }
        String LIZ6 = C60622Zm.LIZ(valueOf, "enter_method");
        if (!TextUtils.isEmpty(LIZ6)) {
            c109544Rq.addLocalExt("enter_method", LIZ6);
        }
        String LIZ7 = C60622Zm.LIZ(valueOf, "rec_map");
        if (!TextUtils.isEmpty(LIZ7)) {
            c109544Rq.addLocalExt("rec_map", LIZ7);
        }
        String LIZ8 = C60622Zm.LIZ(valueOf, "is_private_profile");
        if (!TextUtils.isEmpty(LIZ8)) {
            c109544Rq.addLocalExt("is_private_profile", LIZ8);
        }
        Keva kevaRepo = C105004Ae.LIZ();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String LIZ9 = C60622Zm.LIZ(valueOf, "is_share_pop_up");
        if (LIZ9 == null || LIZ9.length() == 0) {
            return;
        }
        c109544Rq.addLocalExt("is_share_pop_up", LIZ9);
    }

    @Override // X.InterfaceC114804ey
    public final void LIZJ(int i, long j, String str, java.util.Map map, boolean z) {
        String str2;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onPullMsgEnd, inbox ");
        LIZ2.append(i);
        LIZ2.append(", success ");
        LIZ2.append(z);
        LIZ2.append(", duration ");
        C65232Piu.LIZLLL(LIZ2, j, ", reason ", str);
        LIZ2.append(", etParams ");
        if (map != null) {
            str2 = map.toString();
        } else {
            str2 = null;
        }
        C48690J9a.LJIIL(LIZ2, str2, LIZ2, "ClientBridgeImpl");
        if (z) {
            C31Q c31q = C31Q.LJIILLIIL;
            if (c31q.LJIIJ == -1) {
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C75972yX(c31q, null), 3);
            }
        }
        if (C3PG.LIZIZ.LIZ("dm_dev_pull_message_result")) {
            return;
        }
        JSONObject LIZLLL2 = C770830u.LIZLLL("inbox_type", i);
        LIZLLL2.put("success", !z ? 1 : 0);
        LIZLLL2.put("duration", j);
        LIZLLL2.put("trigger", str);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                LIZLLL2.put((String) entry.getKey(), entry.getValue());
            }
        }
        C772831o.LIZ().LIZ("dm_dev_pull_message_result", LIZLLL2);
    }
}
