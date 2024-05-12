package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Smu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73124Smu extends RecyclerView {
    public int LLLF;
    public int LLLFF;
    public int LLLFFI;
    public int LLLFZ;
    public boolean LLLI;
    public C73123Smt LLLII;

    public C73124Smu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LJLJJL() {
        AbstractC030309z abstractC030309z = this.LLLII;
        if (abstractC030309z != null) {
            LJJLIL(abstractC030309z);
        }
        if (this.LLLI) {
            int i = this.LLLF;
            if (i > 0) {
                this.LLLF = i - (this.LLLFZ * 2);
            }
            int i2 = this.LLLFF;
            if (i2 > 0) {
                this.LLLFF = i2 - this.LLLFZ;
            }
            int i3 = this.LLLFFI;
            if (i3 > 0) {
                this.LLLFFI = i3 - this.LLLFZ;
            }
        }
        if (this.LLLF != 0 || this.LLLFF != 0 || this.LLLFFI != 0) {
            C73123Smt c73123Smt = new C73123Smt(this);
            LJII(c73123Smt, -1);
            this.LLLII = c73123Smt;
        }
    }

    public final void setItemMargin(int i) {
        this.LLLF = i;
        LJLJJL();
    }

    public final void setItemShowBorder(boolean z) {
        this.LLLI = z;
        LJLJJL();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C73124Smu(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r0 = r8 & 2
            if (r0 == 0) goto L5
            r7 = 0
        L5:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            r1 = 0
            r5.<init>(r6, r7, r1)
            r4 = 1073741824(0x40000000, float:2.0)
            float r0 = X.C74275TDb.LIZIZ(r6, r4)
            int r0 = (int) r0
            r5.LLLFZ = r0
            r3 = 1
            r5.LLLI = r3
            android.graphics.drawable.GradientDrawable r0 = X.C78880UxY.LJJLJ(r6, r7, r1)
            if (r0 == 0) goto L23
            r5.setBackground(r0)
        L23:
            if (r7 == 0) goto L68
            r0 = 27
            int[] r0 = new int[r0]
            r0 = {x0074: FILL_ARRAY_DATA , data: [2130971665, 2130971666, 2130971667, 2130971668, 2130971669, 2130971670, 2130971671, 2130971672, 2130971673, 2130971674, 2130971675, 2130971676, 2130971677, 2130971678, 2130971679, 2130971680, 2130971681, 2130971682, 2130971683, 2130971684, 2130971685, 2130971686, 2130971687, 2130971688, 2130971689, 2130971690, 2130971691} // fill-array
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r7, r0)
            java.lang.String r0 = "context.obtainStyledAttr…styleable.ToolsStyleView)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r0 = 10
            r1 = 0
            float r0 = r2.getDimension(r0, r1)
            int r0 = (int) r0
            r5.LLLF = r0
            r0 = 6
            float r0 = r2.getDimension(r0, r1)
            int r0 = (int) r0
            r5.LLLFF = r0
            r0 = 12
            float r0 = r2.getDimension(r0, r1)
            int r0 = (int) r0
            r5.LLLFFI = r0
            float r1 = X.C74275TDb.LIZIZ(r6, r4)
            r0 = 15
            float r0 = r2.getDimension(r0, r1)
            int r0 = (int) r0
            r5.LLLFZ = r0
            r0 = 11
            boolean r0 = r2.getBoolean(r0, r3)
            r5.LLLI = r0
            r2.recycle()
        L68:
            r5.LJLJJL()
            X.0gh r0 = new X.0gh
            r0.<init>()
            r5.addOnAttachStateChangeListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73124Smu.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
