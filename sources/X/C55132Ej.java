package X;

import com.bytedance.android.live.effect.music.AccompanimentApi;
import com.bytedance.android.live.network.response.BaseResponse;
import fjb.a;
import kotlin.jvm.internal.o;
import webcast.api.room.MusicResponse;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMSongListRepository$initAllData$data$1", f = "BGMSongListRepository.kt", l = {50}, m = "invokeSuspend")
/* renamed from: X.2Ej, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55132Ej extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super MusicResponse.Packs>, Object> {
    public int LJLIL;
    public final /* synthetic */ C14410hR LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55132Ej(C14410hR c14410hR, InterfaceC67352kd<? super C55132Ej> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c14410hR;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55132Ej(this.LJLILLLLZI, interfaceC67352kd);
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
            Long LIZJ2 = InterfaceC30442Bx8.S.LIZJ();
            o.LJIIIIZZ(LIZJ2, "EFFECT_PLAYING_BGM_ID.value");
            long max = Math.max(LIZJ2.longValue(), 0L);
            this.LJLIL = 1;
            obj = LIZJ.initData(max, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        T t = ((BaseResponse) obj).data;
        if (t == 0) {
            return null;
        }
        return t;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super MusicResponse.Packs> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
