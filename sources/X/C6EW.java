package X;

import com.bytedance.keva.Keva;

/* renamed from: X.6EW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6EW extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C6EW LJLIL = new C6EW();

    public C6EW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("audio_copyright_detect");
    }
}
