package X;

import android.content.Intent;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;

/* renamed from: X.QOl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66927QOl extends AbstractC66932QOq {
    public C66927QOl(InterfaceC66931QOp interfaceC66931QOp) {
        super(interfaceC66931QOp);
    }

    @Override // X.InterfaceC66937QOv
    public final void LIZ(Intent intent, C66938QOw c66938QOw) {
        intent.setExtrasClassLoader(ServiceConnectEvent.class.getClassLoader());
        try {
            this.LIZ.onReceiveServiceEvent((ServiceConnectEvent) intent.getParcelableExtra("service"));
        } catch (Throwable unused) {
        }
    }
}
