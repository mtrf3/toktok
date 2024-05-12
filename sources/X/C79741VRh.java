package X;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import com.lynx.tasm.behavior.shadow.text.AbsoluteSizeSpan;

/* renamed from: X.VRh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79741VRh {
    public static void LIZIZ(Canvas canvas, Layout layout) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        Spanned spanned = (Spanned) layout.getText();
        C79759VRz[] c79759VRzArr = (C79759VRz[]) spanned.getSpans(0, spanned.length(), C79759VRz.class);
        if (c79759VRzArr == null || c79759VRzArr.length == 0) {
            return;
        }
        int spanStart = spanned.getSpanStart(c79759VRzArr[0]);
        int spanEnd = spanned.getSpanEnd(c79759VRzArr[0]);
        int textSize = (int) layout.getPaint().getTextSize();
        if (spanStart == 0) {
            for (int i3 = 1; i3 < c79759VRzArr.length; i3++) {
                int spanStart2 = spanned.getSpanStart(c79759VRzArr[i3]);
                int spanEnd2 = spanned.getSpanEnd(c79759VRzArr[i3]);
                AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) spanned.getSpans(spanStart2, spanEnd2, AbsoluteSizeSpan.class);
                if (absoluteSizeSpanArr.length != 0) {
                    i2 = absoluteSizeSpanArr[0].getSize();
                } else {
                    i2 = textSize;
                }
                C79759VRz c79759VRz = c79759VRzArr[i3];
                LIZ(canvas, layout, c79759VRz.LIZJ, c79759VRz.LIZLLL, c79759VRz.LIZ, c79759VRz.LIZIZ, spanStart2, spanEnd2, i2);
                if (spanStart2 >= spanStart && spanEnd2 <= spanEnd) {
                    C79759VRz c79759VRz2 = c79759VRzArr[0];
                    LIZ(canvas, layout, c79759VRz2.LIZJ, c79759VRz2.LIZLLL, c79759VRz2.LIZ, c79759VRz2.LIZIZ, spanEnd2 + 1, spanEnd, textSize);
                    C79759VRz c79759VRz3 = c79759VRzArr[0];
                    if (c79759VRz3.LIZ && !c79759VRzArr[i3].LIZ) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c79759VRz3.LIZIZ && !c79759VRzArr[i3].LIZIZ) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    LIZ(canvas, layout, c79759VRz3.LIZJ, c79759VRz3.LIZLLL, z, z2, spanStart2, spanEnd2, i2);
                    spanEnd = spanStart2;
                }
            }
            C79759VRz c79759VRz4 = c79759VRzArr[0];
            LIZ(canvas, layout, c79759VRz4.LIZJ, c79759VRz4.LIZLLL, c79759VRz4.LIZ, c79759VRz4.LIZIZ, spanStart, spanEnd, textSize);
            return;
        }
        for (int i4 = 0; i4 < c79759VRzArr.length; i4++) {
            int spanStart3 = spanned.getSpanStart(c79759VRzArr[i4]);
            int spanEnd3 = spanned.getSpanEnd(c79759VRzArr[i4]);
            AbsoluteSizeSpan[] absoluteSizeSpanArr2 = (AbsoluteSizeSpan[]) spanned.getSpans(spanStart3, spanEnd3, AbsoluteSizeSpan.class);
            if (absoluteSizeSpanArr2.length != 0) {
                i = absoluteSizeSpanArr2[0].getSize();
            } else {
                i = textSize;
            }
            C79759VRz c79759VRz5 = c79759VRzArr[i4];
            LIZ(canvas, layout, c79759VRz5.LIZJ, c79759VRz5.LIZLLL, c79759VRz5.LIZ, c79759VRz5.LIZIZ, spanStart3, spanEnd3, i);
        }
    }

    public static void LIZLLL(Canvas canvas, Layout layout) {
        Spanned spanned = (Spanned) layout.getText();
        C79751VRr[] c79751VRrArr = (C79751VRr[]) spanned.getSpans(0, spanned.length(), C79751VRr.class);
        if (c79751VRrArr != null && c79751VRrArr.length > 0) {
            for (C79751VRr c79751VRr : c79751VRrArr) {
                c79751VRr.LJLJJI = true;
            }
            layout.draw(canvas);
            for (C79751VRr c79751VRr2 : c79751VRrArr) {
                c79751VRr2.LJLJJI = false;
            }
        }
    }

    public static TextPaint LJ(C79743VRj c79743VRj, Typeface typeface) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(c79743VRj.LJIILIIL);
        if (!TextUtils.isEmpty(c79743VRj.LJIJI)) {
            textPaint.setTypeface(typeface);
        } else if (C79732VQy.LIZIZ()) {
            textPaint.setTypeface(C79732VQy.LIZ());
        }
        float f = c79743VRj.LJIIJJI;
        if (f != 1.0E21f) {
            textPaint.setLetterSpacing(f / textPaint.getTextSize());
        }
        C79729VQv c79729VQv = c79743VRj.LJIJJLI;
        if (c79729VQv != null) {
            textPaint.setShadowLayer(c79729VQv.LIZLLL, c79729VQv.LIZIZ, c79729VQv.LIZJ, c79729VQv.LIZ);
        }
        return textPaint;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<java.lang.CharSequence> LJFF(java.lang.CharSequence r6, boolean r7) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3 = 0
            r2 = 0
        L7:
            int r0 = r6.length()
            if (r3 >= r0) goto L87
            char r5 = r6.charAt(r3)
            r0 = 19968(0x4e00, float:2.7981E-41)
            if (r5 < r0) goto L4d
            r0 = 40869(0x9fa5, float:5.727E-41)
            if (r5 > r0) goto L4d
            java.lang.String r0 = "[一-龥][\\u3002\\uff1f\\uff01\\uff0c\\u3001\\uff1b\\uff1a\\u2018\\u2019\\u201c\\u201d\\uff08\\uff09\\u3014\\u3015\\u3010\\u3011\\u2026\\u2014\\p{Punct}]*"
            java.util.regex.Pattern r1 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
        L20:
            if (r1 == 0) goto L74
            int r0 = r6.length()
            java.lang.CharSequence r0 = r6.subSequence(r3, r0)
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r0 = r1.find()
            if (r0 == 0) goto L43
            int r1 = r1.end()
            int r1 = r1 + r3
            java.lang.CharSequence r0 = r6.subSequence(r2, r1)
            r4.add(r0)
            r2 = r1
        L41:
            r3 = r2
            goto L7
        L43:
            int r2 = r3 + 1
            java.lang.CharSequence r0 = r6.subSequence(r3, r2)
            r4.add(r0)
            goto L41
        L4d:
            boolean r0 = java.lang.Character.isLetter(r5)
            if (r0 == 0) goto L5a
            java.lang.String r0 = "\\w+\\p{Punct}*"
            java.util.regex.Pattern r1 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
            goto L20
        L5a:
            boolean r0 = java.lang.Character.isDigit(r5)
            if (r0 == 0) goto L67
            java.lang.String r0 = "\\d+\\.\\d+"
            java.util.regex.Pattern r1 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
            goto L20
        L67:
            boolean r0 = java.lang.Character.isSpaceChar(r5)
            if (r0 == 0) goto L74
            java.lang.String r0 = "\\s*"
            java.util.regex.Pattern r1 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
            goto L20
        L74:
            boolean r0 = java.lang.Character.isHighSurrogate(r5)
            if (r0 == 0) goto L84
            int r2 = r3 + 2
            java.lang.CharSequence r0 = r6.subSequence(r3, r2)
            r4.add(r0)
            goto L41
        L84:
            int r3 = r3 + 1
            goto L7
        L87:
            if (r2 == r3) goto L90
            java.lang.CharSequence r0 = r6.subSequence(r2, r3)
            r4.add(r0)
        L90:
            r1 = 1
            if (r7 == 0) goto Lb3
            r0 = 0
        L94:
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r0)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2 = 0
        L9b:
            int r1 = r3.length()
            if (r2 >= r1) goto Laf
            char r1 = r3.charAt(r2)
            boolean r1 = java.lang.Character.isWhitespace(r1)
            if (r1 != 0) goto Lac
        Lab:
            return r4
        Lac:
            int r2 = r2 + 1
            goto L9b
        Laf:
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r4, r0)
            goto Lab
        Lb3:
            int r0 = r4.size()
            int r0 = r0 - r1
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79741VRh.LJFF(java.lang.CharSequence, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[Catch: Exception -> 0x00fb, LOOP:2: B:21:0x007f->B:23:0x0085, LOOP_END, TryCatch #0 {Exception -> 0x00fb, blocks: (B:3:0x000b, B:5:0x0013, B:7:0x0026, B:10:0x002f, B:11:0x0047, B:13:0x004d, B:15:0x0061, B:17:0x0065, B:19:0x006b, B:21:0x007f, B:23:0x0085, B:25:0x0097, B:27:0x00c2, B:28:0x0077, B:29:0x0075, B:31:0x009a, B:33:0x00b7, B:34:0x00b9), top: B:2:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.graphics.Canvas r15, android.text.Layout r16, float r17) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79741VRh.LIZJ(android.graphics.Canvas, android.text.Layout, float):void");
    }

    public static void LIZ(Canvas canvas, Layout layout, int i, int i2, boolean z, boolean z2, int i3, int i4, int i5) {
        if (i3 < i4) {
            if (!z && !z2) {
                return;
            }
            if (i != 4) {
                if (i != 8) {
                    if (i != 16) {
                        if (i != 32) {
                            if (i != 64) {
                                return;
                            }
                            float f = i5;
                            float f2 = 2.0f;
                            float f3 = f / 2.0f;
                            float f4 = f / 3.0f;
                            int lineForOffset = layout.getLineForOffset(i3);
                            int lineForOffset2 = layout.getLineForOffset(i4);
                            Paint paint = new Paint();
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setColor(i2);
                            paint.setStrokeWidth(f4 / 5.0f);
                            int i6 = lineForOffset;
                            while (i6 <= lineForOffset2) {
                                float lineLeft = layout.getLineLeft(i6);
                                float lineBaseline = layout.getLineBaseline(i6);
                                float lineMax = layout.getLineMax(i6);
                                if (i6 == lineForOffset) {
                                    lineMax = (lineLeft + lineMax) - layout.getPrimaryHorizontal(i3);
                                    lineLeft = layout.getPrimaryHorizontal(i3);
                                }
                                if (i6 == lineForOffset2) {
                                    lineMax = layout.getPrimaryHorizontal(i4) - lineLeft;
                                }
                                int round = Math.round(lineMax / f3);
                                if (z) {
                                    Path path = new Path();
                                    float f5 = (f4 / f2) + lineBaseline;
                                    path.moveTo(lineLeft, f5);
                                    float f6 = 0.0f;
                                    for (int i7 = 0; i7 < round; i7++) {
                                        float f7 = f3 / 4.0f;
                                        path.quadTo(lineLeft + f7 + f6, lineBaseline, (f3 / 2.0f) + lineLeft + f6, f5);
                                        path.quadTo((f7 * 3.0f) + lineLeft + f6, lineBaseline + f4, lineLeft + f3 + f6, f5);
                                        f6 += f3;
                                    }
                                    canvas.drawPath(path, paint);
                                }
                                if (z2) {
                                    Path path2 = new Path();
                                    float f8 = 4.0f;
                                    float f9 = lineBaseline - ((f / 15.0f) * 4.0f);
                                    path2.moveTo(lineLeft, f9);
                                    int i8 = 0;
                                    float f10 = 0.0f;
                                    while (i8 < round) {
                                        float f11 = f3 / f8;
                                        float f12 = f4 / 2.0f;
                                        path2.quadTo(lineLeft + f11 + f10, f9 - f12, (f3 / 2.0f) + lineLeft + f10, f9);
                                        path2.quadTo((f11 * 3.0f) + lineLeft + f10, f12 + f9, lineLeft + f3 + f10, f9);
                                        f10 += f3;
                                        i8++;
                                        f8 = 4.0f;
                                    }
                                    canvas.drawPath(path2, paint);
                                }
                                i6++;
                                f2 = 2.0f;
                            }
                            return;
                        }
                        float f13 = i5;
                        int lineForOffset3 = layout.getLineForOffset(i3);
                        int lineForOffset4 = layout.getLineForOffset(i4);
                        Paint paint2 = new Paint();
                        paint2.setColor(i2);
                        float f14 = f13 / 3.0f;
                        paint2.setStrokeWidth(f14 / 5.0f);
                        paint2.setPathEffect(new DashPathEffect(new float[]{f13 / 7.0f, f13 / 20.0f}, 0.0f));
                        for (int i9 = lineForOffset3; i9 <= lineForOffset4; i9++) {
                            float lineLeft2 = layout.getLineLeft(i9);
                            float lineBaseline2 = layout.getLineBaseline(i9);
                            float lineMax2 = layout.getLineMax(i9);
                            if (i9 == lineForOffset3) {
                                lineMax2 = (lineLeft2 + lineMax2) - layout.getPrimaryHorizontal(i3);
                                lineLeft2 = layout.getPrimaryHorizontal(i3);
                            }
                            if (i9 == lineForOffset4) {
                                lineMax2 = layout.getPrimaryHorizontal(i4) - lineLeft2;
                            }
                            if (z) {
                                float f15 = (f14 / 3.0f) + lineBaseline2;
                                canvas.drawLine(lineLeft2, f15, lineLeft2 + lineMax2, f15, paint2);
                            }
                            if (z2) {
                                float f16 = lineBaseline2 - ((f13 / 15.0f) * 4.0f);
                                canvas.drawLine(lineLeft2, f16, lineLeft2 + lineMax2, f16, paint2);
                            }
                        }
                        return;
                    }
                    float f17 = i5;
                    Paint paint3 = new Paint();
                    paint3.setColor(i2);
                    float f18 = f17 / 3.0f;
                    float f19 = f17 / 4.0f;
                    int lineForOffset5 = layout.getLineForOffset(i3);
                    int lineForOffset6 = layout.getLineForOffset(i4);
                    paint3.setStrokeWidth(f18 / 5.0f);
                    for (int i10 = lineForOffset5; i10 <= lineForOffset6; i10++) {
                        float lineLeft3 = layout.getLineLeft(i10);
                        float lineBaseline3 = layout.getLineBaseline(i10);
                        float lineMax3 = layout.getLineMax(i10);
                        if (i10 == lineForOffset5) {
                            lineMax3 = (lineLeft3 + lineMax3) - layout.getPrimaryHorizontal(i3);
                            lineLeft3 = layout.getPrimaryHorizontal(i3);
                        }
                        if (i10 == lineForOffset6) {
                            lineMax3 = layout.getPrimaryHorizontal(i4) - lineLeft3;
                        }
                        int floor = (int) Math.floor(lineMax3 / f19);
                        if (floor == 0) {
                            return;
                        }
                        if (z) {
                            float f20 = 0.0f;
                            for (int i11 = 0; i11 < floor + 1; i11++) {
                                canvas.drawPoint(lineLeft3 + f20, (f18 / 3.0f) + lineBaseline3, paint3);
                                f20 += f19;
                            }
                        }
                        if (z2) {
                            float f21 = lineBaseline3 - ((f17 / 15.0f) * 4.0f);
                            float f22 = 0.0f;
                            for (int i12 = 0; i12 < floor + 1; i12++) {
                                canvas.drawPoint(lineLeft3 + f22, f21, paint3);
                                f22 += f19;
                            }
                        }
                    }
                    return;
                }
                float f23 = i5;
                Paint paint4 = new Paint();
                paint4.setColor(i2);
                float f24 = f23 / 3.0f;
                int lineForOffset7 = layout.getLineForOffset(i3);
                int lineForOffset8 = layout.getLineForOffset(i4);
                float f25 = f24 / 5.0f;
                paint4.setStrokeWidth(f25);
                for (int i13 = lineForOffset7; i13 <= lineForOffset8; i13++) {
                    float lineLeft4 = layout.getLineLeft(i13);
                    float lineBaseline4 = layout.getLineBaseline(i13);
                    float lineMax4 = layout.getLineMax(i13);
                    if (i13 == lineForOffset7) {
                        lineMax4 = (lineLeft4 + lineMax4) - layout.getPrimaryHorizontal(i3);
                        lineLeft4 = layout.getPrimaryHorizontal(i3);
                    }
                    if (i13 == lineForOffset8) {
                        lineMax4 = layout.getPrimaryHorizontal(i4) - lineLeft4;
                    }
                    if (z) {
                        float f26 = (f24 / 3.0f) + lineBaseline4;
                        float f27 = lineLeft4 + lineMax4;
                        canvas.drawLine(lineLeft4, f26, f27, f26, paint4);
                        float f28 = (3.0f * f25) + lineBaseline4;
                        canvas.drawLine(lineLeft4, f28, f27, f28, paint4);
                    }
                    if (z2) {
                        float f29 = lineBaseline4 - ((f23 / 15.0f) * 4.0f);
                        float f30 = lineLeft4 + lineMax4;
                        float f31 = lineLeft4;
                        canvas.drawLine(f31, f29, f30, f29, paint4);
                        float f32 = ((f24 / 15.0f) * 4.0f) + f29;
                        canvas.drawLine(f31, f32, f30, f32, paint4);
                    }
                }
                return;
            }
            float f33 = i5;
            Paint paint5 = new Paint();
            paint5.setColor(i2);
            float f34 = f33 / 3.0f;
            paint5.setStrokeWidth(f34 / 5.0f);
            int lineForOffset9 = layout.getLineForOffset(i3);
            int lineForOffset10 = layout.getLineForOffset(i4);
            for (int i14 = lineForOffset9; i14 <= lineForOffset10; i14++) {
                float lineLeft5 = layout.getLineLeft(i14);
                float lineBaseline5 = layout.getLineBaseline(i14);
                float lineMax5 = layout.getLineMax(i14);
                if (i14 == lineForOffset9) {
                    lineMax5 = (lineLeft5 + lineMax5) - layout.getPrimaryHorizontal(i3);
                    lineLeft5 = layout.getPrimaryHorizontal(i3);
                }
                if (i14 == lineForOffset10) {
                    lineMax5 = layout.getPrimaryHorizontal(i4) - lineLeft5;
                }
                if (z) {
                    float f35 = (f34 / 3.0f) + lineBaseline5;
                    canvas.drawLine(lineLeft5, f35, lineLeft5 + lineMax5, f35, paint5);
                }
                if (z2) {
                    float f36 = lineBaseline5 - ((f33 / 15.0f) * 4.0f);
                    canvas.drawLine(lineLeft5, f36, lineLeft5 + lineMax5, f36, paint5);
                }
            }
        }
    }
}
