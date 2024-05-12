package X;

/* renamed from: X.R8a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69048R8a extends AbstractC68940R3w {
    public final /* synthetic */ InterfaceC88472Yns<C69075R9b, C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC88471Ynr<C69075R9b, Integer, C76800UCe> LIZIZ;

    @Override // X.AbstractC67055QTj
    public final void onSuccess(QQI qqi) {
        this.LIZ.invoke(qqi);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C69048R8a(InterfaceC88472Yns<? super C69075R9b, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C69075R9b, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = interfaceC88471Ynr;
    }

    @Override // X.AbstractC67055QTj
    public final void onError(QQI qqi, int i) {
        this.LIZIZ.invoke(qqi, Integer.valueOf(i));
    }
}
