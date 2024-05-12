package X;

import android.database.DataSetObserver;
import com.ss.android.ugc.aweme.UgAllServiceImpl;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;

/* renamed from: X.Lj0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C55046Lj0 extends DataSetObserver {
    public final /* synthetic */ FullFeedFragmentPanel LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.LIZ.LJLJJLL++;
        UgAllServiceImpl.LIZ().LJIIL();
    }

    public C55046Lj0(FullFeedFragmentPanel fullFeedFragmentPanel) {
        this.LIZ = fullFeedFragmentPanel;
    }
}
