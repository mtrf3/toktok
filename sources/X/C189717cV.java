package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7cV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189717cV implements InterfaceC57784Mm4 {
    public final Aweme LJLIL;
    public final EnumC221928nM LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C189717cV)) {
            return false;
        }
        C189717cV c189717cV = (C189717cV) obj;
        return o.LJ(this.LJLIL, c189717cV.LJLIL) && this.LJLILLLLZI == c189717cV.LJLILLLLZI;
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        EnumC221928nM enumC221928nM = this.LJLILLLLZI;
        return hashCode + (enumC221928nM == null ? 0 : enumC221928nM.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryGalleryCoverItem(aweme=");
        LIZ.append(this.LJLIL);
        LIZ.append(", publishStatus=");
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
        if (!(interfaceC57784Mm4 instanceof C189717cV)) {
            return false;
        }
        return o.LJ(this.LJLIL, ((C189717cV) interfaceC57784Mm4).LJLIL);
    }

    public C189717cV(Aweme aweme, EnumC221928nM enumC221928nM) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = aweme;
        this.LJLILLLLZI = enumC221928nM;
    }
}
