package X;

import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishState;
import kotlin.jvm.internal.o;

/* renamed from: X.G8q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41036G8q extends AbstractC65781Prl implements InterfaceC88472Yns<VideoPublishState, VideoPublishState> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41036G8q(boolean z, boolean z2) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
    }

    @Override // X.InterfaceC88472Yns
    public final VideoPublishState invoke(VideoPublishState videoPublishState) {
        VideoPublishState setStateImmediate = videoPublishState;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return VideoPublishState.copy$default(setStateImmediate, null, new C45927I0t(new C41035G8p(this.LJLIL, this.LJLILLLLZI)), 1, null);
    }
}
