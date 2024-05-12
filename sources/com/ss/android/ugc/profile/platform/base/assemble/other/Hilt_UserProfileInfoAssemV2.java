package com.ss.android.ugc.profile.platform.base.assemble.other;

import X.C87440YTk;
import X.YU2;
import X.YU3;
import X.YU5;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2;

/* loaded from: classes16.dex */
public abstract class Hilt_UserProfileInfoAssemV2 extends ProfileInfoAssem2 implements YU5<Object> {
    public volatile YU3 LJLJJI;
    public final Object LJLJJL = new Object();

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2, X.InterfaceC235069Kk, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public final YU3 componentManager() {
        if (this.LJLJJI == null) {
            synchronized (this.LJLJJL) {
                if (this.LJLJJI == null) {
                    this.LJLJJI = createComponentManager();
                }
            }
        }
        return this.LJLJJI;
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
        ((YU2) generatedComponent()).LJIILIIL();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        inject();
    }
}
