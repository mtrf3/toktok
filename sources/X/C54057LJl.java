package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.LJl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54057LJl<T> implements Observer {
    public final /* synthetic */ MainPageFragment LJLIL;

    public C54057LJl(MainPageFragment mainPageFragment) {
        this.LJLIL = mainPageFragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        MainPageBusinessAbility mainPageBusinessAbility;
        String ro;
        MainBusinessAbility mainBusinessAbility;
        ActivityC45651qj LJJIFFI;
        LLQ Xm0;
        C207668Da kvData = (C207668Da) obj;
        o.LJIIIZ(kvData, "kvData");
        MainPageFragment mainPageFragment = this.LJLIL;
        Object obj2 = kvData.LIZIZ;
        ActivityC45651qj activityC45651qj = null;
        if (obj2 == null) {
            obj2 = null;
        }
        o.LJIIIIZZ(obj2, "kvData.getData()");
        Intent intent = (Intent) obj2;
        mainPageFragment.getClass();
        try {
            if (intent.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", false)) {
                Bundle bundle = new Bundle();
                bundle.putString("fromStart", "MainPage");
                C188787b0 c188787b0 = com.bytedance.hox.Hox.LJLLI;
                ActivityC45651qj mo49getActivity = mainPageFragment.mo49getActivity();
                o.LJI(mo49getActivity);
                c188787b0.LIZ(mo49getActivity).Cv0(bundle, "HOME");
                mainPageFragment.qQ(false);
                TabChangeManager tabChangeManager = mainPageFragment.LJLJL;
                o.LJI(tabChangeManager);
                Fragment mv0 = tabChangeManager.mv0();
                o.LJII(mv0, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainFragment");
                ((MainFragment) mv0).wl(1);
                ScrollSwitchStateManager scrollSwitchStateManager = mainPageFragment.LJLJLJ;
                o.LJI(scrollSwitchStateManager);
                scrollSwitchStateManager.tv0(true);
            } else if (intent.getBooleanExtra("extra.from.shoutouts.opt.out", false)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("fromStart", "MainPage");
                bundle2.putBoolean("extra.from.shoutouts.opt.out", true);
                C188787b0 c188787b02 = com.bytedance.hox.Hox.LJLLI;
                ActivityC45651qj requireActivity = mainPageFragment.requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                c188787b02.LIZ(requireActivity).Cv0(bundle2, "USER");
            } else {
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
                String str = "";
                if (LLJJIJIIJIL == null) {
                    LLJJIJIIJIL = "";
                }
                if (!TextUtils.isEmpty(LLJJIJIIJIL)) {
                    if (o.LJ("USER", LLJJIJIIJIL)) {
                        if (C53765L8f.LJIIJJI()) {
                            ActivityC45651qj mo49getActivity2 = mainPageFragment.mo49getActivity();
                            if (mo49getActivity2 != null) {
                                com.bytedance.hox.Hox.LJLLI.LIZ(mo49getActivity2).Cv0(new Bundle(), "USER");
                                return;
                            }
                            return;
                        }
                        IHomePageService xl = mainPageFragment.xl();
                        Context context = mainPageFragment.getContext();
                        if (context != null) {
                            activityC45651qj = C45804HyK.LJJIFFI(context);
                        }
                        o.LJI(activityC45651qj);
                        LLQ Xm02 = xl.getHomeTabViewModel(activityC45651qj).Xm0();
                        if (Xm02 != null) {
                            Xm02.LJIJJ("USER");
                        }
                        Context context2 = mainPageFragment.getContext();
                        if (context2 != null && (LJJIFFI = C45804HyK.LJJIFFI(context2)) != null && (Xm0 = mainPageFragment.xl().getHomeTabViewModel(LJJIFFI).Xm0()) != null) {
                            Xm0.LJIJJ("USER");
                            return;
                        }
                        return;
                    }
                    InterfaceC55235Lm3 Dl = mainPageFragment.Dl();
                    if (Dl != null && (mainBusinessAbility = (MainBusinessAbility) C55096Ljo.LIZ(Dl, MainBusinessAbility.class, null)) != null) {
                        mainBusinessAbility.Tn(intent, EnumC54052LJg.ON_NEW_INTENT, LLJJIJIIJIL);
                    }
                    if (o.LJ("HOME", LLJJIJIIJIL)) {
                        int intExtra = intent.getIntExtra("tab", 1);
                        TabChangeManager tabChangeManager2 = mainPageFragment.LJLJL;
                        o.LJI(tabChangeManager2);
                        Fragment mv02 = tabChangeManager2.mv0();
                        o.LJII(mv02, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainFragment");
                        ((MainFragment) mv02).wl(intExtra);
                        View view = mainPageFragment.LJLJJI;
                        o.LJI(view);
                        if (view.getVisibility() == 8) {
                            View view2 = mainPageFragment.LJLJJI;
                            o.LJI(view2);
                            view2.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    if (o.LJ("NOTIFICATION", LLJJIJIIJIL)) {
                        if (!((RBX) HG3.LJIILL()).isLogin()) {
                            InterfaceC55235Lm3 Dl2 = mainPageFragment.Dl();
                            if (Dl2 != null && (mainPageBusinessAbility = (MainPageBusinessAbility) C55096Ljo.LIZ(Dl2, MainPageBusinessAbility.class, null)) != null && (ro = mainPageBusinessAbility.ro()) != null) {
                                str = ro;
                            }
                            J9P.LIZJ(mainPageFragment, str, "click_message", null, null);
                            return;
                        }
                        C2U8.LIZ(new C54058LJm());
                    }
                }
            }
        } catch (Exception e) {
            C36922EeM.LJ(e.getMessage());
        }
        AssemSupervisor LIZIZ = C212428Vi.LIZIZ(mainPageFragment);
        if (LIZIZ != null && (copyOnWriteArrayList = LIZIZ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof InterfaceC54059LJn) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC54059LJn) it2.next()).onNewIntent(intent);
            }
        }
    }
}
