package X;

import com.ss.android.ugc.aweme.services.sticker.ICaptionService;
import com.ss.android.ugc.aweme.shortvideo.subtitle.CaptionServiceImpl;

/* loaded from: classes8.dex */
public final class GMV extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final GMV LJLIL = new GMV();

    public GMV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        ICaptionService LIZ = CaptionServiceImpl.LIZ();
        if (LIZ != null) {
            return LIZ.getCaptionCacheDir();
        }
        return null;
    }
}
