package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.9UA, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9UA extends AbstractC238349Xa {
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return "show_find_friends_page";
    }

    public final Object[] LJ() {
        return new Object[]{this.LIZIZ, this.LIZJ, Integer.valueOf(this.LIZLLL)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9UA) {
            return C78966Uyw.LJIIIZ(((C9UA) obj).LJ(), LJ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LJ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("ShowFindFriendTrack:%s,%s,%s", LJ());
    }

    @Override // X.AbstractC238349Xa
    public final java.util.Map<String, String> LIZIZ() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LIZJ);
        c188727au.LIZLLL(this.LIZLLL, "new_suggested_account");
        c188727au.LJIIIZ("page_type", this.LIZIZ);
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …e)\n            .builder()");
        return map;
    }

    public C9UA(String str, String enterFrom, int i) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZIZ = str;
        this.LIZJ = enterFrom;
        this.LIZLLL = i;
    }
}
