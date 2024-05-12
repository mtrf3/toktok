package com.ss.android.ugc.aweme.main;

import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CreativityToolsPluginUpdater {
    public boolean LIZ;

    public final void LIZ() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        MainPageFragmentImpl.LJI().LJ(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.main.CreativityToolsPluginUpdater$startObserve$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                o.LJIIIZ(lifecycleOwner, "<anonymous parameter 0>");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    CreativityToolsPluginUpdater creativityToolsPluginUpdater = CreativityToolsPluginUpdater.this;
                    if (creativityToolsPluginUpdater.LIZ) {
                        creativityToolsPluginUpdater.LIZ = false;
                    }
                }
            }
        });
    }
}
