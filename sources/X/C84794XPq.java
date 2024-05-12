package X;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.XPq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84794XPq<K, V> extends AbstractC65705PqX<InterfaceC84796XPs<K, V>> {
    public final /* synthetic */ C84795XPr LJLILLLLZI;

    @Override // X.AbstractC65705PqX
    public final InterfaceC84796XPs LIZ(Object obj) {
        InterfaceC84796XPs<K, V> LJI = ((InterfaceC84796XPs) obj).LJI();
        if (LJI == this.LJLILLLLZI.LJLIL) {
            return null;
        }
        return LJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84794XPq(C84795XPr c84795XPr, InterfaceC84796XPs interfaceC84796XPs) {
        super(interfaceC84796XPs);
        this.LJLILLLLZI = c84795XPr;
    }
}
