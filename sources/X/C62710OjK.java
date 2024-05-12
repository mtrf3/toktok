package X;

import Y.ACListenerS30S0100000_10;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OjK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62710OjK implements InterfaceC62887OmB {
    public final C29S LIZ;
    public final LinearLayout LIZIZ;
    public final int LIZJ;
    public SY4 LIZLLL;
    public SY4 LJ;
    public InterfaceC65784Pro<C76800UCe> LJFF;
    public InterfaceC65784Pro<C76800UCe> LJI;

    @Override // X.InterfaceC62887OmB
    public final void LIZ() {
        SY4 sy4 = this.LJ;
        if (sy4 == null) {
            return;
        }
        sy4.setEnabled(false);
    }

    @Override // X.InterfaceC62887OmB
    public final void LIZIZ() {
        SY4 sy4 = this.LJ;
        if (sy4 == null) {
            return;
        }
        sy4.setEnabled(true);
    }

    public final void LIZJ() {
        LinearLayout linearLayout = this.LIZIZ;
        C29S c29s = this.LIZ;
        LinearLayout linearLayout2 = new LinearLayout(c29s);
        linearLayout2.setOrientation(0);
        SY4 sy4 = new SY4(c29s, null, 6, 0);
        sy4.setText(c29s.getString(R.string.iv5));
        sy4.setButtonSize(3);
        sy4.setButtonVariant(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMarginEnd(this.LIZJ);
        sy4.setLayoutParams(layoutParams);
        this.LIZLLL = sy4;
        SY4 sy42 = new SY4(c29s, null, 6, 0);
        sy42.setText(c29s.getString(R.string.iv7));
        sy42.setButtonSize(3);
        sy42.setEnabled(false);
        sy42.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.LJ = sy42;
        linearLayout2.addView(this.LIZLLL);
        linearLayout2.addView(this.LJ);
        SY4 sy43 = this.LJ;
        if (sy43 != null) {
            C16880lQ.LJJIZ(sy43, new ACListenerS30S0100000_10(this, 175));
        }
        SY4 sy44 = this.LIZLLL;
        if (sy44 != null) {
            C16880lQ.LJJIZ(sy44, new ACListenerS30S0100000_10(this, 176));
        }
        linearLayout.addView(linearLayout2);
    }

    public final void LIZLLL() {
        LinearLayout linearLayout = this.LIZIZ;
        C29S c29s = this.LIZ;
        SY4 sy4 = new SY4(c29s, null, 6, 0);
        sy4.setText(c29s.getString(R.string.iv7));
        sy4.setButtonSize(3);
        sy4.setEnabled(false);
        this.LJ = sy4;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        SY4 sy42 = this.LJ;
        if (sy42 != null) {
            sy42.setLayoutParams(layoutParams);
        }
        SY4 sy43 = this.LJ;
        if (sy43 != null) {
            C16880lQ.LJJIZ(sy43, new ACListenerS30S0100000_10(this, 177));
        }
        linearLayout.addView(sy4);
    }

    public C62710OjK(C29S activity, LinearLayout linearLayout) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LIZIZ = linearLayout;
        C74275TDb.LIZ(12.0f);
        this.LIZJ = (int) C74275TDb.LIZ(8.0f);
    }
}
