package Y;

import X.A1P;
import X.AI1;
import X.AI2;
import X.AI8;
import X.C16880lQ;
import X.C188727au;
import X.C198517qh;
import X.C253179wf;
import X.C253199wh;
import X.C25890AEc;
import X.C25893AEf;
import X.C25895AEh;
import X.C26034AJq;
import X.C26073ALd;
import X.C26074ALe;
import X.C39398FdC;
import X.C63044Ooi;
import X.C68322mC;
import X.C73893SzJ;
import X.C73969T1h;
import X.C76800UCe;
import X.C85940Xo8;
import X.FMX;
import X.InterfaceC88472Yns;
import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel;
import com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter;
import com.ss.android.ugc.aweme.paidcontent.ui.SeriesListItemCell;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.SeriesItem;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.SeriesListViewModel;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushOffReason;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushOffReasonBottomSheetFragment;
import defpackage.q;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDCListenerS142S0200000_4 implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                return;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                return;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                return;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                return;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                return;
            case 5:
                onCheckedChanged$5(this, compoundButton, z);
                return;
            case 6:
                onCheckedChanged$6(this, compoundButton, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS142S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onCheckedChanged$0(IDCListenerS142S0200000_4 iDCListenerS142S0200000_4, CompoundButton compoundButton, boolean z) {
        InterfaceC88472Yns<? super C253179wf, C76800UCe> interfaceC88472Yns = ((C253199wh) iDCListenerS142S0200000_4.l0).LJLIL.LJLLLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke((C253179wf) iDCListenerS142S0200000_4.l1);
        }
        ((C253199wh) iDCListenerS142S0200000_4.l0).LJLIL.dismiss();
    }

    public static final void onCheckedChanged$1(IDCListenerS142S0200000_4 iDCListenerS142S0200000_4, CompoundButton compoundButton, boolean z) {
        LiveOuterService.LJJJLL().LJJIZ().LJJJZ().getClass();
        if (C26073ALd.LIZ()) {
            PushSettingFollowListAdapter.FollowItemViewSwitchHolder followItemViewSwitchHolder = (PushSettingFollowListAdapter.FollowItemViewSwitchHolder) iDCListenerS142S0200000_4.l0;
            followItemViewSwitchHolder.getClass();
            try {
                PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModel = (PushSettingNotificationChoiceViewModel) followItemViewSwitchHolder.LJLJJI.getValue();
                pushSettingNotificationChoiceViewModel.getClass();
                pushSettingNotificationChoiceViewModel.setState(new AqS9S0010000_4(z, 63));
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            PushSettingFollowListAdapter.FollowItemViewSwitchHolder followItemViewSwitchHolder2 = (PushSettingFollowListAdapter.FollowItemViewSwitchHolder) iDCListenerS142S0200000_4.l0;
            if (followItemViewSwitchHolder2.LJLJI == null) {
                C73893SzJ<AI8> c73893SzJ = new C73893SzJ<>();
                followItemViewSwitchHolder2.LJLJI = c73893SzJ;
                c73893SzJ.LJIIJJI(400L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS56S0100000_4(followItemViewSwitchHolder2, 33));
            }
            C73893SzJ<AI8> c73893SzJ2 = followItemViewSwitchHolder2.LJLJI;
            if (c73893SzJ2 != null) {
                c73893SzJ2.onNext(((PushSettingFollowListAdapter.FollowItemViewSwitchHolder) iDCListenerS142S0200000_4.l0).LJLILLLLZI);
            }
            C85940Xo8.LIZIZ.LIZ(z ? 1 : 0, "live_push");
            return;
        }
        ((AI2) iDCListenerS142S0200000_4.l1).LJIILIIL(!z);
        LiveOuterService.LJJJLL().LJJIZ().LJJJZ();
        C26074ALe.LIZIZ(((PushSettingFollowListAdapter.FollowItemViewSwitchHolder) iDCListenerS142S0200000_4.l0).LJLILLLLZI.getContext());
    }

    public static final void onCheckedChanged$2(IDCListenerS142S0200000_4 iDCListenerS142S0200000_4, CompoundButton compoundButton, boolean z) {
        LiveOuterService.LJJJLL().LJJIZ().LJJJZ().getClass();
        if (C26073ALd.LIZ()) {
            PushSettingFollowListAdapter.RewardItemViewSwitchHolder rewardItemViewSwitchHolder = (PushSettingFollowListAdapter.RewardItemViewSwitchHolder) iDCListenerS142S0200000_4.l0;
            if (rewardItemViewSwitchHolder.LJLJI == null) {
                C73893SzJ<AI8> c73893SzJ = new C73893SzJ<>();
                rewardItemViewSwitchHolder.LJLJI = c73893SzJ;
                c73893SzJ.LJIIJJI(400L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS56S0100000_4(rewardItemViewSwitchHolder, 34));
            }
            C73893SzJ<AI8> c73893SzJ2 = rewardItemViewSwitchHolder.LJLJI;
            if (c73893SzJ2 != null) {
                c73893SzJ2.onNext(((PushSettingFollowListAdapter.RewardItemViewSwitchHolder) iDCListenerS142S0200000_4.l0).LJLILLLLZI);
            }
            C85940Xo8.LIZIZ.LIZ(z ? 1 : 0, "live_reward_push");
            return;
        }
        ((AI2) iDCListenerS142S0200000_4.l1).LJIILIIL(!z);
        LiveOuterService.LJJJLL().LJJIZ().LJJJZ();
        C26074ALe.LIZIZ(((PushSettingFollowListAdapter.RewardItemViewSwitchHolder) iDCListenerS142S0200000_4.l0).LJLILLLLZI.getContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCheckedChanged$3(IDCListenerS142S0200000_4 iDCListenerS142S0200000_4, CompoundButton compoundButton, boolean z) {
        String str;
        String str2;
        if (z) {
            if (((SeriesListItemCell) iDCListenerS142S0200000_4.l0).getAbsoluteAdapterPosition() == 0 && (((str = ((SeriesItem) iDCListenerS142S0200000_4.l1).collectionName) == null || str.length() == 0) && ((str2 = ((SeriesListItemCell) iDCListenerS142S0200000_4.l0).M().gv0().LJLJI) == null || str2.length() == 0))) {
                C63044Ooi c63044Ooi = ((SeriesListItemCell) iDCListenerS142S0200000_4.l0).LJLJJI;
                if (c63044Ooi != null) {
                    c63044Ooi.setChecked(false);
                    ((SeriesListItemCell) iDCListenerS142S0200000_4.l0).L();
                    return;
                } else {
                    o.LJIJI("seriesSelectionRadio");
                    throw null;
                }
            }
            String enterFrom = ((A1P) ((SeriesListItemCell) iDCListenerS142S0200000_4.l0).M().getState()).LJLJJLL;
            String collectionId = ((SeriesItem) iDCListenerS142S0200000_4.l1).collectionId;
            int i = ((A1P) ((SeriesListItemCell) iDCListenerS142S0200000_4.l0).M().getState()).LJLJJL;
            String entryPoint = ((A1P) ((SeriesListItemCell) iDCListenerS142S0200000_4.l0).M().getState()).LJLJL;
            o.LJIIIZ(enterFrom, "enterFrom");
            o.LJIIIZ(collectionId, "collectionId");
            o.LJIIIZ(entryPoint, "entryPoint");
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", enterFrom);
            c188727au.LJIIIZ("collection_id", collectionId);
            c188727au.LIZLLL(i, "collection_cnt");
            c188727au.LJIIIZ("entry_point", entryPoint);
            FMX.LJIIL("click_series_selection_page", c188727au.LIZ);
            SeriesListViewModel M = ((SeriesListItemCell) iDCListenerS142S0200000_4.l0).M();
            SeriesItem item = (SeriesItem) iDCListenerS142S0200000_4.l1;
            M.getClass();
            o.LJIIIZ(item, "item");
            M.setState(new AqS170S0100000_4(item, 905));
            M.withState(new AqS170S0100000_4(M, 906));
        }
    }

    public static final void onCheckedChanged$4(IDCListenerS142S0200000_4 iDCListenerS142S0200000_4, CompoundButton compoundButton, boolean z) {
        o.LJIIIZ(compoundButton, "<anonymous parameter 0>");
        AqS135S0200000_4 aqS135S0200000_4 = ((C25890AEc) iDCListenerS142S0200000_4.l0).LJ;
        if (aqS135S0200000_4 != null) {
            aqS135S0200000_4.invoke(Boolean.valueOf(((AI1) iDCListenerS142S0200000_4.l1).LJIIL()));
        }
        if (((AI1) iDCListenerS142S0200000_4.l1).LJIIL()) {
            C39398FdC c39398FdC = C39398FdC.LIZ;
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("object_type", "video");
            C39398FdC.LIZIZ("choose_report_reason", q.LIZJ(c198517qh.LIZ, "reason_id", String.valueOf(((C25890AEc) iDCListenerS142S0200000_4.l0).LIZLLL), c198517qh, c39398FdC));
        }
    }

    public static final void onCheckedChanged$5(IDCListenerS142S0200000_4 iDCListenerS142S0200000_4, CompoundButton v, boolean z) {
        o.LJIIIZ(v, "v");
        PushOffReasonBottomSheetFragment pushOffReasonBottomSheetFragment = ((C26034AJq) iDCListenerS142S0200000_4.l0).LJLJI;
        if (pushOffReasonBottomSheetFragment != null) {
            pushOffReasonBottomSheetFragment.wl(((PushOffReason) iDCListenerS142S0200000_4.l1).category, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCheckedChanged$6(IDCListenerS142S0200000_4 iDCListenerS142S0200000_4, CompoundButton compoundButton, boolean z) {
        ((C25893AEf) iDCListenerS142S0200000_4.l0).LJLIL.gf(((C25895AEh) ((C68322mC) iDCListenerS142S0200000_4.l1).element).LJLIL, z);
    }
}
