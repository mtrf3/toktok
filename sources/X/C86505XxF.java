package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.PassThroughMessage;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* renamed from: X.XxF, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86505XxF {
    public static boolean LIZ(InnerPushMessage message) {
        PassThroughMessage passThroughMessage;
        Object LIZ;
        o.LJIIIZ(message, "message");
        if (message.getProtocol() != 2) {
            return false;
        }
        Serializable payload = message.getPayload();
        if (payload instanceof PassThroughMessage) {
            passThroughMessage = (PassThroughMessage) payload;
            if (passThroughMessage != null) {
                passThroughMessage.setRid(message.getRid());
            }
        } else {
            passThroughMessage = null;
        }
        if (passThroughMessage != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("dispatch pass-through message, type=");
            LIZ2.append(passThroughMessage.getType());
            LIZ2.append(", message=");
            LIZ2.append(message);
            C86478Xwo.LIZLLL("PassThroughHandler", X1D.LIZIZ(LIZ2));
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) C58242MtS.LIZIZ.getValue()).get(Integer.valueOf(passThroughMessage.getType()));
            if (copyOnWriteArraySet != null) {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    InterfaceC86545Xxt interfaceC86545Xxt = (InterfaceC86545Xxt) it.next();
                    try {
                        passThroughMessage.getType();
                        passThroughMessage.getContent();
                        passThroughMessage.getRid();
                        message.getFrom();
                        interfaceC86545Xxt.LIZ();
                        LIZ = C76800UCe.LIZ;
                        C3C5.m7constructorimpl(LIZ);
                    } catch (Throwable th) {
                        LIZ = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ);
                    }
                    Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
                    if (m10exceptionOrNullimpl != null) {
                        C86478Xwo.LIZJ("PassThroughHandler", "dispatch error", m10exceptionOrNullimpl);
                    }
                }
                return true;
            }
            return true;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("receive invalid pass-through message, message=");
        LIZ3.append(message);
        C86478Xwo.LIZIZ("PassThroughHandler", X1D.LIZIZ(LIZ3));
        return true;
    }
}
