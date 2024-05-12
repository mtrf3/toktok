package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* renamed from: X.BGz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28513BGz implements InterfaceC14450hV {
    public final /* synthetic */ BHZ LIZ;
    public final /* synthetic */ BasePreviewSettingMainFragmentSheet LIZIZ;
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
        this.LIZIZ.Zl(this.LIZJ);
    }

    public C28513BGz(BHZ bhz, BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet, LiveMode liveMode) {
        this.LIZ = bhz;
        this.LIZIZ = basePreviewSettingMainFragmentSheet;
        this.LIZJ = liveMode;
    }
}
