package X;

import com.ss.ugc.android.editor.components.base.api.ITrackService;

/* renamed from: X.4z7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127294z7 extends AbstractC65781Prl implements InterfaceC65784Pro<C1284452i> {
    public static final C127294z7 LJLIL = new C127294z7();

    public C127294z7() {
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
