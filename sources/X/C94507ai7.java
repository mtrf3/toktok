package X;

import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.ai7, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94507ai7 implements InterfaceC57784Mm4 {
    public final TT2DSPSongInfo LJLIL;
    public final InterfaceC88472Yns<TT2DSPSongInfo, C76800UCe> LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C94507ai7)) {
            return false;
        }
        C94507ai7 c94507ai7 = (C94507ai7) obj;
        return o.LJ(this.LJLIL, c94507ai7.LJLIL) && o.LJ(this.LJLILLLLZI, c94507ai7.LJLILLLLZI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        InterfaceC88472Yns<TT2DSPSongInfo, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
        return hashCode + (interfaceC88472Yns == null ? 0 : interfaceC88472Yns.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicDspCreateNewPlaylistItem(dspSongInfo=");
        LIZ.append(this.LJLIL);
        LIZ.append(", clickListener=");
        LIZ.append(this.LJLILLLLZI);
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
    public C94507ai7(TT2DSPSongInfo dspSongInfo, InterfaceC88472Yns<? super TT2DSPSongInfo, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(dspSongInfo, "dspSongInfo");
        this.LJLIL = dspSongInfo;
        this.LJLILLLLZI = interfaceC88472Yns;
    }
}
