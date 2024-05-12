package X;

import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.TT2DSPPlatformInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.ai6, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94506ai6 implements InterfaceC57784Mm4 {
    public final String LJLIL;
    public final TT2DSPPlatformInfo LJLILLLLZI;
    public final InterfaceC88472Yns<TT2DSPPlatformInfo, C76800UCe> LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C94506ai6)) {
            return false;
        }
        C94506ai6 c94506ai6 = (C94506ai6) obj;
        return o.LJ(this.LJLIL, c94506ai6.LJLIL) && o.LJ(this.LJLILLLLZI, c94506ai6.LJLILLLLZI) && o.LJ(this.LJLJI, c94506ai6.LJLJI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LJLILLLLZI.hashCode()) * 31;
        InterfaceC88472Yns<TT2DSPPlatformInfo, C76800UCe> interfaceC88472Yns = this.LJLJI;
        return hashCode + (interfaceC88472Yns != null ? interfaceC88472Yns.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicDspAwemeItem(songId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", dspPlatformInfo=");
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
    public C94506ai6(String str, TT2DSPPlatformInfo dspPlatformInfo, InterfaceC88472Yns<? super TT2DSPPlatformInfo, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(dspPlatformInfo, "dspPlatformInfo");
        this.LJLIL = str;
        this.LJLILLLLZI = dspPlatformInfo;
        this.LJLJI = interfaceC88472Yns;
    }
}
