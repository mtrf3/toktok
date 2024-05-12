package X;

import com.bytedance.keva.Keva;

/* renamed from: X.4XJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4XJ extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C4XJ LJLIL = new C4XJ();

    public C4XJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("dm_camera_files");
    }
}
