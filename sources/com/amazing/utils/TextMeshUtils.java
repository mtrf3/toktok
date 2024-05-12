package com.amazing.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.Xml;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class TextMeshUtils {
    public static String[] getAndroidSystemFontPaths() {
        FileInputStream fileInputStream;
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            fileInputStream = new FileInputStream(new File("/system/etc/fonts.xml"));
            try {
                newPullParser.setInput(fileInputStream, "utf-8");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String str = null;
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                    if (eventType != 2) {
                        if (eventType != 3) {
                            if (eventType == 4) {
                                str = newPullParser.getText();
                            }
                        } else if ("family".equals(newPullParser.getName())) {
                            int i = 0;
                            while (true) {
                                if (i < arrayList2.size()) {
                                    if (((String) arrayList2.get(i)).contains("Regular")) {
                                        break;
                                    }
                                    i++;
                                } else {
                                    i = -1;
                                    break;
                                }
                            }
                            String str2 = new String("/system/fonts/");
                            if (i < 0) {
                                arrayList.add(str2.concat((String) arrayList2.get(0)));
                            } else {
                                arrayList.add(str2.concat((String) arrayList2.get(i)));
                            }
                        } else if ("font".equals(newPullParser.getName())) {
                            arrayList2.add(str);
                        } else if ("familyset".equals(newPullParser.getName())) {
                            str = "ending";
                        }
                    } else if ("family".equals(newPullParser.getName())) {
                        arrayList2.clear();
                    }
                }
                String[] strArr = new String[arrayList.size()];
                arrayList.toArray(strArr);
                try {
                    fileInputStream.close();
                } catch (Exception unused) {
                }
                return strArr;
            } catch (Exception unused2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public static float getDeviceDpi() {
        return Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    public static Bitmap callIStaticGenerateBitmapForEmoji(byte[] bArr, int i) {
        String str = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(i);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        Rect rect = new Rect();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawText(str, -rect.left, -rect.top, textPaint);
        canvas.save();
        canvas.restore();
        return createBitmap;
    }

    public static Bitmap generateImage(String str, float f, byte[] bArr, int i, boolean z, float f2, int i2, boolean z2, float f3, float f4, int i3, float f5) {
        float f6 = f5;
        float f7 = f3;
        float f8 = f4;
        String str2 = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setColor(i);
        Rect rect = new Rect();
        textPaint.getTextWidths(str2, new float[str2.length()]);
        textPaint.getTextBounds(str2, 0, str2.length(), rect);
        if (!z) {
            f2 = 0.0f;
        }
        if (!z2) {
            f7 = 0.0f;
            f8 = 0.0f;
            f6 = 0.0f;
        }
        float max = Math.max(Math.abs(f7), Math.abs(f8)) + f2;
        TextPaint textPaint2 = new TextPaint();
        if (z || z2) {
            textPaint2.setTextSize(f);
            textPaint2.setAntiAlias(true);
            textPaint2.setStyle(Paint.Style.STROKE);
            textPaint2.setTextAlign(Paint.Align.LEFT);
            textPaint2.setStrokeWidth(f2 * 2.0f * f);
            textPaint2.setColor(i2);
            if (z2) {
                textPaint2.setShadowLayer(f6 * f, f7 * f, f8 * f, i3);
            }
        }
        float f9 = 2.0f * max * f;
        Bitmap createBitmap = Bitmap.createBitmap((int) (rect.width() + f9), (int) (rect.height() + f9), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (z || z2) {
            float f10 = max * f;
            canvas.drawText(str2, (-rect.left) + f10, (-rect.top) + f10, textPaint2);
        }
        float f11 = max * f;
        canvas.drawText(str2, (-rect.left) + f11, (-rect.top) + f11, textPaint);
        canvas.save();
        canvas.restore();
        return createBitmap;
    }

    public static float[] generateImageSize(String str, float f, byte[] bArr, int i, boolean z, float f2, int i2, boolean z2, float f3, float f4, int i3, float f5) {
        String str2 = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setColor(i);
        Rect rect = new Rect();
        float[] fArr = new float[str2.length()];
        textPaint.getTextWidths(str2, fArr);
        textPaint.getTextBounds(str2, 0, str2.length(), rect);
        if (!z) {
            f2 = 0.0f;
        }
        if (!z2) {
            f3 = 0.0f;
            f4 = 0.0f;
        }
        return new float[]{rect.left, rect.right, -rect.bottom, -rect.top, fArr[0], (Math.max(Math.abs(f3), Math.abs(f4)) + f2) * f, textPaint.ascent(), textPaint.descent()};
    }

    public static Bitmap callIStaticGenerateBitmapFromTextMesh(byte[] bArr, String str, int i, int i2, int i3, float f, int i4, float f2, int i5, float f3, float f4, float f5, int i6, int i7, int i8, int i9) {
        String str2 = new String(bArr);
        Rect rect = new Rect(0, 0, i8, i9);
        Bitmap createBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        Canvas canvas = new Canvas(createBitmap);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(i2);
        float f6 = i;
        textPaint.setTextSize(f6);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        if (i7 == 0) {
            textPaint.setTextAlign(Paint.Align.LEFT);
        } else if (i7 == 1) {
            textPaint.setTextAlign(Paint.Align.CENTER);
        } else {
            textPaint.setTextAlign(Paint.Align.RIGHT);
        }
        if ((i4 & 16) == 16) {
            textPaint.setUnderlineText(true);
        }
        if ((i4 & 32) == 32) {
            textPaint.setStrikeThruText(true);
        }
        if ((i4 & 4) == 4) {
            textPaint.setTextSkewX((-f) / 90.0f);
        }
        if ((i4 & 8) == 8) {
            textPaint.setFakeBoldText(true);
        }
        if ((i4 & 2) == 2) {
            textPaint.setShadowLayer(f3, f4, f5, i6);
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f7 = fontMetrics.top;
        float f8 = fontMetrics.bottom;
        String[] split = str2.split("\n");
        int length = split.length;
        if ((i4 & 1) == 1) {
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setColor(i5);
            textPaint2.setTextSize(textPaint.getTextSize());
            textPaint2.setAntiAlias(textPaint.isAntiAlias());
            textPaint2.setStyle(Paint.Style.STROKE);
            textPaint2.setStrokeWidth((5.0f * f2) / f6);
            textPaint2.setTextAlign(textPaint.getTextAlign());
            textPaint2.setTextSkewX(textPaint.getTextSkewX());
            textPaint.setFakeBoldText(false);
            textPaint2.setFakeBoldText(true);
            float f9 = i3 / f6;
            float f10 = ((-fontMetrics.ascent) + fontMetrics.descent) * 0.1f;
            for (int i10 = 0; i10 < length; i10++) {
                int centerY = (int) (((int) ((rect.centerY() - (f7 / 2.0f)) - (f8 / 2.0f))) - ((((length - 1) * 0.5d) - i10) * (f10 + r5)));
                textPaint2.setLetterSpacing(f9);
                if (i7 == 0) {
                    canvas.drawText(split[i10], rect.left, centerY, textPaint2);
                } else if (i7 == 1) {
                    canvas.drawText(split[i10], rect.centerX(), centerY, textPaint2);
                } else {
                    canvas.drawText(split[i10], rect.right, centerY, textPaint2);
                }
            }
        }
        float f11 = i3 / f6;
        float f12 = 0.1f * ((-fontMetrics.ascent) + fontMetrics.descent);
        for (int i11 = 0; i11 < length; i11++) {
            int centerY2 = (int) (((int) ((rect.centerY() - (f7 / 2.0f)) - (f8 / 2.0f))) - ((((length - 1) * 0.5d) - i11) * (f12 + r13)));
            textPaint.setLetterSpacing(f11);
            if (i7 == 0) {
                canvas.drawText(split[i11], rect.left, centerY2, textPaint);
            } else if (i7 == 1) {
                canvas.drawText(split[i11], rect.centerX(), centerY2, textPaint);
            } else {
                canvas.drawText(split[i11], rect.right, centerY2, textPaint);
            }
        }
        canvas.save();
        canvas.restore();
        return createBitmap;
    }
}
