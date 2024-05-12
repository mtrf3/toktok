package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T3A extends TK7 {
    public final TextView LJLJJL;

    @Override // X.TK7
    public final void LIZLLL() {
        int i;
        String string;
        TextView textView = this.LJLJJL;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C74216TAu c74216TAu = C74216TAu.LIZIZ;
        if (c74216TAu.LJI()) {
            string = context.getString(R.string.dtk);
            o.LJIIIIZZ(string, "context.getString(R.stri…ction_toast_airplanemode)");
        } else {
            int i2 = T38.LIZIZ[c74216TAu.LJII().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    i = R.string.dto;
                } else {
                    i = R.string.dtd;
                }
            } else {
                i = R.string.dte;
            }
            string = context.getString(i);
            o.LJIIIIZZ(string, "context.getString(strID)");
        }
        textView.setText(string);
    }

    public T3A(Context context) {
        super(context, null, 0);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.crr, this, true);
        View findViewById = findViewById(R.id.md6);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tv_panel_error_title)");
        this.LJLJJL = (TextView) findViewById;
    }
}
