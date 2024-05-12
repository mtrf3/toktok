package com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction;

import X.C87440YTk;
import X.YU1;
import X.YU3;
import X.YU5;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent;

/* loaded from: classes16.dex */
public abstract class Hilt_HeaderCTASocialInteractionComponent extends HeaderCTABaseUIComponent implements YU5<Object> {
    public volatile YU3 componentManager;
    public final Object componentManagerLock = new Object();

    public final YU3 componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                if (this.componentManager == null) {
                    this.componentManager = createComponentManager();
                }
            }
        }
        return this.componentManager;
    }

    public YU3 createComponentManager() {
        return new YU3(this);
    }

    @Override // X.YU5
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // X.C8W0, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory LIZIZ = C87440YTk.LIZIZ(this);
        if (LIZIZ != null) {
            return LIZIZ;
        }
        return super.getDefaultViewModelProviderFactory();
    }

    public void inject() {
        ((YU1) generatedComponent()).LJIIJJI();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        inject();
    }
}
