package X;

import Y.IDRunnableS0S1300000;
import android.os.Handler;
import com.bytedance.android.live.broadcast.game.partnership.widget.GamePartnershipAudiencePromoteGameCardWidget;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import com.bytedance.android.livesdk.game.model.UserInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1sq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46961sq extends AbstractC65781Prl implements InterfaceC88472Yns<C30605Bzl, C76800UCe> {
    public final /* synthetic */ GamePartnershipAudiencePromoteGameCardWidget LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46961sq(GamePartnershipAudiencePromoteGameCardWidget gamePartnershipAudiencePromoteGameCardWidget, String str, String str2) {
        super(1);
        this.LJLIL = gamePartnershipAudiencePromoteGameCardWidget;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C30605Bzl c30605Bzl) {
        BriefGameTask briefGameTask;
        PartnershipTask partnershipTask;
        String str;
        PartnershipTask partnershipTask2;
        String str2;
        C30605Bzl roomTask = c30605Bzl;
        o.LJIIIZ(roomTask, "roomTask");
        GamePartnershipAudiencePromoteGameCardWidget gamePartnershipAudiencePromoteGameCardWidget = this.LJLIL;
        gamePartnershipAudiencePromoteGameCardWidget.LJLJLLL = roomTask.LIZJ;
        gamePartnershipAudiencePromoteGameCardWidget.LJLLILLLL = roomTask.LJI;
        List<BriefGameTask> list = roomTask.LIZIZ;
        String str3 = this.LJLJI;
        Iterator<BriefGameTask> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                briefGameTask = it.next();
                PartnershipTask partnershipTask3 = briefGameTask.task;
                if (partnershipTask3 != null) {
                    str2 = partnershipTask3.idStr;
                } else {
                    str2 = null;
                }
                if (o.LJ(str2, str3)) {
                    break;
                }
            } else {
                briefGameTask = null;
                break;
            }
        }
        BriefGameTask briefGameTask2 = briefGameTask;
        C36271bb c36271bb = GamePartnershipAudiencePromoteGameCardWidget.LJLZ;
        long j = c36271bb.LJLIL;
        long j2 = roomTask.LJ;
        if (j < j2) {
            c36271bb.LJLIL = j2;
            if (briefGameTask2 == null || (partnershipTask2 = briefGameTask2.task) == null || (str = partnershipTask2.gameIdStr) == null) {
                str = "";
            }
            c36271bb.LJLILLLLZI = str;
        }
        boolean z = true;
        if (briefGameTask2 == null || (partnershipTask = briefGameTask2.task) == null || partnershipTask.anchorShowStatus != 0) {
            this.LJLIL.LJZL(false, null, "", null);
        } else {
            GamePartnershipAudiencePromoteGameCardWidget gamePartnershipAudiencePromoteGameCardWidget2 = this.LJLIL;
            UserInfo userInfo = roomTask.LIZLLL;
            if (userInfo == null) {
                userInfo = new UserInfo();
            }
            String str4 = this.LJLILLLLZI;
            if (gamePartnershipAudiencePromoteGameCardWidget2.LJZ() != null) {
                gamePartnershipAudiencePromoteGameCardWidget2.LJZL(false, null, "", null);
            } else {
                z = false;
            }
            Long l = briefGameTask2.task.showDuration;
            o.LJIIIIZZ(l, "showTask.task.showDuration");
            long j3 = 0;
            if (l.longValue() > 0) {
                Handler handler = gamePartnershipAudiencePromoteGameCardWidget2.LJLJJLL;
                IDRunnableS0S1300000 iDRunnableS0S1300000 = new IDRunnableS0S1300000(userInfo, gamePartnershipAudiencePromoteGameCardWidget2, str4, briefGameTask2, 5);
                if (z) {
                    j3 = 1000;
                }
                handler.postDelayed(iDRunnableS0S1300000, j3);
            }
        }
        return C76800UCe.LIZ;
    }
}
