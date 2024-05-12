package X;

import com.bytedance.android.live.effect.music.AccompanimentApi;
import fjb.a;
import tikcast.api.anchor.PlaylistDeleteResponse;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMPlaylistRepository$requestRemoveSong$data$1", f = "BGMPlaylistRepository.kt", l = {137}, m = "invokeSuspend")
/* renamed from: X.2EP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2EP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C28467BFf<PlaylistDeleteResponse.ResponseData>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C14320hI LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2EP(C14320hI c14320hI, long j, InterfaceC67352kd<? super C2EP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c14320hI;
        this.LJLJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2EP(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            long j = this.LJLJI;
            this.LJLIL = 1;
            obj = LIZJ.removePlaylistSong(j, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C28467BFf<PlaylistDeleteResponse.ResponseData>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
