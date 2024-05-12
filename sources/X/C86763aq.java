package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.3aq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86763aq extends LinearLayout {
    public final TextView LJLIL;

    public C86763aq(Context context) {
        super(context, null, 0);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.dt2, C16880lQ.LLZIL(context), this);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.LJLIL = (TextView) LLLZIIL.findViewById(R.id.mmw);
    }

    public void setTagName(String str) {
        TextView textView = this.LJLIL;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
