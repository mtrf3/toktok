package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.95t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2312595t extends LinearLayout {
    public TuxTextView LJLIL;
    public final Context LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2312595t(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLILLLLZI = context;
        View findViewById = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bd2, this, true).findViewById(R.id.jj3);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.second_level_tab_name)");
        this.LJLIL = (TuxTextView) findViewById;
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            TuxTextView tuxTextView = this.LJLIL;
            if (tuxTextView != null) {
                tuxTextView.setText(str);
            } else {
                o.LJIJI("textView");
                throw null;
            }
        }
    }

    public final void setTextColor(int i) {
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(i);
        } else {
            o.LJIJI("textView");
            throw null;
        }
    }
}
