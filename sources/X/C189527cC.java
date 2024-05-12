package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7cC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189527cC implements C33Q {
    public final long LJLIL;
    public final int LJLILLLLZI;
    public final OSZ<String, List<User>> LJLJI;
    public final OSZ<String, Long> LJLJJI;

    public C189527cC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C189527cC)) {
            return false;
        }
        C189527cC c189527cC = (C189527cC) obj;
        return this.LJLIL == c189527cC.LJLIL && this.LJLILLLLZI == c189527cC.LJLILLLLZI && o.LJ(this.LJLJI, c189527cC.LJLJI) && o.LJ(this.LJLJJI, c189527cC.LJLJJI);
    }

    public final int hashCode() {
        int LLJIJIL = ((C16880lQ.LLJIJIL(this.LJLIL) * 31) + this.LJLILLLLZI) * 31;
        OSZ<String, List<User>> osz = this.LJLJI;
        int hashCode = (LLJIJIL + (osz == null ? 0 : osz.hashCode())) * 31;
        OSZ<String, Long> osz2 = this.LJLJJI;
        return hashCode + (osz2 != null ? osz2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryViewerEntranceState(count=");
        LIZ.append(this.LJLIL);
        LIZ.append(", textColorRes=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", viewerList=");
        LIZ.append(this.LJLJI);
        LIZ.append(", viewerCount=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C189527cC(int i) {
        this(0L, R.attr.dj, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C189527cC(long j, int i, OSZ<String, ? extends List<? extends User>> osz, OSZ<String, Long> osz2) {
        this.LJLIL = j;
        this.LJLILLLLZI = i;
        this.LJLJI = osz;
        this.LJLJJI = osz2;
    }

    public static C189527cC LIZ(C189527cC c189527cC, long j, int i, OSZ osz, OSZ osz2, int i2) {
        OSZ osz3 = osz2;
        OSZ osz4 = osz;
        long j2 = j;
        int i3 = i;
        if ((i2 & 1) != 0) {
            j2 = c189527cC.LJLIL;
        }
        if ((i2 & 2) != 0) {
            i3 = c189527cC.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            osz4 = c189527cC.LJLJI;
        }
        if ((i2 & 8) != 0) {
            osz3 = c189527cC.LJLJJI;
        }
        c189527cC.getClass();
        return new C189527cC(j2, i3, osz4, osz3);
    }
}
