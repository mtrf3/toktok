package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.text.style.ReplacementSpan;
import com.bytedance.touchpoint.core.model.HighLightText;
import com.bytedance.touchpoint.core.model.TextPlaceHolder;
import com.bytedance.touchpoint.core.model.ThemeButton;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.9nq */
/* loaded from: classes5.dex */
public final class C247709nq {
    public static final C247709nq LIZ = new C247709nq();

    public static Drawable LJ(int i, Context context) {
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d4);
        c110614Vt.LIZJ = C61328O5c.LIZJ(i);
        return c110614Vt.LIZ(context);
    }

    public static SpannableStringBuilder LIZLLL(SpannableStringBuilder spannableStringBuilder, List list, boolean z) {
        String str;
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        o.LJIIIIZZ(spannableStringBuilder2, "ssb.toString()");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TextPlaceHolder textPlaceHolder = (TextPlaceHolder) it.next();
                if (o.LJ(textPlaceHolder.type, "picture") && (str = textPlaceHolder.key) != null && str.length() != 0 && s.LJJJLZIJ(spannableStringBuilder, textPlaceHolder.key, false)) {
                    spannableStringBuilder2 = ujb.o.LJJJJZ(spannableStringBuilder2, textPlaceHolder.key, "", false);
                }
            }
        }
        if (z) {
            SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) spannableStringBuilder2);
            o.LJIIIIZZ(append, "SpannableStringBuilder().append(newString)");
            return append;
        }
        return spannableStringBuilder;
    }

    public static void LIZ(Context context, TuxTextView tuxTextView, ThemeButton themeButton, boolean z) {
        String str;
        int i;
        int i2;
        if (themeButton != null) {
            String str2 = themeButton.theme;
            int i3 = 0;
            if (str2 != null && str2.length() != 0) {
                if (themeButton != null) {
                    String str3 = themeButton.theme;
                    if (str3 != null && str3.hashCode() == 109270 && str3.equals("now")) {
                        if (tuxTextView != null) {
                            if (z) {
                                i2 = R.drawable.c_9;
                            } else {
                                i2 = R.drawable.c_8;
                            }
                            tuxTextView.setBackground(C04270Et.LIZIZ(context, i2));
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            if (themeButton != null && (str = themeButton.bgColor) != null && C96Q.LIZ(str)) {
                if (z) {
                    i = 8;
                } else {
                    i = 45;
                }
                float[] fArr = new float[8];
                do {
                    fArr[i3] = C32151Nz.LJIIZILJ(Integer.valueOf(i));
                    i3++;
                } while (i3 < 8);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                Paint paint = shapeDrawable.getPaint();
                o.LJIIIIZZ(paint, "drawable.paint");
                paint.setColor(C247489nU.LIZIZ(C247489nU.LIZ, themeButton.bgColor));
                if (tuxTextView != null) {
                    tuxTextView.setBackground(shapeDrawable);
                }
            }
        }
    }

    public final void LIZIZ(final Context context, String str, final List<TextPlaceHolder> list, final TuxTextView tuxTextView, String str2, final int i) {
        String str3;
        String str4;
        String str5;
        List LJJIJIIJI;
        String str6;
        boolean z;
        o.LJIIIZ(context, "context");
        final C76732zl c76732zl = new C76732zl();
        boolean z2 = false;
        z2 = false;
        c76732zl.element = 0;
        final C76732zl c76732zl2 = new C76732zl();
        c76732zl2.element = 0;
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        if (str2.length() != 0 && tuxTextView != null) {
            tuxTextView.setTextColor(C247489nU.LIZIZ(C247489nU.LIZ, str2));
        }
        if (list != null) {
            for (TextPlaceHolder textPlaceHolder : list) {
                if (o.LJ(textPlaceHolder.type, "picture") || o.LJ(textPlaceHolder.type, "highlight_text")) {
                    String str7 = textPlaceHolder.key;
                    if (str7 != null && str7.length() != 0 && s.LJJJLZIJ(spannableStringBuilder, textPlaceHolder.key, false)) {
                        c76732zl.element++;
                    }
                }
            }
            for (final TextPlaceHolder textPlaceHolder2 : list) {
                String str8 = textPlaceHolder2.type;
                int hashCode = str8.hashCode();
                if (hashCode != -577741570) {
                    if (hashCode == 516637144 && str8.equals("highlight_text") && (str4 = textPlaceHolder2.key) != null && str4.length() != 0 && s.LJJJLZIJ(spannableStringBuilder, textPlaceHolder2.key, z2)) {
                        HighLightText highLightText = textPlaceHolder2.highlightText;
                        if (highLightText == null || (str5 = highLightText.theme) == null) {
                            str5 = "";
                        }
                        if (str5.hashCode() != 109270 || !str5.equals("now")) {
                            Integer[] numArr = new Integer[2];
                            C247489nU c247489nU = C247489nU.LIZ;
                            numArr[z2 ? 1 : 0] = Integer.valueOf(C247489nU.LIZIZ(c247489nU, "#FFFFFF"));
                            numArr[1] = Integer.valueOf(C247489nU.LIZIZ(c247489nU, "#FFFFFF"));
                            LJJIJIIJI = C47261Igj.LJJIJIIJI(numArr);
                        } else {
                            Integer[] numArr2 = new Integer[4];
                            C247489nU c247489nU2 = C247489nU.LIZ;
                            numArr2[z2 ? 1 : 0] = Integer.valueOf(C247489nU.LIZIZ(c247489nU2, "#15C0F9"));
                            numArr2[1] = Integer.valueOf(C247489nU.LIZIZ(c247489nU2, "#15C0F9"));
                            numArr2[2] = Integer.valueOf(C247489nU.LIZIZ(c247489nU2, "#20D5EC"));
                            numArr2[3] = Integer.valueOf(C247489nU.LIZIZ(c247489nU2, "#1AE3C6"));
                            LJJIJIIJI = C47261Igj.LJJIJIIJI(numArr2);
                        }
                        HighLightText highLightText2 = textPlaceHolder2.highlightText;
                        if (highLightText2 == null || (str6 = highLightText2.text) == null) {
                            str6 = "";
                        }
                        synchronized (this) {
                            int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder, textPlaceHolder2.key, z2 ? 1 : 0, z2, 6);
                            spannableStringBuilder.replace(LJJLIIIJL, textPlaceHolder2.key.length() + LJJLIIIJL, (CharSequence) str6);
                            spannableStringBuilder.setSpan(new ReplacementSpan(LJJIJIIJI) { // from class: X.8FF
                                public final List<Integer> LJLIL;

                                {
                                    o.LJIIIZ(LJJIJIIJI, "colors");
                                    this.LJLIL = LJJIJIIJI;
                                }

                                @Override // android.text.style.ReplacementSpan
                                public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                                    o.LJIIIZ(paint, "paint");
                                    return (int) paint.measureText(charSequence, i2, i3);
                                }

                                @Override // android.text.style.ReplacementSpan
                                public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                                    o.LJIIIZ(canvas, "canvas");
                                    o.LJIIIZ(paint, "paint");
                                    paint.setShader(new LinearGradient(f, 0.0f, paint.measureText(charSequence, i2, i3) + f, paint.descent() - paint.ascent(), ORZ.LLJ(this.LJLIL), (float[]) null, Shader.TileMode.CLAMP));
                                    if (charSequence != null) {
                                        canvas.drawText(charSequence, i2, i3, f, i5, paint);
                                    }
                                }
                            }, LJJLIIIJL, str6.length() + LJJLIIIJL, z2 ? 1 : 0);
                            int i2 = c76732zl2.element + 1;
                            c76732zl2.element = i2;
                            if (tuxTextView != null) {
                                if (i2 != c76732zl.element) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                tuxTextView.setText(LIZLLL(spannableStringBuilder, list, z));
                            }
                        }
                    }
                } else if (str8.equals("picture") && (str3 = textPlaceHolder2.key) != null && str3.length() != 0 && s.LJJJLZIJ(spannableStringBuilder, textPlaceHolder2.key, z2)) {
                    W5F LJIIIIZZ = W5U.LJIIIIZZ(textPlaceHolder2.picture);
                    LJIIIIZZ.LIZIZ("SpannableTextUtils");
                    LJIIIIZZ.LJIJI = Bitmap.Config.ARGB_8888;
                    LJIIIIZZ.LJIIIZ(new AbstractC85293Wj() { // from class: X.9nr
                        @Override // X.InterfaceC78660Uu0
                        public final void onFailed(Throwable th) {
                        }

                        @Override // X.InterfaceC78660Uu0
                        public final void LIZIZ(Bitmap bitmap) {
                            boolean z3 = false;
                            int LJJLIIIJL2 = s.LJJLIIIJL(spannableStringBuilder, textPlaceHolder2.key, 0, false, 6);
                            int length = textPlaceHolder2.key.length() + LJJLIIIJL2;
                            if (bitmap != null) {
                                synchronized (C247709nq.LIZ) {
                                    Bitmap icon = Bitmap.createScaledBitmap(bitmap, O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i))), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i))), false);
                                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                                    Context context2 = context;
                                    o.LJIIIIZZ(icon, "icon");
                                    spannableStringBuilder2.setSpan(new ImageSpan(context2, icon) { // from class: X.6B7
                                        public int LJLIL;
                                        public int LJLILLLLZI;
                                        public WeakReference<Drawable> LJLJI;

                                        @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
                                        public final Drawable getDrawable() {
                                            Drawable drawable;
                                            WeakReference<Drawable> weakReference = this.LJLJI;
                                            if (weakReference == null || (drawable = weakReference.get()) == null) {
                                                drawable = super.getDrawable();
                                                double intrinsicWidth = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
                                                int i3 = this.LJLIL;
                                                if (i3 <= 0) {
                                                    i3 = drawable.getIntrinsicWidth();
                                                }
                                                this.LJLIL = i3;
                                                int i4 = this.LJLILLLLZI;
                                                if (i4 <= 0) {
                                                    i4 = drawable.getIntrinsicHeight();
                                                }
                                                this.LJLILLLLZI = i4;
                                                if (drawable.getIntrinsicWidth() > drawable.getIntrinsicHeight()) {
                                                    this.LJLILLLLZI = (int) (this.LJLIL / intrinsicWidth);
                                                } else if (drawable.getIntrinsicWidth() < drawable.getIntrinsicHeight()) {
                                                    this.LJLIL = (int) (this.LJLILLLLZI * intrinsicWidth);
                                                }
                                                drawable.setBounds(0, 0, this.LJLIL, this.LJLILLLLZI);
                                                this.LJLJI = new WeakReference<>(drawable);
                                            }
                                            return drawable;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(context2, icon);
                                            o.LJIIIZ(context2, "context");
                                        }

                                        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                                        public final int getSize(Paint paint, CharSequence text, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
                                            o.LJIIIZ(paint, "paint");
                                            o.LJIIIZ(text, "text");
                                            Rect bounds = getDrawable().getBounds();
                                            o.LJIIIIZZ(bounds, "drawable.bounds");
                                            if (fontMetricsInt != null) {
                                                Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                                                int i5 = fontMetricsInt2.descent - fontMetricsInt2.ascent;
                                                int height = bounds.height();
                                                int i6 = fontMetricsInt2.ascent - ((int) ((height - i5) / 2.0f));
                                                fontMetricsInt.ascent = i6;
                                                int i7 = height + i6;
                                                fontMetricsInt.descent = i7;
                                                fontMetricsInt.top = i6;
                                                fontMetricsInt.bottom = i7;
                                            }
                                            return bounds.right;
                                        }

                                        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                                        public final void draw(Canvas canvas, CharSequence text, int i3, int i4, float f, int i5, int i6, int i7, Paint paint) {
                                            o.LJIIIZ(canvas, "canvas");
                                            o.LJIIIZ(text, "text");
                                            o.LJIIIZ(paint, "paint");
                                            canvas.save();
                                            Rect bounds = getDrawable().getBounds();
                                            o.LJIIIIZZ(bounds, "drawable.bounds");
                                            int i8 = bounds.bottom;
                                            canvas.translate(f + 0, (i7 - i8) - (((i7 - i5) / 2) - ((i8 - bounds.top) / 2)));
                                            getDrawable().draw(canvas);
                                            canvas.restore();
                                        }
                                    }, LJJLIIIJL2, length, 0);
                                    C76732zl c76732zl3 = c76732zl2;
                                    int i3 = c76732zl3.element + 1;
                                    c76732zl3.element = i3;
                                    TuxTextView tuxTextView2 = tuxTextView;
                                    if (tuxTextView2 != null) {
                                        SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                                        List list2 = list;
                                        if (i3 != c76732zl.element) {
                                            z3 = true;
                                        }
                                        tuxTextView2.setText(C247709nq.LIZLLL(spannableStringBuilder3, list2, z3));
                                    }
                                }
                            }
                        }
                    });
                }
                z2 = false;
            }
        }
        if (tuxTextView != null) {
            if (c76732zl2.element != c76732zl.element) {
                z2 = true;
            }
            tuxTextView.setText(LIZLLL(spannableStringBuilder, list, z2));
        }
    }
}
