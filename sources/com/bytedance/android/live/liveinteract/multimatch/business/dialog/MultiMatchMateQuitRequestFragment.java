package com.bytedance.android.live.liveinteract.multimatch.business.dialog;

import X.AbstractC76249TwD;
import X.ActivityC45651qj;
import X.C05170If;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15640jQ;
import X.C16880lQ;
import X.C29S;
import X.C2A7;
import X.C3C5;
import X.C41051jJ;
import X.C47061t0;
import X.C47121t6;
import X.C75768ToS;
import X.C75883TqJ;
import X.C76029Tsf;
import X.C76244Tw8;
import X.C76265TwT;
import X.C76800UCe;
import X.C90903hW;
import X.EnumC76178Tv4;
import X.InterfaceC75477Tjl;
import Y.ACListenerS33S0100000_13;
import Y.IDCListenerS209S0100000_13;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchMateQuitRequestContract$AbsView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiMatchMateQuitRequestFragment extends MultiMatchMateQuitRequestContract$AbsView {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public C47061t0 LJLJJL;
    public C47121t6 LJLJJLL;
    public C47121t6 LJLJL;
    public C41051jJ LJLJLJ;
    public C2A7 LJLJLLL;
    public C2A7 LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    @Override // com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchMateQuitRequestContract$AbsView
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchMateQuitRequestContract$AbsView, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchMateQuitRequestContract$AbsView
    public final void dismiss() {
        InterfaceC75477Tjl interfaceC75477Tjl = this.LJLIL;
        if (interfaceC75477Tjl != null) {
            interfaceC75477Tjl.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C76029Tsf vl() {
        C76029Tsf c76029Tsf = new C76029Tsf();
        c76029Tsf.LJFF = false;
        c76029Tsf.LJIIIIZZ = false;
        return c76029Tsf;
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchMateQuitRequestContract$AbsView
    public final boolean wl() {
        C41051jJ c41051jJ = this.LJLJLJ;
        if (c41051jJ == null || !c41051jJ.isChecked()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AbstractC76249TwD abstractC76249TwD = (AbstractC76249TwD) this.LJLILLLLZI;
        if (abstractC76249TwD != null) {
            abstractC76249TwD.LJ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchMateQuitRequestContract$AbsView
    public final void xl(long j) {
        C2A7 c2a7 = this.LJLJLLL;
        if (c2a7 == null) {
            return;
        }
        c2a7.setText(C15380j0.LJIILL(R.string.khz, Long.valueOf(j)));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C75768ToS c75768ToS;
        ImageModel imageModel;
        String str;
        C47121t6 c47121t6;
        C76244Tw8 LJFF;
        C75883TqJ c75883TqJ;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        AbstractC76249TwD abstractC76249TwD = (AbstractC76249TwD) this.LJLILLLLZI;
        if (abstractC76249TwD != null) {
            abstractC76249TwD.LIZLLL();
        }
        AbstractC76249TwD abstractC76249TwD2 = (AbstractC76249TwD) this.LJLILLLLZI;
        String str2 = null;
        if (abstractC76249TwD2 != null && (LJFF = abstractC76249TwD2.LJFF()) != null && (c75883TqJ = LJFF.LJII) != null) {
            c75768ToS = c75883TqJ.LJIIZILJ;
        } else {
            c75768ToS = null;
        }
        C47061t0 c47061t0 = this.LJLJJL;
        if (c75768ToS != null) {
            imageModel = c75768ToS.LIZJ;
        } else {
            imageModel = null;
        }
        C15640jQ.LJIIIIZZ(c47061t0, imageModel);
        C47121t6 c47121t62 = this.LJLJJLL;
        if (c47121t62 != null) {
            Object[] objArr = new Object[1];
            if (c75768ToS != null) {
                str = c75768ToS.LIZ;
                str2 = c75768ToS.LIZIZ;
            } else {
                str = null;
            }
            objArr[0] = C05170If.LIZIZ(str, str2);
            c47121t62.setText(C15380j0.LJIILL(R.string.myh, objArr));
        }
        if (C76265TwT.LIZ.LJ() != EnumC76178Tv4.PUNISH || (c47121t6 = this.LJLJL) == null) {
            return;
        }
        c47121t6.setText(C15380j0.LJIILJJIL(R.string.myf));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.czk, viewGroup, false);
        this.LJLJJL = (C47061t0) LLLLIILL.findViewById(R.id.acf);
        this.LJLJJLL = (C47121t6) LLLLIILL.findViewById(R.id.ixr);
        this.LJLJL = (C47121t6) LLLLIILL.findViewById(R.id.ixo);
        C41051jJ c41051jJ = (C41051jJ) LLLLIILL.findViewById(R.id.a18);
        this.LJLJLJ = c41051jJ;
        if (c41051jJ != null) {
            c41051jJ.setOnCheckedChangeListener(new IDCListenerS209S0100000_13(this, 4));
        }
        C2A7 c2a7 = (C2A7) LLLLIILL.findViewById(R.id.iu6);
        this.LJLJLLL = c2a7;
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS33S0100000_13(this, 52));
        }
        C2A7 c2a72 = (C2A7) LLLLIILL.findViewById(R.id.a6z);
        this.LJLL = c2a72;
        if (c2a72 != null) {
            C16880lQ.LJJIII(c2a72, new ACListenerS33S0100000_13(this, 53));
        }
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
