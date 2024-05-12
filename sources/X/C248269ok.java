package X;

import com.ss.android.ugc.aweme.compliance.business.hideaccount.HiddenItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9ok, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C248269ok implements C33Q {
    public final List<HiddenItem> LJLIL;
    public final AbstractC72932td<Boolean> LJLILLLLZI;
    public final AbstractC72932td<Boolean> LJLJI;
    public final C43I<String> LJLJJI;

    public C248269ok() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C248269ok)) {
            return false;
        }
        C248269ok c248269ok = (C248269ok) obj;
        return o.LJ(this.LJLIL, c248269ok.LJLIL) && o.LJ(this.LJLILLLLZI, c248269ok.LJLILLLLZI) && o.LJ(this.LJLJI, c248269ok.LJLJI) && o.LJ(this.LJLJJI, c248269ok.LJLJJI);
    }

    public final int hashCode() {
        int hashCode;
        int LIZ = C03090Af.LIZ(this.LJLJI, C03090Af.LIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31);
        C43I<String> c43i = this.LJLJJI;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        return LIZ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HideAccountUIState(hideAccountList=");
        LIZ.append(this.LJLIL);
        LIZ.append(", refreshState=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", loadMoreState=");
        LIZ.append(this.LJLJI);
        LIZ.append(", showToastEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C248269ok(int r4) {
        /*
            r3 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.33X r1 = X.C33X.LIZ
            r0 = 0
            r3.<init>(r2, r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C248269ok.<init>(int):void");
    }

    public C248269ok(List<HiddenItem> hideAccountList, AbstractC72932td<Boolean> refreshState, AbstractC72932td<Boolean> loadMoreState, C43I<String> c43i) {
        o.LJIIIZ(hideAccountList, "hideAccountList");
        o.LJIIIZ(refreshState, "refreshState");
        o.LJIIIZ(loadMoreState, "loadMoreState");
        this.LJLIL = hideAccountList;
        this.LJLILLLLZI = refreshState;
        this.LJLJI = loadMoreState;
        this.LJLJJI = c43i;
    }

    public static C248269ok LIZ(C248269ok c248269ok, List hideAccountList, AbstractC72932td refreshState, AbstractC72932td loadMoreState, C43I c43i, int i) {
        if ((i & 1) != 0) {
            hideAccountList = c248269ok.LJLIL;
        }
        if ((i & 2) != 0) {
            refreshState = c248269ok.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            loadMoreState = c248269ok.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i = c248269ok.LJLJJI;
        }
        c248269ok.getClass();
        o.LJIIIZ(hideAccountList, "hideAccountList");
        o.LJIIIZ(refreshState, "refreshState");
        o.LJIIIZ(loadMoreState, "loadMoreState");
        return new C248269ok(hideAccountList, refreshState, loadMoreState, c43i);
    }
}
