package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;

/* renamed from: X.LpA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55428LpA implements LNI {
    public final /* synthetic */ DoubleFragmentMainActivity LJLIL;

    public C55428LpA(DoubleFragmentMainActivity doubleFragmentMainActivity) {
        this.LJLIL = doubleFragmentMainActivity;
    }

    @Override // X.LNI
    public final void LJJLIIIJ(Aweme aweme) {
        ProfileServiceImpl.LIZ().updateUserInfo(this.LJLIL.LLII(true), aweme);
        if (aweme != null) {
            MSAdaptionService.LJIIL().LJIIIZ(aweme);
        }
    }
}
