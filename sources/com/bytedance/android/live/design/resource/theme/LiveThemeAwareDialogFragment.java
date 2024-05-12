package com.bytedance.android.live.design.resource.theme;

import X.C0YG;
import X.C259710f;
import X.C48690J9a;
import X.InterfaceC12810er;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes.dex */
public class LiveThemeAwareDialogFragment extends DialogFragment implements InterfaceC12810er {
    @Override // X.InterfaceC12810er
    public /* synthetic */ int getThemeOverlay(Context context) {
        return C48690J9a.LIZIZ(context);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0YG.LIZ(getContext());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        if (getThemeOverlay(getContext()) != C259710f.LIZ.LJFF(getContext())) {
            return C0YG.LIZJ(super.onGetLayoutInflater(bundle), getThemeOverlay(getContext()));
        }
        return super.onGetLayoutInflater(bundle);
    }
}
