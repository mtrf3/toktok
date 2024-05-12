package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.AUk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26314AUk extends AbstractC238349Xa {
    public final String LIZIZ;
    public final EnumC58046MqI LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final String LJI;
    public final String LJII;
    public final java.util.Map<String, String> LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26314AUk)) {
            return false;
        }
        C26314AUk c26314AUk = (C26314AUk) obj;
        return o.LJ(this.LIZIZ, c26314AUk.LIZIZ) && this.LIZJ == c26314AUk.LIZJ && this.LIZLLL == c26314AUk.LIZLLL && this.LJ == c26314AUk.LJ && this.LJFF == c26314AUk.LJFF && o.LJ(this.LJI, c26314AUk.LJI);
    }

    public final int hashCode() {
        int hashCode = (((((((this.LIZJ.hashCode() + (this.LIZIZ.hashCode() * 31)) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31;
        String str = this.LJI;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MatchFriendTrack(enterFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", platform=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mafCount=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", fetchCount=");
        LIZ.append(this.LJ);
        LIZ.append(", filterCount=");
        LIZ.append(this.LJFF);
        LIZ.append(", requestId=");
        return q.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return this.LJII;
    }

    @Override // X.AbstractC238349Xa
    public final java.util.Map<String, String> LIZIZ() {
        return this.LJIIIIZZ;
    }

    public C26314AUk(String enterFrom, EnumC58046MqI platform, int i, int i2, int i3, String str) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(platform, "platform");
        this.LIZIZ = enterFrom;
        this.LIZJ = platform;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = str;
        this.LJII = "matched_friend_monitor";
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LIZLLL(platform.getValue(), "platform");
        c188727au.LIZLLL(i, "maf_count");
        c188727au.LIZLLL(i2, "fetch_count");
        c188727au.LIZLLL(i3, "filter_count");
        c188727au.LJIIIZ("request_id", str);
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n        .ap…estId)\n        .builder()");
        this.LJIIIIZZ = map;
    }
}
