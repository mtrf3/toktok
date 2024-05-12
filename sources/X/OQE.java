package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.services.badge.IBadgeService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OQE implements IBadgeService {
    @Override // com.ss.android.ugc.aweme.services.badge.IBadgeService
    public final void showBadgeShareDialog(Activity activity, Aweme aweme) {
        ImChannel LJJIJIIJI;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(aweme, "aweme");
        AwemeSharePackage sharePackage = ShareServiceImpl.LJJJLZIJ().LJJIJIIJI(-1, activity, aweme, "", "", "share_panel");
        C62394OeE c62394OeE = new C62394OeE();
        ShareDependService.LIZ.getClass();
        boolean LJII = C44498HdG.LIZ().LJII();
        if (IMService.createIIMServicebyMonsterPlugin(false) != null && !LJII && (LJJIJIIJI = C44498HdG.LIZ().LJJIJIIJI(sharePackage, "others_homepage")) != null) {
            c62394OeE.LIZIZ(LJJIJIIJI);
        }
        C4LD.LIZ.LJJJJ(c62394OeE, activity, false);
        c62394OeE.LIZIZ(new CopyLinkChannel(false));
        c62394OeE.LJIJ = false;
        o.LJIIIZ(sharePackage, "sharePackage");
        c62394OeE.LJIIZILJ = sharePackage;
        c62394OeE.LJJ = new OQF();
        OVZ ovz = new OVZ(activity, new C62387Oe7(c62394OeE), aweme.getVideo().getCover());
        try {
            if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/badge/BadgeShareDialog", "show", ovz, new Object[0], "void", new C65300Pk0(false, "()V", "-5269147992682231337")).LIZ) {
                ovz.show();
            }
        } catch (Exception e) {
            H78.LIZLLL("BadgeShareDialog", e);
        }
    }
}
