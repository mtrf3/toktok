package X;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* renamed from: X.5UK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5UK extends AbstractC65781Prl implements InterfaceC65784Pro<Paint> {
    public static final C5UK LJLIL = new C5UK();

    public C5UK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Paint invoke() {
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        return paint;
    }
}
