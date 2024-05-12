package X;

import android.graphics.Paint;
import android.text.TextPaint;

/* renamed from: X.5BE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5BE extends AbstractC65781Prl implements InterfaceC65784Pro<TextPaint> {
    public static final C5BE LJLIL = new C5BE();

    public C5BE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TextPaint invoke() {
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(-1);
        textPaint.setTextSize(C130675Ax.LJLLILLLL);
        textPaint.setTypeface(C1291054w.LJ().LJJJI);
        textPaint.setTextAlign(Paint.Align.LEFT);
        return textPaint;
    }
}
