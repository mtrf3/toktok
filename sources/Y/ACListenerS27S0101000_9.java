package Y;

import X.C1B3;
import X.C56743MOt;
import X.C56818MRq;
import X.C73318Sq2;
import X.C73969T1h;
import X.C78999UzT;
import X.EnumC56033Lyv;
import X.MDK;
import X.MUZ;
import X.T16;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxFollowerAdapter;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;

/* loaded from: classes10.dex */
public class ACListenerS27S0101000_9 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS27S0101000_9 aCListenerS27S0101000_9, View view) {
        ((EcVideoGuideAssem) aCListenerS27S0101000_9.l0).q4(EnumC56033Lyv.CLICK_SHADOW, aCListenerS27S0101000_9.i1);
    }

    public static final void onClick$1(ACListenerS27S0101000_9 aCListenerS27S0101000_9, View view) {
        ((InboxFollowerAdapter) aCListenerS27S0101000_9.l0).onDeleteItem(aCListenerS27S0101000_9.i1);
        ((InboxFollowerAdapter) aCListenerS27S0101000_9.l0).dismissDeleteActionSheet();
    }

    public static final void onClick$2(ACListenerS27S0101000_9 aCListenerS27S0101000_9, View view) {
        ((MUZ) aCListenerS27S0101000_9.l0).LJLIL.LIZLLL(aCListenerS27S0101000_9.i1);
        FragmentManager fragmentManager = ((MUZ) aCListenerS27S0101000_9.l0).LIZIZ().getFragmentManager();
        if (fragmentManager != null) {
            C1B3 c1b3 = new C1B3(fragmentManager);
            Fragment LJJJIL = fragmentManager.LJJJIL("DELETE_NOTICE_ACTION_SHEET_TAG");
            if (LJJJIL != null) {
                c1b3.LJJI(LJJJIL);
                c1b3.LJI();
            }
        }
    }

    public static final void onClick$3(ACListenerS27S0101000_9 aCListenerS27S0101000_9, View view) {
        ((C56743MOt) aCListenerS27S0101000_9.l0).onDeleteItem(aCListenerS27S0101000_9.i1);
        FragmentManager fragmentManager = ((C56743MOt) aCListenerS27S0101000_9.l0).LJLIL.getFragmentManager();
        if (fragmentManager != null) {
            C1B3 c1b3 = new C1B3(fragmentManager);
            Fragment LJJJIL = fragmentManager.LJJJIL("DELETE_NOTICE_ACTION_SHEET_TAG");
            if (LJJJIL != null) {
                c1b3.LJJI(LJJJIL);
                c1b3.LJI();
            }
        }
    }

    public static final void onClick$4(ACListenerS27S0101000_9 aCListenerS27S0101000_9, View view) {
        MusNotice musNotice;
        C56818MRq c56818MRq = (C56818MRq) aCListenerS27S0101000_9.l0;
        int i = aCListenerS27S0101000_9.i1;
        Context context = c56818MRq.LJLIL.getContext();
        if (context != null && (musNotice = c56818MRq.LJLJJL) != null) {
            C78999UzT.LJFF(NotificationApi.LIZ().deleteNotice(musNotice.nid).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new MDK(i, musNotice, c56818MRq), new AfS48S0300000_9(musNotice, c56818MRq, context, 1)), (C73318Sq2) c56818MRq.LJLJJI.getValue());
        }
        FragmentManager fragmentManager = ((C56818MRq) aCListenerS27S0101000_9.l0).LJLIL.getFragmentManager();
        if (fragmentManager != null) {
            C1B3 c1b3 = new C1B3(fragmentManager);
            Fragment LJJJIL = fragmentManager.LJJJIL("NoticeCardAdapter");
            if (LJJJIL != null) {
                c1b3.LJJI(LJJJIL);
                c1b3.LJI();
            }
        }
        ((C56818MRq) aCListenerS27S0101000_9.l0).LJLZ("delete");
    }

    public ACListenerS27S0101000_9(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
