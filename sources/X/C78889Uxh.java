package X;

import com.bytedance.assem.arch.view.UIContentAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Uxh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78889Uxh<TYPE> {
    public final TYPE LIZ;
    public final InterfaceC65350Pko<? extends UIContentAssem> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78889Uxh)) {
            return false;
        }
        C78889Uxh c78889Uxh = (C78889Uxh) obj;
        return o.LJ(this.LIZ, c78889Uxh.LIZ) && o.LJ(this.LIZIZ, c78889Uxh.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        InterfaceC65350Pko<? extends UIContentAssem> interfaceC65350Pko = this.LIZIZ;
        return hashCode + (interfaceC65350Pko == null ? 0 : interfaceC65350Pko.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChatRoomInputFeatureAssemConfig(featureEnum=");
        LIZ.append(this.LIZ);
        LIZ.append(", overrideAssem=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C78889Uxh(EnumC113744dG featureEnum, InterfaceC65350Pko interfaceC65350Pko) {
        o.LJIIIZ(featureEnum, "featureEnum");
        this.LIZ = featureEnum;
        this.LIZIZ = interfaceC65350Pko;
    }
}
