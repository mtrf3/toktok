package X;

/* renamed from: X.GiL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42265GiL implements InterfaceC42275GiV {
    public final /* synthetic */ AbstractC42266GiM<Object> LIZ;

    public C42265GiL(AbstractC42266GiM<Object> abstractC42266GiM) {
        this.LIZ = abstractC42266GiM;
    }

    @Override // X.InterfaceC42275GiV
    public final void onFinish(boolean z) {
        if (z) {
            ((C42263GiJ) this.LIZ).LJ.invoke();
        } else {
            ((C42263GiJ) this.LIZ).LJFF.invoke();
        }
    }
}
