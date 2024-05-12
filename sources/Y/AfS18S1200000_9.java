package Y;

import X.C221018lt;
import X.C55773Luj;
import X.C57742MlO;
import X.C57749MlV;
import X.C58049MqL;
import X.C86V;
import X.InterfaceC55031Lil;
import X.InterfaceC64592gB;
import X.X1D;
import com.ss.android.ugc.aweme.feed.helper.RecFeedShareComponentController;
import com.ss.android.ugc.aweme.feed.model.ExposeSharerData;
import com.ss.android.ugc.aweme.feed.model.ShareUrlExtra;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public class AfS18S1200000_9 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS18S1200000_9 afS18S1200000_9, Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        if (((C58049MqL) afS18S1200000_9.l1).LJLLLLLL != null && (!r0.isDisposed())) {
            ((C58049MqL) afS18S1200000_9.l1).setText(C86V.LJFF(R.string.pm6));
        }
        ((C58049MqL) afS18S1200000_9.l1).LLI = th.toString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("exception(");
        LIZ.append(th);
        LIZ.append(") [");
        LIZ.append(afS18S1200000_9.s0);
        LIZ.append("] [");
        C57742MlO c57742MlO = ((C57749MlV) afS18S1200000_9.l2).LIZ;
        if (c57742MlO != null) {
            str = c57742MlO.LJLIL;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append("] [");
        LIZ.append(((C58049MqL) afS18S1200000_9.l1).hashCode());
        LIZ.append(']');
        C221018lt.LIZIZ("RelationLabel[V]", X1D.LIZIZ(LIZ));
    }

    public static final void accept$1(AfS18S1200000_9 afS18S1200000_9, Object obj) {
        ExposeSharerData exposeSharerData = (ExposeSharerData) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get sharer: ");
        LIZ.append(exposeSharerData);
        C221018lt.LIZ("@LinkRelation_OldLogic", X1D.LIZIZ(LIZ));
        if (exposeSharerData.status_code != 0) {
            return;
        }
        ShareUrlExtra shareUrlExtra = exposeSharerData.shareExtra;
        if (shareUrlExtra == null) {
            String str = afS18S1200000_9.s0;
            C55773Luj c55773Luj = (C55773Luj) afS18S1200000_9.l1;
            shareUrlExtra = new ShareUrlExtra(str, c55773Luj.LIZLLL, c55773Luj.LJ);
        }
        RecFeedShareComponentController recFeedShareComponentController = (RecFeedShareComponentController) afS18S1200000_9.l2;
        recFeedShareComponentController.LJLJJLL = shareUrlExtra.itemId;
        recFeedShareComponentController.LJLJI = exposeSharerData;
        InterfaceC55031Lil interfaceC55031Lil = recFeedShareComponentController.LJLJL;
        if (interfaceC55031Lil == null || recFeedShareComponentController.LJLJJL || exposeSharerData.sharer == null) {
            return;
        }
        interfaceC55031Lil.LIZ();
    }

    public AfS18S1200000_9(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
