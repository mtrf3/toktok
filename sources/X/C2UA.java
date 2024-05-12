package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2UA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2UA extends FrameLayout {
    public C2UC LJLIL;
    public String LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

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

    public final String getDefTitle() {
        return this.LJLILLLLZI;
    }

    public final C2UC getTitleBarListener() {
        return this.LJLIL;
    }

    public final void setDefTitle(String str) {
        this.LJLILLLLZI = str;
    }

    public final void setSubTitle(String subtitle) {
        o.LJIIIZ(subtitle, "subtitle");
        ((TextView) LIZ(R.id.hxo)).setText(subtitle);
    }

    public final void setTitleBarListener(C2UC c2uc) {
        this.LJLIL = c2uc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2UA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dsn, this, true);
    }
}
