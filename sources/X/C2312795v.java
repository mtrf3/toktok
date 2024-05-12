package X;

import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.95v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2312795v extends LinearLayout {
    public InterfaceC65784Pro<C76800UCe> LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    public final InterfaceC65784Pro<C76800UCe> getOnCloseListener() {
        return this.LJLIL;
    }

    public C2312795v(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, null, 0);
        View.inflate(activityC45651qj, R.layout.cmu, this);
    }

    public final void setOnCloseListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
    }
}
