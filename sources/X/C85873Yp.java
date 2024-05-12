package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Yp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85873Yp extends F9E implements Serializable {
    public final int LJLIL;
    public final List<String> LJLILLLLZI;
    public final List<Long> LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C85873Yp copy$default(C85873Yp c85873Yp, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c85873Yp.LJLIL;
        }
        if ((i2 & 2) != 0) {
            list = c85873Yp.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            list2 = c85873Yp.LJLJI;
        }
        return c85873Yp.copy(i, list, list2);
    }

    public final C85873Yp copy(int i, List<String> secUserIds, List<Long> createdTimes) {
        o.LJIIIZ(secUserIds, "secUserIds");
        o.LJIIIZ(createdTimes, "createdTimes");
        return new C85873Yp(i, secUserIds, createdTimes);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI};
    }

    public final List<Long> getCreatedTimes() {
        return this.LJLJI;
    }

    public final int getRelationType() {
        return this.LJLIL;
    }

    public final List<String> getSecUserIds() {
        return this.LJLILLLLZI;
    }

    public C85873Yp(int i, List<String> secUserIds, List<Long> createdTimes) {
        o.LJIIIZ(secUserIds, "secUserIds");
        o.LJIIIZ(createdTimes, "createdTimes");
        this.LJLIL = i;
        this.LJLILLLLZI = secUserIds;
        this.LJLJI = createdTimes;
    }
}
