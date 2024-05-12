package X;

import android.graphics.Bitmap;
import android.text.Spannable;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;

/* renamed from: X.TvA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76184TvA implements UCZ {
    public final /* synthetic */ GiftModeMeta LIZ;
    public final /* synthetic */ C76185TvB LIZIZ;

    @Override // X.UCZ
    public final void LIZ(Bitmap bitmap) {
        Spannable LJFF = CXJ.LJFF(this.LIZ.giftModeDesc, "");
        C47121t6 c47121t6 = this.LIZIZ.LIZIZ;
        if (c47121t6 == null) {
            return;
        }
        c47121t6.setText(LJFF);
    }

    public C76184TvA(GiftModeMeta giftModeMeta, C76185TvB c76185TvB) {
        this.LIZ = giftModeMeta;
        this.LIZIZ = c76185TvB;
    }
}
