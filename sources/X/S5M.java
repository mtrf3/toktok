package X;

import com.ss.android.ugc.aweme.commercialize.model.AdNativeProduct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S5M implements InterfaceC57784Mm4 {
    public final AdNativeProduct LJLIL;
    public final Aweme LJLILLLLZI;
    public final boolean LJLJI;
    public final int LJLJJI;
    public final S5N LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S5M)) {
            return false;
        }
        S5M s5m = (S5M) obj;
        return o.LJ(this.LJLIL, s5m.LJLIL) && o.LJ(this.LJLILLLLZI, s5m.LJLILLLLZI) && this.LJLJI == s5m.LJLJI && this.LJLJJI == s5m.LJLJJI && o.LJ(this.LJLJJL, s5m.LJLJJL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        Aweme aweme = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.LJLJJL.hashCode() + ((((hashCode2 + i) * 31) + this.LJLJJI) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdProductTileItem(model=");
        LIZ.append(this.LJLIL);
        LIZ.append(", aweme=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isLastItem=");
        LIZ.append(this.LJLJI);
        LIZ.append(", index=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", callback=");
        LIZ.append(this.LJLJJL);
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

    public S5M(AdNativeProduct model, Aweme aweme, boolean z, int i, S5N callback) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(callback, "callback");
        this.LJLIL = model;
        this.LJLILLLLZI = aweme;
        this.LJLJI = z;
        this.LJLJJI = i;
        this.LJLJJL = callback;
    }
}
