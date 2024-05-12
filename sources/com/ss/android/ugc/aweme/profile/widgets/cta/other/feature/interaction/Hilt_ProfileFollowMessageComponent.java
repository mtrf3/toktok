package com.ss.android.ugc.aweme.profile.widgets.cta.other.feature.interaction;

import X.C87440YTk;
import X.InterfaceC87453YTx;
import X.YU3;
import X.YU5;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;

/* loaded from: classes16.dex */
public abstract class Hilt_ProfileFollowMessageComponent extends UIContentAssem implements YU5<Object> {
    public volatile YU3 LJLIL;
    public final Object LJLILLLLZI = new Object();

    public final YU3 componentManager() {
        if (this.LJLIL == null) {
            synchronized (this.LJLILLLLZI) {
                if (this.LJLIL == null) {
                    this.LJLIL = createComponentManager();
                }
            }
        }
        return this.LJLIL;
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
        ((InterfaceC87453YTx) generatedComponent()).LJ();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        inject();
    }
}
