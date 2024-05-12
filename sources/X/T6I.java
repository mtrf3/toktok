package X;

import com.ss.android.ugc.aweme.library.LibraryDetailFragment;
import com.ss.android.ugc.aweme.library.aweme.LibraryDetailAwemeListFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T6I implements InterfaceC56522MGg {
    public final /* synthetic */ LibraryDetailFragment LIZ;

    public T6I(LibraryDetailFragment libraryDetailFragment) {
        this.LIZ = libraryDetailFragment;
    }

    @Override // X.InterfaceC56522MGg
    public final void LIZ(boolean z) {
        if (z) {
            LibraryDetailAwemeListFragment libraryDetailAwemeListFragment = this.LIZ.LJLLILLLL;
            if (libraryDetailAwemeListFragment != null) {
                o.LJIIIIZZ(libraryDetailAwemeListFragment.Il().toString(), "mHotFragment.requestId.toString()");
                return;
            } else {
                o.LJIJI("mHotFragment");
                throw null;
            }
        }
        if (!this.LIZ.Il().LLIIIZ) {
            return;
        }
        this.LIZ.Il().setRefreshing(false);
    }
}
