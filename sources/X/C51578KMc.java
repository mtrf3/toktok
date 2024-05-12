package X;

import java.lang.ref.SoftReference;

/* renamed from: X.KMc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51578KMc extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC46330IGg> {
    public final /* synthetic */ KMZ LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51578KMc(KMZ kmz) {
        super(0);
        this.LJLIL = kmz;
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC46330IGg invoke() {
        InterfaceC46330IGg LJIIIZ = this.LJLIL.LJIIIZ();
        if (LJIIIZ != null) {
            return LJIIIZ;
        }
        if (this.LJLIL.LJLJLJ) {
            SoftReference<InterfaceC46330IGg> softReference = KMZ.LLIIIZ;
            if (softReference == null || softReference.get() == null) {
                KMZ.LLIIIZ = new SoftReference<>(IQQ.LIZ.LIZ());
            }
            SoftReference<InterfaceC46330IGg> softReference2 = KMZ.LLIIIZ;
            if (softReference2 == null) {
                return null;
            }
            return softReference2.get();
        }
        return IQQ.LIZ.LIZ();
    }
}
