package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM$publish$1", f = "TopicReviewVM.kt", l = {117, LiveTryModeCountDownThresholdSetting.DEFAULT, 123, 134, 181}, m = "invokeSuspend")
/* renamed from: X.7Sp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186237Sp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ TopicReview LJLJI;
    public final /* synthetic */ TopicReviewVM LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ Fragment LJLJL;
    public final /* synthetic */ DialogC25756A8y LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C186237Sp(TopicReview topicReview, TopicReviewVM topicReviewVM, int i, String str, Fragment fragment, DialogC25756A8y dialogC25756A8y, InterfaceC67352kd<? super C186237Sp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = topicReview;
        this.LJLJJI = topicReviewVM;
        this.LJLJJL = i;
        this.LJLJJLL = str;
        this.LJLJL = fragment;
        this.LJLJLJ = dialogC25756A8y;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C186237Sp(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Type inference failed for: r0v0, types: [int, X.2mC] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r7v16, types: [T, java.lang.String] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C186237Sp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
