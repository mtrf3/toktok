package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.1QV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QV implements InterfaceC12040dc {
    public final Bitmap LIZIZ;

    @Override // X.InterfaceC12040dc
    public final int getHeight() {
        return this.LIZIZ.getHeight();
    }

    @Override // X.InterfaceC12040dc
    public final int getWidth() {
        return this.LIZIZ.getWidth();
    }

    public C1QV(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        this.LIZIZ = bitmap;
    }
}
