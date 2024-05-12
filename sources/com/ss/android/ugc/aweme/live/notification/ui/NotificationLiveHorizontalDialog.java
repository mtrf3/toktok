package com.ss.android.ugc.aweme.live.notification.ui;

import X.AAQ;
import X.ALS;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C1B3;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC26071ALb;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NotificationLiveHorizontalDialog extends NotificationLiveBottomDialog {
    public boolean LJZL;
    public final Map<Integer, View> LL;

    public NotificationLiveHorizontalDialog() {
        this(null, null, false, "", "", "", "", null, false, null);
    }

    @Override // com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LL).clear();
    }

    @Override // com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LL;
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

    @Override // com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog, com.bytedance.android.live.design.app.LiveControllableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LJZL = false;
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        if (getFragmentManager() != null) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismissAllowingStateLoss() {
        if (getFragmentManager() != null) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // com.bytedance.android.live.design.app.LiveControllableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        WindowManager windowManager;
        Display defaultDisplay;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
                WindowManager.LayoutParams attributes = window2.getAttributes();
                attributes.dimAmount = 0.5f;
                attributes.width = (int) ((Resources.getSystem().getDisplayMetrics().density * 375.0f) + 0.5f);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                if (mo49getActivity != null && (windowManager = mo49getActivity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                    defaultDisplay.getRealMetrics(displayMetrics);
                }
                attributes.height = displayMetrics.heightPixels;
                attributes.gravity = 8388613;
                attributes.softInputMode = 0;
                window2.setAttributes(attributes);
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onCancel(dialog);
        if (this.LJZL) {
            dismissAllowingStateLoss();
        }
        this.LJZ.onCancel(dialog);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJZL = false;
        setStyle(1, R.style.rs);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        o.LJIIIIZZ(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.requestWindowFeature(1);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        this.LJLZ.onDismiss(dialog);
    }

    @Override // com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJZL = true;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(AAQ.LJLIL);
        }
        _$_findCachedViewById(R.id.j71).setBackgroundResource(R.drawable.ckw);
    }

    @Override // com.bytedance.android.live.design.app.LiveControllableDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        o.LJIIIZ(manager, "manager");
        C1B3 c1b3 = new C1B3(manager);
        c1b3.LJJI(this);
        c1b3.LJIIIIZZ(0, 1, this, str);
        c1b3.LJI();
    }

    @Override // com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView;
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        if (getContext() instanceof ActivityC45651qj) {
            Context context = getContext();
            o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
            o.LJIIIIZZ(layoutInflater, "context as FragmentActivity).layoutInflater");
            onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            o.LJIIIIZZ(onCreateView, "{\n            super.onCr…dInstanceState)\n        }");
        } else {
            onCreateView = super.onCreateView(inflater, viewGroup, bundle);
            o.LJIIIIZZ(onCreateView, "{\n            super.onCr…dInstanceState)\n        }");
        }
        try {
            ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(onCreateView, this);
            C10A.LIZIZ(onCreateView, this);
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
        return onCreateView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationLiveHorizontalDialog(User user, InterfaceC26071ALb interfaceC26071ALb, boolean z, String enterFrom, String previousPage, String previousPagePosition, String str, AwemeRawAd awemeRawAd, boolean z2, ALS als) {
        super(user, interfaceC26071ALb, z, enterFrom, previousPage, previousPagePosition, str, awemeRawAd, z2, als);
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(previousPage, "previousPage");
        o.LJIIIZ(previousPagePosition, "previousPagePosition");
        this.LL = new LinkedHashMap();
    }
}
