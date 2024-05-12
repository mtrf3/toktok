package X;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* renamed from: X.6M1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6M1 extends AbstractC65781Prl implements InterfaceC65784Pro<Paint> {
    public static final C6M1 LJLIL = new C6M1();

    public C6M1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Paint invoke() {
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        return paint;
    }
}
