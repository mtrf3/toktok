package com.ss.android.ugc.aweme.base.arch;

import X.AMD;
import X.C25903AEp;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.jedi.ext.adapter.JediViewHolder;

/* loaded from: classes5.dex */
public abstract class JediBaseViewHolder extends JediViewHolder implements AMD {
    public final C25903AEp LJLIL;

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AMD
    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory getViewModelFactory() {
        return this.LJLIL;
    }

    public JediBaseViewHolder(View view) {
        super(view);
        this.LJLIL = new C25903AEp();
    }
}
