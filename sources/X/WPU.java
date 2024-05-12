package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WPU implements InterfaceC41983Gdn {
    public final InterfaceC82236WPg LIZ;

    @Override // X.InterfaceC41983Gdn
    public final AbstractC73672Svk<C82237WPh> LIZIZ() {
        return this.LIZ.LIZJ(false);
    }

    @Override // X.InterfaceC41983Gdn
    public final List<FilterBean> LIZJ() {
        return TMC.LJIIZILJ(this.LIZ.LJJJJIZL());
    }

    @Override // X.InterfaceC41983Gdn
    public final void refreshData() {
        C82232WPc.LIZ(this.LIZ, false, 2);
    }

    public WPU(InterfaceC82236WPg filterRepository) {
        o.LJIIIZ(filterRepository, "filterRepository");
        this.LIZ = filterRepository;
    }

    @Override // X.InterfaceC41983Gdn
    public final String LIZ(int i) {
        return C82238WPi.LIZIZ(TMC.LJIILJJIL(this.LIZ.LJJJJIZL(), i));
    }

    @Override // X.InterfaceC41983Gdn
    public final String LIZLLL(int i) {
        return this.LIZ.LJIIJJI().LIZIZ(i);
    }

    @Override // X.InterfaceC41983Gdn
    public final FilterBean getFilter(int i) {
        return TMC.LJIILJJIL(this.LIZ.LJJJJIZL(), i);
    }

    @Override // X.InterfaceC41983Gdn
    public final String getFilterEnName(int i) {
        String enName;
        FilterBean LJIILJJIL = TMC.LJIILJJIL(this.LIZ.LJJJJIZL(), i);
        if (LJIILJJIL != null && (enName = LJIILJJIL.getEnName()) != null) {
            return enName;
        }
        return "";
    }
}
