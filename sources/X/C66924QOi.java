package X;

import android.content.Intent;
import android.os.Message;
import android.os.Parcelable;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.model.WsChannelMsg;

/* renamed from: X.QOi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66924QOi extends AbstractC66932QOq {
    public C66924QOi(InterfaceC66931QOp interfaceC66931QOp) {
        super(interfaceC66931QOp);
    }

    @Override // X.InterfaceC66937QOv
    public final void LIZ(Intent intent, C66938QOw c66938QOw) {
        intent.setExtrasClassLoader(WsChannelMsg.class.getClassLoader());
        WsChannelMsg wsChannelMsg = (WsChannelMsg) intent.getParcelableExtra("payload");
        WsConstants.getOptLogic().getClass();
        if (!Boolean.FALSE.booleanValue()) {
            Message message = new Message();
            message.getData().putParcelable("payload", wsChannelMsg);
            message.getData().setClassLoader(WsChannelMsg.class.getClassLoader());
            Parcelable parcelable = message.getData().getParcelable("payload");
            if (!(parcelable instanceof WsChannelMsg)) {
                return;
            } else {
                wsChannelMsg = (WsChannelMsg) parcelable;
            }
        }
        if (wsChannelMsg != null) {
            Logger.debug();
            if (c66938QOw != null) {
                wsChannelMsg.receiveDataFromIpcTs = c66938QOw.LIZ;
            }
            this.LIZ.onReceive(wsChannelMsg);
        }
    }
}
