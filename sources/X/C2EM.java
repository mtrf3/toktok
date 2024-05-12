package X;

import com.bytedance.android.live.effect.music.AccompanimentApi;
import fjb.a;
import tikcast.api.anchor.PlaylistSongsResponse;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMPlaylistRepository$clearAndLoadTopServerSong$data$1", f = "BGMPlaylistRepository.kt", l = {105}, m = "invokeSuspend")
/* renamed from: X.2EM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2EM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C28467BFf<PlaylistSongsResponse.ResponseData>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C14320hI LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2EM(C14320hI c14320hI, InterfaceC67352kd<? super C2EM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c14320hI;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2EM(this.LJLILLLLZI, interfaceC67352kd);
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
            AccompanimentApi LIZJ = this.LJLILLLLZI.LIZJ();
            this.LJLIL = 1;
            obj = LIZJ.fetchPlaylist(0L, 50L, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C28467BFf<PlaylistSongsResponse.ResponseData>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
