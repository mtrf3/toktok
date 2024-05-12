package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.KaraokeUtil$changePlayStatus$1", f = "KaraokeUtil.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2Fi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55382Fi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ DataChannel LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55382Fi(DataChannel dataChannel, boolean z, InterfaceC67352kd<? super C55382Fi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55382Fi(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        KaraokeViewModel LIZJ = C21210sP.LIZJ(this.LJLIL);
        if (LIZJ != null) {
            if (this.LJLILLLLZI) {
                if (LIZJ.LLFZ) {
                    LIZJ.nv0().LJFF(0, false);
                }
            } else {
                LIZJ.LLFZ = LIZJ.nv0().LIZIZ;
                LIZJ.nv0().LJ();
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
