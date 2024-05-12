package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6Sm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160726Sm extends RecyclerView {
    public int LLLF;
    public int LLLFF;
    public int LLLFFI;

    public final void setSecondPanel(boolean z) {
        if (z) {
            int LIZIZ = C78885Uxd.LIZIZ(false, z, false, false);
            setBackground(C78127UlP.LIZJ(LIZIZ, LIZIZ, 0, 0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160726Sm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Drawable LIZ;
        a1.LJFF(context, "context");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ym, R.attr.z5, R.attr.a3n, R.attr.ab5, R.attr.ad8, R.attr.aew, R.attr.ai5, R.attr.ai6, R.attr.ai7, R.attr.ai8, R.attr.aib, R.attr.aic, R.attr.aid, R.attr.aie, R.attr.aif, R.attr.aig, R.attr.aih, R.attr.aii, R.attr.aiz, R.attr.aj0, R.attr.aj1, R.attr.ajb, R.attr.akq, R.attr.aol, R.attr.ay2, R.attr.b1l, R.attr.b25, R.attr.b36, R.attr.b3k, R.attr.b4p, R.attr.b4q, R.attr.b8z, R.attr.b_d, R.attr.b_p, R.attr.baf, R.attr.bag, R.attr.bff, R.attr.bi_, R.attr.bii, R.attr.bin, R.attr.biw, R.attr.bj3, R.attr.bjp, R.attr.bkc, R.attr.bvl, R.attr.bvx, R.attr.bvz});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…s, R.styleable.AVDmtView)");
            boolean z = obtainStyledAttributes.getBoolean(6, false);
            this.LLLF = (int) obtainStyledAttributes.getDimension(20, 0.0f);
            this.LLLFF = (int) obtainStyledAttributes.getDimension(4, 0.0f);
            this.LLLFFI = (int) obtainStyledAttributes.getDimension(22, 0.0f);
            boolean z2 = obtainStyledAttributes.getBoolean(21, true);
            int LIZJ = (int) KL2.LIZJ(context, 2.0f);
            if (z2) {
                int i = this.LLLF;
                if (i > 0) {
                    this.LLLF = i - (LIZJ * 2);
                }
                int i2 = this.LLLFF;
                if (i2 > 0) {
                    this.LLLFF = i2 - LIZJ;
                }
                int i3 = this.LLLFFI;
                if (i3 > 0) {
                    this.LLLFFI = i3 - LIZJ;
                }
            }
            if (z && (LIZ = C78885Uxd.LIZ(context, attributeSet)) != null) {
                setBackground(LIZ);
            }
            LJII(new AbstractC030309z() { // from class: X.4gK
                @Override // X.AbstractC030309z
                public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
                    T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
                    rect.left = 20;
                    rect.right = 20;
                }
            }, -1);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
