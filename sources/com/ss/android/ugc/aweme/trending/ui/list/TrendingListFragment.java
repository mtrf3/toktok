package com.ss.android.ugc.aweme.trending.ui.list;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78496UrM;
import X.C90903hW;
import X.JVD;
import X.MBO;
import X.SYL;
import Y.ACListenerS29S0100000_9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TrendingListFragment extends Fragment {
    public String LJLIL;
    public MBO LJLILLLLZI;
    public List<TrendingEventModel> LJLJI;
    public String LJLJJI;
    public SYL LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public int LJLJLLL;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public boolean LJLJLJ = true;
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 671));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 673));

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r3.getEventId()) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vl() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.trending.ui.list.TrendingListFragment.vl():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        vl();
        this.LJLJLJ = false;
        SYL syl = this.LJLJJL;
        if (syl != null) {
            int height = syl.getHeight();
            this.LJLJLLL = height;
            if (height <= 0) {
                SYL syl2 = this.LJLJJL;
                if (syl2 != null) {
                    JVD.LIZIZ(syl2, new AqS159S0100000_9(this, 672));
                    return;
                } else {
                    o.LJIJI("powerList");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("powerList");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.ctx, viewGroup, false, "view");
        View findViewById = LIZIZ.findViewById(R.id.ll6);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.trending_sheet_list)");
        SYL syl = (SYL) findViewById;
        this.LJLJJL = syl;
        syl.LLLF.LJZL(TrendingSheetCell.class, TrendingSheetRichCell.class);
        View findViewById2 = LIZIZ.findViewById(R.id.ll5);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.t…nding_sheet_close_button)");
        this.LJLJJLL = findViewById2;
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 95), findViewById2);
        View findViewById3 = LIZIZ.findViewById(R.id.lky);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.trending_question_button)");
        this.LJLJL = findViewById3;
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 96), findViewById3);
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
