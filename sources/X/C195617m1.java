package X;

import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowOtherCollectionListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.feed.viewmodel.NowOtherCollectionListViewModel$onLoadBefore$3", f = "NowOtherCollectionListViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7m1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195617m1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ NowOtherCollectionListViewModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C195617m1(NowOtherCollectionListViewModel nowOtherCollectionListViewModel, String str, InterfaceC67352kd<? super C195617m1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = nowOtherCollectionListViewModel;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C195617m1(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L39;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195617m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
