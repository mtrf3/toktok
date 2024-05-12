package X;

import android.graphics.Paint;

/* renamed from: X.5Fs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131925Fs extends AbstractC65781Prl implements InterfaceC65784Pro<Paint> {
    public static final C131925Fs LJLIL = new C131925Fs();

    public C131925Fs() {
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
