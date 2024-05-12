package X;

import Y.IDRunnableS85S0100000;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1n5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43391n5 extends SimpleEventListener {
    public final long LIZ;
    public volatile int LIZIZ;
    public final IDRunnableS85S0100000 LIZJ = new IDRunnableS85S0100000(this, 92);
    public volatile boolean LIZLLL;
    public IRoomFunctionService LJ;

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onConnectingWebSocket(int i) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onDeduplicateInterceptorMessage(IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onEnqueueMessage(List<IMessage> list, List<IMessage> list2) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImFetchFailed(Throwable th) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImFetchStarted() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImFetchSucceeded() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImPrefetchFailed(Throwable th) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImPrefetchStarted() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImPrefetchSucceeded() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onInterceptMessage(IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onMessageConsumed(OnMessageListener onMessageListener, IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onPreDispatchMessage(IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onPreDispatchMessages(List<IMessage> list) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onReset() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onRoomEntered() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onSwitchToHttp(String str) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onWebSocketConnected() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onWebSocketDisconnected() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r4 = this;
            int r2 = r4.LIZIZ
            r3 = 3
            if (r2 < 0) goto L35
            if (r2 >= r3) goto L20
            r3 = 1
        L8:
            com.bytedance.android.live.function.IRoomFunctionService r0 = r4.LJ
            if (r0 != 0) goto L16
            java.lang.Class<com.bytedance.android.live.function.IRoomFunctionService> r0 = com.bytedance.android.live.function.IRoomFunctionService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.function.IRoomFunctionService r0 = (com.bytedance.android.live.function.IRoomFunctionService) r0
            r4.LJ = r0
        L16:
            com.bytedance.android.live.function.IRoomFunctionService r2 = r4.LJ
            if (r2 == 0) goto L1f
            long r0 = r4.LIZ
            r2.sS(r3, r0)
        L1f:
            return
        L20:
            r1 = 8
            if (r3 > r2) goto L35
            if (r2 >= r1) goto L28
            r3 = 2
            goto L8
        L28:
            r0 = 15
            if (r1 > r2) goto L35
            if (r2 >= r0) goto L2f
            goto L8
        L2f:
            r0 = 30
            if (r2 >= r0) goto L35
            r3 = 4
            goto L8
        L35:
            r3 = 5
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43391n5.LIZIZ():void");
    }

    public C43391n5(long j) {
        this.LIZ = j;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onDispatchMessage(IMessage iMessage) {
        CR6 cr6;
        CommonMessageData commonMessageData;
        if (this.LIZLLL) {
            return;
        }
        if ((iMessage instanceof CR6) && (cr6 = (CR6) iMessage) != null && !o.LJ(cr6.getExtraParams().get("extra_first_batch"), Boolean.TRUE) && (commonMessageData = cr6.baseMessage) != null) {
            long j = commonMessageData.roomMessageHeatLevel;
            if (j > 0) {
                if (this.LJ == null) {
                    this.LJ = (IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class);
                }
                IRoomFunctionService iRoomFunctionService = this.LJ;
                if (iRoomFunctionService != null) {
                    iRoomFunctionService.wJ((int) j, this.LIZ);
                }
            }
        }
        this.LIZIZ++;
        LIZIZ();
        C15610jN.LIZ().postDelayed(this.LIZJ, 5000L);
    }
}
