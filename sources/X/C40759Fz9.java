package X;

import Y.ARunnableS25S0200000_6;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.NewUserJourneyService;
import com.ss.android.ugc.aweme.compliance.api.phl.model.PrivacyHighlightsForTeens;
import com.ss.android.ugc.aweme.journey.flow.NewUserJourneyFlowDependencies;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.plugin.journey.JourneyContentLanguageWrapper;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestPageStruct;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import com.ss.android.ugc.aweme.plugin.journey.NewUserJourneyStep;
import com.ss.android.ugc.aweme.plugin.journey.OnboardingFlowData;
import com.ss.android.ugc.aweme.plugin.journey.TopicInterestCategoryStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Fz9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40759Fz9 extends AbstractC38521fE {
    public static final Keva LJLJLLL = Keva.getRepo("new_user_journey_flow");
    public static final List<NewUserJourneyStep> LJLL = C47261Igj.LJJIJIIJI(new NewUserJourneyStep(EnumC40761FzB.JOURNEY_SLOGAN_ID.getId(), null, null, null, null, null, null, null, null, null, null, 2046, null), new NewUserJourneyStep(EnumC40761FzB.JOURNEY_SERVER_DELAY.getId(), null, null, null, null, null, null, null, null, null, null, 2046, null), new NewUserJourneyStep(EnumC40761FzB.JOURNEY_SMART_LOCK_ID.getId(), null, null, null, null, null, null, null, null, null, null, 2046, null), new NewUserJourneyStep(EnumC40761FzB.JOURNEY_AGE_GATE_ID.getId(), null, null, null, null, null, null, null, null, null, null, 2046, null), new NewUserJourneyStep(EnumC40761FzB.JOURNEY_LOGIN_ID.getId(), null, null, null, null, null, null, null, null, null, null, 2046, null), new NewUserJourneyStep(EnumC40761FzB.JOURNEY_ON_UPDATE_ADD_FB_FRIENDS_ID.getId(), null, null, null, null, null, null, null, null, null, null, 2046, null), new NewUserJourneyStep(EnumC40761FzB.JOURNEY_INTERESTS_ID.getId(), null, null, null, null, null, null, null, null, null, null, 2046, null), new NewUserJourneyStep(EnumC40761FzB.JOURNEY_SUBSCRIPTION_ID.getId(), null, null, null, null, null, null, null, null, null, null, 2046, null), new NewUserJourneyStep(EnumC40761FzB.JOURNEY_FREE_TRIAL_ID.getId(), null, null, null, null, null, null, null, null, null, null, 2046, null), new NewUserJourneyStep(EnumC40761FzB.JOURNEY_CONTENT_LANGUAGE_ID.getId(), null, null, null, null, null, null, null, null, null, null, 2046, null), new NewUserJourneyStep(EnumC40761FzB.JOURNEY_APP_LANGUAGE_ID.getId(), null, null, null, null, null, null, null, null, null, null, 2046, null), new NewUserJourneyStep(EnumC40761FzB.JOURNEY_DEEPLINK_ID.getId(), null, null, null, null, null, null, null, null, null, null, 2046, null), new NewUserJourneyStep(EnumC40761FzB.JOURNEY_PRIVACY_HIGHLIGHTS_FOR_TEENS.getId(), null, null, null, null, null, null, null, null, null, null, 2046, null), new NewUserJourneyStep(EnumC40761FzB.JOURNEY_SWIPE_UP_ID.getId(), null, null, null, null, null, null, null, null, null, null, 2046, null), new NewUserJourneyStep(EnumC40761FzB.JOURNEY_PRIVATE_ACCOUNT_TIPS_ID.getId(), null, null, null, null, null, null, null, null, null, null, 2046, null), new NewUserJourneyStep(EnumC40761FzB.JOURNEY_CONSISTENT_CONTENT_AND_AD_CHOICES_ID.getId(), null, null, null, null, null, null, null, null, null, null, 2046, null));
    public List<NewUserJourneyStep> LJLJI;
    public final List<EnumC40761FzB> LJLJJI;
    public C31968Cge LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;

    public final void LJIILIIL() {
        C188727au c188727au = new C188727au();
        C40765FzF c40765FzF = EnumC40761FzB.Companion;
        Integer valueOf = Integer.valueOf(this.LJLJLJ);
        c40765FzF.getClass();
        c188727au.LJIIIZ("previous_nuj", C40765FzF.LIZIZ(valueOf));
        c188727au.LIZLLL(this.LJLJL ? 1 : 0, "nuj_early_finished");
        FMX.LJIIL("first_video_show", c188727au.LIZ);
        this.LJLJJLL = Integer.MAX_VALUE;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((NewUserJourneyFlowDependencies) this.LJLILLLLZI).LJLJI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        } else {
            o.LJIJI("onFinishRunnable");
            throw null;
        }
    }

    public final void LJIIL() {
        E4G e4g;
        IPluginService.PluginDataWrapper value;
        if (NewUserJourneyService.LJIILLIIL().LJFF()) {
            this.LJLJL = true;
            LJIILIIL();
        }
        Context context = ((NewUserJourneyFlowDependencies) this.LJLILLLLZI).LJLJJL.invoke().get();
        if (context != null && !FNO.LIZ().LJLILLLLZI) {
            FNO.LIZ().LIZLLL(context);
        }
        int i = 0;
        List<E4G> currentPluginList = PluginService.createIPluginServicebyMonsterPlugin(false).getCurrentPluginList();
        OnboardingFlowData onboardingFlowData = null;
        if (currentPluginList != null) {
            Iterator<E4G> it = currentPluginList.iterator();
            while (true) {
                if (it.hasNext()) {
                    e4g = it.next();
                    if (e4g.getType() == EnumC35839E4t.ON_BOARDING_FLOW_DATA) {
                        break;
                    }
                } else {
                    e4g = null;
                    break;
                }
            }
            E4G e4g2 = e4g;
            if (e4g2 != null && (value = e4g2.getValue()) != null) {
                onboardingFlowData = value.onboardingFlowData;
            }
        }
        ComponentDependencies gv0 = ((NewUserJourneyFlowDependencies) this.LJLILLLLZI).gv0();
        if (onboardingFlowData != null) {
            gv0.LJLLLL.set(false);
            List<NewUserJourneyStep> list = onboardingFlowData.steps;
            if (list != null) {
                int i2 = this.LJLJJLL;
                if (i2 == -1) {
                    this.LJLJI = list;
                    LJIILLIIL(gv0, list);
                    return;
                }
                if (i2 >= list.size()) {
                    return;
                }
                int i3 = this.LJLJJLL;
                if (i3 >= 0) {
                    while (true) {
                        C40765FzF c40765FzF = EnumC40761FzB.Companion;
                        int i4 = ((NewUserJourneyStep) ListProtector.get(list, i)).id;
                        c40765FzF.getClass();
                        EnumC40761FzB LIZ = C40765FzF.LIZ(i4);
                        if (LIZ == null || ListProtector.get(this.LJLJJI, i) != LIZ) {
                            return;
                        }
                        if (i == i3) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                LJIILLIIL(gv0, list);
                this.LJLJI = list;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40759Fz9(NewUserJourneyFlowDependencies dependencies) {
        super(4, dependencies);
        o.LJIIIZ(dependencies, "dependencies");
        this.LJLJI = LJLL;
        this.LJLJJI = new ArrayList();
        this.LJLJJLL = -1;
        this.LJLJLJ = -1;
    }

    public final void LJIILJJIL(NewUserJourneyStep newUserJourneyStep) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Handle step ");
        LIZ.append(newUserJourneyStep.id);
        LIZ.append(": ");
        C40765FzF c40765FzF = EnumC40761FzB.Companion;
        Integer valueOf = Integer.valueOf(newUserJourneyStep.id);
        c40765FzF.getClass();
        LIZ.append(C40765FzF.LIZIZ(valueOf));
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        EnumC40761FzB LIZ2 = C40765FzF.LIZ(newUserJourneyStep.id);
        if (LIZ2 == null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Invalid component id ");
            LIZ3.append(newUserJourneyStep.id);
            LIZ3.append(' ');
            LIZ3.append(C40765FzF.LIZIZ(Integer.valueOf(newUserJourneyStep.id)));
            LIZ3.append(", moving to next step");
            C40741Fyr.LIZ(X1D.LIZIZ(LIZ3));
            LJIILL(null);
            return;
        }
        if (((ArrayList) this.LJLJJI).contains(LIZ2)) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Component id ");
            LIZ4.append(newUserJourneyStep.id);
            LIZ4.append(' ');
            LIZ4.append(C40765FzF.LIZIZ(Integer.valueOf(newUserJourneyStep.id)));
            LIZ4.append(" was already shown, moving to next step");
            C40741Fyr.LIZ(X1D.LIZIZ(LIZ4));
            LJIILL(null);
            return;
        }
        ((ArrayList) this.LJLJJI).add(LIZ2);
        InterfaceC40768FzI LIZ5 = ((NewUserJourneyFlowDependencies) this.LJLILLLLZI).LJLJJI.LIZ(LIZ2.getId());
        ComponentDependencies gv0 = ((NewUserJourneyFlowDependencies) this.LJLILLLLZI).gv0();
        if (LIZ5 == null) {
            LJIILL(null);
            return;
        }
        if (E5B.LIZ(newUserJourneyStep.id)) {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("Remove NUJ experiment active for ");
            LIZ6.append(C40765FzF.LIZIZ(Integer.valueOf(newUserJourneyStep.id)));
            LIZ6.append(", moving to next step");
            C40741Fyr.LIZ(X1D.LIZIZ(LIZ6));
            LJIILL(null);
            return;
        }
        if (newUserJourneyStep.id == EnumC40761FzB.JOURNEY_INTERESTS_ID.getId()) {
            gv0.LJLIL = newUserJourneyStep;
        }
        if (!LIZ5.LJ(gv0)) {
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("Component id ");
            LIZ7.append(newUserJourneyStep.id);
            LIZ7.append(' ');
            LIZ7.append(C40765FzF.LIZIZ(Integer.valueOf(newUserJourneyStep.id)));
            LIZ7.append(" should not be handled, moving to next step");
            C40741Fyr.LIZ(X1D.LIZIZ(LIZ7));
            LJIILL(null);
            return;
        }
        AqS137S0200000_6 aqS137S0200000_6 = new AqS137S0200000_6(this, gv0, 41);
        if (LIZ5.LIZ(gv0) == 0) {
            aqS137S0200000_6.invoke(newUserJourneyStep);
            return;
        }
        C40736Fym c40736Fym = FNO.LIZ().LJLJI;
        if (c40736Fym == null) {
            return;
        }
        long LIZ8 = LIZ5.LIZ(gv0);
        if (c40736Fym.LJ) {
            aqS137S0200000_6.invoke(newUserJourneyStep);
            return;
        }
        c40736Fym.LIZLLL = newUserJourneyStep;
        c40736Fym.LIZJ = aqS137S0200000_6;
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS25S0200000_6(newUserJourneyStep, c40736Fym, 48), LIZ8);
    }

    public final synchronized void LJIILL(Boolean bool) {
        boolean z;
        int i;
        if (bool != null) {
            MutableLiveData<Boolean> mutableLiveData = ((NewUserJourneyFlowDependencies) this.LJLILLLLZI).LJLILLLLZI;
            if (mutableLiveData != null) {
                if (!o.LJ(mutableLiveData.getValue(), Boolean.TRUE)) {
                    MutableLiveData<Boolean> mutableLiveData2 = ((NewUserJourneyFlowDependencies) this.LJLILLLLZI).LJLILLLLZI;
                    if (mutableLiveData2 != null) {
                        if (!bool.booleanValue()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        mutableLiveData2.postValue(Boolean.valueOf(z));
                    } else {
                        o.LJIJI("needRefreshLiveData");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("needRefreshLiveData");
                throw null;
            }
        }
        int i2 = this.LJLJJLL;
        if (i2 != Integer.MAX_VALUE && i2 >= -1) {
            LJIIL();
            int i3 = this.LJLJJLL + 1;
            this.LJLJJLL = i3;
            if (i3 >= this.LJLJI.size() || (i = this.LJLJJLL) < 0) {
                Keva keva = LJLJLLL;
                C40765FzF c40765FzF = EnumC40761FzB.Companion;
                Integer valueOf = Integer.valueOf(this.LJLJLJ);
                c40765FzF.getClass();
                keva.storeString("last_step", C40765FzF.LIZIZ(valueOf));
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((NewUserJourneyFlowDependencies) this.LJLILLLLZI).LJLJI;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                    return;
                } else {
                    o.LJIJI("onFinishRunnable");
                    throw null;
                }
            }
            NewUserJourneyStep newUserJourneyStep = (NewUserJourneyStep) ListProtector.get(this.LJLJI, i);
            if (C40732Fyi.LIZ(newUserJourneyStep)) {
                ComponentDependencies gv0 = ((NewUserJourneyFlowDependencies) this.LJLILLLLZI).gv0();
                gv0.LJLJL.invoke();
                C40792Fzg onInitialScreenFinish = C40792Fzg.LJLIL;
                o.LJIIIZ(onInitialScreenFinish, "onInitialScreenFinish");
                gv0.LJLJL = onInitialScreenFinish;
                return;
            }
            LJIILJJIL(newUserJourneyStep);
            return;
        }
        Keva keva2 = LJLJLLL;
        C40765FzF c40765FzF2 = EnumC40761FzB.Companion;
        Integer valueOf2 = Integer.valueOf(this.LJLJLJ);
        c40765FzF2.getClass();
        keva2.storeString("last_step", C40765FzF.LIZIZ(valueOf2));
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = ((NewUserJourneyFlowDependencies) this.LJLILLLLZI).LJLJI;
        if (interfaceC65784Pro2 != null) {
            interfaceC65784Pro2.invoke();
        } else {
            o.LJIJI("onFinishRunnable");
            throw null;
        }
    }

    public final synchronized void LJIILLIIL(ComponentDependencies componentDependencies, List<NewUserJourneyStep> list) {
        List<NewUserInterestStruct> list2;
        NewUserJourneyFlowDependencies newUserJourneyFlowDependencies = (NewUserJourneyFlowDependencies) this.LJLILLLLZI;
        newUserJourneyFlowDependencies.getClass();
        newUserJourneyFlowDependencies.LJLIL = componentDependencies;
        for (NewUserJourneyStep newUserJourneyStep : list) {
            NewUserInterestPageStruct newUserInterestPageStruct = newUserJourneyStep.newUserInterestPage;
            if (newUserInterestPageStruct != null && (list2 = newUserInterestPageStruct.interest_list) != null) {
                componentDependencies.hv0(list2);
            }
            List<TopicInterestCategoryStruct> list3 = newUserJourneyStep.topicInterestList;
            if (list3 != null) {
                componentDependencies.iv0(list3);
            }
            PickYourAdPlanPage pickYourAdPlanPage = newUserJourneyStep.pickYourAdPlanPage;
            if (pickYourAdPlanPage != null) {
                componentDependencies.LJZ = pickYourAdPlanPage;
            }
            AdFreeTrialPageInfo adFreeTrialPageInfo = newUserJourneyStep.adFreeTrialPageInfo;
            if (adFreeTrialPageInfo != null) {
                componentDependencies.LJZI = adFreeTrialPageInfo;
            }
            JourneyContentLanguageWrapper journeyContentLanguageWrapper = newUserJourneyStep.newUserContentLanguagePage;
            if (journeyContentLanguageWrapper != null) {
                componentDependencies.LLFF = C40871G2h.LIZ(journeyContentLanguageWrapper);
                componentDependencies.LJLLI = newUserJourneyStep.pageType;
                if (newUserJourneyStep.id == EnumC40761FzB.JOURNEY_LYNX_EXPERIENCE_ID.getId() && this.LJLJJL == null) {
                    Context context = componentDependencies.LJLZ.invoke().get();
                    if (context != null) {
                        C31968Cge c31968Cge = new C31968Cge(context);
                        this.LJLJJL = c31968Cge;
                        componentDependencies.LJLLILLLL = c31968Cge;
                        new WeakReference(c31968Cge.LIZIZ());
                    }
                    LJLJLLL.storeString("content_languages", GsonProtectorUtils.toJson(new Gson(), journeyContentLanguageWrapper));
                }
            }
            PrivacyHighlightsForTeens privacyHighlightsForTeens = newUserJourneyStep.privacyHighlightsForTeensInfo;
            if (privacyHighlightsForTeens != null) {
                componentDependencies.LJLL = privacyHighlightsForTeens;
            }
        }
    }
}
