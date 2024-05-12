package X;

import com.ss.ugc.android.editor.components.base.api.ITrackService;

/* renamed from: X.4z5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127274z5 extends AbstractC65781Prl implements InterfaceC65784Pro<C1284452i> {
    public static final C127274z5 LJLIL = new C127274z5();

    public C127274z5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C1284452i invoke() {
        ITrackService LIZJ = C127834zz.LIZJ();
        if (LIZJ != null) {
            return LIZJ.getMultiTrackController();
        }
        return null;
    }
}
