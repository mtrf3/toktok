package X;

import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.search.pages.choosemusic.result.core.viewmodel.SearchMusicPlayViewModel;

/* renamed from: X.KHy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51470KHy implements XUP {
    public final /* synthetic */ SearchMusicPlayViewModel LIZ;

    public C51470KHy(SearchMusicPlayViewModel searchMusicPlayViewModel) {
        this.LIZ = searchMusicPlayViewModel;
    }

    @Override // X.XUP
    public final void LIZ() {
        DataCenter dataCenter = this.LIZ.LJLIL;
        if (dataCenter != null) {
            dataCenter.jv0(Boolean.FALSE, "music_loading");
        }
    }
}
