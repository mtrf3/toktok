package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3Ze, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86023Ze extends F9E {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final long LJLJJL;
    public final OSZ<Integer, Integer> LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, Integer.valueOf(this.LJLJI), this.LJLJJI, Long.valueOf(this.LJLJJL), this.LJLJJLL};
    }

    public static C86023Ze L(C86023Ze c86023Ze, OSZ osz) {
        int i = c86023Ze.LJLIL;
        String businessID = c86023Ze.LJLILLLLZI;
        int i2 = c86023Ze.LJLJI;
        String searchContent = c86023Ze.LJLJJI;
        long j = c86023Ze.LJLJJL;
        o.LJIIIZ(businessID, "businessID");
        o.LJIIIZ(searchContent, "searchContent");
        return new C86023Ze(i, businessID, i2, searchContent, j, osz);
    }

    public C86023Ze(int i, String str, int i2, String str2, long j, OSZ<Integer, Integer> osz) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = i2;
        this.LJLJJI = str2;
        this.LJLJJL = j;
        this.LJLJJLL = osz;
    }
}
