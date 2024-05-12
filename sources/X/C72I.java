package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.72I, reason: invalid class name */
/* loaded from: classes4.dex */
public class C72I extends ConstraintLayout {
    public final View LJLIL;

    public void setOnClickCloseListener(C72K c72k) {
    }

    public C72I(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C72I(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        if (((Boolean) C72J.LIZ.getValue()).booleanValue() && (context instanceof Activity)) {
            this.LJLIL = C16970lZ.LIZJ(R.layout.adk, C45804HyK.LJIJJ(context), this, true);
        } else {
            this.LJLIL = C16880lQ.LLLZIIL(R.layout.adk, C16880lQ.LLZIL(context), this);
        }
        this.LJLIL.findViewById(R.id.gjt);
        this.LJLIL.findViewById(R.id.gjr);
        this.LJLIL.findViewById(R.id.gjs);
        this.LJLIL.findViewById(R.id.gju);
        this.LJLIL.findViewById(R.id.gjq);
    }
}
