package X;

import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9IB, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9IB<T> implements InterfaceC87283bg {
    public T LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final Boolean LJLJJI;
    public final Boolean LJLJJL;
    public final String LJLJJLL;
    public final HashMap<String, String> LJLJL;
    public final C26175APb LJLJLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9IB)) {
            return false;
        }
        C9IB c9ib = (C9IB) obj;
        return o.LJ(this.LJLIL, c9ib.LJLIL) && o.LJ(this.LJLILLLLZI, c9ib.LJLILLLLZI) && o.LJ(this.LJLJI, c9ib.LJLJI) && o.LJ(this.LJLJJI, c9ib.LJLJJI) && o.LJ(this.LJLJJL, c9ib.LJLJJL) && o.LJ(this.LJLJJLL, c9ib.LJLJJLL) && o.LJ(this.LJLJL, c9ib.LJLJL) && o.LJ(this.LJLJLJ, c9ib.LJLJLJ);
    }

    public final int hashCode() {
        T t = this.LJLIL;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.LJLJJI;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.LJLJJLL;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        HashMap<String, String> hashMap = this.LJLJL;
        int hashCode7 = (hashCode6 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        C26175APb c26175APb = this.LJLJLJ;
        return hashCode7 + (c26175APb != null ? c26175APb.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileUserData(data=");
        LIZ.append(this.LJLIL);
        LIZ.append(", from=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isMine=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", delayProfileLoading=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", noticeType=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", logExtra=");
        LIZ.append(this.LJLJL);
        LIZ.append(", userProfileInfo=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C9IB(T t, String str, String str2, Boolean bool, Boolean bool2, String str3, HashMap<String, String> hashMap, C26175APb c26175APb) {
        this.LJLIL = t;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = bool;
        this.LJLJJL = bool2;
        this.LJLJJLL = str3;
        this.LJLJL = hashMap;
        this.LJLJLJ = c26175APb;
    }

    public /* synthetic */ C9IB(ProfileUser profileUser, String str, String str2, Boolean bool, Boolean bool2, String str3, HashMap hashMap, C26175APb c26175APb, int i) {
        this(profileUser, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? Boolean.FALSE : bool2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : hashMap, (i & 128) == 0 ? c26175APb : null);
    }
}
