package X;

import android.graphics.Color;
import android.graphics.Paint;

/* renamed from: X.4mT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119454mT extends AbstractC65781Prl implements InterfaceC65784Pro<Paint> {
    public static final C119454mT LJLIL = new C119454mT();

    public C119454mT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Paint invoke() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.argb(255, 255, 255, 255));
        paint.setStrokeWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)) * 0.8f);
        return paint;
    }
}
