package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* renamed from: X.BGx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28511BGx implements InterfaceC14450hV {
    public final /* synthetic */ BHZ LIZ;
    public final /* synthetic */ BasePreviewSettingMainFragment LIZIZ;
    public final /* synthetic */ LiveMode LIZJ;

    @Override // X.InterfaceC14450hV
    public final void LIZ(Hashtag hashtag, GameTag gameTag) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("selectedHashtag = ");
        LIZ.append(hashtag);
        LIZ.append(",selectedGameTag = ");
        LIZ.append(gameTag);
        C0NB.LJIIIZ("BasePreviewSettingMainFragment", X1D.LIZIZ(LIZ));
        this.LIZ.updateHashTagGameTag(hashtag, gameTag);
        this.LIZIZ.Kl(this.LIZJ);
    }

    public C28511BGx(BHZ bhz, BasePreviewSettingMainFragment basePreviewSettingMainFragment, LiveMode liveMode) {
        this.LIZ = bhz;
        this.LIZIZ = basePreviewSettingMainFragment;
        this.LIZJ = liveMode;
    }
}
