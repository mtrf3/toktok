package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.music.artist.api.MusicPinnedAwemeApi;
import com.ss.android.ugc.aweme.music.artist.model.ArtistMusicAwemeResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.9Rz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237039Rz implements InterfaceC214228aw<InterfaceC233929Ga> {
    public final C9S0 LIZ = new InterfaceC233929Ga() { // from class: X.9S0
        @Override // X.InterfaceC233929Ga
        public final AbstractC73672Svk<ArtistMusicAwemeResponse> LLII(String filterMid) {
            o.LJIIIZ(filterMid, "filterMid");
            MusicPinnedAwemeApi.LIZ.getClass();
            return C9T0.LIZ().getArtistMusicAwemeList(0L, 100, filterMid);
        }

        @Override // X.InterfaceC233929Ga
        public final AbstractC73672Svk<BaseResponse> updatePinnedAweme(String str, String str2) {
            MusicPinnedAwemeApi.LIZ.getClass();
            return C9T0.LIZ().updatePinnedAweme(str, str2);
        }
    };

    @Override // X.InterfaceC214228aw
    public final void release() {
    }

    @Override // X.InterfaceC214228aw
    public final /* bridge */ /* synthetic */ InterfaceC233929Ga getOperator() {
        return this.LIZ;
    }
}
