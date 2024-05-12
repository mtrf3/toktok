package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GYB implements InterfaceC139755e7 {
    public final boolean LJLIL;

    public GYB() {
        this(0);
    }

    public /* synthetic */ GYB(int i) {
        this(C1535060s.LIZ());
    }

    @Override // X.InterfaceC139755e7
    public final OSZ<Integer, Integer> LIZIZ(Bitmap originBitmap) {
        o.LJIIIZ(originBitmap, "originBitmap");
        if (originBitmap.getWidth() <= 0 || originBitmap.getHeight() <= 0 || this.LJLIL || originBitmap.isRecycled()) {
            return new OSZ<>(-16777216, -16777216);
        }
        return new C57730MlC().LIZIZ(originBitmap);
    }

    public GYB(boolean z) {
        this.LJLIL = z;
    }
}
