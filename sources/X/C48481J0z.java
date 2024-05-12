package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* renamed from: X.J0z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48481J0z extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C48481J0z LJLIL = new C48481J0z();

    public C48481J0z() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepoFromSp(EF7.LIZIZ(), "nearby_feed_video_cache", 1);
    }
}
