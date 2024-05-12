package Y;

import X.EnumC138985cs;
import X.EnumC138995ct;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes3.dex */
public class IDuS314S0100000_2 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Bitmap> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public IDuS314S0100000_2(Bitmap bitmap, int i) {
        this.$t = i;
        this.l0 = bitmap;
    }

    public static final void subscribe$0(IDuS314S0100000_2 iDuS314S0100000_2, InterfaceC73573Su9 interfaceC73573Su9) {
        EnumC138995ct enumC138995ct;
        Rect rect;
        try {
            int min = Math.min(((Bitmap) iDuS314S0100000_2.l0).getWidth(), ((Bitmap) iDuS314S0100000_2.l0).getHeight()) / 2;
            Point point = new Point(((Bitmap) iDuS314S0100000_2.l0).getWidth() / 2, ((Bitmap) iDuS314S0100000_2.l0).getHeight() / 2);
            if (((Bitmap) iDuS314S0100000_2.l0).getWidth() > ((Bitmap) iDuS314S0100000_2.l0).getHeight()) {
                enumC138995ct = EnumC138995ct.HORIZONTAL;
            } else {
                enumC138995ct = EnumC138995ct.VERTICAL;
            }
            int i = min * 2;
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect2 = new Rect(0, 0, i, i);
            RectF rectF = new RectF(new Rect(0, 0, i, i));
            float min2 = Math.min(((Bitmap) iDuS314S0100000_2.l0).getWidth(), ((Bitmap) iDuS314S0100000_2.l0).getHeight()) / 2;
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-16777216);
            canvas.drawRoundRect(rectF, min2, min2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            if (enumC138995ct == EnumC138995ct.HORIZONTAL) {
                int i2 = point.x;
                rect = new Rect(i2 - min, 0, i2 + min, i);
            } else {
                int i3 = point.y;
                rect = new Rect(0, i3 - min, i, i3 + min);
            }
            canvas.drawBitmap((Bitmap) iDuS314S0100000_2.l0, rect, rect2, paint);
            interfaceC73573Su9.onNext(createBitmap);
            interfaceC73573Su9.onComplete();
            ((Bitmap) iDuS314S0100000_2.l0).recycle();
        } catch (Exception unused) {
            interfaceC73573Su9.onNext((Bitmap) iDuS314S0100000_2.l0);
            interfaceC73573Su9.onComplete();
        }
    }

    public static final void subscribe$1(IDuS314S0100000_2 iDuS314S0100000_2, InterfaceC73573Su9 interfaceC73573Su9) {
        EnumC138985cs enumC138985cs;
        Rect rect;
        try {
            int min = Math.min(((Bitmap) iDuS314S0100000_2.l0).getWidth(), ((Bitmap) iDuS314S0100000_2.l0).getHeight()) / 2;
            Point point = new Point(((Bitmap) iDuS314S0100000_2.l0).getWidth() / 2, ((Bitmap) iDuS314S0100000_2.l0).getHeight() / 2);
            if (((Bitmap) iDuS314S0100000_2.l0).getWidth() > ((Bitmap) iDuS314S0100000_2.l0).getHeight()) {
                enumC138985cs = EnumC138985cs.HORIZONTAL;
            } else {
                enumC138985cs = EnumC138985cs.VERTICAL;
            }
            int i = min * 2;
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect2 = new Rect(0, 0, i, i);
            RectF rectF = new RectF(rect2);
            float min2 = Math.min(((Bitmap) iDuS314S0100000_2.l0).getWidth(), ((Bitmap) iDuS314S0100000_2.l0).getHeight()) / 2;
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-16777216);
            canvas.drawRoundRect(rectF, min2, min2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            if (enumC138985cs == EnumC138985cs.HORIZONTAL) {
                int i2 = point.x;
                rect = new Rect(i2 - min, 0, i2 + min, i);
            } else {
                int i3 = point.y;
                rect = new Rect(0, i3 - min, i, i3 + min);
            }
            canvas.drawBitmap((Bitmap) iDuS314S0100000_2.l0, rect, rect2, paint);
            interfaceC73573Su9.onNext(createBitmap);
            interfaceC73573Su9.onComplete();
            ((Bitmap) iDuS314S0100000_2.l0).recycle();
        } catch (Exception unused) {
            interfaceC73573Su9.onNext((Bitmap) iDuS314S0100000_2.l0);
            interfaceC73573Su9.onComplete();
        }
    }
}
