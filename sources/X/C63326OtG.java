package X;

import android.text.TextUtils;
import com.bytedance.im.core.model.DeleteConversationRequest;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.OtG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C63326OtG implements InterfaceC63330OtK {
    public final java.util.Map<String, DeleteConversationRequest> LIZ = new ConcurrentHashMap();

    @Override // X.InterfaceC63330OtK
    public final void init() {
    }

    @Override // X.InterfaceC63330OtK
    public final java.util.Map<String, DeleteConversationRequest> trigger() {
        Iterator it = ((ConcurrentHashMap) this.LIZ).values().iterator();
        while (it.hasNext()) {
            ((DeleteConversationRequest) it.next()).retryTimes++;
        }
        HashMap hashMap = new HashMap(this.LIZ);
        ((ConcurrentHashMap) this.LIZ).clear();
        return hashMap;
    }

    @Override // X.InterfaceC63330OtK
    public final void remove(String str) {
        if (!TextUtils.isEmpty(str)) {
            ((ConcurrentHashMap) this.LIZ).remove(str);
        }
    }

    @Override // X.InterfaceC63330OtK
    public final void LIZ(int i, String str, DeleteConversationRequestBody deleteConversationRequestBody) {
        if (TextUtils.isEmpty(str) || deleteConversationRequestBody == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WaitDelCon_CacheStoreadd, invalid param, cid:");
            LIZ.append(str);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ));
            return;
        }
        if (((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("WaitDelCon_CacheStore, add, already in cache, cid:");
            LIZ2.append(str);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
        }
        ((ConcurrentHashMap) this.LIZ).put(str, DeleteConversationRequest.fromReqBody(i, str, deleteConversationRequestBody));
    }
}
