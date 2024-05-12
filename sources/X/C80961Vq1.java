package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Vq1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80961Vq1 extends View {
    public C80964Vq4 LJLIL;

    public final C80964Vq4 getSkeletonElement() {
        return this.LJLIL;
    }

    public final void setSkeletonElement(C80964Vq4 c80964Vq4) {
        o.LJIIIZ(c80964Vq4, "<set-?>");
        this.LJLIL = c80964Vq4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80961Vq1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new C80964Vq4();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a6h, R.attr.a6i, R.attr.a6j, R.attr.a6l, R.attr.a6m, R.attr.a6n});
            this.LJLIL.LIZLLL = obtainStyledAttributes.getColor(0, -3355444);
            this.LJLIL.LJ = obtainStyledAttributes.getColor(1, -7829368);
            C80964Vq4 c80964Vq4 = this.LJLIL;
            obtainStyledAttributes.getColor(2, -3355444);
            c80964Vq4.getClass();
            this.LJLIL.LIZ = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            C80964Vq4 c80964Vq42 = this.LJLIL;
            c80964Vq42.LIZIZ = obtainStyledAttributes.getDimensionPixelSize(4, c80964Vq42.LIZ);
            C80964Vq4 c80964Vq43 = this.LJLIL;
            c80964Vq43.LIZJ = obtainStyledAttributes.getDimensionPixelSize(5, c80964Vq43.LIZ);
            obtainStyledAttributes.recycle();
        }
    }
}
