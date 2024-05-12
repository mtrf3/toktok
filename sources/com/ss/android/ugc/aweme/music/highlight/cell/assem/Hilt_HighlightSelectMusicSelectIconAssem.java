package com.ss.android.ugc.aweme.music.highlight.cell.assem;

import X.C3C8;
import X.C87440YTk;
import X.InterfaceC87444YTo;
import X.YU3;
import X.YU5;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;

/* loaded from: classes16.dex */
public abstract class Hilt_HighlightSelectMusicSelectIconAssem<RECEIVER extends C3C8> extends ReusedUISlotAssem<RECEIVER> implements YU5<Object> {
    public volatile YU3 LLFF;
    public final Object LLFFF = new Object();

    @Override // X.YU5
    public final Object generatedComponent() {
        if (this.LLFF == null) {
            synchronized (this.LLFFF) {
                if (this.LLFF == null) {
                    this.LLFF = new YU3(this);
                }
            }
        }
        return this.LLFF.generatedComponent();
    }

    @Override // X.C8W0, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory LIZIZ = C87440YTk.LIZIZ(this);
        if (LIZIZ != null) {
            return LIZIZ;
        }
        return super.getDefaultViewModelProviderFactory();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        ((InterfaceC87444YTo) generatedComponent()).LIZLLL();
    }
}
