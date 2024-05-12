package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAllMessageItemsReportSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMessageItemsAlogEnabledSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMessageItemsLogCountSetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CR0 extends CRC implements EventListener {
    public static final int LJIIIZ = LiveMessageItemsLogCountSetting.getValue();
    public static final boolean LJIIJ = LiveMessageItemsAlogEnabledSetting.getValue();
    public final double LIZIZ;
    public final List<String> LIZJ = new ArrayList();
    public final boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public volatile int LJI;
    public int LJII;
    public int LJIIIIZZ;

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onConnectingWebSocket(int i) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onDeduplicateInterceptorMessage(IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onEnqueueMessage(List<IMessage> list, List<IMessage> list2) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImFetchFailed(Throwable th) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImFetchStarted() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImFetchSucceeded() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImPrefetchFailed(Throwable th) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImPrefetchStarted() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onImPrefetchSucceeded() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onInterceptMessage(IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onMessageConsumed(OnMessageListener onMessageListener, IMessage iMessage) {
    }

    @Override // X.InterfaceC31335CRn
    public final void onPause() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onPreDispatchMessage(IMessage iMessage) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onPreDispatchMessages(List<IMessage> list) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onReset() {
    }

    @Override // X.InterfaceC31335CRn
    public final void onResume() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onRoomEntered() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onSwitchToHttp(String str) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onWebSocketConnected() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onWebSocketDisconnected() {
    }

    public final void LJJIJLIJ() {
        if (!((ArrayList) this.LIZJ).isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayList) this.LIZJ).iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    String str = (String) next;
                    if (i > 0) {
                        sb.append(';');
                    }
                    sb.append(str);
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_message_item_monitor");
            LIZ.LJIJJ(sb.toString(), "message_items");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
                LIZ.LJIILLIIL(LJJIJIIJIL().LJIIIIZZ);
                LIZ.LJJIIJZLJL();
            } else {
                LIZ.LJIJJ(Long.valueOf(BJM.LJ()), "anchor_id");
                LIZ.LJJIJ();
                LIZ.LJJIIZI();
            }
            ((ArrayList) this.LIZJ).clear();
        }
    }

    public final void LJJIL() {
        if (((ArrayList) this.LIZJ).size() >= LJIIIZ) {
            LJJIJLIJ();
        }
    }

    @Override // X.InterfaceC31335CRn
    public final void LIZ() {
        IMessageManager iMessageManager;
        DataChannel dataChannel = LJJIJIIJIL().LJIIIIZZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.addEventListener(this);
        }
    }

    @Override // X.InterfaceC31335CRn
    public final void onUnload() {
        IMessageManager iMessageManager;
        DataChannel dataChannel = LJJIJIIJIL().LJIIIIZZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeEventListener(this);
        }
        LJJIJLIJ();
        if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_message_consume_monitor", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
            BZI LIZ = C28787BRn.LIZ("livesdk_message_consume_monitor");
            LIZ.LJIJJ(Integer.valueOf(this.LJI), "dispatch_count");
            LIZ.LJIJJ(Integer.valueOf(this.LJIIIIZZ), "public_screen_receive_count");
            LIZ.LJIJJ(Integer.valueOf(this.LJII), "public_screen_consume_count");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
                LIZ.LJIILLIIL(LJJIJIIJIL().LJIIIIZZ);
                LIZ.LJJIIJZLJL();
            } else {
                LIZ.LJJIJ();
                LIZ.LJJIIZI();
            }
        }
        this.LJII = 0;
        this.LJI = 0;
        this.LJIIIIZZ = 0;
        this.LJ = 0;
        this.LJFF = 0;
    }

    public CR0(double d) {
        this.LIZIZ = d;
        this.LIZLLL = LiveAllMessageItemsReportSetting.getValue() == 1;
    }

    @Override // X.CRC, X.CR8
    public final void LJIILJJIL(CR6 message) {
        o.LJIIIZ(message, "message");
        this.LJIIIIZZ++;
    }

    @Override // X.CRC, X.CR8
    public final void LJJIII(CRD crd) {
        if (V0Q.Default.nextDouble() < this.LIZIZ && (crd instanceof CQO)) {
            if (LJIIJ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("consumed_count ");
                int i = this.LJ + 1;
                this.LJ = i;
                LIZ.append(i);
                C0NB.LJ("message_entry", X1D.LIZIZ(LIZ));
            }
            CQO cqo = (CQO) crd;
            if (cqo.LJIJJLI.getDecodeStartAtMillis() > 0) {
                if (this.LIZLLL) {
                    if (!crd.LJJJLL().LIZ) {
                        List<String> list = this.LIZJ;
                        StringBuilder sb = new StringBuilder(LJJIJIL(cqo.LJIJJLI, false));
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(",12:");
                        LIZ2.append(cqo.LJIILLIIL.LIZ);
                        LIZ2.append(",13:");
                        LIZ2.append(cqo.LJIILLIIL.LIZIZ);
                        sb.append(X1D.LIZIZ(LIZ2));
                        String sb2 = sb.toString();
                        o.LJIIIIZZ(sb2, "StringBuilder(createFull…e}\")\n        }.toString()");
                        ((ArrayList) list).add(sb2);
                        LJJIL();
                    }
                } else {
                    MESSAGE message = cqo.LJIJJLI;
                    if (message instanceof ChatMessage) {
                        List<String> list2 = this.LIZJ;
                        StringBuilder sb3 = new StringBuilder(LJJIJL(message, false));
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(",12:");
                        LIZ3.append(cqo.LJIILLIIL.LIZ);
                        LIZ3.append(",13:");
                        LIZ3.append(cqo.LJIILLIIL.LIZIZ);
                        sb3.append(X1D.LIZIZ(LIZ3));
                        String sb4 = sb3.toString();
                        o.LJIIIIZZ(sb4, "StringBuilder(createLega…e}\")\n        }.toString()");
                        ((ArrayList) list2).add(sb4);
                        LJJIL();
                    }
                }
            }
        }
        this.LJII++;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onDispatchMessage(IMessage iMessage) {
        this.LJI++;
    }

    public static String LJJIJIL(CR6 cr6, boolean z) {
        long j;
        long j2;
        String str;
        CommonMessageData commonMessageData = cr6.baseMessage;
        if (commonMessageData != null) {
            j = commonMessageData.createTime;
            j2 = commonMessageData.clientSendTime;
        } else {
            j = 0;
            j2 = 0;
        }
        long LIZIZ = C31012CFc.LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("0:");
        LIZ.append(cr6.getMessageId());
        LIZ.append(",1:");
        LIZ.append(cr6.getDecodeStartAtMillis());
        LIZ.append(",2:");
        LIZ.append(cr6.getDecodeEndAtMillis() - cr6.getDecodeStartAtMillis());
        LIZ.append(",3:");
        LIZ.append(cr6.getDispatchAtMillis() - cr6.getDecodeStartAtMillis());
        LIZ.append(",4:");
        LIZ.append(LIZIZ - cr6.getDecodeStartAtMillis());
        LIZ.append(",5:");
        LIZ.append(!z ? 1 : 0);
        StringBuilder sb = new StringBuilder(X1D.LIZIZ(LIZ));
        if (j > 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(",6:");
            LIZ2.append(j - cr6.getDecodeStartAtMillis());
            sb.append(X1D.LIZIZ(LIZ2));
        }
        if (j2 > 0) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(",7:");
            LIZ3.append(j2 - cr6.getDecodeStartAtMillis());
            sb.append(X1D.LIZIZ(LIZ3));
        }
        if (!EnumC31509CYf.CHAT.getWsMethod().equals(cr6.getMethodName())) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(",8:");
            LIZ4.append(cr6.getMethodName());
            sb.append(X1D.LIZIZ(LIZ4));
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(",9:");
        LIZ5.append(cr6.getMessageFrom());
        sb.append(X1D.LIZIZ(LIZ5));
        if (j2 > 0) {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append(",10:");
            LIZ6.append(LIZIZ - j2);
            sb.append(X1D.LIZIZ(LIZ6));
        }
        CommonMessageData commonMessageData2 = cr6.baseMessage;
        String str2 = null;
        if (commonMessageData2 != null && (str = commonMessageData2.fromIdc) != null && str.length() != 0) {
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append(",11:");
            CommonMessageData commonMessageData3 = cr6.baseMessage;
            if (commonMessageData3 != null) {
                str2 = commonMessageData3.fromIdc;
            }
            LIZ7.append(str2);
            sb.append(X1D.LIZIZ(LIZ7));
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "StringBuilder(\n         …   }\n        }.toString()");
        return sb2;
    }

    public static String LJJIJL(CR6 cr6, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("0:");
        LIZ.append(cr6.getMessageId());
        LIZ.append(",1:");
        LIZ.append(cr6.getDecodeStartAtMillis());
        LIZ.append(",2:");
        LIZ.append(cr6.getDecodeEndAtMillis() - cr6.getDecodeStartAtMillis());
        LIZ.append(",3:");
        LIZ.append(cr6.getDispatchAtMillis() - cr6.getDecodeStartAtMillis());
        LIZ.append(",4:");
        LIZ.append(C31012CFc.LIZIZ() - cr6.getDecodeStartAtMillis());
        LIZ.append(",5:");
        LIZ.append(!z ? 1 : 0);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.CR8
    public final void LJJIJ(CRD model, boolean z) {
        o.LJIIIZ(model, "model");
        if (V0Q.Default.nextDouble() < this.LIZIZ && (model instanceof CQO)) {
            if (LJIIJ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("discarded_count ");
                int i = this.LJFF + 1;
                this.LJFF = i;
                LIZ.append(i);
                C0NB.LJ("message_entry", X1D.LIZIZ(LIZ));
            }
            CQO cqo = (CQO) model;
            if (cqo.LJIJJLI.getDecodeStartAtMillis() > 0) {
                if (this.LIZLLL) {
                    if (!z) {
                        ((ArrayList) this.LIZJ).add(LJJIJIL(cqo.LJIJJLI, true));
                        LJJIL();
                        return;
                    }
                    return;
                }
                MESSAGE message = cqo.LJIJJLI;
                if (!(message instanceof ChatMessage)) {
                    return;
                }
                ((ArrayList) this.LIZJ).add(LJJIJL(message, true));
                LJJIL();
            }
        }
    }

    @Override // X.CR8
    public final void LJJ(CR6 message, AbstractC31313CQr<CR6> abstractC31313CQr, boolean z, User user, boolean z2) {
        o.LJIIIZ(message, "message");
        if (V0Q.Default.nextDouble() < this.LIZIZ) {
            if (LJIIJ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("discarded_count ");
                int i = this.LJFF + 1;
                this.LJFF = i;
                LIZ.append(i);
                C0NB.LJ("message_entry", X1D.LIZIZ(LIZ));
            }
            if (message.getDecodeStartAtMillis() > 0) {
                if (this.LIZLLL) {
                    if (!z2) {
                        ((ArrayList) this.LIZJ).add(LJJIJIL(message, true));
                        LJJIL();
                        return;
                    }
                    return;
                }
                if (!(message instanceof ChatMessage)) {
                    return;
                }
                ((ArrayList) this.LIZJ).add(LJJIJL(message, true));
                LJJIL();
            }
        }
    }
}
