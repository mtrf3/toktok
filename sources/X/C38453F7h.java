package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* renamed from: X.F7h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38453F7h extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C38453F7h LJLIL = new C38453F7h();

    public C38453F7h() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepoSync("player_setting", 0);
    }
}
