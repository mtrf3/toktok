package com.ss.android.ugc.aweme.music.highlight;

import X.C87440YTk;
import X.InterfaceC87450YTu;
import X.YU3;
import X.YU5;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;

/* loaded from: classes16.dex */
public abstract class Hilt_HighlightSelectBtnAssem extends UIContentAssem implements YU5<Object> {
    public volatile YU3 LJLIL;
    public final Object LJLILLLLZI = new Object();

    @Override // X.YU5
    public final Object generatedComponent() {
        if (this.LJLIL == null) {
            synchronized (this.LJLILLLLZI) {
                if (this.LJLIL == null) {
                    this.LJLIL = new YU3(this);
                }
            }
        }
        return this.LJLIL.generatedComponent();
    }

    @Override // X.C8W0, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory LIZIZ = C87440YTk.LIZIZ(this);
        if (LIZIZ != null) {
            return LIZIZ;
        }
        return super.getDefaultViewModelProviderFactory();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        ((InterfaceC87450YTu) generatedComponent()).LJIILJJIL();
    }
}