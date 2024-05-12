package X;

import com.ss.ugc.android.editor.components.base.api.IFunctionBarService;

/* renamed from: X.50E, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C50E extends AbstractC65781Prl implements InterfaceC65784Pro<C50Q> {
    public static final C50E LJLIL = new C50E();

    public C50E() {
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
