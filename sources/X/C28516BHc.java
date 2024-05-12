package X;

import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewPagerSelectedGameItem;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BHc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28516BHc implements InterfaceC14450hV {
    public boolean LIZ;
    public final /* synthetic */ BHZ LIZIZ;
    public final /* synthetic */ InterfaceC67352kd<Boolean> LIZJ;
    public final /* synthetic */ BIK LIZLLL;

    @Override // X.InterfaceC14450hV
    public final void LIZ(Hashtag hashtag, GameTag gameTag) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        this.LIZIZ.updateHashTagGameTag(hashtag, gameTag);
        Hashtag hashtag2 = this.LIZIZ.getHashtag();
        if (hashtag2 != null && (dataChannel2 = this.LIZLLL.LIZIZ) != null) {
            dataChannel2.rv0(HashtagChangedChannel.class, hashtag2);
        }
        GameTag gameTag2 = this.LIZIZ.getGameTag();
        if (gameTag2 != null && (dataChannel = this.LIZLLL.LIZIZ) != null) {
            dataChannel.rv0(PreviewPagerSelectedGameItem.class, gameTag2);
        }
        InterfaceC67352kd<Boolean> interfaceC67352kd = this.LIZJ;
        Boolean valueOf = Boolean.valueOf(!this.LIZIZ.isSelectFinish());
        C3C5.m7constructorimpl(valueOf);
        interfaceC67352kd.resumeWith(valueOf);
    }

    public C28516BHc(BHZ bhz, C84654XKg c84654XKg, BIK bik) {
        this.LIZIZ = bhz;
        this.LIZJ = c84654XKg;
        this.LIZLLL = bik;
    }
}
