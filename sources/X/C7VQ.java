package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage;

/* renamed from: X.7VQ, reason: invalid class name */
/* loaded from: classes4.dex */
public class C7VQ extends AbstractC186377Td {
    public final C213218Yj LJLILLLLZI;
    public final /* synthetic */ BaseFavoritePage LJLJI;

    @Override // X.AbstractC186377Td
    public C213218Yj LIZ() {
        return this.LJLILLLLZI;
    }

    @Override // X.AbstractC186377Td
    public final void LJ(boolean z) {
        LifecycleOwnerKt.getLifecycleScope(this.LJLJI).launchWhenResumed(new C7VP(this.LJLJI, z, null));
    }

    public C7VQ(BaseFavoritePage baseFavoritePage, C213218Yj c213218Yj) {
        this.LJLJI = baseFavoritePage;
        this.LJLILLLLZI = c213218Yj;
    }
}
