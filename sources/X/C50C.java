package X;

import com.ss.ugc.android.editor.components.base.api.ITrackService;

/* renamed from: X.50C, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C50C extends AbstractC65781Prl implements InterfaceC65784Pro<C58D> {
    public static final C50C LJLIL = new C50C();

    public C50C() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C58D invoke() {
        C1284452i multiTrackController;
        ITrackService LIZJ = C127834zz.LIZJ();
        if (LIZJ != null && (multiTrackController = LIZJ.getMultiTrackController()) != null) {
            return multiTrackController.LJLIL;
        }
        return null;
    }
}
