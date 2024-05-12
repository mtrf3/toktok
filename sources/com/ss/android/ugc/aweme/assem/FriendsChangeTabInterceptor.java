package com.ss.android.ugc.aweme.assem;

import X.ActivityC45651qj;
import X.C116694i1;
import X.C141335gf;
import X.C16880lQ;
import X.C188787b0;
import X.C2U8;
import X.C36922EeM;
import X.C3C5;
import X.C54029LIj;
import X.C54050LJe;
import X.C55096Ljo;
import X.C55230Lly;
import X.C76800UCe;
import X.C78929UyL;
import X.C84193Sd;
import X.EnumC54052LJg;
import X.InterfaceC36571c5;
import X.InterfaceC54054LJi;
import X.LIJ;
import X.LWM;
import X.X1D;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility;
import com.ss.android.ugc.aweme.base.ChangeTabProtocol;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendsChangeTabInterceptor implements ChangeTabProtocol {
    public static void LIZ(ActivityC45651qj activityC45651qj) {
        Bundle bundle;
        C188787b0 c188787b0 = Hox.LJLLI;
        if (c188787b0.LIZ(activityC45651qj).vv0("HOME")) {
            Intent intent = activityC45651qj.getIntent();
            if (intent == null || (bundle = C16880lQ.LLJJIJI(intent)) == null) {
                bundle = new Bundle();
            }
            bundle.putString("fromStart", "MainPage");
            c188787b0.LIZ(activityC45651qj).jv0(bundle, "HOME");
            ((MainAnimViewModel) ViewModelProviders.of(activityC45651qj).get(MainAnimViewModel.class)).LJLJJI.setValue(Boolean.TRUE);
        }
    }

    public static void LIZJ(ActivityC45651qj activityC45651qj, Intent intent) {
        FeedFragment feedFragment;
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI == null) {
            LLJJIJI = new Bundle();
        }
        C188787b0 c188787b0 = Hox.LJLLI;
        Fragment Ja = c188787b0.LIZ(activityC45651qj).Ja("Following");
        if ((Ja instanceof FeedFragment) && (feedFragment = (FeedFragment) Ja) != null && LWM.LIZIZ.LIZJ()) {
            feedFragment.ub(false);
        }
        c188787b0.LIZ(activityC45651qj).Cv0(LLJJIJI, "Following");
    }

    public static void LIZLLL(ActivityC45651qj activityC45651qj, Intent intent) {
        FeedFragment feedFragment;
        Object LIZ;
        InterfaceC54054LJi interfaceC54054LJi;
        HomeViewPagerAbility LJIIZILJ;
        IMFPubAbility LJIJ;
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI == null) {
            LLJJIJI = new Bundle();
        }
        C188787b0 c188787b0 = Hox.LJLLI;
        Fragment Ja = c188787b0.LIZ(activityC45651qj).Ja("FRIENDS_FEED");
        if (Ja instanceof FeedFragment) {
            feedFragment = (FeedFragment) Ja;
        } else {
            feedFragment = null;
        }
        if (feedFragment != null && C54029LIj.LIZIZ.LIZJ()) {
            feedFragment.ub(false);
        }
        if (C54029LIj.LIZIZ.LJJIJL()) {
            MainPageBusinessAbility mainPageBusinessAbility = (MainPageBusinessAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activityC45651qj, null), MainPageBusinessAbility.class, null);
            if (mainPageBusinessAbility != null) {
                mainPageBusinessAbility.qQ(false);
            }
            try {
                InterfaceC36571c5 mv0 = C116694i1.LIZ(activityC45651qj).mv0();
                if ((mv0 instanceof InterfaceC54054LJi) && (interfaceC54054LJi = (InterfaceC54054LJi) mv0) != null) {
                    Fragment mv02 = C116694i1.LIZ(activityC45651qj).mv0();
                    if (mv02 != null && (LJIJ = C78929UyL.LJIJ(mv02)) != null) {
                        LJIJ.vv(31);
                    }
                    Fragment mv03 = C116694i1.LIZ(activityC45651qj).mv0();
                    if (mv03 != null && (LJIIZILJ = C78929UyL.LJIIZILJ(mv03)) != null) {
                        LJIIZILJ.Oe0(31);
                    }
                    if (interfaceC54054LJi.w2() instanceof LIJ) {
                        C2U8.LIZ(new C54050LJe());
                        LIZ(activityC45651qj);
                    }
                }
                Fragment mv04 = C116694i1.LIZ(activityC45651qj).mv0();
                if (mv04 != null && mv04.isAdded()) {
                    C84193Sd.LIZ(activityC45651qj).tv0(true);
                }
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("error ");
                LIZ2.append(m10exceptionOrNullimpl);
                C36922EeM.LJ(X1D.LIZIZ(LIZ2));
            }
            LLJJIJI.putString("fromStart", "MainPage");
            if (o.LJ(LLJJIJI.getString("refer"), "inner_push")) {
                LLJJIJI.putString("enter_method", "inner_push_landing");
            } else {
                LLJJIJI.putString("enter_method", "push_landing");
            }
            Hox.LJLLI.LIZ(activityC45651qj).Cv0(LLJJIJI, "FRIENDS_FEED");
            return;
        }
        if (o.LJ(LLJJIJI.getString("refer"), "inner_push")) {
            LLJJIJI.putString("enter_method", "inner_push_landing");
        } else {
            LLJJIJI.putString("enter_method", "push_landing");
        }
        c188787b0.LIZ(activityC45651qj).Cv0(LLJJIJI, "FRIENDS_TAB");
        c188787b0.LIZ(activityC45651qj).Cv0(LLJJIJI, "FRIENDS_FEED");
    }

    @Override // com.ss.android.ugc.aweme.base.ChangeTabProtocol
    public final boolean m0(ActivityC45651qj activityC45651qj, Intent intent, String str, EnumC54052LJg scene) {
        o.LJIIIZ(scene, "scene");
        if (scene == EnumC54052LJg.COLD_BOOT) {
            Intent intent2 = activityC45651qj.getIntent();
            if (o.LJ(str, "FRIENDS_FEED")) {
                o.LJIIIIZZ(intent2, "intent");
                LIZLLL(activityC45651qj, intent2);
                return true;
            }
            if (o.LJ(str, "Following")) {
                o.LJIIIIZZ(intent2, "intent");
                LIZJ(activityC45651qj, intent2);
                return true;
            }
            return false;
        }
        if (scene != EnumC54052LJg.ON_NEW_INTENT) {
            return false;
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI == null) {
            LLJJIJI = new Bundle();
        }
        LLJJIJI.putString("fromStart", "MainPage");
        if (o.LJ(LLJJIJIIJIL, "FRIENDS_FEED")) {
            LIZLLL(activityC45651qj, intent);
            return true;
        }
        if (o.LJ(LLJJIJIIJIL, "Following")) {
            LIZJ(activityC45651qj, intent);
        }
        return false;
    }
}
