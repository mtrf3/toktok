package X;

import com.ss.android.ugc.aweme.profile.model.SocialPlatformTokenStatus;

/* renamed from: X.USb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77213USb extends UTI {
    @Override // X.UTD
    public final Object LIZ(C77211URz c77211URz, InterfaceC67352kd<? super C77216USe> interfaceC67352kd) {
        boolean z;
        C77216USe c77216USe;
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        C77135UPb c77135UPb = C77135UPb.LIZ;
        Integer LIZLLL = c77135UPb.LIZLLL();
        int value = SocialPlatformTokenStatus.STATUS_VALID.getValue();
        boolean z2 = true;
        if (LIZLLL == null || LIZLLL.intValue() != value) {
            z = false;
        } else {
            z = true;
        }
        boolean LIZIZ = c77135UPb.LIZIZ();
        if (c77211URz.LJLIL.LIZLLL.LIZIZ) {
            if (!isLogin || (z && LIZIZ)) {
                z2 = false;
            }
            c77216USe = new C77216USe(new C77217USf(z, LIZIZ, z2), UQ0.CHECK);
        } else {
            if (!isLogin || !LIZIZ) {
                z2 = false;
            }
            c77216USe = new C77216USe(new C77217USf(z, LIZIZ, z2), UQ0.CHECK);
        }
        return c77216USe;
    }
}
