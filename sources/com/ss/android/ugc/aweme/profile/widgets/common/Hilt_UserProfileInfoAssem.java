package com.ss.android.ugc.aweme.profile.widgets.common;

import X.C87440YTk;
import X.InterfaceC87452YTw;
import X.YU3;
import X.YU5;
import androidx.lifecycle.ViewModelProvider;

/* loaded from: classes16.dex */
public abstract class Hilt_UserProfileInfoAssem extends ProfileInfoAssem implements YU5<Object> {
    public volatile YU3 LJLJI;
    public final Object LJLJJI = new Object();

    @Override // com.ss.android.ugc.aweme.profile.widgets.common.ProfileInfoAssem, X.InterfaceC235069Kk, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public final YU3 componentManager() {
        if (this.LJLJI == null) {
            synchronized (this.LJLJJI) {
                if (this.LJLJI == null) {
                    this.LJLJI = createComponentManager();
                }
            }
        }
        return this.LJLJI;
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
        ((InterfaceC87452YTw) generatedComponent()).LJIIJ();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        inject();
    }
}
