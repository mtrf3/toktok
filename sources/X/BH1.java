package X;

import com.bytedance.android.livesdk.hashtag.PreviewHashtagWidget2;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;

/* loaded from: classes6.dex */
public final class BH1 implements InterfaceC14450hV {
    public final /* synthetic */ BHZ LIZ;
    public final /* synthetic */ PreviewHashtagWidget2 LIZIZ;

    public BH1(BHZ bhz, PreviewHashtagWidget2 previewHashtagWidget2) {
        this.LIZ = bhz;
        this.LIZIZ = previewHashtagWidget2;
    }

    @Override // X.InterfaceC14450hV
    public final void LIZ(Hashtag hashtag, GameTag gameTag) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("selectedHashtag = ");
        LIZ.append(hashtag);
        LIZ.append(",selectedGameTag = ");
        LIZ.append(gameTag);
        C0NB.LJIIIZ("PreviewHashtagWidget2", X1D.LIZIZ(LIZ));
        this.LIZ.updateHashTagGameTag(hashtag, gameTag);
        this.LIZIZ.LL();
    }
}
