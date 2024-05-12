package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class U3F {
    public final DataChannel LIZ;
    public final U3C LIZIZ;
    public final U3B LIZJ;

    public U3F(DataChannel dataChannel, U3C model) {
        IMessageManager iMessageManager;
        o.LJIIIZ(model, "model");
        this.LIZ = dataChannel;
        this.LIZIZ = model;
        U3B u3b = new U3B(this);
        this.LIZJ = u3b;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.LIVE_SHOW_MESSAGE.getIntType(), (OnIMMessageListener) u3b);
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_SCREEN_CHANGE_MESSAGE.getIntType(), (OnIMMessageListener) u3b);
        }
    }
}
