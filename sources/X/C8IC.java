package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8IC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8IC extends FrameLayout {
    public final boolean LJLIL;
    public final A92 LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8IC(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setAccessibilityClickActionLabel(CharSequence charSequence) {
        this.LJLILLLLZI.LIZ = charSequence;
    }

    public final void setAccessibilityClickActionRunnable(Runnable runnable) {
        this.LJLILLLLZI.LIZIZ = runnable;
    }

    public final void setMessage(String str) {
        ((TextView) LIZ(R.id.message_tv)).setText(str);
        View LIZ = LIZ(R.id.message_tv);
        int i = 0;
        if (str == null || str.length() <= 0) {
            i = 8;
        }
        LIZ.setVisibility(i);
        setContentDescription(str);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.LJLIL) {
            if (i == 0) {
                ((C223338pd) LIZ(R.id.g85)).LIZIZ();
            } else {
                ((C223338pd) LIZ(R.id.g85)).LIZJ();
            }
        }
    }

    public final void setMessage(int i) {
        String string = getResources().getString(i);
        o.LJIIIIZZ(string, "resources.getString(messageId)");
        ((TextView) LIZ(R.id.message_tv)).setText(string);
        setContentDescription(string);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8IC(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r0 = r12 & 2
            if (r0 == 0) goto L5
            r11 = 0
        L5:
            r2 = 4
            r0 = r12 & 4
            r5 = 0
            if (r0 == 0) goto Lb2
            r1 = 2130968886(0x7f040136, float:1.7546438E38)
        Le:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r10, r0)
            r9.LJLJI = r0
            r9.<init>(r10, r11, r1)
            X.A92 r4 = new X.A92
            r4.<init>()
            r9.LJLILLLLZI = r4
            r3 = 1
            r9.LJLIL = r3
            r0 = 2131558426(0x7f0d001a, float:1.8742167E38)
            android.view.View.inflate(r10, r0, r9)
            r0 = 5
            int[] r0 = new int[r0]
            r0 = {x00b6: FILL_ARRAY_DATA , data: [2130969063, 2130969064, 2130969065, 2130969066, 2130971928} // fill-array
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r11, r0, r1, r5)
            java.lang.String r0 = "context.obtainStyledAttr…dingHUD, defStyleAttr, 0)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r8 = X.C16880lQ.LLLZLZ(r1, r2)
            r0 = 3
            int r7 = r1.getInt(r0, r5)
            r0 = 2
            int r2 = r1.getColor(r0, r5)
            int r6 = r1.getColor(r5, r5)
            r0 = 0
            float r5 = r1.getDimension(r3, r0)
            r1.recycle()
            r1 = 2131371336(0x7f0a2548, float:1.8362704E38)
            android.view.View r0 = r9.LIZ(r1)
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r0.setTuxFont(r7)
            android.view.View r0 = r9.LIZ(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setTextColor(r2)
            r9.setMessage(r8)
            r0 = 2131371319(0x7f0a2537, float:1.836267E38)
            android.view.View r2 = r9.LIZ(r0)
            X.4Vt r1 = new X.4Vt
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1.LIZ = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            r1.LIZJ = r0
            android.graphics.drawable.Drawable r0 = r1.LIZ(r10)
            r2.setBackground(r0)
            int r1 = r9.getVisibility()
            r0 = 2131370925(0x7f0a23ad, float:1.836187E38)
            if (r1 != 0) goto La8
            android.view.View r0 = r9.LIZ(r0)
            X.8pd r0 = (X.C223338pd) r0
            r0.LIZIZ()
        L9b:
            int r0 = r9.getImportantForAccessibility()
            if (r0 != 0) goto La4
            r9.setImportantForAccessibility(r3)
        La4:
            o3.h0.LJIJI(r9, r4)
            return
        La8:
            android.view.View r0 = r9.LIZ(r0)
            X.8pd r0 = (X.C223338pd) r0
            r0.LIZJ()
            goto L9b
        Lb2:
            r1 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8IC.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
