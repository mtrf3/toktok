package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.LayoutState;

/* renamed from: X.TpC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75814TpC implements C33Q {
    public final long LJLIL;
    public final LayoutState LJLILLLLZI;
    public final List<UserState> LJLJI;
    public final AbstractC72932td<C57372Mz> LJLJJI;
    public final String LJLJJL;

    public C75814TpC() {
        this(0L, (LayoutState) null, (List) null, (String) null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75814TpC)) {
            return false;
        }
        C75814TpC c75814TpC = (C75814TpC) obj;
        return this.LJLIL == c75814TpC.LJLIL && o.LJ(this.LJLILLLLZI, c75814TpC.LJLILLLLZI) && o.LJ(this.LJLJI, c75814TpC.LJLJI) && o.LJ(this.LJLJJI, c75814TpC.LJLJJI) && o.LJ(this.LJLJJL, c75814TpC.LJLJJL);
    }

    public final int hashCode() {
        int hashCode;
        int LIZ = C03090Af.LIZ(this.LJLJJI, AnonymousClass391.LIZIZ(this.LJLJI, (this.LJLILLLLZI.hashCode() + (C16880lQ.LLJIJIL(this.LJLIL) * 31)) * 31, 31), 31);
        String str = this.LJLJJL;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LIZ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkStatusState(clientVersion=");
        LIZ.append(this.LJLIL);
        LIZ.append(", layoutState=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", linkUserState=");
        LIZ.append(this.LJLJI);
        LIZ.append(", stateChangeStatus=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", sharedBgStickerId=");
        return q.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C75814TpC(long r8, tikcast.linkmic.common.LayoutState r10, java.util.List r11, java.lang.String r12, int r13) {
        /*
            r7 = this;
            r4 = r11
            r1 = r8
            r3 = r10
            r0 = r13 & 1
            if (r0 == 0) goto L9
            r1 = 0
        L9:
            r0 = r13 & 2
            if (r0 == 0) goto L16
            tikcast.linkmic.common.LayoutState r3 = new tikcast.linkmic.common.LayoutState
            r3.<init>()
            java.lang.String r0 = "0"
            r3.layoutId = r0
        L16:
            r0 = r13 & 4
            if (r0 == 0) goto L1c
            X.OQg r4 = X.C61878OQg.INSTANCE
        L1c:
            r0 = r13 & 8
            r6 = 0
            if (r0 == 0) goto L2e
            X.33X r5 = X.C33X.LIZ
        L23:
            r0 = r13 & 16
            if (r0 == 0) goto L2c
        L27:
            r0 = r7
            r0.<init>(r1, r3, r4, r5, r6)
            return
        L2c:
            r6 = r12
            goto L27
        L2e:
            r5 = r6
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75814TpC.<init>(long, tikcast.linkmic.common.LayoutState, java.util.List, java.lang.String, int):void");
    }

    public C75814TpC(long j, LayoutState layoutState, List<UserState> linkUserState, AbstractC72932td<C57372Mz> stateChangeStatus, String str) {
        o.LJIIIZ(layoutState, "layoutState");
        o.LJIIIZ(linkUserState, "linkUserState");
        o.LJIIIZ(stateChangeStatus, "stateChangeStatus");
        this.LJLIL = j;
        this.LJLILLLLZI = layoutState;
        this.LJLJI = linkUserState;
        this.LJLJJI = stateChangeStatus;
        this.LJLJJL = str;
    }

    public static C75814TpC LIZ(C75814TpC c75814TpC, long j, LayoutState layoutState, List list, AbstractC72932td abstractC72932td, String str, int i) {
        String str2 = str;
        AbstractC72932td stateChangeStatus = abstractC72932td;
        List linkUserState = list;
        long j2 = j;
        LayoutState layoutState2 = layoutState;
        if ((i & 1) != 0) {
            j2 = c75814TpC.LJLIL;
        }
        if ((i & 2) != 0) {
            layoutState2 = c75814TpC.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            linkUserState = c75814TpC.LJLJI;
        }
        if ((i & 8) != 0) {
            stateChangeStatus = c75814TpC.LJLJJI;
        }
        if ((i & 16) != 0) {
            str2 = c75814TpC.LJLJJL;
        }
        c75814TpC.getClass();
        o.LJIIIZ(layoutState2, "layoutState");
        o.LJIIIZ(linkUserState, "linkUserState");
        o.LJIIIZ(stateChangeStatus, "stateChangeStatus");
        return new C75814TpC(j2, layoutState2, (List<UserState>) linkUserState, (AbstractC72932td<C57372Mz>) stateChangeStatus, str2);
    }
}
