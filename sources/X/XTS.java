package X;

import Y.AgS131S0100000_15;
import com.ss.android.ugc.aweme.component.music.MusicService;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.music.music.collect.CollectMusicManager$initCollectMusicList$1", f = "CollectMusicManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class XTS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ XTV LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XTS(int i, XTV xtv, InterfaceC67352kd<? super XTS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = i;
        this.LJLILLLLZI = xtv;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new XTS(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C10K LJIIJJI = MusicService.LJJLIIIJJI().LJIIJJI(0, this.LJLIL);
        if (LJIIJJI != null) {
            LJIIJJI.LIZLLL(new AgS131S0100000_15(this.LJLILLLLZI, 10));
        }
        this.LJLILLLLZI.LJ = false;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
