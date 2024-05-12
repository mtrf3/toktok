package X;

import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.YRj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87387YRj implements InterfaceC87393YRp {
    @Override // X.InterfaceC87393YRp
    public final int LIZ(List<? extends IMessage> messages, YRW dispatcher, boolean z) {
        o.LJIIIZ(messages, "messages");
        o.LJIIIZ(dispatcher, "dispatcher");
        Iterator<? extends IMessage> it = messages.iterator();
        while (it.hasNext()) {
            dispatcher.LJIIL(it.next(), z);
        }
        return messages.size();
    }
}
