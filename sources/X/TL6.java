package X;

/* loaded from: classes13.dex */
public final /* synthetic */ class TL6 extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public TL6(TL5 tl5) {
        super(0, tl5, TL5.class, "onLoadMoreTriggered", "onLoadMoreTriggered()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        TL5 tl5 = (TL5) this.receiver;
        TL9<DATA> tl9 = tl5.LJJIII;
        if (tl9 != 0) {
            tl9.u10();
        }
        tl5.LJIILL.onNext(Long.valueOf(System.currentTimeMillis()));
        return C76800UCe.LIZ;
    }
}
