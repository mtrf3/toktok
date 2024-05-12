package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.utils;

import X.InterfaceC187177Wf;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.utils.KeyBoardMonitor;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FixedKeyboardMonitor extends KeyBoardMonitor implements InterfaceC187177Wf {
    public boolean LJLJI;
    public InterfaceC187177Wf LJLJJI;

    @Override // X.InterfaceC187177Wf
    public final void LLLLLILLIL() {
        this.LJLJI = true;
        InterfaceC187177Wf interfaceC187177Wf = this.LJLJJI;
        if (interfaceC187177Wf != null) {
            interfaceC187177Wf.LLLLLILLIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.utils.KeyBoardMonitor, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC187177Wf
    public final void S2() {
        InterfaceC187177Wf interfaceC187177Wf;
        if (this.LJLJI && (interfaceC187177Wf = this.LJLJJI) != null) {
            interfaceC187177Wf.S2();
        }
        this.LJLJI = false;
    }

    public FixedKeyboardMonitor(LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.utils.KeyBoardMonitor
    public final void LIZ(View view, InterfaceC187177Wf keyBoardListener) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(keyBoardListener, "keyBoardListener");
        super.LIZ(view, this);
        this.LJLJJI = keyBoardListener;
    }
}
