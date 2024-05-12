package X;

import com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KP6<T> implements InterfaceC73592SuS {
    public final /* synthetic */ SwipeUpGuideStrengthenLayout LJLIL;

    public KP6(SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout) {
        this.LJLIL = swipeUpGuideStrengthenLayout;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object it) {
        o.LJIIIZ(it, "it");
        if (this.LJLIL.getVisibility() == 0) {
            return true;
        }
        return false;
    }
}
