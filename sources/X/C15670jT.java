package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.MetricAffectingSpan;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.0jT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15670jT {
    public static final OSZ<String, String> LIZ(String str, String str2, String str3) {
        String str4;
        HH1.LIZ(str, "<this>", str2, "startChar", str3, "endChar");
        try {
            str4 = str.substring(s.LJJLIIIJL(str, str2, 0, false, 6) + 1, s.LJJLIIIJL(str, str3, 0, false, 6));
            o.LJIIIIZZ(str4, "this as java.lang.String…ing(startIndex, endIndex)");
        } catch (Exception unused) {
            str4 = "";
        }
        return new OSZ<>(str4, ujb.o.LJJJJZ(ujb.o.LJJJJZ(str, str2, "", false), str3, "", false));
    }

    public static final SpannableStringBuilder LIZIZ(Context context, String wholeText, String str, final int i, final boolean z, String str2, final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        boolean z2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wholeText, "wholeText");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wholeText);
        boolean z3 = true;
        if (str != null) {
            if (str.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                str = null;
            }
            if (str != null) {
                ClickableSpan clickableSpan = new ClickableSpan() { // from class: X.0jS
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View widget) {
                        o.LJIIIZ(widget, "widget");
                        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
                        if (interfaceC65784Pro2 != null) {
                            interfaceC65784Pro2.invoke();
                        }
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint ds) {
                        o.LJIIIZ(ds, "ds");
                        super.updateDrawState(ds);
                        ds.setUnderlineText(z);
                        ds.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
                        ds.setColor(i);
                    }
                };
                int LJJLIIIJL = s.LJJLIIIJL(wholeText, str, 0, false, 6);
                try {
                    spannableStringBuilder.setSpan(clickableSpan, LJJLIIIJL, str.length() + LJJLIIIJL, 18);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        if (str2 != null) {
            if (str2.length() <= 0) {
                z3 = false;
            }
            if (!z3) {
                str2 = null;
            }
            if (str2 != null) {
                final Typeface LIZLLL = C49616Jdc.LIZIZ().LIZLLL("medium");
                MetricAffectingSpan metricAffectingSpan = new MetricAffectingSpan(LIZLLL) { // from class: X.0iy
                    public final Typeface LJLIL;

                    {
                        this.LJLIL = LIZLLL;
                    }

                    @Override // android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint ds) {
                        o.LJIIIZ(ds, "ds");
                        Typeface typeface = this.LJLIL;
                        if (typeface != null) {
                            ds.setTypeface(typeface);
                        }
                    }

                    @Override // android.text.style.MetricAffectingSpan
                    public final void updateMeasureState(TextPaint paint) {
                        o.LJIIIZ(paint, "paint");
                        Typeface typeface = this.LJLIL;
                        if (typeface != null) {
                            paint.setTypeface(typeface);
                        }
                    }
                };
                int LJJLIIIJL2 = s.LJJLIIIJL(wholeText, str2, 0, false, 6);
                try {
                    spannableStringBuilder.setSpan(metricAffectingSpan, LJJLIIIJL2, str2.length() + LJJLIIIJL2, 18);
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static /* synthetic */ SpannableStringBuilder LIZJ(Context context, String str, String str2, int i, String str3, InterfaceC65784Pro interfaceC65784Pro, int i2) {
        String str4 = str3;
        String str5 = str2;
        int i3 = i;
        InterfaceC65784Pro interfaceC65784Pro2 = null;
        if ((i2 & 4) != 0) {
            str5 = null;
        }
        if ((i2 & 8) != 0) {
            i3 = C04330Ez.LIZIZ(context, R.color.a8m);
        }
        if ((i2 & 32) != 0) {
            str4 = null;
        }
        if ((i2 & 64) == 0) {
            interfaceC65784Pro2 = interfaceC65784Pro;
        }
        return LIZIZ(context, str, str5, i3, false, str4, interfaceC65784Pro2);
    }
}
