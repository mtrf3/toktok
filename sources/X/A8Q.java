package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paid.content.consumption.CustomPaidContentSingleAnchorView$bindData$1", f = "CustomPaidContentSingleAnchorView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class A8Q extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ A8W LJLIL;
    public final /* synthetic */ AnchorCommonStruct LJLILLLLZI;
    public final /* synthetic */ InterfaceC44105HSr LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A8Q(A8W a8w, AnchorCommonStruct anchorCommonStruct, InterfaceC44105HSr interfaceC44105HSr, boolean z, int i, InterfaceC67352kd<? super A8Q> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = a8w;
        this.LJLILLLLZI = anchorCommonStruct;
        this.LJLJI = interfaceC44105HSr;
        this.LJLJJI = z;
        this.LJLJJL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new A8Q(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8Q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
