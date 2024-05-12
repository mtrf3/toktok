package ql1;

import X.AbstractC60811Ntn;
import X.InterfaceC60761Nsz;
import com.ss.android.ugc.aweme.topic.book.info.BookInfoPage;
import com.ss.android.ugc.aweme.topic.movie.info.MovieInfoPage;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDbS497S0100000_7 extends AbstractC60811Ntn {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz interfaceC60761Nsz) {
        switch (this.$t) {
            case 0:
                LJJJJJ$0(this, interfaceC60761Nsz);
                return;
            case 1:
                LJJJJJ$1(this, interfaceC60761Nsz);
                return;
            default:
                super.LJJJJJ(interfaceC60761Nsz);
                return;
        }
    }

    public IDbS497S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJJJJ$0(IDbS497S0100000_7 iDbS497S0100000_7, InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        ((BookInfoPage) iDbS497S0100000_7.l0).LJLJI = view;
    }

    public static final void LJJJJJ$1(IDbS497S0100000_7 iDbS497S0100000_7, InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        ((MovieInfoPage) iDbS497S0100000_7.l0).LJLJI = view;
    }
}
