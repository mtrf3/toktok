package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class T4W extends LinearLayout {
    public T4V LJLIL;
    public TextView LJLILLLLZI;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            this.LJLIL.LIZIZ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLIL.LIZJ();
    }

    public T4W(Context context) {
        super(context);
        LinearLayout.inflate(getContext(), R.layout.dd6, this);
        setOrientation(1);
        C16300kU.LJIILLIIL(this, C04270Et.LIZIZ(getContext(), R.drawable.cne));
        int LIZJ = (int) KL2.LIZJ(getContext(), 16.0f);
        setPadding(LIZJ, LIZJ, LIZJ, LIZJ);
        this.LJLIL = (T4V) findViewById(R.id.a5h);
        this.LJLILLLLZI = (TextView) findViewById(R.id.l5r);
    }

    public void setMessage(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.LJLILLLLZI.setText(getContext().getString(R.string.sur));
        } else {
            this.LJLILLLLZI.setText(charSequence);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            this.LJLIL.LIZIZ();
            return;
        }
        T4V t4v = this.LJLIL;
        if (!t4v.LJLJLLL) {
            return;
        }
        t4v.LIZJ();
    }
}
