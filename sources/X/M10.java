package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM;

/* loaded from: classes10.dex */
public final class M10 implements InterfaceC56130M1e {
    public final /* synthetic */ CustomDotAssem LIZ;

    @Override // X.InterfaceC56130M1e
    public final void LIZ() {
        CustomDotVM v3 = this.LIZ.v3();
        v3.getClass();
        C36264ELc.LIZ("=========tooltip task run");
        XKS xks = v3.LLF;
        if (xks != null) {
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            xks.resumeWith(c76800UCe);
        }
    }

    public M10(CustomDotAssem customDotAssem) {
        this.LIZ = customDotAssem;
    }
}
