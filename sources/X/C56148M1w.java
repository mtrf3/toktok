package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.M1w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56148M1w implements InterfaceC53896LDg {
    public final /* synthetic */ EcVideoGuideAssem LJLIL;

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    public C56148M1w(EcVideoGuideAssem ecVideoGuideAssem) {
        this.LJLIL = ecVideoGuideAssem;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        EcVideoGuideAssem ecVideoGuideAssem = this.LJLIL;
        if (ecVideoGuideAssem.LLIIIJ) {
            ecVideoGuideAssem.A4(true);
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        EcVideoGuideAssem ecVideoGuideAssem = this.LJLIL;
        if (ecVideoGuideAssem.LLIIIJ) {
            ecVideoGuideAssem.A4(false);
            EcVideoGuideAssem ecVideoGuideAssem2 = this.LJLIL;
            ecVideoGuideAssem2.q4(EnumC56033Lyv.TO_FYP_PROFILE, ecVideoGuideAssem2.LLIIIZ);
        }
    }
}
