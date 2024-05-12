package X;

import android.content.Context;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.AVDraftServiceImpl$editPostedDraft$1", f = "AVDraftServiceImpl.kt", l = {79, 82}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GLQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public AwemeDraft LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C41415GNf LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLQ(C41415GNf c41415GNf, Context context, String str, InterfaceC67352kd<? super GLQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c41415GNf;
        this.LJLJJI = context;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GLQ(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        AwemeDraft awemeDraft;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    awemeDraft = this.LJLIL;
                    C141335gf.LIZJ(obj);
                    C41663GWt.LIZJ(C45804HyK.LJJIFFI(this.LJLJJI), awemeDraft, 3, System.currentTimeMillis(), null, null);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            XIA xia = C78613UtF.LIZJ;
            GLR glr = new GLR(this.LJLJJL, null);
            this.LJLILLLLZI = 1;
            obj = XKX.LJI(xia, glr, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AwemeDraft awemeDraft2 = (AwemeDraft) obj;
        if (awemeDraft2 == null) {
            return C76800UCe.LIZ;
        }
        C41415GNf c41415GNf = this.LJLJI;
        Context context = this.LJLJJI;
        this.LJLIL = awemeDraft2;
        this.LJLILLLLZI = 2;
        if (c41415GNf.LIZ(awemeDraft2, context, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        awemeDraft = awemeDraft2;
        C41663GWt.LIZJ(C45804HyK.LJJIFFI(this.LJLJJI), awemeDraft, 3, System.currentTimeMillis(), null, null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
