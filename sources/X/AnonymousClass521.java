package X;

import com.ss.ugc.android.editor.components.base.api.IFunctionBarService;

/* renamed from: X.521, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass521 extends AbstractC65781Prl implements InterfaceC65784Pro<C50Q> {
    public static final AnonymousClass521 LJLIL = new AnonymousClass521();

    public AnonymousClass521() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C50Q invoke() {
        IFunctionBarService LIZ = C127834zz.LIZ();
        if (LIZ != null) {
            return LIZ.getFuncBarController();
        }
        return null;
    }
}
