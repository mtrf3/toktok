package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheet;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheet$onCreate$2$1$1$1", f = "IMReactionListSheet.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Di, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80343Di extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ IMReactionListSheet LJLIL;
    public final /* synthetic */ OSZ<Integer, IMUser> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C80343Di(IMReactionListSheet iMReactionListSheet, OSZ<Integer, ? extends IMUser> osz, InterfaceC67352kd<? super C80343Di> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = iMReactionListSheet;
        this.LJLILLLLZI = osz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C80343Di(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C85453Wz c85453Wz = (C85453Wz) this.LJLIL.LJLJI.getValue();
        int intValue = this.LJLILLLLZI.getFirst().intValue();
        IMUser user = this.LJLILLLLZI.getSecond();
        c85453Wz.getClass();
        o.LJIIIZ(user, "user");
        C80353Dj c80353Dj = (C80353Dj) ListProtector.get(c85453Wz.LJLILLLLZI, intValue);
        List<C80353Dj> list = c85453Wz.LJLILLLLZI;
        String displayName = user.getDisplayName();
        o.LJIIIIZZ(displayName, "user.displayName");
        ListProtector.set(list, intValue, new C80353Dj(displayName, c80353Dj.LJLILLLLZI, user.getDisplayAvatar(), c80353Dj.LJLJJI, c80353Dj.LJLJJL, c80353Dj.LJLJJLL));
        c85453Wz.notifyItemChanged(intValue);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
