package X;

import Y.ACListenerS32S0100000_12;
import Y.ACListenerS33S0100000_13;
import Y.ACListenerS47S0200000_13;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.livesetting.watchlive.SurveyStyleV3Setting;
import com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel;
import com.bytedance.android.livesdk.survey.layoutmanager.LiveSecondSurveyFlexLayoutManager;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UlZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78137UlZ extends FrameLayout {
    public float LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public SurveyViewModel LJLLL;

    private final RecyclerView getSecondItemsContainerRv() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-secondItemsContainerRv>(...)");
        return (RecyclerView) value;
    }

    private final C47121t6 getSwipeHint() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-swipeHint>(...)");
        return (C47121t6) value;
    }

    private final LiveIconView getSwipeIcon() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-swipeIcon>(...)");
        return (LiveIconView) value;
    }

    public final LiveIconView getClearInputIcon() {
        Object value = this.LJLLJ.getValue();
        o.LJIIIIZZ(value, "<get-clearInputIcon>(...)");
        return (LiveIconView) value;
    }

    public final C47121t6 getGoBack() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-goBack>(...)");
        return (C47121t6) value;
    }

    public final LinearLayout getItemsContainer() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-itemsContainer>(...)");
        return (LinearLayout) value;
    }

    public final LinearLayout getSecondItemsContainer() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-secondItemsContainer>(...)");
        return (LinearLayout) value;
    }

    public final C47121t6 getSubTitleTv() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-subTitleTv>(...)");
        return (C47121t6) value;
    }

    public final C2A7 getSubmitBtn() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-submitBtn>(...)");
        return (C2A7) value;
    }

    public final RelativeLayout getSurveySecondOtherInput() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-surveySecondOtherInput>(...)");
        return (RelativeLayout) value;
    }

    public final LiveEditText getSurveySecondOtherInputText() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-surveySecondOtherInputText>(...)");
        return (LiveEditText) value;
    }

    public final C47121t6 getTitleTv() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-titleTv>(...)");
        return (C47121t6) value;
    }

    public final void LIZLLL() {
        LinearLayout itemsContainer = getItemsContainer();
        int childCount = itemsContainer.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = itemsContainer.getChildAt(i);
            o.LJIIIIZZ(childAt, "getChildAt(index)");
            if (childAt instanceof C47121t6) {
                childAt.setBackgroundResource(R.drawable.daa);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78137UlZ(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 357));
        this.LJLJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 351));
        this.LJLJJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 348));
        this.LJLJJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 349));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 350));
        this.LJLJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 352));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 355));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 356));
        this.LJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 347));
        this.LJLLI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 353));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 354));
        this.LJLLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 346));
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dj4, this, true);
        getSubmitBtn().setEnabled(false);
        getSubmitBtn().setBackgroundColor(LIZIZ(R.attr.db, context));
        C16880lQ.LJJIII(getSubmitBtn(), new ACListenerS47S0200000_13(this, context, 28));
    }

    public final void LIZJ(SurveyOption surveyOption) {
        HashSet<SurveySecondQuestion> hashSet;
        getItemsContainer().setVisibility(8);
        getSecondItemsContainer().setVisibility(0);
        getSubmitBtn().setVisibility(0);
        getGoBack().setVisibility(0);
        getSubmitBtn().setEnabled(false);
        C2A7 submitBtn = getSubmitBtn();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        submitBtn.setBackgroundColor(LIZIZ(R.attr.db, context));
        SurveyViewModel surveyViewModel = this.LJLLL;
        if (surveyViewModel != null && (hashSet = surveyViewModel.LJLJJI) != null) {
            hashSet.clear();
        }
        SurveyViewModel surveyViewModel2 = this.LJLLL;
        if (surveyViewModel2 != null) {
            surveyViewModel2.LJLJJL = "";
        }
        getSurveySecondOtherInput().setVisibility(8);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        LiveSecondSurveyFlexLayoutManager liveSecondSurveyFlexLayoutManager = new LiveSecondSurveyFlexLayoutManager(context2);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        SurveyViewModel surveyViewModel3 = this.LJLLL;
        List<SurveySecondQuestion> list = surveyOption.secondList;
        o.LJIIIIZZ(list, "option.secondList");
        C71795SFr c71795SFr = new C71795SFr(context3, surveyViewModel3, list, new C73387Sr9(this));
        getSecondItemsContainerRv().setLayoutManager(liveSecondSurveyFlexLayoutManager);
        getSecondItemsContainerRv().setAdapter(c71795SFr);
        ACListenerS32S0100000_12 aCListenerS32S0100000_12 = new ACListenerS32S0100000_12(this, 139);
        C16880lQ.LJIJ(getSurveySecondOtherInput(), aCListenerS32S0100000_12);
        C16880lQ.LJJIIJ(getSurveySecondOtherInputText(), aCListenerS32S0100000_12);
    }

    public void setFragment(Fragment fragment) {
        if (fragment != null) {
            this.LJLLL = (SurveyViewModel) ViewModelProviders.of(fragment).get(SurveyViewModel.class);
        }
    }

    public static int LIZIZ(int i, Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        o.LJIIIIZZ(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attribute)");
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public final void LIZ(SurveyData surveyData, float f, boolean z) {
        List<SurveyQuestion> list;
        SurveyQuestion surveyQuestion;
        this.LJLIL = f;
        if (SurveyStyleV3Setting.INSTANCE.hasSecondSurvey()) {
            getSubmitBtn().setVisibility(8);
            C16880lQ.LJJIIZ(getGoBack(), new ACListenerS33S0100000_13(this, 142));
        } else {
            getSubmitBtn().setVisibility(0);
        }
        C16880lQ.LJJII(getClearInputIcon(), new ACListenerS32S0100000_12(this, 138));
        if (surveyData != null && (list = surveyData.questionList) != null && list.size() > 0 && 1 != 0 && (surveyQuestion = (SurveyQuestion) ListProtector.get(list, 0)) != null) {
            SurveyViewModel surveyViewModel = this.LJLLL;
            if (surveyViewModel != null) {
                surveyViewModel.LJLILLLLZI = surveyQuestion;
            }
            getTitleTv().setText(surveyQuestion.title);
            List<SurveyOption> list2 = surveyQuestion.optionList;
            if (list2 != null) {
                int i = 0;
                for (SurveyOption option : list2) {
                    int i2 = i + 1;
                    o.LJIIIIZZ(option, "option");
                    C47121t6 c47121t6 = new C47121t6(getContext(), null);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C15380j0.LIZ(44.0f));
                    layoutParams.topMargin = C15380j0.LIZ(12.0f);
                    layoutParams.setMarginStart(C15380j0.LIZ(32.0f));
                    layoutParams.setMarginEnd(C15380j0.LIZ(32.0f));
                    c47121t6.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), c47121t6.getPaddingTop(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), c47121t6.getPaddingBottom());
                    c47121t6.setGravity(17);
                    c47121t6.setLayoutParams(layoutParams);
                    c47121t6.setBackgroundResource(R.drawable.daa);
                    c47121t6.setText(option.content);
                    c47121t6.setMaxLines(2);
                    c47121t6.setEllipsize(TextUtils.TruncateAt.END);
                    c47121t6.LJJIJIL(R.style.a_z);
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    Integer LJI = C79045V0n.LJI(R.attr.dj, context);
                    if (LJI != null) {
                        c47121t6.setTextColor(LJI.intValue());
                    }
                    C023107f.LIZJ(c47121t6, 1);
                    C023107f.LIZIZ(c47121t6, 12, 15, 1, 1);
                    getItemsContainer().addView(c47121t6, i);
                    C16880lQ.LJJIIZ(c47121t6, new ACListenerS47S0200000_13(this, option, 29));
                    i = i2;
                }
                ViewGroup.LayoutParams layoutParams2 = getSwipeIcon().getLayoutParams();
                if (layoutParams2 instanceof C018905p) {
                    getTitleTv().measure(0, 0);
                    getSwipeHint().measure(0, 0);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) (((Math.abs(this.LJLIL) - C15380j0.LIZ(22.0f)) - getSwipeHint().getMeasuredHeight()) - C15380j0.LIZ(21.0f));
                    getSwipeIcon().setLayoutParams(layoutParams2);
                }
                if (z) {
                    C29306Beo.LJI(getSwipeHint());
                    C29306Beo.LJI(getSwipeIcon());
                }
            }
        }
    }
}
