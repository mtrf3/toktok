package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.filter.FilterBean;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class HDT implements InterfaceC82294WRm {
    public int LIZIZ() {
        return C60903NvH.LJIIJJI().LJJIL().getBackCameraFilter(-1);
    }

    public int LIZLLL() {
        return C60903NvH.LJIIJJI().LJJIL().getFrontCameraFilter(-1);
    }

    @Override // X.InterfaceC82294WRm
    public final int LIZ(int i) {
        int LIZLLL;
        if (i == 0) {
            LIZLLL = LIZIZ();
        } else {
            LIZLLL = LIZLLL();
        }
        if (LIZLLL != -1) {
            return LIZLLL;
        }
        return LIZJ(i, C60903NvH.LJIIJJI().LJIILL().LJI());
    }

    @Override // X.InterfaceC82294WRm
    public void setBackCameraFilter(int i) {
        C60903NvH.LJIIJJI().LJJIL().setBackCameraFilter(i);
    }

    @Override // X.InterfaceC82294WRm
    public void setFrontCameraFilter(int i) {
        C60903NvH.LJIIJJI().LJJIL().setFrontCameraFilter(i);
    }

    public int LIZJ(int i, InterfaceC82236WPg interfaceC82236WPg) {
        WPX LJJJJIZL;
        synchronized (C44172HVg.class) {
            LJJJJIZL = C60903NvH.LJIIJJI().LJIILL().LJI().LJJJJIZL();
        }
        FilterBean filterBean = null;
        FilterBean filterBean2 = null;
        int i2 = 0;
        for (Map.Entry entry : C82238WPi.LIZ((List) LJJJJIZL.LIZ().getValue()).entrySet()) {
            if (i2 == 0) {
                if (entry != null && entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                    filterBean2 = (FilterBean) ListProtector.get((List) entry.getValue(), 0);
                }
            } else {
                if (i2 != 1) {
                    break;
                }
                if (entry != null && entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                    filterBean = (FilterBean) ListProtector.get((List) entry.getValue(), 0);
                }
            }
            i2++;
        }
        if (filterBean != null && i == 0 && TMC.LJIILIIL(interfaceC82236WPg.LJJJJIZL(), filterBean.getId()) != null) {
            return filterBean.getId();
        }
        if (filterBean2 != null && i == 1 && TMC.LJIILIIL(interfaceC82236WPg.LJJJJIZL(), filterBean2.getId()) != null) {
            return filterBean2.getId();
        }
        return TMC.LJIILJJIL(interfaceC82236WPg.LJJJJIZL(), 0).getId();
    }

    @Override // X.InterfaceC82294WRm
    public final void setDefaultFilterForCamera(int i, int i2) {
        if (i == 0) {
            setBackCameraFilter(i2);
        } else {
            setFrontCameraFilter(i2);
        }
    }
}
