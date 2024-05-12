package com.bytedance.android.livesdk.chatroom.ui;

import X.AbstractC025808g;
import X.AnonymousClass149;
import X.C10A;
import X.C28329B9x;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ControllableDialogFragment extends LiveThemeAwareDialogFragment {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        AnonymousClass149.LIZ.LJ(getDialog());
        super.onDestroyView();
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        AnonymousClass149.LIZ.LIZ(getDialog());
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
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

    @Override // androidx.fragment.app.DialogFragment
    public final int show(AbstractC025808g transaction, String str) {
        o.LJIIIZ(transaction, "transaction");
        if (!AnonymousClass149.LIZ.LIZLLL()) {
            return super.show(transaction, str);
        }
        return -1;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void showNow(FragmentManager manager, String str) {
        o.LJIIIZ(manager, "manager");
        if (!AnonymousClass149.LIZ.LIZLLL()) {
            super.showNow(manager, str);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager manager, String str) {
        o.LJIIIZ(manager, "manager");
        if (!AnonymousClass149.LIZ.LIZLLL()) {
            super.show(manager, str);
        }
    }
}
