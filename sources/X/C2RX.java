package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2RX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2RX extends ConstraintLayout {
    public final java.util.Map<Integer, View> LJLIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2RX(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    public final View _$_findCachedViewById(int i) {
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

    public final void LJJLJLI(InterfaceC88472Yns interfaceC88472Yns) {
        View us_label_content = _$_findCachedViewById(R.id.mvd);
        o.LJIIIIZZ(us_label_content, "us_label_content");
        interfaceC88472Yns.invoke(us_label_content);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2RX(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a8s, this, true);
    }

    public /* synthetic */ C2RX(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
