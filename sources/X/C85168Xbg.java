package X;

import com.ss.android.ugc.aweme.account.login.twostep.RecommendDeviceResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xbg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85168Xbg implements InterfaceC208718Hb<C85168Xbg, C85166Xbe> {
    public final C8HZ<C85166Xbe> LJLIL;
    public final AbstractC72932td<RecommendDeviceResponse> LJLILLLLZI;
    public final AbstractC72932td<RecommendDeviceResponse> LJLJI;

    public C85168Xbg() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLJI.hashCode() + C03090Af.LIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<C85166Xbe> getListItemState() {
        return C208708Ha.LIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadLatestState() {
        return C208708Ha.LIZIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadMoreState() {
        return C208708Ha.LIZJ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getRefreshState() {
        return C208708Ha.LIZLLL(this);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecentDeviceVMState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", loadingPageData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", actionResponse=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C85166Xbe> getListState() {
        return this.LJLIL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C85168Xbg(int r4) {
        /*
            r3 = this;
            X.8HZ r2 = new X.8HZ
            r1 = 15
            r0 = 0
            r2.<init>(r0, r0, r1)
            X.33X r0 = X.C33X.LIZ
            r3.<init>(r0, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85168Xbg.<init>(int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85168Xbg)) {
            return false;
        }
        C85168Xbg c85168Xbg = (C85168Xbg) obj;
        if (o.LJ(this.LJLIL, c85168Xbg.LJLIL) && o.LJ(this.LJLILLLLZI, c85168Xbg.LJLILLLLZI) && o.LJ(this.LJLJI, c85168Xbg.LJLJI)) {
            return true;
        }
        return false;
    }

    public C85168Xbg(AbstractC72932td loadingPageData, AbstractC72932td actionResponse, C8HZ listState) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(loadingPageData, "loadingPageData");
        o.LJIIIZ(actionResponse, "actionResponse");
        this.LJLIL = listState;
        this.LJLILLLLZI = loadingPageData;
        this.LJLJI = actionResponse;
    }

    public static C85168Xbg LIZ(C85168Xbg c85168Xbg, C8HZ listState, AbstractC72932td loadingPageData, AbstractC72932td actionResponse, int i) {
        if ((i & 1) != 0) {
            listState = c85168Xbg.LJLIL;
        }
        if ((i & 2) != 0) {
            loadingPageData = c85168Xbg.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            actionResponse = c85168Xbg.LJLJI;
        }
        c85168Xbg.getClass();
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(loadingPageData, "loadingPageData");
        o.LJIIIZ(actionResponse, "actionResponse");
        return new C85168Xbg(loadingPageData, actionResponse, listState);
    }
}
