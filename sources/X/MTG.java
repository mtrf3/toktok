package X;

import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeTabVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeTabVM$requestNotice$1", f = "CreatorNoticeTabVM.kt", l = {51, 52}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class MTG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MT7 LJLILLLLZI;
    public final /* synthetic */ CreatorNoticeTabVM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTG(MT7 mt7, CreatorNoticeTabVM creatorNoticeTabVM, InterfaceC67352kd<? super MTG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = mt7;
        this.LJLJI = creatorNoticeTabVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new MTG(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MTG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
