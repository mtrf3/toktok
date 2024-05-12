package X;

import Y.ACListenerS34S0100000_14;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.ViY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80498ViY extends T5T implements TextWatcher {
    public boolean LJLJJLL;
    public Boolean LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public final int LJLLILLLL;
    public final int LJLLJ;
    public final int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public final int LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public int LL;
    public View.OnClickListener LLD;
    public InterfaceC80500Via LLF;

    public final void LJIIIIZZ() {
        setTextIsSelectable(false);
        super.setOnClickListener(new ACListenerS34S0100000_14(this, 5));
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final Rect getCharBounds() {
        return (Rect) this.LJZL.getValue();
    }

    private final Paint getCursorPaint() {
        return (Paint) this.LJZI.getValue();
    }

    private final Paint getLinePaint() {
        return (Paint) this.LJZ.getValue();
    }

    public final void LJI() {
        super.setCustomSelectionActionModeCallback(new ActionModeCallbackC80499ViZ());
    }

    private final void getNumberHeight() {
        boolean z;
        Editable text = getText();
        if (text != null && text.length() == 0) {
            z = true;
            this.LJLJLLL = false;
            setText(CardStruct.IStatusCode.DEFAULT);
            this.LJLJLLL = true;
        } else {
            z = false;
        }
        getCharBounds().setEmpty();
        getPaint().getTextBounds(String.valueOf(getText()), 0, 1, getCharBounds());
        this.LJLLI = getCharBounds().bottom - getCharBounds().top;
        if (z) {
            setText("");
        }
    }

    public final void LJII() {
        getLinePaint().setColor(this.LJLLILLLL);
        invalidate();
    }

    public final void LJIIIZ() {
        getLinePaint().setColor(this.LJLLJ);
        invalidate();
    }

    public final InterfaceC80500Via getCallback() {
        return this.LLF;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i;
        InterfaceC80500Via interfaceC80500Via;
        InterfaceC80500Via interfaceC80500Via2;
        Integer num;
        if (this.LLF == null) {
            return;
        }
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        if (this.LJLJLLL && i > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("length is: ");
            if (editable != null) {
                num = Integer.valueOf(editable.length());
            } else {
                num = null;
            }
            LIZ.append(num);
            LIZ.append(", s is ");
            LIZ.append((Object) editable);
            X1D.LIZIZ(LIZ);
            InterfaceC80500Via interfaceC80500Via3 = this.LLF;
            if (interfaceC80500Via3 != null) {
                interfaceC80500Via3.LLFZ();
            }
            this.LJLJLLL = false;
        }
        int i2 = this.LJLJLJ;
        if (i2 > 0 && i >= 0 && i2 > i && (interfaceC80500Via2 = this.LLF) != null) {
            interfaceC80500Via2.LJJLIL(String.valueOf(editable));
        }
        if ((!o.LJ(this.LJLJL, Boolean.TRUE) || this.LJLJJLL) && i > 0 && i == this.LJLLLL && (interfaceC80500Via = this.LLF) != null) {
            String lowerCase = s.LJZI(String.valueOf(editable)).toString().toLowerCase();
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
            interfaceC80500Via.LJLL(lowerCase);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r27) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80498ViY.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        this.LJLJL = Boolean.TRUE;
        super.onRestoreInstanceState(parcelable);
        this.LJLJL = Boolean.FALSE;
    }

    public final void setCallback(InterfaceC80500Via interfaceC80500Via) {
        this.LLF = interfaceC80500Via;
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        super.setGravity(i);
        this.LL = i;
    }

    public final void setInputLength(int i) {
        if (i <= 0) {
            return;
        }
        this.LJLLLLLL = 0;
        this.LJLLLL = i;
        OPT.LIZ(this, i);
        invalidate();
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        int i2;
        super.setInputType(i);
        if (C16310kV.LIZLLL(this) == 1) {
            if (i == 2) {
                i2 = 8388613;
            } else {
                i2 = this.LL;
            }
            setGravity(i2);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LLD = onClickListener;
    }

    public final void setTextAndAutoCheck(CharSequence charSequence) {
        this.LJLJJLL = true;
        setText(charSequence);
        this.LJLJJLL = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80498ViY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.jy);
        int i;
        Integer num;
        int i2;
        int i3;
        a1.LJFF(context, "context");
        this.LJLJLLL = true;
        this.LJZ = C221108m2.LIZIZ(DIO.LJLIL);
        this.LJZI = C221108m2.LIZIZ(DIN.LJLIL);
        this.LJZL = C221108m2.LIZIZ(C80501Vib.LJLIL);
        setBackgroundResource(0);
        if (attributeSet != null) {
            i = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLength", 4);
        } else {
            i = 4;
        }
        this.LJLLLL = i;
        if (attributeSet != null) {
            num = Integer.valueOf(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColor", R.attr.go));
        } else {
            num = null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a8p, R.attr.a8r, R.attr.ac0, R.attr.aez, R.attr.aof, R.attr.aog, R.attr.aoi});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr….styleable.CodeInputView)");
        int color = obtainStyledAttributes.getColor(4, -16777216);
        this.LJLLILLLL = color;
        int color2 = obtainStyledAttributes.getColor(0, -65536);
        this.LJLLJ = obtainStyledAttributes.getColor(2, -65536);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, C17N.LJIILL(2.0d));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(5, C17N.LJIILL(1.0d));
        this.LJLLL = obtainStyledAttributes.getDimensionPixelSize(3, C17N.LJIILL(10.0d));
        this.LJLZ = obtainStyledAttributes.getDimensionPixelSize(6, C17N.LJIILL(5.0d));
        obtainStyledAttributes.recycle();
        TextPaint paint = getPaint();
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        Integer LJI = C79045V0n.LJI(i2, context);
        if (LJI != null) {
            i3 = LJI.intValue();
        } else {
            i3 = 0;
        }
        paint.setColor(i3);
        getLinePaint().setColor(color);
        getLinePaint().setStrokeWidth(dimensionPixelSize2);
        getLinePaint().setAntiAlias(true);
        getCursorPaint().setColor(color2);
        getCursorPaint().setStrokeWidth(dimensionPixelSize);
        getCursorPaint().setAntiAlias(true);
        getCursorPaint().setStrokeCap(Paint.Cap.ROUND);
        getCursorPaint().getStrokeWidth();
        setCursorVisible(false);
        this.LL = getGravity();
        addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        if (charSequence != null) {
            i4 = charSequence.length();
        } else {
            i4 = 0;
        }
        this.LJLJLJ = i4;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 != i) {
            this.LJLLLLLL = 0;
        }
    }
}
