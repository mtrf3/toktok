package androidx.fragment.app;

import X.AbstractC025808g;
import X.ActivityC45651qj;
import X.C10A;
import X.C16880lQ;
import X.C19560pk;
import X.C1B1;
import X.C1B3;
import X.C1B6;
import X.KMP;
import X.X1D;
import Y.IDDListenerS140S0100000;
import Y.IDRunnableS85S0100000;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Dialog mDialog;
    public boolean mDismissed;
    public Handler mHandler;
    public boolean mShownByMe;
    public boolean mViewDestroyed;
    public Runnable mDismissRunnable = new IDRunnableS85S0100000(this, 16);
    public DialogInterface.OnCancelListener mOnCancelListener = new DialogInterface.OnCancelListener() { // from class: X.08S
        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            DialogFragment dialogFragment = DialogFragment.this;
            Dialog dialog = dialogFragment.mDialog;
            if (dialog != null) {
                dialogFragment.onCancel(dialog);
            }
        }
    };
    public DialogInterface.OnDismissListener mOnDismissListener = new IDDListenerS140S0100000(this, 0);
    public int mStyle = 0;
    public int mTheme = 0;
    public boolean mCancelable = true;
    public boolean mShowsDialog = true;
    public int mBackStackId = -1;

    public void dismiss() {
        dismissInternal(false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_DialogFragmentLancet_onActivityCreated(this, bundle);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    public void androidx_fragment_app_DialogFragment__onStart$___twin___() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            C16880lQ.LIZ(dialog);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DialogFragment ");
        LIZ.append(this);
        LIZ.append(" does not have a Dialog.");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        try {
            androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyDialogOnStart(this);
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public static void androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyDialogOnStart(DialogFragment dialogFragment) {
        Window window;
        View decorView;
        dialogFragment.androidx_fragment_app_DialogFragment__onStart$___twin___();
        Dialog dialog = dialogFragment.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, dialogFragment);
            ViewTreeViewModelStoreOwner.set(decorView, dialogFragment);
            C10A.LIZIZ(decorView, dialogFragment);
        }
    }

    public static void androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_onStart(DialogFragment dialogFragment) {
        try {
            androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyDialogOnStart(dialogFragment);
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public void androidx_fragment_app_DialogFragment__onActivityCreated$___twin___(Bundle bundle) {
        Bundle bundle2;
        super.onActivityCreated(bundle);
        if (!this.mShowsDialog) {
            return;
        }
        View view = getView();
        if (view != null) {
            if (view.getParent() == null) {
                this.mDialog.setContentView(view);
            } else {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.mDialog.setOwnerActivity(mo49getActivity);
        }
        this.mDialog.setCancelable(this.mCancelable);
        this.mDialog.setOnCancelListener(this.mOnCancelListener);
        this.mDialog.setOnDismissListener(this.mOnDismissListener);
        if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.mDialog.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (!this.mShownByMe) {
            this.mDismissed = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.mHandler = new Handler();
        if (this.mContainerId == 0) {
            z = true;
        } else {
            z = false;
        }
        this.mShowsDialog = z;
        if (bundle != null) {
            this.mStyle = bundle.getInt("android:style", 0);
            this.mTheme = bundle.getInt("android:theme", 0);
            this.mCancelable = bundle.getBoolean("android:cancelable", true);
            this.mShowsDialog = bundle.getBoolean("android:showsDialog", this.mShowsDialog);
            this.mBackStackId = bundle.getInt("android:backStackId", -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return new Dialog(requireContext(), getTheme());
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.mViewDestroyed) {
            dismissInternal(true, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        if (!this.mShowsDialog) {
            return super.onGetLayoutInflater(bundle);
        }
        Dialog onCreateDialog = onCreateDialog(bundle);
        int hashCode = hashCode();
        HashMap hashMap = (HashMap) C19560pk.LIZ;
        Object obj = hashMap.get(Integer.valueOf(hashCode));
        Boolean bool = Boolean.TRUE;
        if (o.LJ(obj, bool)) {
            hashMap.remove(Integer.valueOf(hashCode));
            ((HashMap) C19560pk.LIZIZ).put(Integer.valueOf(onCreateDialog.hashCode()), bool);
        }
        this.mDialog = onCreateDialog;
        if (onCreateDialog != null) {
            setupDialog(onCreateDialog, this.mStyle);
            return (LayoutInflater) C16880lQ.LLILL(this.mDialog.getContext(), "layout_inflater");
        }
        return (LayoutInflater) C16880lQ.LLILL(this.mHost.LJLILLLLZI, "layout_inflater");
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null && (onSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public static void androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_DialogFragmentLancet_onActivityCreated(DialogFragment dialogFragment, Bundle bundle) {
        try {
            dialogFragment.androidx_fragment_app_DialogFragment__onActivityCreated$___twin___(bundle);
        } catch (IllegalStateException e) {
            throw new IllegalStateException(dialogFragment.toString(), e);
        }
    }

    public void dismissInternal(boolean z, boolean z2) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            int i = this.mBackStackId;
            parentFragmentManager.getClass();
            if (i >= 0) {
                parentFragmentManager.LJJIJIIJI(new C1B1(parentFragmentManager, null, i, 1), false);
                this.mBackStackId = -1;
                return;
            }
            throw new IllegalArgumentException(KMP.LJ("Bad id: ", i));
        }
        FragmentManager parentFragmentManager2 = getParentFragmentManager();
        parentFragmentManager2.getClass();
        C1B3 c1b3 = new C1B3(parentFragmentManager2);
        c1b3.LJJI(this);
        if (z) {
            c1b3.LJI();
        } else {
            c1b3.LJIILJJIL();
        }
    }

    public void setStyle(int i, int i2) {
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    public void setupDialog(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int show(AbstractC025808g abstractC025808g, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC025808g.LJIIIIZZ(0, 1, this, str);
        this.mViewDestroyed = false;
        int LJIILL = ((C1B3) abstractC025808g).LJIILL(false);
        this.mBackStackId = LJIILL;
        return LJIILL;
    }

    public void showNow(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
        LIZ.LJIIIIZZ(0, 1, this, str);
        LIZ.LJIILLIIL();
    }

    public void show(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
        LIZ.LJIIIIZZ(0, 1, this, str);
        LIZ.LJIILJJIL();
    }
}
