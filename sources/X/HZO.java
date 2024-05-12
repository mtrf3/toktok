package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HZO implements InterfaceC122704ri {
    public final /* synthetic */ C46001I3p LIZ;

    public HZO(C46001I3p c46001I3p) {
        this.LIZ = c46001I3p;
    }

    @Override // X.InterfaceC122704ri
    public final float LIZ(FilterBean filterBean) {
        o.LJIIIZ(filterBean, "filterBean");
        C45850Hz4 c45850Hz4 = this.LIZ.LJLJLJ;
        if (c45850Hz4 != null) {
            C83576Wr6 c83576Wr6 = c45850Hz4.LJIIIZ;
            if (c83576Wr6 != null) {
                return c83576Wr6.LIZ.getFilterIntensity(filterBean.getFilterFolder());
            }
            o.LJIJI("videoRecorder");
            throw null;
        }
        o.LJIJI("tabEnv");
        throw null;
    }
}
