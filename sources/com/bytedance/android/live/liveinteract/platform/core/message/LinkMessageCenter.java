package com.bytedance.android.live.liveinteract.platform.core.message;

import X.C17M;
import X.C29927Bop;
import X.C32014ChO;
import X.C77800Ug8;
import X.EnumC31509CYf;
import X.InterfaceC75560Tl6;
import X.TQE;
import X.U44;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC75560Tl6(name = "LINK_MESSAGE_CENTER")
/* loaded from: classes14.dex */
public final class LinkMessageCenter implements OnMessageListener {
    public final DataChannel LJLIL;
    public final List<TQE> LJLILLLLZI;

    public final void LIZIZ() {
        IMessageManager iMessageManager = (IMessageManager) this.LJLIL.kv0(C29927Bop.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MIC_SIGNAL.getIntType(), this);
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MIC.getIntType(), this);
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(EnumC31509CYf.SOCIAL.getIntType(), this);
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_CO_HOST_GUIDE.getIntType(), this);
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_SCREEN_CHANGE_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_STATE_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(EnumC31509CYf.COHOST_RESERVE_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(EnumC31509CYf.COHOST_TOPIC_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MIC_AD_MESSAGE.getIntType(), this);
        }
    }

    public final void LIZJ() {
        try {
            IMessageManager iMessageManager = (IMessageManager) this.LJLIL.kv0(C29927Bop.class);
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(this);
            }
        } catch (Exception e) {
            C32014ChO.LIZJ(LIZLLL(66), "removeMessageListener failed", e.getMessage());
        }
    }

    public LinkMessageCenter(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = new ArrayList();
    }

    public final void LIZ(TQE listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJLILLLLZI).add(listener);
    }

    public final String LIZLLL(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.BIZ, LIZ, "_LinkMessageCenter_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.BIZ, LIZ2, "_LinkMessageCenter_", i, LIZ2);
    }

    public final void LJ(TQE listener) {
        o.LJIIIZ(listener, "listener");
        if (((ArrayList) this.LJLILLLLZI).contains(listener)) {
            ((ArrayList) this.LJLILLLLZI).remove(listener);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 603
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r19) {
        /*
            Method dump skipped, instructions count: 2412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }
}
