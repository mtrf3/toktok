package Y;

import X.ActivityC45651qj;
import X.C00F;
import X.C10K;
import X.C113554cx;
import X.C178596zf;
import X.C188727au;
import X.C1JD;
import X.C253929xs;
import X.C2U8;
import X.C36746EbW;
import X.C54791Let;
import X.C54917Lgv;
import X.C54947LhP;
import X.C55274Lmg;
import X.C56045Lz7;
import X.C76542zS;
import X.C76800UCe;
import X.FMX;
import X.IWF;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OSZ;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.MallHamburgerAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import com.ss.android.ugc.aweme.panel.NearbyFeedFragmentPanel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.viewmodel.BindPhonePopsViewModel;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import java.util.Map;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDDListenerS148S0100000_9 implements DialogInterface.OnDismissListener {
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
            default:
                return;
        }
    }

    public IDDListenerS148S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(IDDListenerS148S0100000_9 iDDListenerS148S0100000_9, DialogInterface dialogInterface) {
        ((C54947LhP) iDDListenerS148S0100000_9.l0).LJLJJI.invoke();
        C54947LhP c54947LhP = (C54947LhP) iDDListenerS148S0100000_9.l0;
        if (c54947LhP.LJLJJLL) {
            C10K.LIZJ(new ACallableS36S1100000_9(c54947LhP, "close", 0));
        }
    }

    public static final void onDismiss$1(IDDListenerS148S0100000_9 iDDListenerS148S0100000_9, DialogInterface dialogInterface) {
        ActivityC45651qj activity = (ActivityC45651qj) iDDListenerS148S0100000_9.l0;
        o.LJIIIZ(activity, "activity");
        BindPhonePopsViewModel bindPhonePopsViewModel = (BindPhonePopsViewModel) ViewModelProviders.of(activity).get(BindPhonePopsViewModel.class);
        bindPhonePopsViewModel.getClass();
        if (C00F.LIZ(31744, 0, "cold_boot_bind_phone_pop_or_sheet", true) == 2) {
            IWF.LJJLIIIIJ().LIZIZ();
        }
        bindPhonePopsViewModel.LJLJJI = false;
        PopupManager.LIZJ(C253929xs.class);
        bindPhonePopsViewModel.LJLJJI = false;
        C1JD.LJJIFFI("homepage_hot", null, "click_page", "mobile");
    }

    public static final void onDismiss$2(IDDListenerS148S0100000_9 iDDListenerS148S0100000_9, DialogInterface dialogInterface) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDDListenerS148S0100000_9.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onDismiss$3(IDDListenerS148S0100000_9 iDDListenerS148S0100000_9, DialogInterface dialogInterface) {
        ((InterfaceC65784Pro) iDDListenerS148S0100000_9.l0).invoke();
    }

    public static final void onDismiss$4(IDDListenerS148S0100000_9 iDDListenerS148S0100000_9, DialogInterface dialogInterface) {
        C36746EbW.LIZ(3, "ToolPanel dismissed");
        MallHamburgerAssem mallHamburgerAssem = (MallHamburgerAssem) iDDListenerS148S0100000_9.l0;
        mallHamburgerAssem.LJLLL = null;
        if (mallHamburgerAssem.LJLLILLLL > 0) {
            long j = mallHamburgerAssem.LJLLJ;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MallHamburgerAssem mallHamburgerAssem2 = (MallHamburgerAssem) iDDListenerS148S0100000_9.l0;
            mallHamburgerAssem.LJLLJ = (elapsedRealtime - mallHamburgerAssem2.LJLLILLLL) + j;
            mallHamburgerAssem2.LJLLILLLL = -1L;
        }
        C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
        OSZ[] oszArr = new OSZ[2];
        FashionMallFragment.LJZ.getClass();
        String str = FashionMallFragment.LJZI;
        if (str == null) {
            str = "";
        }
        oszArr[0] = new OSZ("previous_page", str);
        oszArr[1] = new OSZ("stay_time", String.valueOf(((MallHamburgerAssem) iDDListenerS148S0100000_9.l0).LJLLJ));
        Map LJJL = C113554cx.LJJL(oszArr);
        c56045Lz7.getClass();
        C76542zS.LIZJ("tiktokec_stay_actionsheet", new AqS174S0100000_8(LJJL, (Map<String, String>) 202));
        ((MallHamburgerAssem) iDDListenerS148S0100000_9.l0).LJLLJ = 0L;
    }

    public static final void onDismiss$5(IDDListenerS148S0100000_9 iDDListenerS148S0100000_9, DialogInterface dialogInterface) {
        String str;
        User author;
        MixVideosDialog mixVideosDialog = (MixVideosDialog) iDDListenerS148S0100000_9.l0;
        Aweme aweme = mixVideosDialog.LJLJI;
        String str2 = mixVideosDialog.LJLJJI;
        String str3 = mixVideosDialog.LJLJJLL;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str3);
        c188727au.LJIIIZ("playlist_id", str2);
        String str4 = null;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            str = author.getUid();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("author_id", str);
        if (aweme != null) {
            str4 = aweme.getGroupId();
        }
        c188727au.LJIIIZ("group_id", str4);
        FMX.LJIIL("leave_playlist", c188727au.LIZ);
        ((MixVideosDialog) iDDListenerS148S0100000_9.l0).vl().LJZI = false;
    }

    public static final void onDismiss$6(IDDListenerS148S0100000_9 iDDListenerS148S0100000_9, DialogInterface dialogInterface) {
        NearbyFeedFragmentPanel nearbyFeedFragmentPanel = ((C54917Lgv) iDDListenerS148S0100000_9.l0).LJLJI;
        if (nearbyFeedFragmentPanel != null) {
            nearbyFeedFragmentPanel.tryResumePlay();
        }
    }

    public static final void onDismiss$7(IDDListenerS148S0100000_9 iDDListenerS148S0100000_9, DialogInterface dialogInterface) {
        float f;
        MallRacunPageFragment mallRacunPageFragment = (MallRacunPageFragment) iDDListenerS148S0100000_9.l0;
        ActivityC45651qj mo49getActivity = mallRacunPageFragment.mo49getActivity();
        if (mo49getActivity != null) {
            View view = mallRacunPageFragment.LJLLJ;
            if (view != null) {
                f = view.getAlpha();
            } else {
                f = 0.0f;
            }
            C178596zf.LIZ(f, 1.0f, view);
            C2U8.LIZ(new C55274Lmg(false, -1, 1, mo49getActivity.hashCode()));
        }
        ShareExtServiceImpl.LJJLIIJ().LJIIJ(((MallRacunPageFragment) iDDListenerS148S0100000_9.l0).LLI);
    }

    public static final void onDismiss$8(IDDListenerS148S0100000_9 iDDListenerS148S0100000_9, DialogInterface dialogInterface) {
        InterfaceC88472Yns<DialogInterface, C76800UCe> interfaceC88472Yns = ((C54791Let) iDDListenerS148S0100000_9.l0).LIZJ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(dialogInterface);
        }
        SpecActServiceImpl.LJJJIL().LJIJI(false);
    }
}
