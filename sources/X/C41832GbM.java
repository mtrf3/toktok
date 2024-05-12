package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.share.QuickShareToStoryManager$storyPublishCallback$2$1$onProgress$1$1", f = "QuickShareToStoryManager.kt", l = {67}, m = "invokeSuspend")
/* renamed from: X.GbM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41832GbM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C41826GbG LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41832GbM(C41826GbG c41826GbG, String str, InterfaceC67352kd<? super C41832GbM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c41826GbG;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41832GbM(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            long longValue = ((Number) C41839GbT.LIZ.getValue()).longValue() * 1000;
            this.LJLIL = 1;
            if (C1JD.LIZJ(longValue, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C41826GbG c41826GbG = this.LJLILLLLZI;
        if (c41826GbG.LJFF) {
            C41825GbF.LIZ(this.LJLJI);
        } else {
            c41826GbG.LJ = true;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
