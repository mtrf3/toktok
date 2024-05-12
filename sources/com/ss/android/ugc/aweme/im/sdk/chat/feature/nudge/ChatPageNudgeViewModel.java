package com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge;

import X.C1042047c;
import X.C1042147d;
import X.C1042247e;
import X.C109544Rq;
import X.C3EU;
import X.C4FU;
import X.C63120Opw;
import X.C7ZI;
import X.C80533Eb;
import X.C99033ud;
import X.EnumC57435MgR;
import X.QD3;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge.ChatPageNudgeViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class ChatPageNudgeViewModel extends ViewModel implements GenericLifecycleObserver {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public C99033ud LJLIL;
    public C63120Opw LJLILLLLZI;
    public C109544Rq LJLJI;
    public boolean LJLJJLL;
    public boolean LJLJLJ;
    public IMUser LJLJLLL;
    public String LJLJJI = "";
    public long LJLJJL = -1;
    public long LJLJL = -1;
    public final C1042047c LJLL = new C3EU() { // from class: X.47c
        @Override // X.C3EU
        public final void LIZ(IMUser result) {
            o.LJIIIZ(result, "result");
            if (!IMUser.isInvalidUser(result.getUid())) {
                return;
            }
            ChatPageNudgeViewModel.this.gv0(result);
        }

        @Override // X.C3EU
        public final void LIZIZ(Throwable throwable) {
            o.LJIIIZ(throwable, "throwable");
        }
    };
    public final MutableLiveData<C1042147d> LJLLI = new MutableLiveData<>();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate$im_base_release();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy$im_base_release();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume$im_base_release();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume$im_base_release() {
        IMUser singleChatFromUser;
        C99033ud c99033ud = this.LJLIL;
        if (c99033ud != null && (singleChatFromUser = c99033ud.getSingleChatFromUser()) != null && !IMUser.isInvalidUser(singleChatFromUser.getUid())) {
            C80533Eb.LJIIJJI(singleChatFromUser.getUid(), singleChatFromUser.getSecUid(), false, this.LJLL);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate$im_base_release() {
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy$im_base_release() {
        EventBus.LIZJ().LJIJ(this);
    }

    public final void gv0(IMUser user) {
        o.LJIIIZ(user, "user");
        this.LJLJLLL = user;
        if (this.LJLJJLL) {
            hv0(null);
        } else {
            hv0(this.LJLJI);
        }
    }

    public final void hv0(C109544Rq c109544Rq) {
        C1042147d c1042147d;
        String str;
        MutableLiveData<C1042147d> mutableLiveData = this.LJLLI;
        C63120Opw c63120Opw = this.LJLILLLLZI;
        IMUser iMUser = this.LJLJLLL;
        if (C7ZI.LIZJ() && c63120Opw != null && c63120Opw.isSingleChat()) {
            if (iMUser != null) {
                str = iMUser.getUid();
            } else {
                str = null;
            }
            if (!IMUser.isInvalidUser(str) && iMUser != null && iMUser.getFollowStatus() == EnumC57435MgR.FOLLOW_MUTUAL.getValue()) {
                if (this.LJLJJLL) {
                    c1042147d = new C1042147d(false, true);
                } else if (c109544Rq != null && C4FU.LJFF(c109544Rq) && !c109544Rq.isSelf()) {
                    c1042147d = new C1042147d(true, false);
                } else {
                    c1042147d = new C1042147d(false, true);
                }
                mutableLiveData.setValue(c1042147d);
            }
        }
        c1042147d = new C1042147d(false, false);
        mutableLiveData.setValue(c1042147d);
    }

    @QD3(threadMode = ThreadMode.POSTING)
    public final void onEvent(C1042247e event) {
        o.LJIIIZ(event, "event");
        if (!o.LJ(event.LJLIL, this.LJLJJI)) {
            return;
        }
        this.LJLJJLL = true;
        hv0(null);
    }
}
