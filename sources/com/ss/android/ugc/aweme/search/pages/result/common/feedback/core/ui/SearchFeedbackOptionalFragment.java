package com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C110614Vt;
import X.C119774mz;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C234529Ii;
import X.C235119Kp;
import X.C26338AVi;
import X.C29S;
import X.C3C5;
import X.C47261Igj;
import X.C61328O5c;
import X.C72434Sbm;
import X.C76800UCe;
import X.C7MY;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import X.JYG;
import X.KT1;
import X.ORZ;
import X.SY9;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS125S0300000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.IDqS37S0300000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchFeedbackOptionalFragment extends Fragment implements InterfaceC219588ja {
    public JYG LJLIL;
    public View LJLILLLLZI;
    public TuxTextView LJLJI;
    public C119774mz LJLJJI;
    public ConstraintLayout LJLJJL;
    public TuxTextView LJLJJLL;
    public C72434Sbm LJLJL;
    public SmartImageView LJLJLJ;
    public TuxTextView LJLJLLL;
    public List<FeedbackMultipleChoice> LJLL;
    public IDqS37S0300000_8 LJLLI;
    public AqS125S0300000_8 LJLLILLLL;

    public SearchFeedbackOptionalFragment() {
        new LinkedHashMap();
        this.LJLL = new ArrayList();
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        String str;
        Resources resources;
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null || (str = resources.getString(R.string.wj)) == null) {
            str = "";
        }
        c9kf.LIZJ = str;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark;
        LIZJ.LIZIZ(new AqS158S0100000_8(this, 231));
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Serializable serializable = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("search_feedback_model");
        }
        o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.model.SearchFeedbackModel");
        JYG jyg = (JYG) serializable;
        this.LJLIL = jyg;
        List<FeedbackMultipleChoice> multipleChoices = jyg.getMultipleChoices();
        if (multipleChoices != null && (!multipleChoices.isEmpty())) {
            List<FeedbackMultipleChoice> LLJILJILJ = ORZ.LLJILJILJ(C47261Igj.LJJJIL(ORZ.LLILLL(multipleChoices, multipleChoices.size() - 1)));
            this.LJLL = LLJILJILJ;
            LLJILJILJ.add(ORZ.LLFF(multipleChoices));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0324, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r0.getFeedbackType()) != false) goto L131;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void vl(SmartImageView smartImageView, String str) {
        boolean LJ;
        Context context = getContext();
        if (context != null) {
            if (o.LJ(str, KT1.RECOMMEND_USER.getValue())) {
                LJ = true;
            } else {
                LJ = o.LJ(str, KT1.USER.getValue());
            }
            if (LJ) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_color_default_avatar;
                c2068389v.LIZIZ = C7MY.LIZIZ(48);
                c2068389v.LIZJ = C7MY.LIZIZ(48);
                smartImageView.setBackground(c2068389v.LIZ(context));
                return;
            }
            if (o.LJ(str, KT1.POI.getValue())) {
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_map_pin_fill;
                c2068389v2.LIZIZ = C7MY.LIZIZ(20);
                c2068389v2.LIZJ = C7MY.LIZIZ(20);
                c2068389v2.LJ = Integer.valueOf(R.attr.gu);
                SY9 LIZ = c2068389v2.LIZ(context);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.cv);
                c110614Vt.LJII = C7MY.LIZIZ(48);
                c110614Vt.LJI = C7MY.LIZIZ(48);
                c110614Vt.LIZJ = C61328O5c.LIZJ(2);
                smartImageView.setBackground(C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context)));
                return;
            }
            C2068389v c2068389v3 = new C2068389v();
            c2068389v3.LIZ = R.raw.icon_tiktok_logo;
            c2068389v3.LIZIZ = C7MY.LIZIZ(24);
            c2068389v3.LIZJ = C7MY.LIZIZ(24);
            c2068389v3.LJ = Integer.valueOf(R.attr.dz);
            SY9 LIZ2 = c2068389v3.LIZ(context);
            C110614Vt c110614Vt2 = new C110614Vt();
            c110614Vt2.LIZIZ = Integer.valueOf(R.attr.cv);
            c110614Vt2.LJII = C7MY.LIZIZ(42);
            c110614Vt2.LJI = C7MY.LIZIZ(56);
            c110614Vt2.LIZJ = C61328O5c.LIZJ(2);
            smartImageView.setBackground(C26338AVi.LJIIJ(LIZ2, c110614Vt2.LIZ(context)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        o.LJI(viewGroup);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater.cloneInContext(viewGroup.getContext()), R.layout.ciq, viewGroup, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.cloneInContext(…layout, container, false)");
        this.LJLILLLLZI = LLLLIILL;
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}
