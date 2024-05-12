package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VwY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81366VwY extends ConstraintLayout {
    public TextView LJLIL;
    public TextView LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;

    public C81366VwY() {
        throw null;
    }

    public final void LJJLJLI() {
        this.LJLIL.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public CharSequence getTagText() {
        return this.LJLILLLLZI.getText();
    }

    public TextView getTextView() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            if (this.LJLIL.isSelected()) {
                this.LJLIL.setTextColor(this.LJLJI);
                return;
            } else {
                this.LJLIL.setTextColor(this.LJLJJI);
                return;
            }
        }
        this.LJLIL.setTextColor(this.LJLJJL);
    }

    public void setTabSelected(boolean z) {
        this.LJLIL.setSelected(z);
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.LJLIL.setText(str);
    }

    public void setTextColor(int i) {
        this.LJLIL.setTextColor(i);
    }

    public C81366VwY(Context context, int i) {
        super(context, null, 0);
        this.LJLJI = C04330Ez.LIZIZ(getContext(), R.color.bc);
        this.LJLJJI = C04330Ez.LIZIZ(getContext(), R.color.bg);
        this.LJLJJL = C04330Ez.LIZIZ(getContext(), R.color.bh);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.cpr, this, true);
        TextView textView = (TextView) LLLLIILL.findViewById(R.id.kyq);
        this.LJLIL = textView;
        textView.setShadowLayer(KL2.LIZJ(getContext(), 6.0f), 0.0f, 0.0f, C79045V0n.LJI(R.attr.d6, getContext()).intValue());
        this.LJLILLLLZI = (TextView) LLLLIILL.findViewById(R.id.kyp);
    }

    public final void LJJLL(int i, int i2) {
        int paddingTop;
        int paddingBottom;
        int LIZJ = (int) KL2.LIZJ(getContext(), 12);
        TextView textView = this.LJLIL;
        int LIZJ2 = (int) KL2.LIZJ(getContext(), 12);
        if (i != -1) {
            paddingTop = (int) KL2.LIZJ(getContext(), i);
        } else {
            paddingTop = this.LJLIL.getPaddingTop();
        }
        if (i2 != -1) {
            paddingBottom = (int) KL2.LIZJ(getContext(), i2);
        } else {
            paddingBottom = this.LJLIL.getPaddingBottom();
        }
        textView.setPadding(LIZJ2, paddingTop, LIZJ, paddingBottom);
    }
}
