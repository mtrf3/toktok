package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ui.feed.FeedPhotoSlideAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.810, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass810 extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedPhotoSlideAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final AnonymousClass810 LJLIL = new AnonymousClass810();

    public AnonymousClass810() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedPhotoSlideAssem feedPhotoSlideAssem, C43I<? extends C76800UCe> c43i) {
        FeedPhotoSlideAssem selectSubscribe = feedPhotoSlideAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ((AssemViewModel) selectSubscribe.LLI.getValue()).setState(AnonymousClass817.LJLIL);
        return C76800UCe.LIZ;
    }
}
