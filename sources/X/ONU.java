package X;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes11.dex */
public final class ONU implements DialogInterface.OnShowListener {
    public final /* synthetic */ ONQ LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    public ONU(ONQ onq, View view) {
        this.LJLIL = onq;
        this.LJLILLLLZI = view;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        BottomSheetBehavior<View> bottomSheetBehavior;
        ONQ onq = this.LJLIL;
        View view = this.LJLILLLLZI;
        if (view != null) {
            bottomSheetBehavior = BottomSheetBehavior.from(view);
        } else {
            bottomSheetBehavior = null;
        }
        onq.LL = bottomSheetBehavior;
        ONQ onq2 = this.LJLIL;
        BottomSheetBehavior<View> bottomSheetBehavior2 = onq2.LL;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.setBottomSheetCallback(new ONT(onq2));
        }
    }
}
