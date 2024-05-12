package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KPS implements InterfaceC57784Mm4 {
    public final String LJLIL;
    public final UrlModel LJLILLLLZI;
    public final boolean LJLJI;
    public final long LJLJJI;
    public final boolean LJLJJL;
    public final KPU LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KPS)) {
            return false;
        }
        KPS kps = (KPS) obj;
        return o.LJ(this.LJLIL, kps.LJLIL) && o.LJ(this.LJLILLLLZI, kps.LJLILLLLZI) && this.LJLJI == kps.LJLJI && this.LJLJJI == kps.LJLJJI && this.LJLJJL == kps.LJLJJL && o.LJ(this.LJLJJLL, kps.LJLJJLL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FilterListPowerItem(aid=");
        LIZ.append(this.LJLIL);
        LIZ.append(", cover=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isDigged=");
        LIZ.append(this.LJLJI);
        LIZ.append(", diggCount=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", sensitive=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", state=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJLIL.hashCode() * 31;
        UrlModel urlModel = this.LJLILLLLZI;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int i = (hashCode2 + hashCode) * 31;
        boolean z = this.LJLJI;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int LIZJ = JBR.LIZJ(this.LJLJJI, (i + i3) * 31, 31);
        if (!this.LJLJJL) {
            i2 = 0;
        }
        return this.LJLJJLL.hashCode() + ((LIZJ + i2) * 31);
    }

    public final KPS LIZIZ(KPT playState) {
        o.LJIIIZ(playState, "playState");
        return LIZ(this, KPU.L(this.LJLJJLL, false, false, playState, false, 11));
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        KPS kps;
        KPU kpu = this.LJLJJLL;
        KPU kpu2 = null;
        if ((interfaceC57784Mm4 instanceof KPS) && (kps = (KPS) interfaceC57784Mm4) != null) {
            kpu2 = kps.LJLJJLL;
        }
        return o.LJ(kpu, kpu2);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        KPS kps;
        String str = this.LJLIL;
        String str2 = null;
        if ((interfaceC57784Mm4 instanceof KPS) && (kps = (KPS) interfaceC57784Mm4) != null) {
            str2 = kps.LJLIL;
        }
        return o.LJ(str, str2);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof KPS) {
            KPS kps = (KPS) interfaceC57784Mm4;
            if (!o.LJ(kps.LJLJJLL, this.LJLJJLL)) {
                return new KPX(kps.LJLJJLL);
            }
            return null;
        }
        return null;
    }

    public static KPS LIZ(KPS kps, KPU kpu) {
        String aid = kps.LJLIL;
        UrlModel urlModel = kps.LJLILLLLZI;
        boolean z = kps.LJLJI;
        long j = kps.LJLJJI;
        boolean z2 = kps.LJLJJL;
        kps.getClass();
        o.LJIIIZ(aid, "aid");
        return new KPS(aid, urlModel, z, j, z2, kpu);
    }

    public KPS(String str, UrlModel urlModel, boolean z, long j, boolean z2, KPU kpu) {
        this.LJLIL = str;
        this.LJLILLLLZI = urlModel;
        this.LJLJI = z;
        this.LJLJJI = j;
        this.LJLJJL = z2;
        this.LJLJJLL = kpu;
    }
}
