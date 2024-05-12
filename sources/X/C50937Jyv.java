package X;

import Y.AObserverS72S0200000_8;
import Y.AObserverS76S0100000_8;
import android.os.Handler;
import android.os.Message;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.config.SearchUserFeedbackSettings;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyQuestionnaire;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.viewmodel.NPSSurveyJSBViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Jyv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50937Jyv implements InterfaceC50355JpX, InterfaceC50941Jyz {
    public static final long LJLL;
    public static final /* synthetic */ int LJLLI = 0;
    public long LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final java.util.Map<String, Object> LJLJJLL = new LinkedHashMap();
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 604));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C50928Jym.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 605));

    @Override // X.InterfaceC50941Jyz
    public final void LIZIZ() {
        this.LJLJJI = false;
        this.LJLJJL = false;
    }

    @Override // X.InterfaceC50355JpX
    public final void cT() {
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j = 10;
        try {
            FHD.LIZLLL().getClass();
            j = FHD.LJI(10L, "user_satisfaction_survey_delay_time", true);
        } catch (Throwable unused) {
        }
        LJLL = timeUnit.toMillis(j);
    }

    @Override // X.InterfaceC50941Jyz
    public final void LIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        LJII(fragment);
    }

    public final boolean LIZJ(Fragment fragment) {
        ActivityC45651qj mo49getActivity;
        Boolean bool;
        if (C50440Jqu.LIZ() || !this.LJLJJL) {
            return false;
        }
        if (((fragment instanceof DynamicSearchFragment) && !this.LJLJJI) || (mo49getActivity = fragment.mo49getActivity()) == null) {
            return false;
        }
        C50652JuK.Companion.getClass();
        C50321Joz LJ = C50651JuJ.LJ(fragment);
        if (LJ == null) {
            return false;
        }
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) ViewModelProviders.of(mo49getActivity).get(SearchStateViewModel.class);
        if (searchStateViewModel.isHavingFocus.getValue() != null) {
            bool = Boolean.valueOf(!r0.booleanValue());
        } else {
            bool = null;
        }
        Boolean value = searchStateViewModel.isRefreshingData.getValue();
        Boolean value2 = searchStateViewModel.isResultRVScrolling.getValue();
        if (LJ.isFragmentVisible()) {
            Boolean bool2 = Boolean.TRUE;
            if (!o.LJ(bool, bool2) && !o.LJ(value, bool2) && !o.LJ(value2, bool2)) {
                return true;
            }
        }
        return false;
    }

    public final void LIZLLL(Fragment fragment) {
        ActivityC45651qj mo49getActivity;
        o.LJIIIZ(fragment, "fragment");
        if (!C50131Jlv.LIZ() || (mo49getActivity = fragment.mo49getActivity()) == null) {
            return;
        }
        ((NPSSurveyJSBViewModel) ViewModelProviders.of(mo49getActivity).get(NPSSurveyJSBViewModel.class)).LJLIL.observe(mo49getActivity, new AObserverS72S0200000_8(fragment, this, 4));
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) ViewModelProviders.of(mo49getActivity).get(SearchStateViewModel.class);
        searchStateViewModel.isHavingFocus.observe(mo49getActivity, new AObserverS72S0200000_8(fragment, this, 5));
        searchStateViewModel.isRefreshingData.observe(fragment, new AObserverS76S0100000_8(this, 91));
        searchStateViewModel.isResultRVScrolling.observe(fragment, new AObserverS72S0200000_8(fragment, this, 6));
    }

    public final void LJFF(Fragment fragment) {
        String satisfactionSurveySchema;
        int i;
        if (LIZJ(fragment) && this.LJLJI == 0) {
            C50940Jyy c50940Jyy = (C50940Jyy) this.LJLJL.getValue();
            c50940Jyy.getClass();
            o.LJIIIZ(fragment, "fragment");
            if (c50940Jyy.LIZLLL || C50440Jqu.LIZ()) {
                return;
            }
            ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
            if (mo49getActivity != null) {
                C78524Uro.LIZ(mo49getActivity).LJIIIIZZ(c50940Jyy.LIZ, "search_feelgood_params");
            }
            SearchUserFeedbackSettings.FeedbackList feedbackList = (SearchUserFeedbackSettings.FeedbackList) SettingsManager.LIZLLL().LJIIIIZZ("search_user_feedback", SearchUserFeedbackSettings.FeedbackList.class, null);
            if (feedbackList == null || (satisfactionSurveySchema = feedbackList.getSatisfactionSurveySchema()) == null) {
                return;
            }
            C50652JuK.Companion.getClass();
            C50321Joz LJ = C50651JuJ.LJ(fragment);
            TMC.LJIIJ(C50651JuJ.LJIIJ(fragment), C17N.LJJJJJL(fragment).If().LIZJ(), "FeelgoodDialogSurveyVM + 65");
            if (LJ != null) {
                i = LJ.getTabIndex();
            } else {
                i = 0;
            }
            String LIZ = C50676Jui.LIZ(i);
            String builder = UriProtector.parse("aweme://webview_popup").buildUpon().appendQueryParameter("url", satisfactionSurveySchema).appendQueryParameter("search_type", LIZ).toString();
            o.LJIIIIZZ(builder, "parse(\"aweme://webview_p…)\n            .toString()");
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJIJLIJ(builder);
            sparkContext.LJJIIJ("container_bg_color", "00000000");
            sparkContext.LJJIIJ("loading_bg_color", "00000000");
            sparkContext.LJJI(new C50938Jyw(c50940Jyy, fragment));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("search_feelgood_");
            LIZ2.append("nps_survey");
            LIZ2.append('_');
            LIZ2.append(LIZ);
            String LIZIZ = X1D.LIZIZ(LIZ2);
            C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
            ALE ale = new ALE();
            ale.LJIIIZ = true;
            o.LJIIJ(LIZIZ, "<set-?>");
            ale.LIZ = LIZIZ;
            ale.LJIIJ = Integer.MAX_VALUE;
            ale.LJIIJJI = -1;
            ale.LIZIZ(C67052k9.LJLIL);
            ale.LJIIL = AL6.LJLIL;
            ale.LJIILIIL = C47261Igj.LJII(builder);
            ale.LJIILJJIL = new ArrayList();
            c60827Nu3.getClass();
            C60827Nu3.LJIIJJI(ale, Boolean.FALSE);
            C60827Nu3.LJIIJ(c60827Nu3, builder, LIZIZ, sparkContext, null, true, 32);
        }
    }

    public final void LJII(Fragment fragment) {
        ActivityC45651qj mo49getActivity;
        SearchUserFeedbackSettings.FeedbackList feedbackList;
        String satisfactionSurveySchema;
        int i;
        if (LIZJ(fragment) && this.LJLJI == 0) {
            C50940Jyy c50940Jyy = (C50940Jyy) this.LJLJL.getValue();
            c50940Jyy.getClass();
            o.LJIIIZ(fragment, "fragment");
            if (c50940Jyy.LIZJ || !c50940Jyy.LJ || C50440Jqu.LIZ() || (mo49getActivity = fragment.mo49getActivity()) == null || (feedbackList = (SearchUserFeedbackSettings.FeedbackList) SettingsManager.LIZLLL().LJIIIIZZ("search_user_feedback", SearchUserFeedbackSettings.FeedbackList.class, null)) == null || (satisfactionSurveySchema = feedbackList.getSatisfactionSurveySchema()) == null) {
                return;
            }
            c50940Jyy.LIZJ = true;
            C50440Jqu.LIZJ = true;
            C50652JuK.Companion.getClass();
            C50321Joz LJ = C50651JuJ.LJ(fragment);
            if (LJ != null) {
                i = LJ.getTabIndex();
            } else {
                i = 0;
            }
            String builder = UriProtector.parse("aweme://webview_popup").buildUpon().appendQueryParameter("url", satisfactionSurveySchema).appendQueryParameter("search_type", C50676Jui.LIZ(i)).toString();
            o.LJIIIIZZ(builder, "parse(\"aweme://webview_p…)\n            .toString()");
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJIJLIJ(builder);
            sparkContext.LJJIIJ("container_bg_color", "00000000");
            sparkContext.LJJIIJ("loading_bg_color", "00000000");
            sparkContext.LJJI(new C50939Jyx(fragment, sparkContext, c50940Jyy));
            C40343FsR.LJIILJJIL.getClass();
            C40342FsQ.LIZ(mo49getActivity, sparkContext).LIZIZ();
        }
    }

    public final void LJI(int i, Fragment fragment) {
        C50652JuK.Companion.getClass();
        C50321Joz LJ = C50651JuJ.LJ(fragment);
        if (LJ != null) {
            boolean isFragmentVisible = LJ.isFragmentVisible();
            long currentTimeMillis = System.currentTimeMillis();
            long j = 0;
            if (i != 1) {
                if (i == 2) {
                    if (isFragmentVisible) {
                        this.LJLILLLLZI = currentTimeMillis;
                        this.LJLJI -= this.LJLIL;
                    } else {
                        long j2 = this.LJLILLLLZI;
                        if (currentTimeMillis > j2) {
                            this.LJLIL = currentTimeMillis - j2;
                        }
                    }
                    long j3 = this.LJLJI;
                    if (j3 >= 0) {
                        j = j3;
                    }
                    this.LJLJI = j;
                }
            } else {
                this.LJLIL = 0L;
                this.LJLILLLLZI = currentTimeMillis;
                this.LJLJI = LJLL;
            }
            if (isFragmentVisible) {
                Message obtainMessage = ((Handler) this.LJLJLLL.getValue()).obtainMessage(1, fragment);
                o.LJIIIIZZ(obtainMessage, "handler.obtainMessage(PR…OAD_NPS_SURVEY, fragment)");
                ((Handler) this.LJLJLLL.getValue()).removeMessages(1);
                ((Handler) this.LJLJLLL.getValue()).sendMessageDelayed(obtainMessage, this.LJLJI);
                return;
            }
            ((Handler) this.LJLJLLL.getValue()).removeMessages(1);
        }
    }

    public final void LJ(boolean z, Fragment fragment, InterfaceC50067Jkt interfaceC50067Jkt) {
        String str;
        o.LJIIIZ(fragment, "fragment");
        if (!C50131Jlv.LIZ()) {
            return;
        }
        if (fragment instanceof DynamicSearchFragment) {
            if (z) {
                str = "onLynxVerticalSearchShow";
            } else {
                str = "onLynxVerticalSearchHide";
            }
            if (interfaceC50067Jkt != null) {
                interfaceC50067Jkt.LIZ(str, new JSONObject());
                return;
            }
            return;
        }
        LJI(2, fragment);
    }

    @Override // X.InterfaceC50355JpX
    public final void b30(Fragment fragment, m mVar, FeelgoodSurveyModel feelgoodSurveyModel, java.util.Map<String, String> signParams) {
        String str;
        FeelgoodSurveyQuestionnaire questionnaire;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(signParams, "signParams");
        Iterable iterable = (Iterable) this.LJLJLJ.getValue();
        HashMap<String, Object> hashMap = null;
        if (iterable != null) {
            if (feelgoodSurveyModel != null && (questionnaire = feelgoodSurveyModel.getQuestionnaire()) != null) {
                str = questionnaire.getSurveyID();
            } else {
                str = null;
            }
            if (ORZ.LJLJJI(str, iterable)) {
                this.LJLJJL = true;
                C50652JuK.Companion.getClass();
                C50321Joz LJ = C50651JuJ.LJ(fragment);
                this.LJLJJLL.put("questionnaire_information", mVar);
                this.LJLJJLL.put("client_params", signParams);
                java.util.Map<String, Object> map = this.LJLJJLL;
                if (LJ != null) {
                    hashMap = LJ.getFeelGoodToken();
                }
                map.put("server_params", hashMap);
                if (!(fragment instanceof DynamicSearchFragment)) {
                    LJI(1, fragment);
                }
            }
        }
    }
}
