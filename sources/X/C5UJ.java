package X;

import android.graphics.Color;
import android.graphics.Paint;

/* renamed from: X.5UJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5UJ extends AbstractC65781Prl implements InterfaceC65784Pro<Paint> {
    public static final C5UJ LJLIL = new C5UJ();

    public C5UJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Paint invoke() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.argb(255, 255, 255, 255));
        return paint;
    }
}
