package Y;

import X.ActivityC45651qj;
import X.AnonymousClass839;
import X.C116144h8;
import X.C116194hD;
import X.C34B;
import X.C3L4;
import X.C3MD;
import X.C3ML;
import X.C3OH;
import X.C3SX;
import X.C47261Igj;
import X.C4N7;
import X.C4N8;
import X.C4N9;
import X.C4NG;
import X.C54838Lfe;
import X.C65777Prh;
import X.C72808Sho;
import X.C73893SzJ;
import X.C79603Am;
import X.InterfaceC116134h7;
import X.InterfaceC57784Mm4;
import X.InterfaceC88471Ynr;
import X.MKT;
import X.ORZ;
import X.OUP;
import X.X1D;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.FocusedSessionListWidget;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS14S0010000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class AObserverS62S0300000_1 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS62S0300000_1 aObserverS62S0300000_1, Object obj) {
        ConcurrentHashMap<String, ActivityStatus> concurrentHashMap = ((FocusedSessionListWidget) aObserverS62S0300000_1.l0).LJZ;
        String LJFF = ((C3L4) aObserverS62S0300000_1.l1).LJFF();
        o.LJIIIIZZ(LJFF, "session.sessionID");
        concurrentHashMap.put(LJFF, obj);
        FocusedSessionListWidget focusedSessionListWidget = (FocusedSessionListWidget) aObserverS62S0300000_1.l0;
        C3OH c3oh = (C3OH) aObserverS62S0300000_1.l2;
        focusedSessionListWidget.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notifyActivityStatusUpdate: ");
        LIZ.append(c3oh);
        C34B.LIZIZ("FocusedSessionListWidget", X1D.LIZIZ(LIZ));
        List<C3L4> LLJILJILJ = ORZ.LLJILJILJ(c3oh.LIZ);
        if (focusedSessionListWidget.LJLLL) {
            if ((C3SX.LIZ() & 4) != 0) {
                ((C73893SzJ) focusedSessionListWidget.LLIIIILZ.getValue()).onNext(new C3OH(c3oh.LIZIZ, c3oh.LIZJ, c3oh.LIZLLL, c3oh.LJ, LLJILJILJ));
                return;
            } else {
                focusedSessionListWidget.LJIIZILJ(LLJILJILJ);
                focusedSessionListWidget.LLIIII.onNext(new C3MD((List<C3ML>) FocusedSessionListWidget.LJIILLIIL(LLJILJILJ), c3oh.LIZIZ, c3oh.LIZJ, c3oh.LIZLLL, c3oh.LJ, IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService().hasUnreadMessageRequest()));
                return;
            }
        }
        focusedSessionListWidget.LJIIZILJ(LLJILJILJ);
        focusedSessionListWidget.LJLJLJ.submitList(LLJILJILJ);
    }

    public static final void onChanged$1(AObserverS62S0300000_1 aObserverS62S0300000_1, Object obj) {
        boolean z;
        ActivityStatus activityStatus = (ActivityStatus) obj;
        boolean isOnline = ((IMUser) ((IMContact) aObserverS62S0300000_1.l0)).isOnline();
        boolean z2 = false;
        if (activityStatus != null && OUP.LJJII(activityStatus, null, null, 3)) {
            z = true;
        } else {
            z = false;
        }
        if (isOnline != z) {
            IMUser iMUser = (IMUser) ((IMContact) aObserverS62S0300000_1.l0);
            if (activityStatus != null && OUP.LJJII(activityStatus, null, null, 3)) {
                z2 = true;
            }
            iMUser.setOnline(z2);
            ((C4NG) aObserverS62S0300000_1.l1).LJJIII().LJJIIJ((List) aObserverS62S0300000_1.l2, null);
        }
    }

    public static final void onChanged$2(AObserverS62S0300000_1 aObserverS62S0300000_1, Object obj) {
        List<InterfaceC57784Mm4> list;
        boolean z;
        boolean z2;
        int decrementAndGet;
        int i;
        C72808Sho<InterfaceC57784Mm4> state;
        ActivityStatus activityStatus = (ActivityStatus) obj;
        MKT mkt = ((C116194hD) aObserverS62S0300000_1.l0).LIZLLL.LJLJLLL;
        if (mkt != null && (state = mkt.getState()) != null) {
            list = state.LJII();
        } else {
            list = null;
        }
        if (!C65777Prh.LJI(list)) {
            list = null;
        }
        int i2 = 0;
        if (list != null && list.indexOf((C116144h8) aObserverS62S0300000_1.l1) >= 0 && ((C116194hD) aObserverS62S0300000_1.l0).LJIILLIIL.contains(((C116144h8) aObserverS62S0300000_1.l1).LJLIL.getUid())) {
            ((C116194hD) aObserverS62S0300000_1.l0).LIZ.LIZIZ(list, false);
        }
        if (C54838Lfe.LJIIJJI(((C116144h8) aObserverS62S0300000_1.l1).LJLIL.getUid())) {
            return;
        }
        boolean z3 = ((C116144h8) aObserverS62S0300000_1.l1).LJLILLLLZI;
        if (activityStatus != null && OUP.LJJII(activityStatus, null, null, 3)) {
            z = true;
        } else {
            z = false;
        }
        if (z3 != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((ArrayList) aObserverS62S0300000_1.l2).indexOf((C116144h8) aObserverS62S0300000_1.l1) < 0 || !z2) {
            return;
        }
        C116144h8 c116144h8 = (C116144h8) aObserverS62S0300000_1.l1;
        boolean z4 = !c116144h8.LJLILLLLZI;
        c116144h8.LJLILLLLZI = z4;
        if (z4) {
            decrementAndGet = ((C116194hD) aObserverS62S0300000_1.l0).LJIIJ.incrementAndGet();
        } else {
            decrementAndGet = ((C116194hD) aObserverS62S0300000_1.l0).LJIIJ.decrementAndGet();
        }
        C116194hD c116194hD = (C116194hD) aObserverS62S0300000_1.l0;
        if (decrementAndGet <= c116194hD.LJIIJJI) {
            C116144h8 c116144h82 = (C116144h8) aObserverS62S0300000_1.l1;
            if (c116144h82.LJLILLLLZI) {
                InterfaceC116134h7 interfaceC116134h7 = c116194hD.LIZ;
                String uid = c116144h82.LJLIL.getUid();
                o.LJIIIIZZ(uid, "item.contact.uid");
                if (!interfaceC116134h7.LJFF(((C116194hD) aObserverS62S0300000_1.l0).LIZ.LJI(6), uid)) {
                    return;
                }
                ConcurrentHashMap<String, Integer> LIZ = ((C116194hD) aObserverS62S0300000_1.l0).LIZ.LIZ();
                String uid2 = ((C116144h8) aObserverS62S0300000_1.l1).LJLIL.getUid();
                o.LJIIIIZZ(uid2, "item.contact.uid");
                LIZ.put(uid2, Integer.valueOf(((C116194hD) aObserverS62S0300000_1.l0).LIZ.LJI(6)));
                ((C116194hD) aObserverS62S0300000_1.l0).LJIILLIIL.add(((C116144h8) aObserverS62S0300000_1.l1).LJLIL.getUid());
                MKT mkt2 = ((C116194hD) aObserverS62S0300000_1.l0).LIZLLL.LJLJLLL;
                if (mkt2 != null && mkt2.LJJJLL()) {
                    C116194hD c116194hD2 = (C116194hD) aObserverS62S0300000_1.l0;
                    MKT mkt3 = c116194hD2.LIZLLL.LJLJLLL;
                    if (mkt3 != null) {
                        mkt3.post(new ARunnableS12S0300000_1(list, (C116144h8) aObserverS62S0300000_1.l1, c116194hD2, 10));
                    }
                } else if (list != null) {
                    list.add((C116144h8) aObserverS62S0300000_1.l1);
                    ((C116194hD) aObserverS62S0300000_1.l0).LIZ.LIZIZ(list, true);
                }
            } else if (list != null && list.contains(c116144h82)) {
                list.remove((C116144h8) aObserverS62S0300000_1.l1);
                ((C116194hD) aObserverS62S0300000_1.l0).LIZ.LIZ().remove(((C116144h8) aObserverS62S0300000_1.l1).LJLIL.getUid());
                ((C116194hD) aObserverS62S0300000_1.l0).LJIILLIIL.remove(((C116144h8) aObserverS62S0300000_1.l1).LJLIL.getUid());
                ((C116194hD) aObserverS62S0300000_1.l0).LIZ.LIZIZ(list, false);
            }
            boolean kv0 = ((C116194hD) aObserverS62S0300000_1.l0).LIZLLL.kv0();
            SkylightListViewModel skylightListViewModel = ((C116194hD) aObserverS62S0300000_1.l0).LIZLLL;
            skylightListViewModel.getClass();
            skylightListViewModel.setState(new AqS14S0010000_9(kv0, 8));
        }
        ArrayList arrayList = (ArrayList) aObserverS62S0300000_1.l2;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator it = arrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((C116144h8) it.next()).LJLILLLLZI && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        ArrayList arrayList2 = (ArrayList) aObserverS62S0300000_1.l2;
        if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if (((C116144h8) it2.next()).LJLIL.getFollowStatus() == 2 && (i2 = i2 + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        C79603Am.LIZ(i, i2, ((ArrayList) aObserverS62S0300000_1.l2).size(), ((C116194hD) aObserverS62S0300000_1.l0).LIZLLL.getAssemVMScope());
    }

    public static final void onChanged$3(AObserverS62S0300000_1 aObserverS62S0300000_1, Object obj) {
        C4N9 c4n9 = (C4N9) ((RecyclerView.ViewHolder) aObserverS62S0300000_1.l0);
        C4N8 c4n8 = (C4N8) aObserverS62S0300000_1.l1;
        Object obj2 = aObserverS62S0300000_1.l2;
        C4N7 c4n7 = (C4N7) c4n8;
        c4n7.getClass();
        c4n9.LJLJLLL = c4n7.LJZ((IMContact) obj2);
        c4n9.M();
    }

    public static final void onChanged$4(AObserverS62S0300000_1 aObserverS62S0300000_1, Object obj) {
        RecommendFeedFragmentPanel recommendFeedFragmentPanel;
        AnonymousClass839 anonymousClass839;
        FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) aObserverS62S0300000_1.l0;
        ScrollSwitchStateManager scrollSwitchStateManager = (ScrollSwitchStateManager) aObserverS62S0300000_1.l1;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aObserverS62S0300000_1.l2;
        Integer num = (Integer) obj;
        feedRecommendFragment.getClass();
        if (num == null || TextUtils.equals(scrollSwitchStateManager.mv0(num.intValue()), "page_feed") || (anonymousClass839 = (recommendFeedFragmentPanel = feedRecommendFragment.LJLL).sharePanelGuideManager) == null || !AnonymousClass839.LIZIZ(activityC45651qj, recommendFeedFragmentPanel.getCurrentAweme())) {
            return;
        }
        anonymousClass839.LIZ.hideShareStayHomeGuide(0L, 0L);
    }

    public static final void onChanged$5(AObserverS62S0300000_1 aObserverS62S0300000_1, Object obj) {
        ((MediatorLiveData) aObserverS62S0300000_1.l0).setValue(((InterfaceC88471Ynr) aObserverS62S0300000_1.l1).invoke(obj, ((LiveData) aObserverS62S0300000_1.l2).getValue()));
    }

    public static final void onChanged$6(AObserverS62S0300000_1 aObserverS62S0300000_1, Object obj) {
        ((MediatorLiveData) aObserverS62S0300000_1.l0).setValue(((InterfaceC88471Ynr) aObserverS62S0300000_1.l1).invoke(((LiveData) aObserverS62S0300000_1.l2).getValue(), obj));
    }

    public AObserverS62S0300000_1(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
