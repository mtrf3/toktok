package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LBw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53860LBw extends FrameLayout {
    public boolean LJLIL;
    public float LJLILLLLZI;
    public final int LJLJI;
    public final C53861LBx LJLJJI;
    public final java.util.Map<Integer, View> LJLJJL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53860LBw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final AbstractC26257ASf getBottomSheetCallback() {
        return this.LJLJJI;
    }

    public final void LIZ(EnumC53863LBz enumC53863LBz) {
        Drawable di8;
        int i = C53862LBy.LIZ[enumC53863LBz.ordinal()];
        if (i != 1) {
            if (i != 2) {
                di8 = new DI6(this.LJLJI);
            } else {
                di8 = new DI7(this.LJLJI);
            }
        } else {
            di8 = new DI8(this.LJLJI);
        }
        java.util.Map<Integer, View> map = this.LJLJJL;
        View view = map.get(Integer.valueOf(R.id.jw2));
        if (view == null) {
            view = findViewById(R.id.jw2);
            if (view != null) {
                map.put(Integer.valueOf(R.id.jw2), view);
            } else {
                view = null;
            }
        }
        ((ImageView) view).setImageDrawable(di8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C53860LBw(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r0 = r8 & 2
            r4 = 0
            if (r0 == 0) goto L6
            r7 = r4
        L6:
            r0 = r8 & 4
            r3 = 2130968898(0x7f040142, float:1.7546463E38)
            r2 = 0
            if (r0 == 0) goto L4f
            r1 = 2130968898(0x7f040142, float:1.7546463E38)
        L11:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r6, r0)
            r5.LJLJJL = r0
            r5.<init>(r6, r7, r1)
            r0 = 22
            int[] r0 = new int[r0]
            r0 = {x0052: FILL_ARRAY_DATA , data: [2130969124, 2130969125, 2130969126, 2130969127, 2130969128, 2130969129, 2130969130, 2130969131, 2130969132, 2130969133, 2130969134, 2130969135, 2130969136, 2130969137, 2130969138, 2130969139, 2130969140, 2130969141, 2130969142, 2130969143, 2130969144, 2130969145} // fill-array
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r4, r0, r3, r2)
            java.lang.String r0 = "context.obtainStyledAttr…uxSheetStyle, 0\n        )"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 9
            int r0 = r1.getColor(r0, r2)
            r5.LJLJI = r0
            r1.recycle()
            X.LBx r0 = new X.LBx
            r0.<init>(r5)
            r5.LJLJJI = r0
            android.view.LayoutInflater r2 = X.C16880lQ.LLZIL(r6)
            r1 = 2131558431(0x7f0d001f, float:1.8742178E38)
            r0 = 1
            X.C16880lQ.LLLLIILL(r2, r1, r5, r0)
            X.LBz r0 = X.EnumC53863LBz.DEFAULT
            r5.LIZ(r0)
            return
        L4f:
            r1 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53860LBw.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
