package X;

import com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer$initializeListeners$1$1", f = "ScopedMusicPlayer.kt", l = {75}, m = "invokeSuspend")
/* renamed from: X.NEi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59020NEi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ScopedMusicPlayer LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59020NEi(ScopedMusicPlayer scopedMusicPlayer, InterfaceC67352kd<? super C59020NEi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = scopedMusicPlayer;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C59020NEi(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C58755N4d c58755N4d;
        MusicModel musicModel;
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(200L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        Object value = this.LJLILLLLZI.LJLJI.getValue();
        if ((value instanceof C58755N4d) && (c58755N4d = (C58755N4d) value) != null) {
            ScopedMusicPlayer scopedMusicPlayer = this.LJLILLLLZI;
            if (scopedMusicPlayer.LJLJL && (musicModel = c58755N4d.LIZ) != null) {
                scopedMusicPlayer.LIZIZ(musicModel);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
