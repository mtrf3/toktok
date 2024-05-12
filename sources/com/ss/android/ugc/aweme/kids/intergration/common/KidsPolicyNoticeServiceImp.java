package com.ss.android.ugc.aweme.kids.intergration.common;

import X.C221108m2;
import X.C39334FcA;
import X.C39338FcE;
import X.C39346FcM;
import X.C62822Ol8;
import X.EF7;
import X.EnumC39255Fat;
import com.ss.android.ugc.aweme.kids.api.common.IKidsPolicyNoticeService;
import com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService;
import com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService2;
import defpackage.e1;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class KidsPolicyNoticeServiceImp implements IKidsPolicyNoticeService {
    public static final /* synthetic */ int LIZLLL = 0;
    public final C39346FcM LIZ = new C39346FcM(this);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 45));
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C39334FcA.LJLIL);

    @Override // com.ss.android.ugc.aweme.kids.api.common.IKidsPolicyNoticeService
    public final void LIZ() {
        if (e1.LIZ(31744, "popupsdk_multi_enabled", true, false)) {
            UniversalPopupService2 universalPopupService2 = (UniversalPopupService2) this.LIZJ.getValue();
            o.LJIIIIZZ(universalPopupService2, "universalPopupService2");
            C39338FcE.LIZ(universalPopupService2, EnumC39255Fat.SCENE_COLD_LAUNCH.getValue(), EF7.LIZIZ(), this.LIZ, 24);
        } else {
            UniversalPopupService universalPopupService = (UniversalPopupService) this.LIZIZ.getValue();
            o.LJIIIIZZ(universalPopupService, "universalPopupService");
            universalPopupService.LIZLLL(EnumC39255Fat.SCENE_COLD_LAUNCH.getValue(), EF7.LIZIZ(), null);
        }
    }
}
