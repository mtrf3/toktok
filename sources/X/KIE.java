package X;

import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;

/* loaded from: classes9.dex */
public final class KIE extends F9E implements KK7 {
    public final long LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL)};
    }

    @Override // X.KK7
    public final boolean isLog() {
        return true;
    }

    public KIE() {
        this(0L);
    }

    static {
        SearchServiceImpl.LLLZI().LLILLJJLI().FD().LIZIZ(C65352Pkq.LIZ(KIE.class), KIF.LJLIL);
    }

    public KIE(long j) {
        this.LJLIL = j;
    }
}
