package X;

import com.ss.android.ugc.aweme.AccountService;
import kotlin.jvm.internal.o;

/* renamed from: X.3Ss, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84343Ss {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public final C62822Ol8 LJ;

    public C84343Ss() {
        this(0);
    }

    public final java.util.Map<String, Object> LIZIZ() {
        return (java.util.Map) this.LJ.getValue();
    }

    public final boolean LIZLLL() {
        if (LIZIZ().isEmpty()) {
            return false;
        }
        if (this.LIZIZ) {
            String LIZ = C56716MNs.LIZIZ.LIZ();
            if (!o.LJ(LIZ, this.LIZJ)) {
                this.LIZJ = LIZ;
                LIZIZ().clear();
                return false;
            }
        }
        if (this.LIZ) {
            String curUserId = AccountService.LJIJ().LJFF().getCurUserId();
            if (!o.LJ(curUserId, this.LIZLLL)) {
                this.LIZLLL = curUserId;
                LIZIZ().clear();
                return false;
            }
            return true;
        }
        return true;
    }

    public C84343Ss(int i) {
        this.LIZ = true;
        this.LIZIZ = true;
        this.LIZJ = C56716MNs.LIZIZ.LIZ();
        this.LIZLLL = AccountService.LJIJ().LJFF().getCurUserId();
        this.LJ = C221108m2.LIZIZ(C84353St.LJLIL);
    }

    public final <T> T LIZ(String str) {
        T t = (T) LIZIZ().get(str);
        if (t == null) {
            return null;
        }
        return t;
    }

    public final void LIZJ(String str, Object value) {
        o.LJIIIZ(value, "value");
        LIZIZ().put(str, value);
    }
}
