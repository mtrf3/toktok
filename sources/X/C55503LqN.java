package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.LqN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55503LqN implements InterfaceC55513LqX {
    public final /* synthetic */ C55495LqF LIZ;

    public C55503LqN(C55495LqF c55495LqF) {
        this.LIZ = c55495LqF;
    }

    @Override // X.InterfaceC55513LqX
    public final void LIZ(CommonAdData commonAdData, C58655N0h c58655N0h) {
        o.LJIIIZ(commonAdData, "commonAdData");
        HomePageDataViewModel homePageDataViewModel = this.LIZ.LJIIIIZZ;
        if (homePageDataViewModel != null) {
            Aweme aweme = homePageDataViewModel.LJLJLLL;
            if (C59411NTj.LIZIZ.LJIJJ(aweme) != null) {
                c58655N0h.LIZIZ(C59406NTe.LIZIZ(aweme), "anchor_id");
                c58655N0h.LIZIZ(C59406NTe.LJI(aweme), "room_id");
                return;
            }
            return;
        }
        o.LJIJI("homeViewModel");
        throw null;
    }
}
