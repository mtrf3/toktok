package X;

import Y.ARunnableS46S0100000_10;
import com.bytedance.im.core.model.DeleteMsgRequest;
import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Ot8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C63318Ot8 implements InterfaceC63328OtI {
    public final java.util.Map<Long, DeleteMsgRequest> LIZ = new ConcurrentHashMap();
    public volatile boolean LIZIZ = false;

    @Override // X.InterfaceC63328OtI
    public final void init() {
        C63346Ota.LIZIZ().execute(new ARunnableS46S0100000_10(this, 28));
    }

    @Override // X.InterfaceC63328OtI
    public final java.util.Map<Long, DeleteMsgRequest> trigger() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WaitDelCon_FileStore trigger, cache:");
        LIZ.append(((ConcurrentHashMap) this.LIZ).size());
        LIZ.append(", isInit:");
        LIZ.append(this.LIZIZ);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (((ConcurrentHashMap) this.LIZ).isEmpty()) {
            return new HashMap();
        }
        for (DeleteMsgRequest deleteMsgRequest : ((ConcurrentHashMap) this.LIZ).values()) {
            deleteMsgRequest.retryTimes = C77339UWx.LIZIZ(deleteMsgRequest.retryTimes, 1);
        }
        HashMap hashMap = new HashMap(this.LIZ);
        if (C63321OtB.LIZ != 5) {
            ((ConcurrentHashMap) this.LIZ).clear();
        }
        C63346Ota.LIZ().execute(new ARunnableS46S0100000_10(this, 29));
        return hashMap;
    }

    @Override // X.InterfaceC63328OtI
    public final void LIZ(Long l, DeleteMessageRequestBody deleteMessageRequestBody) {
        if (deleteMessageRequestBody == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WaitDelCon_FileStore add, invalid param, msgId:");
            LIZ.append(l);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ));
            return;
        }
        if (!this.LIZIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("WaitDelCon_FileStore add, not init, msgId:");
            LIZ2.append(l);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
        }
        if (((ConcurrentHashMap) this.LIZ).containsKey(l)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("WaitDelCon_FileStore , add, already in cache, msgId:");
            LIZ3.append(l);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ3));
        }
        DeleteMsgRequest fromReqBody = DeleteMsgRequest.fromReqBody(0, deleteMessageRequestBody);
        ((ConcurrentHashMap) this.LIZ).put(deleteMessageRequestBody.message_id, fromReqBody);
        C63346Ota.LIZ().execute(new ARunnableS46S0100000_10(this, 29));
    }

    @Override // X.InterfaceC63328OtI
    public final void LIZIZ(Long l, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
        if (deleteStrangerMessageRequestBody == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WaitDelCon_FileStore add, invalid param, msgId:");
            LIZ.append(l);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ));
            return;
        }
        if (!this.LIZIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("WaitDelCon_FileStore add, not init, msgId:");
            LIZ2.append(l);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
        }
        if (((ConcurrentHashMap) this.LIZ).containsKey(l)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("WaitDelCon_FileStore , add, already in cache, msgId:");
            LIZ3.append(l);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ3));
        }
        DeleteMsgRequest fromReqBody = DeleteMsgRequest.fromReqBody(0, deleteStrangerMessageRequestBody);
        ((ConcurrentHashMap) this.LIZ).put(deleteStrangerMessageRequestBody.server_message_id, fromReqBody);
        C63346Ota.LIZ().execute(new ARunnableS46S0100000_10(this, 29));
    }
}
