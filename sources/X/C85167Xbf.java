package X;

import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xbf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85167Xbf implements InterfaceC208718Hb<C85167Xbf, C85165Xbd> {
    public final C8HZ<C85165Xbd> LJLIL;
    public final AbstractC72932td<AddVerificationResponse> LJLILLLLZI;
    public final AbstractC72932td<AddVerificationResponse> LJLJI;
    public final boolean LJLJJI;
    public final C85149XbN LJLJJL;

    public C85167Xbf() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LIZ = C03090Af.LIZ(this.LJLJI, C03090Af.LIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31);
        boolean z = this.LJLJJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.LJLJJL.hashCode() + ((LIZ + i) * 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<C85165Xbd> getListItemState() {
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
        LIZ.append("TwoStepVerificationActivityVMState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", loadingPageData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", actionResponse=");
        LIZ.append(this.LJLJI);
        LIZ.append(", enableTurnOn=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", popUpParam=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C85165Xbd> getListState() {
        return this.LJLIL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C85167Xbf(int r8) {
        /*
            r7 = this;
            X.8HZ r2 = new X.8HZ
            r1 = 15
            r0 = 0
            r2.<init>(r0, r0, r1)
            X.33X r3 = X.C33X.LIZ
            r5 = 0
            X.XbN r6 = new X.XbN
            r6.<init>(r0, r0)
            r1 = r7
            r4 = r3
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85167Xbf.<init>(int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85167Xbf)) {
            return false;
        }
        C85167Xbf c85167Xbf = (C85167Xbf) obj;
        if (o.LJ(this.LJLIL, c85167Xbf.LJLIL) && o.LJ(this.LJLILLLLZI, c85167Xbf.LJLILLLLZI) && o.LJ(this.LJLJI, c85167Xbf.LJLJI) && this.LJLJJI == c85167Xbf.LJLJJI && o.LJ(this.LJLJJL, c85167Xbf.LJLJJL)) {
            return true;
        }
        return false;
    }

    public C85167Xbf(C8HZ<C85165Xbd> listState, AbstractC72932td<AddVerificationResponse> loadingPageData, AbstractC72932td<AddVerificationResponse> actionResponse, boolean z, C85149XbN popUpParam) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(loadingPageData, "loadingPageData");
        o.LJIIIZ(actionResponse, "actionResponse");
        o.LJIIIZ(popUpParam, "popUpParam");
        this.LJLIL = listState;
        this.LJLILLLLZI = loadingPageData;
        this.LJLJI = actionResponse;
        this.LJLJJI = z;
        this.LJLJJL = popUpParam;
    }

    public static C85167Xbf LIZ(C85167Xbf c85167Xbf, C8HZ c8hz, AbstractC72932td abstractC72932td, AbstractC72932td abstractC72932td2, boolean z, C85149XbN c85149XbN, int i) {
        C85149XbN popUpParam = c85149XbN;
        boolean z2 = z;
        AbstractC72932td actionResponse = abstractC72932td2;
        C8HZ listState = c8hz;
        AbstractC72932td loadingPageData = abstractC72932td;
        if ((i & 1) != 0) {
            listState = c85167Xbf.LJLIL;
        }
        if ((i & 2) != 0) {
            loadingPageData = c85167Xbf.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            actionResponse = c85167Xbf.LJLJI;
        }
        if ((i & 8) != 0) {
            z2 = c85167Xbf.LJLJJI;
        }
        if ((i & 16) != 0) {
            popUpParam = c85167Xbf.LJLJJL;
        }
        c85167Xbf.getClass();
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(loadingPageData, "loadingPageData");
        o.LJIIIZ(actionResponse, "actionResponse");
        o.LJIIIZ(popUpParam, "popUpParam");
        return new C85167Xbf(listState, loadingPageData, actionResponse, z2, popUpParam);
    }
}
