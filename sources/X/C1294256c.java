package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.56c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1294256c extends TuxTextView {
    public int LJLLLL;
    public final java.util.Map<Integer, View> LJLLLLLL;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJLLLLLL;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final void LJJJIL(int i) {
        if (this.LJLLLL <= 0) {
            return;
        }
        String LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%s/%s", Arrays.copyOf(new Object[]{Integer.valueOf((i % this.LJLLLL) + 1), Integer.valueOf(this.LJLLLL)}, 2));
        o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
        setText(LLLZI);
    }

    public final void setRealSize(int i) {
        if (i > 0) {
            this.LJLLLL = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1294256c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        this.LJLLLLLL = C62850Ola.LJFF(context, "context");
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dk, context2));
        setTuxFont(33);
    }
}
