package X;

import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMSongListAdapter$initOnScrollListener$1$onScrolled$2", f = "BGMSongListAdapter.kt", l = {264}, m = "invokeSuspend")
/* renamed from: X.2EX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2EX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C33491Td LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2EX(C33491Td c33491Td, InterfaceC67352kd<? super C2EX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c33491Td;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2EX(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        XK4 xk4;
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
            BGMSongListViewModel bGMSongListViewModel = this.LJLILLLLZI.LJLIL;
            if (bGMSongListViewModel != null && (xk4 = bGMSongListViewModel.LJLJI) != null) {
                C34121Vo c34121Vo = C34121Vo.LIZ;
                this.LJLIL = 1;
                if (xk4.LJIIIZ(c34121Vo, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}