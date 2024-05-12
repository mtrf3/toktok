package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8IQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8IQ extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoFeedMultiTagAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C8IQ LJLIL = new C8IQ();

    public C8IQ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoFeedMultiTagAssem videoFeedMultiTagAssem, C43I<? extends Boolean> c43i) {
        Boolean LIZ;
        int i;
        VideoFeedMultiTagAssem selectSubscribe = videoFeedMultiTagAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (LIZ = c43i2.LIZ()) != null) {
            boolean booleanValue = LIZ.booleanValue();
            View containerView = selectSubscribe.getContainerView();
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            containerView.setVisibility(i);
        }
        return C76800UCe.LIZ;
    }
}
