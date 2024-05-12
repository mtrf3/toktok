package X;

import Y.IDRunnableS4S1100000;
import Y.IDRunnableS85S0100000;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.27z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C534727z extends AbstractC65781Prl implements InterfaceC65784Pro<C37641do> {
    public static final C534727z LJLIL = new C534727z();

    public C534727z() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1do] */
    @Override // X.InterfaceC65784Pro
    public final C37641do invoke() {
        final java.util.Map map = (java.util.Map) AnonymousClass122.LIZIZ.getValue();
        return new OnMessageListener(map) { // from class: X.1do
            public final java.util.Map<Integer, String> LJLIL;

            {
                o.LJIIIZ(map, "messageTypeMap");
                this.LJLIL = map;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                String str;
                if (iMessage == null || (str = this.LJLIL.get(Integer.valueOf(iMessage.getIntType()))) == null) {
                    return;
                }
                ((ExecutorService) AnonymousClass124.LIZ.getValue()).submit(new IDRunnableS85S0100000(new IDRunnableS4S1100000(iMessage, str, 10), 116));
            }
        };
    }
}
