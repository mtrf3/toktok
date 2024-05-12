package X;

/* renamed from: X.Ofd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C62481Ofd extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C62481Ofd(Object obj) {
        super(0, obj, DialogC62475OfX.class, "doWhenConfigurationChanged", "doWhenConfigurationChanged()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        OVT ovt;
        DialogC62475OfX dialogC62475OfX = (DialogC62475OfX) this.receiver;
        dialogC62475OfX.LJIJJLI(dialogC62475OfX.LJLJL);
        dialogC62475OfX.LJJ();
        if (dialogC62475OfX.LJLL && dialogC62475OfX.isShowing() && (ovt = C62494Ofq.LJI) != null && !ovt.LIZIZ(dialogC62475OfX.LJLJLJ)) {
            dialogC62475OfX.dismiss();
        }
        return C76800UCe.LIZ;
    }
}
