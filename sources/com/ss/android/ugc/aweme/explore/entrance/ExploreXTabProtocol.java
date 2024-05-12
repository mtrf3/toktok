package com.ss.android.ugc.aweme.explore.entrance;

import X.ActivityC45651qj;
import X.C206928Ae;
import X.C45804HyK;
import X.C78929UyL;
import X.C84193Sd;
import X.EnumC53763L8d;
import X.LFH;
import X.LLQ;
import X.LTT;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.aweme.explore.ui.ExploreXTabFeedFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ExploreXTabProtocol extends TopTabProtocol {
    public Context LJLJJI;
    public final String LJLJJL = "homepage_explore";
    public final int LJLJJLL = 35;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LIZIZ() {
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LJJJJZI() {
        return ExploreXTabFeedFragment.class;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        if (C206928Ae.LIZ == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC53763L8d LIZLLL() {
        return EnumC53763L8d.X_TAB;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJI() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJIIIIZZ(String str) {
        ActivityC45651qj LJJIFFI;
        Object LIZJ;
        Fragment fragment;
        IMFToolBarAbility LJJIIJZLJL;
        Context context = this.LJLJJI;
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            LTT.LIZJ(LJJIFFI);
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).changeStatusBarMainTab(C45804HyK.LJIJJ(LJJIFFI), "HOME");
            LLQ Xm0 = ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).getHomeTabViewModel(LJJIFFI).Xm0();
            if (Xm0 != null) {
                Xm0.LJI(true);
                Xm0.LIZLLL(true);
            }
            if (!o.LJ(str, "Shop") && (LIZJ = MSAdaptionService.LJIIL().LIZJ(LJJIFFI)) != null && (LIZJ instanceof Fragment) && (fragment = (Fragment) LIZJ) != null && (LJJIIJZLJL = C78929UyL.LJJIIJZLJL(fragment)) != null) {
                LJJIIJZLJL.La(true);
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void init(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJJI = context;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String w0(Context context) {
        o.LJIIIZ(context, "context");
        String string = context.getString(R.string.g7v);
        o.LJIIIIZZ(string, "context.getString(R.stri…ploretab_tabname_explore)");
        return string;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJII(String str, String str2) {
        ActivityC45651qj LJJIFFI;
        Fragment fragment;
        IMFToolBarAbility LJJIIJZLJL;
        Context context = this.LJLJJI;
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            LTT.LJ(LJJIFFI);
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).changeStatusBarMainTab(LJJIFFI, "homepage_explore");
            LLQ Xm0 = ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).getHomeTabViewModel(LJJIFFI).Xm0();
            if (Xm0 != null) {
                Xm0.LJI(false);
                if (LFH.LIZIZ.LIZLLL().LIZ().LJIL()) {
                    Xm0.LIZLLL(false);
                }
            }
            Object LIZJ = MSAdaptionService.LJIIL().LIZJ(LJJIFFI);
            if (LIZJ != null && (LIZJ instanceof Fragment) && (fragment = (Fragment) LIZJ) != null && (LJJIIJZLJL = C78929UyL.LJJIIJZLJL(fragment)) != null) {
                LJJIIJZLJL.e0();
                LJJIIJZLJL.Dk0(true);
            }
            View findViewById = LJJIFFI.findViewById(android.R.id.statusBarBackground);
            if (findViewById != null) {
                findViewById.setVisibility(4);
            }
            C84193Sd.LIZ(LJJIFFI).tv0(false);
        }
    }
}
