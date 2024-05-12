package X;

import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.o;

/* renamed from: X.HLs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43924HLs extends AbstractC65781Prl implements InterfaceC88472Yns<PublishModel, Video> {
    public static final C43924HLs LJLIL = new C43924HLs();

    public C43924HLs() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Video invoke(PublishModel publishModel) {
        PublishModel it = publishModel;
        o.LJIIIZ(it, "it");
        if (it.isStoryPublish && it.videoType == 11) {
            C43921HLp.LIZ.getClass();
            return C43921HLp.LJIILIIL(it);
        }
        return HM1.LIZJ(it.creationId);
    }
}
