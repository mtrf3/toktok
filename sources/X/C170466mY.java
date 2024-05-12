package X;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6mY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170466mY extends C8H9 {
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;
    public Typeface LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C170466mY(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final void LJJIJLIJ() {
        if (this.LJLLL == null) {
            this.LJLLL = C78882Uxa.LIZ(EnumC49617Jdd.MEDIUM.getFONT_NAME());
        }
        Typeface typeface = this.LJLLL;
        if (typeface != null) {
            setTypeface(typeface);
        } else {
            setTypeface(getTypeface(), 1);
        }
    }

    public final void LJJIJIL() {
        if (C82852WfQ.LIZ().LJFF) {
            setTextSize(12.0f);
            LJJIJLIJ();
        } else {
            setTextSize(11.0f);
            setTypeface(Typeface.defaultFromStyle(0));
        }
    }

    public final void LJJIJL(boolean z) {
        this.LJLLLLLL = z;
        if (z) {
            if (this.LJLJL) {
                setTextColor(this.LJLLILLLL);
                return;
            }
            return;
        }
        setTextColor(this.LJLL);
    }

    public final void setEnableUI(boolean z) {
        if (z) {
            if (this.LJLLLLLL) {
                if (this.LJLJL) {
                    setTextColor(this.LJLLILLLL);
                    return;
                }
                return;
            }
            setTextColor(this.LJLL);
            return;
        }
        Context context = getContext();
        o.LJIIIIZZ(context, "this.context");
        setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dm, context));
    }

    public final void setOldPanelStyle(boolean z) {
        int i = C78885Uxd.LIZIZ;
        this.LJLL = i;
        int LIZJ = C78885Uxd.LIZJ(i);
        this.LJLLI = LIZJ;
        if (this.LJLJLLL) {
            LIZJ = this.LJLL;
        }
        setTextColor(LIZJ);
    }

    public final void setSelectTextColor(int i) {
        this.LJLL = i;
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        if (this.LJLJLJ) {
            if (z) {
                i = this.LJLL;
            } else {
                i = this.LJLLI;
            }
            setTextColor(i);
        }
    }

    public final void setStatusTextColor(int i) {
        this.LJLLILLLL = i;
        LJJIJL(this.LJLLLLLL);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C170466mY(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r4 = 2
            r0 = r8 & 2
            if (r0 == 0) goto L6
            r7 = 0
        L6:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r6, r0)
            r2 = 0
            r5.<init>(r6, r7, r2)
            r3 = 1
            r5.LJLJL = r3
            r5.LJLJLLL = r3
            r5.LJLLJ = r3
            X.Jdd r0 = X.EnumC49617Jdd.MEDIUM
            java.lang.String r0 = r0.getFONT_NAME()
            android.graphics.Typeface r0 = X.C78882Uxa.LIZ(r0)
            r5.LJLLL = r0
            if (r7 == 0) goto L65
            r0 = 47
            int[] r0 = new int[r0]
            r0 = {x009a: FILL_ARRAY_DATA , data: [2130969421, 2130969440, 2130969607, 2130969921, 2130969998, 2130970060, 2130970180, 2130970181, 2130970182, 2130970183, 2130970187, 2130970188, 2130970189, 2130970190, 2130970191, 2130970192, 2130970193, 2130970194, 2130970211, 2130970212, 2130970213, 2130970224, 2130970276, 2130970419, 2130970768, 2130970899, 2130970919, 2130970957, 2130970972, 2130971014, 2130971015, 2130971172, 2130971224, 2130971236, 2130971263, 2130971264, 2130971448, 2130971553, 2130971562, 2130971567, 2130971576, 2130971583, 2130971606, 2130971630, 2130972046, 2130972058, 2130972060} // fill-array
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r7, r0)
            java.lang.String r0 = "context.obtainStyledAttr…s, R.styleable.AVDmtView)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 27
            r1.getBoolean(r0, r2)
            boolean r0 = r1.getBoolean(r4, r3)
            r5.LJLJL = r0
            r0 = 7
            r1.getBoolean(r0, r2)
            r0 = 10
            boolean r0 = r1.getBoolean(r0, r2)
            r5.LJLJLJ = r0
            r0 = 11
            boolean r0 = r1.getBoolean(r0, r3)
            r5.LJLJLLL = r0
            r0 = 6
            boolean r0 = r1.getBoolean(r0, r3)
            r5.LJLLJ = r0
            r0 = 34
            boolean r0 = r1.getBoolean(r0, r2)
            r5.LJLLLL = r0
            r1.recycle()
        L65:
            boolean r0 = r5.LJLLLL
            if (r0 == 0) goto L70
            android.graphics.drawable.Drawable r0 = X.C78885Uxd.LIZ(r6, r7)
            r5.setBackgroundDrawable(r0)
        L70:
            android.content.Context r1 = r5.getContext()
            java.lang.String r0 = "this.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 2130968670(0x7f04005e, float:1.7546E38)
            int r0 = X.AnonymousClass636.LJIIIIZZ(r0, r1)
            r5.LJLLILLLL = r0
            int r0 = X.C78885Uxd.LIZIZ
            r5.LJLL = r0
            int r1 = X.C78885Uxd.LIZJ(r0)
            r5.LJLLI = r1
            boolean r0 = r5.LJLLJ
            if (r0 == 0) goto L99
            boolean r0 = r5.LJLJLLL
            if (r0 == 0) goto L96
            int r1 = r5.LJLL
        L96:
            r5.setTextColor(r1)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170466mY.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
