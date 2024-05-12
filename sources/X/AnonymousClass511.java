package X;

import com.ss.ugc.android.editor.components.base.api.ITrackService;

/* renamed from: X.511, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass511 extends AbstractC65781Prl implements InterfaceC65784Pro<C1284452i> {
    public static final AnonymousClass511 LJLIL = new AnonymousClass511();

    public AnonymousClass511() {
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
