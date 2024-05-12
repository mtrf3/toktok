package com.bytedance.android.live.design.resource.theme;

import X.C0YG;
import X.C259710f;
import X.C48690J9a;
import X.InterfaceC12810er;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatDialogFragment;

/* loaded from: classes.dex */
public class LiveThemeAwareAppCompatDialogFragment extends AppCompatDialogFragment implements InterfaceC12810er {
    @Override // X.InterfaceC12810er
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C48690J9a.LIZIZ(context);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0YG.LIZ(getContext());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        if (C48690J9a.LIZIZ(getContext()) != C259710f.LIZ.LJFF(getContext())) {
            return C0YG.LIZJ(super.onGetLayoutInflater(bundle), C48690J9a.LIZIZ(getContext()));
        }
        return super.onGetLayoutInflater(bundle);
    }
}
