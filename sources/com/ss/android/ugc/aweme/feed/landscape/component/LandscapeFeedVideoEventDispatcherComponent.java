package com.ss.android.ugc.aweme.feed.landscape.component;

import X.C221108m2;
import X.C2K0;
import X.C50420Jqa;
import X.C58492Rh;
import X.C62822Ol8;
import X.C68202m0;
import X.C76800UCe;
import X.InterfaceC55102Lju;
import X.InterfaceC88472Yns;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedVideoEventDispatcherAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LandscapeFeedVideoEventDispatcherComponent extends BasePanelComponent implements LandscapeFeedVideoEventDispatcherAbility, InterfaceC55102Lju {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C68202m0.LJLIL);

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1567494017) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedVideoEventDispatcherAbility
    public final C58492Rh zl0() {
        return (C58492Rh) this.LJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedVideoEventDispatcherAbility
    public final void nt0(LifecycleOwner lifecycleOwner, final InterfaceC88472Yns<? super C50420Jqa, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        final C58492Rh c58492Rh = (C58492Rh) this.LJLIL.getValue();
        c58492Rh.getClass();
        ((ArrayList) c58492Rh.LJLIL).add(interfaceC88472Yns);
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedVideoEventDispatcher$addListener$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ((ArrayList) C58492Rh.this.LJLIL).remove(interfaceC88472Yns);
                }
            }
        });
    }
}
