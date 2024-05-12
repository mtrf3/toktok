package com.bytedance.android.live.slot;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C2306993p;
import X.C31723Cch;
import X.C62822Ol8;
import X.InterfaceC31721Ccf;
import android.os.Bundle;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Iterator;
import java.util.Queue;
import kotlin.jvm.internal.AqS155S0100000_5;

/* loaded from: classes6.dex */
public final class FreeFrameSlotController implements GenericLifecycleObserver, OnMessageListener {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC31721Ccf LJLILLLLZI;
    public Queue<C31723Cch> LJLJI;
    public IMessageManager LJLJJL;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C2306993p.LJLIL);
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 69));

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        Queue<C31723Cch> queue = this.LJLJI;
        if (queue != null) {
            Iterator<T> it = queue.iterator();
            while (it.hasNext()) {
                ((C31723Cch) it.next()).LIZIZ.onCreate(new Bundle());
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        IMessageManager iMessageManager = this.LJLJJL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        Queue<C31723Cch> queue = this.LJLJI;
        if (queue != null) {
            Iterator<T> it = queue.iterator();
            while (it.hasNext()) {
                ((C31723Cch) it.next()).LIZIZ.onDestroy();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        Queue<C31723Cch> queue = this.LJLJI;
        if (queue != null) {
            Iterator<T> it = queue.iterator();
            while (it.hasNext()) {
                ((C31723Cch) it.next()).LIZIZ.onPause();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        Queue<C31723Cch> queue = this.LJLJI;
        if (queue != null) {
            Iterator<T> it = queue.iterator();
            while (it.hasNext()) {
                ((C31723Cch) it.next()).LIZIZ.onResume();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        Queue<C31723Cch> queue = this.LJLJI;
        if (queue != null) {
            Iterator<T> it = queue.iterator();
            while (it.hasNext()) {
                ((C31723Cch) it.next()).LIZIZ.onStart();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        Queue<C31723Cch> queue = this.LJLJI;
        if (queue != null) {
            Iterator<T> it = queue.iterator();
            while (it.hasNext()) {
                ((C31723Cch) it.next()).LIZIZ.onStop();
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Queue<C31723Cch> queue = this.LJLJI;
        if (queue != null) {
            Iterator<T> it = queue.iterator();
            while (it.hasNext()) {
                ((C31723Cch) it.next()).LIZIZ.onMessage(iMessage);
            }
        }
    }

    public FreeFrameSlotController(ActivityC45651qj activityC45651qj, FreeFrameSlotWidget freeFrameSlotWidget) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = freeFrameSlotWidget;
    }
}
