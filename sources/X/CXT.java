package X;

import android.graphics.Bitmap;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.utils.LiveLottieUtils$loadLottieAndUpdateImages$1$4", f = "LiveLottieUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CXT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C29701Eo LJLIL;
    public final /* synthetic */ List<Bitmap> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ List<String> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CXT(C29701Eo c29701Eo, List<Bitmap> list, int i, int i2, List<String> list2, InterfaceC67352kd<? super CXT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c29701Eo;
        this.LJLILLLLZI = list;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = list2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new CXT(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.getContext() == null) {
            return C76800UCe.LIZ;
        }
        C29701Eo c29701Eo = this.LJLIL;
        c29701Eo.addLottieOnCompositionLoadedListener(new CXS(this.LJLILLLLZI, c29701Eo, this.LJLJI, this.LJLJJI, this.LJLJJL));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
