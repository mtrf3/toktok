package com.ss.android.ugc.aweme.profile;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C0NB;
import X.C16880lQ;
import X.C1IZ;
import X.C36922EeM;
import X.C55077LjV;
import X.C55115Lk7;
import X.C73411SrX;
import X.C73969T1h;
import X.C79004UzY;
import X.C79061V1d;
import X.GFG;
import X.QD3;
import X.T16;
import X.V1I;
import X.X1D;
import Y.AfS17S0001000_5;
import Y.AfS44S0300000_5;
import Y.AfS50S0200000_1;
import Y.AfS61S0100000_9;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.RequestAudienceApiExperiment;
import com.bytedance.android.widget.NextLiveData;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public class ListLiveCircleItemVM extends ViewModel {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public boolean LJLJJLL;
    public C73411SrX LJLJL;
    public ActivityC45651qj LJLL;
    public final C55115Lk7 LJLLI;
    public final NextLiveData LJLIL = new NextLiveData();
    public final NextLiveData LJLILLLLZI = new NextLiveData();
    public final NextLiveData LJLJI = new NextLiveData();
    public final ArrayList<User> LJLJJI = new ArrayList<>();
    public final ArrayList<User> LJLJJL = new ArrayList<>();
    public String LJLJLJ = "tiktok_other_profile_user_recommend";
    public final String LJLJLLL = "";

    public final void hv0() {
        if (this.LJLJJLL) {
            this.LJLJJLL = false;
            C73411SrX c73411SrX = this.LJLJL;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            this.LJLJL = null;
            C0NB.LIZIZ("LYP_LOG", "check live state stop");
        }
        this.LJLILLLLZI.postValue(Boolean.FALSE);
    }

    public final void kv0() {
        if (this.LJLJJLL || this.LJLJJI.isEmpty()) {
            return;
        }
        this.LJLJJLL = true;
        C0NB.LIZIZ("LYP_LOG", "start check live state");
        C73411SrX c73411SrX = this.LJLJL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
            this.LJLJL = null;
        }
        this.LJLJL = (C73411SrX) AbstractC73672Svk.LJJIJIIJI(10000L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(this, 14), new AfS61S0100000_9(this, 15));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C0NB.LIZIZ("LYP_LOG", "vm onCleared");
        this.LJLJJLL = false;
        C73411SrX c73411SrX = this.LJLJL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLJL = null;
        this.LJLJJI.clear();
        this.LJLL = null;
        EventBus.LIZJ().LJIJ(this);
    }

    /* loaded from: classes10.dex */
    public static final class ListLiveCircleItemVMFollower extends ListLiveCircleItemVM {
        public ListLiveCircleItemVMFollower(ActivityC45651qj activityC45651qj) {
            super(activityC45651qj);
        }
    }

    /* loaded from: classes10.dex */
    public static final class ListLiveCircleItemVMFollowing extends ListLiveCircleItemVM {
        public ListLiveCircleItemVMFollowing(ActivityC45651qj activityC45651qj) {
            super(activityC45651qj);
        }
    }

    public ListLiveCircleItemVM(final ActivityC45651qj activityC45651qj) {
        C55115Lk7 c55115Lk7 = new C55115Lk7(this);
        this.LJLLI = c55115Lk7;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM$activityLifeObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                int i = GFG.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        }
                        ActivityC45651qj activityC45651qj2 = activityC45651qj;
                        if (activityC45651qj2 != null) {
                            Hox.LJLLI.LIZ(activityC45651qj2).zv0("page_profile", ListLiveCircleItemVM.this.LJLLI);
                            activityC45651qj2.getLifecycle().removeObserver(this);
                        }
                        C0NB.LIZIZ("LYP_LOG", "ListLiveCircleItemVM ON_DESTROY()");
                        return;
                    }
                    C0NB.LIZIZ("LYP_LOG", "ListLiveCircleItemVM ON_PAUSE()");
                    ListLiveCircleItemVM.this.hv0();
                    return;
                }
                C0NB.LIZIZ("LYP_LOG", "ListLiveCircleItemVM ON_RESUME()");
                ListLiveCircleItemVM.this.LJLILLLLZI.postValue(Boolean.TRUE);
            }
        };
        this.LJLL = activityC45651qj;
        if (activityC45651qj != null) {
            Hox.LJLLI.LIZ(activityC45651qj).hv0("page_profile", c55115Lk7);
            activityC45651qj.getLifecycle().addObserver(lifecycleEventObserver);
        }
        EventBus.LIZJ().LJIILJJIL(this);
    }

    public final void gv0(User user) {
        Iterator<User> it = this.LJLJJI.iterator();
        o.LJIIIIZZ(it, "userData.iterator()");
        while (it.hasNext()) {
            User next = it.next();
            o.LJIIIIZZ(next, "iterator.next()");
            if (o.LJ(user.getUid(), next.getUid())) {
                it.remove();
            }
        }
        Iterator<User> it2 = this.LJLJJL.iterator();
        o.LJIIIIZZ(it2, "recommendData.iterator()");
        while (it2.hasNext()) {
            User next2 = it2.next();
            o.LJIIIIZZ(next2, "iterator.next()");
            if (o.LJ(user.getUid(), next2.getUid())) {
                it2.remove();
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onLiveStatusEvent(C1IZ event) {
        o.LJIIIZ(event, "event");
        ArrayList<User> arrayList = this.LJLJJI;
        ArrayList arrayList2 = new ArrayList();
        Iterator<User> it = arrayList.iterator();
        while (it.hasNext()) {
            User next = it.next();
            if (TextUtils.equals(String.valueOf(event.LJLILLLLZI), next.getUid())) {
                arrayList2.add(next);
            }
        }
        boolean z = true;
        if (!arrayList2.isEmpty()) {
            User user = (User) ListProtector.get(arrayList2, 0);
            if (event.LJLJI) {
                user.roomId = 0L;
                gv0(user);
                this.LJLIL.postValue(Boolean.TRUE);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("deleteLivingItem ");
                LIZ.append(user.getUid());
                C0NB.LIZIZ("LYP_LOG", X1D.LIZIZ(LIZ));
            }
        } else {
            z = false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onLiveStatusEvent  ");
        V1I.LIZJ(LIZ2, event.LJLILLLLZI, ", ", z);
        C0NB.LIZIZ("LYP_LOG", X1D.LIZIZ(LIZ2));
    }

    public final void iv0(String str, ArrayList arrayList) {
        long j;
        if (arrayList.isEmpty()) {
            return;
        }
        C55077LjV liveStateManager = LiveOuterService.LJJJLL().LJJIZ().getLiveStateManager();
        AfS50S0200000_1 afS50S0200000_1 = new AfS50S0200000_1(this, arrayList, 15);
        liveStateManager.getClass();
        if (C55077LjV.LJIIJJI() || C79004UzY.LJJIFFI(arrayList)) {
            return;
        }
        long j2 = 0;
        try {
            j = CastLongProtector.parseLong(((User) ListProtector.get(arrayList, 0)).getUid());
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            j = 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long l = (Long) ((HashMap) liveStateManager.LIZLLL).get(Long.valueOf(j));
        if (l != null) {
            j2 = l.longValue();
        }
        if (currentTimeMillis - Long.valueOf(j2).longValue() < C55077LjV.LIZJ()) {
            try {
                afS50S0200000_1.accept(liveStateManager.LIZ);
                return;
            } catch (Exception e2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onResult:");
                LIZ.append(Log.getStackTraceString(e2));
                C36922EeM.LIZLLL(2, "LiveStateManager", X1D.LIZIZ(LIZ));
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (!C79004UzY.LJJIFFI(arrayList)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append(((User) it.next()).getUid());
                sb.append(",");
            }
        }
        String sb2 = sb.toString();
        if (sb2.endsWith(",")) {
            sb2 = C79061V1d.LJ(sb2, 1, 0);
        }
        liveStateManager.LJII.liveStates(sb2, str, RequestAudienceApiExperiment.INSTANCE.getValue()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS44S0300000_5(arrayList, liveStateManager, afS50S0200000_1, 14), new AfS17S0001000_5(1, 10));
    }

    public final void jv0(String str, List list) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ListLiveCircleItemVM try to data ");
        ArrayList arrayList = (ArrayList) list;
        LIZ.append(Integer.valueOf(arrayList.size()));
        LIZ.append(' ');
        C0NB.LIZIZ("LYP_LOG", X1D.LIZIZ(LIZ));
        this.LJLJJI.clear();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((User) next).roomId != 0) {
                arrayList2.add(next);
            }
        }
        this.LJLJJI.addAll(arrayList2);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ListLiveCircleItemVM setRefreshLiveData2VM-u ");
        LIZ2.append(this.LJLJJI.size());
        LIZ2.append("+,");
        LIZ2.append(getClass());
        LIZ2.append(' ');
        C0NB.LIZIZ("LYP_LOG", X1D.LIZIZ(LIZ2));
        this.LJLJLJ = str;
        kv0();
    }
}
