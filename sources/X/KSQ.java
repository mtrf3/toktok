package X;

import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KSQ extends AbstractC65781Prl implements InterfaceC88472Yns<KSM, C76800UCe> {
    public final /* synthetic */ HashtagFeedbackViewModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KSQ(HashtagFeedbackViewModel hashtagFeedbackViewModel, String str, boolean z) {
        super(1);
        this.LJLIL = hashtagFeedbackViewModel;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(KSM it) {
        o.LJIIIZ(it, "it");
        this.LJLIL.setState(new KSP(this.LJLILLLLZI, this.LJLJI));
        return C76800UCe.LIZ;
    }
}
