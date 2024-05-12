package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S6S implements C33Q {
    public final AbstractC72932td<Boolean> LJLIL;
    public final RootData LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final LiveEffect LJLJJL;
    public final LiveEffect LJLJJLL;

    public S6S() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S6S)) {
            return false;
        }
        S6S s6s = (S6S) obj;
        return o.LJ(this.LJLIL, s6s.LJLIL) && o.LJ(this.LJLILLLLZI, s6s.LJLILLLLZI) && this.LJLJI == s6s.LJLJI && this.LJLJJI == s6s.LJLJJI && o.LJ(this.LJLJJL, s6s.LJLJJL) && o.LJ(this.LJLJJLL, s6s.LJLJJLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31)) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode + i) * 31) + (this.LJLJJI ? 1 : 0)) * 31;
        LiveEffect liveEffect = this.LJLJJL;
        int hashCode2 = (i2 + (liveEffect == null ? 0 : liveEffect.hashCode())) * 31;
        LiveEffect liveEffect2 = this.LJLJJLL;
        return hashCode2 + (liveEffect2 != null ? liveEffect2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BillboardGlobalState(useEffectStatus=");
        LIZ.append(this.LJLIL);
        LIZ.append(", rootData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isShowAutoDisplayGuide=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isAutoDisplay=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", curLiveEffect=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", greenScreenLiveEffect=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ S6S(int i) {
        this(C33X.LIZ, new RootData(0), false, true, null, null);
    }

    public S6S(AbstractC72932td<Boolean> useEffectStatus, RootData rootData, boolean z, boolean z2, LiveEffect liveEffect, LiveEffect liveEffect2) {
        o.LJIIIZ(useEffectStatus, "useEffectStatus");
        o.LJIIIZ(rootData, "rootData");
        this.LJLIL = useEffectStatus;
        this.LJLILLLLZI = rootData;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = liveEffect;
        this.LJLJJLL = liveEffect2;
    }

    public static S6S LIZ(S6S s6s, RootData rootData, boolean z, boolean z2, LiveEffect liveEffect, LiveEffect liveEffect2, int i) {
        AbstractC72932td<Boolean> useEffectStatus;
        LiveEffect liveEffect3 = liveEffect2;
        LiveEffect liveEffect4 = liveEffect;
        boolean z3 = z2;
        RootData rootData2 = rootData;
        boolean z4 = z;
        if ((i & 1) != 0) {
            useEffectStatus = s6s.LJLIL;
        } else {
            useEffectStatus = null;
        }
        if ((i & 2) != 0) {
            rootData2 = s6s.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z4 = s6s.LJLJI;
        }
        if ((i & 8) != 0) {
            z3 = s6s.LJLJJI;
        }
        if ((i & 16) != 0) {
            liveEffect4 = s6s.LJLJJL;
        }
        if ((i & 32) != 0) {
            liveEffect3 = s6s.LJLJJLL;
        }
        s6s.getClass();
        o.LJIIIZ(useEffectStatus, "useEffectStatus");
        o.LJIIIZ(rootData2, "rootData");
        return new S6S(useEffectStatus, rootData2, z4, z3, liveEffect4, liveEffect3);
    }
}
