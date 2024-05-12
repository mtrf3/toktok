package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MbF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57113MbF implements InterfaceC57784Mm4 {
    public final Integer LJLIL;
    public final Integer LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final Boolean LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57113MbF)) {
            return false;
        }
        C57113MbF c57113MbF = (C57113MbF) obj;
        return o.LJ(this.LJLIL, c57113MbF.LJLIL) && o.LJ(this.LJLILLLLZI, c57113MbF.LJLILLLLZI) && o.LJ(this.LJLJI, c57113MbF.LJLJI) && o.LJ(this.LJLJJI, c57113MbF.LJLJJI) && o.LJ(this.LJLJJL, c57113MbF.LJLJJL) && o.LJ(this.LJLJJLL, c57113MbF.LJLJJLL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        Integer num = this.LJLIL;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.LJLJI;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.LJLJJLL;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubscribeSettingsItem(group=");
        LIZ.append(this.LJLIL);
        LIZ.append(", label=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", title=");
        LIZ.append(this.LJLJI);
        LIZ.append(", subscribeDesc=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", unsubscribeDesc=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", isUnsubscribe=");
        return C78920UyC.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C57113MbF(String str, String str2, Integer num, Boolean bool, String str3, Integer num2) {
        this.LJLIL = num;
        this.LJLILLLLZI = num2;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = bool;
    }
}
