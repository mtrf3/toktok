package X;

import Y.ACListenerS24S0100000_4;
import Y.ACallableS86S0200000_9;
import Y.AObserverS57S0000000_9;
import Y.AObserverS73S0200000_9;
import Y.AObserverS77S0100000_9;
import Y.AgS126S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.assem.FriendsMainPageFragmentAssem;
import com.ss.android.ugc.aweme.friendstab.assem.FriendsTabProtocolAssem;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPerfOptPhase2;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.impl.LauncherTaskApiImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tab.FriendsTabProtocol;
import com.ss.android.ugc.aweme.ui.FriendsTabContainerFragment;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes10.dex */
public final class LHH implements ISocial2TabDelegateService {
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final String getSocial2TabTabName() {
        return "FRIENDS_FEED";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final List<User> getEducateAvatarUserList() {
        ArrayList<UserNewContent> arrayList = C36203EIt.LJI;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator<UserNewContent> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().getUser());
            }
            return arrayList2;
        }
        return C61878OQg.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final List<String> getEducateItemIdList() {
        ArrayList<UserNewContent> arrayList = C36203EIt.LJI;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator<UserNewContent> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().getItemId());
            }
            return arrayList2;
        }
        return C61878OQg.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final Fragment getFriendsTabFragment() {
        return new FriendsTabContainerFragment();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final BottomTabProtocol getFriendsTabProtocol() {
        return new FriendsTabProtocol();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final C8W0 initFriendsTabMainPageFragmentAssem() {
        return new FriendsMainPageFragmentAssem();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void registerRedDotBytesync() {
        if (!((Boolean) C52331KgJ.LIZ.getValue()).booleanValue()) {
            return;
        }
        if (!FriendsTabTopExperiment.LIZIZ() && !DR0.LIZ()) {
            return;
        }
        C3GQ.LIZ().getClass();
        LHU.LIZIZ.LIZ(C3GR.SOCIAL_2_TAB_RED_DOT_ONLINE, new LHP());
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final boolean shouldInitSocial2Tab() {
        if (LHM.LIZIZ.LIZ().shouldShowFriendsTab() && !C54029LIj.LIZIZ.LJJIJL()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void tryToShowForcePermissionDialog() {
        ActivityC45651qj LIZLLL;
        if (!LHJ.LIZ.getBoolean("has_shown_permission_dialog", false) && (LIZLLL = StateOwner.LJLIL.LIZLLL()) != null) {
            C54137LMn.LJ(LIZLLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final boolean checkSearchRestriction() {
        if (!a.LJIIIZ().LIZJ()) {
            return false;
        }
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL != null) {
            C26045AKb c26045AKb = new C26045AKb(LIZLLL);
            c26045AKb.LJIIIIZZ(R.string.g9g);
            c26045AKb.LJIIJ();
            return true;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final boolean friendsTabStylePrivacyHint() {
        return shouldShowFriendsTab();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final List<Integer> getSocial2TabFeedTypeList() {
        if (shouldShowFriendsTab()) {
            return C47261Igj.LJJIJ(Integer.valueOf(LHC.FRIENDS_FEED.getType()));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final ArrayList<SingleTabCounter> multiCounterSnapshot() {
        return C36207EIx.LIZ().wE();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final boolean shouldShowFriendsTab() {
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL == null || MSAdaptionService.LJIIL().LIZLLL(EF7.LIZIZ())) {
            return false;
        }
        if (FriendsTabTopExperiment.LIZIZ()) {
            return ((RBX) LJIILL).isLogin();
        }
        if (!DR0.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void showFriendsIntroSheet() {
        ActivityC45651qj activityC45651qj;
        FragmentManager supportFragmentManager;
        OSZ osz;
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        Integer num = null;
        if (!(validTopActivity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) validTopActivity) == null || (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) == null) {
            return;
        }
        C2312795v c2312795v = new C2312795v(activityC45651qj);
        c2312795v.setOnCloseListener(new AqS159S0100000_9(c2312795v, 798));
        boolean LJJLIIIJLJLI = C54029LIj.LIZIZ.LJJLIIIJLJLI();
        ((TextView) c2312795v.LIZ(R.id.m93)).setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView) c2312795v.LIZ(R.id.m93)).setHighlightColor(C04330Ez.LIZIZ(c2312795v.getContext(), R.color.cz));
        if (LJJLIIIJLJLI) {
            osz = new OSZ(Integer.valueOf(R.string.gmu), Integer.valueOf(R.string.gmv));
        } else {
            osz = new OSZ(Integer.valueOf(R.string.gor), Integer.valueOf(R.string.go0));
        }
        int intValue = ((Number) osz.getFirst()).intValue();
        int intValue2 = ((Number) osz.getSecond()).intValue();
        if (!LJJLIIIJLJLI) {
            num = Integer.valueOf(R.string.ghg);
        }
        TextView textView = (TextView) c2312795v.LIZ(R.id.m93);
        LKE lke = LKE.LIZIZ;
        Context context = c2312795v.getContext();
        o.LJIIIIZZ(context, "context");
        textView.setText(lke.LIZJ(context, Integer.valueOf(intValue), Integer.valueOf(intValue2), num, 42, "homepage_friends", "homepage_friends", 0, new AqS154S0100000_4(c2312795v, 1187)));
        TuxIconView tuxIconView = (TuxIconView) c2312795v.LIZ(R.id.f0h);
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(c2312795v, 275));
        }
        ASL LIZ = C249109q6.LIZ(1);
        int height = c2312795v.getHeight();
        TuxSheet tuxSheet = LIZ.LIZ;
        tuxSheet.LJLLLLLL = height;
        tuxSheet.LJLLI = c2312795v;
        tuxSheet.show(supportFragmentManager, "FriendsTabIntroView");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final LGH generateToolbarIconView(Context context) {
        o.LJIIIZ(context, "context");
        return new C53967LFz(context, null);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void onMultiTabLanding(String tag) {
        o.LJIIIZ(tag, "tag");
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if ((LIZLLL instanceof Context) && LIZLLL != null) {
            LHN.LIZ(LIZLLL, tag);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void preloadFriendsTabViews(Context context) {
        o.LJIIIZ(context, "context");
        if (LHM.LIZIZ.LIZ().shouldShowFriendsTab()) {
            C16970lZ.LJ(R.layout.cmv, context);
            int i = 0;
            do {
                C16970lZ.LJ(R.layout.cmy, context);
                i++;
            } while (i < 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void social2TabPublishLanding(Context context) {
        o.LJIIIZ(context, "context");
        LHN.LIZ(context, "FRIENDS_FEED");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final C8W0 initSocial2TabAssem(ActivityC45651qj activity, ExecutorService executorService) {
        o.LJIIIZ(activity, "activity");
        FriendsTabProtocolAssem friendsTabProtocolAssem = new FriendsTabProtocolAssem();
        if (executorService != null) {
            friendsTabProtocolAssem.LJLJJL = activity;
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(activity, null), friendsTabProtocolAssem, ISocial2TabProtocolAbility.class, null);
            friendsTabProtocolAssem.LJLJI = new FutureTask<>(new ACallableS86S0200000_9(friendsTabProtocolAssem, activity, 7));
            C36922EeM.LIZLLL(2, "landing_2860", "commitPreloadTask");
            executorService.execute(friendsTabProtocolAssem.LJLJI);
        }
        return friendsTabProtocolAssem;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void initialize(ActivityC45651qj activity, boolean z) {
        int i;
        o.LJIIIZ(activity, "activity");
        StateOwner stateOwner = StateOwner.LJLIL;
        stateOwner.LIZIZ(activity);
        C54137LMn c54137LMn = C54137LMn.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initialize ");
        ActivityC45651qj LIZLLL = stateOwner.LIZLLL();
        if (LIZLLL != null) {
            i = LIZLLL.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        ActivityC45651qj LIZLLL2 = stateOwner.LIZLLL();
        if (LIZLLL2 != null) {
            C116694i1.LIZ(LIZLLL2).hv0(c54137LMn);
            StateOwner.LJLLI.observe(LIZLLL2, new AObserverS77S0100000_9(LIZLLL2, 63));
            StateOwner.LJLLJ.observe(LIZLLL2, new AObserverS57S0000000_9(0));
            StateOwner.LJLLILLLL.observe(LIZLLL2, new AObserverS57S0000000_9(1));
        }
        C36207EIx.LIZ().pX(z);
        C54029LIj.LIZIZ.LJJIL();
        if (this.LIZ && ((RBX) HG3.LJIILL()).isLogin()) {
            C10K.LJII(3000L).LJ(new AgS126S0100000_9(this, 11), C10K.LJI, null);
        }
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            StateOwner.LJLJJI.observe(activity, new AObserverS77S0100000_9(this, 62));
        }
        if (C35971E9v.LIZ()) {
            a.LJFF().LJFF().observe(activity, new AObserverS73S0200000_9(this, activity, 5));
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void runColdStartTaskV2(boolean z, EnumC36206EIw source) {
        ActivityC45651qj LIZLLL;
        String scene;
        o.LJIIIZ(source, "source");
        boolean z2 = true;
        this.LIZ = true;
        LHM lhm = LHM.LIZIZ;
        if (!lhm.LIZ().shouldShowFriendsTab()) {
            return;
        }
        LauncherTaskApiImpl.LJIIIIZZ().LIZJ();
        boolean LIZ = DQS.LIZ();
        if (!z && source != EnumC36206EIw.LOGIN_SUCCESS && source != EnumC36206EIw.SWITCH_ACCOUNT) {
            z2 = false;
        }
        C54029LIj c54029LIj = C54029LIj.LIZIZ;
        if (!c54029LIj.LJJI() && (!LIZ || !z2)) {
            if (FriendsTabPerfOptPhase2.LIZ().fetchFeedOpt) {
                c54029LIj.LJJIJIIJIL(z);
            } else {
                if (z) {
                    scene = LI7.COLD_START.getScene();
                } else {
                    scene = LI7.HOMEPAGE_RECREATE.getScene();
                }
                c54029LIj.LJJIIZI(scene, "");
            }
        }
        if (c54029LIj.LJFF()) {
            return;
        }
        C36203EIt.LIZ(source, null);
        if (FriendsTabPerfOptPhase2.LIZ().viewInflateOpt) {
            c54029LIj.LJIILJJIL();
        }
        SystemClock.elapsedRealtime();
        if (FriendsTabPerfOptPhase2.LIZ().viewInflateOpt && (LIZLLL = StateOwner.LJLIL.LIZLLL()) != null) {
            lhm.LIZ().preloadFriendsTabViews(LIZLLL);
            c54029LIj.LJIILLIIL(LIZLLL);
        }
        ActivityC45651qj LIZLLL2 = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL2 != null) {
            c54029LIj.LJIJ(LIZLLL2);
        }
        C2NH.LIZ.post(LHF.LJLIL);
        C10K.LJII(LivePlayEnforceIntervalSetting.DEFAULT).LIZLLL(LHG.LIZ);
    }
}
