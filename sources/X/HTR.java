package X;

import Y.IDComparatorS35S0000000_7;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorMediaProcess$buildUploadReturnArguments$1$1", f = "ExteriorMediaProcess.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class HTR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ ReturnEcommerceCommentModel LJLILLLLZI;
    public final /* synthetic */ HTN LJLJI;
    public final /* synthetic */ MyMediaModel LJLJJI;
    public final /* synthetic */ List<MyMediaModel> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HTR(ReturnEcommerceCommentModel returnEcommerceCommentModel, HTN htn, MyMediaModel myMediaModel, List<MyMediaModel> list, InterfaceC67352kd<? super HTR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = returnEcommerceCommentModel;
        this.LJLJI = htn;
        this.LJLJJI = myMediaModel;
        this.LJLJJL = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        HTR htr = new HTR(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        htr.LJLIL = obj;
        return htr;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C141335gf.LIZJ(obj);
        if (C48841JEv.LJIILLIIL((InterfaceC70422pa) this.LJLIL)) {
            ReturnEcommerceCommentModel returnEcommerceCommentModel = this.LJLILLLLZI;
            if (returnEcommerceCommentModel != null) {
                ((ArrayList) this.LJLJI.LIZLLL).add(returnEcommerceCommentModel);
            } else {
                String LJIIL = C44694HgQ.LJIIL(this.LJLJJI);
                if (this.LJLJJI.LJI()) {
                    str = "video";
                } else {
                    str = "photo";
                }
                String mimeType = "";
                if (this.LJLJJI.LJI()) {
                    str2 = "";
                } else {
                    str2 = LJIIL;
                }
                if (!this.LJLJJI.LJI()) {
                    mimeType = this.LJLJJI.mimeType;
                }
                MyMediaModel myMediaModel = this.LJLJJI;
                int i = myMediaModel.selectIndex;
                long j = myMediaModel.fileSize;
                Long l = new Long(j);
                o.LJIIIIZZ(mimeType, "mimeType");
                ((ArrayList) this.LJLJI.LIZLLL).add(new ReturnEcommerceCommentModel(i, LJIIL, LJIIL, l, j, str, str2, mimeType));
            }
            if (((ArrayList) this.LJLJI.LIZLLL).size() == this.LJLJJL.size()) {
                ArrayList arrayList = (ArrayList) this.LJLJI.LIZLLL;
                if (arrayList.size() > 1) {
                    C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS35S0000000_7(1));
                }
                this.LJLJI.LIZJ.invoke("upload", new C44124HTk(true, false, false), this.LJLJI.LIZLLL);
            }
        } else {
            ShortVideoContext shortVideoContext = this.LJLJI.LIZIZ;
            String str3 = this.LJLJJI.fileLocalUriPath;
            o.LJIIIIZZ(str3, "mediaModel.fileLocalUriPath");
            C44108HSu.LIZJ(shortVideoContext, str3, "mix", HTE.UPLOAD_COROUTINE_SCOPE_INACTIVE, "upload", System.currentTimeMillis() - this.LJLJI.LJIIL, "");
            this.LJLJI.LIZJ.invoke("upload", new C44124HTk(false, false, true), null);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
