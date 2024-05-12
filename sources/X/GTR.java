package X;

import android.graphics.Bitmap;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.badge.BadgeShareDialog$onCreate$2$1", f = "BadgeShareDialog.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GTR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ OVZ LJLIL;
    public final /* synthetic */ Bitmap LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GTR(OVZ ovz, Bitmap bitmap, InterfaceC67352kd<? super GTR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = ovz;
        this.LJLILLLLZI = bitmap;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GTR(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ((VA9) this.LJLIL.findViewById(R.id.fcj)).setImageBitmap(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
