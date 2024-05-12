package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* loaded from: classes6.dex */
public final class B71 implements OnMessageListener {
    public DataChannel LJLIL;
    public B35 LJLILLLLZI;

    public static void LIZ(boolean z) {
        if (z) {
            ((IInteractService) CN1.LIZ(IInteractService.class)).yp0();
        } else {
            ((IInteractService) CN1.LIZ(IInteractService.class)).Wb0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b5, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r6) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B71.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }
}
