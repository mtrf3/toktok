package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.method.Touch;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8Fp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208338Fp {
    public static final int LIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
    public static final int LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
    public static final int LIZJ = C7MY.LIZIZ(16);
    public static final int LIZLLL = C7MY.LIZIZ(156);
    public static final int LJ = C7MY.LIZIZ(24);
    public static final float LJFF = C32151Nz.LJIIZILJ(6);
    public static Integer LJI;
    public static MovementMethod LJII;

    public static boolean LIZIZ(TextView textView) {
        Spannable spannable;
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            spannable = (Spannable) text;
        } else {
            spannable = null;
        }
        boolean z = false;
        if (spannable == null) {
            return false;
        }
        CharacterStyle[] spans = (CharacterStyle[]) spannable.getSpans(0, spannable.length(), C208368Fs.class);
        o.LJIIIIZZ(spans, "spans");
        if (spans.length == 0) {
            z = true;
        }
        return !z;
    }

    public static void LIZLLL(TextView textView) {
        Spannable spannable;
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            spannable = (Spannable) text;
        } else {
            spannable = null;
        }
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(C208368Fs.class, ClickableSpan.class);
        if (spannable != null) {
            Iterator it = LJJIJIIJI.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object[] spans = spannable.getSpans(0, spannable.length(), (Class) it.next());
                o.LJIIIIZZ(spans, "spannableNotNull.getSpan…l.length, removeSpanType)");
                int length = spans.length;
                int i = 0;
                while (i < length) {
                    spannable.removeSpan(spans[i]);
                    i++;
                    z = true;
                }
            }
            if (z) {
                Integer num = LJI;
                if (num != null) {
                    textView.setHighlightColor(num.intValue());
                }
                MovementMethod movementMethod = LJII;
                if (movementMethod != null) {
                    textView.setMovementMethod(movementMethod);
                }
            }
        }
    }

    public static final <T extends CharacterStyle> T LIZ(TextView widget, MotionEvent event, Class<T> cls) {
        Spannable spannable;
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(event, "event");
        CharSequence text = widget.getText();
        if (!(text instanceof Spannable) || (spannable = (Spannable) text) == null) {
            return null;
        }
        C208368Fs[] allCapsuleSpans = (C208368Fs[]) spannable.getSpans(0, widget.getText().length(), C208368Fs.class);
        int scrollX = widget.getScrollX() + (((int) event.getX()) - widget.getTotalPaddingLeft());
        int scrollY = widget.getScrollY() + (((int) event.getY()) - widget.getTotalPaddingTop());
        if (((int) event.getX()) < widget.getTotalPaddingLeft()) {
            return null;
        }
        o.LJIIIIZZ(allCapsuleSpans, "allCapsuleSpans");
        int i = 0;
        for (C208368Fs c208368Fs : allCapsuleSpans) {
            int i2 = c208368Fs.LJLJI;
            if (scrollX <= c208368Fs.LJLJJI && i2 <= scrollX) {
                int i3 = c208368Fs.LJLJJL;
                if (scrollY <= c208368Fs.LJLJJLL && i3 <= scrollY) {
                    break;
                }
            }
            i++;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(0, widget.getText().length(), cls);
        if (i >= characterStyleArr.length) {
            return null;
        }
        return (T) characterStyleArr[i];
    }

    public static void LIZJ(C208398Fv c208398Fv, EditText editText, ImageView imageView, boolean z) {
        List<String> wordList;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (LIZIZ(editText)) {
            LIZLLL(editText);
        }
        if (c208398Fv != null && (wordList = c208398Fv.getWordList()) != null && !wordList.isEmpty()) {
            String keyWord = c208398Fv.getKeyWord();
            editText.setText(keyWord);
            c208398Fv.removeAllWords();
            editText.setSelection(keyWord.length());
        }
        if (editText.getInputType() == 0 && z) {
            editText.setInputType(524289);
            editText.setCursorVisible(true);
            editText.setLongClickable(true);
            editText.setSelection(editText.getText().length());
            editText.requestFocus();
        }
    }

    public static boolean LJ(Context context, final C208398Fv c208398Fv, final EditText editText, final ImageView imageView, int[] iArr, boolean z, final InterfaceC88471Ynr interfaceC88471Ynr, final InterfaceC88472Yns interfaceC88472Yns, int i) {
        int i2;
        int i3;
        final boolean z2 = z;
        int[] iArr2 = iArr;
        if ((i & 16) != 0) {
            iArr2 = null;
        }
        if ((i & 32) != 0) {
            z2 = false;
        }
        if (c208398Fv != null) {
            if (!c208398Fv.isVisible()) {
                LIZJ(c208398Fv, editText, imageView, false);
            } else if (context != null) {
                editText.clearFocus();
                editText.setCursorVisible(false);
                editText.setInputType(0);
                LIZLLL(editText);
                final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                List<String> wordList = c208398Fv.getWordList();
                if (wordList != null) {
                    int i4 = 0;
                    int i5 = 0;
                    for (String str : wordList) {
                        if (str != null && str.length() != 0) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Integer.valueOf(LIZIZ));
                            arrayList.add(Integer.valueOf(LIZJ));
                            LinkedHashMap LIZIZ2 = JF1.LIZIZ("action_type", "show", "words_content", str);
                            LIZIZ2.put("words_position", String.valueOf(i5));
                            C48658J7u.LIZ("rd_ec_search_bar_capsule", LIZIZ2);
                            int i6 = LIZLLL;
                            TextPaint paint = editText.getPaint();
                            o.LJIIIIZZ(paint, "editText.paint");
                            float measureText = paint.measureText(str);
                            while (arrayList.iterator().hasNext()) {
                                measureText += ((Number) r10.next()).intValue();
                            }
                            float f = i6;
                            if (measureText >= f) {
                                float measureText2 = f - paint.measureText("...");
                                while (arrayList.iterator().hasNext()) {
                                    measureText2 -= ((Number) r8.next()).intValue();
                                }
                                int length = str.length();
                                if (length >= 0) {
                                    int i7 = 0;
                                    int i8 = 0;
                                    while (true) {
                                        String substring = str.substring(i7, i8);
                                        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                        if (paint.measureText(substring) >= measureText2) {
                                            StringBuilder LIZ2 = X1D.LIZ();
                                            String substring2 = str.substring(0, i8 - 1);
                                            o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                            LIZ2.append(substring2);
                                            LIZ2.append("...");
                                            str = X1D.LIZIZ(LIZ2);
                                            break;
                                        }
                                        if (i8 == length) {
                                            break;
                                        }
                                        i8++;
                                        i7 = 0;
                                    }
                                }
                            }
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(str);
                            LIZ3.append(' ');
                            spannableStringBuilder.append((CharSequence) X1D.LIZIZ(LIZ3));
                            spannableStringBuilder.append((CharSequence) "\u200b");
                            int i9 = i5 + 1;
                            int i10 = LJ;
                            int height = editText.getHeight();
                            int i11 = LIZ;
                            int i12 = LIZIZ;
                            float f2 = LJFF;
                            int i13 = LIZJ;
                            Integer LJI2 = C79045V0n.LJI(R.attr.cu, context);
                            if (LJI2 != null) {
                                i3 = LJI2.intValue();
                            } else {
                                i3 = R.attr.cu;
                            }
                            spannableStringBuilder.setSpan(new C208368Fs(context, new C208378Ft(f2, i5, i10, height, i11, i12, i13, i3)), i4, str.length() + i4, 33);
                            spannableStringBuilder.setSpan(new AnonymousClass899() { // from class: X.8Fu
                                @Override // android.text.style.ClickableSpan
                                public final void onClick(View widget) {
                                    String str2;
                                    o.LJIIIZ(widget, "widget");
                                    Editable text = editText.getText();
                                    if (text != null) {
                                        C208398Fv c208398Fv2 = c208398Fv;
                                        InterfaceC88472Yns<C208398Fv, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                                        int spanStart = text.getSpanStart(this);
                                        int spanEnd = text.getSpanEnd(this);
                                        text.removeSpan(this);
                                        Object[] editTextSpans = text.getSpans(spanStart, spanEnd, C208368Fs.class);
                                        o.LJIIIIZZ(editTextSpans, "editTextSpans");
                                        C208368Fs c208368Fs = (C208368Fs) ORY.LJJJ(editTextSpans);
                                        if (c208368Fs != null) {
                                            int i14 = c208368Fs.LJLILLLLZI.LIZ;
                                            List<String> wordList2 = c208398Fv2.getWordList();
                                            if (wordList2 == null || (str2 = (String) ListProtector.get(wordList2, i14)) == null) {
                                                str2 = "";
                                            }
                                            boolean isLastWord = c208398Fv2.isLastWord(i14);
                                            LinkedHashMap LIZIZ3 = JF1.LIZIZ("action_type", "click", "words_content", str2);
                                            LIZIZ3.put("words_position", String.valueOf(i14));
                                            LIZIZ3.put("is_last", String.valueOf(isLastWord));
                                            C48658J7u.LIZ("rd_ec_search_bar_capsule", LIZIZ3);
                                            if (c208398Fv2.isLastWord(i14)) {
                                                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                                                if (LJIIIIZZ != null) {
                                                    LJIIIIZZ.finish();
                                                    return;
                                                }
                                                return;
                                            }
                                            text.removeSpan(c208368Fs);
                                            c208398Fv2.removeWord(i14);
                                            interfaceC88472Yns2.invoke(c208398Fv2);
                                        }
                                    }
                                }

                                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                public final void updateDrawState(TextPaint ds) {
                                    o.LJIIIZ(ds, "ds");
                                    ds.setColor(0);
                                    ds.setUnderlineText(false);
                                }
                            }, i4, str.length() + i4 + 1, 33);
                            i4 = str.length() + 2 + i4;
                            i5 = i9;
                        }
                    }
                }
                LJII = editText.getMovementMethod();
                editText.setMovementMethod(new LinkMovementMethod(interfaceC88471Ynr) { // from class: X.89T
                    public final InterfaceC88471Ynr<Boolean, Boolean, C76800UCe> LIZ;
                    public int LIZIZ = -1;
                    public int LIZJ = -1;
                    public boolean LIZLLL;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LIZ = interfaceC88471Ynr;
                    }

                    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
                    public final boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) {
                        o.LJIIIZ(widget, "widget");
                        o.LJIIIZ(buffer, "buffer");
                        o.LJIIIZ(event, "event");
                        int action = event.getAction();
                        if (!this.LIZLLL && this.LIZIZ != -1 && this.LIZJ != -1 && (Math.abs(event.getX() - this.LIZIZ) > 5.0f || Math.abs(event.getY() - this.LIZJ) > 5.0f)) {
                            this.LIZLLL = true;
                        }
                        if (action != 0) {
                            if (action == 1) {
                                ClickableSpan clickableSpan = (ClickableSpan) C208338Fp.LIZ(widget, event, AnonymousClass899.class);
                                if (clickableSpan != null) {
                                    if (!this.LIZLLL) {
                                        clickableSpan.onClick(widget);
                                    }
                                    this.LIZIZ = -1;
                                    this.LIZJ = -1;
                                    return true;
                                }
                                Selection.removeSelection(buffer);
                                if (this.LIZLLL) {
                                    return true;
                                }
                                this.LIZ.invoke(Boolean.valueOf(widget.hasFocus()), Boolean.TRUE);
                            }
                        } else {
                            this.LIZIZ = (int) event.getX();
                            this.LIZJ = (int) event.getY();
                            this.LIZLLL = false;
                            CharacterStyle LIZ4 = C208338Fp.LIZ(widget, event, AnonymousClass899.class);
                            if (LIZ4 != null) {
                                Selection.setSelection(buffer, buffer.getSpanStart(LIZ4), buffer.getSpanEnd(LIZ4));
                            } else {
                                Selection.removeSelection(buffer);
                            }
                        }
                        return Touch.onTouchEvent(widget, buffer, event);
                    }
                });
                editText.setLongClickable(false);
                LJI = Integer.valueOf(editText.getHighlightColor());
                editText.setHighlightColor(0);
                editText.setText(spannableStringBuilder);
                editText.setSelection(spannableStringBuilder.length());
                if (Build.VERSION.SDK_INT >= 23 && (imageView == null || imageView.getForeground() == null)) {
                    if (iArr2 == null) {
                        if (AnonymousClass636.LJIILJJIL(context)) {
                            i2 = 0;
                            iArr2 = new int[]{Color.argb(0, 57, 70, 72), Color.argb(184, 57, 70, 72), Color.argb(255, 57, 70, 72)};
                        } else {
                            i2 = 0;
                            iArr2 = new int[]{Color.argb(0, 224, 238, 242), Color.argb(184, 224, 238, 242), Color.argb(255, 224, 238, 242)};
                        }
                    } else {
                        i2 = 0;
                    }
                    if (imageView != null) {
                        GradientDrawable LIZIZ3 = T28.LIZIZ(i2);
                        LIZIZ3.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                        LIZIZ3.setColors(iArr2);
                        imageView.setForeground(LIZIZ3);
                    }
                }
                editText.post(new Runnable() { // from class: X.8Fq
                    public final void LIZ() {
                        int i14;
                        float measureText3 = editText.getPaint().measureText(spannableStringBuilder.toString());
                        List<String> wordList2 = c208398Fv.getWordList();
                        int i15 = 0;
                        if (wordList2 != null) {
                            i14 = wordList2.size();
                        } else {
                            i14 = 0;
                        }
                        final float f3 = measureText3 + ((C208338Fp.LIZIZ + C208338Fp.LIZJ) * i14);
                        final C76732zl c76732zl = new C76732zl();
                        int measuredWidth = editText.getMeasuredWidth() - editText.getTotalPaddingLeft();
                        c76732zl.element = measuredWidth;
                        if (!z2) {
                            ImageView imageView2 = imageView;
                            if (imageView2 != null) {
                                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                                    layoutParams = null;
                                }
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                if (marginLayoutParams != null) {
                                    i15 = marginLayoutParams.rightMargin;
                                }
                            }
                            c76732zl.element = measuredWidth - i15;
                        }
                        if (Build.VERSION.SDK_INT >= 23) {
                            EditText editText2 = editText;
                            final ImageView imageView3 = imageView;
                            editText2.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.8Fr
                                @Override // android.view.View.OnScrollChangeListener
                                public final void onScrollChange(View view, int i16, int i17, int i18, int i19) {
                                    TextView textView;
                                    if (view instanceof TextView) {
                                        textView = (TextView) view;
                                    } else {
                                        textView = null;
                                    }
                                    ImageView imageView4 = imageView3;
                                    if (textView == null || !C208338Fp.LIZIZ(textView)) {
                                        if (imageView4 == null) {
                                            return;
                                        }
                                        imageView4.setVisibility(4);
                                    } else {
                                        if (i16 < (f3 - c76732zl.element) - C7MY.LIZIZ(6)) {
                                            ImageView imageView5 = imageView3;
                                            if (imageView5 == null) {
                                                return;
                                            }
                                            imageView5.setVisibility(0);
                                            return;
                                        }
                                        ImageView imageView6 = imageView3;
                                        if (imageView6 == null) {
                                            return;
                                        }
                                        imageView6.setVisibility(4);
                                    }
                                }
                            });
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ4;
                        try {
                            LIZ();
                        } finally {
                            if (LIZ4) {
                            }
                        }
                    }
                });
                return true;
            }
        }
        return false;
    }
}
