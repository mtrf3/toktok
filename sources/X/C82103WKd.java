package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.newtoolbar.widget.FixedSizeVerticalLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WKd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82103WKd extends C82102WKc {
    @Override // X.C82102WKc, com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        AbstractC030109x itemAnimator = LLJJIJIL().getItemAnimator();
        o.LJII(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((AbstractC28931Bp) itemAnimator).LJI = false;
        LLJJIII().setVisibility(8);
        LLJJIJIIJIL().setVisibility(8);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WKq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C82105WKf) obj).LIZLLL);
            }
        }, null, new AqS180S0100000_14(this, 281), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WKt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82105WKf) obj).LJ;
            }
        }, null, new AqS180S0100000_14(this, 270), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WKx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82105WKf) obj).LJI;
            }
        }, null, new AqS180S0100000_14(this, 272), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WL0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82105WKf) obj).LJII;
            }
        }, null, new AqS180S0100000_14(this, 273), 2, null);
        C57185McP LLJJIJIL = LLJJIJIL();
        C57185McP LLJJIJIL2 = LLJJIJIL();
        C82106WKg c82106WKg = new C82106WKg(this);
        if (getUiStates().LJ.LIZ.getPanelType() == 1) {
            i = 7;
        } else {
            i = 9;
        }
        LLJJIJIL.setLayoutManager(new FixedSizeVerticalLinearLayoutManager(LLJJIJIL2, c82106WKg, i, 24));
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        this.LJLJL = new C82036WHo(requireSceneContext, getUiStates().LJ.LIZIZ, getUiActions());
        LLJJIJIL().setAdapter(LLJILJIL());
        LLJJJIL();
    }

    @Override // X.C82102WKc, com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        View LLLLIILL;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (getUiStates().LJ.LIZ.getPanelType() == 1) {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.crv, container, false);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cs7, container, false);
        }
        View findViewById = LLLLIILL.findViewById(R.id.g7k);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.load_more_container)");
        this.LJLJJI = (FrameLayout) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.k4h);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.slide_region)");
        this.LJLIL = (C57185McP) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.dbj);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.fixed_region)");
        this.LJLILLLLZI = (C57185McP) findViewById3;
        View findViewById4 = LLLLIILL.findViewById(R.id.fs0);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.line_between)");
        this.LJLJJLL = findViewById4;
        View findViewById5 = LLLLIILL.findViewById(R.id.ldk);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.toolbar_more_icon)");
        this.LJLJJL = (ImageView) findViewById5;
        View findViewById6 = LLLLIILL.findViewById(R.id.lcv);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.toolbar_container)");
        this.LJLJI = (LinearLayout) findViewById6;
        return (ViewGroup) LLLLIILL;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
