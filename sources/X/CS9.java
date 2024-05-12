package X;

import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CS9 implements OnMessageListener {
    public final /* synthetic */ Room LJLIL;

    public CS9(Room room) {
        this.LJLIL = room;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage message) {
        if (message instanceof PinMessage) {
            CS5 cs5 = CS5.LIZ;
            long id = this.LJLIL.getId();
            CS6 cs6 = new CS6(this.LJLIL.getId());
            PinMessage pinMessage = (PinMessage) message;
            cs6.LIZIZ = pinMessage.operator;
            cs6.LIZJ = false;
            cs6.LIZLLL = false;
            cs6.LJFF = CS8.LIZ(pinMessage);
            o.LJIIIIZZ(message, "message");
            cs6.LJI = (PinMessage) message;
            CS5.LJ(cs5, id, cs6);
        }
    }
}
