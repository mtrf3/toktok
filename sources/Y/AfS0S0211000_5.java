package Y;

import X.C276516r;
import X.C30868C9o;
import X.C31674Cbu;
import X.InterfaceC64592gB;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class AfS0S0211000_5 implements InterfaceC64592gB {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S0211000_5 afS0S0211000_5, Object obj) {
        Throwable th = (Throwable) obj;
        ((ModeratorPermissionEditFragment) afS0S0211000_5.l0).Hl(afS0S0211000_5.i3, afS0S0211000_5.z2, false);
        if ((th instanceof C276516r) && ((C276516r) th).getErrorCode() == 4002167) {
            ((CompoundButton) afS0S0211000_5.l1).setOnCheckedChangeListener(null);
            ((CompoundButton) afS0S0211000_5.l1).setChecked(false);
            ((CompoundButton) afS0S0211000_5.l1).setOnCheckedChangeListener(new IDCListenerS206S0100000_5((ModeratorPermissionEditFragment) afS0S0211000_5.l0, 14));
            C30868C9o.LIZJ(R.string.n29);
            return;
        }
        ((CompoundButton) afS0S0211000_5.l1).setOnCheckedChangeListener(null);
        ((CompoundButton) afS0S0211000_5.l1).setChecked(!afS0S0211000_5.z2);
        ((CompoundButton) afS0S0211000_5.l1).setOnCheckedChangeListener(new IDCListenerS206S0100000_5((ModeratorPermissionEditFragment) afS0S0211000_5.l0, 15));
        C30868C9o.LIZJ(R.string.mg2);
    }

    public static final void accept$1(AfS0S0211000_5 afS0S0211000_5, Object obj) {
        C31674Cbu.LIZ((Bitmap) obj, (View) afS0S0211000_5.l0, afS0S0211000_5.z2, afS0S0211000_5.i3, (Runnable) afS0S0211000_5.l1);
    }

    public static final void accept$2(AfS0S0211000_5 afS0S0211000_5, Object obj) {
        C31674Cbu.LIZ((Bitmap) obj, (View) afS0S0211000_5.l0, afS0S0211000_5.z2, afS0S0211000_5.i3, (Runnable) afS0S0211000_5.l1);
    }

    public static final void accept$3(AfS0S0211000_5 afS0S0211000_5, Object obj) {
        C31674Cbu.LIZ((Bitmap) obj, (View) afS0S0211000_5.l0, afS0S0211000_5.z2, afS0S0211000_5.i3, (Runnable) afS0S0211000_5.l1);
    }

    public AfS0S0211000_5(View view, boolean z, Runnable runnable, int i) {
        this.$t = i;
        this.l0 = view;
        this.z2 = z;
        this.i3 = 0;
        this.l1 = runnable;
    }

    public AfS0S0211000_5(Object obj, boolean z, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.z2 = z;
        this.i3 = i;
        this.l1 = obj2;
    }
}
