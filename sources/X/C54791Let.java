package X;

import android.content.DialogInterface;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS51S1200000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Let, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54791Let {
    public final String LIZ;
    public final InterfaceC88472Yns<AR4, C76800UCe> LIZIZ;
    public final InterfaceC88472Yns<DialogInterface, C76800UCe> LIZJ;
    public final InterfaceC88472Yns<DialogInterface, C76800UCe> LIZLLL;

    public C54791Let() {
        this(null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54791Let)) {
            return false;
        }
        C54791Let c54791Let = (C54791Let) obj;
        return o.LJ(this.LIZ, c54791Let.LIZ) && o.LJ(this.LIZIZ, c54791Let.LIZIZ) && o.LJ(this.LIZJ, c54791Let.LIZJ) && o.LJ(this.LIZLLL, c54791Let.LIZLLL);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        InterfaceC88472Yns<AR4, C76800UCe> interfaceC88472Yns = this.LIZIZ;
        int hashCode2 = (hashCode + (interfaceC88472Yns == null ? 0 : interfaceC88472Yns.hashCode())) * 31;
        InterfaceC88472Yns<DialogInterface, C76800UCe> interfaceC88472Yns2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (interfaceC88472Yns2 == null ? 0 : interfaceC88472Yns2.hashCode())) * 31;
        InterfaceC88472Yns<DialogInterface, C76800UCe> interfaceC88472Yns3 = this.LIZLLL;
        return hashCode3 + (interfaceC88472Yns3 != null ? interfaceC88472Yns3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryTutorialBuildParam(primaryText=");
        LIZ.append(this.LIZ);
        LIZ.append(", primaryAction=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", dismissAction=");
        LIZ.append(this.LIZJ);
        LIZ.append(", cancelAction=");
        return C249109q6.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C54791Let(String primaryText, AqS51S1200000_9 aqS51S1200000_9, AqS175S0100000_9 aqS175S0100000_9, int i) {
        primaryText = (i & 1) != 0 ? "" : primaryText;
        aqS51S1200000_9 = (i & 2) != 0 ? null : aqS51S1200000_9;
        aqS175S0100000_9 = (i & 4) != 0 ? null : aqS175S0100000_9;
        o.LJIIIZ(primaryText, "primaryText");
        this.LIZ = primaryText;
        this.LIZIZ = aqS51S1200000_9;
        this.LIZJ = aqS175S0100000_9;
        this.LIZLLL = null;
    }
}
