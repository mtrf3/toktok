package Y;

import X.ARV;
import X.ASQ;
import X.AST;
import X.ActivityC45651qj;
import X.C101573yj;
import X.C101683yu;
import X.C107404Jk;
import X.C111764a4;
import X.C111774a5;
import X.C12460eI;
import X.C188727au;
import X.C26045AKb;
import X.C34B;
import X.C58262Qk;
import X.C61712OJw;
import X.C61713OJx;
import X.C76800UCe;
import X.C87393br;
import X.C87423bu;
import X.C91023hi;
import X.C92313jn;
import X.C92533k9;
import X.FMX;
import X.InterfaceC106434Fr;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC92513k7;
import android.content.DialogInterface;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.comment.supporterpanel.VGSupportPanelFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.bottomsheet.GifChoosePanelBottomSheet;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.groupchat.recommend.fragment.RecommendGroupCreationPanelFragment;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcIntroFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDDListenerS141S0100000_1 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                return;
            case 1:
                onDismiss$1(this, dialogInterface);
                return;
            case 2:
                onDismiss$2(this, dialogInterface);
                return;
            case 3:
                onDismiss$3(this, dialogInterface);
                return;
            case 4:
                onDismiss$4(this, dialogInterface);
                return;
            case 5:
                onDismiss$5(this, dialogInterface);
                return;
            case 6:
                onDismiss$6(this, dialogInterface);
                return;
            case 7:
                onDismiss$7(this, dialogInterface);
                return;
            case 8:
                onDismiss$8(this, dialogInterface);
                return;
            case 9:
                onDismiss$9(this, dialogInterface);
                return;
            case 10:
                onDismiss$10(this, dialogInterface);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onDismiss$11(this, dialogInterface);
                return;
            case 12:
                onDismiss$12(this, dialogInterface);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onDismiss$13(this, dialogInterface);
                return;
            case 14:
                onDismiss$14(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDDListenerS141S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(IDDListenerS141S0100000_1 iDDListenerS141S0100000_1, DialogInterface dialogInterface) {
        C107404Jk c107404Jk = (C107404Jk) iDDListenerS141S0100000_1.l0;
        if (c107404Jk.LJIIL && c107404Jk.LJIIJJI && !c107404Jk.LJIIJ) {
            ARV arv = c107404Jk.LIZLLL;
            if (arv != null) {
                C26045AKb c26045AKb = new C26045AKb(arv);
                c26045AKb.LJIIIIZZ(R.string.elz);
                c26045AKb.LJIIJ();
            } else {
                o.LJIJI("switch");
                throw null;
            }
        }
        C107404Jk c107404Jk2 = (C107404Jk) iDDListenerS141S0100000_1.l0;
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = c107404Jk2.LJIIIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(c107404Jk2.LJIIJJI));
        }
        C107404Jk.LIZIZ(((C107404Jk) iDDListenerS141S0100000_1.l0).LJIIJJI);
    }

    public static final void onDismiss$1(IDDListenerS141S0100000_1 iDDListenerS141S0100000_1, DialogInterface dialogInterface) {
        ProfileAigcIntroFragment profileAigcIntroFragment = (ProfileAigcIntroFragment) iDDListenerS141S0100000_1.l0;
        profileAigcIntroFragment.LJLJL = false;
        profileAigcIntroFragment.LJLJLJ = null;
    }

    public static final void onDismiss$10(IDDListenerS141S0100000_1 iDDListenerS141S0100000_1, DialogInterface dialogInterface) {
        ((C111764a4) iDDListenerS141S0100000_1.l0).LJLL = false;
    }

    public static final void onDismiss$11(IDDListenerS141S0100000_1 iDDListenerS141S0100000_1, DialogInterface dialogInterface) {
        C12460eI.LJIIIZ((C58262Qk) iDDListenerS141S0100000_1.l0);
    }

    public static final void onDismiss$12(IDDListenerS141S0100000_1 iDDListenerS141S0100000_1, DialogInterface it) {
        C34B.LIZIZ("follow_status", "PrivacyPanel dismiss");
        o.LJIIIIZZ(it, "it");
        AST LJIIIIZZ = ASQ.LJIIIIZZ(it);
        if (LJIIIIZZ instanceof C92533k9) {
            InterfaceC92513k7 interfaceC92513k7 = (InterfaceC92513k7) iDDListenerS141S0100000_1.l0;
            if (interfaceC92513k7 != null) {
                interfaceC92513k7.LIZ(((C92533k9) LJIIIIZZ).LIZ);
                return;
            }
            return;
        }
        InterfaceC92513k7 interfaceC92513k72 = (InterfaceC92513k7) iDDListenerS141S0100000_1.l0;
        if (interfaceC92513k72 == null) {
            return;
        }
        interfaceC92513k72.onCancel();
    }

    public static final void onDismiss$13(IDDListenerS141S0100000_1 iDDListenerS141S0100000_1, DialogInterface dialogInterface) {
        C61713OJx LIZIZ = C61712OJw.LIZIZ((GroupInviteFragment) iDDListenerS141S0100000_1.l0);
        LIZIZ.LIZIZ.LJIIL();
        LIZIZ.LIZJ();
    }

    public static final void onDismiss$14(IDDListenerS141S0100000_1 iDDListenerS141S0100000_1, DialogInterface dialogInterface) {
        int i;
        if (dialogInterface == null) {
            return;
        }
        AST LJIIIIZZ = ASQ.LJIIIIZZ(dialogInterface);
        if (LJIIIIZZ instanceof C92313jn) {
            i = ((C92313jn) LJIIIIZZ).LIZ;
        } else {
            i = 0;
        }
        C101573yj.LJFF(C101573yj.LIZ, 2, i, null, 12);
        ((C101683yu) iDDListenerS141S0100000_1.l0).LIZ();
    }

    public static final void onDismiss$2(IDDListenerS141S0100000_1 iDDListenerS141S0100000_1, DialogInterface dialogInterface) {
        String str;
        String str2;
        Aweme aweme = (Aweme) iDDListenerS141S0100000_1.l0;
        if (VGSupportPanelFragment.LJLLJ) {
            str = "click_close_button";
        } else {
            str = "click_on_video";
        }
        C188727au c188727au = new C188727au();
        String str3 = null;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("group_id", str2);
        if (aweme != null) {
            str3 = aweme.getAuthorUid();
        }
        c188727au.LJIIIZ("author_id", str3);
        c188727au.LJIIIZ("exit_method", str);
        FMX.LJIIL("exit_top_gift_list", c188727au.LIZ);
        VGSupportPanelFragment.LJLLJ = false;
    }

    public static final void onDismiss$3(IDDListenerS141S0100000_1 iDDListenerS141S0100000_1, DialogInterface it) {
        GifChoosePanelBottomSheet gifChoosePanelBottomSheet = (GifChoosePanelBottomSheet) iDDListenerS141S0100000_1.l0;
        o.LJIIIIZZ(it, "it");
        gifChoosePanelBottomSheet.getClass();
        GiphyViewModel vl = gifChoosePanelBottomSheet.vl();
        Long l = vl.LJLLILLLL;
        if (l != null) {
            long longValue = l.longValue();
            InterfaceC106434Fr interfaceC106434Fr = vl.LJLJI;
            interfaceC106434Fr.LIZIZ(interfaceC106434Fr.now() - longValue);
        }
    }

    public static final void onDismiss$4(IDDListenerS141S0100000_1 iDDListenerS141S0100000_1, DialogInterface it) {
        String str;
        Long LJFF = C87393br.LJFF(String.valueOf(((ActivityC45651qj) iDDListenerS141S0100000_1.l0).hashCode()));
        if (LJFF != null) {
            Long valueOf = Long.valueOf(LJFF.longValue());
            o.LJIIIIZZ(it, "it");
            if (o.LJ(ASQ.LJIIIIZZ(it), C91023hi.LIZ)) {
                str = "use_sticker";
            } else {
                str = "others";
            }
            C87393br.LJIJJLI(valueOf, str);
        }
    }

    public static final void onDismiss$5(IDDListenerS141S0100000_1 iDDListenerS141S0100000_1, DialogInterface it) {
        String str;
        Long LJFF = C87393br.LJFF(String.valueOf(((ActivityC45651qj) iDDListenerS141S0100000_1.l0).hashCode()));
        if (LJFF != null) {
            Long valueOf = Long.valueOf(LJFF.longValue());
            o.LJIIIIZZ(it, "it");
            if (o.LJ(ASQ.LJIIIIZZ(it), C91023hi.LIZ)) {
                str = "use_sticker";
            } else {
                str = "others";
            }
            C87393br.LJIJJLI(valueOf, str);
        }
    }

    public static final void onDismiss$6(IDDListenerS141S0100000_1 iDDListenerS141S0100000_1, DialogInterface dialogInterface) {
        ((AssemViewModel) ((RecommendGroupCreationPanelFragment) iDDListenerS141S0100000_1.l0).LJLIL.getValue()).withState(C87423bu.LJLIL);
    }

    public static final void onDismiss$7(IDDListenerS141S0100000_1 iDDListenerS141S0100000_1, DialogInterface dialogInterface) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDDListenerS141S0100000_1.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onDismiss$8(IDDListenerS141S0100000_1 iDDListenerS141S0100000_1, DialogInterface dialogInterface) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDDListenerS141S0100000_1.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onDismiss$9(IDDListenerS141S0100000_1 iDDListenerS141S0100000_1, DialogInterface dialogInterface) {
        ((C111774a5) iDDListenerS141S0100000_1.l0).LJLLLL = false;
    }
}
