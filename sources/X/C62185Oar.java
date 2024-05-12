package X;

import com.bytedance.keva.Keva;

/* renamed from: X.Oar, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62185Oar extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C62185Oar LJLIL = new C62185Oar();

    public C62185Oar() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("qrcode_cache");
    }
}
