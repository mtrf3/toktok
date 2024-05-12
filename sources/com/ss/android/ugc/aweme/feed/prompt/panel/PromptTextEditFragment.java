package com.ss.android.ugc.aweme.feed.prompt.panel;

import X.ActivityC45651qj;
import X.AnonymousClass723;
import X.C10A;
import X.C116754i7;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C19K;
import X.C234529Ii;
import X.C235119Kp;
import X.C238299Wv;
import X.C26244ARs;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C47959Irz;
import X.C63081OpJ;
import X.C72T;
import X.C76800UCe;
import X.C7EL;
import X.C90903hW;
import X.C9KF;
import X.C9UV;
import X.FMX;
import X.InterfaceC116774i9;
import X.InterfaceC178146yw;
import X.InterfaceC219588ja;
import X.InterfaceC65784Pro;
import X.O6R;
import X.SY4;
import Y.ACListenerS24S0100000_4;
import Y.ARunnableS23S0200000_4;
import Y.ARunnableS40S0100000_4;
import Y.AUListenerS93S0100000_4;
import Y.IDAListenerS73S0100000_4;
import Y.IDObjectS177S0100000_4;
import Y.IDTListenerS114S0100000_4;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.feed.prompt.FeedPromptViewModel;
import com.ss.android.ugc.aweme.feed.prompt.data.PromptStruct;
import com.ss.android.ugc.aweme.feed.prompt.panel.PromptTextEditFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PromptTextEditFragment extends Fragment implements InterfaceC219588ja, ViewTreeObserver.OnGlobalLayoutListener, InterfaceC178146yw {
    public static final /* synthetic */ int LJLLL = 0;
    public FeedPromptViewModel LJLIL;
    public String LJLJI;
    public int LJLJJI;
    public ViewGroup LJLJJL;
    public View LJLJJLL;
    public C72T LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public Object LJLLI;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public final C116754i7 LJLILLLLZI = new C116754i7();
    public final IDObjectS177S0100000_4 LJLLILLLL = new IDObjectS177S0100000_4(this, 3);

    @Override // X.InterfaceC178146yw
    public final void Yc(int i) {
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
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

    @Override // X.InterfaceC178146yw
    public final void LLIIJLIL() {
        wl(this.LJLJLLL - this.LJLL);
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.jhq);
        o.LJIIIIZZ(string, "getString(R.string.pfFee…_inputBottomSheet_header)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 346));
        c235119Kp.LIZLLL(LIZJ);
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_x_mark;
        LIZJ2.LIZLLL = true;
        LIZJ2.LIZIZ(new AqS154S0100000_4(this, 347));
        c235119Kp.LIZIZ(LIZJ2);
        return c235119Kp;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup.LayoutParams layoutParams;
        ViewTreeObserver viewTreeObserver;
        Rect rect = new Rect();
        ViewGroup viewGroup = this.LJLJJL;
        if (viewGroup != null) {
            viewGroup.getWindowVisibleDisplayFrame(rect);
        }
        Rect rect2 = new Rect();
        View _$_findCachedViewById = _$_findCachedViewById(R.id.avq);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.getGlobalVisibleRect(rect2);
        }
        int i = rect2.bottom;
        int i2 = rect.bottom;
        if (i > i2) {
            this.LJLJLLL = this.LJLJLJ - i2;
            this.LJLL = C47959Irz.LIZJ(16, i - i2);
            ViewGroup viewGroup2 = this.LJLJJL;
            if (viewGroup2 != null && (viewTreeObserver = viewGroup2.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            int i3 = this.LJLL;
            ViewGroup viewGroup3 = this.LJLJJL;
            if (viewGroup3 != null && (layoutParams = viewGroup3.getLayoutParams()) != null) {
                int i4 = layoutParams.height;
                ValueAnimator ofInt = ValueAnimator.ofInt(i4, i4 + i3);
                ofInt.addUpdateListener(new AUListenerS93S0100000_4(this, 62));
                ofInt.addListener(new IDAListenerS73S0100000_4(this, 17));
                ofInt.setDuration(200L);
                ofInt.start();
                return;
            }
            return;
        }
        this.LJLJLJ = i2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        TextView textView = (TextView) _$_findCachedViewById(R.id.l4k);
        if (textView != null) {
            textView.removeTextChangedListener(this.LJLLILLLL);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        ViewTreeObserver viewTreeObserver;
        super.onPause();
        ViewGroup viewGroup = this.LJLJJL;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        ViewTreeObserver viewTreeObserver;
        super.onResume();
        View _$_findCachedViewById = _$_findCachedViewById(R.id.l4k);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.postDelayed(new ARunnableS40S0100000_4(this, 161), 200L);
        }
        ViewGroup viewGroup = this.LJLJJL;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        Dialog dialog;
        FeedPromptViewModel feedPromptViewModel;
        super.onStop();
        Editable editable = null;
        if (o.LJ("survey", this.LJLJI)) {
            FeedPromptViewModel feedPromptViewModel2 = this.LJLIL;
            if (feedPromptViewModel2 != null) {
                feedPromptViewModel2.LJLL = null;
                return;
            }
            return;
        }
        DialogFragment dialogFragment = (DialogFragment) getParentFragment();
        if (dialogFragment == null || !dialogFragment.isAdded() || (dialog = dialogFragment.getDialog()) == null || !dialog.isShowing() || (feedPromptViewModel = this.LJLIL) == null) {
            return;
        }
        C19K c19k = (C19K) _$_findCachedViewById(R.id.l4k);
        if (c19k != null) {
            editable = c19k.getText();
        }
        feedPromptViewModel.LJLL = String.valueOf(editable);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        Serializable serializable;
        boolean z;
        String string;
        String string2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Serializable serializable2 = null;
        if (arguments == null || (str = arguments.getString("source_page")) == null) {
            if (bundle != null) {
                str = bundle.getString("source_page");
            } else {
                str = null;
            }
        }
        this.LJLJI = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("chosen_prompt");
        } else {
            serializable = null;
        }
        this.LJLLI = serializable;
        int i = 1;
        if (getParentFragmentManager().LJJJJIZL() <= 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "homepage_hot";
        if (z) {
            Bundle arguments3 = getArguments();
            if (arguments3 != null && (string2 = arguments3.getString("event_type")) != null) {
                str2 = string2;
            }
            C26244ARs.LIZLLL(str2, "infeed_survey");
            return;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            serializable2 = arguments4.getSerializable("chosen_prompt");
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null && (string = arguments5.getString("event_type")) != null) {
            str2 = string;
        }
        if (serializable2 == null) {
            i = 0;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("enter_method", "long_press");
        c188727au.LIZLLL(i, "is_prefilled");
        FMX.LJIIL("enter_input_edit_page", c188727au.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("source_page", this.LJLJI);
    }

    public final void vl(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        KeyboardUtils.LIZIZ(_$_findCachedViewById(R.id.l4k));
        C72T c72t = this.LJLJL;
        if (c72t != null) {
            c72t.release();
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.l4k);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.postDelayed(new ARunnableS40S0100000_4((InterfaceC65784Pro) interfaceC65784Pro, 58), 100L);
        }
    }

    public final void wl(int i) {
        ViewGroup.LayoutParams layoutParams;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.am3);
        if (_$_findCachedViewById != null && _$_findCachedViewById.getHeight() == i) {
            return;
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.am3);
        if (_$_findCachedViewById2 != null && (layoutParams = _$_findCachedViewById2.getLayoutParams()) != null) {
            layoutParams.height = i;
        }
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.am3);
        if (_$_findCachedViewById3 != null) {
            _$_findCachedViewById3.requestLayout();
        }
    }

    public final void xl(boolean z) {
        Integer num;
        MutableLiveData<Integer> gv0;
        if (z) {
            if (!_$_findCachedViewById(R.id.avq).isEnabled()) {
                FeedPromptViewModel feedPromptViewModel = this.LJLIL;
                if (feedPromptViewModel == null || (gv0 = feedPromptViewModel.gv0()) == null || (num = gv0.getValue()) == null) {
                    num = 0;
                }
                if (num.intValue() >= 20) {
                    String str = this.LJLJI;
                    if (str == null) {
                        str = "panel";
                    }
                    C9UV.LIZ(_$_findCachedViewById(R.id.l4k), str);
                    C26244ARs.LJFF(str, "reach_limit");
                    return;
                }
            } else {
                return;
            }
        }
        ((SY4) _$_findCachedViewById(R.id.avq)).setButtonVariant(!z ? 1 : 0);
        ((SY4) _$_findCachedViewById(R.id.avq)).setEnabled(z);
        _$_findCachedViewById(R.id.avq).setClickable(z);
    }

    @Override // X.InterfaceC178146yw
    public final void y1(int i) {
        AnonymousClass723.LIZ().LIZ(i);
        wl(this.LJLJLLL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View _$_findCachedViewById;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLIL = C238299Wv.LIZ(mo49getActivity);
        }
        Bundle arguments = getArguments();
        Serializable serializable = null;
        if (arguments != null) {
            str = arguments.getString("source_page");
        } else {
            str = null;
        }
        this.LJLJI = str;
        _$_findCachedViewById(R.id.idx).setMinimumHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(60)));
        TextView textView = (TextView) _$_findCachedViewById(R.id.l4k);
        if (textView != null) {
            textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        }
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.l4k);
        if (textView2 != null) {
            textView2.addTextChangedListener(this.LJLLILLLL);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.l4k);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setOnTouchListener(new IDTListenerS114S0100000_4(this, 16));
        }
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.avq), new ACListenerS24S0100000_4(this, 303));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.isd);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.feed.prompt.panel.PromptTextEditFragment$initList$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
            public final boolean LJIL() {
                return false;
            }
        });
        C116754i7 c116754i7 = this.LJLILLLLZI;
        InterfaceC116774i9 interfaceC116774i9 = new InterfaceC116774i9() { // from class: X.9UT
            @Override // X.InterfaceC116774i9
            public final void LIZ(PromptStruct prompt, int i) {
                String str2;
                int i2;
                o.LJIIIZ(prompt, "prompt");
                Bundle arguments2 = PromptTextEditFragment.this.getArguments();
                if (arguments2 == null || (str2 = arguments2.getString("event_type")) == null) {
                    str2 = "homepage_hot";
                }
                String prompt2 = prompt.getPrompt();
                if (prompt2 == null) {
                    prompt2 = "";
                }
                C26244ARs.LIZ(i, str2, "input_page", prompt2);
                TextView textView3 = (TextView) PromptTextEditFragment.this._$_findCachedViewById(R.id.l4k);
                if (textView3 != null) {
                    textView3.setText(prompt.getPrompt());
                }
                EditText editText = (EditText) PromptTextEditFragment.this._$_findCachedViewById(R.id.l4k);
                if (editText != null) {
                    String prompt3 = prompt.getPrompt();
                    if (prompt3 != null) {
                        i2 = prompt3.length();
                    } else {
                        i2 = 0;
                    }
                    editText.setSelection(i2);
                }
            }

            @Override // X.InterfaceC116774i9
            public final void LIZIZ(PromptStruct prompt, int i) {
                String str2;
                o.LJIIIZ(prompt, "prompt");
                Bundle arguments2 = PromptTextEditFragment.this.getArguments();
                if (arguments2 == null || (str2 = arguments2.getString("event_type")) == null) {
                    str2 = "homepage_hot";
                }
                String prompt2 = prompt.getPrompt();
                if (prompt2 == null) {
                    prompt2 = "";
                }
                C26244ARs.LJII(i, str2, "input_page", prompt2);
            }
        };
        c116754i7.getClass();
        c116754i7.LJLILLLLZI = interfaceC116774i9;
        _$_findCachedViewById(R.id.idx).setVisibility(8);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("chosen_prompt");
        }
        if ((serializable instanceof PromptStruct) && (_$_findCachedViewById = _$_findCachedViewById(R.id.l4k)) != null) {
            _$_findCachedViewById.post(new ARunnableS23S0200000_4(this, serializable, 47));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ae5, viewGroup, false);
        this.LJLJJL = viewGroup;
        this.LJLJJLL = LLLLIILL;
        C7EL LIZIZ = AnonymousClass723.LIZ().LIZIZ(getContext(), this.LJLJJLL);
        this.LJLJL = LIZIZ;
        if (LIZIZ != null) {
            LIZIZ.LJLJLLL = this;
        }
        if (LIZIZ != null) {
            LIZIZ.show();
        }
        Context context = getContext();
        if (context != null) {
            int LJJJJJL = C63081OpJ.LJJJJJL(context);
            if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                layoutParams.height = (int) (LJJJJJL * 0.68d);
            }
        }
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
