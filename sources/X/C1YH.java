package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1YH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1YH extends C19870qF {
    public C1YH(C1YG c1yg) {
        super(c1yg);
        CharSequence charSequence = c1yg.LJIILLIIL;
        this.LJIIJJI = charSequence;
        if (this.LIZ != null && !TextUtils.isEmpty(charSequence)) {
            TextView textView = (TextView) C16880lQ.LLLZIIL(R.layout.ddh, C16880lQ.LLZIL(this.LIZ), null);
            textView.setText(c1yg.LJIILLIIL);
            this.LIZJ = textView;
        }
    }
}
