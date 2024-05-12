package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3j2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91843j2 implements C33Q {
    public final C43I<List<IMUser>> LJLIL;
    public final C43I<IMUser> LJLILLLLZI;
    public final OSZ<List<IMUser>, String> LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91843j2)) {
            return false;
        }
        C91843j2 c91843j2 = (C91843j2) obj;
        return o.LJ(this.LJLIL, c91843j2.LJLIL) && o.LJ(this.LJLILLLLZI, c91843j2.LJLILLLLZI) && o.LJ(this.LJLJI, c91843j2.LJLJI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        C43I<IMUser> c43i = this.LJLILLLLZI;
        return this.LJLJI.hashCode() + ((hashCode + (c43i == null ? 0 : c43i.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectorState(contactList=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isSelectedChangedUser=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", searchResult=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C91843j2(C43I<? extends List<? extends IMUser>> c43i, C43I<? extends IMUser> c43i2, OSZ<? extends List<? extends IMUser>, String> osz) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
        this.LJLJI = osz;
    }

    public static C91843j2 LIZ(C91843j2 c91843j2, C43I contactList, C43I c43i, OSZ searchResult, int i) {
        if ((i & 1) != 0) {
            contactList = c91843j2.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i = c91843j2.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            searchResult = c91843j2.LJLJI;
        }
        c91843j2.getClass();
        o.LJIIIZ(contactList, "contactList");
        o.LJIIIZ(searchResult, "searchResult");
        return new C91843j2(contactList, c43i, searchResult);
    }
}
