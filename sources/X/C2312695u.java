package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.95u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2312695u extends LinearLayout {
    public TextView LJLIL;
    public final Context LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2312695u(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLILLLLZI = context;
        View findViewById = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bgd, this, true).findViewById(R.id.jj3);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.second_level_tab_name)");
        this.LJLIL = (TextView) findViewById;
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            TextView textView = this.LJLIL;
            if (textView != null) {
                textView.setText(str);
            } else {
                o.LJIJI("textView");
                throw null;
            }
        }
    }

    public final void setTextColor(int i) {
        TextView textView = this.LJLIL;
        if (textView != null) {
            textView.setTextColor(i);
        } else {
            o.LJIJI("textView");
            throw null;
        }
    }
}
