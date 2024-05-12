package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.statemanager;

import X.C0A2;
import X.C221108m2;
import X.C2V9;
import X.C2VA;
import X.C2VB;
import X.C2VC;
import X.C31345CRx;
import X.C4RM;
import X.C4RP;
import X.C4RQ;
import X.C4RR;
import X.C4RS;
import X.C4RT;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C86393XvR;
import X.C93493lh;
import X.QD3;
import Y.ARunnableS37S0100000_1;
import Y.AfS17S1100000_1;
import Y.IDrS41S0100000_1;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class ChatRoomLiveStateManager implements GenericLifecycleObserver {
    public final RecyclerView LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final Queue<Integer> LIZIZ() {
        return (Queue) this.LJLJJL.getValue();
    }

    public final HashMap<String, Boolean> LIZJ() {
        return (HashMap) this.LJLJLJ.getValue();
    }

    public final HashMap<String, NewLiveRoomStruct> LIZLLL() {
        return (HashMap) this.LJLJL.getValue();
    }

    public final void LJFF() {
        C0A2 layoutManager = this.LJLIL.getLayoutManager();
        if (layoutManager != null && (layoutManager instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int LLILL = linearLayoutManager.LLILL();
            int LLILLJJLI = linearLayoutManager.LLILLJJLI();
            if (LLILL < 0) {
                return;
            }
            if (LLILL == this.LJLILLLLZI && LLILLJJLI == this.LJLJI) {
                return;
            }
            this.LJLILLLLZI = LLILL;
            this.LJLJI = LLILLJJLI;
            LIZIZ().clear();
            if (LLILL <= LLILLJJLI) {
                while (true) {
                    LIZIZ().add(Integer.valueOf(LLILL));
                    if (LLILL == LLILLJJLI) {
                        break;
                    } else {
                        LLILL++;
                    }
                }
            }
            if (this.LJLJJI) {
                return;
            }
            this.LJLJJI = true;
            LJ();
        }
    }

    public final void LJ() {
        long j;
        C86393XvR LJJIJIL;
        if (LIZIZ().isEmpty()) {
            this.LJLJJI = false;
            return;
        }
        Integer pos = LIZIZ().poll();
        RecyclerView recyclerView = this.LJLIL;
        o.LJIIIIZZ(pos, "pos");
        Object LJJIZ = recyclerView.LJJIZ(pos.intValue());
        if (LJJIZ instanceof C4RQ) {
            C4RQ c4rq = (C4RQ) LJJIZ;
            String LLLLZLLLI = c4rq.LLLLZLLLI();
            String LLLZZIL = c4rq.LLLZZIL();
            if (LLLLZLLLI != null && LLLLZLLLI.length() > 0 && !LIZLLL().containsKey(LLLLZLLLI) && !o.LJ(LIZJ().get(LLLLZLLLI), Boolean.TRUE)) {
                try {
                    j = CastLongProtector.parseLong(LLLLZLLLI);
                } catch (Exception unused) {
                    j = 0;
                }
                ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
                if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null) {
                    LIZJ().put(LLLLZLLLI, Boolean.TRUE);
                    ((C73318Sq2) this.LJLJJLL.getValue()).LIZ(LJJIJIL.LJZL(j, LLLZZIL).LJJJLIIL(new AfS17S1100000_1(this, LLLLZLLLI, 2), new AfS17S1100000_1(this, LLLLZLLLI, 3)));
                    return;
                }
                return;
            }
        }
        LJ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        EventBus.LIZJ().LJIJ(this);
        LIZIZ().clear();
        ((List) this.LJLLILLLL.getValue()).clear();
        LIZLLL().clear();
        ((C73318Sq2) this.LJLJJLL.getValue()).LIZLLL();
    }

    public final void LIZ(C4RQ holder) {
        o.LJIIIZ(holder, "holder");
        if (!((List) this.LJLLILLLL.getValue()).contains(holder)) {
            holder.LJZL(LIZLLL(), LIZJ(), (HashMap) this.LJLJLLL.getValue(), (HashMap) this.LJLL.getValue(), (HashMap) this.LJLLI.getValue(), (Set) this.LJLLJ.getValue());
            ((List) this.LJLLILLLL.getValue()).add(holder);
        }
    }

    public final void LJI(String str) {
        for (C4RQ c4rq : (List) this.LJLLILLLL.getValue()) {
            if (TextUtils.equals(str, c4rq.LLLLZLLLI())) {
                c4rq.LJLJJLL();
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onLiveStatusEvent(C4RM event) {
        o.LJIIIZ(event, "event");
        LIZLLL().put(event.LJLIL, event.LJLILLLLZI);
        LJI(event.LJLIL);
    }

    public ChatRoomLiveStateManager(LifecycleOwner lifecycleOwner, RecyclerView recyclerView) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = recyclerView;
        this.LJLILLLLZI = -1;
        this.LJLJI = -1;
        this.LJLJJL = C221108m2.LIZIZ(C31345CRx.LJLIL);
        this.LJLJJLL = C221108m2.LIZIZ(C4RT.LJLIL);
        this.LJLJL = C221108m2.LIZIZ(C4RR.LJLIL);
        this.LJLJLJ = C221108m2.LIZIZ(C2VA.LJLIL);
        this.LJLJLLL = C221108m2.LIZIZ(C2V9.LJLIL);
        this.LJLL = C221108m2.LIZIZ(C2VC.LJLIL);
        this.LJLLI = C221108m2.LIZIZ(C2VB.LJLIL);
        this.LJLLILLLL = C221108m2.LIZIZ(C4RP.LJLIL);
        this.LJLLJ = C221108m2.LIZIZ(C4RS.LJLIL);
        EventBus.LIZJ().LJIILJJIL(this);
        lifecycleOwner.getLifecycle().addObserver(this);
        recyclerView.LJIIJJI(new IDrS41S0100000_1(this, 8));
        C93493lh.LIZ.postDelayed(new ARunnableS37S0100000_1(this, 88), 800L);
    }
}
