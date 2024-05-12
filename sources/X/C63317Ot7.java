package X;

import com.bytedance.im.core.model.DeleteMsgRequest;
import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Ot7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C63317Ot7 implements InterfaceC63328OtI {
    public final java.util.Map<Long, DeleteMsgRequest> LIZ = new ConcurrentHashMap();

    @Override // X.InterfaceC63328OtI
    public final void init() {
    }

    @Override // X.InterfaceC63328OtI
    public final java.util.Map<Long, DeleteMsgRequest> trigger() {
        for (DeleteMsgRequest deleteMsgRequest : ((ConcurrentHashMap) this.LIZ).values()) {
            deleteMsgRequest.retryTimes = C77339UWx.LIZIZ(deleteMsgRequest.retryTimes, 1);
        }
        HashMap hashMap = new HashMap(this.LIZ);
        ((ConcurrentHashMap) this.LIZ).clear();
        return hashMap;
    }

    @Override // X.InterfaceC63328OtI
    public final void LIZ(Long l, DeleteMessageRequestBody deleteMessageRequestBody) {
        if (deleteMessageRequestBody == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WaitDelCon_CacheStoreadd, invalid param, msgId:");
            LIZ.append(l);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ));
            return;
        }
        if (((ConcurrentHashMap) this.LIZ).containsKey(l)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("WaitDelCon_CacheStore, add, already in cache, msgId:");
            LIZ2.append(l);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
        }
        ((ConcurrentHashMap) this.LIZ).put(deleteMessageRequestBody.message_id, DeleteMsgRequest.fromReqBody(0, deleteMessageRequestBody));
    }

    @Override // X.InterfaceC63328OtI
    public final void LIZIZ(Long l, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
        if (deleteStrangerMessageRequestBody == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WaitDelCon_CacheStoreadd, invalid param, msgId:");
            LIZ.append(l);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ));
            return;
        }
        if (((ConcurrentHashMap) this.LIZ).containsKey(l)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("WaitDelCon_CacheStore, add, already in cache, msgId:");
            LIZ2.append(l);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
        }
        ((ConcurrentHashMap) this.LIZ).put(deleteStrangerMessageRequestBody.server_message_id, DeleteMsgRequest.fromReqBody(0, deleteStrangerMessageRequestBody));
    }
}
