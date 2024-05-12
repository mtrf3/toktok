package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vhb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80439Vhb extends AbstractC38761fc {
    public final /* synthetic */ C80438Vha LJIILIIL;

    @Override // X.AbstractC38761fc
    public final void LIZJ(List<Integer> list) {
        C80438Vha c80438Vha;
        C80437VhZ c80437VhZ;
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(0);
        if (this.LJIILIIL.LIZJ() && (c80437VhZ = (c80438Vha = this.LJIILIIL).LJLJJL) != null && c80437VhZ.LLIIJLIL && c80438Vha.LJLJLJ != null) {
            arrayList.add(1);
        }
    }

    @Override // X.AbstractC38761fc
    public final void LJI(C17760mq c17760mq) {
        String str;
        c17760mq.LJIIL(this.LJIILIIL.LIZLLL());
        c17760mq.LJIILL(this.LJIILIIL.isClickable());
        if (this.LJIILIIL.LIZLLL() || this.LJIILIIL.isClickable()) {
            if (this.LJIILIIL.LIZLLL()) {
                str = "android.widget.CompoundButton";
            } else {
                str = "android.widget.Button";
            }
            c17760mq.LJIILJJIL(str);
        } else {
            c17760mq.LJIILJJIL("android.view.View");
        }
        CharSequence text = this.LJIILIIL.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            c17760mq.LJJIIJ(text);
        } else {
            c17760mq.LJIJ(text);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80439Vhb(C80438Vha c80438Vha, C80438Vha c80438Vha2) {
        super(c80438Vha2);
        this.LJIILIIL = c80438Vha;
    }

    @Override // X.AbstractC38761fc
    public final boolean LJFF(int i, int i2) {
        boolean z = false;
        if (i2 == 16) {
            if (i == 0) {
                return this.LJIILIIL.performClick();
            }
            if (i == 1) {
                C80438Vha c80438Vha = this.LJIILIIL;
                c80438Vha.playSoundEffect(0);
                View.OnClickListener onClickListener = c80438Vha.LJLJLJ;
                if (onClickListener != null) {
                    onClickListener.onClick(c80438Vha);
                    z = true;
                }
                c80438Vha.LJLZ.LJIIJ(1, 1);
            }
        }
        return z;
    }

    @Override // X.AbstractC38761fc
    public final void LJII(int i, C17760mq c17760mq) {
        CharSequence charSequence = "";
        if (i == 1) {
            CharSequence closeIconContentDescription = this.LJIILIIL.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                c17760mq.LJIJ(closeIconContentDescription);
            } else {
                CharSequence text = this.LJIILIIL.getText();
                Context context = this.LJIILIIL.getContext();
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                objArr[0] = charSequence;
                c17760mq.LJIJ(context.getString(R.string.i9o, objArr).trim());
            }
            c17760mq.LJIIJ(this.LJIILIIL.getCloseIconTouchBoundsInt());
            c17760mq.LIZIZ(C17720mm.LJI);
            c17760mq.LJIJJ(this.LJIILIIL.isEnabled());
            return;
        }
        c17760mq.LJIJ("");
        c17760mq.LJIIJ(C80438Vha.LL);
    }

    @Override // X.AbstractC38761fc
    public final void LJIIIIZZ(int i, boolean z) {
        if (i == 1) {
            C80438Vha c80438Vha = this.LJIILIIL;
            c80438Vha.LJLLJ = z;
            c80438Vha.refreshDrawableState();
        }
    }

    public final int LJIIL(float f, float f2) {
        if (this.LJIILIIL.LIZJ() && this.LJIILIIL.getCloseIconTouchBounds().contains(f, f2)) {
            return 1;
        }
        return 0;
    }
}
