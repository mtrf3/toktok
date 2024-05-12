package X;

import com.bytedance.keva.Keva;

/* loaded from: classes8.dex */
public final class H9I extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final H9I LJLIL = new H9I();

    public H9I() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("sticker_bind_music");
    }
}
