package X;

import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import java.util.List;

/* renamed from: X.M7y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C56306M7y {
    public final /* synthetic */ AwemeListFragmentImpl LIZ;

    public /* synthetic */ C56306M7y(AwemeListFragmentImpl awemeListFragmentImpl) {
        this.LIZ = awemeListFragmentImpl;
    }

    public final void LIZ(boolean z, MixListResponse mixListResponse) {
        AwemeListFragmentImpl awemeListFragmentImpl = this.LIZ;
        awemeListFragmentImpl.getClass();
        ((RBX) HG3.LJIILL()).getCurUser();
        if (mixListResponse == null) {
            return;
        }
        List<MixStruct> mixList = mixListResponse.getMixList();
        User user = awemeListFragmentImpl.LJLJJL;
        if (user == null || user.isSecret()) {
            awemeListFragmentImpl.LJZ.LLIIIZ(false, null);
            return;
        }
        if (z) {
            if (!Boolean.valueOf(MixFeedService.LJJIJIIJIL().LIZIZ()).booleanValue() && awemeListFragmentImpl.LJLLILLLL) {
                awemeListFragmentImpl.LJZ.LLIIIZ(false, null);
                return;
            }
            if (mixList != null) {
                if (mixList.size() > 0) {
                    awemeListFragmentImpl.LJZ.LLIIIZ(true, mixListResponse);
                    return;
                } else if (mixList.size() == 0 && awemeListFragmentImpl.LJLLILLLL && MixFeedService.LJJIJIIJIL().getPushLiveState()) {
                    awemeListFragmentImpl.LJZ.LLIIIZ(true, null);
                    return;
                } else if (mixList.size() != 0) {
                    return;
                }
            } else if (awemeListFragmentImpl.LJLLILLLL && MixFeedService.LJJIJIIJIL().getPushLiveState()) {
                awemeListFragmentImpl.LJZ.LLIIIZ(true, null);
                return;
            }
            awemeListFragmentImpl.LJZ.LLIIIZ(false, null);
            return;
        }
        awemeListFragmentImpl.LJZ.LLIIIZ(false, null);
    }
}
