package X;

import android.graphics.Paint;

/* renamed from: X.5GF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5GF extends AbstractC65781Prl implements InterfaceC65784Pro<Paint> {
    public static final C5GF LJLIL = new C5GF();

    public C5GF() {
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
