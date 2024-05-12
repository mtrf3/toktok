package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.o;

/* renamed from: X.J8n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48677J8n extends AbstractC65781Prl implements InterfaceC88472Yns<Aweme, Video> {
    public static final C48677J8n LJLIL = new C48677J8n();

    public C48677J8n() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Video invoke(Aweme aweme) {
        Aweme it = aweme;
        o.LJIIIZ(it, "it");
        Video video = it.getVideo();
        if (video != null) {
            video.setRationAndSourceId(it.getAid());
            return video;
        }
        return null;
    }
}
