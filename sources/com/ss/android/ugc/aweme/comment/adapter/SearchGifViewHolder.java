package com.ss.android.ugc.aweme.comment.adapter;

import X.AMG;
import X.AMH;
import X.AMK;
import X.C106364Fk;
import X.C73156SnQ;
import X.InterfaceC72022SOk;
import X.KS7;
import X.X1D;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiViewModel;
import kotlin.jvm.internal.AqS167S0100000_1;

/* loaded from: classes5.dex */
public final class SearchGifViewHolder extends JediBaseViewHolder implements KS7 {
    @Override // X.KS7
    public final void onFail() {
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.KS7
    public final void onSuccess() {
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(this, 359);
        AMK proxy = getProxy();
        if (proxy != null) {
            AMH LIZ = AMG.LIZ(this.LJLIL, proxy.r6());
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(SearchGifViewHolder.class.getName());
            LIZ2.append('_');
            LIZ2.append(GifEmojiViewModel.class.getName());
            JediViewModel jediViewModel = (JediViewModel) LIZ.LIZ(X1D.LIZIZ(LIZ2), GifEmojiViewModel.class);
            InterfaceC72022SOk create = jediViewModel.LJLJJI.create(GifEmojiViewModel.class);
            if (create != null) {
                create.binding(jediViewModel);
            }
            jediViewModel.ov0(aqS167S0100000_1);
            C73156SnQ.LJIIL(this, jediViewModel, C106364Fk.LJLIL);
            return;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }
}
