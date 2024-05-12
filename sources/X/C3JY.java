package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3JY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3JY extends F9E {
    public final C81983Jq LJLIL;
    public volatile int LJLILLLLZI;
    public volatile int LJLJI;
    public volatile long LJLJJI;
    public volatile int LJLJJL;
    public volatile int LJLJJLL;
    public volatile int LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Long.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL), Integer.valueOf(this.LJLJL)};
    }

    public final void M() {
        if (this.LJLJJI > 0) {
            C81983Jq page = this.LJLIL;
            int i = this.LJLILLLLZI;
            int i2 = this.LJLJI;
            long j = this.LJLJJI;
            int i3 = this.LJLJJL;
            int i4 = this.LJLJJLL;
            int i5 = this.LJLJL;
            o.LJIIIZ(page, "page");
            C3JY c3jy = new C3JY(page, i, i2, j, i3, i4, i5);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c3jy.LJLIL.LIZIZ);
            LIZ.append('_');
            LIZ.append(c3jy.LJLIL.LIZJ);
            String LIZIZ = X1D.LIZIZ(LIZ);
            HashMap<String, C3JY> hashMap = C3K5.LJLL;
            synchronized (hashMap) {
                if (!hashMap.containsKey(LIZIZ)) {
                    hashMap.put(LIZIZ, c3jy);
                }
            }
        }
        this.LJLJJLL = -1;
        this.LJLJL = -1;
        this.LJLJJL = -1;
        this.LJLILLLLZI = 0;
        this.LJLJI = 0;
        this.LJLJJI = 0L;
    }

    public /* synthetic */ C3JY(C81983Jq c81983Jq) {
        this(c81983Jq, 0, 0, 0L, -1, -1, -1);
    }

    public final int L(EnumC82403Lg filter) {
        o.LJIIIZ(filter, "filter");
        if (filter == EnumC82403Lg.ALL || !C3KQ.LIZ().useLargerPageSize) {
            return C3JT.LIZ.paginationCount;
        }
        int i = this.LJLJI;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return -1;
                }
                return 5000;
            }
            return 1000;
        }
        return 100;
    }

    public final void N(int i, long j) {
        this.LJLILLLLZI += i;
        this.LJLJI++;
        if (this.LJLJJI > 0) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.LJLJJI);
            if (i > 0 && this.LJLJJL < 0) {
                this.LJLJJL = currentTimeMillis;
            }
            this.LJLJJLL += currentTimeMillis;
            this.LJLJL += (int) j;
            this.LJLJJI = System.currentTimeMillis();
        }
    }

    public C3JY(C81983Jq page, int i, int i2, long j, int i3, int i4, int i5) {
        o.LJIIIZ(page, "page");
        this.LJLIL = page;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = j;
        this.LJLJJL = i3;
        this.LJLJJLL = i4;
        this.LJLJL = i5;
    }
}
