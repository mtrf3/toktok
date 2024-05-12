package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.2l2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67602l2 implements Serializable {
    public final String LJLIL;
    public final java.util.Map<String, String> LJLILLLLZI;
    public final long LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C67602l2 copy$default(C67602l2 c67602l2, String str, java.util.Map map, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c67602l2.LJLIL;
        }
        if ((i & 2) != 0) {
            map = c67602l2.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            j = c67602l2.LJLJI;
        }
        return c67602l2.copy(str, map, j);
    }

    public final C67602l2 copy(String eventName, java.util.Map<String, String> map, long j) {
        o.LJIIIZ(eventName, "eventName");
        return new C67602l2(eventName, map, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67602l2)) {
            return false;
        }
        C67602l2 c67602l2 = (C67602l2) obj;
        return o.LJ(this.LJLIL, c67602l2.LJLIL) && o.LJ(this.LJLILLLLZI, c67602l2.LJLILLLLZI) && this.LJLJI == c67602l2.LJLJI;
    }

    public int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        java.util.Map<String, String> map = this.LJLILLLLZI;
        return C16880lQ.LLJIJIL(this.LJLJI) + ((hashCode + (map == null ? 0 : map.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PendingEvent(eventName=");
        LIZ.append(this.LJLIL);
        LIZ.append(", params=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", timeStamp=");
        return C47135Ieh.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public final String getEventName() {
        return this.LJLIL;
    }

    public final java.util.Map<String, String> getParams() {
        return this.LJLILLLLZI;
    }

    public final long getTimeStamp() {
        return this.LJLJI;
    }

    public C67602l2(String eventName, java.util.Map<String, String> map, long j) {
        o.LJIIIZ(eventName, "eventName");
        this.LJLIL = eventName;
        this.LJLILLLLZI = map;
        this.LJLJI = j;
    }
}
