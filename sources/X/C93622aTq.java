package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS175S0200000_42;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aTq, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93622aTq extends LinearLayout {
    public C011602u LJLIL;
    public String LJLILLLLZI;

    public final TextView getLabelText() {
        o.LJIJI("labelText");
        throw null;
    }

    public final C011602u getSwitch() {
        C011602u c011602u = this.LJLIL;
        if (c011602u != null) {
            return c011602u;
        }
        o.LJIJI("switch");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93622aTq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        this.LJLILLLLZI = "";
        setOrientation(0);
        if (attributeSet != null) {
            try {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.akk});
                String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 0);
                this.LJLILLLLZI = LLLZLZ != null ? LLLZLZ : "";
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
            } catch (Exception unused) {
            }
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setLayoutParams(C93902aYM.LIZJ(this, 0, -2, 0, 0, null, Integer.valueOf(C93410aQQ.LIZIZ(12)), null, null, Float.valueOf(1.0f), 16, 220));
        new IDqS175S0200000_42(this, context, 14).invoke(appCompatTextView);
        C93902aYM.LIZ(appCompatTextView, this);
        C94257ae5 c94257ae5 = new C94257ae5(context);
        c94257ae5.setLayoutParams(C93902aYM.LIZJ(this, C93410aQQ.LIZIZ(48), C93410aQQ.LIZIZ(28), 0, 0, null, null, null, null, null, 16, 508));
        new IDqS419S0100000_42(this, 72).invoke(c94257ae5);
        C93902aYM.LIZ(c94257ae5, this);
    }
}
