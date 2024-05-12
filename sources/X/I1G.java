package X;

import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS49S1200000_7;

/* loaded from: classes8.dex */
public final class I1G implements InterfaceC84907XTz {
    public final /* synthetic */ I15 LIZ;
    public final /* synthetic */ InterfaceC88472Yns<AVMusic, C76800UCe> LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;

    @Override // X.InterfaceC84907XTz
    public final void LIZ(Exception exc) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.InterfaceC84907XTz
    public final void LIZIZ(AVMusic aVMusic) {
        if (aVMusic != null) {
            if ((!AVCommerceServiceImpl.LJIIJ().LIZ() || aVMusic.isCommerceMusic()) && C44172HVg.LJI.LJIJJ(aVMusic, this.LIZ.LIZLLL)) {
                this.LIZIZ.invoke(aVMusic);
                return;
            }
            return;
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZJ;
        if (interfaceC65784Pro == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public I1G(I15 i15, AqS49S1200000_7 aqS49S1200000_7, AqS154S0200000_7 aqS154S0200000_7) {
        this.LIZ = i15;
        this.LIZIZ = aqS49S1200000_7;
        this.LIZJ = aqS154S0200000_7;
    }
}
