package com.google.android.material.datepicker;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C40161hs;
import X.C76800UCe;
import X.C80191Vdb;
import X.C80265Ven;
import X.C80400Vgy;
import X.C80532Vj6;
import X.C80536VjA;
import X.C80537VjB;
import X.C80538VjC;
import X.C80540VjE;
import X.C80543VjH;
import X.C80546VjK;
import X.C80547VjL;
import X.C80557VjV;
import X.C90903hW;
import X.EnumC80555VjT;
import X.RunnableC80192Vdc;
import X.ViewOnClickListenerC13880ga;
import X.ViewOnClickListenerC80548VjM;
import X.ViewOnClickListenerC80550VjO;
import X.ViewOnClickListenerC80558VjW;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes15.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public int LJLILLLLZI;
    public DateSelector<S> LJLJI;
    public CalendarConstraints LJLJJI;
    public Month LJLJJL;
    public EnumC80555VjT LJLJJLL;
    public C80546VjK LJLJL;
    public RecyclerView LJLJLJ;
    public RecyclerView LJLJLLL;
    public View LJLL;
    public View LJLLI;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.LJLILLLLZI = bundle.getInt("THEME_RES_ID_KEY");
        this.LJLJI = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.LJLJJI = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.LJLJJL = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.LJLILLLLZI);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.LJLJI);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.LJLJJI);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.LJLJJL);
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public final boolean vl(C80532Vj6 c80532Vj6) {
        return super.vl(c80532Vj6);
    }

    public final void wl(Month month) {
        boolean z;
        C80540VjE c80540VjE = (C80540VjE) this.LJLJLLL.getAdapter();
        int LJIILIIL = c80540VjE.LJLILLLLZI.start.LJIILIIL(month);
        int LJIILIIL2 = LJIILIIL - c80540VjE.LJLILLLLZI.start.LJIILIIL(this.LJLJJL);
        boolean z2 = false;
        if (Math.abs(LJIILIIL2) > 3) {
            z = true;
        } else {
            z = false;
        }
        if (LJIILIIL2 > 0) {
            z2 = true;
        }
        this.LJLJJL = month;
        if (z) {
            if (z2) {
                this.LJLJLLL.LJLI(LJIILIIL - 3);
                this.LJLJLLL.post(new RunnableC80192Vdc(this, LJIILIIL));
                return;
            } else {
                this.LJLJLLL.LJLI(LJIILIIL + 3);
                this.LJLJLLL.post(new RunnableC80192Vdc(this, LJIILIIL));
                return;
            }
        }
        this.LJLJLLL.post(new RunnableC80192Vdc(this, LJIILIIL));
    }

    public final void xl(EnumC80555VjT enumC80555VjT) {
        this.LJLJJLL = enumC80555VjT;
        if (enumC80555VjT == EnumC80555VjT.YEAR) {
            this.LJLJLJ.getLayoutManager().LJZL(this.LJLJJL.LJLILLLLZI - ((C80538VjC) this.LJLJLJ.getAdapter()).LJLIL.LJLJJI.start.LJLILLLLZI);
            this.LJLL.setVisibility(0);
            this.LJLLI.setVisibility(8);
            return;
        }
        if (enumC80555VjT != EnumC80555VjT.DAY) {
            return;
        }
        this.LJLL.setVisibility(8);
        this.LJLLI.setVisibility(0);
        wl(this.LJLJJL);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.LJLILLLLZI);
        this.LJLJL = new C80546VjK(contextThemeWrapper);
        LayoutInflater cloneInContext = inflater.cloneInContext(contextThemeWrapper);
        Month month = this.LJLJJI.start;
        if (MaterialDatePicker.wl(contextThemeWrapper)) {
            i = R.layout.bu0;
            i2 = 1;
        } else {
            i = R.layout.btv;
            i2 = 0;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(cloneInContext, i, viewGroup, false);
        GridView gridView = (GridView) LLLLIILL.findViewById(R.id.go2);
        h0.LJIJI(gridView, new C80265Ven());
        gridView.setAdapter((ListAdapter) new C80543VjH());
        gridView.setNumColumns(month.LJLJI);
        gridView.setEnabled(false);
        this.LJLJLLL = (RecyclerView) LLLLIILL.findViewById(R.id.go5);
        getContext();
        this.LJLJLLL.setLayoutManager(new C80191Vdb(this, i2, i2));
        this.LJLJLLL.setTag("MONTHS_VIEW_GROUP_TAG");
        C80540VjE c80540VjE = new C80540VjE(contextThemeWrapper, this.LJLJI, this.LJLJJI, new C80557VjV(this));
        this.LJLJLLL.setAdapter(c80540VjE);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.br);
        RecyclerView recyclerView = (RecyclerView) LLLLIILL.findViewById(R.id.go8);
        this.LJLJLJ = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.LJLJLJ.setLayoutManager(new GridLayoutManager(integer, 1, false));
            this.LJLJLJ.setAdapter(new C80538VjC(this));
            this.LJLJLJ.LJII(new C80537VjB(this), -1);
        }
        if (LLLLIILL.findViewById(R.id.glx) != null) {
            C80400Vgy c80400Vgy = (C80400Vgy) LLLLIILL.findViewById(R.id.glx);
            c80400Vgy.setTag("SELECTOR_TOGGLE_TAG");
            h0.LJIJI(c80400Vgy, new C80536VjA(this));
            View findViewById = LLLLIILL.findViewById(R.id.glz);
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = LLLLIILL.findViewById(R.id.gly);
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.LJLL = LLLLIILL.findViewById(R.id.go8);
            this.LJLLI = LLLLIILL.findViewById(R.id.go1);
            xl(EnumC80555VjT.DAY);
            c80400Vgy.setText(this.LJLJJL.LJIIJ(LLLLIILL.getContext()));
            this.LJLJLLL.LJIIJJI(new C80547VjL(this, c80540VjE, c80400Vgy));
            c80400Vgy.setOnClickListener(new ViewOnClickListenerC13880ga(new ViewOnClickListenerC80558VjW(this)));
            findViewById2.setOnClickListener(new ViewOnClickListenerC13880ga(new ViewOnClickListenerC80548VjM(this, c80540VjE)));
            findViewById.setOnClickListener(new ViewOnClickListenerC13880ga(new ViewOnClickListenerC80550VjO(this, c80540VjE)));
        }
        if (!MaterialDatePicker.wl(contextThemeWrapper)) {
            new C40161hs().LIZIZ(this.LJLJLLL);
        }
        this.LJLJLLL.LJLI(c80540VjE.LJLILLLLZI.start.LJIILIIL(this.LJLJJL));
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
