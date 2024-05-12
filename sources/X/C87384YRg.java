package X;

import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.LimitedSizeHashMap;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.YRg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87384YRg implements IInterceptor {
    public final YRK LIZ;
    public final LimitedSizeHashMap LIZIZ;
    public final LimitedSizeHashMap LIZJ;

    public final void LIZIZ() {
        this.LIZIZ.clear();
        this.LIZJ.clear();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage message) {
        YRS LJI;
        YRS LJI2;
        o.LJIIIZ(message, "message");
        if (C32072CiK.LIZJ(message.getGeneralMessageType())) {
            if (this.LIZJ.containsKey(Long.valueOf(message.getMessageId()))) {
                YRK yrk = this.LIZ;
                if (yrk != null && (LJI2 = yrk.LJI()) != null) {
                    Iterator it = ((CopyOnWriteArrayList) LJI2.LIZ).iterator();
                    while (it.hasNext()) {
                        ((EventListener) it.next()).onDeduplicateInterceptorMessage(message);
                    }
                }
                return true;
            }
            this.LIZJ.put(Long.valueOf(message.getMessageId()), null);
            return false;
        }
        if (this.LIZIZ.containsKey(Long.valueOf(message.getMessageId()))) {
            YRK yrk2 = this.LIZ;
            if (yrk2 != null && (LJI = yrk2.LJI()) != null) {
                Iterator it2 = ((CopyOnWriteArrayList) LJI.LIZ).iterator();
                while (it2.hasNext()) {
                    ((EventListener) it2.next()).onDeduplicateInterceptorMessage(message);
                }
            }
            return true;
        }
        this.LIZIZ.put(Long.valueOf(message.getMessageId()), null);
        return false;
    }

    public C87384YRg(int i, YRK yrk) {
        this.LIZ = yrk;
        this.LIZIZ = new LimitedSizeHashMap(i);
        this.LIZJ = new LimitedSizeHashMap(i);
    }
}
