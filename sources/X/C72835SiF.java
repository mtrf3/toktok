package X;

import com.bytedance.keva.Keva;

/* renamed from: X.SiF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72835SiF extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C72835SiF LJLIL = new C72835SiF();

    public C72835SiF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("music_consumption_common_repo");
    }
}
