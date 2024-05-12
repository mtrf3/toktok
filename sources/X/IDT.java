package X;

import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public class IDT implements InterfaceC46803IYl {
    public final WeakReference<IDP> LIZ;

    public IDT(IDP idp) {
        this.LIZ = new WeakReference<>(idp);
    }

    @Override // X.InterfaceC46803IYl
    public final void LIZ(int i, long j, String str, int i2) {
        IDP idp = this.LIZ.get();
        if (idp == null) {
            return;
        }
        idp.LLII.put(str, Boolean.TRUE);
        C2MA viewHolderByAwemeId = idp.getViewHolderByAwemeId(str);
        if (viewHolderByAwemeId == null) {
            return;
        }
        viewHolderByAwemeId.o8(i, str, idp.LLIIII.containsKey(str));
    }
}
