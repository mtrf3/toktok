package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.explore.ExploreClientExtra;
import kotlin.jvm.internal.o;

/* renamed from: X.836, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass836 extends AbstractC65781Prl implements InterfaceC88472Yns<Aweme, Boolean> {
    public static final AnonymousClass836 LJLIL = new AnonymousClass836();

    public AnonymousClass836() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Aweme aweme) {
        boolean z;
        Aweme it = aweme;
        o.LJIIIZ(it, "it");
        ExploreClientExtra exploreClientExtra = it.getExploreClientExtra();
        if (exploreClientExtra != null && exploreClientExtra.cacheType == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
