package X;

import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.Okk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62798Okk extends P1K {
    public final P1V LJLJJI;
    public final User LJLJJL;
    public final int LJLJJLL;

    public final int hashCode() {
        return ((this.LJLJJL.hashCode() + (this.LJLJJI.hashCode() * 31)) * 31) + this.LJLJJLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FacebookMaFItem(config=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", user=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", order=");
        return b0.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    @Override // X.P1K
    public final int LIZ() {
        return this.LJLJJLL;
    }

    @Override // X.P1K
    public final User LIZIZ() {
        return this.LJLJJL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62798Okk)) {
            return false;
        }
        C62798Okk c62798Okk = (C62798Okk) obj;
        if (o.LJ(this.LJLJJI, c62798Okk.LJLJJI) && o.LJ(this.LJLJJL, c62798Okk.LJLJJL) && this.LJLJJLL == c62798Okk.LJLJJLL) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62798Okk(P1V config, User user, int i) {
        super(user, i, config.LIZJ);
        o.LJIIIZ(config, "config");
        o.LJIIIZ(user, "user");
        this.LJLJJI = config;
        this.LJLJJL = user;
        this.LJLJJLL = i;
    }
}
