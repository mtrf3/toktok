package X;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes11.dex */
public final class OOI implements DialogInterface.OnShowListener {
    public final /* synthetic */ OOH LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    public OOI(OOH ooh, View view) {
        this.LJLIL = ooh;
        this.LJLILLLLZI = view;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        BottomSheetBehavior<View> bottomSheetBehavior;
        OOH ooh = this.LJLIL;
        View view = this.LJLILLLLZI;
        if (view != null) {
            bottomSheetBehavior = BottomSheetBehavior.from(view);
        } else {
            bottomSheetBehavior = null;
        }
        ooh.LL = bottomSheetBehavior;
        BottomSheetBehavior<View> bottomSheetBehavior2 = this.LJLIL.LL;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.setHideable(false);
        }
    }
}
