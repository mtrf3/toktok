package X;

import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.DspPlaylist;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.ai8, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94508ai8 implements InterfaceC57784Mm4 {
    public final DspPlaylist LJLIL;
    public final TT2DSPSongInfo LJLILLLLZI;
    public final InterfaceC88474Ynu<TT2DSPSongInfo, DspPlaylist, InterfaceC65784Pro<C76800UCe>, InterfaceC65784Pro<C76800UCe>, C76800UCe> LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C94508ai8)) {
            return false;
        }
        C94508ai8 c94508ai8 = (C94508ai8) obj;
        return o.LJ(this.LJLIL, c94508ai8.LJLIL) && o.LJ(this.LJLILLLLZI, c94508ai8.LJLILLLLZI) && o.LJ(this.LJLJI, c94508ai8.LJLJI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode = ((this.LJLIL.hashCode() * 31) + this.LJLILLLLZI.hashCode()) * 31;
        InterfaceC88474Ynu<TT2DSPSongInfo, DspPlaylist, InterfaceC65784Pro<C76800UCe>, InterfaceC65784Pro<C76800UCe>, C76800UCe> interfaceC88474Ynu = this.LJLJI;
        return hashCode + (interfaceC88474Ynu == null ? 0 : interfaceC88474Ynu.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicDspPlaylistItem(dspPlaylist=");
        LIZ.append(this.LJLIL);
        LIZ.append(", dspSongInfo=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", clickListener=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C94508ai8(DspPlaylist dspPlaylist, TT2DSPSongInfo dspSongInfo, InterfaceC88474Ynu<? super TT2DSPSongInfo, ? super DspPlaylist, ? super InterfaceC65784Pro<C76800UCe>, ? super InterfaceC65784Pro<C76800UCe>, C76800UCe> interfaceC88474Ynu) {
        o.LJIIIZ(dspPlaylist, "dspPlaylist");
        o.LJIIIZ(dspSongInfo, "dspSongInfo");
        this.LJLIL = dspPlaylist;
        this.LJLILLLLZI = dspSongInfo;
        this.LJLJI = interfaceC88474Ynu;
    }
}
