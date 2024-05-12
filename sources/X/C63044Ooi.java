package X;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Ooi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63044Ooi extends C013603o implements AEZ {
    public static final int LJLJL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
    public final boolean LJLJJL;
    public InterfaceC65784Pro<Boolean> LJLJJLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C63044Ooi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // android.widget.RadioButton, android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLJJLL;
        if (interfaceC65784Pro == null || !interfaceC65784Pro.invoke().booleanValue()) {
            super.toggle();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        float f;
        super.setEnabled(z);
        if (this.LJLJJL) {
            if (isEnabled()) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            setAlpha(f);
        }
    }

    @Override // X.AEZ
    public void setInterceptToggleListener(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LJLJJLL = interfaceC65784Pro;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C63044Ooi(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r0 = r11 & 2
            r5 = 0
            if (r0 == 0) goto L6
            r10 = r5
        L6:
            r0 = r11 & 4
            r7 = 0
            if (r0 == 0) goto L75
            r1 = 2130968893(0x7f04013d, float:1.7546452E38)
        Le:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r9, r0)
            r8.<init>(r9, r10, r1)
            r0 = 3
            int[] r0 = new int[r0]
            r0 = {x0078: FILL_ARRAY_DATA , data: [2130971947, 2130971948, 2130971949} // fill-array
            android.content.res.TypedArray r1 = r9.obtainStyledAttributes(r10, r0, r1, r7)
            java.lang.String r0 = "context.obtainStyledAttr…uxRadio, defStyleAttr, 0)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r6 = r1.getColor(r7, r7)
            r0 = 2
            int r4 = r1.getColor(r0, r7)
            r0 = 1
            int r3 = r1.getColor(r0, r7)
            r1.recycle()
            r8.LJLJJL = r0
            android.graphics.drawable.StateListDrawable r2 = new android.graphics.drawable.StateListDrawable
            r2.<init>()
            int[] r1 = new int[r0]
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            r1[r7] = r0
            X.DIQ r0 = new X.DIQ
            r0.<init>(r6)
            r2.addState(r1, r0)
            int[] r1 = new int[r7]
            X.DIR r0 = new X.DIR
            r0.<init>(r4, r3)
            r2.addState(r1, r0)
            r8.setButtonDrawable(r2)
            boolean r0 = r8.isEnabled()
            if (r0 == 0) goto L71
            r0 = 1065353216(0x3f800000, float:1.0)
        L61:
            r8.setAlpha(r0)
            r8.setBackground(r5)
            int r0 = X.C63044Ooi.LJLJL
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            X.C78897Uxp.LJJJJJL(r8, r1)
            return
        L71:
            r0 = 1051595899(0x3eae147b, float:0.34)
            goto L61
        L75:
            r1 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63044Ooi.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
