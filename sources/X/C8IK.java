package X;

import com.ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8IK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8IK extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoFeedMultiTagAssem, Double, C76800UCe> {
    public static final C8IK LJLIL = new C8IK();

    public C8IK() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoFeedMultiTagAssem videoFeedMultiTagAssem, Double d) {
        C8IM c8im;
        VideoFeedMultiTagAssem selectSubscribe = videoFeedMultiTagAssem;
        Double d2 = d;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (d2 != null) {
            double doubleValue = d2.doubleValue();
            C7G8 c7g8 = selectSubscribe.LLFZ;
            if (c7g8 != null && (c8im = c7g8.LJLJJL) != null) {
                c8im.LJFF(doubleValue);
            }
        }
        return C76800UCe.LIZ;
    }
}
