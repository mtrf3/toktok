package X;

import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorMediaProcess$buildRecordReturnArguments$1$1", f = "ExteriorMediaProcess.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class HTQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ ReturnEcommerceCommentModel LJLILLLLZI;
    public final /* synthetic */ HTN LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HTQ(ReturnEcommerceCommentModel returnEcommerceCommentModel, HTN htn, boolean z, String str, InterfaceC67352kd<? super HTQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = returnEcommerceCommentModel;
        this.LJLJI = htn;
        this.LJLJJI = z;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        HTQ htq = new HTQ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        htq.LJLIL = obj;
        return htq;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String LJIILIIL;
        C141335gf.LIZJ(obj);
        String str = "video";
        if (C48841JEv.LJIILLIIL((InterfaceC70422pa) this.LJLIL)) {
            ReturnEcommerceCommentModel returnEcommerceCommentModel = this.LJLILLLLZI;
            if (returnEcommerceCommentModel != null) {
                ((ArrayList) this.LJLJI.LIZLLL).add(returnEcommerceCommentModel);
            } else {
                boolean z = this.LJLJJI;
                if (!z) {
                    str = "photo";
                }
                String str2 = "";
                if (z) {
                    LJIILIIL = "";
                } else {
                    str2 = this.LJLJJL;
                    LJIILIIL = C44694HgQ.LJIILIIL(this.LJLJJL);
                    if (LJIILIIL == null) {
                        LJIILIIL = "image/jpeg";
                    }
                }
                long LJFF = C44694HgQ.LJFF(this.LJLJJL);
                long LJFF2 = C44694HgQ.LJFF(this.LJLJJL);
                String str3 = this.LJLJJL;
                ((ArrayList) this.LJLJI.LIZLLL).add(new ReturnEcommerceCommentModel(-1, str3, str3, new Long(LJFF), LJFF2, str, str2, LJIILIIL));
            }
            this.LJLJI.LIZJ.invoke("shoot", new C44124HTk(true, false, false), this.LJLJI.LIZLLL);
        } else {
            if (!this.LJLJJI) {
                str = "photo";
            }
            HTN htn = this.LJLJI;
            C44108HSu.LIZJ(htn.LIZIZ, this.LJLJJL, str, HTE.RECORD_COROUTINE_SCOPE_INACTIVE, "shoot", System.currentTimeMillis() - htn.LJIIL, "");
            this.LJLJI.LIZJ.invoke("shoot", new C44124HTk(false, false, true), null);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
