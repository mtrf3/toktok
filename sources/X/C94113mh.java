package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3mh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94113mh implements C33Q {
    public final EnumC94093mf LJLIL;
    public final List<C3GU> LJLILLLLZI;
    public final C57778Mly LJLJI;
    public final EnumC94173mn LJLJJI;
    public final ArrayList<String> LJLJJL;
    public final ArrayList<String> LJLJJLL;
    public final C43I<Boolean> LJLJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C94113mh)) {
            return false;
        }
        C94113mh c94113mh = (C94113mh) obj;
        return this.LJLIL == c94113mh.LJLIL && o.LJ(this.LJLILLLLZI, c94113mh.LJLILLLLZI) && o.LJ(this.LJLJI, c94113mh.LJLJI) && this.LJLJJI == c94113mh.LJLJJI && o.LJ(this.LJLJJL, c94113mh.LJLJJL) && o.LJ(this.LJLJJLL, c94113mh.LJLJJLL) && o.LJ(this.LJLJL, c94113mh.LJLJL);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.LJLJJLL.hashCode() + ((this.LJLJJL.hashCode() + ((this.LJLJJI.hashCode() + ((this.LJLJI.hashCode() + AnonymousClass391.LIZIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31)) * 31)) * 31)) * 31)) * 31;
        C43I<Boolean> c43i = this.LJLJL;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MutualRelationListPageVMState(mutualRelationSourceState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", mutualRelationList=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", mafSourceState=");
        LIZ.append(this.LJLJI);
        LIZ.append(", pageState=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", toUidList=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", toSecUidList=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", blockEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJL, ')', LIZ);
    }

    public C94113mh(EnumC94093mf mutualRelationSourceState, List<C3GU> mutualRelationList, C57778Mly c57778Mly, EnumC94173mn pageState, ArrayList<String> arrayList, ArrayList<String> arrayList2, C43I<Boolean> c43i) {
        o.LJIIIZ(mutualRelationSourceState, "mutualRelationSourceState");
        o.LJIIIZ(mutualRelationList, "mutualRelationList");
        o.LJIIIZ(pageState, "pageState");
        this.LJLIL = mutualRelationSourceState;
        this.LJLILLLLZI = mutualRelationList;
        this.LJLJI = c57778Mly;
        this.LJLJJI = pageState;
        this.LJLJJL = arrayList;
        this.LJLJJLL = arrayList2;
        this.LJLJL = c43i;
    }

    public static C94113mh LIZ(C94113mh c94113mh, EnumC94093mf enumC94093mf, List list, C57778Mly c57778Mly, EnumC94173mn enumC94173mn, ArrayList arrayList, ArrayList arrayList2, C43I c43i, int i) {
        C43I c43i2 = c43i;
        List mutualRelationList = list;
        EnumC94093mf mutualRelationSourceState = enumC94093mf;
        C57778Mly mafSourceState = c57778Mly;
        EnumC94173mn pageState = enumC94173mn;
        ArrayList toUidList = arrayList;
        ArrayList toSecUidList = arrayList2;
        if ((i & 1) != 0) {
            mutualRelationSourceState = c94113mh.LJLIL;
        }
        if ((i & 2) != 0) {
            mutualRelationList = c94113mh.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            mafSourceState = c94113mh.LJLJI;
        }
        if ((i & 8) != 0) {
            pageState = c94113mh.LJLJJI;
        }
        if ((i & 16) != 0) {
            toUidList = c94113mh.LJLJJL;
        }
        if ((i & 32) != 0) {
            toSecUidList = c94113mh.LJLJJLL;
        }
        if ((i & 64) != 0) {
            c43i2 = c94113mh.LJLJL;
        }
        c94113mh.getClass();
        o.LJIIIZ(mutualRelationSourceState, "mutualRelationSourceState");
        o.LJIIIZ(mutualRelationList, "mutualRelationList");
        o.LJIIIZ(mafSourceState, "mafSourceState");
        o.LJIIIZ(pageState, "pageState");
        o.LJIIIZ(toUidList, "toUidList");
        o.LJIIIZ(toSecUidList, "toSecUidList");
        return new C94113mh(mutualRelationSourceState, mutualRelationList, mafSourceState, pageState, toUidList, toSecUidList, c43i2);
    }
}
