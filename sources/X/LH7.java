package X;

import Y.ACallableS86S0200000_9;
import Y.AObserverS77S0100000_9;
import Y.AgS126S0100000_9;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.followingtab.assem.FollowingBottomTabProtocolAssem;
import com.ss.android.ugc.aweme.followingtab.assem.FollowingMainPageFragmentAssem;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes10.dex */
public final class LH7 implements ISocial2TabDelegateService {
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final boolean friendsTabStylePrivacyHint() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final Fragment getFriendsTabFragment() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final BottomTabProtocol getFriendsTabProtocol() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final String getSocial2TabTabName() {
        return "Following";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void registerRedDotBytesync() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void showFriendsIntroSheet() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void social2TabPublishLanding(Context context) {
        o.LJIIIZ(context, "context");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void tryToShowForcePermissionDialog() {
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
    public final C8W0 initFriendsTabMainPageFragmentAssem() {
        return new FollowingMainPageFragmentAssem();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final ArrayList<SingleTabCounter> multiCounterSnapshot() {
        return new ArrayList<>();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final boolean checkSearchRestriction() {
        if (a.LJIIIZ().LIZJ()) {
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
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final List<Integer> getSocial2TabFeedTypeList() {
        if (shouldShowFriendsTab()) {
            return C47261Igj.LJJIJ(Integer.valueOf(LHC.FRIEND_FOLLOWING_MERGE_FEED.getType()));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final boolean shouldInitSocial2Tab() {
        return C53295Kvr.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final boolean shouldShowFriendsTab() {
        return C53295Kvr.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final LGH generateToolbarIconView(Context context) {
        o.LJIIIZ(context, "context");
        return new C53967LFz(context, null);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void onMultiTabLanding(String tag) {
        o.LJIIIZ(tag, "tag");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void preloadFriendsTabViews(Context context) {
        o.LJIIIZ(context, "context");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final C8W0 initSocial2TabAssem(ActivityC45651qj activity, ExecutorService executorService) {
        o.LJIIIZ(activity, "activity");
        FollowingBottomTabProtocolAssem followingBottomTabProtocolAssem = new FollowingBottomTabProtocolAssem();
        C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(activity, null), followingBottomTabProtocolAssem, ISocial2TabProtocolAbility.class, null);
        followingBottomTabProtocolAssem.LJLJJI = new FutureTask<>(new ACallableS86S0200000_9(followingBottomTabProtocolAssem, activity, 6));
        C36922EeM.LIZLLL(2, followingBottomTabProtocolAssem.LJLIL, "commitPreloadTask");
        if (executorService != null) {
            executorService.execute(followingBottomTabProtocolAssem.LJLJJI);
        }
        return followingBottomTabProtocolAssem;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void initialize(ActivityC45651qj activity, boolean z) {
        HomeTabAbility homeTabAbility;
        o.LJIIIZ(activity, "activity");
        StateOwner.LJLIL.LIZIZ(activity);
        C36207EIx.LIZ().pX(z);
        C54138LMo c54138LMo = C54138LMo.LJLIL;
        if (C53295Kvr.LIZIZ()) {
            C116694i1.LIZ(activity).hv0(c54138LMo);
        }
        if (C53295Kvr.LIZJ() && (homeTabAbility = (HomeTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activity, null), HomeTabAbility.class, null)) != null) {
            homeTabAbility.na(new LHA(activity));
        }
        if (this.LIZ && ((RBX) HG3.LJIILL()).isLogin()) {
            C10K.LJII(3000L).LJ(new AgS126S0100000_9(this, 13), C10K.LJI, null);
        }
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            StateOwner.LJLJJI.observe(activity, new AObserverS77S0100000_9(this, 84));
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService
    public final void runColdStartTaskV2(boolean z, EnumC36206EIw source) {
        o.LJIIIZ(source, "source");
        this.LIZ = true;
        if (!LHM.LIZIZ.LIZ().shouldShowFriendsTab()) {
            return;
        }
        C36203EIt.LIZ(source, null);
        C2NH.LIZ.post(LH8.LJLIL);
        C10K.LJII(LivePlayEnforceIntervalSetting.DEFAULT).LIZLLL(LH9.LIZ);
    }
}
