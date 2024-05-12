package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.text.TextPaint;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H71<T> implements InterfaceC15040iS {
    public final /* synthetic */ H6P LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ XJL<Boolean> LIZJ;

    public H71(H6P h6p, String str, XKS xks) {
        this.LIZ = h6p;
        this.LIZIZ = str;
        this.LIZJ = xks;
    }

    @Override // X.InterfaceC15040iS
    public final void accept(Object obj) {
        boolean z;
        int i;
        String str;
        boolean z2;
        float f;
        int i2;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            H78.LIZLLL("WatermarkResourceLoader", new Throwable("requested user avatar is null"));
            bitmap = BitmapFactory.decodeResource(this.LIZ.LIZ.getResources(), R.drawable.aak);
            o.LJIIIIZZ(bitmap, "{\n                ToolsL…fault_icon)\n            }");
            z = false;
        } else {
            z = true;
        }
        String nickname = this.LIZ.LJ.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        String LIZ = this.LIZ.LIZ();
        H72 h72 = new H72();
        if (this.LIZ.LJFF.invoke().booleanValue()) {
            int intValue = ((Number) ListProtector.get(this.LIZ.LIZJ, 0)).intValue();
            int intValue2 = ((Number) ListProtector.get(this.LIZ.LIZJ, 1)).intValue();
            if (intValue > 0 && intValue2 > 0) {
                float min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                float f2 = 3 * ((min * 1.0f) / 128);
                int round = Math.round((2 * f2) + min);
                float f3 = round / 2.0f;
                Bitmap output = Bitmap.createBitmap(round, round, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(output);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                canvas.drawARGB(0, 0, 0, 0);
                paint.setColor(-12434878);
                float f4 = f3 - f2;
                canvas.drawCircle(f3, f3, f4, paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(bitmap, (Rect) null, new Rect(0, 0, round, round), paint);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(f2);
                paint.setColor(-1);
                paint.setXfermode(null);
                canvas.drawCircle(f3, f3, f4, paint);
                o.LJIIIIZZ(output, "output");
                Matrix matrix = new Matrix();
                float width = (135 * 1.0f) / output.getWidth();
                matrix.preScale(width, width);
                Bitmap createBitmap = Bitmap.createBitmap(output, 0, 0, output.getWidth(), output.getHeight(), matrix, false);
                h72.LIZ = createBitmap;
                if (!o.LJ(createBitmap, output) && !output.isRecycled()) {
                    output.recycle();
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(this.LIZIZ);
                LIZ2.append("profile.png");
                h72.LIZLLL(X1D.LIZIZ(LIZ2));
            }
            int intValue3 = ((Number) ListProtector.get(this.LIZ.LIZJ, 0)).intValue();
            int intValue4 = ((Number) ListProtector.get(this.LIZ.LIZJ, 1)).intValue();
            if (intValue3 > 0 && intValue4 > 0) {
                h72.LIZ = Bitmap.createBitmap(386, 35, Bitmap.Config.ARGB_8888);
                Bitmap bitmap2 = h72.LIZ;
                o.LJI(bitmap2);
                Canvas canvas2 = new Canvas(bitmap2);
                canvas2.drawColor(0);
                if (intValue3 < intValue4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                TextPaint textPaint = new TextPaint(1);
                if (z2) {
                    f = 36.0f;
                } else {
                    f = 32.0f;
                }
                textPaint.setTextSize(f);
                textPaint.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
                textPaint.setStyle(Paint.Style.FILL);
                textPaint.setColor(ColorProtector.parseColor("#E6FFFFFF"));
                textPaint.setTextAlign(Paint.Align.CENTER);
                int i3 = 20;
                if (nickname.length() > 20) {
                    if (Character.isHighSurrogate(nickname.charAt(20))) {
                        i3 = 19;
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    String substring = nickname.substring(0, i3);
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    LIZ3.append(substring);
                    LIZ3.append("...");
                    nickname = X1D.LIZIZ(LIZ3);
                }
                float measureText = textPaint.measureText(nickname);
                if (measureText > 386.0f) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    int length = nickname.length() - (((int) ((measureText - 386.0f) / (measureText / nickname.length()))) + 3);
                    i2 = 0;
                    String substring2 = nickname.substring(0, length);
                    o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    LIZ4.append(substring2);
                    LIZ4.append("...");
                    nickname = X1D.LIZIZ(LIZ4);
                } else {
                    i2 = 0;
                }
                textPaint.getTextBounds(nickname, i2, nickname.length(), new Rect());
                Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                o.LJIIIIZZ(fontMetrics, "nicknamePaint.getFontMetrics()");
                float f5 = fontMetrics.bottom;
                canvas2.drawText(nickname, 193, 17 + (((f5 - fontMetrics.top) / 2) - f5), textPaint);
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(this.LIZIZ);
                LIZ5.append("nickname.png");
                h72.LIZLLL(X1D.LIZIZ(LIZ5));
            }
        }
        H6P h6p = this.LIZ;
        Context context = h6p.LIZ;
        int intValue5 = ((Number) ListProtector.get(h6p.LIZJ, 0)).intValue();
        int intValue6 = ((Number) ListProtector.get(this.LIZ.LIZJ, 1)).intValue();
        o.LJIIIZ(context, "context");
        if (intValue5 > 0 && intValue6 > 0) {
            h72.LIZ = Bitmap.createBitmap(261, 32, Bitmap.Config.ARGB_8888);
            Bitmap bitmap3 = h72.LIZ;
            o.LJI(bitmap3);
            Canvas canvas3 = new Canvas(bitmap3);
            canvas3.drawColor(0);
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.azt);
            o.LJIIIIZZ(decodeResource, "decodeResource(context.r…e.ic_ending_watermark_at)");
            boolean z3 = true;
            TextPaint textPaint2 = new TextPaint(1);
            textPaint2.setTextSize(28.0f);
            textPaint2.setTypeface(C8HI.LIZJ().LIZLLL("regular"));
            textPaint2.setColor(ColorProtector.parseColor("#E6FFFFFF"));
            textPaint2.setTextAlign(Paint.Align.CENTER);
            int length2 = LIZ.length();
            if (LIZ.length() > 15) {
                if (Character.isHighSurrogate(LIZ.charAt(15))) {
                    length2 = 14;
                } else {
                    length2 = 15;
                }
            } else {
                z3 = false;
            }
            Rect rect = new Rect();
            if (z3) {
                StringBuilder LIZ6 = X1D.LIZ();
                i = 0;
                String substring3 = LIZ.substring(0, length2);
                o.LJIIIIZZ(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                LIZ6.append(substring3);
                LIZ6.append("...");
                str = X1D.LIZIZ(LIZ6);
            } else {
                i = 0;
                str = LIZ;
            }
            textPaint2.getTextBounds(str, i, str.length(), rect);
            float width2 = rect.width();
            float height = rect.height();
            if (width2 > 259 - height) {
                int ceil = (int) Math.ceil((width2 - r1) / (width2 / str.length()));
                if (!z3) {
                    ceil += 3;
                }
                StringBuilder LIZ7 = X1D.LIZ();
                String substring4 = LIZ.substring(0, length2 - ceil);
                o.LJIIIIZZ(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                LIZ7.append(substring4);
                LIZ7.append("...");
                str = X1D.LIZIZ(LIZ7);
            } else if (!z3) {
                str = LIZ;
            }
            Rect rect2 = new Rect();
            textPaint2.getTextBounds(str, 0, str.length(), rect2);
            float f6 = 2;
            int width3 = 261 - ((int) ((rect2.width() + height) + f6));
            int width4 = (261 - (width3 / 2)) - (rect2.width() / 2);
            Paint.FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
            o.LJIIIIZZ(fontMetrics2, "paint.getFontMetrics()");
            float f7 = fontMetrics2.bottom;
            float f8 = 16 + (((f7 - fontMetrics2.top) / f6) - f7);
            int i4 = (int) (width3 / 2.0f);
            int max = Math.max((int) (Math.ceil(32 - height) / 2.0f), 0) + ((int) ((intValue5 * 2) / 750.0f));
            canvas3.drawBitmap(decodeResource, (Rect) null, new Rect(i4, max, (int) (i4 + height), (int) (max + height)), textPaint2);
            canvas3.drawText(str, width4, f8, textPaint2);
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append(this.LIZIZ);
            LIZ8.append("username.png");
            h72.LIZLLL(X1D.LIZIZ(LIZ8));
        }
        Boolean valueOf = Boolean.valueOf(z);
        XJL<Boolean> xjl = this.LIZJ;
        C3C5.m7constructorimpl(valueOf);
        xjl.resumeWith(valueOf);
    }
}
