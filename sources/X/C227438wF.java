package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.relation.ffp.ui.RecFriendsFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.8wF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227438wF implements C33Q {
    public final InterfaceC65350Pko<? extends Fragment> LJLIL;
    public final InterfaceC65350Pko<? extends Fragment> LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final C43I<C76800UCe> LJLJJL;

    public C227438wF() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C227438wF)) {
            return false;
        }
        C227438wF c227438wF = (C227438wF) obj;
        return o.LJ(this.LJLIL, c227438wF.LJLIL) && o.LJ(this.LJLILLLLZI, c227438wF.LJLILLLLZI) && o.LJ(this.LJLJI, c227438wF.LJLJI) && this.LJLJJI == c227438wF.LJLJJI && o.LJ(this.LJLJJL, c227438wF.LJLJJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJLIL.hashCode() * 31;
        InterfaceC65350Pko<? extends Fragment> interfaceC65350Pko = this.LJLILLLLZI;
        int i = 0;
        if (interfaceC65350Pko == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC65350Pko.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJLJI, (hashCode2 + hashCode) * 31, 31);
        boolean z = this.LJLJJI;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LJ + i2) * 31;
        C43I<C76800UCe> c43i = this.LJLJJL;
        if (c43i != null) {
            i = c43i.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FFPMainVMState(showFragment=");
        LIZ.append(this.LJLIL);
        LIZ.append(", prevFragment=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", searchKeyword=");
        LIZ.append(this.LJLJI);
        LIZ.append(", showSeparator=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", hideKeyboard=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public /* synthetic */ C227438wF(int i) {
        this(C65352Pkq.LIZ(RecFriendsFragment.class), null, "", false, null);
    }

    public C227438wF(InterfaceC65350Pko<? extends Fragment> showFragment, InterfaceC65350Pko<? extends Fragment> interfaceC65350Pko, String searchKeyword, boolean z, C43I<C76800UCe> c43i) {
        o.LJIIIZ(showFragment, "showFragment");
        o.LJIIIZ(searchKeyword, "searchKeyword");
        this.LJLIL = showFragment;
        this.LJLILLLLZI = interfaceC65350Pko;
        this.LJLJI = searchKeyword;
        this.LJLJJI = z;
        this.LJLJJL = c43i;
    }

    public static C227438wF LIZ(C227438wF c227438wF, InterfaceC65350Pko interfaceC65350Pko, InterfaceC65350Pko interfaceC65350Pko2, String str, boolean z, C43I c43i, int i) {
        C43I c43i2 = c43i;
        boolean z2 = z;
        String searchKeyword = str;
        InterfaceC65350Pko showFragment = interfaceC65350Pko;
        InterfaceC65350Pko interfaceC65350Pko3 = interfaceC65350Pko2;
        if ((i & 1) != 0) {
            showFragment = c227438wF.LJLIL;
        }
        if ((i & 2) != 0) {
            interfaceC65350Pko3 = c227438wF.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            searchKeyword = c227438wF.LJLJI;
        }
        if ((i & 8) != 0) {
            z2 = c227438wF.LJLJJI;
        }
        if ((i & 16) != 0) {
            c43i2 = c227438wF.LJLJJL;
        }
        c227438wF.getClass();
        o.LJIIIZ(showFragment, "showFragment");
        o.LJIIIZ(searchKeyword, "searchKeyword");
        return new C227438wF(showFragment, interfaceC65350Pko3, searchKeyword, z2, c43i2);
    }
}
