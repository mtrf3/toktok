package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.ad.feed.dialog.FeedAdDislikeSubReasonDialog;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;

/* renamed from: X.Ng9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59965Ng9 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(InterfaceC59967NgB interfaceC59967NgB, InterfaceC65784Pro interfaceC65784Pro) {
        ActivityC45651qj activityC45651qj;
        Context LIZIZ = interfaceC59967NgB.LIZIZ();
        if (LIZIZ != null) {
            activityC45651qj = C45804HyK.LJJIFFI(LIZIZ);
        } else {
            activityC45651qj = null;
        }
        AdDislikeInfo LIZJ = interfaceC59967NgB.LIZJ();
        if (LIZJ != null && LIZJ.getEnable() == 1) {
            if (activityC45651qj != null) {
                C42998GuA c42998GuA = new C42998GuA(interfaceC59967NgB.getAid(), interfaceC59967NgB.LIZLLL(), interfaceC59967NgB.getRoomId(), interfaceC59967NgB.LJIJI(), interfaceC59967NgB.getLogExtra(), interfaceC59967NgB.LIZJ(), interfaceC59967NgB.LIZ());
                FeedAdDislikeSubReasonDialog feedAdDislikeSubReasonDialog = new FeedAdDislikeSubReasonDialog();
                Bundle bundle = new Bundle();
                bundle.putSerializable("subReason_depend", c42998GuA);
                feedAdDislikeSubReasonDialog.setArguments(bundle);
                feedAdDislikeSubReasonDialog.setCancelable(true);
                feedAdDislikeSubReasonDialog.show(activityC45651qj.getSupportFragmentManager(), "feed_ad_dislike_sub_reason_dialog");
                return;
            }
            return;
        }
        if (interfaceC65784Pro == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }
}
