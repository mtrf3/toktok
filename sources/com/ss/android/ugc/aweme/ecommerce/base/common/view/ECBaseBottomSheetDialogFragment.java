package com.ss.android.ugc.aweme.ecommerce.base.common.view;

import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C238659Yf;
import X.C3C5;
import X.C70567Rml;
import X.C70853RrN;
import X.C70858RrS;
import X.C76800UCe;
import X.C78929UyL;
import X.C79234V7u;
import X.DialogC27439Apn;
import X.InterfaceC27438Apm;
import X.InterfaceC71003Rtn;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.router.Strategy;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ECBaseBottomSheetDialogFragment extends BottomSheetDialogFragment implements InterfaceC27438Apm {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public boolean downgrade() {
        return false;
    }

    @Override // X.InterfaceC37828Esy
    public String getPageNameKey() {
        return "page_name";
    }

    public Strategy getTheStrategy() {
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        com_ss_android_ugc_aweme_ecommerce_base_common_view_ECBaseBottomSheetDialogFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyDialogOnStart(this);
    }

    private final boolean shouldDowngrade() {
        if (downgrade()) {
            C238659Yf.LIZ.getClass();
            if (C238659Yf.LIZ()) {
                return true;
            }
        }
        return false;
    }

    public void com_ss_android_ugc_aweme_ecommerce_base_common_view_ECBaseBottomSheetDialogFragment__onStart$___twin___() {
        Window window;
        C76800UCe c76800UCe;
        Window window2;
        try {
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        if (shouldDowngrade()) {
            Dialog dialog = getDialog();
            if (dialog != null && (window2 = dialog.getWindow()) != null) {
                window2.setWindowAnimations(R.style.a61);
                c76800UCe = C76800UCe.LIZ;
                C3C5.m7constructorimpl(c76800UCe);
                super.onStart();
            }
            c76800UCe = null;
            C3C5.m7constructorimpl(c76800UCe);
            super.onStart();
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setWindowAnimations(R.style.a5w);
            c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            super.onStart();
        }
        c76800UCe = null;
        C3C5.m7constructorimpl(c76800UCe);
        super.onStart();
    }

    @Override // X.InterfaceC37828Esy
    public String getPageName() {
        return C16880lQ.LJLLJ(getClass());
    }

    @Override // X.InterfaceC71003Rtn
    public InterfaceC71003Rtn preTrackNode() {
        return C79234V7u.LJIILL(this);
    }

    @Override // X.InterfaceC37828Esy
    public Map<String, String> getMapRule() {
        return C70567Rml.LIZIZ;
    }

    @Override // X.InterfaceC71003Rtn
    public List<String> getRegisteredLane() {
        return C70567Rml.LIZ;
    }

    public static void com_ss_android_ugc_aweme_ecommerce_base_common_view_ECBaseBottomSheetDialogFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyDialogOnStart(ECBaseBottomSheetDialogFragment eCBaseBottomSheetDialogFragment) {
        Window window;
        View decorView;
        eCBaseBottomSheetDialogFragment.com_ss_android_ugc_aweme_ecommerce_base_common_view_ECBaseBottomSheetDialogFragment__onStart$___twin___();
        Dialog dialog = eCBaseBottomSheetDialogFragment.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, eCBaseBottomSheetDialogFragment);
            ViewTreeViewModelStoreOwner.set(decorView, eCBaseBottomSheetDialogFragment);
            C10A.LIZIZ(decorView, eCBaseBottomSheetDialogFragment);
        }
    }

    @Override // X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public void fillNodeParams(C70858RrS params) {
        o.LJIIIZ(params, "params");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C78929UyL.LJIJI(this);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        o.LJI(context);
        DialogC27439Apn dialogC27439Apn = new DialogC27439Apn(context, getTheme());
        Strategy theStrategy = getTheStrategy();
        if (theStrategy != null) {
            dialogC27439Apn.LJLJLLL = theStrategy;
        }
        return dialogC27439Apn;
    }

    @Override // X.InterfaceC27438Apm
    public boolean onDetectBlank(Map<String, String> params) {
        o.LJIIIZ(params, "params");
        return false;
    }

    public void trackFirstScreen(View view) {
        o.LJIIIZ(view, "view");
        C70853RrN.LIZJ(this, view);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C70853RrN.LIZIZ(this, view, null, 2);
        trackFirstScreen(view);
    }

    @Override // X.InterfaceC27538ArO
    public void setupTrack(View view, LifecycleOwner lifecycleOwner) {
        C70853RrN.LIZ(this, view, lifecycleOwner);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager manager, String str) {
        o.LJIIIZ(manager, "manager");
        if (!manager.mDestroyed && !manager.LJJJLZIJ()) {
            super.show(manager, str);
        }
    }
}
