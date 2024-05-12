package X;

import com.bytedance.android.live.effect.music.AccompanimentApi;
import fjb.a;
import webcast.data.MusicSong;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMSongListRepository$addFavoriteSong$2", f = "BGMSongListRepository.kt", l = {153}, m = "invokeSuspend")
/* renamed from: X.2Eh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55112Eh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C28467BFf<C76800UCe>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C14410hR LJLILLLLZI;
    public final /* synthetic */ MusicSong LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55112Eh(C14410hR c14410hR, MusicSong musicSong, InterfaceC67352kd<? super C55112Eh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c14410hR;
        this.LJLJI = musicSong;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55112Eh(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            long j = this.LJLJI.id;
            this.LJLIL = 1;
            obj = LIZJ.addFavoriteSong(j, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C28467BFf<C76800UCe>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
