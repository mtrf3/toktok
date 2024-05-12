package X;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.PollBottomSheetDialogFragment;

/* renamed from: X.TAa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class DialogInterfaceOnShowListenerC74196TAa implements DialogInterface.OnShowListener {
    public final /* synthetic */ PollBottomSheetDialogFragment LJLIL;

    public DialogInterfaceOnShowListenerC74196TAa(PollBottomSheetDialogFragment pollBottomSheetDialogFragment) {
        this.LJLIL = pollBottomSheetDialogFragment;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        VW7 vw7 = this.LJLIL.LJLJI;
        View view = vw7;
        while (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof C06F) && (((C06F) layoutParams).LIZ instanceof ViewPagerBottomSheetBehavior)) {
                vw7.addOnPageChangeListener(new C80150Vcw(vw7, view));
                return;
            }
            Object parent = view.getParent();
            if (parent == null || !(parent instanceof View)) {
                return;
            } else {
                view = (View) parent;
            }
        }
    }
}
