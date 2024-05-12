package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.io.File;
import kotlin.jvm.internal.AqS36S0001000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SFv */
/* loaded from: classes13.dex */
public class C71799SFv extends C72434Sbm {
    public int LJLLLLLL;
    public int LJLZ;
    public boolean LJZ;
    public Object LJZI;
    public int LJZL;
    public final Drawable LL;
    public final Drawable LLD;
    public final SY9 LLF;
    public final Drawable LLFF;
    public final int LLFFF;
    public final int LLFII;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C71799SFv(Context context) {
        this(context, null, 6, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C71799SFv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    public final void LJIIIIZZ(Object obj) {
        o.LJIIIZ(obj, "obj");
        LJIIJ(this, obj, null, false, null, 126);
    }

    public final void LJIIJJI() {
        S3I s3i = new S3I();
        s3i.LIZ = true;
        if (this.LJZ) {
            s3i.LIZIZ = getAvatarStrokeWidth();
            if (this.LJZL == 2) {
                s3i.LIZJ = this.LLFFF;
            }
        }
        setCircleOptions(new S3L(s3i));
    }

    public final float getAvatarStrokeWidth() {
        Number number;
        if (this.LJLLLLLL < 64) {
            number = Double.valueOf(0.5d);
        } else {
            number = 1;
        }
        return C32151Nz.LJIIZILJ(number);
    }

    public final int getAvatarBorderColor() {
        return this.LLFFF;
    }

    public final int getSizePx() {
        return this.LJLZ;
    }

    public final int getSizeVariant() {
        return this.LJLLLLLL;
    }

    public final void setSize(int i) {
        setSizeVariant(i);
        requestLayout();
    }

    public final void setSizePx(int i) {
        this.LJLZ = i;
    }

    public final void setSizeVariant(int i) {
        this.LJLLLLLL = i;
        int LIZIZ = C7MY.LIZIZ(i);
        this.LJLZ = LIZIZ;
        C78897Uxp.LJJJJL(this, LIZIZ / 2.0f);
        requestLayout();
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LJLZ;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            i3 = size;
        }
        int i4 = this.LJLZ;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            i4 = size2;
        }
        setMeasuredDimension(i3, i4);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        o.LJII(this.LLFF, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) this.LLFF).setStroke((int) getAvatarStrokeWidth(), this.LLFII);
        this.LLFF.setBounds(0, 0, measuredWidth, measuredHeight);
        this.LLF.LJI(measuredWidth);
        this.LLF.LIZLLL(measuredHeight);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71799SFv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLLLLLL = 64;
        this.LJLZ = C7MY.LIZIZ(64);
        this.LJZ = true;
        this.LJZI = "";
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.m6, R.attr.m7, R.attr.m8, R.attr.m9, R.attr.bpx}, i, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…tarView, defStyleAttr, 0)");
        setSizeVariant(obtainStyledAttributes.getInt(4, 64));
        this.LLFFF = obtainStyledAttributes.getColor(0, -7829368);
        int color = obtainStyledAttributes.getColor(2, 0);
        this.LLFII = color;
        this.LL = new ColorDrawable(obtainStyledAttributes.getColor(3, 0));
        SY9 LIZ = C79234V7u.LJJJJI(new AqS36S0001000_12(obtainStyledAttributes.getResourceId(1, 0), 2)).LIZ(context);
        this.LLF = LIZ;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LJ = Integer.valueOf(color);
        c110614Vt.LIZLLL = Integer.valueOf((int) getAvatarStrokeWidth());
        c110614Vt.LIZJ = C61328O5c.LIZJ(200);
        Drawable LIZ2 = c110614Vt.LIZ(context);
        this.LLFF = LIZ2;
        this.LLD = C26338AVi.LJIIJ(LIZ2, LIZ);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C71799SFv(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            r0 = r4 & 4
            if (r0 == 0) goto L10
            r0 = 2130968866(0x7f040122, float:1.7546398E38)
        Lc:
            r1.<init>(r2, r3, r0)
            return
        L10:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71799SFv.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public static /* synthetic */ void LJIIJ(C71799SFv c71799SFv, Object obj, String str, boolean z, InterfaceC70769Rq1 interfaceC70769Rq1, int i) {
        boolean z2;
        boolean z3;
        InterfaceC70769Rq1 interfaceC70769Rq12 = interfaceC70769Rq1;
        String str2 = str;
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            z4 = false;
        }
        if ((i & 32) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 64) != 0) {
            interfaceC70769Rq12 = null;
        }
        c71799SFv.LJIIIZ(obj, z2, null, str2, z4, z3, interfaceC70769Rq12);
    }

    public final void LJIIIZ(Object obj, boolean z, int[] iArr, String str, boolean z2, boolean z3, InterfaceC70769Rq1 interfaceC70769Rq1) {
        W5F LJII;
        Drawable drawable;
        o.LJIIIZ(obj, "obj");
        this.LJZI = obj;
        this.LJZ = z3;
        if (z2) {
            LJII = W5U.LJII(obj);
        } else if (obj instanceof Integer) {
            LJII = W5U.LJ(((Number) obj).intValue());
        } else if (obj instanceof File) {
            LJII = W5U.LJI((File) obj);
            o.LJIIIIZZ(LJII, "load(obj)");
        } else if (obj instanceof String) {
            LJII = W5U.LJIIIIZZ((String) obj);
            o.LJIIIIZZ(LJII, "load(obj)");
        } else if (obj instanceof android.net.Uri) {
            LJII = W5U.LJFF((android.net.Uri) obj);
        } else if (obj instanceof C62562cu) {
            LJII = W5U.LJIIIZ((C62562cu) obj);
        } else {
            LJII = W5U.LJII(obj);
        }
        if (iArr != null) {
            LJII.LJIILIIL(iArr);
        }
        int i = this.LJLZ;
        LJII.LJII = i;
        LJII.LJIIIIZZ = i;
        LJII.LIZIZ(str);
        LJII.LJIILIIL = this.LL;
        if (this.LJZ) {
            drawable = this.LLD;
        } else {
            drawable = this.LLF;
        }
        LJII.LJIILLIIL = drawable;
        LJII.LJJIJIIJIL = z;
        LJII.LJJIIJ = this;
        LJII.LIZLLL(new C71798SFu(interfaceC70769Rq1, this));
    }
}
