package X;

import Y.AObserverS81S0100000_13;
import Y.AfS1S0211000_13;
import Y.AfS61S0100000_9;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.relation.dialog.SocialRecFriendsConditionViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS16S1400000_13;
import kotlin.jvm.internal.AqS17S1101000_13;
import kotlin.jvm.internal.AqS73S0201000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UPK implements LKA {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final Fragment LIZ;
    public final SocialRecFriendsConditionViewModel LIZIZ;
    public final HomePageDataViewModel LIZJ;
    public final InterfaceC65784Pro<String> LIZLLL;
    public final C73318Sq2 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public boolean LJII;
    public final C62822Ol8 LJIIIIZZ;

    public static void LJIIIZ() {
        PopupManager.LIZJ(A7V.class);
    }

    public final C54258LRe LJ() {
        return (C54258LRe) this.LJI.getValue();
    }

    public final String LJFF() {
        return (String) this.LJIIIIZZ.getValue();
    }

    public final void LJIIIIZZ() {
        ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
        if (mo49getActivity != null) {
            this.LIZIZ.LJLILLLLZI.observe(mo49getActivity, new AObserverS81S0100000_13(this, 75));
            this.LIZIZ.LJLIL.observe(mo49getActivity, new AObserverS81S0100000_13(this, 76));
        }
    }

    public final void LJIILJJIL() {
        int i;
        if (this.LIZ.mo49getActivity() == null) {
            return;
        }
        HG3.LJIIL();
        int i2 = 1;
        if (o.LJ(HG3.LJLJL.LJIIIZ().getLatestLoginMethodName(), "facebook")) {
            i = 2;
        } else {
            i = 1;
        }
        InterfaceC58710N2k LIZ = UPT.LIZ(i);
        ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
        o.LJII(mo49getActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        if (!LIZ.LIZIZ(mo49getActivity)) {
            return;
        }
        OSZ<Boolean, Boolean> LIZJ = LIZ.LIZJ();
        if (LIZ.LIZ() == 2) {
            i2 = 2;
        }
        if (!G1P.LIZIZ()) {
            LJI(i2, LIZJ);
        } else {
            G1P.LIZ = new AqS73S0201000_13(this, (UPK) i2, (int) LIZJ, (OSZ<Boolean, Boolean>) 3);
        }
    }

    @Override // X.LKA
    public final void onDestroyView() {
        this.LJ.LIZLLL();
    }

    public static EnumC77147UPn LIZIZ(int i) {
        if (i != 1) {
            if (i == 2) {
                return EnumC77147UPn.FACEBOOK;
            }
            throw new Exception("wrong social platform");
        }
        return EnumC77147UPn.CONTACT;
    }

    public static int LJIIL(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                "wrong social platform".toString();
                throw new IllegalStateException("wrong social platform");
            }
        }
        return i2;
    }

    public final void LIZJ(int i) {
        UPT.LJ(LJIIL(i), UQ7.CONSENT.getValue());
        C77266UUc.LIZIZ.LIZLLL().LIZLLL();
        C54258LRe LJ = LJ();
        if (LJ != null) {
            LJ.LJII(false);
        }
        UQ2.LIZ().LIZ.storeLong("last_click_cancel_time", System.currentTimeMillis());
    }

    public final void LIZLLL(int i) {
        C77266UUc.LIZIZ.LIZLLL().LIZLLL();
        C54258LRe LJ = LJ();
        if (LJ != null) {
            LJ.LJII(false);
        }
        UPT.LJ(LJIIL(i), UQ7.CONSENT.getValue());
    }

    @Override // X.LKA
    public final void LIZ(int i, OSZ<Boolean, Boolean> consentPair) {
        o.LJIIIZ(consentPair, "consentPair");
        LJI(i, consentPair);
    }

    public final void LJI(int i, OSZ<Boolean, Boolean> osz) {
        ActivityC45651qj mo49getActivity;
        boolean booleanValue = osz.getFirst().booleanValue();
        boolean booleanValue2 = osz.getSecond().booleanValue();
        if (booleanValue) {
            if (URL.LIZ() && UPT.LIZIZ() && (mo49getActivity = this.LIZ.mo49getActivity()) != null && (!mo49getActivity.isFinishing())) {
                C54258LRe LJ = LJ();
                if (LJ != null) {
                    LJ.LJII(true);
                }
                PopupManager.LJIIL(new A7V(mo49getActivity, new AqS73S0201000_13(this, mo49getActivity, i, 2)));
                return;
            }
            return;
        }
        C55719Ltr.LIZ.getClass();
        if (C55719Ltr.LIZ().addContactPopWhenFBLogin && i == 2) {
            if (!UPL.LIZ(EnumC77147UPn.CONTACT)) {
                OHI ohi = OHI.LIZ;
                ActivityC45651qj requireActivity = this.LIZ.requireActivity();
                o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
                ohi.getClass();
                if (!OHI.LJI(requireActivity, "android.permission.READ_CONTACTS")) {
                    boolean isNewUser = ((RBX) HG3.LJIILL()).isNewUser();
                    C54258LRe LJ2 = LJ();
                    if (LJ2 != null) {
                        LJ2.LJII(true);
                    }
                    ActivityC45651qj requireActivity2 = this.LIZ.requireActivity();
                    o.LJIIIIZZ(requireActivity2, "fragment.requireActivity()");
                    PopupManager.LJIIL(new A7V(requireActivity2, new LNG(this, isNewUser, i, booleanValue2)));
                    return;
                }
            }
        } else if (i == 1) {
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), C78613UtF.LIZJ, null, new LTO(this, null), 2);
        }
        LJIILL(C47261Igj.LJJIJ(Integer.valueOf(i)), booleanValue2);
    }

    public final void LJIILL(List<Integer> list, boolean z) {
        C78999UzT.LJFF(UPT.LJI(list, z).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(this, 91), new AfS61S0100000_9(this, 92)), this.LJ);
    }

    public final void LJII(int i, boolean z, ARN arn) {
        UPT.LJI(C47261Igj.LJJIJ(Integer.valueOf(i)), !z).LJJJLIIL(new AfS1S0211000_13(i, arn, this, z, 5), new AfS1S0211000_13(i, arn, this, z, 6));
    }

    public final void LJIIJJI(int i, ActivityC45651qj activityC45651qj, String str) {
        String LIZ;
        Aweme aweme;
        String authorUid;
        C26227ARb LIZ2 = C3AW.LIZ(activityC45651qj);
        if (i == 2) {
            LIZ = C1DD.LIZLLL(R.string.a9l, "AppContextManager.getApp…s_request_FB_description)");
        } else {
            LIZ = UP3.LIZ();
        }
        HomePageDataViewModel homePageDataViewModel = this.LIZJ;
        String str2 = null;
        if (homePageDataViewModel != null) {
            aweme = homePageDataViewModel.LJLJLLL;
        } else {
            aweme = null;
        }
        FeedCommonService LJJIJLIJ = CommonFeedServiceImpl.LJJIJLIJ();
        if (aweme != null) {
            str2 = aweme.getAid();
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (aweme != null && (authorUid = aweme.getAuthorUid()) != null) {
            str3 = authorUid;
        }
        LJJIJLIJ.LJIILJJIL(str, str2, str3, "3");
        LIZ2.LIZIZ(LIZ);
        UC0.LIZJ(LIZ2, new AqS17S1101000_13(i, str, this, 6));
        LIZ2.LJII = false;
        LIZ2.LJI().LIZLLL();
    }

    public UPK(Fragment fragment, SocialRecFriendsConditionViewModel socialRecFriendsVM, HomePageDataViewModel homePageDataViewModel, AqS159S0100000_9 aqS159S0100000_9) {
        o.LJIIIZ(socialRecFriendsVM, "socialRecFriendsVM");
        this.LIZ = fragment;
        this.LIZIZ = socialRecFriendsVM;
        this.LIZJ = homePageDataViewModel;
        this.LIZLLL = aqS159S0100000_9;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJ = c73318Sq2;
        this.LJFF = C221108m2.LIZIZ(new AqS163S0100000_13(this, 743));
        this.LJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1046));
        this.LJIIIIZZ = C221108m2.LIZIZ(OUB.LJLIL);
        c73318Sq2.LIZ(new C73662Sva());
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            LJIIIIZZ();
        } else {
            XKX.LJ(C36636EZk.LIZ, new LTM(this, null));
        }
    }

    public final void LJIIJ(ActivityC45651qj activityC45651qj, String str, String str2, List<Integer> list) {
        EnumC58046MqI enumC58046MqI;
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().intValue() == 1) {
                enumC58046MqI = EnumC58046MqI.CONTACT;
            } else {
                enumC58046MqI = EnumC58046MqI.FACEBOOK;
            }
            arrayList.add(enumC58046MqI);
        }
        InterfaceC25781A9x LJI = C57738MlK.LIZIZ.LJI();
        Bundle LIZJ = AnonymousClass036.LIZJ("enter_from", str, "enter_method", str2);
        LIZJ.putSerializable("auth_platform_key", arrayList);
        LIZJ.putSerializable("maf_scene_key", EnumC57876MnY.LOGIN_POPUP);
        LIZJ.putBoolean("use_storage_key", true);
        LIZJ.putBoolean("is_after_auth", true);
        LJI.LJIILL(LIZJ, activityC45651qj);
        LJI.LJIILLIIL();
        LJI.LJIILIIL(new AqS16S1400000_13(this, (UPK) LJI, (InterfaceC25781A9x) list, (List<Integer>) activityC45651qj, (ActivityC45651qj) str, (String) 2));
    }

    public final void LJIILIIL(int i, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3) {
        if (this.LIZ.getContext() != null) {
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new UPN(this, i, str, interfaceC65784Pro, interfaceC65784Pro2, interfaceC65784Pro3, null), 3);
            return;
        }
        C54258LRe LJ = LJ();
        if (LJ != null) {
            LJ.LJII(false);
        }
        LJIIIZ();
    }
}
