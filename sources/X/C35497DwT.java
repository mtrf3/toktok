package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.DwT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35497DwT implements Serializable {
    public final String LJLIL;
    public final List<EMX> LJLILLLLZI;
    public final List<String> LJLJI;

    public C35497DwT() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C35497DwT copy$default(C35497DwT c35497DwT, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c35497DwT.LJLIL;
        }
        if ((i & 2) != 0) {
            list = c35497DwT.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            list2 = c35497DwT.LJLJI;
        }
        return c35497DwT.copy(str, list, list2);
    }

    public final C35497DwT copy(String str, List<EMX> contactReadList, List<String> contactEmailList) {
        o.LJIIIZ(contactReadList, "contactReadList");
        o.LJIIIZ(contactEmailList, "contactEmailList");
        return new C35497DwT(str, contactReadList, contactEmailList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35497DwT)) {
            return false;
        }
        C35497DwT c35497DwT = (C35497DwT) obj;
        return o.LJ(this.LJLIL, c35497DwT.LJLIL) && o.LJ(this.LJLILLLLZI, c35497DwT.LJLILLLLZI) && o.LJ(this.LJLJI, c35497DwT.LJLJI);
    }

    public int hashCode() {
        int hashCode;
        String str = this.LJLIL;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.LJLJI.hashCode() + AnonymousClass391.LIZIZ(this.LJLILLLLZI, hashCode * 31, 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContactBookReadItem(contactName=");
        LIZ.append(this.LJLIL);
        LIZ.append(", contactReadList=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", contactEmailList=");
        return C1NE.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public final List<String> getContactEmailList() {
        return this.LJLJI;
    }

    public final String getContactName() {
        return this.LJLIL;
    }

    public final List<EMX> getContactReadList() {
        return this.LJLILLLLZI;
    }

    public C35497DwT(String str, List<EMX> contactReadList, List<String> contactEmailList) {
        o.LJIIIZ(contactReadList, "contactReadList");
        o.LJIIIZ(contactEmailList, "contactEmailList");
        this.LJLIL = str;
        this.LJLILLLLZI = contactReadList;
        this.LJLJI = contactEmailList;
    }

    public C35497DwT(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
