package X;

import android.content.Intent;
import com.bytedance.common.utility.Logger;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.QOj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66925QOj extends AbstractC66932QOq {
    public final java.util.Map<String, InterfaceC66937QOv> LIZIZ;

    public C66925QOj(InterfaceC66931QOp interfaceC66931QOp) {
        super(interfaceC66931QOp);
        HashMap hashMap = new HashMap();
        hashMap.put("com.bytedance.article.wschannel.receive.connection", new C66929QOn(interfaceC66931QOp));
        hashMap.put("com.bytedance.article.wschannel.syncconnectstate", new C66928QOm(interfaceC66931QOp));
        hashMap.put("com.bytedance.article.wschannel.receive.progress", new C66936QOu(interfaceC66931QOp));
        hashMap.put("com.bytedance.article.wschannel.receive.payload", new C66924QOi(interfaceC66931QOp));
        hashMap.put("com.bytedance.article.wschannel.send.payload", new C66926QOk(interfaceC66931QOp));
        hashMap.put("com.bytedance.article.wschannel.receive.service", new C66927QOl(interfaceC66931QOp));
        this.LIZIZ = Collections.unmodifiableMap(hashMap);
    }

    @Override // X.InterfaceC66937QOv
    public final void LIZ(Intent intent, C66938QOw c66938QOw) {
        try {
            InterfaceC66937QOv interfaceC66937QOv = this.LIZIZ.get(intent.getAction());
            if (interfaceC66937QOv != null) {
                interfaceC66937QOv.LIZ(intent, c66938QOw);
            }
        } catch (Throwable unused) {
        }
        if (Logger.debug()) {
            intent.getIntExtra("msg_count", -1);
        }
    }
}
