package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.Zqa, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91188Zqa extends FrameLayout {
    public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public C91188Zqa(Context context) {
        super(context);
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            C16970lZ.LIZJ(R.layout.bve, LJIJJ, this, true);
        } else {
            C16880lQ.LLLZIIL(R.layout.bve, C16880lQ.LLZIL(context), this);
        }
    }
}
