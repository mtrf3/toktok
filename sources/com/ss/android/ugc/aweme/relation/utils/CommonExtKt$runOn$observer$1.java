package com.ss.android.ugc.aweme.relation.utils;

import X.C76800UCe;
import X.InterfaceC65784Pro;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CommonExtKt$runOn$observer$1 implements LifecycleEventObserver {
    public boolean LJLIL;
    public final /* synthetic */ Lifecycle.Event LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == this.LJLILLLLZI) {
            if (!this.LJLIL) {
                this.LJLJI.invoke();
                source.getLifecycle().removeObserver(this);
            }
            this.LJLIL = false;
        }
    }

    public CommonExtKt$runOn$observer$1(boolean z, Lifecycle.Event event, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLILLLLZI = event;
        this.LJLJI = interfaceC65784Pro;
        this.LJLIL = z;
    }
}
