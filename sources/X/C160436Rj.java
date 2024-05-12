package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.addyours.EditAddYoursStickerComponent$openInviteFriendsPanel$1$1", f = "EditAddYoursStickerComponent.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6Rj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160436Rj extends AbstractC65782Prm implements InterfaceC88473Ynt<List<? extends UserInvitee>, List<? extends UserInvitee>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C6HF LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160436Rj(C6HF c6hf, InterfaceC67352kd<? super C160436Rj> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = c6hf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C2VQ.LIZIZ(new AqS149S0200000_2(this.LJLILLLLZI, (C6HF) this.LJLIL, (List<UserInvitee>) 36), 0L);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(List<? extends UserInvitee> list, List<? extends UserInvitee> list2, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C160436Rj c160436Rj = new C160436Rj(this.LJLILLLLZI, interfaceC67352kd);
        c160436Rj.LJLIL = list;
        return c160436Rj.invokeSuspend(C76800UCe.LIZ);
    }
}
