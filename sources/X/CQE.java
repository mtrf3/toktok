package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import webcast.data.UserIdentity;

/* loaded from: classes6.dex */
public final class CQE extends CQO<CQH> implements CS1 {
    public final User LJIL;
    public CQG LJJ;
    public final CQI LJJI;
    public boolean LJJIFFI;

    @Override // X.CQO, X.CRD
    public final UserIdentity LIZ() {
        return null;
    }

    @Override // X.CS1
    public final CS1 LIZJ() {
        return null;
    }

    @Override // X.CQO, X.InterfaceC31346CRy
    public final void LJJ(long j) {
    }

    @Override // X.CQL, X.InterfaceC31346CRy
    public final void LJJJJZ() {
        this.LJIIIZ = false;
    }

    @Override // X.CQO, X.CQL
    public final boolean LL() {
        return false;
    }

    @Override // X.CQO, X.InterfaceC31346CRy
    public final long getPriority() {
        return 0L;
    }

    @Override // X.CQL, X.InterfaceC29967BpT
    public final int LJJJ() {
        if (this.LJJ != null) {
            return R.drawable.d2a;
        }
        o.LJIJI("feedback");
        throw null;
    }

    @Override // X.CQL, X.InterfaceC29967BpT
    public final ImageModel LJJLJ() {
        CQG cqg = this.LJJ;
        if (cqg != null) {
            return cqg.LIZIZ;
        }
        o.LJIJI("feedback");
        throw null;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        CQG cqg = this.LJJ;
        if (cqg != null) {
            return cqg.LIZ;
        }
        o.LJIJI("feedback");
        throw null;
    }

    @Override // X.CS1
    public final boolean LJIILIIL() {
        return this.LJJIFFI;
    }

    @Override // X.CS1
    public final CQI LJJIJIIJI() {
        return this.LJJI;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return this.LJIL;
    }

    public CQE(User user, CQH cqh) {
        super(cqh);
        this.LJIL = user;
        this.LJJI = new CQI();
        this.LJJIFFI = true;
    }
}
