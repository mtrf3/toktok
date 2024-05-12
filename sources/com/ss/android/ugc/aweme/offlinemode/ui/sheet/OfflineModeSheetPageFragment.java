package com.ss.android.ugc.aweme.offlinemode.ui.sheet;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C2068389v;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C221138m5;
import X.C235119Kp;
import X.C236479Pv;
import X.C236509Py;
import X.C26222AQw;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C8VV;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.C9Q0;
import X.C9Q1;
import X.C9S3;
import X.InterfaceC219588ja;
import X.InterfaceC25830ABu;
import X.KR8;
import X.X1D;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OfflineModeSheetPageFragment extends Fragment implements InterfaceC219588ja, InterfaceC25830ABu {
    public static final C26222AQw LJLJJLL = new C26222AQw("SheetPageFragment");
    public final C214298b3 LJLIL;
    public final C221138m5 LJLILLLLZI;
    public final C221138m5 LJLJI;
    public final C2068389v LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // X.InterfaceC25830ABu
    public final void I7(TuxSheet sheet, float f) {
        o.LJIIIZ(sheet, "sheet");
    }

    @Override // X.InterfaceC25830ABu
    public final void Pg(TuxSheet sheet, int i) {
        o.LJIIIZ(sheet, "sheet");
    }

    public OfflineModeSheetPageFragment() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(OfflineModeManagerVM.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 522);
        C236479Pv c236479Pv = C236479Pv.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c236479Pv, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c236479Pv, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = KR8.LJIIJJI(new C9Q0(this));
        this.LJLJI = KR8.LJIIJJI(new AqS154S0100000_4(this, 521));
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_x_mark_small;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        this.LJLJJI = c2068389v;
    }

    @Override // X.InterfaceC25830ABu
    public final boolean LJIIJ() {
        C9Q1 c9q1;
        C26222AQw c26222AQw = LJLJJLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBackPress isResumed ");
        LIZ.append(isResumed());
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ));
        if (!isResumed() || (c9q1 = ((C9S3) ((AssemViewModel) this.LJLIL.getValue()).getState()).LJLJL) == null || !c9q1.getWithBack()) {
            return false;
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LJLIL.getValue();
        OfflineModeManagerVM.LJLJJI.LIZ(null, "sendBackPressEvent");
        assemViewModel.setState(C236509Py.LJLIL);
        return true;
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 520));
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS151S0200000_4(this, LIZIZ, 13));
        C62822Ol8 LIZIZ3 = C221108m2.LIZIZ(new AqS151S0200000_4(this, LIZIZ, 14));
        C9Q1 c9q1 = (C9Q1) this.LJLILLLLZI.getValue();
        if (c9q1 != null && c9q1.getWithBack()) {
            return (C235119Kp) LIZIZ3.getValue();
        }
        return (C235119Kp) LIZIZ2.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        LJLJJLL.LIZ(this, "[onDestroy]");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        LJLJJLL.LIZ(this, "[onDestroyView]");
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        LJLJJLL.LIZ(this.LJLILLLLZI.getValue(), "[onViewCreated]");
        C9Q1 c9q1 = (C9Q1) this.LJLILLLLZI.getValue();
        if (c9q1 != null) {
            C8VV.LIZ(this, false, new AqS108S0300000_4(this, view, c9q1, 17));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        o.LJIIIZ(inflater, "inflater");
        LJLJJLL.LIZ(this, "[onCreateView]");
        if (this.LJLILLLLZI.getValue() == C9Q1.OFFLINE_MODE_PANEL) {
            i = R.layout.byy;
        } else {
            i = R.layout.byz;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, viewGroup, false);
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
