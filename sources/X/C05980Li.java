package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.0Li, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05980Li extends FrameLayout {
    public C47171tB LJLIL;
    public View LJLILLLLZI;

    public final View getIconBlackShape() {
        return this.LJLILLLLZI;
    }

    public final C47171tB getIconView() {
        return this.LJLIL;
    }

    public final void setIconBlackShape(View view) {
        this.LJLILLLLZI = view;
    }

    public final void setIconView(C47171tB c47171tB) {
        this.LJLIL = c47171tB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05980Li(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        FrameLayout.inflate(context, R.layout.dit, this);
        this.LJLIL = (C47171tB) findViewById(R.id.ecz);
        this.LJLILLLLZI = findViewById(R.id.am1);
        if (C15380j0.LJIIZILJ()) {
            View view = this.LJLILLLLZI;
            if (view == null) {
                return;
            }
            view.setBackground(C04270Et.LIZIZ(context, R.drawable.db5));
            return;
        }
        View view2 = this.LJLILLLLZI;
        if (view2 == null) {
            return;
        }
        view2.setBackground(C04270Et.LIZIZ(context, R.drawable.db4));
    }
}
