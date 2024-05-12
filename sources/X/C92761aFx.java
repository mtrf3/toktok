package X;

/* renamed from: X.aFx, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92761aFx extends AbstractC65781Prl implements InterfaceC65784Pro<Float> {
    public final /* synthetic */ C31431Lf LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92761aFx(C31431Lf c31431Lf, float f) {
        super(0);
        this.LJLIL = c31431Lf;
        this.LJLILLLLZI = f;
    }

    @Override // X.InterfaceC65784Pro
    public final Float invoke() {
        return Float.valueOf(this.LJLIL.LJ() / this.LJLILLLLZI);
    }
}
