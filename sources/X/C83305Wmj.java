package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.download.DraftStickerDownloadListener$onSuccessed$1", f = "DraftStickerDownloadListener.kt", l = {38}, m = "invokeSuspend")
/* renamed from: X.Wmj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83305Wmj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C83304Wmi LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83305Wmj(C83304Wmi c83304Wmi, InterfaceC67352kd<? super C83305Wmj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c83304Wmi;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C83305Wmj(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            Effect effect = this.LJLILLLLZI.LJLIL.LJ;
            this.LJLIL = 1;
            Object LJI = XKX.LJI(C78613UtF.LIZJ, new C6I4(effect, null), this);
            if (LJI != obj2) {
                LJI = C76800UCe.LIZ;
            }
            if (LJI == obj2) {
                return obj2;
            }
        }
        this.LJLILLLLZI.LJLIL.LIZ(3);
        C83304Wmi c83304Wmi = this.LJLILLLLZI;
        AbstractC83312Wmq<Effect, C76800UCe> abstractC83312Wmq = c83304Wmi.LJLIL;
        abstractC83312Wmq.getClass();
        c83304Wmi.LJLILLLLZI.LIZJ(abstractC83312Wmq);
        long currentTimeMillis = System.currentTimeMillis() - this.LJLILLLLZI.LJLJI;
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("duration", String.valueOf(currentTimeMillis));
        C43882HKc.LIZLLL(0, "aweme_tool_draft_amazing_infosticker_update_download_error", c6bk.LJ(), true);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
