package com.bytedance.android.livesdk;

import X.AbstractC025808g;
import X.ActivityC45651qj;
import X.AnonymousClass149;
import X.BKY;
import X.BY5;
import X.C0NB;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C20780ri;
import X.C221108m2;
import X.C28329B9x;
import X.C28507BGt;
import X.C29306Beo;
import X.C29881Bo5;
import X.C29884Bo8;
import X.C29S;
import X.C36538EVq;
import X.C3C5;
import X.C51029K0z;
import X.C5H3;
import X.C76800UCe;
import X.C90903hW;
import X.DialogInterfaceOnKeyListenerC29687Bkx;
import X.EnumC29609Bjh;
import X.InterfaceC29882Bo6;
import X.InterfaceC29883Bo7;
import X.RunnableC29886BoA;
import X.X1D;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveWatchDialogOrientationSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveDialogFragmentOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.DataChannelGlobalOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.livesetting.performance.PanelOpenCostTimesSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class LiveDialogFragment extends LiveThemeAwareDialogFragment {
    public static final C29884Bo8 Companion = new C29884Bo8();
    public DataChannel dataChannel;
    public C28507BGt dialogParams;
    public boolean isViewValid;
    public DialogInterface.OnCancelListener onCancelListener;
    public InterfaceC29883Bo7 onDialogGoneListener;
    public DialogInterface.OnDismissListener onDismissListener;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C5H3 liveDialogProxy$delegate = C221108m2.LIZIZ(new AqS155S0100000_5(this, 73));

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

    public abstract C28507BGt createParams();

    public InterfaceC29882Bo6 genLandscapeDialogProxy() {
        return null;
    }

    public Dialog newDialog(Bundle bundle) {
        return null;
    }

    public boolean onBackPressed() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.isViewValid = false;
        AnonymousClass149.LIZ.LJ(getDialog());
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onDialogCreated(Dialog dialog) {
        o.LJIIIZ(dialog, "dialog");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyDialogOnStart(this);
    }

    private final InterfaceC29882Bo6 getLiveDialogProxy() {
        return (InterfaceC29882Bo6) this.liveDialogProxy$delegate.getValue();
    }

    public void com_bytedance_android_livesdk_LiveDialogFragment__onStart$___twin___() {
        try {
            if (getContext() != null) {
                Context context = getContext();
                o.LJII(context, "null cannot be cast to non-null type android.content.ContextWrapper");
                Context baseContext = ((ContextWrapper) context).getBaseContext();
                if (baseContext instanceof Activity) {
                    if (!((Activity) baseContext).isFinishing() && ((Activity) baseContext).isDestroyed()) {
                        super.onStart();
                    }
                } else {
                    super.onStart();
                }
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                getLiveDialogProxy().LJ(dialog);
                getLiveDialogProxy().LIZIZ(dialog);
                String BRAND = Build.BRAND;
                o.LJIIIIZZ(BRAND, "BRAND");
                Locale ROOT = Locale.ROOT;
                o.LJIIIIZZ(ROOT, "ROOT");
                String lowerCase = BRAND.toLowerCase(ROOT);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                try {
                    onStart$setAttributesForDialog(this, dialog);
                } catch (Exception unused) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("device ");
                    LIZ.append(lowerCase);
                    LIZ.append(" - onStart error: view not attach window!");
                    C0NB.LJ("LiveDialogFragment", X1D.LIZIZ(LIZ));
                }
            }
            AnonymousClass149.LIZ.LIZ(getDialog());
        } catch (Exception unused2) {
            C0NB.LJ("LiveDialogFragment", "onStart error!");
        }
    }

    public final C28507BGt getDialogParams() {
        C28507BGt c28507BGt = this.dialogParams;
        if (c28507BGt != null) {
            return c28507BGt;
        }
        o.LJIJI("dialogParams");
        throw null;
    }

    private final void addDialog() {
        BKY.LIZIZ().LIZ();
        C36538EVq.LJI(this, Boolean.FALSE, "mDismissed");
        C36538EVq.LJI(this, Boolean.TRUE, "mShownByMe");
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (getFragmentManager() == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("dismiss:");
            LIZ.append(this);
            LIZ.append(" not associate with a fragment manager");
            C0NB.LIZIZ("LiveDialogFragment", X1D.LIZIZ(LIZ));
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (getFragmentManager() == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("dismissAllowingStateLoss:");
            LIZ.append(this);
            LIZ.append(" not associate with a fragment manager");
            C0NB.LIZIZ("LiveDialogFragment", X1D.LIZIZ(LIZ));
            return;
        }
        super.dismissAllowingStateLoss();
    }

    public InterfaceC29882Bo6 genDialogProxy() {
        Configuration configuration;
        ActivityC45651qj mo49getActivity;
        setDialogParams(createParams());
        if (!LiveWatchDialogOrientationSetting.INSTANCE.isExperimentGroup() ? !((configuration = getResources().getConfiguration()) == null || configuration.orientation != 2) : !((mo49getActivity = mo49getActivity()) == null || !C29306Beo.LJIIZILJ(mo49getActivity.getRequestedOrientation()))) {
            InterfaceC29882Bo6 genLandscapeDialogProxy = genLandscapeDialogProxy();
            if (genLandscapeDialogProxy != null) {
                return genLandscapeDialogProxy;
            }
        }
        return new BY5(getDialogParams());
    }

    public boolean isShowing() {
        Dialog dialog = getDialog();
        if (dialog == null || !dialog.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (DataChannelGlobalOptSetting.enableUnregisterOnBaseClass()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            dataChannelGlobal.getClass();
            dataChannelGlobal.jv0(this);
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.jv0(this);
            }
        }
    }

    public EnumC29609Bjh getPanelType() {
        return EnumC29609Bjh.DEFAULT;
    }

    public static void com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyDialogOnStart(LiveDialogFragment liveDialogFragment) {
        Window window;
        View decorView;
        liveDialogFragment.com_bytedance_android_livesdk_LiveDialogFragment__onStart$___twin___();
        Dialog dialog = liveDialogFragment.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, liveDialogFragment);
            ViewTreeViewModelStoreOwner.set(decorView, liveDialogFragment);
            C10A.LIZIZ(decorView, liveDialogFragment);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        if (this.isViewValid) {
            dismissAllowingStateLoss();
        }
        DialogInterface.OnCancelListener onCancelListener = this.onCancelListener;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialog);
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.isViewValid = false;
        this.dataChannel = C51029K0z.LJIILIIL(this);
        getLiveDialogProxy().LIZ(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog newDialog = newDialog(bundle);
        if (newDialog == null) {
            newDialog = super.onCreateDialog(bundle);
            o.LJIIIIZZ(newDialog, "super.onCreateDialog(savedInstanceState)");
        }
        getLiveDialogProxy().LIZJ(newDialog);
        onDialogCreated(newDialog);
        return newDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        BKY.LIZIZ().LJ();
        super.onDismiss(dialog);
        DialogInterface.OnDismissListener onDismissListener = this.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialog);
        }
        InterfaceC29883Bo7 interfaceC29883Bo7 = this.onDialogGoneListener;
        if (interfaceC29883Bo7 != null) {
            interfaceC29883Bo7.LIZ(dialog);
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        if (C28329B9x.LIZJ(getContext())) {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            getContext();
            o.LJIIIIZZ(onGetLayoutInflater, "{\n            LayoutInfl…,\n            )\n        }");
            return onGetLayoutInflater;
        }
        LayoutInflater onGetLayoutInflater2 = super.onGetLayoutInflater(bundle);
        o.LJIIIIZZ(onGetLayoutInflater2, "{\n            super.onGe…dInstanceState)\n        }");
        return onGetLayoutInflater2;
    }

    public final void setDialogParams(C28507BGt c28507BGt) {
        o.LJIIIZ(c28507BGt, "<set-?>");
        this.dialogParams = c28507BGt;
    }

    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.onDismissListener = onDismissListener;
    }

    public static final void onStart$setAttributesForDialog(LiveDialogFragment liveDialogFragment, Dialog dialog) {
        if (dialog.getWindow() != null) {
            liveDialogFragment.getLiveDialogProxy().LIZLLL(dialog);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.isViewValid = true;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterfaceOnKeyListenerC29687Bkx(this));
        }
        if (view instanceof RunnableC29886BoA) {
            ((RunnableC29886BoA) view).setTraversalCallBack(new AqS171S0100000_5(this, 104));
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager manager, String str) {
        o.LJIIIZ(manager, "manager");
        if (!AnonymousClass149.LIZ.LIZLLL()) {
            C29881Bo5.LIZ(getPanelType());
            addDialog();
            if (LiveDialogFragmentOptSetting.INSTANCE.enable()) {
                C1B3 c1b3 = new C1B3(manager);
                c1b3.LJJI(this);
                c1b3.LJIIIIZZ(0, 1, this, str);
                c1b3.LJI();
                return;
            }
            C1B3 c1b32 = new C1B3(manager);
            c1b32.LJIIIIZZ(0, 1, this, str);
            c1b32.LJI();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void showNow(FragmentManager manager, String str) {
        o.LJIIIZ(manager, "manager");
        if (!AnonymousClass149.LIZ.LIZLLL()) {
            C29881Bo5.LIZ(getPanelType());
            addDialog();
            C1B3 c1b3 = new C1B3(manager);
            c1b3.LJIIIIZZ(0, 1, this, str);
            c1b3.LJII();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public int show(AbstractC025808g transaction, String str) {
        o.LJIIIZ(transaction, "transaction");
        if (!AnonymousClass149.LIZ.LIZLLL()) {
            C29881Bo5.LIZ(getPanelType());
            addDialog();
            transaction.LJIIIIZZ(0, 1, this, str);
            C36538EVq.LJI(this, Boolean.FALSE, "mViewDestroyed");
            int LJIILL = ((C1B3) transaction).LJIILL(true);
            C36538EVq.LJI(this, Integer.valueOf(LJIILL), "mBackStackId");
            return LJIILL;
        }
        return -1;
    }

    public static final void show(ActivityC45651qj activityC45651qj, LiveDialogFragment liveDialogFragment) {
        Companion.getClass();
        if (activityC45651qj != null && !activityC45651qj.isFinishing() && activityC45651qj.hasWindowFocus() && liveDialogFragment != null) {
            FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "it.supportFragmentManager");
            String LJLLILLLL = C16880lQ.LJLLILLLL(liveDialogFragment.getClass());
            if (LJLLILLLL == null) {
                LJLLILLLL = "";
            }
            liveDialogFragment.show(supportFragmentManager, LJLLILLLL);
        }
    }

    public final View com_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        o.LJIIIZ(inflater, "inflater");
        if (!PanelOpenCostTimesSetting.INSTANCE.getValue().mSwitch) {
            return C16880lQ.LLLLIILL(inflater, getLiveDialogProxy().getLayoutId(), viewGroup, false);
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dqt, viewGroup, false);
        if ((LLLLIILL instanceof RunnableC29886BoA) && (viewGroup2 = (ViewGroup) LLLLIILL) != null) {
            int layoutId = getLiveDialogProxy().getLayoutId();
            if (C20780ri.LIZ(layoutId) && LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
                C20780ri.LIZJ(layoutId, viewGroup2, true);
            } else {
                C16880lQ.LLLLIILL(inflater, layoutId, viewGroup2, true);
            }
            ViewGroup.LayoutParams layoutParams = viewGroup2.getChildAt(0).getLayoutParams();
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
        return LLLLIILL;
    }

    public static View com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(LiveDialogFragment liveDialogFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View com_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___ = liveDialogFragment.com_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(com_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___ instanceof View)) {
            com_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___ = null;
        }
        if (com_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(com_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___, liveDialogFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(com_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___, liveDialogFragment);
                C10A.LIZIZ(com_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___, liveDialogFragment);
                ActivityC45651qj mo49getActivity = liveDialogFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return com_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___;
    }
}
