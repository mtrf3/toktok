package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Io1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47713Io1 {
    public String LIZ;
    public long LIZIZ;
    public long LIZJ;
    public List<C47732IoK> LIZLLL;
    public C47789IpF LJ;

    public final boolean LIZ() {
        long j;
        C47732IoK c47732IoK;
        long j2 = this.LIZJ;
        if (j2 > 0) {
            j = Math.min(j2, this.LIZIZ);
        } else {
            j = this.LIZIZ;
        }
        List<C47732IoK> list = this.LIZLLL;
        if (list != null) {
            c47732IoK = (C47732IoK) U26.LIZIZ((ArrayList) list, 1, list);
        } else {
            c47732IoK = null;
        }
        if (this.LJ != null) {
            return true;
        }
        if (c47732IoK != null && this.LIZIZ > 0 && c47732IoK.LIZ + 0 >= j) {
            return true;
        }
        return false;
    }

    public final long LIZIZ() {
        List<C47732IoK> list = this.LIZLLL;
        if (list != null && ((ArrayList) list).size() > 0) {
            return ((C47732IoK) ListProtector.get(this.LIZLLL, ((ArrayList) r1).size() - 1)).LIZ;
        }
        return 0L;
    }
}
