package X;

import android.util.LruCache;

/* renamed from: X.Noi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60496Noi extends LruCache<C60318Nlq, VNS> {
    public final InterfaceC60503Nop LIZ;

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ VNS create(C60318Nlq c60318Nlq) {
        return null;
    }

    public C60496Noi(int i, InterfaceC60503Nop interfaceC60503Nop) {
        super(i);
        this.LIZ = interfaceC60503Nop;
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, C60318Nlq c60318Nlq, VNS vns, VNS vns2) {
        InterfaceC60503Nop interfaceC60503Nop;
        VNS vns3 = vns;
        if (z && (interfaceC60503Nop = this.LIZ) != null) {
            InterfaceC60493Nof LIZ = ((C60498Nok) interfaceC60503Nop).LIZ();
            if (LIZ != null) {
                LIZ.LJ(vns3);
            }
            vns3.destroy();
        }
    }
}
