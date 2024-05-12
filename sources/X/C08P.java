package X;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.08P, reason: invalid class name */
/* loaded from: classes.dex */
public final class C08P extends SpannableStringBuilder {
    public final Class<?> LJLIL;
    public final List<C08O> LJLILLLLZI;

    public final void LIZ() {
        for (int i = 0; i < ((ArrayList) this.LJLILLLLZI).size(); i++) {
            ((C08O) ListProtector.get(this.LJLILLLLZI, i)).LJLILLLLZI.incrementAndGet();
        }
    }

    public final void LJ() {
        for (int i = 0; i < ((ArrayList) this.LJLILLLLZI).size(); i++) {
            ((C08O) ListProtector.get(this.LJLILLLLZI, i)).LJLILLLLZI.decrementAndGet();
        }
    }

    public final void LIZIZ() {
        LJ();
        for (int i = 0; i < ((ArrayList) this.LJLILLLLZI).size(); i++) {
            ((C08O) ListProtector.get(this.LJLILLLLZI, i)).onTextChanged(this, 0, length(), length());
        }
    }

    public final C08O LIZJ(Object obj) {
        for (int i = 0; i < this.LJLILLLLZI.size(); i++) {
            C08O c08o = (C08O) ListProtector.get(this.LJLILLLLZI, i);
            if (c08o.LJLIL == obj) {
                return c08o;
            }
        }
        return null;
    }

    public final boolean LIZLLL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.LJLIL != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C08O LIZJ;
        if (LIZLLL(obj) && (LIZJ = LIZJ(obj)) != null) {
            obj = LIZJ;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C08O LIZJ;
        if (LIZLLL(obj) && (LIZJ = LIZJ(obj)) != null) {
            obj = LIZJ;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C08O LIZJ;
        if (LIZLLL(obj) && (LIZJ = LIZJ(obj)) != null) {
            obj = LIZJ;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C08O c08o;
        if (LIZLLL(obj)) {
            c08o = LIZJ(obj);
            if (c08o != null) {
                obj = c08o;
            }
        } else {
            c08o = null;
        }
        super.removeSpan(obj);
        if (c08o != null) {
            ((ArrayList) this.LJLILLLLZI).remove(c08o);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public C08P(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.LJLILLLLZI = new ArrayList();
        TMC.LJIIIZ(cls, "watcherClass cannot be null");
        this.LJLIL = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C08P(this.LJLIL, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (this.LJLIL == cls) {
            C08O[] c08oArr = (C08O[]) super.getSpans(i, i2, C08O.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, c08oArr.length));
            for (int i3 = 0; i3 < c08oArr.length; i3++) {
                tArr[i3] = c08oArr[i3].LJLIL;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.LJLIL == cls) {
            cls = C08O.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        LIZ();
        super.replace(i, i2, charSequence);
        LJ();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public C08P(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.LJLILLLLZI = new ArrayList();
        TMC.LJIIIZ(cls, "watcherClass cannot be null");
        this.LJLIL = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (LIZLLL(obj)) {
            C08O c08o = new C08O(obj);
            ((ArrayList) this.LJLILLLLZI).add(c08o);
            obj = c08o;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        LIZ();
        super.replace(i, i2, charSequence, i3, i4);
        LJ();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }
}
