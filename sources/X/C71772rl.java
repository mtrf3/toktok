package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import fjb.a;

/* JADX WARN: Incorrect field signature: TRESP; */
@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.resource.StickerStoreResourceManager$fetchFromNetwork$2$1", f = "StickerStoreResourceManager.kt", l = {213}, m = "invokeSuspend")
/* renamed from: X.2rl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71772rl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AbstractC71812rp<DATA, RESP, KEY, OBSERVER> LJLILLLLZI;
    public final /* synthetic */ BaseResponse LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/2rp<TDATA;TRESP;TKEY;TOBSERVER;>;TRESP;LX/2kd<-LX/2rl;>;)V */
    public C71772rl(AbstractC71812rp abstractC71812rp, BaseResponse baseResponse, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = abstractC71812rp;
        this.LJLJI = baseResponse;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71772rl(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            AbstractC71812rp<DATA, RESP, KEY, OBSERVER> abstractC71812rp = this.LJLILLLLZI;
            BaseResponse baseResponse = this.LJLJI;
            this.LJLIL = 1;
            obj = abstractC71812rp.LJII(baseResponse, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC71812rp<DATA, RESP, KEY, OBSERVER> abstractC71812rp2 = this.LJLILLLLZI;
        for (OSZ osz : (Iterable) obj) {
            abstractC71812rp2.LJIJJLI(osz.getFirst(), osz.getSecond());
            abstractC71812rp2.LJIJJ(osz.getFirst(), osz.getSecond());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
