package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.ui;

import X.AbstractC029409q;
import X.AbstractC030309z;
import X.C1041947b;
import X.C1046648w;
import X.C106024Ec;
import X.C106054Ef;
import X.C106094Ej;
import X.C106184Es;
import X.C106214Ev;
import X.C109544Rq;
import X.C221108m2;
import X.C3Q9;
import X.C40171ht;
import X.C48841JEv;
import X.C4HA;
import X.C4LS;
import X.C4WC;
import X.C62822Ol8;
import X.C63120Opw;
import X.C75782yE;
import X.C78613UtF;
import X.C89263es;
import X.C98523to;
import X.C99033ud;
import X.EnumC106114El;
import X.InterfaceC1032343j;
import X.InterfaceC1039145z;
import X.InterfaceC36571c5;
import X.InterfaceC88472Yns;
import X.OJ4;
import X.ORY;
import X.ORZ;
import X.XKX;
import Y.AObserverS69S0100000_1;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarButtonConf;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarConf;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.viewmodel.ActionBarViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge.ChatPageNudgeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.SelectChatMsgHostActivity;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import djb.IDaS20S0000000_1;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class ActionBarComponent implements GenericLifecycleObserver {
    public final Fragment LJLIL;
    public final View LJLILLLLZI;
    public final C99033ud LJLJI;
    public RecyclerView LJLJJI;
    public C106094Ej LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final ChatPageNudgeViewModel LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate$im_base_release();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume$im_base_release();
        }
    }

    public final boolean LIZ() {
        ActionBarConf LIZIZ;
        List<ActionBarButtonConf> actionBarButtonConf;
        if (this.LJLJI.isTakoChat$im_base_release()) {
            List<ActionBarButtonConf> value = LIZIZ().LJLIL.getValue();
            if (value != null) {
                return value.isEmpty();
            }
        } else if (!C4LS.LIZ() && (LIZIZ = C106184Es.LIZIZ()) != null && (actionBarButtonConf = LIZIZ.getActionBarButtonConf()) != null) {
            return actionBarButtonConf.isEmpty();
        }
        return true;
    }

    public final ActionBarViewModel LIZIZ() {
        return (ActionBarViewModel) this.LJLJJLL.getValue();
    }

    public final void LIZJ() {
        InterfaceC1032343j interfaceC1032343j;
        C1046648w actionBarDisplayManager;
        InterfaceC36571c5 interfaceC36571c5 = this.LJLIL;
        if ((interfaceC36571c5 instanceof InterfaceC1032343j) && (interfaceC1032343j = (InterfaceC1032343j) interfaceC36571c5) != null && (actionBarDisplayManager = interfaceC1032343j.getActionBarDisplayManager()) != null) {
            actionBarDisplayManager.LIZ("normal", false, LIZ());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate$im_base_release() {
        InterfaceC1032343j interfaceC1032343j;
        C1046648w actionBarDisplayManager;
        InterfaceC1039145z LJJIIZ;
        InterfaceC88472Yns interfaceC88472Yns;
        List<ActionBarButtonConf> actionBarButtonConf;
        if (this.LJLIL.requireActivity() instanceof SelectChatMsgHostActivity) {
            return;
        }
        this.LJLJJI = (RecyclerView) this.LJLILLLLZI.findViewById(R.id.j9g);
        this.LJLJJL = new C106094Ej(this.LJLIL, this.LJLJI);
        RecyclerView recyclerView = this.LJLJJI;
        if (recyclerView != null) {
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            recyclerView.setAdapter(this.LJLJJL);
            recyclerView.LJII((AbstractC030309z) this.LJLJLLL.getValue(), -1);
            recyclerView.setItemAnimator(new C40171ht() { // from class: X.4Eb
                @Override // X.AbstractC030109x
                public final long LJIIJJI() {
                    return 300L;
                }

                @Override // X.AbstractC030109x
                public final long LJIIL() {
                    return 300L;
                }

                @Override // X.AbstractC030109x
                public final long LJIILIIL() {
                    return 300L;
                }

                @Override // X.AbstractC28931Bp, X.AbstractC030109x
                public final boolean LIZIZ(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, C030009w preInfo, C030009w postInfo) {
                    o.LJIIIZ(preInfo, "preInfo");
                    o.LJIIIZ(postInfo, "postInfo");
                    int i = preInfo.LIZ;
                    int i2 = preInfo.LIZIZ;
                    int i3 = postInfo.LIZ;
                    int i4 = postInfo.LIZIZ;
                    if (i4 == postInfo.LIZLLL || i3 == postInfo.LIZJ) {
                        int abs = Math.abs(preInfo.LIZJ - i);
                        i4 = preInfo.LIZIZ;
                        i3 = postInfo.LIZ - abs;
                    }
                    if (preInfo.LIZIZ == preInfo.LIZLLL || preInfo.LIZ == preInfo.LIZJ) {
                        i2 = postInfo.LIZIZ;
                    }
                    return LJIJI(i, i2, i3, i4, viewHolder, viewHolder2);
                }
            });
            AbstractC029409q adapter = recyclerView.getAdapter();
            if (adapter != null) {
                RecyclerView.RecycledViewPool recycledViewPool = recyclerView.getRecycledViewPool();
                o.LJIIIIZZ(recycledViewPool, "recyclerView.recycledViewPool");
                ActionBarConf LIZIZ = C106184Es.LIZIZ();
                if (LIZIZ != null && (actionBarButtonConf = LIZIZ.getActionBarButtonConf()) != null) {
                    LJJIIZ = ORZ.LJLIIIL(actionBarButtonConf);
                    interfaceC88472Yns = C106214Ev.LJLIL;
                } else {
                    LJJIIZ = ORY.LJJIIZ(EnumC106114El.values());
                    interfaceC88472Yns = C106024Ec.LJLIL;
                }
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ.plus(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 18))), null, null, new C4HA(OJ4.LJJJJLL(LJJIIZ, interfaceC88472Yns), recycledViewPool, adapter, recyclerView, null), 3);
            }
        }
        ActionBarViewModel LIZIZ2 = LIZIZ();
        C99033ud sessionInfo = this.LJLJI;
        LIZIZ2.getClass();
        o.LJIIIZ(sessionInfo, "sessionInfo");
        LIZIZ2.LJLILLLLZI = sessionInfo;
        if (!this.LJLJI.isTakoChat$im_base_release()) {
            ActionBarViewModel.gv0(LIZIZ());
        }
        LIZIZ().LJLIL.observe(this.LJLIL, new AObserverS69S0100000_1(this, 113));
        this.LJLJL.LJLLI.observe(this.LJLIL, new AObserverS69S0100000_1(this, 114));
        if (SuggestedReplyExperiment.LIZIZ()) {
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJLIL), null, null, new C106054Ef(this, null), 3);
        }
        InterfaceC36571c5 interfaceC36571c5 = this.LJLIL;
        if (!(interfaceC36571c5 instanceof InterfaceC1032343j) || (interfaceC1032343j = (InterfaceC1032343j) interfaceC36571c5) == null || (actionBarDisplayManager = interfaceC1032343j.getActionBarDisplayManager()) == null) {
            return;
        }
        actionBarDisplayManager.LIZJ = this;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume$im_base_release() {
        String str;
        boolean z;
        C109544Rq lastShowMessage;
        C99033ud c99033ud = this.LJLJI;
        if (c99033ud instanceof C98523to) {
            C98523to c98523to = (C98523to) c99033ud;
            if (c98523to == null) {
                return;
            }
            IMUser fromUser = c98523to.getFromUser();
            if (fromUser == null || (str = fromUser.getUid()) == null) {
                str = "";
            }
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C63120Opw LIZ = C4WC.LIZIZ.LIZ(this.LJLJI.getConversationId());
            if (LIZ != null && (lastShowMessage = LIZ.getLastShowMessage()) != null && lastShowMessage.getMsgType() != 15) {
                z = true;
            } else {
                z = false;
            }
            if (!this.LJLJI.hasChatHistory() && !C89263es.LIZIZ(str) && !z) {
                return;
            }
            LIZJ();
            return;
        }
        LIZJ();
    }

    public ActionBarComponent(Fragment fragment, View view, C99033ud sessionInfo) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(sessionInfo, "sessionInfo");
        this.LJLIL = fragment;
        this.LJLILLLLZI = view;
        this.LJLJI = sessionInfo;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 71));
        this.LJLJL = C1041947b.LIZ(fragment, sessionInfo);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 70));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 69));
    }
}
