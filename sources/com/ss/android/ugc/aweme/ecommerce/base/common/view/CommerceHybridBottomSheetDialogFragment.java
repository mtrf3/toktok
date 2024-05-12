package com.ss.android.ugc.aweme.ecommerce.base.common.view;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C40127Fox;
import X.C40341FsP;
import X.C60466NoE;
import X.C60480NoS;
import X.C60484NoW;
import X.C76800UCe;
import X.C90903hW;
import X.DialogInterfaceOnKeyListenerC60481NoT;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CommerceHybridBottomSheetDialogFragment extends CommerceBottomSheetDialogFragment {
    public static final /* synthetic */ int LJLJJLL = 0;
    public C60484NoW LJLIL;
    public C60466NoE LJLILLLLZI;
    public boolean LJLJI;
    public final C60480NoS LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    static {
        new C40341FsP();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public CommerceHybridBottomSheetDialogFragment() {
        super(false, 1, null);
        this.LJLJJI = new C60480NoS(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventCenter.LJ().LIZIZ("ec_close_sheet", this.LJLJJI);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnKeyListener(new DialogInterfaceOnKeyListenerC60481NoT(this));
        return onCreateDialog;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Uri uri;
        Uri uri2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        boolean z = false;
        if (mo49getActivity != null) {
            C40127Fox.LIZ.getClass();
            if (C40127Fox.LIZ().enableSparkContainer) {
                ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.bs8);
                C60484NoW c60484NoW = new C60484NoW(mo49getActivity);
                this.LJLIL = c60484NoW;
                Bundle arguments = getArguments();
                if (arguments != null && (uri2 = (Uri) arguments.getParcelable("url")) != null) {
                    if (!uri2.getBooleanQueryParameter("enable_draggable", true)) {
                        c60484NoW.setDraggable(false);
                    }
                    c60484NoW.LIZLLL(mo49getActivity, uri2, false);
                }
                c60484NoW.LJLJJLL = this;
                viewGroup.addView(c60484NoW);
            } else {
                ViewGroup viewGroup2 = (ViewGroup) _$_findCachedViewById(R.id.bs8);
                C60466NoE c60466NoE = new C60466NoE(mo49getActivity);
                this.LJLILLLLZI = c60466NoE;
                Bundle arguments2 = getArguments();
                if (arguments2 != null && (uri = (Uri) arguments2.getParcelable("url")) != null) {
                    if (!uri.getBooleanQueryParameter("enable_draggable", true)) {
                        c60466NoE.setDraggable(false);
                    }
                    c60466NoE.LIZLLL(mo49getActivity, uri, false);
                }
                c60466NoE.LJLJJLL = this;
                viewGroup2.addView(c60466NoE);
            }
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z = arguments3.getBoolean("use_react_id_close");
        }
        this.LJLJI = z;
        EventCenter.LJ().LIZJ("ec_close_sheet", this.LJLJJI);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.y1, viewGroup, false);
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
