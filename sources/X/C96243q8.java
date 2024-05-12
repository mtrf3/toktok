package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.3q8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96243q8 extends FrameLayout {
    public final java.util.Map<Integer, View> LJLIL;

    public final View LIZ() {
        java.util.Map<Integer, View> map = this.LJLIL;
        Integer valueOf = Integer.valueOf(R.id.efn);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.efn);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C96243q8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        int LJIJ = C78897Uxp.LJIJ(R.dimen.va, this);
        FrameLayout.inflate(context, R.layout.b_o, this);
        C26338AVi.LJIIIZ(this, 0, Integer.valueOf(LJIJ), 0, Integer.valueOf(LJIJ), 16);
        if (AnonymousClass636.LJIILJJIL(context)) {
            LIZ().setBackground(C04270Et.LIZIZ(context, R.drawable.bhg));
        } else {
            LIZ().setBackground(C04270Et.LIZIZ(context, R.drawable.bhf));
        }
    }
}
