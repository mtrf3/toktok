package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* loaded from: classes7.dex */
public final class FWH extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final FWH LJLIL = new FWH();

    public FWH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepoFromSp(EF7.LIZIZ(), "feed_video_cache", 1);
    }
}