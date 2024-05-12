package com.ss.android.ugc.aweme.crossplatform.business;

import X.C226238uJ;
import X.C44498HdG;
import X.C45804HyK;
import X.C4LD;
import X.C52230Keg;
import X.C59484NWe;
import X.C61726OKk;
import X.C62387Oe7;
import X.C62394OeE;
import X.C84763XOl;
import X.OQ2;
import X.OQ4;
import X.OQ5;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LandingShareBusiness extends AbsShareBusiness {
    @Override // com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness
    public final void LIZJ() {
        if (!(this.LIZJ instanceof Activity) || this.LIZLLL == null) {
            return;
        }
        C62394OeE c62394OeE = new C62394OeE();
        ShareDependService.LIZ.getClass();
        ShareDependService LIZ = C44498HdG.LIZ();
        WebSharePackage webSharePackage = this.LIZLLL;
        o.LJI(webSharePackage);
        ImChannel LJJIJIIJI = LIZ.LJJIJIIJI(webSharePackage, "");
        if (LJJIJIIJI != null) {
            c62394OeE.LIZIZ(LJJIJIIJI);
        }
        ShareService shareService = C4LD.LIZ;
        Context context = this.LIZJ;
        o.LJIIIIZZ(context, "context");
        shareService.LJJJJ(c62394OeE, C45804HyK.LJIJJ(context), true);
        WebSharePackage webSharePackage2 = this.LIZLLL;
        o.LJI(webSharePackage2);
        c62394OeE.LJIIZILJ = webSharePackage2;
        c62394OeE.LJIJ = true;
        c62394OeE.LJJI = new OQ2(this);
        c62394OeE.LJFF = true;
        WebSharePackage webSharePackage3 = this.LIZLLL;
        o.LJI(webSharePackage3);
        webSharePackage3.extras.putString("aweme_id", this.LIZIZ.LIZ.LJIIIZ);
        WebSharePackage webSharePackage4 = this.LIZLLL;
        o.LJI(webSharePackage4);
        webSharePackage4.extras.putString("current_url", this.LIZIZ.LIZIZ.LJJJLZIJ);
        WebSharePackage webSharePackage5 = this.LIZLLL;
        o.LJI(webSharePackage5);
        webSharePackage5.extras.putInt("first_page", this.LIZIZ.LIZIZ.LJJJZ);
        if (this.LIZIZ.LIZJ.LIZLLL) {
            c62394OeE.LIZJ(new C226238uJ());
        }
        if (((ArrayList) this.LJ).contains("refresh") && C52230Keg.LIZ()) {
            c62394OeE.LIZJ(new C61726OKk(this.LIZ, null, null, 6));
        }
        if (((ArrayList) this.LJ).contains("browser")) {
            c62394OeE.LIZJ(new OQ5());
        }
        if (((ArrayList) this.LJ).contains("copylink")) {
            c62394OeE.LIZJ(new OQ4());
        }
        c62394OeE.LJI = true;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            C44498HdG.LIZ().LJJIIJ(LJIIIIZZ, new C62387Oe7(c62394OeE), null, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandingShareBusiness(C59484NWe crossPlatformBusiness) {
        super(crossPlatformBusiness);
        o.LJIIIZ(crossPlatformBusiness, "crossPlatformBusiness");
    }
}
