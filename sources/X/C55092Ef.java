package X;

import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.android.live.effect.music.LiveBGMMiniWidget;
import fjb.a;
import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.LiveBGMMiniWidget$initView$6$1", f = "LiveBGMMiniWidget.kt", l = {151}, m = "invokeSuspend")
/* renamed from: X.2Ef, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55092Ef extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ LiveBGMMiniWidget LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55092Ef(LiveBGMMiniWidget liveBGMMiniWidget, InterfaceC67352kd<? super C55092Ef> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = liveBGMMiniWidget;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55092Ef(this.LJLILLLLZI, interfaceC67352kd);
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
            LiveBGMMiniWidget liveBGMMiniWidget = this.LJLILLLLZI;
            BGMPlaylistViewModel bGMPlaylistViewModel = liveBGMMiniWidget.LJLJJL;
            if (bGMPlaylistViewModel != null) {
                XK4 xk4 = bGMPlaylistViewModel.LJLILLLLZI;
                MusicSong[] musicSongArr = new MusicSong[1];
                MusicSong musicSong = liveBGMMiniWidget.LJLLL;
                if (musicSong == null) {
                    return C76800UCe.LIZ;
                }
                musicSongArr[0] = musicSong;
                C1VU c1vu = new C1VU(C47261Igj.LJJIJIL(musicSongArr));
                this.LJLIL = 1;
                if (xk4.LJIIIZ(c1vu, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                o.LJIJI("playListViewModel");
                throw null;
            }
        }
        C14360hM.LIZ(this.LJLILLLLZI.dataChannel, "shortcut", "play");
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
