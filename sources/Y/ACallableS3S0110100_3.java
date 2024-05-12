package Y;

import X.C219778jt;
import X.C219908k6;
import X.C55480Lq0;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursDetailResp;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursPagination;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public class ACallableS3S0110100_3 implements Callable {
    public final int $t;
    public long j2;
    public Object l0;
    public boolean z1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS3S0110100_3 aCallableS3S0110100_3) {
        int i;
        long j;
        long j2 = aCallableS3S0110100_3.j2;
        boolean z = aCallableS3S0110100_3.z1;
        Integer num = ((C219778jt) aCallableS3S0110100_3.l0).LJLJL.loadType;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1;
        }
        Long l = ((C219778jt) aCallableS3S0110100_3.l0).LJLJL.cursor;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        C219778jt c219778jt = (C219778jt) aCallableS3S0110100_3.l0;
        return C219908k6.LIZJ(i, c219778jt.LJLILLLLZI, j2, j, z, c219778jt.LJLIL).execute().LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$1(ACallableS3S0110100_3 aCallableS3S0110100_3) {
        C55480Lq0 c55480Lq0 = C55480Lq0.LIZIZ;
        c55480Lq0.LIZJ(249372161, "is_request_network", Boolean.TRUE);
        c55480Lq0.LIZJ(249372161, "is_use_cache", Boolean.FALSE);
        long j = aCallableS3S0110100_3.j2;
        boolean z = aCallableS3S0110100_3.z1;
        C219778jt c219778jt = (C219778jt) aCallableS3S0110100_3.l0;
        T t = C219908k6.LIZJ(1, c219778jt.LJLILLLLZI, j, 0L, z, c219778jt.LJLIL).execute().LIZIZ;
        C219778jt c219778jt2 = (C219778jt) aCallableS3S0110100_3.l0;
        AddYoursPagination addYoursPagination = ((AddYoursDetailResp) t).pagination;
        if (addYoursPagination != null) {
            c219778jt2.LJLJL = addYoursPagination;
        }
        return t;
    }

    public ACallableS3S0110100_3(long j, boolean z, C219778jt c219778jt, int i) {
        this.$t = i;
        this.j2 = j;
        this.z1 = z;
        this.l0 = c219778jt;
    }
}
