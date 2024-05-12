package com.ss.android.ugc.aweme.im.sdk.search.ui.widget;

import X.AbstractC029409q;
import X.C100913xf;
import X.C221108m2;
import X.C62822Ol8;
import X.C98453th;
import X.EnumC94693nd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.im.service.search.IIMSearchEntranceWidget;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMSearchBarEntranceWidget extends IIMSearchEntranceWidget {
    public final C62822Ol8 LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public final C62822Ol8 LJLLI;
    public final MutableLiveData<EnumC94693nd> LJLLILLLL;

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final int LJIIIZ(int i) {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.im.service.search.IIMSearchEntranceWidget
    public final void LJIIZILJ() {
        this.LJLJLJ = true;
        ((AbstractC029409q) this.LJLLI.getValue()).notifyItemChanged(0);
    }

    @Override // com.ss.android.ugc.aweme.im.service.search.IIMSearchEntranceWidget, com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final AbstractC029409q<?> LJIIJ() {
        return (AbstractC029409q) this.LJLLI.getValue();
    }

    public final C98453th LJIJ() {
        return (C98453th) this.LJLJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, X.MLD
    public final void LJ() {
        LJIJ().LJFF("onRefresh");
        this.LJLLILLLL.setValue(EnumC94693nd.SUCCESS);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final LiveData<EnumC94693nd> LJIILIIL() {
        return this.LJLLILLLL;
    }

    @Override // com.ss.android.ugc.aweme.im.service.search.IIMSearchEntranceWidget
    public final boolean LJIILLIIL() {
        return this.LJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMSearchBarEntranceWidget(InboxFragment fragment, LiveData parentWidgetState) {
        super(fragment, parentWidgetState);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(parentWidgetState, "parentWidgetState");
        this.LJLJL = C221108m2.LIZIZ(C100913xf.LJLIL);
        this.LJLLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 833));
        this.LJLLILLLL = new MutableLiveData<>();
        fragment.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.search.ui.widget.IMSearchBarEntranceWidget.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_RESUME) {
                    IMSearchBarEntranceWidget.this.LJIJ().LJFF("on_resume");
                    ((AbstractC029409q) IMSearchBarEntranceWidget.this.LJLLI.getValue()).notifyItemChanged(0);
                }
            }
        });
    }
}
