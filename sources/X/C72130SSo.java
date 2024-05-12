package X;

import com.ss.android.ugc.aweme.aigc.AIGCQuota;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcAvatarViewModel;
import java.util.List;

/* renamed from: X.SSo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72130SSo<T1, T2> implements InterfaceC73459SsJ {
    public final /* synthetic */ ProfileAigcAvatarViewModel LJLIL;

    public C72130SSo(ProfileAigcAvatarViewModel profileAigcAvatarViewModel) {
        this.LJLIL = profileAigcAvatarViewModel;
    }

    @Override // X.InterfaceC73459SsJ
    public final void accept(Object obj, Object obj2) {
        List<AIGCQuota> list = (List) obj;
        ProfileAigcAvatarViewModel profileAigcAvatarViewModel = this.LJLIL;
        profileAigcAvatarViewModel.LJLLL = list;
        profileAigcAvatarViewModel.LJLLJ.onNext(list);
    }
}
