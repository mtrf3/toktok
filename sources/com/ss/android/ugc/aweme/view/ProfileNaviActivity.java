package com.ss.android.ugc.aweme.view;

import X.AML;
import X.AbstractC26082ALm;
import X.ActivityC86117Xqz;
import X.C04330Ez;
import X.C08Y;
import X.C157166Eu;
import X.C16880lQ;
import X.C188727au;
import X.C1B3;
import X.C221108m2;
import X.C223338pd;
import X.C26227ARb;
import X.C43045Guv;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C72593SeL;
import X.C72604SeW;
import X.C72608Sea;
import X.C72649SfF;
import X.C72663SfT;
import X.C72673Sfd;
import X.C72692Sfw;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C73969T1h;
import X.C76800UCe;
import X.EQY;
import X.FMX;
import X.InterfaceC151715xP;
import X.InterfaceC61312at;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.L7I;
import X.RTQ;
import X.T16;
import X.TBT;
import X.TBV;
import X.TBW;
import X.TMG;
import X.UC0;
import X.W1T;
import Y.AfS58S0100000_6;
import Y.IDLListenerS198S0100000_12;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.view.hub.ProfileNaviHubFragment;
import com.ss.android.ugc.aweme.view.onboarding.ProfileNaviOnboardingFragment;
import com.ss.android.ugc.aweme.view.profileImageEditor.ProfileNaviProfileImageEditorContainerFragment;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviAutoCreationState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviHubState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSpinnerState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS16S0010000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS29S0210000_7;
import kotlin.jvm.internal.AqS36S0001000_12;
import kotlin.jvm.internal.AqS49S1200000_7;
import kotlin.jvm.internal.AqS99S0101000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviActivity extends ActivityC86117Xqz implements InterfaceC151715xP {
    public static final /* synthetic */ int LJLL = 0;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 929));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 926));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 927));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 925));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 931));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 930));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 924));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 932));

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final ProfileNaviCreatorViewModel LLFII() {
        return (ProfileNaviCreatorViewModel) this.LJLJJI.getValue();
    }

    public final ProfileNaviEditorViewModel LLFZ() {
        return (ProfileNaviEditorViewModel) this.LJLILLLLZI.getValue();
    }

    public final ProfileNaviOnboardingViewModel LLII() {
        return (ProfileNaviOnboardingViewModel) this.LJLIL.getValue();
    }

    public final ProfileNaviSwitcherViewModel LLIIIILZ() {
        return (ProfileNaviSwitcherViewModel) this.LJLJJL.getValue();
    }

    public final void LLIIIJ() {
        LLFZ().init(this);
        ProfileNaviOnboardingViewModel LLII = LLII();
        boolean booleanValue = ((Boolean) this.LJLJLJ.getValue()).booleanValue();
        LLII.getClass();
        LLII.setState(new AqS16S0010000_12(booleanValue, 7));
        LLFII().getClass();
        C43045Guv.LIZLLL(C72649SfF.LJLIL, 0L);
    }

    public final void LLIIJI() {
        if (getSupportFragmentManager().LJJJJIZL() > 1) {
            getSupportFragmentManager().LJJLIIIJJI();
        } else {
            finish();
            L7I.LIZ.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLIILII() {
        LLII().setState(RTQ.LJLIL);
        LLFZ().setStateImmediate(C72692Sfw.LJLIL);
        C72673Sfd.LIZ.clear();
        C72673Sfd.LIZIZ = null;
        C72593SeL c72593SeL = C72593SeL.LIZ;
        synchronized (c72593SeL) {
            c72593SeL.LIZ();
            C72593SeL.LJ = null;
        }
        ProfileNaviCreatorState profileNaviCreatorState = (ProfileNaviCreatorState) LLFII().lv0();
        profileNaviCreatorState.setProfileImageBackgroundColor(null);
        profileNaviCreatorState.setContinueEditing(false);
        profileNaviCreatorState.setShouldShowSetProfileView(false);
        ProfileNaviSwitcherState profileNaviSwitcherState = (ProfileNaviSwitcherState) LLIIIILZ().lv0();
        profileNaviSwitcherState.setNaviList(null);
        profileNaviSwitcherState.setHasMore(true);
        ProfileNaviHubState profileNaviHubState = (ProfileNaviHubState) ((JediViewModel) this.LJLJI.getValue()).lv0();
        profileNaviHubState.setContinueEditing(false);
        profileNaviHubState.setDoneNaviExperience(false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        LLIILII();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        LLIIJI();
    }

    public final void LLILIL(boolean z) {
        if (z) {
            _$_findCachedViewById(R.id.i91).setVisibility(0);
            ((C223338pd) _$_findCachedViewById(R.id.i90)).LIZIZ();
        } else {
            ((C223338pd) _$_findCachedViewById(R.id.i90)).LIZJ();
            _$_findCachedViewById(R.id.i91).setVisibility(4);
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onCreate", true);
        super.onCreate(bundle);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        if (LLJJIJIIJIL != null) {
            C72604SeW.LIZ = LLJJIJIIJIL;
        }
        setContentView(R.layout.c6s);
        LLIIIJ();
        if (bundle == null) {
            _$_findCachedViewById(R.id.i86).setVisibility(4);
            ViewTreeObserver viewTreeObserver = _$_findCachedViewById(R.id.i86).getViewTreeObserver();
            o.LJIIIIZZ(viewTreeObserver, "profile_navi_fragment_container.viewTreeObserver");
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(new IDLListenerS198S0100000_12(this, 6));
            }
        } else {
            _$_findCachedViewById(R.id.i86).setVisibility(0);
        }
        int intExtra = getIntent().getIntExtra("entry_point", 1);
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "edit_navi_id_key");
        if (LLJJIJIIJIL2 == null || LLJJIJIIJIL2.length() == 0) {
            String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "edit_navi_starter_id_key");
            if (LLJJIJIIJIL3 == null || LLJJIJIIJIL3.length() == 0) {
                LLIIIZ(intExtra, null);
            } else {
                ProfileNaviOnboardingViewModel LLII = LLII();
                int parseInt = CastIntegerProtector.parseInt(LLJJIJIIJIL3);
                LLII.getClass();
                LLII.setState(new AqS36S0001000_12(parseInt, 9));
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("EDIT_TEMPLATE_FROM_CREATION", true);
                LLIIIZ(intExtra, bundle2);
            }
        } else {
            EQY.LIZ(LLJJIJIIJIL2).LJJIIJ(T16.LIZ).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS58S0100000_6(new AqS99S0101000_12(this, intExtra, 28), 58), new InterfaceC64592gB() { // from class: X.9Fq
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        }
        C73156SnQ.LJIIIIZZ(this, LLII(), new TBV() { // from class: X.Set
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((ProfileNaviOnboardingState) obj).getStarterAvatarSelected();
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviOnboardingState) obj).setStarterAvatarSelected((ProfileNaviDataModel) obj2);
            }
        }, new AqS194S0100000_12(this, 279));
        C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLJL.getValue(), new TBV() { // from class: X.SeP
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviAutoCreationState) obj).getAutoCreationComplete());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviAutoCreationState) obj).setAutoCreationComplete(((Boolean) obj2).booleanValue());
            }
        }, new AqS194S0100000_12(this, 280));
        C73156SnQ.LJIIIIZZ(this, LLII(), new TBV() { // from class: X.Ser
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviOnboardingState) obj).getShouldStartAutoCreation());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviOnboardingState) obj).setShouldStartAutoCreation(((Boolean) obj2).booleanValue());
            }
        }, new AqS194S0100000_12(this, 281));
        C73156SnQ.LJIIIIZZ(this, LLFZ(), new TBT() { // from class: X.Seu
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviEditorState) obj).isQuitEditing());
            }
        }, new AqS194S0100000_12(this, 282));
        C73156SnQ.LJIIIIZZ(this, LLFII(), new TBV() { // from class: X.Sel
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviCreatorState) obj).isDoneCreatingProfileImage());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviCreatorState) obj).setDoneCreatingProfileImage(((Boolean) obj2).booleanValue());
            }
        }, new AqS194S0100000_12(this, 283));
        C73156SnQ.LJIIIIZZ(this, LLFII(), new TBV() { // from class: X.Sej
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviCreatorState) obj).isBackPressed());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviCreatorState) obj).setBackPressed(((Boolean) obj2).booleanValue());
            }
        }, new AqS194S0100000_12(this, 284));
        C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLJL.getValue(), new TBV() { // from class: X.SeQ
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviAutoCreationState) obj).isBackPressed());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviAutoCreationState) obj).setBackPressed(((Boolean) obj2).booleanValue());
            }
        }, new AqS194S0100000_12(this, 285));
        C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLJI.getValue(), new TBV() { // from class: X.Sen
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviHubState) obj).isContinueEditing());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviHubState) obj).setContinueEditing(((Boolean) obj2).booleanValue());
            }
        }, new AqS194S0100000_12(this, 286));
        C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLJI.getValue(), new TBV() { // from class: X.Seo
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviHubState) obj).isDoneNaviExperience());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviHubState) obj).setDoneNaviExperience(((Boolean) obj2).booleanValue());
            }
        }, new AqS194S0100000_12(this, 287));
        C73156SnQ.LJIIIIZZ(this, LLFII(), new TBV() { // from class: X.Sem
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviCreatorState) obj).getShouldShowSetProfileView());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviCreatorState) obj).setShouldShowSetProfileView(((Boolean) obj2).booleanValue());
            }
        }, new AqS194S0100000_12(this, 288));
        C73156SnQ.LJIIIIZZ(this, LLIIIILZ(), new TBV() { // from class: X.Sdu
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviSwitcherState) obj).getShouldCreateNewNavi());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviSwitcherState) obj).setShouldCreateNewNavi(((Boolean) obj2).booleanValue());
            }
        }, new AqS194S0100000_12(this, 275));
        C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLJI.getValue(), new TBV() { // from class: X.Sep
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviHubState) obj).isNaviDeleted());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviHubState) obj).setNaviDeleted(((Boolean) obj2).booleanValue());
            }
        }, new AqS194S0100000_12(this, 276));
        C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLJJLL.getValue(), new TBV() { // from class: X.Sex
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviSpinnerState) obj).getShouldShowSpinner());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviSpinnerState) obj).setShouldShowSpinner(((Boolean) obj2).booleanValue());
            }
        }, new AqS194S0100000_12(this, 277));
        C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLJL.getValue(), new TBV() { // from class: X.SeO
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviAutoCreationState) obj).getShouldShowSkintoneSelectFragment());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviAutoCreationState) obj).setShouldShowSkintoneSelectFragment(((Boolean) obj2).booleanValue());
            }
        }, new AqS194S0100000_12(this, 278));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onCreate", false);
    }

    public static void LLIIJLIL(ProfileNaviActivity profileNaviActivity, Fragment fragment) {
        profileNaviActivity.getClass();
        String name = fragment.getClass().getName();
        for (int LJJJJIZL = profileNaviActivity.getSupportFragmentManager().LJJJJIZL() - 1; -1 < LJJJJIZL; LJJJJIZL--) {
            C08Y LJJJJI = profileNaviActivity.getSupportFragmentManager().LJJJJI(LJJJJIZL);
            o.LJIIIIZZ(LJJJJI, "supportFragmentManager.getBackStackEntryAt(index)");
            String name2 = LJJJJI.getName();
            if (name2 != null && o.LJ(name2, name)) {
                profileNaviActivity.getSupportFragmentManager().LJJLIIIJJIZ(0, name);
                return;
            }
        }
        FragmentManager supportFragmentManager = profileNaviActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        c1b3.LJIIJ(fragment, "navi_fragment", R.id.i86);
        c1b3.LJ(name);
        c1b3.LJIILJJIL();
    }

    public final void LLIIIZ(int i, Bundle bundle) {
        LLILIL(false);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            LLIIJLIL(this, new ProfileNaviHubFragment());
                            return;
                        } else {
                            LLIL("auto_avatar", true, R.string.bzr, C72608Sea.LJLIL);
                            return;
                        }
                    }
                    ProfileNaviProfileImageEditorContainerFragment profileNaviProfileImageEditorContainerFragment = new ProfileNaviProfileImageEditorContainerFragment();
                    profileNaviProfileImageEditorContainerFragment.LJLJL = "avatar_hub";
                    LLIIJLIL(this, profileNaviProfileImageEditorContainerFragment);
                    return;
                }
                LLIIJLIL(this, new ProfileNaviHubFragment());
                return;
            }
            LLIL("avatar_hub", false, R.string.c0h, new AqS162S0100000_12(bundle, 928));
            return;
        }
        LLIIJLIL(this, new ProfileNaviOnboardingFragment());
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    public final void LLIL(String str, boolean z, int i, InterfaceC65784Pro interfaceC65784Pro) {
        LLFZ().getClass();
        if (C72663SfT.LIZ && ((Boolean) this.LJLJLJ.getValue()).booleanValue()) {
            AqS29S0210000_7 aqS29S0210000_7 = new AqS29S0210000_7(z, (boolean) this, (ProfileNaviActivity) interfaceC65784Pro, (InterfaceC65784Pro<? extends Fragment>) 5);
            if (Build.VERSION.SDK_INT >= 23 && C04330Ez.LIZ(this, "android.permission.CAMERA") != 0) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", str);
                FMX.LJIIL("show_avatar_camera_access", c188727au.LIZ);
                C26227ARb c26227ARb = new C26227ARb(this);
                c26227ARb.LJ(R.string.c0i);
                c26227ARb.LIZ(i);
                c26227ARb.LJII = true;
                UC0.LIZJ(c26227ARb, new AqS49S1200000_7(str, this, aqS29S0210000_7, 6));
                c26227ARb.LJI().LIZLLL();
                return;
            }
            aqS29S0210000_7.invoke(Boolean.TRUE);
            return;
        }
        LLIIJLIL(this, (Fragment) interfaceC65784Pro.invoke());
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
