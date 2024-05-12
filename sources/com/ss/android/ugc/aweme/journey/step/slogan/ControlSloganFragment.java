package com.ss.android.ugc.aweme.journey.step.slogan;

import X.C16880lQ;
import X.C16970lZ;
import X.C38874FNm;
import X.C73305Spp;
import X.EnumC40761FzB;
import X.G2E;
import X.G2I;
import X.G2J;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ControlSloganFragment extends SloganFragment {
    public static final /* synthetic */ int LJLLL = 0;
    public ImageView LJLL;
    public TuxTextView LJLLI;
    public C73305Spp LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment, com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
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

    public ControlSloganFragment() {
        G2J g2j;
        G2I LIZ = G2E.LIZ(EnumC40761FzB.JOURNEY_SLOGAN_ID);
        if (LIZ != null) {
            g2j = LIZ.LJLJLJ;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment
    public final void Al() {
        C73305Spp c73305Spp = this.LJLLILLLL;
        if (c73305Spp != null) {
            c73305Spp.LJFF();
        }
        C73305Spp c73305Spp2 = this.LJLLILLLL;
        if (c73305Spp2 == null) {
            return;
        }
        c73305Spp2.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment, com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C73305Spp c73305Spp = this.LJLLILLLL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        G2J g2j;
        G2J g2j2;
        EnumC40761FzB enumC40761FzB = EnumC40761FzB.JOURNEY_SLOGAN_ID;
        G2I LIZ = G2E.LIZ(enumC40761FzB);
        G2J g2j3 = null;
        if (LIZ != null) {
            g2j = LIZ.LJLJL;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        super.onResume();
        G2I LIZ2 = G2E.LIZ(enumC40761FzB);
        if (LIZ2 != null) {
            g2j2 = LIZ2.LJLJL;
        } else {
            g2j2 = null;
        }
        G2E.LIZIZ(g2j2);
        G2I LIZ3 = G2E.LIZ(enumC40761FzB);
        if (LIZ3 != null) {
            g2j3 = LIZ3.LJLJLJ;
        }
        G2E.LIZIZ(g2j3);
        G2E.LIZLLL(enumC40761FzB);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment
    public final View Dl(LayoutInflater inflater, ViewGroup viewGroup) {
        o.LJIIIZ(inflater, "inflater");
        if (C38874FNm.LIZ()) {
            try {
                return C16970lZ.LIZJ(R.layout.bf3, mo49getActivity(), viewGroup, false);
            } catch (Exception unused) {
                return C16880lQ.LLLLIILL(inflater, R.layout.bf3, viewGroup, false);
            }
        }
        return C16880lQ.LLLLIILL(inflater, R.layout.bf3, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    @Override // com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(final android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.journey.step.slogan.ControlSloganFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
