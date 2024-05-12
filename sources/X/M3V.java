package X;

import android.graphics.Bitmap;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M3V implements InterfaceC199707sc {
    @Override // X.InterfaceC199707sc
    public final Bitmap LIZ(View contentView) {
        o.LJIIIZ(contentView, "contentView");
        Bitmap createBitmap = Bitmap.createBitmap(0, 0, Bitmap.Config.ARGB_8888);
        o.LJIIIIZZ(createBitmap, "createBitmap(0, 0, Bitmap.Config.ARGB_8888)");
        return createBitmap;
    }
}
