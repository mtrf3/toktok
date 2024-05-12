package X;

import android.text.TextUtils;

/* renamed from: X.DpL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35055DpL extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35055DpL LJLIL = new C35055DpL();

    public C35055DpL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(TextUtils.equals(EF7.LJIILIIL, "local_test"));
    }
}
