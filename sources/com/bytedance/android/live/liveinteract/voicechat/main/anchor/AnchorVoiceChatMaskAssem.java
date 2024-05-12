package com.bytedance.android.live.liveinteract.voicechat.main.anchor;

import X.AbstractC75323ThH;
import X.C75322ThG;
import X.C75559Tl5;
import X.InterfaceC75558Tl4;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class AnchorVoiceChatMaskAssem extends VoiceChatMaskAssem {

    @InterfaceC75558Tl4(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder dataHolder;

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAssem
    public final int K3() {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAssem
    public final ILinkStateAbility L3() {
        return null;
    }

    public AnchorVoiceChatMaskAssem() {
        C75559Tl5.LIZIZ.LIZLLL(this);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAssem
    public final AbstractC75323ThH I3(String str) {
        if (str == null) {
            return null;
        }
        return new C75322ThG(this.LJLL, str);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
    }
}
