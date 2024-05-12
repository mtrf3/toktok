package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* renamed from: X.4Ag, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105024Ag extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C105024Ag LJLIL = new C105024Ag();

    public C105024Ag() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepo("dm_share_panel_debug_options", 1);
    }
}
