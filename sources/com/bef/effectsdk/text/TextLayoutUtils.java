package com.bef.effectsdk.text;

import X.C0EH;
import X.C1FL;
import X.V0N;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bef.effectsdk.text.data.BitmapType;
import com.bef.effectsdk.text.data.CharLayout;
import com.bef.effectsdk.text.data.TextBitmapResult;
import com.bef.effectsdk.text.data.TextLayoutParam;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class TextLayoutUtils {

    /* renamed from: com.bef.effectsdk.text.TextLayoutUtils$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE;
        public static final /* synthetic */ int[] $SwitchMap$com$bef$effectsdk$text$data$BitmapType;

        static {
            int[] iArr = new int[COLOR_TYPE.values().length];
            $SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE = iArr;
            try {
                iArr[COLOR_TYPE.COLOR_TYPE_ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE[COLOR_TYPE.COLOR_TYPE_RGBA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[BitmapType.values().length];
            $SwitchMap$com$bef$effectsdk$text$data$BitmapType = iArr2;
            try {
                iArr2[BitmapType.TEXT_BITMAP_SHAKE_ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bef$effectsdk$text$data$BitmapType[BitmapType.TEXT_BITMAP_NEON_ALPHA.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum COLOR_TYPE {
        COLOR_TYPE_RGBA,
        COLOR_TYPE_ALPHA;

        public static COLOR_TYPE valueOf(String str) {
            return (COLOR_TYPE) V0N.LJJJ(COLOR_TYPE.class, str);
        }
    }

    public static String[] lyricShakeSplit(String str) {
        boolean z;
        int length;
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] split = str.replace("\n", " ").replace(",", "").replace("\r", " ").split(" ");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < split.length) {
            if (!split[i].isEmpty()) {
                int length2 = sb.toString().length();
                if (length2 == 0) {
                    if (split[i].length() < 10) {
                        sb.append(split[i]);
                    } else if (split[i].length() == 10) {
                        arrayList.add(split[i]);
                    } else {
                        arrayList.add(split[i].substring(0, 10));
                        if ((split[i].length() - 10) % 9 == 0) {
                            z = true;
                            length = (split[i].length() - 10) / 9;
                        } else {
                            z = false;
                            length = ((split[i].length() - 10) / 9) + 1;
                        }
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            if (i2 == 0) {
                                if (z) {
                                    sb.append("-");
                                    sb.append(split[i].substring(10, 19));
                                    String sb2 = sb.toString();
                                    arrayList.add(sb2);
                                    sb.delete(0, sb2.length());
                                } else {
                                    if (length == 1) {
                                        int length3 = split[i].length();
                                        sb.append("-");
                                        sb.append(split[i].substring(10, length3));
                                        break;
                                    }
                                    sb.append("-");
                                    sb.append(split[i].substring(10, 19));
                                    String sb3 = sb.toString();
                                    arrayList.add(sb3);
                                    sb.delete(0, sb3.length());
                                }
                            } else {
                                int LIZ = C0EH.LIZ(i2, -1, 9, 19);
                                if (i2 < length - 1) {
                                    sb.append("-");
                                    sb.append(split[i].substring(LIZ, (i2 * 9) + 19));
                                    String sb4 = sb.toString();
                                    arrayList.add(sb4);
                                    sb.delete(0, sb4.length());
                                } else if (z) {
                                    sb.append("-");
                                    sb.append(split[i].substring(LIZ, (i2 * 9) + 19));
                                    String sb5 = sb.toString();
                                    arrayList.add(sb5);
                                    sb.delete(0, sb5.length());
                                } else {
                                    int length4 = split[i].length();
                                    sb.append("-");
                                    sb.append(split[i].substring(LIZ, length4));
                                }
                            }
                            i2++;
                        }
                    }
                } else {
                    if (C1FL.LIZ(split[i], sb.toString().length(), 1) <= 10) {
                        sb.append(" ");
                        sb.append(split[i]);
                    } else {
                        arrayList.add(sb.toString());
                        sb.delete(0, length2);
                        i--;
                    }
                }
            }
            i++;
        }
        if (sb.toString().length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] splitLyric(String str) {
        int i;
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] split = str.replace("\n", " ").replace("\r", " ").split(" ");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            StringBuilder sb = new StringBuilder();
            if ((i3 % 5) % 3 == 0) {
                i = 6;
            } else {
                i = 10;
            }
            int i4 = 0;
            while (i2 < split.length && (C1FL.LIZ(split[i2], i4, 1) <= i || i4 <= 3)) {
                i4 = C1FL.LIZ(split[i2], 1, i4);
                int i5 = i2 + 1;
                sb.append(split[i2]);
                sb.append(" ");
                if (i5 == split.length - 1 && split[i5].length() < 3) {
                    sb.append(split[i5]);
                }
                i2 = i5;
            }
            i3++;
            arrayList.add(sb.substring(0, sb.length() - 1));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static TextBitmapResult generateBitmapAtlasAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length < 1) {
            return null;
        }
        return generateBitmapAtlasUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapAtlasAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapAtlasUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapAtlasRGBAUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length < 1) {
            return null;
        }
        return generateBitmapAtlasUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapAtlasRGBAUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapAtlasUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapNeonAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length < 1) {
            return null;
        }
        return generateBitmapNeonAlphaUTF8(new String(iArr, 0, iArr.length), textLayoutParam);
    }

    public static TextBitmapResult generateBitmapNeonAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        int i = AnonymousClass1.$SwitchMap$com$bef$effectsdk$text$data$BitmapType[BitmapType.valueOf(textLayoutParam.bitmapType).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return generateTextAutoSizedNeonBitmap(str, textLayoutParam);
        }
        return generateTextAutoSizedShakeBitmap(str, textLayoutParam);
    }

    public static TextBitmapResult generateBitmapNormalAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length < 1) {
            return null;
        }
        return generateBitmapNormalUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapNormalAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapNormalUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapNormalRGBAUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length < 1) {
            return null;
        }
        return generateBitmapNormalUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapNormalRGBAUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapNormalUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v3 */
    public static TextBitmapResult generateTextAutoSizedNeonBitmap(String str, TextLayoutParam textLayoutParam) {
        boolean z;
        StaticLayout staticLayout;
        float f;
        float f2;
        float f3;
        String[] splitLyric = splitLyric(str);
        if (TextUtils.isEmpty(str) || textLayoutParam == null) {
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setAntiAlias(true);
        if (!TextUtils.isEmpty(textLayoutParam.familyName) && !TextUtils.isEmpty(textLayoutParam.fontPath)) {
            textPaint.setTypeface(FontCache.getFromFile(textLayoutParam.fontPath, textLayoutParam.familyName));
        }
        ?? r11 = 0;
        if (textPaint.getFontMetrics().top < textPaint.getFontMetrics().ascent) {
            z = true;
        } else {
            z = false;
        }
        TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 1;
        textBitmapResult.lineCount = splitLyric.length;
        textBitmapResult.type = 0;
        textBitmapResult.charLayouts = new CharLayout[splitLyric.length];
        int[] iArr = new int[splitLyric.length];
        float f4 = 0.0f;
        for (int i = 0; i < splitLyric.length; i++) {
            String str2 = splitLyric[i];
            int i2 = 10;
            textPaint.setTextSize(10);
            for (float measureText = textPaint.measureText(str2, 0, str2.length()); measureText <= textLayoutParam.lineWidth; measureText = textPaint.measureText(str2, 0, str2.length())) {
                i2 += 2;
                textPaint.setTextSize(i2);
            }
            int i3 = i2 - 2;
            iArr[i] = i3;
            textPaint.setTextSize(i3);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            if (z) {
                f2 = fontMetrics.bottom;
                f3 = fontMetrics.top;
            } else {
                f2 = fontMetrics.descent;
                f3 = fontMetrics.ascent;
            }
            f4 += f2 - f3;
        }
        Bitmap createBitmap = Bitmap.createBitmap(textLayoutParam.lineWidth, (int) f4, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        textBitmapResult.bitmap = createBitmap;
        int i4 = 0;
        float f5 = 0.0f;
        while (i4 < splitLyric.length) {
            String str3 = splitLyric[i4];
            textPaint.setTextSize(iArr[i4]);
            Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = StaticLayout.Builder.obtain(str3, r11, str3.length(), textPaint, canvas.getWidth()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(r11).build();
            } else {
                staticLayout = new StaticLayout(str3, 0, str3.length(), textPaint, canvas.getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            staticLayout.draw(canvas);
            CharLayout charLayout = new CharLayout();
            if (z) {
                float f6 = fontMetrics2.bottom;
                float f7 = fontMetrics2.top;
                f = f6 - f7;
                charLayout.baseline = (f5 - f7) / f4;
            } else {
                float f8 = fontMetrics2.descent;
                float f9 = fontMetrics2.ascent;
                f = f8 - f9;
                charLayout.baseline = (f5 - f9) / f4;
            }
            charLayout.top = f5 / f4;
            f5 += f;
            charLayout.bottom = f5 / f4;
            charLayout.left = 0.0f;
            charLayout.right = 1.0f;
            textBitmapResult.charLayouts[i4] = charLayout;
            canvas.translate(0.0f, f);
            i4++;
            r11 = 0;
        }
        return textBitmapResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v4 */
    public static TextBitmapResult generateTextAutoSizedShakeBitmap(String str, TextLayoutParam textLayoutParam) {
        boolean z;
        StaticLayout staticLayout;
        String[] lyricShakeSplit = lyricShakeSplit(str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        if (!TextUtils.isEmpty(textLayoutParam.familyName) && !TextUtils.isEmpty(textLayoutParam.fontPath)) {
            textPaint.setTypeface(FontCache.getFromFile(textLayoutParam.fontPath, textLayoutParam.familyName));
        }
        textPaint.setTextSize(textLayoutParam.fontSize);
        ?? r11 = 0;
        if (textPaint.getFontMetrics().top < textPaint.getFontMetrics().ascent) {
            z = true;
        } else {
            z = false;
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        ArrayList arrayList = new ArrayList();
        float f = textLayoutParam.lineWidth;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (i2 < lyricShakeSplit.length) {
            String str2 = lyricShakeSplit[i2];
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = StaticLayout.Builder.obtain(str2, r11, str2.length(), textPaint, (int) f).setAlignment(Layout.Alignment.ALIGN_OPPOSITE).setLineSpacing(f2, 1.0f).setIncludePad(r11).build();
            } else {
                staticLayout = new StaticLayout(str2, 0, str2.length(), textPaint, (int) f, Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
            }
            i += staticLayout.getLineCount();
            arrayList.add(staticLayout);
            i2++;
            f2 = 0.0f;
            r11 = 0;
            f3 = staticLayout.getHeight() + f3;
        }
        TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 1;
        textBitmapResult.lineCount = i;
        textBitmapResult.type = 0;
        textBitmapResult.charLayouts = new CharLayout[i];
        Bitmap createBitmap = Bitmap.createBitmap(textLayoutParam.lineWidth, (int) f3, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        textBitmapResult.bitmap = createBitmap;
        float f4 = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < lyricShakeSplit.length; i4++) {
            float height = ((Layout) ListProtector.get(arrayList, i4)).getHeight();
            float lineCount = height / ((StaticLayout) ListProtector.get(arrayList, i4)).getLineCount();
            for (int i5 = 0; i5 < ((StaticLayout) ListProtector.get(arrayList, i4)).getLineCount(); i5++) {
                CharLayout charLayout = new CharLayout();
                float lineWidth = ((Layout) ListProtector.get(arrayList, i4)).getLineWidth(i5);
                if (z) {
                    charLayout.baseline = (f4 - fontMetrics.top) / f3;
                } else {
                    charLayout.baseline = (f4 - fontMetrics.ascent) / f3;
                }
                charLayout.top = f4 / f3;
                f4 += lineCount;
                charLayout.bottom = (f4 - (Math.abs(fontMetrics.bottom - fontMetrics.descent) / 2.0f)) / f3;
                if (textLayoutParam.textAlign == 0) {
                    charLayout.left = 0.0f;
                    charLayout.right = (f - lineWidth) / f;
                } else {
                    charLayout.left = (f - lineWidth) / f;
                    charLayout.right = 1.0f;
                }
                textBitmapResult.charLayouts[i3] = charLayout;
                i3++;
            }
            ((Layout) ListProtector.get(arrayList, i4)).draw(canvas);
            canvas.translate(0.0f, height * ((StaticLayout) ListProtector.get(arrayList, i4)).getLineCount());
        }
        return textBitmapResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0277 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bef.effectsdk.text.data.TextBitmapResult generateBitmapAtlasUTF8(java.lang.String r27, com.bef.effectsdk.text.data.TextLayoutParam r28, com.bef.effectsdk.text.TextLayoutUtils.COLOR_TYPE r29) {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.text.TextLayoutUtils.generateBitmapAtlasUTF8(java.lang.String, com.bef.effectsdk.text.data.TextLayoutParam, com.bef.effectsdk.text.TextLayoutUtils$COLOR_TYPE):com.bef.effectsdk.text.data.TextBitmapResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bef.effectsdk.text.data.TextBitmapResult generateBitmapNormalUTF8(java.lang.String r28, com.bef.effectsdk.text.data.TextLayoutParam r29, com.bef.effectsdk.text.TextLayoutUtils.COLOR_TYPE r30) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.text.TextLayoutUtils.generateBitmapNormalUTF8(java.lang.String, com.bef.effectsdk.text.data.TextLayoutParam, com.bef.effectsdk.text.TextLayoutUtils$COLOR_TYPE):com.bef.effectsdk.text.data.TextBitmapResult");
    }
}
