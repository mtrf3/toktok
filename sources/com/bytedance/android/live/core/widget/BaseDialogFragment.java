package com.bytedance.android.live.core.widget;

import X.ActivityC45651qj;
import X.BKY;
import X.C16880lQ;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.live.BaseDialogFragmentV2;
import com.bytedance.android.live.core.widget.BaseDialogFragment;

/* loaded from: classes.dex */
public class BaseDialogFragment extends BaseDialogFragmentV2 {
    public static final /* synthetic */ int LJLJI = 0;
    public boolean LJLIL;
    public DialogInterface.OnDismissListener LJLILLLLZI;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.LJLIL = false;
        BKY.LIZIZ().LJ();
    }

    @Override // com.bytedance.android.live.BaseDialogFragmentV2, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.LJLIL = false;
    }

    public String zk() {
        return String.valueOf(hashCode());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        try {
            dismiss();
        } catch (IllegalStateException unused) {
            dismissAllowingStateLoss();
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLIL = false;
        BKY.LIZIZ().LIZ();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.LJLILLLLZI;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    public static void wl(ActivityC45651qj activityC45651qj, DialogFragment dialogFragment) {
        String LJLLILLLL = C16880lQ.LJLLILLLL(dialogFragment.getClass());
        if (activityC45651qj != null) {
            dialogFragment.show(activityC45651qj.getSupportFragmentManager(), LJLLILLLL);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LJLIL = true;
        getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0vG
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                BaseDialogFragment.this.getClass();
                if (4 == i) {
                    keyEvent.getAction();
                    return false;
                }
                return false;
            }
        });
    }
}
