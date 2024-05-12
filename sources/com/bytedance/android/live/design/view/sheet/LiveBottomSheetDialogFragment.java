package com.bytedance.android.live.design.view.sheet;

import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes.dex */
public class LiveBottomSheetDialogFragment extends AppCompatDialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public final int getTheme() {
        return R.style.q4;
    }

    public LiveBottomSheetDialog vl() {
        return new LiveBottomSheetDialog(requireContext(), getTheme());
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public /* bridge */ /* synthetic */ Dialog onCreateDialog(Bundle bundle) {
        return vl();
    }
}
