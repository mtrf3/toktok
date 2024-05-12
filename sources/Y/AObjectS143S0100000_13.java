package Y;

import X.C05170If;
import X.C0NB;
import X.C0RN;
import X.C277116x;
import X.C74951TbH;
import X.C75492Tk0;
import X.C75501Tk9;
import X.C75677Tmz;
import X.C75678Tn0;
import X.C75732Tns;
import X.C75768ToS;
import X.C75883TqJ;
import X.C76535U1z;
import X.C76800UCe;
import X.C78857UxB;
import X.C8E;
import X.CN1;
import X.FT5;
import X.InterfaceC75495Tk3;
import X.InterfaceC88471Ynr;
import X.TQV;
import X.X1D;
import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import java.util.TreeMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AObjectS143S0100000_13 implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case 9:
                return invoke$9(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS143S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS143S0100000_13 aObjectS143S0100000_13, Object obj, Object obj2) {
        Context context = (Context) obj;
        PerceptionDialogInfo perceptionDialogInfo = (PerceptionDialogInfo) obj2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(perceptionDialogInfo, "perceptionDialogInfo");
        String str = perceptionDialogInfo.violationDetailUrl;
        if (str != null && str.length() != 0) {
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, perceptionDialogInfo.violationDetailUrl);
        }
        C277116x c277116x = ((MultiGuestV3GuestPresenter) aObjectS143S0100000_13.l0).copyrightPerceptionHelper;
        if (c277116x != null) {
            c277116x.LJ = true;
            c277116x.LIZJ(201);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS143S0100000_13 aObjectS143S0100000_13, Object context, Object perceptionDialogInfo) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(perceptionDialogInfo, "perceptionDialogInfo");
        C277116x c277116x = ((MultiGuestV3GuestPresenter) aObjectS143S0100000_13.l0).copyrightPerceptionHelper;
        if (c277116x != null) {
            c277116x.LJ = true;
            c277116x.LIZJ(202);
        }
        C277116x c277116x2 = ((MultiGuestV3GuestPresenter) aObjectS143S0100000_13.l0).copyrightPerceptionHelper;
        if (c277116x2 != null) {
            c277116x2.LIZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AObjectS143S0100000_13 aObjectS143S0100000_13, Object obj, Object obj2) {
        Context context = (Context) obj;
        PerceptionDialogInfo perceptionDialogInfo = (PerceptionDialogInfo) obj2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(perceptionDialogInfo, "perceptionDialogInfo");
        String str = perceptionDialogInfo.violationDetailUrl;
        if (str != null && str.length() != 0) {
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, perceptionDialogInfo.violationDetailUrl);
        }
        C277116x c277116x = ((TQV) aObjectS143S0100000_13.l0).LJZ;
        if (c277116x != null) {
            c277116x.LJ = true;
            c277116x.LIZJ(201);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AObjectS143S0100000_13 aObjectS143S0100000_13, Object context, Object perceptionDialogInfo) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(perceptionDialogInfo, "perceptionDialogInfo");
        C277116x c277116x = ((TQV) aObjectS143S0100000_13.l0).LJZ;
        if (c277116x != null) {
            c277116x.LJ = true;
            c277116x.LIZJ(202);
        }
        C277116x c277116x2 = ((TQV) aObjectS143S0100000_13.l0).LJZ;
        if (c277116x2 != null) {
            c277116x2.LIZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AObjectS143S0100000_13 aObjectS143S0100000_13, Object obj, Object obj2) {
        Context context = (Context) obj;
        PerceptionDialogInfo perceptionDialogInfo = (PerceptionDialogInfo) obj2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(perceptionDialogInfo, "perceptionDialogInfo");
        String str = perceptionDialogInfo.violationDetailUrl;
        if (str != null && str.length() != 0) {
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, perceptionDialogInfo.violationDetailUrl);
        }
        C277116x c277116x = ((GameLinkGuestPresenter) aObjectS143S0100000_13.l0).copyrightPerceptionHelper;
        if (c277116x != null) {
            c277116x.LJ = true;
            c277116x.LIZJ(201);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AObjectS143S0100000_13 aObjectS143S0100000_13, Object context, Object perceptionDialogInfo) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(perceptionDialogInfo, "perceptionDialogInfo");
        C277116x c277116x = ((GameLinkGuestPresenter) aObjectS143S0100000_13.l0).copyrightPerceptionHelper;
        if (c277116x != null) {
            c277116x.LJ = true;
            c277116x.LIZJ(202);
        }
        C277116x c277116x2 = ((GameLinkGuestPresenter) aObjectS143S0100000_13.l0).copyrightPerceptionHelper;
        if (c277116x2 != null) {
            c277116x2.LIZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AObjectS143S0100000_13 aObjectS143S0100000_13, Object obj, Object obj2) {
        MultiGuestPreviewFragment multiGuestPreviewFragment = (MultiGuestPreviewFragment) aObjectS143S0100000_13.l0;
        TreeMap treeMap = (TreeMap) obj2;
        C76535U1z c76535U1z = multiGuestPreviewFragment.LLILLJJLI;
        if (c76535U1z != null) {
            C74951TbH.LJIIIZ(treeMap, c76535U1z.LJLIL, multiGuestPreviewFragment.LLILZ);
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$7(AObjectS143S0100000_13 aObjectS143S0100000_13, Object obj, Object obj2) {
        C75492Tk0 c75492Tk0 = (C75492Tk0) aObjectS143S0100000_13.l0;
        C75732Tns c75732Tns = (C75732Tns) obj2;
        c75492Tk0.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChannelChange,  ");
        FT5.LJ(LIZ, ((C75501Tk9) c75732Tns.LIZ).LJLIL, LIZ, "LinkControlPresenter");
        T t = c75492Tk0.mView;
        if (t != 0) {
            if (((C75501Tk9) c75732Tns.LIZ).LJLIL) {
                ((InterfaceC75495Tk3) t).EQ(false);
            } else {
                ((InterfaceC75495Tk3) t).wi();
            }
            c75492Tk0.LJLLJ = false;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AObjectS143S0100000_13 aObjectS143S0100000_13, Object obj, Object obj2) {
        C75492Tk0 c75492Tk0 = (C75492Tk0) aObjectS143S0100000_13.l0;
        c75492Tk0.getClass();
        C75678Tn0 c75678Tn0 = (C75678Tn0) ((C75732Tns) obj2).LIZ;
        if (c75678Tn0.LIZIZ == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onReceiveInvitationNewArc,  ");
            LIZ.append(c75678Tn0.hashCode());
            C0NB.LJIIIZ("LinkControlPresenter", X1D.LIZIZ(LIZ));
            T t = c75492Tk0.mView;
            if (t != 0) {
                ((InterfaceC75495Tk3) t).dW(c75678Tn0);
            }
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onReceiveApplyNewArc,  ");
            LIZ2.append(c75678Tn0.hashCode());
            LIZ2.append("   channelId = ");
            C0RN.LJ(LIZ2, c75492Tk0.LJLILLLLZI.LJFF, LIZ2, "LinkControlPresenter");
            T t2 = c75492Tk0.mView;
            if (t2 != 0) {
                ((InterfaceC75495Tk3) t2).t60(c75678Tn0);
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$9(AObjectS143S0100000_13 aObjectS143S0100000_13, Object obj, Object obj2) {
        C75768ToS c75768ToS;
        String LIZIZ;
        C75492Tk0 c75492Tk0 = (C75492Tk0) aObjectS143S0100000_13.l0;
        C75732Tns c75732Tns = (C75732Tns) obj2;
        c75492Tk0.getClass();
        C75677Tmz c75677Tmz = (C75677Tmz) c75732Tns.LIZ;
        int i = c75677Tmz.LIZJ;
        C75883TqJ LJI = C8E.LIZLLL().LJI(c75677Tmz.LIZLLL);
        if (LJI == null || (c75768ToS = LJI.LJIIZILJ) == null) {
            LIZIZ = "";
        } else {
            LIZIZ = C05170If.LIZIZ(c75768ToS.LIZ, c75768ToS.LIZIZ);
        }
        if (c75492Tk0.mView != 0) {
            if (c75677Tmz.LIZIZ == 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onReceiveReplyNewArc,  ");
                LIZ.append(c75677Tmz.hashCode());
                C0NB.LJIIIZ("LinkControlPresenter", X1D.LIZIZ(LIZ));
                ((InterfaceC75495Tk3) c75492Tk0.mView).bj(i, C78857UxB.LJJIIJ(1476788233, "bpea-linkmic_linkcontrolpresenter_onreceivereply_group"), LIZIZ, c75677Tmz.LJI);
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onReceivePermitApplyNewArc,  ");
                LIZ2.append(c75732Tns.hashCode());
                LIZ2.append("   channelId = ");
                C0RN.LJ(LIZ2, c75492Tk0.LJLILLLLZI.LJFF, LIZ2, "LinkControlPresenter");
                ((InterfaceC75495Tk3) c75492Tk0.mView).qx(i);
            }
        }
        return C76800UCe.LIZ;
    }
}
