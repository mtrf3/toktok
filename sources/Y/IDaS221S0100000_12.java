package Y;

import X.InterfaceC29937Boz;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchJediViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDaS221S0100000_12 implements InterfaceC29937Boz {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void run$2(IDaS221S0100000_12 iDaS221S0100000_12) {
        o.LJFF(((InterfaceC65784Pro) iDaS221S0100000_12.l0).invoke(), "invoke(...)");
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDaS221S0100000_12 iDaS221S0100000_12) {
        ((SearchJediViewModel) iDaS221S0100000_12.l0).LJLJJLL = null;
    }

    public static final void run$1(IDaS221S0100000_12 iDaS221S0100000_12) {
        ((SearchJediViewModel) iDaS221S0100000_12.l0).LJLJL = null;
    }

    public IDaS221S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
