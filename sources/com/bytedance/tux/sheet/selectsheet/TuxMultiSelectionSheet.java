package com.bytedance.tux.sheet.selectsheet;

import X.AbstractC26257ASf;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C235119Kp;
import X.C252709vu;
import X.C253159wd;
import X.C253179wf;
import X.C26255ASd;
import X.C26338AVi;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C74291TDr;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.O6R;
import X.SY4;
import Y.ACListenerS24S0100000_4;
import Y.ARunnableS8S0101000_4;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.sheet.BaseSheet;
import com.bytedance.tux.sheet.selectsheet.TuxMultiSelectionSheet;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TuxMultiSelectionSheet extends BaseSheet {
    public C235119Kp LJLLI;
    public int LJLLILLLL;
    public List<C253179wf> LJLLL;
    public InterfaceC88471Ynr<? super Integer, ? super C253179wf, C76800UCe> LJLLLL;
    public InterfaceC88472Yns<? super List<C253179wf>, C76800UCe> LJLLLLLL;
    public String LJLZ;
    public final Map<Integer, View> LJZ = new LinkedHashMap();
    public final int LJLLJ = -1;

    @Override // com.bytedance.tux.sheet.BaseSheet
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZ).clear();
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        Context context = getContext();
        View view = null;
        if (context != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.p6, R.attr.p7, R.attr.p8}, R.attr.k9, 0);
            o.LJIIIIZZ(obtainStyledAttributes, "ctx.obtainStyledAttribut…onSheetStyle, 0\n        )");
            int i = obtainStyledAttributes.getInt(1, 0);
            int i2 = obtainStyledAttributes.getInt(2, 0);
            String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 0);
            if (LLLZLZ == null) {
                LLLZLZ = "";
            }
            obtainStyledAttributes.recycle();
            view = C16880lQ.LLLLIILL(inflater, R.layout.cg, viewGroup, false);
            C74291TDr c74291TDr = (C74291TDr) view.findViewById(R.id.ilw);
            float f = BaseSheet.LJLL;
            c74291TDr.LIZ(f, f, 0.0f, 0.0f);
            C26255ASd c26255ASd = (C26255ASd) view.findViewById(R.id.jm6);
            c26255ASd.setFixedHeightPx(this.LJLLJ);
            c26255ASd.setVariant(this.LJLLILLLL);
            c26255ASd.setDismissFunc(new AqS154S0100000_4(this, 29));
            c26255ASd.setBottomSheetCallback(new AbstractC26257ASf() { // from class: X.9wb
                @Override // X.AbstractC26257ASf
                public final void LIZIZ(int i3, View bottomSheet) {
                    o.LJIIIZ(bottomSheet, "bottomSheet");
                }

                @Override // X.AbstractC26257ASf
                public final void LIZ(View bottomSheet, float f2) {
                    Dialog dialog;
                    Window window2;
                    o.LJIIIZ(bottomSheet, "bottomSheet");
                    if (f2 <= 0.0f && (dialog = TuxMultiSelectionSheet.this.getDialog()) != null && (window2 = dialog.getWindow()) != null) {
                        window2.setDimAmount((1 + f2) * 0.5f);
                    }
                }
            });
            C252709vu c252709vu = (C252709vu) view.findViewById(R.id.jlu);
            C235119Kp c235119Kp = this.LJLLI;
            if (c235119Kp != null && c252709vu != null) {
                c252709vu.setNavActions(c235119Kp);
            }
            Dialog dialog = getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.addFlags(2);
                window.setDimAmount(0.5f);
            }
            List<C253179wf> list = this.LJLLL;
            if (list != null) {
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.jm4);
                getContext();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                recyclerView.setLayoutManager(linearLayoutManager);
                Iterator<C253179wf> it = list.iterator();
                int i3 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().LIZJ) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                recyclerView.setAdapter(new C253159wd(list, this.LJLLLL));
                C26338AVi.LJIIIZ(recyclerView, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(76))), 23);
                recyclerView.post(new ARunnableS8S0101000_4(i3, linearLayoutManager, 0));
            }
            SY4 sy4 = (SY4) view.findViewById(R.id.jl5);
            sy4.setVisibility(0);
            sy4.setButtonSize(i);
            sy4.setButtonVariant(i2);
            String str = this.LJLZ;
            if (str != null) {
                LLLZLZ = str;
            }
            sy4.setText(LLLZLZ);
            C16880lQ.LJJIZ(sy4, new ACListenerS24S0100000_4(this, 14));
        }
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                } else {
                    c29s = null;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return view;
    }
}
