package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.a0;
import com.zhiliaoapp.musically.R;

/* renamed from: X.03I, reason: invalid class name */
/* loaded from: classes.dex */
public class C03I extends CheckedTextView {
    public final C03L LJLIL;
    public final C03A LJLILLLLZI;
    public final a0 LJLJI;
    public C012203a LJLJJI;

    private C012203a getEmojiTextViewHelper() {
        if (this.LJLJJI == null) {
            this.LJLJJI = new C012203a(this);
        }
        return this.LJLJJI;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C03A c03a = this.LJLILLLLZI;
        if (c03a != null) {
            return c03a.LIZIZ();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C03A c03a = this.LJLILLLLZI;
        if (c03a != null) {
            return c03a.LIZJ();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C03L c03l = this.LJLIL;
        if (c03l != null) {
            return c03l.LIZIZ;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C03L c03l = this.LJLIL;
        if (c03l != null) {
            return c03l.LIZJ;
        }
        return null;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a0 a0Var = this.LJLJI;
        if (a0Var != null) {
            a0Var.LIZIZ();
        }
        C03A c03a = this.LJLILLLLZI;
        if (c03a != null) {
            c03a.LIZ();
        }
        C03L c03l = this.LJLIL;
        if (c03l != null) {
            c03l.LIZ();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C023107f.LJIIIIZZ(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C78897Uxp.LJJJI(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().LIZJ(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C03A c03a = this.LJLILLLLZI;
        if (c03a != null) {
            c03a.LJ();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C03A c03a = this.LJLILLLLZI;
        if (c03a != null) {
            c03a.LJFF(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C03L c03l = this.LJLIL;
        if (c03l != null) {
            if (c03l.LJFF) {
                c03l.LJFF = false;
            } else {
                c03l.LJFF = true;
                c03l.LIZ();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C023107f.LJIIIZ(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().LIZLLL(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C03A c03a = this.LJLILLLLZI;
        if (c03a != null) {
            c03a.LJII(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C03A c03a = this.LJLILLLLZI;
        if (c03a != null) {
            c03a.LJIIIIZZ(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C03L c03l = this.LJLIL;
        if (c03l != null) {
            c03l.LIZIZ = colorStateList;
            c03l.LIZLLL = true;
            c03l.LIZ();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C03L c03l = this.LJLIL;
        if (c03l != null) {
            c03l.LIZJ = mode;
            c03l.LJ = true;
            c03l.LIZ();
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C20110qd.LIZ(getContext(), i));
    }

    public C03I(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a24);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        a0 a0Var = this.LJLJI;
        if (a0Var != null) {
            a0Var.LJ(i, context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0084 A[Catch: all -> 0x00ae, TryCatch #1 {all -> 0x00ae, blocks: (B:3:0x004c, B:5:0x0052, B:8:0x0058, B:9:0x007d, B:11:0x0084, B:12:0x008d, B:14:0x0094, B:21:0x0064, B:23:0x006a, B:25:0x0070), top: B:2:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x00ae, TRY_LEAVE, TryCatch #1 {all -> 0x00ae, blocks: (B:3:0x004c, B:5:0x0052, B:8:0x0058, B:9:0x007d, B:11:0x0084, B:12:0x008d, B:14:0x0094, B:21:0x0064, B:23:0x006a, B:25:0x0070), top: B:2:0x004c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C03I(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            androidx.appcompat.widget.z0.LIZ(r12)
            r8 = r13
            r10 = r14
            r5 = r11
            r5.<init>(r12, r8, r10)
            android.content.Context r0 = r5.getContext()
            X.C16880lQ.LLLLII(r0)
            androidx.appcompat.widget.a0 r0 = new androidx.appcompat.widget.a0
            r0.<init>(r5)
            r5.LJLJI = r0
            r0.LIZLLL(r8, r10)
            r0.LIZIZ()
            X.03A r0 = new X.03A
            r0.<init>(r5)
            r5.LJLILLLLZI = r0
            r0.LIZLLL(r8, r10)
            X.03L r4 = new X.03L
            r4.<init>(r5)
            r5.LJLIL = r4
            android.content.Context r3 = r5.getContext()
            r1 = 4
            int[] r0 = new int[r1]
            r0 = {x00b4: FILL_ARRAY_DATA , data: [16843016, 2130969538, 2130969539, 2130969540} // fill-array
            r2 = 0
            X.033 r3 = X.AnonymousClass033.LJIILIIL(r3, r8, r0, r10, r2)
            android.content.Context r6 = r5.getContext()
            int[] r7 = new int[r1]
            r7 = {x00c0: FILL_ARRAY_DATA , data: [16843016, 2130969538, 2130969539, 2130969540} // fill-array
            android.content.res.TypedArray r9 = r3.LIZIZ
            o3.h0.LJIJ(r5, r6, r7, r8, r9, r10)
            r1 = 1
            boolean r0 = r3.LJIIJJI(r1)     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L64
            int r1 = r3.LJIIIIZZ(r1, r2)     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto L64
            android.content.Context r0 = r5.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L64 java.lang.Throwable -> Lae
            android.graphics.drawable.Drawable r0 = X.C20110qd.LIZ(r0, r1)     // Catch: android.content.res.Resources.NotFoundException -> L64 java.lang.Throwable -> Lae
            r5.setCheckMarkDrawable(r0)     // Catch: android.content.res.Resources.NotFoundException -> L64 java.lang.Throwable -> Lae
            goto L7d
        L64:
            boolean r0 = r3.LJIIJJI(r2)     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L7d
            int r2 = r3.LJIIIIZZ(r2, r2)     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L7d
            android.widget.CheckedTextView r1 = r4.LIZ     // Catch: java.lang.Throwable -> Lae
            android.content.Context r0 = r1.getContext()     // Catch: java.lang.Throwable -> Lae
            android.graphics.drawable.Drawable r0 = X.C20110qd.LIZ(r0, r2)     // Catch: java.lang.Throwable -> Lae
            r1.setCheckMarkDrawable(r0)     // Catch: java.lang.Throwable -> Lae
        L7d:
            r2 = 2
            boolean r0 = r3.LJIIJJI(r2)     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L8d
            android.widget.CheckedTextView r1 = r4.LIZ     // Catch: java.lang.Throwable -> Lae
            android.content.res.ColorStateList r0 = r3.LIZIZ(r2)     // Catch: java.lang.Throwable -> Lae
            r1.setCheckMarkTintList(r0)     // Catch: java.lang.Throwable -> Lae
        L8d:
            r1 = 3
            boolean r0 = r3.LJIIJJI(r1)     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto La3
            android.widget.CheckedTextView r2 = r4.LIZ     // Catch: java.lang.Throwable -> Lae
            r0 = -1
            int r1 = r3.LJII(r1, r0)     // Catch: java.lang.Throwable -> Lae
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.C03D.LIZLLL(r1, r0)     // Catch: java.lang.Throwable -> Lae
            r2.setCheckMarkTintMode(r0)     // Catch: java.lang.Throwable -> Lae
        La3:
            r3.LJIILJJIL()
            X.03a r0 = r5.getEmojiTextViewHelper()
            r0.LIZIZ(r8, r10)
            return
        Lae:
            r0 = move-exception
            r3.LJIILJJIL()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03I.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
