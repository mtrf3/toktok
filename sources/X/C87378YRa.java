package X;

import android.os.SystemClock;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.YRa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87378YRa implements InterfaceC87393YRp {
    public final YRK LIZ;
    public final int LIZIZ;

    public C87378YRa(int i, YRK portal) {
        o.LJIIIZ(portal, "portal");
        this.LIZ = portal;
        this.LIZIZ = i;
    }

    @Override // X.InterfaceC87393YRp
    public final int LIZ(List<? extends IMessage> messages, YRW dispatcher, boolean z) {
        List<? extends IMessage> list;
        o.LJIIIZ(messages, "messages");
        o.LJIIIZ(dispatcher, "dispatcher");
        long uptimeMillis = SystemClock.uptimeMillis();
        this.LIZ.LJFF().LJJII++;
        if (!messages.isEmpty()) {
            list = messages;
        } else {
            list = null;
        }
        int i = 0;
        if (list != null) {
            Iterator<? extends IMessage> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                IMessage next = it.next();
                long uptimeMillis2 = SystemClock.uptimeMillis();
                dispatcher.LJIIL(next, z);
                i++;
                if (SystemClock.uptimeMillis() - uptimeMillis2 > this.LIZIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("a message has timeout!!! ");
                    LIZ.append(SystemClock.uptimeMillis() - uptimeMillis);
                    LIZ.append("ms ,");
                    LIZ.append(next.getClass());
                    this.LIZ.LIZJ().log("MessageDispatchDelegate", X1D.LIZIZ(LIZ));
                }
                if (SystemClock.uptimeMillis() - uptimeMillis > this.LIZIZ) {
                    this.LIZ.LJFF().LJJIII++;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("messageList dispatch has timeout!!! ");
                    LIZ2.append(SystemClock.uptimeMillis() - uptimeMillis);
                    LIZ2.append("ms, dispatchCount: ");
                    LIZ2.append(i);
                    LIZ2.append(", messages size: ");
                    LIZ2.append(messages.size());
                    this.LIZ.LIZJ().log("MessageDispatchDelegate", X1D.LIZIZ(LIZ2));
                    break;
                }
            }
        }
        return i;
    }
}
