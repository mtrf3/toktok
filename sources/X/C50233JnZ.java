package X;

import android.content.Context;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Range;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.Position;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.JnZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50233JnZ {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZLLL(TextView textView) {
        int length;
        o.LJIIIZ(textView, "textView");
        if (textView.getLineCount() >= textView.getMaxLines()) {
            Layout layout = textView.getLayout();
            if (layout != null) {
                length = layout.getLineEnd(textView.getMaxLines() - 1);
            } else {
                length = textView.length();
            }
            if (length < textView.length()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(TuxTextView textView, boolean z, String fullText, AbstractC65590Pog abstractC65590Pog, String highLightString, boolean z2, boolean z3, int i, InterfaceC88472Yns interfaceC88472Yns) {
        int i2;
        o.LJIIIZ(textView, "textView");
        o.LJIIIZ(fullText, "fullText");
        o.LJIIIZ(highLightString, "highLightString");
        if (z) {
            if (!(!abstractC65590Pog.isEmpty()) || (i2 = ((Position) abstractC65590Pog.get(0)).begin) == 0) {
                LIZJ(textView, fullText, highLightString, R.attr.bx, z2, abstractC65590Pog, new Range(0, Integer.valueOf(highLightString.length() - 1)), z3, i, interfaceC88472Yns);
                return;
            }
            ArrayList arrayList = new ArrayList();
            int i3 = 3 - i2;
            Iterator it = abstractC65590Pog.iterator();
            while (it.hasNext()) {
                Position position = (Position) it.next();
                arrayList.add(new Position(position.begin + i3, position.end + i3));
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("...");
            String substring = highLightString.substring(i2);
            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            LIZ2.append(substring);
            String LIZIZ = X1D.LIZIZ(LIZ2);
            Range range = new Range(3, Integer.valueOf(LIZIZ.length() - 1));
            String LJJJJZ = ujb.o.LJJJJZ(fullText, highLightString, LIZIZ, false);
            LIZIZ(textView, LJJJJZ, LIZIZ, R.attr.bx, z2, AbstractC65590Pog.copyOf((Collection) arrayList), range, z3, i, interfaceC88472Yns);
            JVD.LIZ(textView, new C50232JnY(textView, LJJJJZ, LIZIZ, z2, arrayList, range, z3, i, interfaceC88472Yns));
            return;
        }
        if (!LIZLLL(textView)) {
            return;
        }
        AbstractC65590Pog copyOf = AbstractC65590Pog.copyOf((Collection) abstractC65590Pog);
        o.LJIIIIZZ(copyOf, "copyOf(sortedBoldPositions)");
        LIZJ(textView, fullText, highLightString, R.attr.bx, z2, copyOf, new Range(0, Integer.valueOf(highLightString.length())), z3, i, interfaceC88472Yns);
    }

    public static void LIZIZ(TextView textView, String fullText, String str, int i, boolean z, AbstractC65590Pog abstractC65590Pog, Range range, boolean z2, int i2, InterfaceC88472Yns interfaceC88472Yns) {
        int LJJLIIIJL;
        int i3;
        float f;
        o.LJIIIZ(textView, "textView");
        o.LJIIIZ(fullText, "fullText");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append((char) 8296);
        LIZ2.append(str);
        LIZ2.append((char) 8297);
        String LJJJJZ = ujb.o.LJJJJZ(fullText, str, X1D.LIZIZ(LIZ2), false);
        Context context = textView.getContext();
        if (context == null || (LJJLIIIJL = s.LJJLIIIJL(LJJJJZ, str, 0, false, 6)) < 0) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LJJJJZ);
        if (z) {
            Integer LJI = C79045V0n.LJI(i, context);
            if (LJI != null) {
                i3 = LJI.intValue();
            } else {
                i3 = 0;
            }
            Float LJIIIZ = C79045V0n.LJIIIZ(context);
            if (LJIIIZ != null) {
                f = LJIIIZ.floatValue();
            } else {
                f = 1.0f;
            }
            spannableStringBuilder.setSpan(new C89G(i3, f, str, new AqS174S0100000_8(interfaceC88472Yns, (InterfaceC88472Yns<? super C50652JuK, C50652JuK>) 286)), LJJLIIIJL, str.length() + LJJLIIIJL, 33);
            textView.setMovementMethod(new BaseMovementMethod() { // from class: X.89D
                public C89E LIZ;

                @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
                public final boolean onTouchEvent(TextView textView2, Spannable spannable, MotionEvent motionEvent) {
                    Integer valueOf;
                    C89E c89e;
                    if (textView2 == null || spannable == null) {
                        return super.onTouchEvent(textView2, spannable, motionEvent);
                    }
                    if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getActionMasked())) != null) {
                        if (valueOf.intValue() == 0) {
                            int scrollX = textView2.getScrollX() + (((int) motionEvent.getX()) - textView2.getTotalPaddingStart());
                            int scrollY = textView2.getScrollY() + (((int) motionEvent.getY()) - textView2.getTotalPaddingTop());
                            Layout layout = textView2.getLayout();
                            if (layout == null) {
                                return super.onTouchEvent(textView2, spannable, motionEvent);
                            }
                            int LLLLLLL = C16880lQ.LLLLLLL(layout, layout.getLineForVertical(scrollY), scrollX);
                            Object[] links = (ClickableSpan[]) spannable.getSpans(LLLLLLL, LLLLLLL, ClickableSpan.class);
                            o.LJIIIIZZ(links, "links");
                            if (links.length == 0) {
                                C89E c89e2 = this.LIZ;
                                if (c89e2 != null) {
                                    c89e2.LIZJ(textView2, spannable);
                                    this.LIZ = null;
                                    textView2.invalidate();
                                }
                            } else {
                                Object obj = links[0];
                                if (obj instanceof C89E) {
                                    if (!o.LJ(this.LIZ, obj)) {
                                        C89E c89e3 = this.LIZ;
                                        if (c89e3 != null) {
                                            c89e3.LIZJ(textView2, spannable);
                                        }
                                        C89E c89e4 = (C89E) obj;
                                        this.LIZ = c89e4;
                                        c89e4.LIZIZ(textView2, spannable);
                                        textView2.invalidate();
                                        return true;
                                    }
                                } else {
                                    C89E c89e5 = this.LIZ;
                                    if (c89e5 != null) {
                                        c89e5.LIZJ(textView2, spannable);
                                        this.LIZ = null;
                                        textView2.invalidate();
                                    }
                                }
                                return false;
                            }
                        } else if (valueOf.intValue() == 1) {
                            C89E c89e6 = this.LIZ;
                            if (c89e6 != null) {
                                c89e6.LIZ(textView2, spannable);
                                this.LIZ = null;
                                textView2.invalidate();
                            }
                        } else if (valueOf.intValue() == 3 && (c89e = this.LIZ) != null) {
                            c89e.LIZJ(textView2, spannable);
                            this.LIZ = null;
                            textView2.invalidate();
                        }
                    }
                    return super.onTouchEvent(textView2, spannable, motionEvent);
                }
            });
        }
        if (z2 && abstractC65590Pog != null) {
            Iterator it = abstractC65590Pog.iterator();
            while (it.hasNext()) {
                Position position = (Position) it.next();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("begin:");
                LIZ3.append(position.begin);
                X1D.LIZIZ(LIZ3);
                int i4 = position.end;
                int i5 = position.begin;
                if (i5 >= 0 && i5 <= i4 && range.contains((Range) Integer.valueOf(i5)) && range.contains((Range) Integer.valueOf(position.end))) {
                    int i6 = position.begin + LJJLIIIJL;
                    int i7 = position.end + LJJLIIIJL;
                    if (i6 >= 0 && i6 < spannableStringBuilder.length() && i7 >= 0 && i7 < spannableStringBuilder.length()) {
                        spannableStringBuilder.setSpan(new T5U(i2, true), i6, i7 + 1, 33);
                    }
                }
            }
        }
        textView.setText(spannableStringBuilder);
    }

    public static void LIZJ(TextView textView, String str, String str2, int i, boolean z, AbstractC65590Pog abstractC65590Pog, Range range, boolean z2, int i2, InterfaceC88472Yns interfaceC88472Yns) {
        Layout layout = textView.getLayout();
        if (layout == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (text == null) {
            text = "";
        }
        int LJJLIIIJL = s.LJJLIIIJL(text, str2, 0, false, 6);
        if (LJJLIIIJL < 0) {
            return;
        }
        int length = (str2.length() + LJJLIIIJL) - 1;
        int lineStart = layout.getLineStart(textView.getMaxLines() - 1);
        if (lineStart > length || LJJLIIIJL >= layout.getLineStart(textView.getMaxLines())) {
            textView.setMaxLines(textView.getLineCount());
            return;
        }
        int length2 = text.length() - 1;
        int max = Math.max(LJJLIIIJL, lineStart);
        int i3 = length + 1;
        CharSequence subSequence = text.subSequence(max, i3);
        CharSequence subSequence2 = text.subSequence(lineStart, max);
        CharSequence subSequence3 = text.subSequence(i3, length2 + 1);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append((Object) subSequence2);
        LIZ2.append((Object) subSequence3);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        CharSequence ellipsize = TextUtils.ellipsize(subSequence, textView.getPaint(), ((textView.getWidth() - textView.getPaddingStart()) - textView.getPaddingEnd()) - textView.getPaint().measureText(LIZIZ, 0, LIZIZ.length()), TextUtils.TruncateAt.END);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("keepHeader:");
        LIZ3.append((Object) subSequence2);
        LIZ3.append(", ellipsizedStr:");
        LIZ3.append((Object) ellipsize);
        LIZ3.append(", keepTail:");
        LIZ3.append((Object) subSequence3);
        X1D.LIZIZ(LIZ3);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append((Object) text.subSequence(LJJLIIIJL, max));
        LIZ4.append((Object) ellipsize);
        String LIZIZ2 = X1D.LIZIZ(LIZ4);
        LIZIZ(textView, ujb.o.LJJJJZ(str, str2, LIZIZ2, false), LIZIZ2, i, z, abstractC65590Pog, new Range(range.getLower(), Integer.valueOf(((Number) range.getUpper()).intValue() - 3)), z2, i2, interfaceC88472Yns);
    }
}
