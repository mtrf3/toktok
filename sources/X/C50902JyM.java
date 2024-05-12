package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.JyM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50902JyM implements KEA {
    public final /* synthetic */ SearchContainerFragment LJLIL;

    @Override // X.KEA
    public final int LJII() {
        return -1;
    }

    @Override // X.KEA
    public final NextLiveData<Integer> LJI() {
        return this.LJLIL.LJLLLL.iv0();
    }

    public C50902JyM(SearchContainerFragment searchContainerFragment) {
        this.LJLIL = searchContainerFragment;
    }

    @Override // X.KEA
    public final String LIZJ(int i) {
        return C50605JtZ.LJFF(i);
    }

    @Override // X.KEA
    public final String LJ(int i) {
        return C50676Jui.LIZIZ(i);
    }

    @Override // X.KEA
    public final int LJIIIIZZ(KAK searchTab) {
        o.LJIIIZ(searchTab, "searchTab");
        return ((ArrayList) C50605JtZ.LIZIZ).indexOf(searchTab);
    }
}
