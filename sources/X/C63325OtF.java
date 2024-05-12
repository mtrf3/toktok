package X;

import Y.ARunnableS46S0100000_10;
import android.text.TextUtils;
import com.bytedance.im.core.model.DeleteConversationRequest;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.OtF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C63325OtF implements InterfaceC63330OtK {
    public final java.util.Map<String, DeleteConversationRequest> LIZ = new ConcurrentHashMap();
    public volatile boolean LIZIZ = false;

    @Override // X.InterfaceC63330OtK
    public final void init() {
        C63346Ota.LIZIZ().execute(new ARunnableS46S0100000_10(this, 26));
    }

    @Override // X.InterfaceC63330OtK
    public final java.util.Map<String, DeleteConversationRequest> trigger() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WaitDelCon_FileStore trigger, cache:");
        LIZ.append(((ConcurrentHashMap) this.LIZ).size());
        LIZ.append(", isInit:");
        LIZ.append(this.LIZIZ);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (((ConcurrentHashMap) this.LIZ).isEmpty()) {
            return new HashMap();
        }
        Iterator it = ((ConcurrentHashMap) this.LIZ).values().iterator();
        while (it.hasNext()) {
            ((DeleteConversationRequest) it.next()).retryTimes++;
        }
        HashMap hashMap = new HashMap(this.LIZ);
        if (C63324OtE.LIZ != 2) {
            ((ConcurrentHashMap) this.LIZ).clear();
        }
        C63346Ota.LIZ().execute(new ARunnableS46S0100000_10(this, 27));
        return hashMap;
    }

    @Override // X.InterfaceC63330OtK
    public final void remove(String str) {
        if (TextUtils.isEmpty(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WaitDelCon_FileStore remove, invalid cid:");
            LIZ.append(str);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ));
            return;
        }
        if (((ConcurrentHashMap) this.LIZ).remove(str) == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("WaitDelCon_FileStore remove not exist, cid:");
            LIZ2.append(str);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
            return;
        }
        C63346Ota.LIZ().execute(new ARunnableS46S0100000_10(this, 27));
    }

    @Override // X.InterfaceC63330OtK
    public final void LIZ(int i, String str, DeleteConversationRequestBody deleteConversationRequestBody) {
        if (TextUtils.isEmpty(str) || deleteConversationRequestBody == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WaitDelCon_FileStore add, invalid param, cid:");
            LIZ.append(str);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ));
            return;
        }
        if (!this.LIZIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("WaitDelCon_FileStore add, not init, cid:");
            LIZ2.append(str);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
        }
        if (((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("WaitDelCon_FileStore , add, already in cache, cid:");
            LIZ3.append(str);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ3));
        }
        ((ConcurrentHashMap) this.LIZ).put(str, DeleteConversationRequest.fromReqBody(i, str, deleteConversationRequestBody));
        C63346Ota.LIZ().execute(new ARunnableS46S0100000_10(this, 27));
    }
}
