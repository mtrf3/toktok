package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.jvm.internal.o;

/* renamed from: X.MfU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57376MfU implements C33Q {
    public final C57285Me1 LJLIL;
    public final AbstractC72932td<FollowStatus> LJLILLLLZI;
    public final AbstractC72932td<BaseResponse> LJLJI;
    public final C43I<EnumC57387Mff> LJLJJI;

    public C57376MfU() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57376MfU)) {
            return false;
        }
        C57376MfU c57376MfU = (C57376MfU) obj;
        return o.LJ(this.LJLIL, c57376MfU.LJLIL) && o.LJ(this.LJLILLLLZI, c57376MfU.LJLILLLLZI) && o.LJ(this.LJLJI, c57376MfU.LJLJI) && o.LJ(this.LJLJJI, c57376MfU.LJLJJI);
    }

    public final int hashCode() {
        int hashCode;
        C57285Me1 c57285Me1 = this.LJLIL;
        int i = 0;
        if (c57285Me1 == null) {
            hashCode = 0;
        } else {
            hashCode = c57285Me1.hashCode();
        }
        int LIZ = C03090Af.LIZ(this.LJLJI, C03090Af.LIZ(this.LJLILLLLZI, hashCode * 31, 31), 31);
        C43I<EnumC57387Mff> c43i = this.LJLJJI;
        if (c43i != null) {
            i = c43i.hashCode();
        }
        return LIZ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserProfileFollowState(followParams=");
        LIZ.append(this.LJLIL);
        LIZ.append(", followRequest=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", removeRequest=");
        LIZ.append(this.LJLJI);
        LIZ.append(", checkEventEnum=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C57376MfU(int r3) {
        /*
            r2 = this;
            X.33X r1 = X.C33X.LIZ
            r0 = 0
            r2.<init>(r0, r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57376MfU.<init>(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C57376MfU(C57285Me1 c57285Me1, AbstractC72932td<FollowStatus> followRequest, AbstractC72932td<? extends BaseResponse> removeRequest, C43I<? extends EnumC57387Mff> c43i) {
        o.LJIIIZ(followRequest, "followRequest");
        o.LJIIIZ(removeRequest, "removeRequest");
        this.LJLIL = c57285Me1;
        this.LJLILLLLZI = followRequest;
        this.LJLJI = removeRequest;
        this.LJLJJI = c43i;
    }

    public static C57376MfU LIZ(C57376MfU c57376MfU, AbstractC72932td followRequest, AbstractC72932td removeRequest, C43I c43i, int i) {
        C57285Me1 c57285Me1;
        if ((i & 1) != 0) {
            c57285Me1 = c57376MfU.LJLIL;
        } else {
            c57285Me1 = null;
        }
        if ((i & 2) != 0) {
            followRequest = c57376MfU.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            removeRequest = c57376MfU.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i = c57376MfU.LJLJJI;
        }
        c57376MfU.getClass();
        o.LJIIIZ(followRequest, "followRequest");
        o.LJIIIZ(removeRequest, "removeRequest");
        return new C57376MfU(c57285Me1, followRequest, removeRequest, c43i);
    }
}
