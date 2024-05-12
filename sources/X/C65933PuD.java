package X;

import com.bytedance.helios.network.NetworkComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.PuD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65933PuD implements InterfaceC65941PuL {
    @Override // X.InterfaceC65941PuL
    public final void LIZ(int i, String tag, String str, Throwable th) {
        o.LJIIIZ(tag, "tag");
        if (C65926Pu6.LIZIZ && i == 6 && th != null) {
            NetworkComponent.INSTANCE.reportException(tag, str, th);
        }
    }

    @Override // X.InterfaceC65941PuL
    public final void LIZIZ(String tag, InterfaceC65784Pro<String> interfaceC65784Pro, int i, Throwable th) {
        String str;
        o.LJIIIZ(tag, "tag");
        if (!C65926Pu6.LIZIZ && i == 6 && th != null) {
            NetworkComponent networkComponent = NetworkComponent.INSTANCE;
            if (interfaceC65784Pro != null) {
                str = interfaceC65784Pro.invoke();
            } else {
                str = null;
            }
            networkComponent.reportException(tag, str, th);
        }
    }
}
