package X;

import Y.ARunnableS46S0100000_10;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.ui.PdpBulletBottomSheetFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.NyA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61082NyA extends AbstractC26257ASf {
    public final /* synthetic */ PdpBulletBottomSheetFragment LIZ;

    public C61082NyA(PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment) {
        this.LIZ = pdpBulletBottomSheetFragment;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZ(View view, float f) {
        o.LJIIIZ(view, "view");
        PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment = this.LIZ;
        if (pdpBulletBottomSheetFragment.LJLLLLLL < 0.5f && f >= 0.5f) {
            ViewGroup wl = pdpBulletBottomSheetFragment.wl();
            if (wl != null) {
                wl.post(new ARunnableS46S0100000_10(this.LIZ, 38));
            }
            this.LIZ.LJZI = 3;
        }
        PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment2 = this.LIZ;
        if (pdpBulletBottomSheetFragment2.LJLLLLLL >= 0.5f && f < 0.5f) {
            ViewGroup wl2 = pdpBulletBottomSheetFragment2.wl();
            if (wl2 != null) {
                wl2.post(new ARunnableS46S0100000_10(this.LIZ, 39));
            }
            this.LIZ.LJZI = 4;
        }
        this.LIZ.LJLLLLLL = f;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View p0) {
        boolean z;
        View view;
        ViewGroup wl;
        Integer num;
        ViewGroup wl2;
        o.LJIIIZ(p0, "p0");
        if (i == 5) {
            Dialog dialog = this.LIZ.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        } else {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZ.LJLJLJ;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        }
        if (i == 1 && (num = this.LIZ.LJZI) != null && num.intValue() == 3 && (wl2 = this.LIZ.wl()) != null) {
            wl2.post(new ARunnableS46S0100000_10(this.LIZ, 40));
        }
        if (i == 1) {
            Integer num2 = this.LIZ.LJZI;
            if (num2 != null && num2.intValue() == 4 && (wl = this.LIZ.wl()) != null) {
                wl.post(new ARunnableS46S0100000_10(this.LIZ, 41));
            }
        } else if (i == 3 || i == 4 || i == 5) {
            PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment = this.LIZ;
            pdpBulletBottomSheetFragment.LJZ = i;
            pdpBulletBottomSheetFragment.xl().LJLIL.onNext(Integer.valueOf(i));
        }
        View view2 = (View) this.LIZ.LJLLILLLL.getValue();
        if (view2 != null) {
            if (i != 2) {
                z = true;
            } else {
                z = false;
            }
            view2.setEnabled(z);
        }
        if (i == 3 && (view = this.LIZ.LJLLLL) != null) {
            view.scrollBy(0, 1);
        }
    }
}
