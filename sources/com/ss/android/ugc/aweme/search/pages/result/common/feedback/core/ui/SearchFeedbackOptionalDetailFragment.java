package com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C29822Bn8;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C78496UrM;
import X.C79045V0n;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import X.SY4;
import Y.ACListenerS28S0100000_8;
import Y.IDLListenerS195S0100000_8;
import Y.IDObjectS180S0100000_8;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import defpackage.s1;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchFeedbackOptionalDetailFragment extends Fragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public View LJLIL;
    public boolean LJLJI;
    public FeedbackMultipleChoice LJLJJL;
    public Map<String, String> LJLJJLL;
    public IDLListenerS195S0100000_8 LJLJLJ;
    public AqS155S0200000_8 LJLJLLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public int LJLILLLLZI = -1;
    public int LJLJJI = -1;
    public int LJLJL = -1;
    public int LJLL = -1;

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        String str;
        String value;
        Resources resources;
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null || (str = resources.getString(R.string.wj)) == null) {
            str = "";
        }
        FeedbackMultipleChoice feedbackMultipleChoice = this.LJLJJL;
        if (feedbackMultipleChoice != null && (value = feedbackMultipleChoice.getValue()) != null) {
            str = value;
        }
        c9kf.LIZJ = str;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark;
        LIZJ.LIZIZ(new AqS158S0100000_8(this, 229));
        c235119Kp.LIZIZ(LIZJ);
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        LIZJ2.LIZIZ(new AqS158S0100000_8(this, 230));
        c235119Kp.LIZLLL(LIZJ2);
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        View view = this.LJLIL;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.LJLJLJ);
        } else {
            o.LJIJI("rootView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = this.LJLIL;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.LJLJLJ);
        } else {
            o.LJIJI("rootView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FeedbackMultipleChoice feedbackMultipleChoice;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("param_feedback_choice");
            if (serializable instanceof FeedbackMultipleChoice) {
                feedbackMultipleChoice = (FeedbackMultipleChoice) serializable;
            } else {
                feedbackMultipleChoice = null;
            }
            this.LJLJJL = feedbackMultipleChoice;
            this.LJLJJI = arguments.getInt("param_feedback_rank", -1);
            this.LJLJI = arguments.getBoolean("param_feedback_require_content", false);
        }
    }

    public static void vl(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = i;
            }
            view.requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View view2 = this.LJLIL;
        if (view2 != null) {
            view2.getLayoutParams().height = this.LJLILLLLZI;
            ((SY4) _$_findCachedViewById(R.id.jfl)).setEnabled(!this.LJLJI);
            C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.jfl), new ACListenerS28S0100000_8(this, 30));
            _$_findCachedViewById(R.id.jfl).getClass();
            ((TextView) _$_findCachedViewById(R.id.jfh)).addTextChangedListener(new IDObjectS180S0100000_8(this, 3));
            Context context = getContext();
            if (context != null) {
                String LIZ = C29822Bn8.LIZ(context, R.string.re0, "it.resources.getString(R…feedback_input_box_title)");
                TextView textView = (TextView) _$_findCachedViewById(R.id.jfk);
                if (this.LJLJI) {
                    SpannableString spannableString = new SpannableString(i0.LJFF(LIZ, " *"));
                    Integer LJI = C79045V0n.LJI(R.attr.eb, context);
                    if (LJI != null) {
                        i = LJI.intValue();
                    } else {
                        i = 0;
                    }
                    spannableString.setSpan(new ForegroundColorSpan(i), spannableString.length() - 1, spannableString.length(), 33);
                    LIZ = spannableString;
                }
                textView.setText(LIZ);
            }
            this.LJLJLJ = new IDLListenerS195S0100000_8(this, 1);
            return;
        }
        o.LJIJI("rootView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.cir, viewGroup, false, "inflater.inflate(R.layou…layout, container, false)");
        this.LJLIL = LIZIZ;
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZIZ;
    }
}
