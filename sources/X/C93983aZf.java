package X;

import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.DspPlaylist;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.aZf, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93983aZf {
    public final TT2DSPSongInfo LIZ;
    public final DspPlaylist LIZIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93983aZf)) {
            return false;
        }
        C93983aZf c93983aZf = (C93983aZf) obj;
        return o.LJ(this.LIZ, c93983aZf.LIZ) && o.LJ(this.LIZIZ, c93983aZf.LIZIZ) && o.LJ(this.LIZJ, c93983aZf.LIZJ);
    }

    public final int hashCode() {
        int hashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZJ;
        return hashCode + (interfaceC65784Pro == null ? 0 : interfaceC65784Pro.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectDspPlaylistData(tt2DSPSongInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", dspPlaylist=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", onFailed=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C93983aZf(TT2DSPSongInfo tt2DSPSongInfo, DspPlaylist dspPlaylist, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(tt2DSPSongInfo, "tt2DSPSongInfo");
        o.LJIIIZ(dspPlaylist, "dspPlaylist");
        this.LIZ = tt2DSPSongInfo;
        this.LIZIZ = dspPlaylist;
        this.LIZJ = interfaceC65784Pro;
    }
}
