package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.z0;

/* renamed from: X.038, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass038 extends AutoCompleteTextView {
    public static final int[] LJLJJI = {R.attr.popupBackground};
    public final C03A LJLIL;
    public final a0 LJLILLLLZI;
    public final C19L LJLJI;

    public ColorStateList getSupportBackgroundTintList() {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            return c03a.LIZIZ();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            return c03a.LIZJ();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LIZ();
        }
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var != null) {
            a0Var.LIZIZ();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C023107f.LJIIIIZZ(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C78897Uxp.LJJJI(this, editorInfo, onCreateInputConnection);
        return this.LJLJI.LIZLLL(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJ();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJFF(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C023107f.LJIIIZ(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C20110qd.LIZ(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.LJLJI.LJ(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.LJLJI.LIZ(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJII(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJIIIIZZ(mode);
        }
    }

    public AnonymousClass038(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var != null) {
            a0Var.LJ(i, context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass038(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, com.zhiliaoapp.musically.R.attr.wf);
        z0.LIZ(context);
        C16880lQ.LLLLII(getContext());
        AnonymousClass033 LJIILIIL = AnonymousClass033.LJIILIIL(getContext(), attributeSet, LJLJJI, com.zhiliaoapp.musically.R.attr.wf, 0);
        if (LJIILIIL.LJIIJJI(0)) {
            setDropDownBackgroundDrawable(LJIILIIL.LJ(0));
        }
        LJIILIIL.LJIILJJIL();
        C03A c03a = new C03A(this);
        this.LJLIL = c03a;
        c03a.LIZLLL(attributeSet, com.zhiliaoapp.musically.R.attr.wf);
        a0 a0Var = new a0(this);
        this.LJLILLLLZI = a0Var;
        a0Var.LIZLLL(attributeSet, com.zhiliaoapp.musically.R.attr.wf);
        a0Var.LIZIZ();
        C19L c19l = new C19L(this);
        this.LJLJI = c19l;
        c19l.LIZIZ(attributeSet, com.zhiliaoapp.musically.R.attr.wf);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener LIZ = c19l.LIZ(keyListener);
            if (LIZ == keyListener) {
                return;
            }
            super.setKeyListener(LIZ);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
        }
    }
}
