package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.5CG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CG implements C5CH {
    public static final C5CG LIZ = new C5CG();

    @Override // X.C5CH
    public final void LIZ(Context context, String str, ImageView imageView, C5CW c5cw) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(imageView, "imageView");
        try {
            C5CH c5ch = C1280550v.LIZ().LIZ().LIZJ;
            if (c5ch != null) {
                c5ch.LIZ(context, str, imageView, c5cw);
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.C5CH
    public final Object LIZIZ(Context context, String str, C5CW c5cw, InterfaceC67352kd<? super Bitmap> interfaceC67352kd) {
        C5CH c5ch = C1280550v.LIZ().LIZ().LIZJ;
        if (c5ch != null) {
            return c5ch.LIZIZ(context, str, c5cw, interfaceC67352kd);
        }
        return null;
    }

    @Override // X.C5CH
    public final void LIZJ(Context context, Bitmap bitmap, ImageView imageView, C5CW c5cw) {
        o.LJIIIZ(bitmap, "bitmap");
        o.LJIIIZ(imageView, "imageView");
        C5CH c5ch = C1280550v.LIZ().LIZ().LIZJ;
        if (c5ch != null) {
            c5ch.LIZJ(context, bitmap, imageView, c5cw);
        }
    }

    @Override // X.C5CH
    public final Bitmap resizeBitmapSync(Context context, Bitmap bitmap, int i, int i2) {
        C5CH c5ch = C1280550v.LIZ().LIZ().LIZJ;
        if (c5ch != null) {
            return c5ch.resizeBitmapSync(context, bitmap, i, i2);
        }
        return null;
    }
}
