package com.ss.android.ugc.aweme.music.assem;

import X.C87440YTk;
import X.InterfaceC87445YTp;
import X.YU3;
import X.YU5;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UISlotAssem;

/* loaded from: classes16.dex */
public abstract class Hilt_MusicStatusAssem extends UISlotAssem implements YU5<Object> {
    public volatile YU3 LJLJLLL;
    public final Object LJLL = new Object();

    public final YU3 componentManager() {
        if (this.LJLJLLL == null) {
            synchronized (this.LJLL) {
                if (this.LJLJLLL == null) {
                    this.LJLJLLL = createComponentManager();
                }
            }
        }
        return this.LJLJLLL;
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
        ((InterfaceC87445YTp) generatedComponent()).LJII();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        inject();
    }
}
