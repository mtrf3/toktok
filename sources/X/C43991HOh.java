package X;

import com.bytedance.keva.Keva;

/* renamed from: X.HOh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43991HOh extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C43991HOh LJLIL = new C43991HOh();

    public C43991HOh() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("dm_album");
    }
}
