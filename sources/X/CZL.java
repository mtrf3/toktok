package X;

import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes6.dex */
public final class CZL {
    public InterfaceC29386Bg6 LIZ;

    @QD3
    public void onEvent(C31633CbF c31633CbF) {
        if (this.LIZ != null && (c31633CbF.LJLILLLLZI instanceof User)) {
            FollowPair followPair = new FollowPair();
            followPair.followStatus = c31633CbF.LJLIL;
            String uid = ((User) c31633CbF.LJLILLLLZI).getUid();
            if (uid != null) {
                followPair.LIZ = CastLongProtector.parseLong(uid);
            }
            ((C29374Bfu) ((LDC) this.LIZ).LJLIL).LJIIIIZZ.onNext(followPair);
            C73943T0h.LIZ().LIZIZ(new CJ5(followPair));
        }
    }
}
