package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3jY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92163jY extends FrameLayout {
    public final java.util.Map<Integer, View> LJLIL;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92163jY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a7x, this, true);
    }

    public static String LIZIZ(int i, String str, boolean z) {
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            String substring = str.substring(0, Math.max(i - 1, 1));
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            LIZ.append(substring);
            LIZ.append("... ");
            return X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        String substring2 = str.substring(0, Math.max(i, 1));
        o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        LIZ2.append(substring2);
        LIZ2.append("...");
        return X1D.LIZIZ(LIZ2);
    }

    public static void LIZJ(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        spannableStringBuilder.setSpan(obj, Math.max(0, Math.min(i, i2)), Math.min(spannableStringBuilder.length(), Math.max(i, i2)), 33);
    }
}
