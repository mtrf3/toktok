package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.widgets.ad.UserProfileADAssemV2;

/* loaded from: classes16.dex */
public final class YG8 implements InterfaceC59418NTq {
    public final /* synthetic */ UserProfileADAssemV2 LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;

    @Override // X.InterfaceC59418NTq
    public final void LIZ() {
        V9W LJIJI = C73340SqO.LJIJI();
        Context context = this.LJLIL.getContext();
        Aweme aweme = this.LJLILLLLZI;
        YGQ ygq = YGQ.LIZ;
        LJIJI.getClass();
        NOE.LJJIIJ(context, aweme, 8, ygq);
        this.LJLIL.H3(300);
    }

    public YG8(UserProfileADAssemV2 userProfileADAssemV2, Aweme aweme) {
        this.LJLIL = userProfileADAssemV2;
        this.LJLILLLLZI = aweme;
    }
}
