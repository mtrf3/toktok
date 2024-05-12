package X;

/* loaded from: classes13.dex */
public final /* synthetic */ class TNN extends TBS implements InterfaceC88472Yns<Integer, C76800UCe> {
    public TNN(TNI tni) {
        super(1, tni, TNU.class, "onProgress", "onProgress(I)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        ((TNU) this.receiver).onProgress(num.intValue());
        return C76800UCe.LIZ;
    }
}
