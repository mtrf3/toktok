package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect;

import X.C0WF;
import X.C5H3;
import X.C62814Ol0;
import X.C68332mD;
import X.C78996UzQ;
import X.InterfaceC24140x8;
import X.InterfaceC75203TfL;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.viewmodel.ViewModelExt;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class AbsMultiGuestEffectViewModel extends ViewModelExt {
    public final DataChannel LJLILLLLZI;
    public final LifecycleOwner LJLJI;
    public final InterfaceC24140x8 LJLJJI;
    public final C5H3 LJLJJL;
    public final C68332mD LJLJJLL;
    public final C68332mD LJLJL;
    public final C68332mD LJLJLJ;
    public final C68332mD LJLJLLL;
    public final C68332mD LJLL;
    public final C68332mD LJLLI;
    public final C68332mD LJLLILLLL;
    public InterfaceC75203TfL LJLLJ;
    public boolean LJLLL;
    public final C68332mD LJLLLL;

    public final C0WF gv0() {
        Object obj;
        InterfaceC24140x8 interfaceC24140x8 = this.LJLJJI;
        if (interfaceC24140x8 != null) {
            obj = interfaceC24140x8.getAttachedComposerManager();
        } else {
            obj = null;
        }
        if (!(obj instanceof C0WF)) {
            return null;
        }
        return (C0WF) obj;
    }

    public AbsMultiGuestEffectViewModel(DataChannel dataChannel, LifecycleOwner lifecycleOwner, InterfaceC24140x8 interfaceC24140x8) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = interfaceC24140x8;
        this.LJLJJL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 89));
        this.LJLJJLL = C62814Ol0.LJIIJJI(this);
        this.LJLJL = C62814Ol0.LJIIJJI(this);
        this.LJLJLJ = C62814Ol0.LJIIJJI(this);
        this.LJLJLLL = C62814Ol0.LJIIJJI(this);
        this.LJLL = new C68332mD(new Channel());
        this.LJLLI = C62814Ol0.LJIIJJI(this);
        this.LJLLILLLL = C62814Ol0.LJIIJJI(this);
        this.LJLLLL = C62814Ol0.LJIIJJI(this);
    }
}
