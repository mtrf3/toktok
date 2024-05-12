package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0H1;
import X.C26045AKb;
import X.C56906MVa;
import X.C56910MVe;
import X.C56911MVf;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import X.ORY;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public class AqS115S0101000_9 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS115S0101000_9(C56910MVe c56910MVe, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c56910MVe;
        this.i1 = i;
    }

    public static final Object invoke$0(AqS115S0101000_9 aqS115S0101000_9, Object obj, Object obj2) {
        String aid = (String) obj;
        String cid = (String) obj2;
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(cid, "cid");
        C56911MVf c56911MVf = (C56911MVf) aqS115S0101000_9.l0;
        c56911MVf.markHasRead(c56911MVf.LJLLL);
        C56911MVf c56911MVf2 = (C56911MVf) aqS115S0101000_9.l0;
        AtMe atMe = c56911MVf2.LJZI;
        if (atMe != null) {
            int i = aqS115S0101000_9.i1;
            Bundle LIZ = C0H1.LIZ("comment_enter_method", "click_view_reply");
            if (atMe.getSubType() == 55 || atMe.getSubType() == 54) {
                if (atMe.getAweme() == null || atMe.getAweme().getAid() == null) {
                    View itemView = c56911MVf2.itemView;
                    o.LJIIIIZZ(itemView, "itemView");
                    C26045AKb c26045AKb = new C26045AKb(itemView);
                    c26045AKb.LJIIIIZZ(R.string.rrv);
                    c26045AKb.LJIIJ();
                } else {
                    c56911MVf2.openStory(aid, cid, atMe.getAweme().getAuthorUid(), Integer.valueOf(i), LIZ);
                }
            } else {
                C56906MVa.openAweme$default(c56911MVf2, aid, cid, Integer.valueOf(i), null, 0, LIZ, 24, null);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS115S0101000_9 aqS115S0101000_9, Object obj, Object obj2) {
        String aid = (String) obj;
        String cid = (String) obj2;
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(cid, "cid");
        C56910MVe c56910MVe = (C56910MVe) aqS115S0101000_9.l0;
        c56910MVe.markHasRead(c56910MVe.LJLLLL);
        C56910MVe c56910MVe2 = (C56910MVe) aqS115S0101000_9.l0;
        CommentNotice commentNotice = c56910MVe2.LJLLL;
        if (commentNotice != null) {
            int i = aqS115S0101000_9.i1;
            Bundle LIZ = C0H1.LIZ("comment_enter_method", "click_view_reply");
            if (ORY.LJJIJIIJIL(Integer.valueOf(commentNotice.getCommentType()), new Integer[]{23, 25, 27, 26})) {
                if (commentNotice.getAweme() == null || commentNotice.getAweme().getAid() == null) {
                    View itemView = c56910MVe2.itemView;
                    o.LJIIIIZZ(itemView, "itemView");
                    C26045AKb c26045AKb = new C26045AKb(itemView);
                    c26045AKb.LJIIIIZZ(R.string.rrv);
                    c26045AKb.LJIIJ();
                } else {
                    c56910MVe2.openStory(aid, cid, commentNotice.getAweme().getAuthorUid(), Integer.valueOf(i), LIZ);
                }
            } else {
                C56906MVa.openAweme$default(c56910MVe2, aid, cid, Integer.valueOf(i), null, 0, LIZ, 24, null);
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS115S0101000_9(C56911MVf c56911MVf, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c56911MVf;
        this.i1 = i;
    }
}
