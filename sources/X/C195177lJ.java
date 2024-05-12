package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionListAssem;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7lJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195177lJ extends AbstractC65781Prl implements InterfaceC88471Ynr<NowOtherCollectionListAssem, AbstractC194637kR, C76800UCe> {
    public static final C195177lJ LJLIL = new C195177lJ();

    public C195177lJ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowOtherCollectionListAssem nowOtherCollectionListAssem, AbstractC194637kR abstractC194637kR) {
        NowOtherCollectionListAssem subscribePostState = nowOtherCollectionListAssem;
        AbstractC194637kR nowPostState = abstractC194637kR;
        o.LJIIIZ(subscribePostState, "$this$subscribePostState");
        o.LJIIIZ(nowPostState, "nowPostState");
        AssemViewModel assemViewModel = (AssemViewModel) subscribePostState.LLFF.LIZ(subscribePostState, NowOtherCollectionListAssem.LLIIIJ[1]);
        assemViewModel.getClass();
        assemViewModel.setStateImmediate(new AqS169S0100000_3(nowPostState, 28));
        return C76800UCe.LIZ;
    }
}
