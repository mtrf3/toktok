package X;

import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.mix.profile.entry.PlayListNameCell;

/* loaded from: classes10.dex */
public final class MGF implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ PlayListNameCell LJLIL;
    public final /* synthetic */ MGD LJLILLLLZI;
    public final /* synthetic */ SY4 LJLJI;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        return this.LJLIL.L(this.LJLILLLLZI, this.LJLJI, this);
    }

    public MGF(PlayListNameCell playListNameCell, MGD mgd, SY4 sy4) {
        this.LJLIL = playListNameCell;
        this.LJLILLLLZI = mgd;
        this.LJLJI = sy4;
    }
}
