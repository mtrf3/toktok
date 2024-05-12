package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;

/* renamed from: X.84F, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84F extends AbstractC65781Prl implements InterfaceC65784Pro<Paint> {
    public static final C84F LJLIL = new C84F();

    public C84F() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Paint invoke() {
        Paint paint = new Paint(1);
        paint.setColor(536870912);
        paint.setMaskFilter(new BlurMaskFilter(C7MY.LIZIZ(8), BlurMaskFilter.Blur.NORMAL));
        return paint;
    }
}
