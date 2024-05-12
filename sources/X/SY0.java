package X;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* loaded from: classes13.dex */
public final class SY0 extends AbstractC65781Prl implements InterfaceC65784Pro<Paint> {
    public static final SY0 LJLIL = new SY0();

    public SY0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Paint invoke() {
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setAntiAlias(true);
        return paint;
    }
}
