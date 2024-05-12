package X;

import android.content.Context;

/* renamed from: X.Whm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82998Whm extends AbstractC82995Whj {
    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final void release() {
        InterfaceC37790EsM interfaceC37790EsM;
        String LIZ;
        Context context = (Context) LJII(Context.class);
        if (context == null || (interfaceC37790EsM = (InterfaceC37790EsM) LJII(InterfaceC37790EsM.class)) == null || (LIZ = interfaceC37790EsM.LIZ()) == null || LIZ.length() == 0) {
            return;
        }
        C79522VIw.LIZ(context, LIZ, null, null);
    }
}
