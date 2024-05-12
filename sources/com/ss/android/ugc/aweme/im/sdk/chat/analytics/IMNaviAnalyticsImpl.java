package com.ss.android.ugc.aweme.im.sdk.chat.analytics;

import X.C1HQ;
import X.C4C7;
import X.C772831o;
import X.C85323Wm;
import X.C98293tR;
import X.C98313tT;
import X.InterfaceC65784Pro;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMNaviAnalyticsImpl implements GenericLifecycleObserver, C4C7 {
    public static final IMNaviAnalyticsImpl LJLJI = new IMNaviAnalyticsImpl(0);
    public final InterfaceC65784Pro<C98313tT> LJLIL;
    public C98313tT LJLILLLLZI;

    public IMNaviAnalyticsImpl() {
        throw null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onLeaveChatRoom$im_base_release() {
        LIZJ(false);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onLeaveChatRoom$im_base_release();
        }
    }

    @Override // X.C4C7
    public final void LIZIZ() {
        this.LJLILLLLZI = this.LJLIL.invoke();
    }

    public IMNaviAnalyticsImpl(int i) {
        this.LJLIL = C98293tR.LJLIL;
    }

    @Override // X.C4C7
    public final void LIZ(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C85323Wm eventSender = C772831o.LIZ();
        o.LJIIIZ(eventSender, "eventSender");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", enterFrom);
        eventSender.LIZIZ("show_navi_panel", c1hq);
    }

    public final void LIZJ(boolean z) {
        String str;
        C98313tT c98313tT = this.LJLILLLLZI;
        if (c98313tT == null) {
            return;
        }
        c98313tT.stop();
        long j = c98313tT.LIZJ - c98313tT.LIZIZ;
        C85323Wm eventSender = C772831o.LIZ();
        o.LJIIIZ(eventSender, "eventSender");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", "chat");
        if (z) {
            str = "success";
        } else {
            str = "failure";
        }
        c1hq.put("status", str);
        c1hq.put("duration", String.valueOf(j));
        eventSender.LIZIZ("navi_panel_loading_duration", c1hq);
        this.LJLILLLLZI = null;
    }
}
