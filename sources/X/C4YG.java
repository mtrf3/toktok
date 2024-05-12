package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.4YG, reason: invalid class name */
/* loaded from: classes2.dex */
public class C4YG extends C109934Td {
    public final String LJLJLLL;
    public boolean LJLL;
    public final SY9 LJLLI;
    public final SY9 LJLLILLLL;
    public InterfaceC111014Xh LJLLJ;

    public final void LJIIIZ(boolean z) {
        SY9 sy9;
        if (this.LJLL && z) {
            sy9 = this.LJLLI;
        } else {
            sy9 = null;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        o.LJIIIIZZ(compoundDrawablesRelative, "compoundDrawablesRelative");
        setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], sy9, compoundDrawablesRelative[3]);
    }

    @Override // X.C19K, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        try {
            if (i == 16908322) {
                boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
                if (onTextContextMenuItem) {
                    Editable text = getText();
                    o.LJI(text);
                    if (text.length() <= 1024) {
                        C118824lS.LIZJ(this, null);
                    }
                }
                return onTextContextMenuItem;
            }
            return super.onTextContextMenuItem(i);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Integer num;
        o.LJIIIZ(event, "event");
        if (event.getAction() == 1) {
            Drawable drawable = getCompoundDrawablesRelative()[2];
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                if (drawable != null) {
                    if (event.getX() >= getPaddingLeft() + getLeft()) {
                        if (event.getX() <= drawable.getBounds().width() + getPaddingLeft() + getLeft()) {
                            setText("");
                        }
                    }
                }
            } else if (drawable != null && event.getX() <= getWidth() - getPaddingRight() && event.getX() >= (getWidth() - getPaddingRight()) - drawable.getBounds().width()) {
                setText("");
            }
        }
        String str = this.LJLJLLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(event.getAction());
        LIZ.append(", ");
        LIZ.append(getLineCount());
        LIZ.append(" line, ");
        Editable text = getText();
        if (text != null) {
            num = Integer.valueOf(text.length());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(" character.");
        C34B.LJI(str, X1D.LIZIZ(LIZ));
        int lineCount = getLineCount();
        boolean z = false;
        for (int i = 0; i < lineCount; i++) {
            String str2 = this.LJLJLLL;
            StringBuilder LJ = C7MY.LJ("Line ", i, " has ");
            LJ.append(getLayout().getLineEnd(i) - getLayout().getLineStart(i));
            LJ.append(" character.");
            C34B.LJI(str2, X1D.LIZIZ(LJ));
        }
        try {
            z = super.onTouchEvent(event);
            return z;
        } catch (IndexOutOfBoundsException e) {
            C34B.LJ(this.LJLJLLL, e);
            return z;
        } catch (SecurityException e2) {
            C34B.LJ(this.LJLJLLL, e2);
            return z;
        }
    }

    public final void setKeyImeChangeListener(InterfaceC111014Xh listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLLJ = listener;
    }

    public final void setSearchable(boolean z) {
        SY9 sy9;
        this.LJLL = z;
        if (z) {
            sy9 = this.LJLLILLLL;
        } else {
            sy9 = null;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        o.LJIIIIZZ(compoundDrawablesRelative, "compoundDrawablesRelative");
        setCompoundDrawablesRelativeWithIntrinsicBounds(sy9, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4YG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.jy);
        a1.LJFF(context, "context");
        this.LJLJLLL = "SearchableEditText";
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_x_mark_circle_fill;
        Integer valueOf = Integer.valueOf(R.attr.gv);
        c2068389v.LJ = valueOf;
        this.LJLLI = c2068389v.LIZ(context);
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_tab_explore_fill;
        c2068389v2.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        c2068389v2.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        c2068389v2.LJ = valueOf;
        this.LJLLILLLL = c2068389v2.LIZ(context);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        InterfaceC111014Xh interfaceC111014Xh;
        if (keyEvent != null && keyEvent.getAction() == 0 && 4 == keyEvent.getKeyCode() && (interfaceC111014Xh = this.LJLLJ) != null) {
            interfaceC111014Xh.LLILII();
        }
        return false;
    }

    @Override // X.T5T, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        Editable text;
        super.onFocusChanged(z, i, rect);
        boolean z2 = false;
        if (z && ((text = getText()) == null || text.length() == 0)) {
            z2 = true;
        }
        LJIIIZ(z2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence text, int i, int i2, int i3) {
        o.LJIIIZ(text, "text");
        super.onTextChanged(text, i, i2, i3);
        boolean z = false;
        if (isFocused() && text.length() > 0) {
            z = true;
        }
        LJIIIZ(z);
    }
}
