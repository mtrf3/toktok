package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8iS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218888iS implements InterfaceC87283bg {
    public final List<UserInvitee> LJLIL;
    public final InterfaceC88471Ynr<List<UserInvitee>, InterfaceC67352kd<? super C76800UCe>, Object> LJLILLLLZI;
    public final java.util.Map<String, Object> LJLJI;
    public final InterfaceC218828iM LJLJJI;
    public final boolean LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C218888iS)) {
            return false;
        }
        C218888iS c218888iS = (C218888iS) obj;
        return o.LJ(this.LJLIL, c218888iS.LJLIL) && o.LJ(this.LJLILLLLZI, c218888iS.LJLILLLLZI) && o.LJ(this.LJLJI, c218888iS.LJLJI) && o.LJ(this.LJLJJI, c218888iS.LJLJJI) && this.LJLJJL == c218888iS.LJLJJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        List<UserInvitee> list = this.LJLIL;
        int hashCode = (this.LJLILLLLZI.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31;
        java.util.Map<String, Object> map = this.LJLJI;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        InterfaceC218828iM interfaceC218828iM = this.LJLJJI;
        int hashCode3 = (hashCode2 + (interfaceC218828iM != null ? interfaceC218828iM.hashCode() : 0)) * 31;
        boolean z = this.LJLJJL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InviteHierarchyData(preSelected=");
        LIZ.append(this.LJLIL);
        LIZ.append(", done=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", navExtra=");
        LIZ.append(this.LJLJI);
        LIZ.append(", listBehavior=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isPad=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public C218888iS(List list, C219118ip c219118ip, java.util.Map map, InterfaceC218828iM interfaceC218828iM, boolean z) {
        this.LJLIL = list;
        this.LJLILLLLZI = c219118ip;
        this.LJLJI = map;
        this.LJLJJI = interfaceC218828iM;
        this.LJLJJL = z;
    }
}
