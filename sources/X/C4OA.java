package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4OA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4OA {
    public final SharePanelViewModel LIZ;
    public final C4OT LIZIZ;
    public final boolean LIZJ;
    public int LIZLLL;
    public IMContact LJ;

    public final void LIZ(IMContact iMContact) {
        Integer num;
        IMUser iMUser;
        C4OT c4ot;
        SharePackage sharePackage = this.LIZ.LJLIL;
        if (sharePackage != null && (c4ot = this.LIZIZ) != null && !c4ot.LJIIJ(sharePackage)) {
            C36922EeM.LJ("LongPressShare cancel share by callback");
            return;
        }
        SharePackage sharePackage2 = this.LIZ.LJLIL;
        if (sharePackage2 == null) {
            return;
        }
        List LJJIJIL = C47261Igj.LJJIJIL(iMContact);
        Bundle bundle = sharePackage2.extras;
        StringBuilder LIZ = X1D.LIZ();
        if ((iMContact instanceof IMUser) && (iMUser = (IMUser) iMContact) != null) {
            num = Integer.valueOf(iMUser.getFollowStatus());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append("");
        bundle.putString("relation_tag", X1D.LIZIZ(LIZ));
        bundle.putInt("rank_num", this.LIZLLL);
        C4KZ.LIZLLL(sharePackage2, iMContact, false, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
        sharePackage2.extras.remove("rank_num");
        C87277YNd.LJJIJL(sharePackage2, LJJIJIL);
        sharePackage2.extras.putInt("is_create_group_chat", 0);
        IMContact iMContact2 = this.LJ;
        if (iMContact2 instanceof IMUser) {
            sharePackage2.extras.putInt("friends_shared_cnt", 1);
        } else if (iMContact2 instanceof IMConversation) {
            sharePackage2.extras.putInt("friends_shared_cnt", ((IMConversation) iMContact2).getConversationMemberCount());
        }
        C101243yC.LIZ(this.LIZIZ, sharePackage2, "", LJJIJIL);
        if (!this.LIZJ) {
            return;
        }
        SharePanelViewModel sharePanelViewModel = this.LIZ;
        sharePanelViewModel.getClass();
        InterfaceC83893Qz interfaceC83893Qz = sharePanelViewModel.LJLILLLLZI;
        if (interfaceC83893Qz == null) {
            return;
        }
        interfaceC83893Qz.nG(iMContact);
    }

    public C4OA(SharePanelViewModel sharePanelViewModel, C4OT c4ot) {
        o.LJIIIZ(sharePanelViewModel, "sharePanelViewModel");
        this.LIZ = sharePanelViewModel;
        this.LIZIZ = c4ot;
        this.LIZJ = true;
        this.LIZLLL = -1;
    }
}
