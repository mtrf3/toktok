package X;

import com.ss.ugc.android.editor.components.base.api.IFunctionBarService;

/* renamed from: X.51o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1282451o extends AbstractC65781Prl implements InterfaceC65784Pro<C50Q> {
    public static final C1282451o LJLIL = new C1282451o();

    public C1282451o() {
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
