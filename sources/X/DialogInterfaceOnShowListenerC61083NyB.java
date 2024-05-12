package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.ui.PdpBulletBottomSheetFragment;

/* renamed from: X.NyB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class DialogInterfaceOnShowListenerC61083NyB implements DialogInterface.OnShowListener {
    public final /* synthetic */ PdpBulletBottomSheetFragment LJLIL;

    public DialogInterfaceOnShowListenerC61083NyB(PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment) {
        this.LJLIL = pdpBulletBottomSheetFragment;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        float f;
        Window window;
        Dialog dialog = this.LJLIL.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            LTT.LJFF(window, -16777216, false);
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL.LJLJLJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        ViewGroup wl = this.LJLIL.wl();
        if (wl != null) {
            wl.setOutlineProvider(new C61084NyC(this.LJLIL));
        }
        ViewGroup wl2 = this.LJLIL.wl();
        if (wl2 != null) {
            wl2.setClipToOutline(true);
        }
        ViewGroup wl3 = this.LJLIL.wl();
        if (wl3 != null) {
            PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment = this.LJLIL;
            BottomSheetBehavior<View> from = BottomSheetBehavior.from(wl3);
            pdpBulletBottomSheetFragment.LJLZ = from;
            if (from != null) {
                from.setHideable(true);
            }
            BottomSheetBehavior<View> bottomSheetBehavior = pdpBulletBottomSheetFragment.LJLZ;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setSkipCollapsed(false);
            }
            BottomSheetBehavior<View> bottomSheetBehavior2 = pdpBulletBottomSheetFragment.LJLZ;
            if (bottomSheetBehavior2 != null) {
                float LJIIIZ = KL2.LJIIIZ(pdpBulletBottomSheetFragment.LJLIL);
                Float f2 = (Float) pdpBulletBottomSheetFragment.LJLJJLL.getValue();
                if (f2 != null) {
                    f = f2.floatValue();
                } else {
                    f = 0.73f;
                }
                bottomSheetBehavior2.setPeekHeight((int) (LJIIIZ * f));
            }
            BottomSheetBehavior<View> bottomSheetBehavior3 = pdpBulletBottomSheetFragment.LJLZ;
            if (bottomSheetBehavior3 != null) {
                bottomSheetBehavior3.setBottomSheetCallback(new C61082NyA(pdpBulletBottomSheetFragment));
            }
        }
    }
}
