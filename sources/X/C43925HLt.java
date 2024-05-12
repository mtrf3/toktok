package X;

import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.o;

/* renamed from: X.HLt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43925HLt extends AbstractC65781Prl implements InterfaceC88472Yns<PublishModel, Video> {
    public static final C43925HLt LJLIL = new C43925HLt();

    public C43925HLt() {
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
        return null;
    }
}
