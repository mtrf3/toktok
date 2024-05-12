package X;

import com.ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagAssem;
import com.ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagVM;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8IR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8IR extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoFeedMultiTagAssem, C227678wd, C76800UCe> {
    public static final C8IR LJLIL = new C8IR();

    public C8IR() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoFeedMultiTagAssem videoFeedMultiTagAssem, C227678wd c227678wd) {
        VideoFeedMultiTagAssem selectSubscribe = videoFeedMultiTagAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c227678wd != null) {
            VideoFeedMultiTagVM q4 = selectSubscribe.q4();
            q4.getClass();
            q4.setState(new AqS169S0100000_3(q4, 761));
        }
        return C76800UCe.LIZ;
    }
}
