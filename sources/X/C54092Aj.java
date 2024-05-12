package X;

import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import fjb.a;
import webcast.data.MusicSong;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMSongListViewModel$updateFavoriteSongUI$1", f = "BGMSongListViewModel.kt", l = {191}, m = "invokeSuspend")
/* renamed from: X.2Aj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54092Aj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BGMSongListViewModel LJLILLLLZI;
    public final /* synthetic */ MusicSong LJLJI;
    public final /* synthetic */ C33541Ti LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54092Aj(BGMSongListViewModel bGMSongListViewModel, MusicSong musicSong, C33541Ti c33541Ti, InterfaceC67352kd<? super C54092Aj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = bGMSongListViewModel;
        this.LJLJI = musicSong;
        this.LJLJJI = c33541Ti;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54092Aj(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            XLL xll = this.LJLILLLLZI.LJLJJI;
            C34211Vx c34211Vx = new C34211Vx(this.LJLJI, this.LJLJJI);
            this.LJLIL = 1;
            if (xll.emit(c34211Vx, this) == enumC58928NAu) {
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
