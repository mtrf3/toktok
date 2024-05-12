package com.bytedance.tiktok.homepage.mainpagefragment.assem;

import X.ActivityC45651qj;
import X.ActivityC86117Xqz;
import X.C0H1;
import X.C141335gf;
import X.C16880lQ;
import X.C188787b0;
import X.C212428Vi;
import X.C221108m2;
import X.C2U8;
import X.C36922EeM;
import X.C3C5;
import X.C45804HyK;
import X.C46272IEa;
import X.C53196KuG;
import X.C53320KwG;
import X.C53976LGi;
import X.C54029LIj;
import X.C54050LJe;
import X.C55096Ljo;
import X.C55723Ltv;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78929UyL;
import X.L1F;
import X.L1Y;
import X.L26;
import X.L7K;
import X.LHM;
import X.LIJ;
import X.QD3;
import X.X1D;
import Y.AObserverS77S0100000_9;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.story.experiment.PreloadConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes10.dex */
public final class MainPageStoryAssem extends BaseMainPageFragmentUIAssem {
    public View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public boolean LJLJL;

    public MainPageStoryAssem() {
        new LinkedHashMap();
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 55));
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 58));
        this.LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 54));
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 57));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 56));
    }

    public final TabChangeManager I3() {
        return (TabChangeManager) this.LJLJI.getValue();
    }

    public final void K3() {
        MutableLiveData<Boolean> mutableLiveData;
        C188787b0 c188787b0 = Hox.LJLLI;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        o.LJI(LIZ);
        if (c188787b0.LIZ(LIZ).vv0("HOME")) {
            Bundle bundle = new Bundle();
            bundle.putString("fromStart", "MainPage");
            ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
            o.LJI(LIZ2);
            c188787b0.LIZ(LIZ2).jv0(bundle, "HOME");
            MainAnimViewModel mainAnimViewModel = (MainAnimViewModel) this.LJLJJI.getValue();
            if (mainAnimViewModel == null || (mutableLiveData = mainAnimViewModel.LJLJJI) == null) {
                return;
            }
            mutableLiveData.setValue(Boolean.TRUE);
        }
    }

    public final void v3() {
        Object LIZ;
        BaseScrollSwitchStateManager baseScrollSwitchStateManager;
        MainFragment mainFragment;
        C54029LIj.LIZIZ.LJIL();
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null) {
            Bundle bundle = new Bundle();
            bundle.putString("fromStart", "MainPage");
            Hox.LJLLI.LIZ(LIZ2).Cv0(bundle, "HOME");
        }
        MainPageBusinessAbility mainPageBusinessAbility = (MainPageBusinessAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), MainPageBusinessAbility.class, null);
        if (mainPageBusinessAbility != null) {
            mainPageBusinessAbility.qQ(false);
        }
        try {
            Fragment mv0 = I3().mv0();
            if ((mv0 instanceof MainFragment) && (mainFragment = (MainFragment) mv0) != null) {
                IMFPubAbility LJIJ = C78929UyL.LJIJ(mainFragment);
                if (LJIJ != null) {
                    LJIJ.vv(31);
                }
                HomeViewPagerAbility LJIIZILJ = C78929UyL.LJIIZILJ(mainFragment);
                if (LJIIZILJ != null) {
                    LJIIZILJ.Oe0(31);
                }
                FeedFragment w2 = mainFragment.w2();
                if (w2 != null && (w2 instanceof LIJ)) {
                    C2U8.LIZ(new C54050LJe());
                    K3();
                }
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("changeTabAfterPublishFriendsTabOnTop error ");
            LIZ3.append(m10exceptionOrNullimpl);
            C36922EeM.LJ(X1D.LIZIZ(LIZ3));
        }
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && LIZLLL.isAdded() && (baseScrollSwitchStateManager = (BaseScrollSwitchStateManager) this.LJLJJL.getValue()) != null) {
            baseScrollSwitchStateManager.tv0(true);
        }
    }

    public final void A3() {
        String str;
        boolean z;
        IFriendsTabLayoutAbility LIZJ;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            IBottomTabLayoutAbility LJIIIIZZ = C53976LGi.LJIIIIZZ(LIZ);
            if (LJIIIIZZ != null) {
                LJIIIIZZ.iJ(true);
            }
            Bundle bundle = new Bundle();
            bundle.putString("fromStart", "MainPage");
            bundle.putString("enter_method", "publish_landing");
            Hox.LJLLI.LIZ(LIZ).Cv0(bundle, "FRIENDS_TAB");
            IFriendsTabLayoutAbility LIZJ2 = C53976LGi.LIZJ(LIZ);
            if (LIZJ2 != null) {
                str = LIZJ2.TO();
            } else {
                str = null;
            }
            IBottomTabLayoutAbility LJIIIIZZ2 = C53976LGi.LJIIIIZZ(LIZ);
            if (LJIIIIZZ2 != null) {
                z = LJIIIIZZ2.wY();
            } else {
                z = false;
            }
            if (!o.LJ(str, "FRIENDS_FEED") && z && (LIZJ = C53976LGi.LIZJ(LIZ)) != null) {
                LIZJ.Mg();
            }
        }
        Context context = getContext();
        if (context != null) {
            LHM.LIZIZ.LIZ().social2TabPublishLanding(context);
        }
    }

    public final void C3() {
        NoticeAbility noticeAbility = (NoticeAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), NoticeAbility.class, null);
        if (noticeAbility != null) {
            noticeAbility.lC();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        if ((r0 instanceof com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment) == false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E3() {
        /*
            r6 = this;
            X.1qj r3 = X.C212428Vi.LIZ(r6)
            if (r3 == 0) goto L29
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r1 = "fromStart"
            java.lang.String r0 = "MainPage"
            r2.putString(r1, r0)
            java.lang.String r0 = "enter_from"
            java.lang.String r1 = "publish"
            r2.putString(r0, r1)
            java.lang.String r0 = "enter_method"
            r2.putString(r0, r1)
            X.7b0 r0 = com.bytedance.hox.Hox.LJLLI
            com.bytedance.hox.Hox r1 = r0.LIZ(r3)
            java.lang.String r0 = "HOME"
            r1.Cv0(r2, r0)
        L29:
            com.ss.android.ugc.aweme.IAccountService r0 = com.ss.android.ugc.aweme.AccountService.LJIJ()
            X.RBY r0 = r0.LJFF()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            int r1 = r0.getFollowerCount()
            boolean r0 = X.C45042Hm2.LIZIZ()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L5b
            boolean r0 = X.C45038Hly.LIZ(r1)
            if (r0 == 0) goto L5b
            r5 = 1
        L48:
            X.Lm3 r1 = X.C55096Ljo.LJIIZILJ(r6)
            java.lang.Class<com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility> r0 = com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility.class
            r4 = 0
            X.2K0 r0 = X.C55096Ljo.LIZ(r1, r0, r4)
            com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility r0 = (com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility) r0
            if (r0 == 0) goto L5d
            r0.qQ(r3)
            goto L5d
        L5b:
            r5 = 0
            goto L48
        L5d:
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = r6.I3()     // Catch: java.lang.ClassCastException -> Lb0
            androidx.fragment.app.Fragment r3 = r0.mv0()     // Catch: java.lang.ClassCastException -> Lb0
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.main.MainFragment     // Catch: java.lang.ClassCastException -> Lb0
            if (r0 == 0) goto Lb4
            com.ss.android.ugc.aweme.main.MainFragment r3 = (com.ss.android.ugc.aweme.main.MainFragment) r3     // Catch: java.lang.ClassCastException -> Lb0
            if (r3 == 0) goto Lb4
            com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility r1 = X.C78929UyL.LJIJ(r3)     // Catch: java.lang.ClassCastException -> Lb0
            if (r1 == 0) goto L7b
            if (r5 == 0) goto L77
            r0 = 0
            goto L78
        L77:
            r0 = 1
        L78:
            r1.vv(r0)     // Catch: java.lang.ClassCastException -> Lb0
        L7b:
            r3.wl(r5)     // Catch: java.lang.ClassCastException -> Lb0
            com.ss.android.ugc.aweme.feed.ui.FeedFragment r0 = r3.w2()     // Catch: java.lang.ClassCastException -> Lb0
            if (r0 != 0) goto L9b
        L84:
            com.ss.android.ugc.aweme.feed.ui.FeedFragment r0 = r3.w2()     // Catch: java.lang.ClassCastException -> Lb0
            if (r0 != 0) goto La0
        L8a:
            java.lang.String r0 = r3.LLIIJI()     // Catch: java.lang.ClassCastException -> Lb0
            X.LNx r1 = new X.LNx     // Catch: java.lang.ClassCastException -> Lb0
            r1.<init>(r5, r0, r6)     // Catch: java.lang.ClassCastException -> Lb0
            java.util.concurrent.ExecutorService r0 = X.FMX.LIZIZ()     // Catch: java.lang.ClassCastException -> Lb0
            X.C10K.LIZIZ(r1, r0, r4)     // Catch: java.lang.ClassCastException -> Lb0
            goto Lb4
        L9b:
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment     // Catch: java.lang.ClassCastException -> Lb0
            if (r0 != 0) goto La4
            goto L84
        La0:
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment     // Catch: java.lang.ClassCastException -> Lb0
            if (r0 == 0) goto L8a
        La4:
            X.LJe r0 = new X.LJe     // Catch: java.lang.ClassCastException -> Lb0
            r0.<init>()     // Catch: java.lang.ClassCastException -> Lb0
            X.C2U8.LIZ(r0)     // Catch: java.lang.ClassCastException -> Lb0
            r6.K3()     // Catch: java.lang.ClassCastException -> Lb0
            goto L8a
        Lb0:
            r0 = move-exception
            X.C36922EeM.LIZ(r0)
        Lb4:
            X.Ol8 r0 = r6.LJLJJL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager r0 = (com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager) r0
            if (r0 == 0) goto Lc1
            r0.tv0(r2)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageStoryAssem.E3():void");
    }

    public final void F3() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C188787b0 c188787b0 = Hox.LJLLI;
            String ov0 = c188787b0.LIZ(LIZ).ov0("RootNode");
            String ov02 = c188787b0.LIZ(LIZ).ov0(ov0);
            if (!o.LJ(ov0, "USER")) {
                c188787b0.LIZ(LIZ).Cv0(C0H1.LIZ("fromStart", ov02), "USER");
            }
        }
    }

    public final void L3() {
        if (L1Y.LIZ() || C53196KuG.LIZ() || L7K.LIZ || ((Boolean) L1F.LIZLLL.getValue()).booleanValue()) {
            C55723Ltv.LIZIZ.LJIILJJIL().LIZ();
            this.LJLJL = true;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        if (!((PreloadConfig) L26.LIZIZ.getValue()).coldStartOpt) {
            L3();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    public final void x3() {
        Fragment mv0 = I3().mv0();
        if ((mv0 instanceof MainFragment) && mv0 != null) {
            IMFPubAbility LJIJ = C78929UyL.LJIJ(mv0);
            if (LJIJ != null) {
                LJIJ.vv(1);
            }
            HomeViewPagerAbility LJIIZILJ = C78929UyL.LJIIZILJ(mv0);
            if (LJIIZILJ != null) {
                LJIIZILJ.Oe0(1);
            }
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            Bundle bundle = new Bundle();
            bundle.putString("fromStart", "MainPage");
            bundle.putString("enter_from", "publish");
            bundle.putString("enter_method", "publish");
            Hox.LJLLI.LIZ(LIZ).Cv0(bundle, "Following");
        }
    }

    public final void H3(Intent intent) {
        Context context = getContext();
        if (context != null && intent != null) {
            int intExtra = intent.getIntExtra("intent_story_widget_action", -1);
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
            String str = "";
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = "";
            }
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "enter_method");
            if (LLJJIJIIJIL2 != null) {
                str = LLJJIJIIJIL2;
            }
            if (intExtra == 2) {
                M3("HOME");
                C55723Ltv.LIZIZ.LIZLLL(context, new EnterStoryParam(null, str, LLJJIJIIJIL, true, false, false, false, LLJJIJIIJIL, null, null, false, null, 3840, null));
            }
        }
    }

    public final void M3(String str) {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C188787b0 c188787b0 = Hox.LJLLI;
            if (!o.LJ(c188787b0.LIZ(LIZ).ov0("RootNode"), str)) {
                int hashCode = str.hashCode();
                if (hashCode != -1525083535) {
                    if (hashCode != -1309089240) {
                        if (hashCode != 2223327 || !str.equals("HOME")) {
                            return;
                        }
                    } else if (!str.equals("FRIENDS_FEED")) {
                        return;
                    }
                } else if (!str.equals("Following")) {
                    return;
                }
                c188787b0.LIZ(LIZ).Cv0(new Bundle(), str);
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem, X.InterfaceC54059LJn
    public final void onNewIntent(Intent intent) {
        ActivityC45651qj LJJIFFI;
        FeedFragment feedFragment;
        try {
            boolean booleanExtra = intent.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", false);
            boolean booleanExtra2 = intent.getBooleanExtra("extra.from.shoutouts.opt.out", false);
            if (!booleanExtra && !booleanExtra2) {
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
                if (LLJJIJIIJIL == null) {
                    LLJJIJIIJIL = "";
                }
                if (LLJJIJIIJIL.length() == 0) {
                    H3(intent);
                }
                if (o.LJ("FRIENDS_FEED", LLJJIJIIJIL)) {
                    Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
                    if (LLJJIJI == null) {
                        LLJJIJI = new Bundle();
                    }
                    C54029LIj c54029LIj = C54029LIj.LIZIZ;
                    if (c54029LIj.LJJI()) {
                        C188787b0 c188787b0 = Hox.LJLLI;
                        Context context = getContext();
                        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
                            Fragment Ja = c188787b0.LIZ(LJJIFFI).Ja("FRIENDS_FEED");
                            if ((Ja instanceof FeedFragment) && (feedFragment = (FeedFragment) Ja) != null) {
                                feedFragment.ub(false);
                                return;
                            }
                            return;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (c54029LIj.LJJIJL()) {
                        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
                        if (LIZ != null) {
                            Hox.LJLLI.LIZ(LIZ).Cv0(LLJJIJI, "FRIENDS_TAB");
                            return;
                        }
                        return;
                    }
                    ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
                    if (LIZ2 != null) {
                        Hox.LJLLI.LIZ(LIZ2).Cv0(LLJJIJI, "FRIENDS_TAB");
                    }
                }
            }
        } catch (Exception e) {
            C36922EeM.LJ(e.getMessage());
        }
    }

    @QD3
    public final void onRenderFirstFrame(C46272IEa event) {
        o.LJIIIZ(event, "event");
        if (!((PreloadConfig) L26.LIZIZ.getValue()).coldStartOpt || this.LJLJL) {
            return;
        }
        L3();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        EventBus.LIZJ().LJIILJJIL(this);
        View findViewById = view.findViewById(R.id.gc8);
        if (C53320KwG.LIZIZ()) {
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null && (findViewById = LIZ.findViewById(R.id.gbw)) != null) {
                findViewById.setVisibility(0);
            } else {
                findViewById = null;
            }
        }
        this.LJLIL = findViewById;
        DataCenter dataCenter = (DataCenter) this.LJLILLLLZI.getValue();
        if (dataCenter != null) {
            dataCenter.iv0("changeTabAfterPublish", new AObserverS77S0100000_9(this, 124), true);
        }
        if (C212428Vi.LIZ(this) instanceof MainActivity) {
            ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
            o.LJII(LIZ2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity");
            H3(((ActivityC86117Xqz) LIZ2).getIntent());
        }
    }
}
