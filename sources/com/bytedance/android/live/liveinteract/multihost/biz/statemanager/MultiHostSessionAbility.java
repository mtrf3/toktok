package com.bytedance.android.live.liveinteract.multihost.biz.statemanager;

import X.C74637TQz;
import X.C75812TpA;
import X.C8E;
import X.InterfaceC75441TjB;
import X.U8H;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiHostSessionAbility implements ISessionAbility {
    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.IRTCMessengerAbility
    public final void Ro0(C75812TpA c75812TpA) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.IRTCMessengerAbility
    public final void Rs0(C75812TpA c75812TpA) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.IRTCMessengerAbility
    public final void Ui(LinkLayerRTCMessage rtcMessage) {
        o.LJIIIZ(rtcMessage, "rtcMessage");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility
    public final int scene() {
        return 2;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility
    public final RtcUserInfo LLLLLJIL() {
        InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
        if (LJJIJL != null) {
            return LJJIJL.LLLLLJIL();
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility
    public final String LLLLLLIL() {
        return String.valueOf(C8E.LIZLLL().LJJLI());
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility
    public final int bo0() {
        U8H LJJZZI;
        C74637TQz c74637TQz;
        InterfaceC75441TjB LJJIJL = C8E.LIZLLL().LJJIJL();
        if (LJJIJL != null && (LJJZZI = LJJIJL.LJJZZI()) != null && (c74637TQz = LJJZZI.LJIIL) != null) {
            return c74637TQz.LJLIL;
        }
        return 1;
    }
}
