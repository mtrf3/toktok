package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C189747cY;
import X.C44498HdG;
import X.C4LD;
import X.C62387Oe7;
import X.C62394OeE;
import X.C62561Ogv;
import X.C65352Pkq;
import X.C87O;
import X.InterfaceC74236TBo;
import X.TBV;
import android.app.Activity;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NowExternalContentSharePackage extends LinkDefaultSharePackage {
    public static final int $stable;
    public static final C62561Ogv Companion;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLIL;
    public final C87O activity$delegate;

    static {
        TBV tbv = new TBV(NowExternalContentSharePackage.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C65352Pkq.LIZ.getClass();
        LJLIL = new InterfaceC74236TBo[]{tbv};
        Companion = new C62561Ogv();
        $stable = 8;
    }

    public final C62387Oe7 LJIILL() {
        C62394OeE c62394OeE = new C62394OeE();
        c62394OeE.LJIIZILJ = this;
        if (IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIILLIIL()) {
            ShareDependService.LIZ.getClass();
            ImChannel LJJIJIIJI = C44498HdG.LIZ().LJJIJIIJI(this, "");
            if (LJJIJIIJI != null) {
                c62394OeE.LIZIZ(LJJIJIIJI);
            }
        }
        ShareService shareService = C4LD.LIZ;
        o.LJIIIIZZ(shareService, "shareService()");
        C189747cY.LIZ(shareService, c62394OeE, (Activity) this.activity$delegate.LIZ(LJLIL[0]), 8);
        c62394OeE.LJIJ = true;
        c62394OeE.LJIILIIL = R.string.r5i;
        c62394OeE.LJIILLIIL = R.string.cg_;
        c62394OeE.LJJIJ = false;
        return new C62387Oe7(c62394OeE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NowExternalContentSharePackage(android.app.Activity r18, X.C62409OeT r19) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.pkg.NowExternalContentSharePackage.<init>(android.app.Activity, X.OeT):void");
    }
}
