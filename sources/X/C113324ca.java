package X;

import com.ss.android.ugc.aweme.relation.model.RecUser;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.ui.MafChatListViewHolder$bind$4", f = "MafChatListViewHolder.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4ca, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113324ca extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ C113304cY LJLIL;
    public final /* synthetic */ RecUser LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C113324ca(C113304cY c113304cY, RecUser recUser, InterfaceC67352kd<? super C113324ca> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = c113304cY;
        this.LJLILLLLZI = recUser;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C113324ca(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC113344cc interfaceC113344cc = this.LJLIL.LJLJL;
        if (interfaceC113344cc != null) {
            interfaceC113344cc.LJFF(this.LJLILLLLZI);
            return Boolean.FALSE;
        }
        o.LJIJI("listener");
        throw null;
    }
}
