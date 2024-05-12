package X;

/* renamed from: X.MIy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56592MIy implements InterfaceC58602MzG<Boolean, Integer> {
    public final String LIZ;
    public final InterfaceC88472Yns<M95, Boolean> LIZIZ;
    public final boolean LIZJ = true;

    @Override // X.InterfaceC58602MzG
    public final InterfaceC88472Yns<M95, Boolean> LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC58602MzG
    public final boolean LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC58602MzG
    public final String getName() {
        return this.LIZ;
    }

    @Override // X.InterfaceC58602MzG
    public final Integer LIZ(Boolean bool) {
        return Integer.valueOf(bool.booleanValue() ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C56592MIy(String str, InterfaceC88472Yns<? super M95, Boolean> interfaceC88472Yns) {
        this.LIZ = str;
        this.LIZIZ = interfaceC88472Yns;
    }
}
