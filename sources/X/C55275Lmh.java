package X;

import Y.IDCListenerS284S0100000_9;
import Y.IDDListenerS23S0300000_9;
import android.content.Context;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.PerfMonitorServiceImpl;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.Lmh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55275Lmh {
    public final LO1 LIZ;
    public final HomePageDataViewModel LIZIZ;
    public final DataCenter LIZJ;
    public final Fragment LIZLLL;
    public final int LJ;
    public final int LJFF;

    @QD3
    public final void onDislikeAwemeEvent(C55274Lmg event) {
        User user;
        String enterFrom;
        String str;
        String str2;
        int i;
        Boolean bool;
        String aid;
        List<PhotoModeImageUrlModel> imageList;
        InterfaceC55058LjC interfaceC55058LjC;
        o.LJIIIZ(event, "event");
        PerfMonitorServiceImpl.LIZ().LJFF("share_panel");
        if (event.LJLILLLLZI == 1 && event.LJLIL) {
            this.LIZ.LLJJIJIIJIL();
            Aweme aweme = this.LIZIZ.LJLJLLL;
            Integer num = null;
            if (aweme != null) {
                user = aweme.getAuthor();
            } else {
                user = null;
            }
            if (MSAdaptionService.LJIIL().LIZIZ(C84763XOl.LJIIIIZZ())) {
                InterfaceC36571c5 mo49getActivity = this.LIZLLL.mo49getActivity();
                if (!(mo49getActivity instanceof InterfaceC55058LjC) || (interfaceC55058LjC = (InterfaceC55058LjC) mo49getActivity) == null || (enterFrom = interfaceC55058LjC.getEnterFrom()) == null) {
                    enterFrom = "homepage_hot";
                }
            } else {
                enterFrom = this.LIZ.getEnterFrom();
            }
            float f = 100;
            int i2 = (int) ((event.LJLJI * f) / this.LJ);
            int i3 = (int) ((event.LJLJJI * f) / this.LJFF);
            C220488l2 c220488l2 = C220488l2.LIZIZ;
            C188727au c188727au = new C188727au();
            Aweme aweme2 = this.LIZIZ.LJLJLLL;
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("group_id", str);
            if (user == null || (str2 = user.getUid()) == null) {
                str2 = "";
            }
            c188727au.LJIIIZ("author_id", str2);
            if (user != null) {
                i = user.getFollowStatus();
            } else {
                i = -1;
            }
            c188727au.LIZLLL(i, "follow_status");
            c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(this.LIZIZ.LJLJLLL)));
            c188727au.LJIIIZ("enter_from", enterFrom);
            c188727au.LIZLLL(i2, "x");
            c188727au.LIZLLL(i3, "y");
            Aweme aweme3 = this.LIZIZ.LJLJLLL;
            if (aweme3 != null) {
                bool = Boolean.valueOf(aweme3.isSubOnlyVideo());
            } else {
                bool = null;
            }
            c188727au.LJFF(bool, "is_sub_only_video");
            V0N.LJI(c188727au, this.LIZIZ.LJLJLLL);
            C222578oP.LIZJ(c188727au, this.LIZIZ.LJLJLLL, null, null, 14);
            if (o.LJ(enterFrom, "homepage_nearby")) {
                HashMap<String, String> hashMap = new HashMap<>();
                LQA.LIZIZ.LJII(enterFrom, hashMap, this.LIZIZ.LJLJLLL, false);
                if (!hashMap.isEmpty()) {
                    c188727au.LJII(hashMap);
                }
            }
            C51556KLg.LIZ.getClass();
            java.util.Map LJIIJJI = C51556KLg.LIZ().LJIIJJI(this.LIZIZ.LJLJLLL, null);
            if (!LJIIJJI.isEmpty()) {
                c188727au.LJIIIIZZ(LJIIJJI);
            }
            Aweme aweme4 = this.LIZIZ.LJLJLLL;
            if (aweme4 != null && aweme4.getAwemeType() == 150) {
                c188727au.LIZLLL(150, "aweme_type");
                Aweme aweme5 = this.LIZIZ.LJLJLLL;
                o.LJI(aweme5);
                PhotoModeImageInfo photoModeImageInfo = aweme5.getPhotoModeImageInfo();
                if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                    num = Integer.valueOf(imageList.size());
                }
                c188727au.LJFF(num, "pic_cnt");
            }
            FMX.LJIIL("click_trans_layer", ((C188727au) c220488l2.LJII(this.LIZIZ.LJLJLLL, c188727au)).LIZ);
            Aweme aweme6 = this.LIZIZ.LJLJLLL;
            if (aweme6 != null && (aid = aweme6.getAid()) != null) {
                C7HV.LIZIZ.LIZLLL().LJIIJJI(aid);
            }
            this.LIZ.LLD(true);
            Aweme aweme7 = this.LIZIZ.LJLJLLL;
            if (aweme7 == null) {
                Fragment fragment = this.LIZLLL;
                Context requireContext = fragment.requireContext();
                o.LJIIIIZZ(requireContext, "fragment.requireContext()");
                o.LJIIIIZZ(enterFrom, "enterFrom");
                ATB LIZ = ATU.LIZ(fragment, requireContext, aweme7, enterFrom);
                if (event.LJLJJLL == 4) {
                    Window window = LIZ.getWindow();
                    if (window != null) {
                        window.clearFlags(2);
                    }
                    LIZ.setOnCancelListener(new IDCListenerS284S0100000_9(event, 0));
                }
                C55277Lmj c55277Lmj = new C55277Lmj(LIZ);
                DataCenter dataCenter = this.LIZJ;
                Fragment fragment2 = this.LIZLLL;
                o.LJIIIZ(dataCenter, "dataCenter");
                o.LJIIIZ(fragment2, "fragment");
                LIZ.getDialog();
                LIZ.setOnDismissListener(new IDDListenerS23S0300000_9(dataCenter, fragment2, c55277Lmj, 0));
                LIZ.getDialog();
                C16880lQ.LIZ(LIZ);
                ActivityC45651qj mo49getActivity2 = this.LIZLLL.mo49getActivity();
                if (mo49getActivity2 != null) {
                    LRD.LIZ(mo49getActivity2).LJIIJ("long_press_panel", true, new C55276Lmi(LIZ));
                    return;
                }
                return;
            }
            C2U8.LIZ(new C56272It(i2, i3));
        }
    }

    public C55275Lmh(LO1 viewControl, HomePageDataViewModel homePageDataViewModel, String eventType, DataCenter dataCenter, Fragment fragment) {
        o.LJIIIZ(viewControl, "viewControl");
        o.LJIIIZ(eventType, "eventType");
        this.LIZ = viewControl;
        this.LIZIZ = homePageDataViewModel;
        this.LIZJ = dataCenter;
        this.LIZLLL = fragment;
        EventBus.LIZJ().LJIILJJIL(this);
        this.LJ = KL2.LJIIJJI(EF7.LIZIZ());
        this.LJFF = KL2.LJIIIZ(EF7.LIZIZ());
    }
}
