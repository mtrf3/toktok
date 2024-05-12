package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9Ge, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C233969Ge extends FrameLayout {
    public final java.util.Map<Integer, View> LJLIL;

    public final View LIZ() {
        java.util.Map<Integer, View> map = this.LJLIL;
        Integer valueOf = Integer.valueOf(R.id.ag6);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.ag6);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final String getBalanceTextValue() {
        return ((AppCompatTextView) LIZ()).getText().toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C233969Ge(Context context) {
        super(context, null, 0);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        OUP.LJIL(R.layout.a1i, this, true);
    }

    public final void setBalanceTextColor(int i) {
        ((TextView) LIZ()).setTextColor(i);
    }

    public final void setBalanceTextValue(String content) {
        o.LJIIIZ(content, "content");
        ((TextView) LIZ()).setText(content);
    }
}
