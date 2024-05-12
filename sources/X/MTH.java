package X;

import com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM$setCacheNoticeResponse$1$1", f = "CreatorNoticeResultVM.kt", l = {739}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class MTH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ MT0 LJLJI;
    public final /* synthetic */ CreatorNoticeResultVM LJLJJI;
    public final /* synthetic */ CreatorNoticeResponse LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTH(MT0 mt0, CreatorNoticeResultVM creatorNoticeResultVM, CreatorNoticeResponse creatorNoticeResponse, InterfaceC67352kd<? super MTH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = mt0;
        this.LJLJJI = creatorNoticeResultVM;
        this.LJLJJL = creatorNoticeResponse;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        MTH mth = new MTH(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        mth.LJLILLLLZI = obj;
        return mth;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            NoticeTabModel noticeTabModel = this.LJLJI.LJLIL;
            if (noticeTabModel != null) {
                CreatorNoticeResultVM creatorNoticeResultVM = this.LJLJJI;
                CreatorNoticeResponse creatorNoticeResponse = this.LJLJJL;
                if (noticeTabModel.needCombineExtraData) {
                    InterfaceC65462ha interfaceC65462ha = (InterfaceC65462ha) MTD.LIZJ.getValue();
                    MTI mti = new MTI(creatorNoticeResultVM, creatorNoticeResponse, noticeTabModel, interfaceC70422pa);
                    this.LJLIL = 1;
                    if (interfaceC65462ha.collect(mti, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } else {
                    creatorNoticeResultVM.pv0(new C3C1(new MUB()), new C72912tb(creatorNoticeResponse), MT7.FIRST_REQUEST, noticeTabModel);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
