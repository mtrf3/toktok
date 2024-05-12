package X;

import com.ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagAssem;
import com.ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8IP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8IP extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoFeedMultiTagAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C8IP LJLIL = new C8IP();

    public C8IP() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoFeedMultiTagAssem videoFeedMultiTagAssem, C43I<? extends Integer> c43i) {
        VideoItemParams gv0;
        VideoFeedMultiTagAssem selectSubscribe = videoFeedMultiTagAssem;
        C43I<? extends Integer> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (gv0 = selectSubscribe.q4().gv0()) != null && ((Number) c43i2.LIZ).intValue() == gv0.currentPosition) {
            VideoFeedMultiTagVM q4 = selectSubscribe.q4();
            q4.getClass();
            q4.setState(new AqS169S0100000_3(c43i2, (C43I<Integer>) 760));
        }
        return C76800UCe.LIZ;
    }
}
