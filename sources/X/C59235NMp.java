package X;

/* renamed from: X.NMp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59235NMp implements InterfaceC59238NMs {
    public final /* synthetic */ C59232NMm LIZ;

    public C59235NMp(C59232NMm c59232NMm) {
        this.LIZ = c59232NMm;
    }

    @Override // X.InterfaceC59238NMs
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        InterfaceC59236NMq scrollListener = this.LIZ.getScrollListener();
        if (scrollListener != null) {
            scrollListener.onScrollChanged(i, i2, i3, i4);
        }
    }
}
