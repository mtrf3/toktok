package X;

import android.view.View;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.ui.DiscoverAndSearchFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes10.dex */
public final class MJJ implements MJY {
    public final /* synthetic */ DiscoverAndSearchFragment LIZ;

    @Override // X.MJY
    public final void LIZ() {
    }

    public MJJ(DiscoverAndSearchFragment discoverAndSearchFragment) {
        this.LIZ = discoverAndSearchFragment;
    }

    @Override // X.MJY
    public final void LIZIZ(View view) {
        o.LJIIIZ(view, "view");
        if (a.LJIIIZ().LIZJ()) {
            AnonymousClass030.LJ(view, R.string.g9g);
        } else {
            this.LIZ.wl("");
        }
    }

    @Override // X.MJY
    public final void LIZJ(Word word) {
        this.LIZ.LLFF = word;
    }
}
