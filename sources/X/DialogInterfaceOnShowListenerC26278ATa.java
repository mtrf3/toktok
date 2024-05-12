package X;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.ATa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnShowListenerC26278ATa implements DialogInterface.OnShowListener {
    public final /* synthetic */ ATZ LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public DialogInterfaceOnShowListenerC26278ATa(ATZ atz, View view, int i) {
        this.LJLIL = atz;
        this.LJLILLLLZI = view;
        this.LJLJI = i;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        BottomSheetBehavior<View> bottomSheetBehavior;
        ATZ atz = this.LJLIL;
        View view = this.LJLILLLLZI;
        if (view != null) {
            bottomSheetBehavior = BottomSheetBehavior.from(view);
        } else {
            bottomSheetBehavior = null;
        }
        atz.LJLLILLLL = bottomSheetBehavior;
        ATZ atz2 = this.LJLIL;
        BottomSheetBehavior<View> bottomSheetBehavior2 = atz2.LJLLILLLL;
        if (bottomSheetBehavior2 != null) {
            int i = this.LJLJI;
            bottomSheetBehavior2.setFitToContents(true);
            bottomSheetBehavior2.setSkipCollapsed(false);
            bottomSheetBehavior2.setHideable(true);
            bottomSheetBehavior2.setPeekHeight(i);
            bottomSheetBehavior2.setState(4);
            bottomSheetBehavior2.setBottomSheetCallback(new C26280ATc(atz2, bottomSheetBehavior2));
        }
    }
}
