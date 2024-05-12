package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewLiveDetailSheet;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;

/* renamed from: X.BGw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28510BGw implements InterfaceC14450hV {
    public final /* synthetic */ BHZ LIZ;
    public final /* synthetic */ PreviewLiveDetailSheet LIZIZ;

    public C28510BGw(BHZ bhz, PreviewLiveDetailSheet previewLiveDetailSheet) {
        this.LIZ = bhz;
        this.LIZIZ = previewLiveDetailSheet;
    }

    @Override // X.InterfaceC14450hV
    public final void LIZ(Hashtag hashtag, GameTag gameTag) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("selectedHashtag = ");
        LIZ.append(hashtag);
        LIZ.append(",selectedGameTag = ");
        LIZ.append(gameTag);
        C0NB.LJIIIZ("PreviewLiveDetailSheet", X1D.LIZIZ(LIZ));
        this.LIZ.updateHashTagGameTag(hashtag, gameTag);
        this.LIZIZ.Ol();
    }
}
