package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CZT {
    public static final String LIZ(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "unknown" : "paying_user" : "admin" : "anchor" : "audience";
    }

    public static final void LIZLLL(String content) {
        o.LJIIIZ(content, "content");
    }

    public static final String LIZIZ(CZV status) {
        o.LJIIIZ(status, "status");
        int i = CZU.LIZ[status.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "unknown";
                    }
                    throw new C162476Zf();
                }
                return "blank";
            }
            return "self_waiting";
        }
        return "displaying";
    }

    public static final String LIZJ(CZW czw) {
        int i;
        if (czw == null || (i = CZU.LIZIZ[czw.ordinal()]) == -1) {
            return "hide";
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "deleted";
                }
                throw new C162476Zf();
            }
            return "waiting_time";
        }
        return "manage_info";
    }
}
