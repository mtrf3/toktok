package com.ss.android.ugc.aweme.homeobserver;

import X.C16880lQ;
import X.C221018lt;
import X.C221108m2;
import X.C2U8;
import X.C38816FLg;
import X.C38987FRv;
import X.C3ST;
import X.C40406FtS;
import X.C40407FtT;
import X.C47261Igj;
import X.C54362LVe;
import X.C55096Ljo;
import X.C56662Kg;
import X.C62822Ol8;
import X.ENR;
import X.HG3;
import X.L0W;
import X.LVW;
import X.RBX;
import Y.ARunnableS10S0201000_7;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.ss.android.ugc.aweme.main.IPerformanceAbility;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SocialActivityAssem extends BaseMainContainerAssem {
    public boolean LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 255));

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onCreate(Bundle bundle) {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(SocialActivityAssem.class), "onCreate_with_bundle"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        Activity activity = (Activity) this.LJLILLLLZI.getValue();
        if (activity != null) {
            this.LJLIL = activity.getIntent().getBooleanExtra("restart_from_logout", false);
            if (L0W.LIZ()) {
                if (!ENR.LIZ()) {
                    C54362LVe.LJIIL().LJIILLIIL();
                }
                if (HG3.LJIIIIZZ().isEnableMultiAccountLogin()) {
                    List<String> allUidList = ((RBX) HG3.LJIILL()).allUidList();
                    o.LJIIIIZZ(allUidList, "get().allUidList()");
                    C54362LVe.LJIJ("cold_start", allUidList);
                } else {
                    C54362LVe.LJIJ("cold_start", C47261Igj.LJJIJ(((RBX) HG3.LJIILL()).getCurUserId()));
                }
            }
            ((IPerformanceAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), IPerformanceAbility.class)).uf(new AqS159S0100000_9(this, 256));
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onNewIntent(Intent intent) {
        o.LJIIIZ(intent, "intent");
        C2U8.LIZ(new C3ST(intent));
    }

    public final void v3(Activity activity) {
        C221018lt.LIZ("PushPermissionPopup", "SocialActivityAssem.checkNotificationAndMore()");
        C38816FLg.LJ(new ARunnableS10S0201000_7(1, activity, new LVW(this, activity), 2));
    }

    public final void x3(Activity activity) {
        C221018lt.LIZ("PushPermissionPopup", "SocialActivityAssem.tryChooseLanguage()");
        C40407FtT c40407FtT = C40406FtS.LIZ;
        c40407FtT.LJ = true;
        c40407FtT.LIZ(activity);
        if (!C38987FRv.LIZLLL().booleanValue() && !this.LJLIL) {
            ContentLanguageServiceImpl.LJIIJJI().LJIIIIZZ(activity);
        }
    }
}
