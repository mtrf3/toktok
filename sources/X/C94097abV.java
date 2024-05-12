package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.abV, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94097abV extends ConstraintLayout {
    public final EditText LJLIL;

    public final EditText getEditText() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94097abV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        C16880lQ.LLLZIIL(R.layout.dvr, C16880lQ.LLZIL(context), this);
        int i = R.id.cps;
        EditText editText = (EditText) findViewById(R.id.cps);
        if (editText != null) {
            i = R.id.np0;
            if (findViewById(R.id.np0) != null) {
                this.LJLIL = editText;
                setBackgroundResource(R.drawable.dga);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }
}
