package X;

import com.ss.android.ugc.aweme.discover.model.SearchUser;
import defpackage.q;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JXr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49331JXr implements InterfaceC49871Jhj, InterfaceC49025JLx {
    public final HashMap<String, Object> LJLIL;
    public final SearchUser LJLILLLLZI;
    public final List<? extends SearchUser> LJLJI;
    public final String LJLJJI;
    public final int LJLJJL;

    public C49331JXr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49331JXr)) {
            return false;
        }
        C49331JXr c49331JXr = (C49331JXr) obj;
        return o.LJ(this.LJLIL, c49331JXr.LJLIL) && o.LJ(this.LJLILLLLZI, c49331JXr.LJLILLLLZI) && o.LJ(this.LJLJI, c49331JXr.LJLJI) && o.LJ(this.LJLJJI, c49331JXr.LJLJJI);
    }

    public final int hashCode() {
        HashMap<String, Object> hashMap = this.LJLIL;
        int hashCode = (hashMap == null ? 0 : hashMap.hashCode()) * 31;
        SearchUser searchUser = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (searchUser == null ? 0 : searchUser.hashCode())) * 31;
        List<? extends SearchUser> list = this.LJLJI;
        return this.LJLJJI.hashCode() + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchRelationUserItem(param=");
        LIZ.append(this.LJLIL);
        LIZ.append(", targetSearchUser=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", users=");
        LIZ.append(this.LJLJI);
        LIZ.append(", secTargetUserId=");
        return q.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    @Override // X.InterfaceC49871Jhj
    public final int LIZ() {
        return this.LJLJJL;
    }

    public C49331JXr(SearchUser searchUser, List list, String str) {
        this.LJLIL = null;
        this.LJLILLLLZI = searchUser;
        this.LJLJI = list;
        this.LJLJJI = str;
        int i = JPA.LIZ;
        JPA.LIZ = i + 1;
        this.LJLJJL = i;
    }
}
