package Y;

import X.C10I;
import X.C10K;
import X.C18950ol;
import X.C5S1;
import X.C76800UCe;
import X.C77125UOr;
import X.C78857UxB;
import X.C82544WaS;
import X.InterfaceC113674d9;
import X.X1D;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.account.loginsetting.BoolData;
import com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.repo.SurveyDetailResponse;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewController;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class AgS119S0100000_1 implements C10I {
    public final int $t;
    public Object l0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            default:
                return null;
        }
    }

    public AgS119S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(AgS119S0100000_1 agS119S0100000_1, C10K c10k) {
        if (!C82544WaS.LJ(c10k)) {
            InterfaceC113674d9 interfaceC113674d9 = (InterfaceC113674d9) agS119S0100000_1.l0;
            if (interfaceC113674d9 != null) {
                interfaceC113674d9.LIZ(false);
            }
        } else {
            BoolData boolData = (BoolData) c10k.LJIIJJI();
            InterfaceC113674d9 interfaceC113674d92 = (InterfaceC113674d9) agS119S0100000_1.l0;
            if (interfaceC113674d92 != null) {
                interfaceC113674d92.LIZ(boolData.data.result);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS119S0100000_1 agS119S0100000_1, C10K c10k) {
        Integer num;
        if (C82544WaS.LJ(c10k) && (num = (Integer) c10k.LJIIJJI()) != null && num.intValue() == 1) {
            BaseMyProfileGuideWidget baseMyProfileGuideWidget = (BaseMyProfileGuideWidget) agS119S0100000_1.l0;
            baseMyProfileGuideWidget.getClass();
            C5S1 c5s1 = new C5S1(C77125UOr.LIZJ(baseMyProfileGuideWidget));
            c5s1.LIZJ(R.string.pfl);
            c5s1.LJ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS119S0100000_1 agS119S0100000_1, C10K c10k) {
        String str;
        String str2;
        List<String> list;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Survey data, title: ");
        SurveyDetailResponse.Data data = ((SurveyDetailResponse) c10k.LJIIJJI()).data;
        if (data != null) {
            str = data.title;
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        SurveyDetailResponse.Data data2 = ((SurveyDetailResponse) c10k.LJIIJJI()).data;
        if (data2 != null && (str2 = data2.title) != null && C78857UxB.LJJJIL(str2) && (list = data2.starsTitleList) != null) {
            Iterator<String> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().length() == 0) {
                        break;
                    }
                } else {
                    SurveyViewController surveyViewController = (SurveyViewController) agS119S0100000_1.l0;
                    surveyViewController.LJLLILLLL = data2;
                    TextView textView = surveyViewController.LJLJJL;
                    if (textView != null) {
                        textView.setText(data2.title);
                        View view = surveyViewController.LJLJI;
                        if (view != null) {
                            view.setAlpha(0.0f);
                            View view2 = surveyViewController.LJLJI;
                            if (view2 != null) {
                                view2.setVisibility(0);
                                View view3 = surveyViewController.LJLJI;
                                if (view3 != null) {
                                    float height = view3.getHeight();
                                    View view4 = surveyViewController.LJLJI;
                                    if (view4 != null) {
                                        o.LJII(view4.getLayoutParams(), "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                        view3.setTranslationY(height + ((ViewGroup.MarginLayoutParams) r1).bottomMargin);
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(300L);
                                        animatorSet.setInterpolator(C18950ol.LIZIZ(0.25f, 1.0f, 0.25f, 1.0f));
                                        Animator[] animatorArr = new Animator[2];
                                        View view5 = surveyViewController.LJLJI;
                                        if (view5 != null) {
                                            animatorArr[0] = ObjectAnimator.ofFloat(view5, (Property<View, Float>) View.TRANSLATION_Y, view5.getTranslationY(), 0.0f);
                                            View view6 = surveyViewController.LJLJI;
                                            if (view6 != null) {
                                                animatorArr[1] = ObjectAnimator.ofFloat(view6, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                                                animatorSet.playTogether(animatorArr);
                                                animatorSet.addListener(new ALAdapterS6S0100000_8(surveyViewController, 12));
                                                animatorSet.start();
                                            } else {
                                                o.LJIJI("rootView");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("rootView");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("rootView");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("rootView");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("rootView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("rootView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("titleText");
                        throw null;
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
