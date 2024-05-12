package X;

import com.ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.systembigemoji.StickerResourceManager$downloadResources$1", f = "StickerResourceManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4FP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Resources LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4FP(Resources resources, InterfaceC67352kd<? super C4FP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = resources;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4FP(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C4FD.LJIIIIZZ(this.LJLIL, false);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
