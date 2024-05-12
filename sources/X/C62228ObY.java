package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.File;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.o;
import v82.IDdS502S0100000_10;

/* renamed from: X.ObY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62228ObY implements C5CH {
    @Override // X.C5CH
    public final void LIZ(Context context, String str, ImageView imageView, C5CW c5cw) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(imageView, "imageView");
        W5F it = W5U.LJIIIIZZ(str);
        o.LJIIIIZZ(it, "it");
        C51029K0z.LJJIZ(c5cw, it);
        it.LIZLLL = true;
        it.LIZJ = context;
        it.LJJIIJZLJL = imageView;
        C16880lQ.LLJJJ(it);
    }

    @Override // X.C5CH
    public final Object LIZIZ(Context context, String str, C5CW c5cw, InterfaceC67352kd<? super Bitmap> interfaceC67352kd) {
        int i;
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        android.net.Uri parse = UriProtector.parse(str);
        if (!o.LJ(parse.getScheme(), "content")) {
            parse = android.net.Uri.fromFile(new File(str));
        }
        W5F LJFF = W5U.LJFF(parse);
        Integer num = c5cw.LIZ;
        int i2 = -1;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        Integer num2 = c5cw.LIZIZ;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        LJFF.LJII = i;
        LJFF.LJIIIIZZ = i2;
        LJFF.LJIJJ = EnumC72807Shn.CENTER_CROP;
        Bitmap.Config config = c5cw.LIZJ;
        if (config == null) {
            config = Bitmap.Config.RGB_565;
        }
        LJFF.LJIJI = config;
        LJFF.LIZJ = context;
        LJFF.LJIIIZ(new IDdS502S0100000_10(c84654XKg, 0));
        return c84654XKg.LIZ();
    }

    @Override // X.C5CH
    public final void LIZJ(Context context, Bitmap bitmap, ImageView imageView, C5CW c5cw) {
        o.LJIIIZ(bitmap, "bitmap");
        o.LJIIIZ(imageView, "imageView");
        W5F LJII = W5U.LJII(bitmap);
        C51029K0z.LJJIZ(c5cw, LJII);
        LJII.LJJIIJZLJL = imageView;
        C16880lQ.LLJJJ(LJII);
    }

    @Override // X.C5CH
    public final Bitmap resizeBitmapSync(Context context, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            f = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
        o.LJIIIIZZ(createBitmap, "createBitmap(width, height, Bitmap.Config.RGB_565)");
        Lock lock = C62229ObZ.LIZJ;
        lock.lock();
        try {
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawBitmap(bitmap, matrix, C62229ObZ.LIZIZ);
            canvas.setBitmap(null);
            lock.unlock();
            return createBitmap;
        } catch (Throwable th) {
            C62229ObZ.LIZJ.unlock();
            throw th;
        }
    }
}
