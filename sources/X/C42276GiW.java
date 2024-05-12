package X;

import com.bytedance.keva.Keva;

/* renamed from: X.GiW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42276GiW extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C42276GiW LJLIL = new C42276GiW();

    public C42276GiW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("local_music_cnt");
    }
}
