package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.adC, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94202adC extends ConstraintLayout {
    public final TextView LJLIL;
    public final View LJLILLLLZI;

    public final View getTabIndicator() {
        return this.LJLILLLLZI;
    }

    public final TextView getTabName() {
        return this.LJLIL;
    }

    public C94202adC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C16880lQ.LLLZIIL(R.layout.dut, C16880lQ.LLZIL(context), this);
        int i = R.id.nmq;
        View findViewById = findViewById(R.id.nmq);
        if (findViewById != null) {
            i = R.id.nmr;
            TextView textView = (TextView) findViewById(R.id.nmr);
            if (textView != null) {
                this.LJLIL = textView;
                this.LJLILLLLZI = findViewById;
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }
}
