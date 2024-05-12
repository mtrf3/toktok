package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$addFavSticker$1$3$1", f = "ChatRoomViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2s2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71942s2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ Throwable LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71942s2(View view, Throwable th, InterfaceC67352kd<? super C71942s2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = view;
        this.LJLILLLLZI = th;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71942s2(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (C2NU.LIZ.LIZJ == EnumC111394Yt.NOT_AVAILABLE) {
            C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
            c26045AKb.LJIIIIZZ(R.string.dtf);
            c26045AKb.LJIIJ();
        } else if (this.LJLILLLLZI instanceof C38333F2r) {
            C1FJ.LJI((C38333F2r) this.LJLILLLLZI, new C26045AKb(this.LJLIL));
        } else {
            C26045AKb c26045AKb2 = new C26045AKb(this.LJLIL);
            c26045AKb2.LJIIIIZZ(R.string.roa);
            c26045AKb2.LJIIJ();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
