package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.widgets.ad.UserProfileADAssem;

/* loaded from: classes16.dex */
public final class YG7 implements InterfaceC59418NTq {
    public final /* synthetic */ UserProfileADAssem LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;

    @Override // X.InterfaceC59418NTq
    public final void LIZ() {
        V9W LJIJI = C73340SqO.LJIJI();
        Context context = this.LJLIL.getContext();
        Aweme aweme = this.LJLILLLLZI;
        YGG ygg = YGG.LIZ;
        LJIJI.getClass();
        NOE.LJJIIJ(context, aweme, 8, ygg);
        this.LJLIL.F3(300);
    }

    public YG7(UserProfileADAssem userProfileADAssem, Aweme aweme) {
        this.LJLIL = userProfileADAssem;
        this.LJLILLLLZI = aweme;
    }
}
