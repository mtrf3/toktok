package Y;

import X.C221018lt;
import X.C38891fp;
import X.C53691L5j;
import X.C53700L5s;
import X.C56895MUp;
import X.C58053MqP;
import X.C73433Srt;
import X.C76800UCe;
import X.C78580Usi;
import X.HG3;
import X.InterfaceC54862Lg2;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.JG5;
import X.L5Y;
import X.M4S;
import X.MCR;
import X.MP1;
import X.MP2;
import X.MS5;
import X.RBX;
import X.T16;
import X.X1D;
import android.text.SpannableStringBuilder;
import com.bytedance.keva.Keva;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel;
import com.ss.android.ugc.aweme.service.FriendsTabDbService;
import defpackage.i0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDuS320S0100000_9 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<SpannableStringBuilder> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            case 2:
                subscribe$2(this, interfaceC73573Su9);
                return;
            case 3:
                subscribe$3(this, interfaceC73573Su9);
                return;
            case 4:
                subscribe$4(this, interfaceC73573Su9);
                return;
            case 5:
                subscribe$5(this, interfaceC73573Su9);
                return;
            case 6:
                subscribe$6(this, interfaceC73573Su9);
                return;
            case 7:
                subscribe$7(this, interfaceC73573Su9);
                return;
            case 8:
                subscribe$8(this, interfaceC73573Su9);
                return;
            case 9:
                subscribe$9(this, interfaceC73573Su9);
                return;
            case 10:
                subscribe$10(this, interfaceC73573Su9);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                subscribe$11(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public IDuS320S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(IDuS320S0100000_9 iDuS320S0100000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        MCR mcr;
        C58053MqP c58053MqP = (C58053MqP) iDuS320S0100000_9.l0;
        if (!c58053MqP.LIZIZ.LIZIZ || (mcr = c58053MqP.LJI) == null) {
            c58053MqP.LJIIZILJ = false;
            interfaceC73573Su9.onComplete();
            return;
        }
        c58053MqP.LJIIZILJ = true;
        if (!c58053MqP.LJIIIZ) {
            c58053MqP.LJIJ = false;
            C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
            mcr.LIZJ().LJJL(T16.LIZLLL).LJJJLL(new AfS58S0200000_9(c58053MqP, c73433Srt, 0), new AfS58S0200000_9(c58053MqP, c73433Srt, 1), new IDaS219S0100000_9(c73433Srt, 0));
        } else {
            c58053MqP.LJIJ = true;
            interfaceC73573Su9.onComplete();
        }
    }

    public static final void subscribe$1(IDuS320S0100000_9 iDuS320S0100000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        M4S m4s = (M4S) iDuS320S0100000_9.l0;
        m4s.getClass();
        MS5.LIZ(new AqS156S0200000_9(m4s, (C73433Srt) interfaceC73573Su9, 24));
    }

    public static final void subscribe$10(IDuS320S0100000_9 iDuS320S0100000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        MP1 mp1 = (MP1) iDuS320S0100000_9.l0;
        C38891fp.LJJIJ(interfaceC73573Su9, mp1.LJIILIIL(mp1.LIZIZ(), null));
    }

    public static final void subscribe$11(IDuS320S0100000_9 iDuS320S0100000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        L5Y l5y;
        AqS175S0100000_9 aqS175S0100000_9;
        ((L5Y) iDuS320S0100000_9.l0).LJLLI = new AqS175S0100000_9((C73433Srt) interfaceC73573Su9, 583);
        L5Y l5y2 = (L5Y) iDuS320S0100000_9.l0;
        if (l5y2.LJLLILLLL == null && l5y2.getAnimateProgress() > 0.0f && (aqS175S0100000_9 = (l5y = (L5Y) iDuS320S0100000_9.l0).LJLLI) != null) {
            aqS175S0100000_9.invoke(Float.valueOf(l5y.getAnimateProgress()));
        }
    }

    public static final void subscribe$2(IDuS320S0100000_9 iDuS320S0100000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        try {
            Object obj = JG5.LIZ().LJFF(((List) iDuS320S0100000_9.l0).toString()).items;
            if (obj == null) {
                obj = new ArrayList();
            }
            C38891fp.LJJIJ(interfaceC73573Su9, obj);
        } catch (Throwable th) {
            C221018lt.LIZJ("NoticeVideoManager", "requestDataReal error", th);
            C38891fp.LJJIJ(interfaceC73573Su9, new ArrayList());
        }
    }

    public static final void subscribe$3(IDuS320S0100000_9 iDuS320S0100000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        ((FriendsTabDbService) iDuS320S0100000_9.l0).LJIIL().LJII();
        interfaceC73573Su9.onNext(C76800UCe.LIZ);
        interfaceC73573Su9.onComplete();
    }

    public static final void subscribe$4(IDuS320S0100000_9 iDuS320S0100000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        InterfaceC54862Lg2 LJIIL = ((FriendsTabDbService) iDuS320S0100000_9.l0).LJIIL();
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        interfaceC73573Su9.onNext(LJIIL.LJI(31, curUserId));
        interfaceC73573Su9.onComplete();
    }

    public static final void subscribe$5(IDuS320S0100000_9 iDuS320S0100000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        ((C53691L5j) iDuS320S0100000_9.l0).LJLLI = new AqS175S0100000_9((C73433Srt) interfaceC73573Su9, 384);
    }

    public static final void subscribe$6(IDuS320S0100000_9 iDuS320S0100000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        ((C53700L5s) iDuS320S0100000_9.l0).LJLJJL = new AqS175S0100000_9((C73433Srt) interfaceC73573Su9, 391);
    }

    public static final void subscribe$7(IDuS320S0100000_9 iDuS320S0100000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        TutorialVideoViewModel tutorialVideoViewModel = (TutorialVideoViewModel) iDuS320S0100000_9.l0;
        tutorialVideoViewModel.getClass();
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        Keva repo = Keva.getRepo("top_message_keva_repo");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("msg_id_");
        LIZ.append(curUserId);
        String msgId = repo.getString(X1D.LIZIZ(LIZ), "");
        long LIZIZ = C78580Usi.LIZIZ("first_show_time_", curUserId, repo, 0L);
        long LIZIZ2 = C78580Usi.LIZIZ("current_show_time_", curUserId, repo, 0L);
        int LIZJ = i0.LIZJ("clicked_", curUserId, repo, 0);
        o.LJIIIIZZ(msgId, "msgId");
        TutorialVideoApiManager.LIZ.getTutorialVideoAndPoint(msgId, LIZIZ, LIZIZ2, LIZJ).LIZLLL(new C56895MUp((C73433Srt) interfaceC73573Su9, tutorialVideoViewModel, msgId, repo, curUserId));
    }

    public static final void subscribe$8(IDuS320S0100000_9 iDuS320S0100000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        ((MP2) iDuS320S0100000_9.l0).LJIIL.LIZLLL();
        C38891fp.LJJIJ(interfaceC73573Su9, Boolean.TRUE);
    }

    public static final void subscribe$9(IDuS320S0100000_9 iDuS320S0100000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        MP1 mp1 = (MP1) iDuS320S0100000_9.l0;
        C38891fp.LJJIJ(interfaceC73573Su9, mp1.LJIILIIL(mp1.LIZIZ(), null));
    }

    public IDuS320S0100000_9(MP2 mp2, boolean z, int i) {
        this.$t = i;
        this.l0 = mp2;
    }
}
