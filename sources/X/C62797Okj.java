package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.auth.model.RegisteredContactUser;
import kotlin.jvm.internal.o;

/* renamed from: X.Okj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62797Okj extends P1K {
    public final User LJLJJI;
    public final int LJLJJL;
    public final P1U LJLJJLL;

    public final int hashCode() {
        return this.LJLJJLL.hashCode() + (((this.LJLJJI.hashCode() * 31) + this.LJLJJL) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContactMaFItem(user=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", order=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", config=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.P1K
    public final int LIZ() {
        return this.LJLJJL;
    }

    @Override // X.P1K
    public final User LIZIZ() {
        return this.LJLJJI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62797Okj)) {
            return false;
        }
        C62797Okj c62797Okj = (C62797Okj) obj;
        if (o.LJ(this.LJLJJI, c62797Okj.LJLJJI) && this.LJLJJL == c62797Okj.LJLJJL && o.LJ(this.LJLJJLL, c62797Okj.LJLJJLL)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62797Okj(RegisteredContactUser user, int i, P1U config) {
        super(user, i, config.LIZJ);
        o.LJIIIZ(user, "user");
        o.LJIIIZ(config, "config");
        this.LJLJJI = user;
        this.LJLJJL = i;
        this.LJLJJLL = config;
    }
}
