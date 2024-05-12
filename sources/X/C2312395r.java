package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.95r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2312395r extends LinearLayout {
    public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

    public C2312395r(Context context) {
        super(context, null, 0);
        int i;
        if (C238309Ww.LIZJ()) {
            i = R.layout.c86;
        } else {
            i = R.layout.c85;
        }
        C16880lQ.LLLZIIL(i, C16880lQ.LLZIL(getContext()), this);
    }
}
