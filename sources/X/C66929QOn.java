package X;

import android.content.Intent;
import com.bytedance.common.wschannel.model.SocketState;

/* renamed from: X.QOn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66929QOn extends AbstractC66932QOq {
    public C66929QOn(InterfaceC66931QOp interfaceC66931QOp) {
        super(interfaceC66931QOp);
    }

    @Override // X.InterfaceC66937QOv
    public final void LIZ(Intent intent, C66938QOw c66938QOw) {
        intent.setExtrasClassLoader(SocketState.class.getClassLoader());
        SocketState socketState = (SocketState) intent.getParcelableExtra("connection");
        try {
            this.LIZ.onReceiveConnectEvent(new C66930QOo(LIZIZ(socketState.channelId, socketState.connectionState, socketState.privateProtocolEnabled), EnumC61982by.of(socketState.channelType), socketState.channelId), socketState.LJJIII());
        } catch (Throwable unused) {
        }
    }
}
