package X;

import com.bytedance.android.live.effect.music.AccompanimentApi;
import com.bytedance.android.live.network.response.BaseResponse;
import fjb.a;
import webcast.api.room.CollectionSongsResponse;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMSongListRepository$loadMoreSongsById$data$1", f = "BGMSongListRepository.kt", l = {105}, m = "invokeSuspend")
/* renamed from: X.2El, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55152El extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super CollectionSongsResponse.PageSongs>, Object> {
    public int LJLIL;
    public final /* synthetic */ C14410hR LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55152El(C14410hR c14410hR, long j, long j2, InterfaceC67352kd<? super C55152El> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c14410hR;
        this.LJLJI = j;
        this.LJLJJI = j2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55152El(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            long j2 = this.LJLJJI;
            long j3 = this.LJLILLLLZI.LIZJ;
            this.LJLIL = 1;
            obj = LIZJ.loadMoreSongs(j, j2, j3, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return ((BaseResponse) obj).data;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super CollectionSongsResponse.PageSongs> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
