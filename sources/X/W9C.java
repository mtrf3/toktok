package X;

import android.graphics.BitmapFactory;

/* loaded from: classes15.dex */
public final class W9C extends W8W {
    public W9C(WB5 wb5, int i, C43051mX c43051mX) {
        super(wb5, i, c43051mX);
    }

    @Override // X.W8W
    public final int LIZJ(int i, int i2, BitmapFactory.Options options) {
        return W6I.LIZIZ(options.inPreferredConfig) * i * i2;
    }
}
