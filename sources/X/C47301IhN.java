package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* renamed from: X.IhN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47301IhN extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C47301IhN LJLIL = new C47301IhN();

    public C47301IhN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepo("keva_player_setting_center", 0);
    }
}
