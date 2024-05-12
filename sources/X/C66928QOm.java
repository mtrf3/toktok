package X;

import android.content.Intent;
import com.bytedance.common.wschannel.model.SocketState;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.QOm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66928QOm extends AbstractC66932QOq {
    public C66928QOm(InterfaceC66931QOp interfaceC66931QOp) {
        super(interfaceC66931QOp);
    }

    @Override // X.InterfaceC66937QOv
    public final void LIZ(Intent intent, C66938QOw c66938QOw) {
        intent.setExtrasClassLoader(SocketState.class.getClassLoader());
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("connection");
        if (parcelableArrayListExtra != null) {
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                SocketState socketState = (SocketState) it.next();
                if (socketState != null) {
                    LIZIZ(socketState.channelId, socketState.connectionState, socketState.privateProtocolEnabled);
                }
            }
        }
    }
}
