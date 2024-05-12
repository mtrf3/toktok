package com.ss.android.ugc.aweme.relation.recuser.inbox;

import X.AbstractC030109x;
import X.EnumC94693nd;
import X.InterfaceC57760Mlg;
import X.InterfaceC57917MoD;
import X.K2B;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class AbsUserCardInboxWidget extends InboxAdapterWidget {
    public abstract void LJIILLIIL(InterfaceC57917MoD interfaceC57917MoD);

    public abstract InterfaceC57760Mlg LJIIZILJ();

    public abstract AbstractC030109x LJIJ();

    public abstract void LJIJI(K2B k2b);

    public abstract void LJIJJ(boolean z, boolean z2);

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsUserCardInboxWidget(Fragment fragment, LiveData<EnumC94693nd> liveData) {
        super(fragment, liveData);
        o.LJIIIZ(fragment, "fragment");
    }
}
