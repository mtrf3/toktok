package X;

import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishState;
import kotlin.jvm.internal.o;

/* renamed from: X.G8r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41037G8r extends AbstractC65781Prl implements InterfaceC88472Yns<VideoPublishState, VideoPublishState> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41037G8r(boolean z, boolean z2, boolean z3, boolean z4) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = z3;
        this.LJLJJI = z4;
    }

    @Override // X.InterfaceC88472Yns
    public final VideoPublishState invoke(VideoPublishState videoPublishState) {
        VideoPublishState setStateImmediate = videoPublishState;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return VideoPublishState.copy$default(setStateImmediate, new C45927I0t(new C41040G8u(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI)), null, 2, null);
    }
}
