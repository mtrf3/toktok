package X;

import android.os.Build;

/* renamed from: X.6Tq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161026Tq extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ C161006To LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C161026Tq(C161006To c161006To) {
        super(1);
        this.LJLIL = c161006To;
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
