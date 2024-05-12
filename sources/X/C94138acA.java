package X;

import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.DspPlaylist;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.DspPlaylistsResponse;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.IDqS457S0100000_42;

/* renamed from: X.acA, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94138acA implements InterfaceC64672gJ<XGX<C94482ahi>> {
    public final /* synthetic */ MusicDspSheetViewModel LJLIL;
    public final /* synthetic */ C68322mC LJLILLLLZI;
    public final /* synthetic */ C34K LJLJI;
    public final /* synthetic */ C93894aYE LJLJJI;
    public final /* synthetic */ List LJLJJL;
    public final /* synthetic */ TT2DSPSongInfo LJLJJLL;

    /* JADX WARN: Type inference failed for: r2v0, types: [T, X.aYE] */
    @Override // X.InterfaceC64672gJ
    public final Object emit(XGX<C94482ahi> xgx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Long l;
        boolean z;
        List list;
        Boolean bool;
        XGX<C94482ahi> xgx2 = xgx;
        if (xgx2 instanceof XGW) {
            this.LJLIL.setState(C94575ajD.LJLIL);
            DspPlaylistsResponse dspPlaylistsResponse = ((C94482ahi) ((XGW) xgx2).LJ).LIZ;
            C68322mC c68322mC = this.LJLILLLLZI;
            String str = null;
            if (dspPlaylistsResponse != null) {
                l = dspPlaylistsResponse.nextOffset;
                str = dspPlaylistsResponse.nextOffsetStr;
            } else {
                l = null;
            }
            c68322mC.element = new C93894aYE(l, str);
            C34K c34k = this.LJLJI;
            if (dspPlaylistsResponse != null && (bool = dspPlaylistsResponse.hasMore) != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            c34k.element = z;
            if (!this.LJLJJI.LIZ()) {
                this.LJLJJL.add(new C94507ai7(this.LJLJJLL, new IDqS419S0100000_42(this.LJLIL, 32)));
            }
            if (dspPlaylistsResponse == null || (list = dspPlaylistsResponse.playlists) == null) {
                list = C61878OQg.INSTANCE;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.LJLJJL.add(new C94508ai8((DspPlaylist) it.next(), this.LJLJJLL, new IDqS457S0100000_42(this.LJLIL, 2)));
            }
        } else if (!this.LJLJJI.LIZ()) {
            this.LJLIL.setState(C94576ajE.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    public C94138acA(MusicDspSheetViewModel musicDspSheetViewModel, C68322mC c68322mC, C34K c34k, C93894aYE c93894aYE, List list, TT2DSPSongInfo tT2DSPSongInfo) {
        this.LJLIL = musicDspSheetViewModel;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = c34k;
        this.LJLJJI = c93894aYE;
        this.LJLJJL = list;
        this.LJLJJLL = tT2DSPSongInfo;
    }
}
