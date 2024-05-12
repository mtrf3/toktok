package com.ss.android.ugc.aweme.ecommerce.base.common.view;

import X.C10A;
import X.C16880lQ;
import X.C1AU;
import X.C27162AlK;
import X.C27441App;
import X.C27442Apq;
import X.C27444Aps;
import X.C76800UCe;
import X.DialogInterfaceOnKeyListenerC27443Apr;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.LTT;
import Y.ACListenerS24S0100000_4;
import Y.ARunnableS40S0100000_4;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class CommerceBottomSheetDialogFragment extends ECBaseBottomSheetDialogFragment {
    public static final C27444Aps Companion = new C27444Aps();
    public Map<Integer, View> _$_findViewCache;
    public Integer bottomSheetHeight;
    public final boolean debounce;
    public long enterTime;
    public Boolean isHideable;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> keyBoardListener;
    public KeyBoardVisibilityUtil keyBoardVisibilityUtils;
    public Boolean needsDim;
    public InterfaceC65784Pro<C76800UCe> onBackListener;

    public CommerceBottomSheetDialogFragment() {
        this(false, 1, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
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

    public boolean enableDragClose() {
        return true;
    }

    public Integer getDialogHeight() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        com_ss_android_ugc_aweme_ecommerce_base_common_view_CommerceBottomSheetDialogFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyDialogOnStart(this);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (this.mCancelable) {
            super.dismiss();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (this.mCancelable) {
            super.dismissAllowingStateLoss();
        }
    }

    public final Boolean getKeyBoardVisibility() {
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.keyBoardVisibilityUtils;
        if (keyBoardVisibilityUtil != null) {
            return Boolean.valueOf(keyBoardVisibilityUtil.LJLJJI);
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        if (o.LJ(this.needsDim, Boolean.FALSE)) {
            return R.style.a5y;
        }
        return R.style.a5x;
    }

    private final void setupBottomSheetUI() {
        float f;
        int intValue;
        View view;
        Bundle arguments = getArguments();
        if (arguments != null) {
            intValue = arguments.getInt("height");
            if (intValue == 0) {
                f = C27162AlK.LIZJ;
                intValue = (int) f;
            }
        } else {
            Integer num = this.bottomSheetHeight;
            if (num != null) {
                intValue = num.intValue();
            } else {
                f = C27162AlK.LIZJ;
                intValue = (int) f;
            }
        }
        View view2 = getView();
        Object obj = null;
        if (view2 != null) {
            obj = view2.getParent();
        }
        if ((obj instanceof View) && (view = (View) obj) != null) {
            view.setBackgroundResource(R.drawable.ab5);
        }
        setupBottomSheetHeight(intValue);
    }

    private final void setupDialogHeight() {
        Integer dialogHeight = getDialogHeight();
        if (dialogHeight != null) {
            int intValue = dialogHeight.intValue();
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putInt("height", intValue);
            }
            this.bottomSheetHeight = Integer.valueOf(intValue);
        }
    }

    public void com_ss_android_ugc_aweme_ecommerce_base_common_view_CommerceBottomSheetDialogFragment__onStart$___twin___() {
        this.enterTime = SystemClock.elapsedRealtime();
        super.onStart();
    }

    public final long getStayDuration() {
        return SystemClock.elapsedRealtime() - this.enterTime;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.keyBoardVisibilityUtils;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.LIZ();
        }
        this.keyBoardVisibilityUtils = null;
    }

    public CommerceBottomSheetDialogFragment(boolean z) {
        this._$_findViewCache = new LinkedHashMap();
        this.debounce = z;
        setCancelable(!z);
        this.enterTime = SystemClock.elapsedRealtime();
    }

    private final void behaviorProcess(BottomSheetBehavior<View> bottomSheetBehavior) {
        if (!enableDragClose() && bottomSheetBehavior != null) {
            bottomSheetBehavior.setBottomSheetCallback(new C27441App(bottomSheetBehavior));
        }
    }

    public static void com_ss_android_ugc_aweme_ecommerce_base_common_view_CommerceBottomSheetDialogFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyDialogOnStart(CommerceBottomSheetDialogFragment commerceBottomSheetDialogFragment) {
        Window window;
        View decorView;
        commerceBottomSheetDialogFragment.com_ss_android_ugc_aweme_ecommerce_base_common_view_CommerceBottomSheetDialogFragment__onStart$___twin___();
        Dialog dialog = commerceBottomSheetDialogFragment.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, commerceBottomSheetDialogFragment);
            ViewTreeViewModelStoreOwner.set(decorView, commerceBottomSheetDialogFragment);
            C10A.LIZIZ(decorView, commerceBottomSheetDialogFragment);
        }
    }

    public static final void onActivityCreated$checkKeyBoardAndDismiss(CommerceBottomSheetDialogFragment commerceBottomSheetDialogFragment) {
        Object obj;
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = commerceBottomSheetDialogFragment.keyBoardVisibilityUtils;
        if (keyBoardVisibilityUtil != null) {
            if (keyBoardVisibilityUtil.LJLJJI) {
                Context context = commerceBottomSheetDialogFragment.getContext();
                IBinder iBinder = null;
                if (context != null) {
                    obj = C16880lQ.LLILL(context, "input_method");
                } else {
                    obj = null;
                }
                o.LJII(obj, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager = (InputMethodManager) obj;
                View view = commerceBottomSheetDialogFragment.getView();
                if (view != null) {
                    iBinder = view.getWindowToken();
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                return;
            }
            commerceBottomSheetDialogFragment.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        View view;
        View findViewById;
        ViewParent parent;
        C1AU c1au;
        Window window;
        setupDialogHeight();
        super.onActivityCreated(bundle);
        setupBottomSheetUI();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            LTT.LIZLLL(window);
        }
        if (this.keyBoardListener != null) {
            Context context = getContext();
            Object obj = null;
            if ((context instanceof C1AU) && (c1au = (C1AU) context) != null) {
                this.keyBoardVisibilityUtils = new KeyBoardVisibilityUtil(c1au, 32, new AqS186S0100000_4(this, 26));
            }
            View view2 = getView();
            if (view2 != null && (parent = view2.getParent()) != null) {
                obj = parent.getParent();
            }
            if ((obj instanceof View) && (view = (View) obj) != null && (findViewById = view.findViewById(R.id.liz)) != null) {
                C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 52), findViewById);
            }
            Dialog dialog2 = getDialog();
            if (dialog2 != null) {
                dialog2.setOnKeyListener(new DialogInterfaceOnKeyListenerC27443Apr(this));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Boolean bool;
        super.onCreate(bundle);
        if (bundle != null) {
            setCancelable(true);
            dismissAllowingStateLoss();
        }
        if (this.debounce) {
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS40S0100000_4(this, 28), 450L);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            bool = Boolean.valueOf(arguments.getBoolean("needs_dim", true));
        } else {
            bool = null;
        }
        this.needsDim = bool;
    }

    public final void setBottomSheetHideable(boolean z) {
        View view;
        this.isHideable = Boolean.valueOf(z);
        View view2 = getView();
        Object obj = null;
        if (view2 != null) {
            obj = view2.getParent();
        }
        if (!(obj instanceof View) || (view = (View) obj) == null) {
            return;
        }
        try {
            BottomSheetBehavior from = BottomSheetBehavior.from(view);
            if (from != null) {
                from.setHideable(z);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void setKeyboardUtilListener(InterfaceC88472Yns<? super Boolean, C76800UCe> l) {
        o.LJIIIZ(l, "l");
        this.keyBoardListener = l;
    }

    public final void setOnBackListener(InterfaceC65784Pro<C76800UCe> l) {
        o.LJIIIZ(l, "l");
        this.onBackListener = l;
    }

    public final void setupBottomSheetHeight(int i) {
        ViewGroup.LayoutParams layoutParams;
        View view;
        View view2 = getView();
        Object obj = null;
        if (view2 != null) {
            View view3 = getView();
            if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
                layoutParams.height = i;
            } else {
                layoutParams = null;
            }
            view2.setLayoutParams(layoutParams);
        }
        View view4 = getView();
        if (view4 != null) {
            obj = view4.getParent();
        }
        if (!(obj instanceof View) || (view = (View) obj) == null) {
            return;
        }
        try {
            BottomSheetBehavior.from(view).setPeekHeight(i);
            behaviorProcess(BottomSheetBehavior.from(view));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        view.setOutlineProvider(new C27442Apq());
        view.setClipToOutline(true);
    }

    public /* synthetic */ CommerceBottomSheetDialogFragment(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
