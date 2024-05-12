package X;

import android.os.Build;

/* renamed from: X.6Tw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161086Tw extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ C161096Tx LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C161086Tw(C161096Tx c161096Tx) {
        super(1);
        this.LJLIL = c161096Tx;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        C161096Tx c161096Tx = this.LJLIL;
        if (c161096Tx.LJLJL != null) {
            c161096Tx.getContentEditText().setClickable(booleanValue);
            this.LJLIL.getContentEditText().setLongClickable(booleanValue);
            if (Build.VERSION.SDK_INT >= 23) {
                this.LJLIL.getContentEditText().setContextClickable(booleanValue);
            }
        }
        C161096Tx c161096Tx2 = this.LJLIL;
        if (c161096Tx2.LJLJLJ != null) {
            c161096Tx2.getContentTextView().setClickable(booleanValue);
            this.LJLIL.getContentTextView().setLongClickable(booleanValue);
            if (Build.VERSION.SDK_INT >= 23) {
                this.LJLIL.getContentTextView().setContextClickable(booleanValue);
            }
        }
        return C76800UCe.LIZ;
    }
}
