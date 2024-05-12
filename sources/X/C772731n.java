package X;

/* renamed from: X.31n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C772731n extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C772731n LJLIL = new C772731n();

    public C772731n() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        int LIZIZ = Q7K.LIZIZ("tt_im_inner_push_queue_clear_event_config", 10);
        boolean z = false;
        if (1 <= LIZIZ && LIZIZ < 101 && System.currentTimeMillis() % 100 < LIZIZ) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
