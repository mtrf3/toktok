package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import X.DialogC80574Vjm;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/* loaded from: classes13.dex */
public class ViewPagerBottomSheetDialogFragment extends BottomSheetDialogFragment {
    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC80574Vjm(getContext(), getTheme());
    }
}
