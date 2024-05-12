package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.business.fbv.FBVCheckResponse;

/* renamed from: X.OmQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62902OmQ {
    public final IAccountService LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final C62822Ol8 LJ;
    public FBVCheckResponse LJFF;

    public final Keva LIZ() {
        return (Keva) this.LJ.getValue();
    }

    public C62902OmQ() {
        IAccountService LJIJ = AccountService.LJIJ();
        this.LIZ = LJIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIJ.LJFF().getCurUserId());
        LIZ.append("_fbv_status");
        this.LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJIJ.LJFF().getCurUserId());
        LIZ2.append("_fbv_validity");
        this.LIZJ = X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LJIJ.LJFF().getCurUserId());
        LIZ3.append("_fbv_ApprovalFail");
        this.LIZLLL = X1D.LIZIZ(LIZ3);
        this.LJ = C221108m2.LIZIZ(C62901OmP.LJLIL);
    }
}
