package X;

/* renamed from: X.G7d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40997G7d implements InterfaceC41450GOo {
    public final InterfaceC88472Yns<InterfaceC41450GOo, Boolean> LIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZIZ;
    public C40997G7d LIZJ;
    public final boolean LIZLLL = true;

    @Override // X.InterfaceC41450GOo
    public final void LIZ() {
    }

    @Override // X.InterfaceC41450GOo
    public final void LIZIZ() {
        C40997G7d c40997G7d = this.LIZJ;
        if (c40997G7d != null) {
            c40997G7d.LIZLLL();
        }
    }

    @Override // X.InterfaceC41450GOo
    public final void LIZJ() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZIZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public final void LIZLLL() {
        C40997G7d c40997G7d;
        if (!this.LIZ.invoke(this).booleanValue() && (c40997G7d = this.LIZJ) != null) {
            c40997G7d.LIZLLL();
        }
    }

    @Override // X.InterfaceC41450GOo
    public final boolean getIntercepted() {
        return this.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C40997G7d(InterfaceC88472Yns<? super InterfaceC41450GOo, Boolean> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = interfaceC65784Pro;
    }
}
