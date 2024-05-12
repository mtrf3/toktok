package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Olo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62864Olo implements InterfaceC229218z7 {
    public final /* synthetic */ AddFeedToMixFragment LIZ;
    public final /* synthetic */ Aweme LIZIZ;

    @Override // X.InterfaceC229218z7
    public final void LIZIZ(boolean z) {
    }

    @Override // X.InterfaceC229218z7
    public final void LIZ(boolean z) {
        ((SY4) this.LIZ._$_findCachedViewById(R.id.aul)).setLoading(false);
        if (z) {
            PlayListInfo playListInfo = new PlayListInfo();
            playListInfo.setMixId(this.LIZ.LJLJI);
            playListInfo.setMixName(this.LIZ.LJLJL);
            Aweme aweme = this.LIZ.LJLILLLLZI;
            if (aweme != null) {
                aweme.playlist_info = playListInfo;
            }
            C2U8.LIZ(new C2IX(this.LIZIZ, null, true));
            ASQ.LJ(this.LIZ, ASX.LIZ);
        }
    }

    public C62864Olo(AddFeedToMixFragment addFeedToMixFragment, Aweme aweme) {
        this.LIZ = addFeedToMixFragment;
        this.LIZIZ = aweme;
    }
}
