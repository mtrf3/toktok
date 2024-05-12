package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.GcH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41889GcH implements GI1 {
    public final /* synthetic */ ActivityC45651qj LIZ;
    public final /* synthetic */ VideoPublishEditModel LIZIZ;
    public final /* synthetic */ GJO LIZJ;
    public final /* synthetic */ Bundle LIZLLL;

    @Override // X.GI1
    public final InterfaceC88472Yns<AwemeDraft, C76800UCe> LIZ() {
        return null;
    }

    @Override // X.GI1
    public final void LIZIZ(C142535ib c142535ib) {
        C44172HVg.LJJI.LJI().LIZ().LJ(c142535ib.LJLILLLLZI);
        if (this.LIZ != null) {
            ActivityC45651qj activityC45651qj = this.LIZ;
            new C41896GcO(activityC45651qj, new C41893GcL(activityC45651qj, this.LIZIZ)).LIZ(c142535ib.LJLILLLLZI);
        }
        this.LIZJ.LIZ(this.LIZLLL, this.LIZ, this.LIZIZ);
    }

    @Override // X.GI1
    public final void LIZJ(C142535ib c142535ib) {
        this.LIZJ.LIZ(this.LIZLLL, this.LIZ, this.LIZIZ);
    }

    public C41889GcH(ActivityC45651qj activityC45651qj, VideoPublishEditModel videoPublishEditModel, GJO gjo, Bundle bundle) {
        this.LIZ = activityC45651qj;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = gjo;
        this.LIZLLL = bundle;
    }
}
