package X;

import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS177S0200000_15;

/* renamed from: X.XfS, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85402XfS implements InterfaceC54674Ld0 {
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LIZ;
    public final /* synthetic */ ILocationBaseServiceForMT LIZIZ;
    public final /* synthetic */ ActivityC45651qj LIZJ;
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, Boolean, C76800UCe> LIZLLL;
    public final /* synthetic */ InterfaceC88471Ynr<Integer, String, C76800UCe> LJ;

    @Override // X.InterfaceC54674Ld0
    public final void LIZ() {
        boolean isSystemPrecise = this.LIZIZ.isSystemPrecise(this.LIZJ);
        boolean isInAppPrecise = this.LIZIZ.isInAppPrecise();
        InterfaceC88471Ynr<Boolean, Boolean, C76800UCe> interfaceC88471Ynr = this.LIZLLL;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(Boolean.valueOf(isSystemPrecise), Boolean.valueOf(isInAppPrecise));
        }
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZJ(int i) {
        InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns = this.LIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(i));
        }
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZIZ(int i, String str) {
        InterfaceC88471Ynr<Integer, String, C76800UCe> interfaceC88471Ynr = this.LJ;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(Integer.valueOf(i), str);
        }
    }

    public C85402XfS(AqS146S0200000_15 aqS146S0200000_15, ILocationBaseServiceForMT iLocationBaseServiceForMT, ActivityC45651qj activityC45651qj, AqS177S0200000_15 aqS177S0200000_15, AqS177S0200000_15 aqS177S0200000_152) {
        this.LIZ = aqS146S0200000_15;
        this.LIZIZ = iLocationBaseServiceForMT;
        this.LIZJ = activityC45651qj;
        this.LIZLLL = aqS177S0200000_15;
        this.LJ = aqS177S0200000_152;
    }
}
