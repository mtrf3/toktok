package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.3j6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91883j6 extends FrameLayout {
    public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

    public final View LIZ() {
        java.util.Map<Integer, View> map = this.LJLIL;
        Integer valueOf = Integer.valueOf(R.id.ncs);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.ncs);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public C91883j6(Context context) {
        super(context, null, 0);
        FrameLayout.inflate(context, R.layout.c8u, this);
        ((ARV) LIZ()).setChecked(true);
    }
}
