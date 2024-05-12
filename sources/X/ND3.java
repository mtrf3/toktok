package X;

import Y.ARunnableS29S0200000_10;
import android.graphics.Bitmap;

/* loaded from: classes11.dex */
public final class ND3 implements NDC {
    public final /* synthetic */ ND1 LIZ;

    @Override // X.NDC
    public final void onFailed() {
        C242549fW.LIZ("getCardData() hostWillAppear image not Loaded");
        this.LIZ.LJZ = false;
    }

    public ND3(ND1 nd1) {
        this.LIZ = nd1;
    }

    @Override // X.NDC
    public final void LIZ(Bitmap bitmap) {
        C242549fW.LIZ("loadCardImage imageLoaded");
        if (bitmap == null) {
            return;
        }
        ND1 nd1 = this.LIZ;
        nd1.LJZ = true;
        nd1.LJZI = bitmap;
        C62354Oda c62354Oda = nd1.LJLLLL;
        if (c62354Oda != null) {
            c62354Oda.post(new ARunnableS29S0200000_10(nd1, bitmap, 61));
        }
    }
}
