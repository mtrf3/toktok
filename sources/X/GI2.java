package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* loaded from: classes8.dex */
public final class GI2 implements GI1 {
    public final /* synthetic */ VideoPublishEditModel LIZ;
    public final /* synthetic */ ActivityC45651qj LIZIZ;
    public final /* synthetic */ Bundle LIZJ;

    @Override // X.GI1
    public final InterfaceC88472Yns<AwemeDraft, C76800UCe> LIZ() {
        return null;
    }

    @Override // X.GI1
    public final void LIZIZ(C142535ib c142535ib) {
        C86793Y4n.LJJIJ(this.LIZ, false, true);
        GI3.LJII(new G8R(this.LIZIZ, this.LIZJ, null));
    }

    @Override // X.GI1
    public final void LIZJ(C142535ib c142535ib) {
        C86793Y4n.LJJIJ(this.LIZ, false, false);
        GI3.LJII(new G8R(this.LIZIZ, this.LIZJ, null));
    }

    public GI2(Bundle bundle, ActivityC45651qj activityC45651qj, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = activityC45651qj;
        this.LIZJ = bundle;
    }
}
