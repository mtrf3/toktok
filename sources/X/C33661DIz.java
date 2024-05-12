package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* renamed from: X.DIz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33661DIz extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C33661DIz LJLIL = new C33661DIz();

    public C33661DIz() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepo("dm_net_type_debug_options", 1);
    }
}
