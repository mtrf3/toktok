package com.bytedance.android.live.design.view.sheet.action;

import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialogFragment;

/* loaded from: classes.dex */
public class LiveActionSheetDialogFragment extends LiveBottomSheetDialogFragment {
    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialogFragment
    public final LiveBottomSheetDialog vl() {
        return new LiveActionSheetDialog(getContext(), getTheme());
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final /* bridge */ /* synthetic */ Dialog onCreateDialog(Bundle bundle) {
        return vl();
    }
}
