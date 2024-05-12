package X;

import android.graphics.Paint;

/* loaded from: classes7.dex */
public final class DIM extends AbstractC65781Prl implements InterfaceC65784Pro<Paint> {
    public static final DIM LJLIL = new DIM();

    public DIM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Paint invoke() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
        paint.setAntiAlias(true);
        return paint;
    }
}
