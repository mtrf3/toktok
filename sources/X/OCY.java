package X;

import com.bytedance.keva.Keva;

/* loaded from: classes11.dex */
public final class OCY extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final OCY LJLIL = new OCY();

    public OCY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("commerce_sticker_reminder");
    }
}
