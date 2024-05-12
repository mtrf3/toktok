package X;

import com.ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8IJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8IJ extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoFeedMultiTagAssem, C43I<? extends Float>, C76800UCe> {
    public static final C8IJ LJLIL = new C8IJ();

    public C8IJ() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoFeedMultiTagAssem videoFeedMultiTagAssem, C43I<? extends Float> c43i) {
        C8IM c8im;
        VideoFeedMultiTagAssem selectSubscribe = videoFeedMultiTagAssem;
        C43I<? extends Float> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            float floatValue = ((Number) c43i2.LIZ).floatValue();
            C7G8 c7g8 = selectSubscribe.LLFZ;
            if (c7g8 != null && (c8im = c7g8.LJLJJL) != null) {
                c8im.LJI(floatValue);
            }
        }
        return C76800UCe.LIZ;
    }
}
