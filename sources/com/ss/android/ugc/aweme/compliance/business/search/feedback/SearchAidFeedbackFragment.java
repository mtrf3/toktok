package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.ASQ;
import X.ASY;
import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.FMX;
import X.GBM;
import X.InterfaceC219588ja;
import X.SY4;
import X.T5T;
import Y.ACListenerS42S0200000_7;
import Y.IDObjectS121S0200000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SearchAidFeedbackFragment extends Fragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJLLI = 0;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 83));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 86));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 81));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 77));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 79));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 85));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 80));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 82));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 84));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS157S0100000_7(this, 78));
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    public final QuestionData vl() {
        return (QuestionData) this.LJLJL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        MutableLiveData<Boolean> mutableLiveData;
        super.onDestroy();
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) this.LJLJLLL.getValue();
        if (searchStateViewModel == null || (mutableLiveData = searchStateViewModel.shouldBlockMediaPlay) == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.FALSE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        MutableLiveData<Boolean> mutableLiveData;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (vl() == null) {
            ASQ.LJ(this, ASY.LIZ);
            return;
        }
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) this.LJLJLLL.getValue();
        String str4 = null;
        if (searchStateViewModel != null && (mutableLiveData = searchStateViewModel.shouldBlockMediaPlay) != null) {
            mutableLiveData.setValue(Boolean.TRUE);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("search_id", (String) this.LJLIL.getValue());
        c188727au.LJIIIZ("channel", (String) this.LJLJJI.getValue());
        c188727au.LJIIIZ("search_aid_issue_name", (String) this.LJLJJL.getValue());
        c188727au.LJIIIZ("survey_source_page", (String) this.LJLJJLL.getValue());
        FMX.LJIIL("survey_page_display", c188727au.LIZ);
        SY4 sy4 = (SY4) _$_findCachedViewById(R.id.kpi);
        sy4.getClass();
        C16880lQ.LJJIZ(sy4, new ACListenerS42S0200000_7(this, sy4, 1));
        TextView textView = (TextView) _$_findCachedViewById(R.id.title);
        QuestionData vl = vl();
        if (vl != null) {
            str = vl.getTitle();
        } else {
            str = null;
        }
        textView.setText(str);
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.desc);
        QuestionData vl2 = vl();
        if (vl2 != null) {
            str2 = vl2.getDesc();
        } else {
            str2 = null;
        }
        textView2.setText(str2);
        TextView textView3 = (TextView) _$_findCachedViewById(R.id.e5i);
        QuestionData vl3 = vl();
        if (vl3 != null) {
            str3 = vl3.getHint();
        } else {
            str3 = null;
        }
        textView3.setText(str3);
        T5T t5t = (T5T) _$_findCachedViewById(R.id.eno);
        QuestionData vl4 = vl();
        if (vl4 != null) {
            str4 = vl4.getPlaceholder();
        }
        t5t.setHint(str4);
        t5t.addTextChangedListener(new IDObjectS121S0200000_7(t5t, this, 0));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.ftq);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext(), 0);
        flexboxLayoutManager.LLIZLLLIL(1);
        flexboxLayoutManager.LLIZ(0);
        flexboxLayoutManager.LLILZLL(4);
        flexboxLayoutManager.LLJ(0);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.setAdapter((AbstractC029409q) this.LJLJLJ.getValue());
        ((GBM) this.LJLJLJ.getValue()).LJLJI = new AqS173S0100000_7(this, 57);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ag2, viewGroup, false);
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
