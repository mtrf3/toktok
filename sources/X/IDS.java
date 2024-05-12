package X;

import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public class IDS implements InterfaceC46803IYl {
    public final WeakReference<IDP> LIZ;
    public final /* synthetic */ IDP LIZIZ;

    public IDS(IDP idp, IDP idp2) {
        this.LIZIZ = idp;
        this.LIZ = new WeakReference<>(idp2);
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
        viewHolderByAwemeId.o8(i, str, containsKey(str));
    }
}
