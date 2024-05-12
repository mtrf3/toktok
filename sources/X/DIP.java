package X;

import android.graphics.Paint;

/* loaded from: classes7.dex */
public final class DIP extends AbstractC65781Prl implements InterfaceC65784Pro<Paint> {
    public static final DIP LJLIL = new DIP();

    public DIP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Paint invoke() {
        Paint paint = new Paint(1);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }
}
