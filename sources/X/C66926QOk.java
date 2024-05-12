package X;

import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.model.WsChannelMsg;

/* renamed from: X.QOk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66926QOk extends AbstractC66932QOq {
    public C66926QOk(InterfaceC66931QOp interfaceC66931QOp) {
        super(interfaceC66931QOp);
    }

    @Override // X.InterfaceC66937QOv
    public final void LIZ(Intent intent, C66938QOw c66938QOw) {
        intent.setExtrasClassLoader(WsChannelMsg.class.getClassLoader());
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "payload_md5");
        boolean booleanExtra = intent.getBooleanExtra("send_result", true);
        Logger.debug();
        this.LIZ.onSendResult(LLJJIJIIJIL, booleanExtra);
    }
}
