package X;

import android.content.Context;

/* renamed from: X.QRu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67014QRu extends C78880UxY {
    public final Context LJLJI;

    public C67014QRu(Context context) {
        this.LJLJI = context;
    }

    @Override // X.C78880UxY
    public final boolean LJJLI(InterfaceC67012QRs interfaceC67012QRs, int i) {
        if (interfaceC67012QRs != null && interfaceC67012QRs.isPushAvailable(this.LJLJI, i)) {
            return true;
        }
        return false;
    }
}
