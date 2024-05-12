package X;

import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import fjb.a;
import webcast.data.MusicSong;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMSongListAdapter$onBindViewHolder$1$2$1", f = "BGMSongListAdapter.kt", l = {169}, m = "invokeSuspend")
/* renamed from: X.2Ed, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55072Ed extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C33491Td LJLILLLLZI;
    public final /* synthetic */ MusicSong LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55072Ed(C33491Td c33491Td, MusicSong musicSong, InterfaceC67352kd<? super C55072Ed> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c33491Td;
        this.LJLJI = musicSong;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55072Ed(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
                C34071Vj c34071Vj = new C34071Vj(this.LJLJI);
                this.LJLIL = 1;
                if (xk4.LJIIIZ(c34071Vj, this) == enumC58928NAu) {
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
