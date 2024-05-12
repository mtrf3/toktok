package com.bytedance.tiktok.homepage.services;

import X.ActivityC45651qj;
import X.C55096Ljo;
import X.C55230Lly;
import X.C58096Mr6;
import X.O5Y;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageSocialAbility;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MainPageFragmentImpl implements IMainPageFragment {
    public WeakReference<MainPageFragment> LIZ;

    public static IMainPageFragment LJI() {
        Object LIZ = C58096Mr6.LIZ(IMainPageFragment.class, false);
        if (LIZ != null) {
            return (IMainPageFragment) LIZ;
        }
        if (C58096Mr6.LJJJ == null) {
            synchronized (IMainPageFragment.class) {
                if (C58096Mr6.LJJJ == null) {
                    C58096Mr6.LJJJ = new MainPageFragmentImpl();
                }
            }
        }
        return C58096Mr6.LJJJ;
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void LIZLLL() {
        MainPageFragment mainPageFragment;
        NoticeAbility noticeAbility;
        WeakReference<MainPageFragment> weakReference = this.LIZ;
        if (weakReference == null || (mainPageFragment = weakReference.get()) == null || mainPageFragment.getFragmentManager() == null || (noticeAbility = (NoticeAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(mainPageFragment, null), NoticeAbility.class, null)) == null) {
            return;
        }
        noticeAbility.ki();
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final String LJJLIIIJJI() {
        MainPageFragment mainPageFragment;
        MainPageBusinessAbility mainPageBusinessAbility;
        String ro;
        WeakReference<MainPageFragment> weakReference = this.LIZ;
        if (weakReference != null) {
            mainPageFragment = weakReference.get();
        } else {
            mainPageFragment = null;
        }
        if (mainPageFragment == null || mainPageFragment.getFragmentManager() == null || (mainPageBusinessAbility = (MainPageBusinessAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(mainPageFragment, null), MainPageBusinessAbility.class, null)) == null || (ro = mainPageBusinessAbility.ro()) == null) {
            return "";
        }
        return ro;
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void m1() {
        MainPageFragment mainPageFragment;
        NoticeAbility noticeAbility;
        WeakReference<MainPageFragment> weakReference = this.LIZ;
        if (weakReference == null || (mainPageFragment = weakReference.get()) == null || mainPageFragment.getFragmentManager() == null || (noticeAbility = (NoticeAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(mainPageFragment, null), NoticeAbility.class, null)) == null) {
            return;
        }
        noticeAbility.m1();
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void s4() {
        MainPageFragment mainPageFragment;
        NoticeAbility noticeAbility;
        WeakReference<MainPageFragment> weakReference = this.LIZ;
        if (weakReference == null || (mainPageFragment = weakReference.get()) == null || mainPageFragment.getFragmentManager() == null || (noticeAbility = (NoticeAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(mainPageFragment, null), NoticeAbility.class, null)) == null) {
            return;
        }
        noticeAbility.s4();
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void H(ScrollSwitchStateManager stateManager) {
        MainPageFragment mainPageFragment;
        NoticeAbility noticeAbility;
        o.LJIIIZ(stateManager, "stateManager");
        WeakReference<MainPageFragment> weakReference = this.LIZ;
        if (weakReference == null || (mainPageFragment = weakReference.get()) == null || mainPageFragment.getFragmentManager() == null || (noticeAbility = (NoticeAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(mainPageFragment, null), NoticeAbility.class, null)) == null) {
            return;
        }
        noticeAbility.H(stateManager);
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void LIZ(Fragment fragment) {
        if (fragment instanceof MainPageFragment) {
            this.LIZ = new WeakReference<>(fragment);
        }
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void LIZIZ(ActivityC45651qj context) {
        MainActivity mainActivity;
        o.LJIIIZ(context, "context");
        if ((context instanceof MainActivity) && (mainActivity = (MainActivity) context) != null) {
            mainActivity.refreshSlideSwitchCanScrollRight();
        }
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void LIZJ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        O5Y.LJJLIIIJ(activity);
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void LJ(LifecycleObserver lifecycleObserver) {
        Lifecycle lifecycle;
        o.LJIIIZ(lifecycleObserver, "lifecycleObserver");
        WeakReference<MainPageFragment> weakReference = this.LIZ;
        MainPageFragment mainPageFragment = null;
        if (weakReference != null) {
            mainPageFragment = weakReference.get();
        }
        if ((mainPageFragment instanceof LifecycleOwner) && mainPageFragment != null && (lifecycle = mainPageFragment.getLifecycle()) != null) {
            lifecycle.addObserver(lifecycleObserver);
        }
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void LJFF(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        O5Y.LJJIZ(activity);
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void t9(boolean z) {
        MainPageFragment mainPageFragment;
        MainPageBusinessAbility mainPageBusinessAbility;
        WeakReference<MainPageFragment> weakReference = this.LIZ;
        if (weakReference == null || (mainPageFragment = weakReference.get()) == null || mainPageFragment.getFragmentManager() == null || (mainPageBusinessAbility = (MainPageBusinessAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(mainPageFragment, null), MainPageBusinessAbility.class, null)) == null) {
            return;
        }
        mainPageBusinessAbility.t9(z);
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void r2(String curTabName, String bottomTabName) {
        MainPageFragment mainPageFragment;
        MainPageSocialAbility mainPageSocialAbility;
        o.LJIIIZ(curTabName, "curTabName");
        o.LJIIIZ(bottomTabName, "bottomTabName");
        WeakReference<MainPageFragment> weakReference = this.LIZ;
        if (weakReference == null || (mainPageFragment = weakReference.get()) == null || mainPageFragment.getFragmentManager() == null || (mainPageSocialAbility = (MainPageSocialAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(mainPageFragment, null), MainPageSocialAbility.class, null)) == null) {
            return;
        }
        mainPageSocialAbility.r2(curTabName, bottomTabName);
    }
}
