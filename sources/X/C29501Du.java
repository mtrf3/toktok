package X;

import Y.IDfS292S0100000;
import com.bytedance.android.livesdk.model.message.redenvelope.MessageRedEnvelopInfo;
import com.bytedance.android.livesdk.model.message.redenvelope.RedEnvelopMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.1Du, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29501Du implements C0EA<RedEnvelopMessage> {
    public final C73318Sq2 LIZ = new C73318Sq2();
    public DataChannel LIZIZ;

    @Override // X.C0EA
    public final int LIZ() {
        return EnumC31509CYf.RED_ENVELOPE_MESSAGE.getIntType();
    }

    @Override // X.C0EA
    public final void onRelease() {
        this.LIZ.dispose();
    }

    public C29501Du() {
        C221108m2.LIZIZ(C46181ra.LJLIL);
    }

    @Override // X.C0EA
    public final void LIZIZ(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZIZ = dataChannel;
    }

    @Override // X.C0EA
    public final void onMessage(IMessage message) {
        MessageRedEnvelopInfo messageRedEnvelopInfo;
        Integer num;
        Long valueOf;
        o.LJIIIZ(message, "message");
        if (message instanceof RedEnvelopMessage) {
            RedEnvelopMessage redEnvelopMessage = (RedEnvelopMessage) message;
            if (redEnvelopMessage.display == 1 && (messageRedEnvelopInfo = redEnvelopMessage.envelopeInfo) != null && (num = messageRedEnvelopInfo.unpackAt) != null && (valueOf = Long.valueOf(num.intValue())) != null) {
                valueOf.longValue();
                this.LIZ.LIZ(AbstractC73672Svk.LJJLIIIJLJLI(Long.valueOf(valueOf.longValue() - (System.currentTimeMillis() / 1000)).longValue(), TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new IDfS292S0100000(this, 2), new InterfaceC64592gB() { // from class: X.1Dt
                    @Override // X.InterfaceC64592gB
                    public final void accept(Object obj) {
                        C0NB.LJ("GameTreasureNotice", android.util.Log.getStackTraceString((Throwable) obj));
                    }
                }));
            }
        }
    }
}
