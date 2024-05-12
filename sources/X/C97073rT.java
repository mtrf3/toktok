package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoSug;
import kotlin.jvm.internal.o;

/* renamed from: X.3rT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97073rT implements InterfaceC57784Mm4 {
    public final TakoSug LJLIL;
    public final C99033ud LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C97073rT)) {
            return false;
        }
        C97073rT c97073rT = (C97073rT) obj;
        return o.LJ(this.LJLIL, c97073rT.LJLIL) && o.LJ(this.LJLILLLLZI, c97073rT.LJLILLLLZI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        C99033ud c99033ud = this.LJLILLLLZI;
        return hashCode + (c99033ud == null ? 0 : c99033ud.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TakoSugItem(takoSug=");
        LIZ.append(this.LJLIL);
        LIZ.append(", sessionInfo=");
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

    public C97073rT(TakoSug takoSug, C99033ud c99033ud) {
        o.LJIIIZ(takoSug, "takoSug");
        this.LJLIL = takoSug;
        this.LJLILLLLZI = c99033ud;
    }
}
