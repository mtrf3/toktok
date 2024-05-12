package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.ui;

import X.C221108m2;
import X.C48A;
import X.C48Q;
import X.C62822Ol8;
import Y.AObserverS69S0100000_1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.SelectChatMsgHostActivity;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TakoBingScrollComponent implements GenericLifecycleObserver {
    public final Fragment LJLIL;
    public final RecyclerView LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final AObserverS69S0100000_1 LJLJJL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            onStart$im_base_release();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop$im_base_release();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy$im_base_release();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy$im_base_release() {
        C48Q c48q;
        if (!(this.LJLIL.mo49getActivity() instanceof SelectChatMsgHostActivity) && (c48q = (C48Q) this.LJLJJI.getValue()) != null) {
            c48q.LIZ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart$im_base_release() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-takoBingHighLightLiveData>(...)");
        ((LiveData) value).observe(this.LJLIL, this.LJLJJL);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop$im_base_release() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-takoBingHighLightLiveData>(...)");
        ((LiveData) value).removeObserver(this.LJLJJL);
    }

    public TakoBingScrollComponent(Fragment fragment, RecyclerView recyclerView) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL = fragment;
        this.LJLILLLLZI = recyclerView;
        this.LJLJI = C221108m2.LIZIZ(C48A.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 72));
        this.LJLJJL = new AObserverS69S0100000_1(this, 20);
    }
}
