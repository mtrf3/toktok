package com.ss.android.ugc.aweme.common.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public class BaseDialogFragment extends DialogFragment {
    public boolean LJLIL;
    public boolean LJLILLLLZI;

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.LJLILLLLZI = false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.LJLILLLLZI = false;
        EventBus LIZJ = EventBus.LIZJ();
        if ((this instanceof KeyboardDialogFragment) && LIZJ.LJI(this)) {
            LIZJ.LJIJ(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.LJLIL = true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.LJLIL = false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        EventBus LIZJ = EventBus.LIZJ();
        if (!LIZJ.LJI(this) && (this instanceof KeyboardDialogFragment)) {
            LIZJ.LJIILJJIL(this);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (getFragmentManager() == null || !isAdded()) {
            return;
        }
        try {
            dismiss();
        } catch (IllegalStateException unused) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLIL = false;
        this.LJLILLLLZI = false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LJLILLLLZI = true;
    }
}
