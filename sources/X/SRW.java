package X;

import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SRW implements InterfaceC87283bg {
    public final APM LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final SSR LJLJJI;
    public final ActivityC45651qj LJLJJL;
    public final InterfaceC65784Pro<C76800UCe> LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SRW)) {
            return false;
        }
        SRW srw = (SRW) obj;
        return this.LJLIL == srw.LJLIL && o.LJ(this.LJLILLLLZI, srw.LJLILLLLZI) && o.LJ(this.LJLJI, srw.LJLJI) && this.LJLJJI == srw.LJLJJI && o.LJ(this.LJLJJL, srw.LJLJJL) && o.LJ(this.LJLJJLL, srw.LJLJJLL);
    }

    public final int hashCode() {
        APM apm = this.LJLIL;
        int hashCode = (apm == null ? 0 : apm.hashCode()) * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJI;
        int hashCode3 = (this.LJLJJI.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        ActivityC45651qj activityC45651qj = this.LJLJJL;
        return this.LJLJJLL.hashCode() + ((hashCode3 + (activityC45651qj != null ? activityC45651qj.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChooseAvatarAssemHierarchyData(entrance=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LJLJI);
        LIZ.append(", actionButtonState=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", activity=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", onBackButtonPressed=");
        return C06540Nm.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public SRW(APM apm, String str, String str2, SSR actionButtonState, ActivityC45651qj activityC45651qj, AqS162S0100000_12 aqS162S0100000_12) {
        o.LJIIIZ(actionButtonState, "actionButtonState");
        this.LJLIL = apm;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = actionButtonState;
        this.LJLJJL = activityC45651qj;
        this.LJLJJLL = aqS162S0100000_12;
    }
}
