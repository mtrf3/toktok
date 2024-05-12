package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.journey.flow.NewUserJourneyFlowDependencies;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.plugin.journey.NewUserJourneyStep;
import com.ss.android.ugc.aweme.plugin.journey.OnboardingFlowData;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FzA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40760FzA implements InterfaceC40749Fyz {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC40744Fyu LJLILLLLZI;
    public final InterfaceC88471Ynr<Fragment, Boolean, C76800UCe> LJLJI;
    public ComponentDependencies LJLJJI;
    public NewUserJourneyFlowDependencies LJLJJL;
    public final Object LJLJJLL;
    public C40759Fz9 LJLJL;
    public final MutableLiveData<Boolean> LJLJLJ;
    public final AqS156S0100000_6 LJLJLLL;

    @Override // X.InterfaceC40749Fyz
    public final void LIZIZ() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, androidx.lifecycle.ViewModel, java.lang.Object] */
    @Override // X.InterfaceC40749Fyz
    public final void LIZ(Intent intent) {
        Intent intent2;
        boolean z;
        ?? dependencies;
        OnboardingFlowData onboardingFlowData;
        Object obj;
        if (intent != null) {
            intent2 = (Intent) intent.getParcelableExtra("deeplink_intent_about_welcome_screen");
        } else {
            intent2 = null;
        }
        ComponentDependencies componentDependencies = (ComponentDependencies) ViewModelProviders.of(this.LJLIL).get(ComponentDependencies.class);
        NewUserJourneyStep newUserJourneyStep = new NewUserJourneyStep(EnumC40761FzB.JOURNEY_SLOGAN_ID.getId(), null, null, null, null, null, null, null, null, null, null, 2046, null);
        componentDependencies.getClass();
        componentDependencies.LJLIL = newUserJourneyStep;
        componentDependencies.LLFFF = this.LJLILLLLZI.LIZ();
        componentDependencies.LLFII = this.LJLILLLLZI.LIZJ();
        componentDependencies.LJLZ = new AqS156S0100000_6(this, 126);
        componentDependencies.LJLJI = new AqS172S0100000_6(this, 110);
        componentDependencies.LJLJJI = new AqS172S0100000_6(this, 111);
        componentDependencies.LJLILLLLZI = C38986FRu.LIZ();
        G36 item = SettingServiceImpl.LIZ().getCurrentI18nItem(this.LJLIL);
        o.LJIIIZ(item, "item");
        componentDependencies.LLD = item;
        componentDependencies.LL = new AqS156S0100000_6(this, 127);
        componentDependencies.LJLJJL = this.LJLILLLLZI.LIZIZ();
        if (C38986FRu.LIZ().LIZJ() == 3) {
            z = true;
        } else {
            z = false;
        }
        componentDependencies.LLFZ = z;
        if (intent2 != null) {
            android.net.Uri data = intent2.getData();
            if (data == null || (obj = UriProtector.getQueryParameter(data, "awedp_require_login")) == null) {
                obj = Boolean.FALSE;
            }
            componentDependencies.LJLLLLLL.postValue(new C40769FzJ(intent2, o.LJ("normal", obj)));
        }
        componentDependencies.LLIFFJFJJ = new AqS156S0100000_6(this, 128);
        componentDependencies.LLI = new AqS156S0100000_6(this, 129);
        componentDependencies.LLII = new AqS156S0100000_6(this, 130);
        componentDependencies.LLIIII = new AqS172S0100000_6(this, 112);
        this.LJLJJI = componentDependencies;
        if (!FNO.LIZ().LJLILLLLZI) {
            FNO.LIZ().LIZLLL(this.LJLIL);
        }
        C40736Fym c40736Fym = FNO.LIZ().LJLJI;
        if (c40736Fym != null && (onboardingFlowData = c40736Fym.LIZIZ) != null) {
            LIZJ(onboardingFlowData);
        }
        C68322mC c68322mC = new C68322mC();
        synchronized (this.LJLJJLL) {
            dependencies = ViewModelProviders.of(this.LJLIL).get(NewUserJourneyFlowDependencies.class);
            NewUserJourneyFlowDependencies newUserJourneyFlowDependencies = (NewUserJourneyFlowDependencies) dependencies;
            AqS156S0100000_6 aqS156S0100000_6 = new AqS156S0100000_6(this, 131);
            newUserJourneyFlowDependencies.getClass();
            newUserJourneyFlowDependencies.LJLJJL = aqS156S0100000_6;
            MutableLiveData<Boolean> needRefreshLiveData = this.LJLJLJ;
            o.LJIIIZ(needRefreshLiveData, "needRefreshLiveData");
            newUserJourneyFlowDependencies.LJLILLLLZI = needRefreshLiveData;
            ComponentDependencies componentDependencies2 = this.LJLJJI;
            if (componentDependencies2 != null) {
                newUserJourneyFlowDependencies.LJLIL = componentDependencies2;
            }
            AqS156S0100000_6 onFinishRunnable = this.LJLJLLL;
            o.LJIIIZ(onFinishRunnable, "onFinishRunnable");
            newUserJourneyFlowDependencies.LJLJI = onFinishRunnable;
            c68322mC.element = dependencies;
            this.LJLJJL = (NewUserJourneyFlowDependencies) dependencies;
        }
        C40759Fz9 c40759Fz9 = this.LJLJL;
        if (c40759Fz9 == null) {
            this.LJLJL = new C40759Fz9((NewUserJourneyFlowDependencies) c68322mC.element);
        } else {
            o.LJIIIZ(dependencies, "dependencies");
            c40759Fz9.LJLILLLLZI = dependencies;
        }
    }

    public final void LIZJ(OnboardingFlowData onboardingFlowData) {
        C40759Fz9 c40759Fz9;
        ComponentDependencies componentDependencies;
        boolean z;
        synchronized (this.LJLJJLL) {
            if (this.LJLJJL != null) {
                RBX rbx = (RBX) HG3.LJIILL();
                if (rbx.isLogin() && !rbx.isChildrenMode() && (componentDependencies = this.LJLJJI) != null) {
                    if (rbx.getCurUser().notifyPrivatePolicy && rbx.isNewUser()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    componentDependencies.LLF = z;
                }
                List<NewUserJourneyStep> list = onboardingFlowData.steps;
                if (list != null) {
                    ComponentDependencies componentDependencies2 = this.LJLJJI;
                    if (componentDependencies2 != null) {
                        componentDependencies2.LJLLLL.set(false);
                    }
                    ComponentDependencies componentDependencies3 = this.LJLJJI;
                    if (componentDependencies3 != null && (c40759Fz9 = this.LJLJL) != null) {
                        c40759Fz9.LJIILLIIL(componentDependencies3, list);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC40749Fyz
    public void onEvent(IEvent event) {
        C40759Fz9 c40759Fz9;
        OnboardingFlowData onboardingFlowData;
        boolean z;
        o.LJIIIZ(event, "event");
        if (event instanceof C175256uH) {
            IAccountUserService LJIILL = HG3.LJIILL();
            ComponentDependencies componentDependencies = this.LJLJJI;
            if (componentDependencies != null) {
                RBX rbx = (RBX) LJIILL;
                if (rbx.getCurUser().notifyPrivatePolicy && rbx.isNewUser()) {
                    z = true;
                } else {
                    z = false;
                }
                componentDependencies.LLF = z;
            }
            if (!FNO.LIZ().LJLILLLLZI) {
                FNO.LIZ().LIZLLL(this.LJLIL);
            }
            C40736Fym c40736Fym = FNO.LIZ().LJLJI;
            if (c40736Fym != null && (onboardingFlowData = c40736Fym.LIZIZ) != null) {
                LIZJ(onboardingFlowData);
                return;
            }
            return;
        }
        if (!(event instanceof C40726Fyc) || (c40759Fz9 = this.LJLJL) == null) {
            return;
        }
        c40759Fz9.LJIILL(((C40726Fyc) event).LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C40760FzA(ActivityC45651qj activity, InterfaceC40744Fyu activityParamProvider, InterfaceC88471Ynr<? super Fragment, ? super Boolean, C76800UCe> replaceFragment) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(activityParamProvider, "activityParamProvider");
        o.LJIIIZ(replaceFragment, "replaceFragment");
        this.LJLIL = activity;
        this.LJLILLLLZI = activityParamProvider;
        this.LJLJI = replaceFragment;
        this.LJLJJLL = new Object();
        this.LJLJLJ = new MutableLiveData<>();
        this.LJLJLLL = new AqS156S0100000_6(this, 125);
    }

    @Override // X.InterfaceC40749Fyz
    public final void onActivityResult(int i, int i2, Intent intent) {
        C40759Fz9 c40759Fz9;
        if (i == 123 && (c40759Fz9 = this.LJLJL) != null) {
            c40759Fz9.LJIILL(null);
        }
    }
}
