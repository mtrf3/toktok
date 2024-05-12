package X;

import android.R;
import android.text.TextPaint;

/* loaded from: classes13.dex */
public final class TBG extends AbstractC65781Prl implements InterfaceC65784Pro<TextPaint> {
    public static final TBG LJLIL = new TBG();

    public TBG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TextPaint invoke() {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(C87277YNd.LJIIJ(12));
        textPaint.setColor(C15380j0.LIZIZ(R.color.holo_green_dark));
        return textPaint;
    }
}
