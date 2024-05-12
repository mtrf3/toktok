package X;

import android.os.Build;
import android.os.Trace;
import android.text.Layout;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: X.0gL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13730gL implements Spannable {
    public static final Object LJLJJI = new Object();
    public static Executor LJLJJL = null;
    public final Spannable LJLIL;
    public final C13700gI LJLILLLLZI;
    public final PrecomputedText LJLJI;

    @Override // java.lang.CharSequence
    public final int length() {
        return this.LJLIL.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.LJLIL.toString();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.LJLIL.charAt(i);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.LJLIL.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.LJLIL.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.LJLIL.getSpanStart(obj);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.LJLJI.removeSpan(obj);
                return;
            } else {
                this.LJLIL.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    public C13730gL(PrecomputedText precomputedText, C13700gI c13700gI) {
        this.LJLIL = precomputedText;
        this.LJLILLLLZI = c13700gI;
        this.LJLJI = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.LJLIL.subSequence(i, i2);
    }

    public C13730gL(CharSequence charSequence, C13700gI c13700gI) {
        this.LJLIL = new SpannableString(charSequence);
        this.LJLILLLLZI = c13700gI;
        this.LJLJI = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0gK, java.lang.Runnable] */
    public static C13720gK LIZ(final CharSequence charSequence, final C13700gI c13700gI, Executor executor) {
        Executor executor2;
        ?? r2 = new FutureTask<C13730gL>(c13700gI, charSequence) { // from class: X.0gK
            {
                super(new Callable<C13730gL>(c13700gI, charSequence) { // from class: X.0gJ
                    public final C13700gI LJLIL;
                    public final CharSequence LJLILLLLZI;

                    @Override // java.util.concurrent.Callable
                    public final C13730gL call() {
                        C13730gL c13730gL;
                        PrecomputedText.Params params;
                        CharSequence charSequence2 = this.LJLILLLLZI;
                        C13700gI c13700gI2 = this.LJLIL;
                        charSequence2.getClass();
                        c13700gI2.getClass();
                        try {
                            Trace.beginSection("PrecomputedText");
                            if (Build.VERSION.SDK_INT >= 29 && (params = c13700gI2.LJ) != null) {
                                c13730gL = new C13730gL(PrecomputedText.create(charSequence2, params), c13700gI2);
                            } else {
                                ArrayList arrayList = new ArrayList();
                                int length = charSequence2.length();
                                int i = 0;
                                while (i < length) {
                                    int indexOf = TextUtils.indexOf(charSequence2, '\n', i, length);
                                    if (indexOf < 0) {
                                        i = length;
                                    } else {
                                        i = indexOf + 1;
                                    }
                                    arrayList.add(Integer.valueOf(i));
                                }
                                arrayList.size();
                                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                    ((Integer) arrayList.get(i2)).intValue();
                                }
                                if (Build.VERSION.SDK_INT >= 23) {
                                    StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), c13700gI2.LIZ, Integer.MAX_VALUE).setBreakStrategy(c13700gI2.LIZJ).setHyphenationFrequency(c13700gI2.LIZLLL).setTextDirection(c13700gI2.LIZIZ).build();
                                } else {
                                    new StaticLayout(charSequence2, c13700gI2.LIZ, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                }
                                c13730gL = new C13730gL(charSequence2, c13700gI2);
                            }
                            return c13730gL;
                        } finally {
                            Trace.endSection();
                        }
                    }

                    {
                        this.LJLIL = c13700gI;
                        this.LJLILLLLZI = charSequence;
                    }
                });
            }
        };
        Executor executor3 = executor;
        if (executor == null) {
            synchronized (LJLJJI) {
                if (LJLJJL == null) {
                    LJLJJL = C16880lQ.LLLLZ(1);
                }
                executor2 = LJLJJL;
            }
            executor3 = executor2;
        }
        executor3.execute(r2);
        return r2;
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (T[]) this.LJLJI.getSpans(i, i2, cls);
        }
        return (T[]) this.LJLIL.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.LJLIL.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.LJLJI.setSpan(obj, i, i2, i3);
                return;
            } else {
                this.LJLIL.setSpan(obj, i, i2, i3);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }
}
