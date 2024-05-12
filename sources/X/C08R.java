package X;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* renamed from: X.08R, reason: invalid class name */
/* loaded from: classes.dex */
public final class C08R implements Spannable {
    public boolean LJLIL;
    public Spannable LJLILLLLZI;

    public final void LIZ() {
        C08Q c08q;
        Spannable spannable = this.LJLILLLLZI;
        if (!this.LJLIL) {
            if (Build.VERSION.SDK_INT < 28) {
                c08q = new C08Q();
            } else {
                c08q = new C08Q() { // from class: X.1Aw
                    @Override // X.C08Q
                    public final boolean LIZ(CharSequence charSequence) {
                        if ((charSequence instanceof PrecomputedText) || (charSequence instanceof C13730gL)) {
                            return true;
                        }
                        return false;
                    }
                };
            }
            if (c08q.LIZ(spannable)) {
                this.LJLILLLLZI = new SpannableString(spannable);
            }
        }
        this.LJLIL = true;
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.LJLILLLLZI.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.LJLILLLLZI.codePoints();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.LJLILLLLZI.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.LJLILLLLZI.toString();
    }

    public C08R(CharSequence charSequence) {
        this.LJLILLLLZI = new SpannableString(charSequence);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.LJLILLLLZI.charAt(i);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.LJLILLLLZI.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.LJLILLLLZI.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.LJLILLLLZI.getSpanStart(obj);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        LIZ();
        this.LJLILLLLZI.removeSpan(obj);
    }

    public C08R(Spannable spannable) {
        this.LJLILLLLZI = spannable;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.LJLILLLLZI.subSequence(i, i2);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.LJLILLLLZI.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.LJLILLLLZI.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        LIZ();
        this.LJLILLLLZI.setSpan(obj, i, i2, i3);
    }
}
