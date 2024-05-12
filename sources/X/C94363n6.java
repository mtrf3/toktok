package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.3n6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94363n6 extends AbstractC238349Xa {
    public final String LIZIZ;
    public final String LIZJ;
    public final java.util.Map<String, String> LIZLLL;

    public final int hashCode() {
        return Objects.hash(this.LIZIZ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("InviteFriendsClickTrack:%s", this.LIZIZ);
    }

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC238349Xa
    public final java.util.Map<String, String> LIZIZ() {
        return this.LIZLLL;
    }

    public C94363n6(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZIZ = enterFrom;
        this.LIZJ = "invite_friend_click";
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n        .ap…rFrom)\n        .builder()");
        this.LIZLLL = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C94363n6)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C94363n6) obj).LIZIZ}, new Object[]{this.LIZIZ});
    }
}
