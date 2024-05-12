package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.6pM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172206pM extends AbstractC82879Wfr<InterfaceC172226pO> implements InterfaceC172226pO {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C172206pM(Context context) {
        super(context, null);
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC172226pO
    public final boolean LIZ(Context context, android.net.Uri uri, C173656rh c173656rh, int i, int i2) {
        ServiceConnectionC82880Wfs<INTERFACE> serviceConnectionC82880Wfs = this.LJLJJL;
        Object obj = null;
        if (serviceConnectionC82880Wfs != 0) {
            obj = serviceConnectionC82880Wfs.LJLIL.getValue();
        }
        InterfaceC172226pO interfaceC172226pO = (InterfaceC172226pO) obj;
        if (interfaceC172226pO != null) {
            interfaceC172226pO.LIZ(context, uri, c173656rh, i, i2);
            Boolean bool = Boolean.TRUE;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }
}
