package X;

import com.bytedance.android.live.effect.music.AccompanimentApi;
import fjb.a;
import java.util.List;
import tikcast.api.anchor.PlaylistAddReq;
import tikcast.api.anchor.PlaylistAddResponse;
import webcast.data.MusicSong;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMPlaylistRepository$addSongs$data$1", f = "BGMPlaylistRepository.kt", l = {75}, m = "invokeSuspend")
/* renamed from: X.2EL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2EL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C28467BFf<PlaylistAddResponse.ResponseData>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C14320hI LJLILLLLZI;
    public final /* synthetic */ List<Long> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2EL(C14320hI c14320hI, List<Long> list, InterfaceC67352kd<? super C2EL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c14320hI;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2EL(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        Long valueOf;
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
            AccompanimentApi LIZJ = this.LJLILLLLZI.LIZJ();
            PlaylistAddReq playlistAddReq = new PlaylistAddReq();
            C14320hI c14320hI = this.LJLILLLLZI;
            List<Long> list = this.LJLJI;
            MusicSong musicSong = c14320hI.LJ;
            if (musicSong != null || (musicSong = (MusicSong) ORZ.LLFII(c14320hI.LIZIZ)) != null) {
                j = musicSong.id;
            } else {
                j = 0;
            }
            playlistAddReq.lastSongId = j;
            MusicSong musicSong2 = c14320hI.LJ;
            if (musicSong2 == null) {
                musicSong2 = (MusicSong) ORZ.LLFII(c14320hI.LIZIZ);
            }
            if (c14320hI.LIZLLL(musicSong2) != null && (valueOf = Long.valueOf(r0.intValue() + c14320hI.LIZ)) != null) {
                j2 = valueOf.longValue();
            } else {
                j2 = -1;
            }
            playlistAddReq.lastSongOffset = j2;
            playlistAddReq.songIds.addAll(list);
            this.LJLIL = 1;
            obj = LIZJ.addPlaylistSong(playlistAddReq, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C28467BFf<PlaylistAddResponse.ResponseData>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
