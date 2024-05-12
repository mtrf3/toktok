package X;

import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import fjb.a;
import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMPlaylistViewModel$downloadListener$2$1$onStart$1", f = "BGMPlaylistViewModel.kt", l = {53}, m = "invokeSuspend")
/* renamed from: X.2An, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54132An extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BGMPlaylistViewModel LJLILLLLZI;
    public final /* synthetic */ MusicSong LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54132An(BGMPlaylistViewModel bGMPlaylistViewModel, MusicSong musicSong, InterfaceC67352kd<? super C54132An> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = bGMPlaylistViewModel;
        this.LJLJI = musicSong;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54132An(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            XLL xll = this.LJLILLLLZI.LJLJI;
            final MusicSong musicSong = this.LJLJI;
            AbstractC17350mB abstractC17350mB = new AbstractC17350mB(musicSong) { // from class: X.1Vc
                {
                    o.LJIIIZ(musicSong, "musicSong");
                }
            };
            this.LJLIL = 1;
            if (xll.emit(abstractC17350mB, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
