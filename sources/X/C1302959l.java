package X;

import android.graphics.Paint;
import android.text.TextPaint;

/* renamed from: X.59l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1302959l extends AbstractC65781Prl implements InterfaceC65784Pro<TextPaint> {
    public static final C1302959l LJLIL = new C1302959l();

    public C1302959l() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TextPaint invoke() {
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(-1);
        textPaint.setTextSize(C134845Qy.LIZ(12.0f));
        textPaint.setTypeface(C1291054w.LJ().LJJJI);
        textPaint.setTextAlign(Paint.Align.LEFT);
        return textPaint;
    }
}
