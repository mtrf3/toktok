package X;

import Y.ACListenerS22S0100000_2;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.57H, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C57H extends FrameLayout {
    public boolean LJLIL;
    public C80261Vej LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    public final C80261Vej getTabLayout() {
        return this.LJLILLLLZI;
    }

    public C57H(Context context) {
        super(context, null, 0);
    }

    public final void setNullItemClick(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C16880lQ.LJIIZILJ((LinearLayout) LIZ(R.id.kyv), new ACListenerS22S0100000_2(interfaceC65784Pro, 131));
    }
}
