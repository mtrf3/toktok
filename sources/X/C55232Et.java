package X;

import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.android.live.effect.music.LiveBGMFragment;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.LiveBGMFragment$initView$2$1", f = "LiveBGMFragment.kt", l = {210}, m = "invokeSuspend")
/* renamed from: X.2Et, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55232Et extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ LiveBGMFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55232Et(LiveBGMFragment liveBGMFragment, InterfaceC67352kd<? super C55232Et> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = liveBGMFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55232Et(this.LJLILLLLZI, interfaceC67352kd);
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
            BGMPlaylistViewModel bGMPlaylistViewModel = this.LJLILLLLZI.LJLJJI;
            if (bGMPlaylistViewModel != null) {
                XK4 xk4 = bGMPlaylistViewModel.LJLILLLLZI;
                C1VX c1vx = C1VX.LIZ;
                this.LJLIL = 1;
                if (xk4.LJIIIZ(c1vx, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                o.LJIJI("playlistViewModel");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}