package X;

import android.os.Build;

/* renamed from: X.6S6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6S6 extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ C6S4 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6S6(C6S4 c6s4) {
        super(1);
        this.LJLIL = c6s4;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        this.LJLIL.getContentEditText().setClickable(booleanValue);
        this.LJLIL.getContentEditText().setLongClickable(booleanValue);
        if (Build.VERSION.SDK_INT >= 23) {
            this.LJLIL.getContentEditText().setContextClickable(booleanValue);
        }
        return C76800UCe.LIZ;
    }
}
