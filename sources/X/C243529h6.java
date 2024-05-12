package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.9h6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243529h6 extends AbstractC238349Xa {
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final String LJI;
    public final java.util.Map<String, String> LJII;

    public final Object[] LJ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, Boolean.valueOf(this.LJ), Boolean.valueOf(this.LJFF)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C243529h6) {
            return C78966Uyw.LJIIIZ(((C243529h6) obj).LJ(), LJ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LJ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("AuthorizeBindFinishTracker:%s,%s,%s,%s,%s", LJ());
    }

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return this.LJI;
    }

    @Override // X.AbstractC238349Xa
    public final java.util.Map<String, String> LIZIZ() {
        return this.LJII;
    }

    public /* synthetic */ C243529h6(String str, String str2, boolean z, String str3) {
        this(str, str2, z, false, str3);
    }

    public C243529h6(String str, String str2, boolean z, boolean z2, String str3) {
        HH1.LIZ(str, "enterFrom", str2, "enterMethod", str3, "platform");
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = "authorize_bind_result";
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("enter_method", str2);
        c188727au.LJIIIZ("platform", str3);
        c188727au.LIZLLL(z2 ? 1 : 0, "fb_token_expired");
        c188727au.LIZLLL(z ? 1 : 0, "status");
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n        .ap…lse 0)\n        .builder()");
        this.LJII = map;
    }
}
