package X;

import android.graphics.drawable.Drawable;
import com.bytedance.lighten.loader.SmartImageView;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.core.image.PdpDescImageOptimize$load$1$1", f = "PdpDescImageOptimize.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.ALn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26083ALn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Drawable LJLIL;
    public final /* synthetic */ SmartImageView LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26083ALn(Drawable drawable, SmartImageView smartImageView, InterfaceC67352kd<? super C26083ALn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = drawable;
        this.LJLILLLLZI = smartImageView;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26083ALn(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL != null) {
            this.LJLILLLLZI.getHierarchy().LJIILLIIL(0);
            this.LJLILLLLZI.getHierarchy().LJIJJ(this.LJLIL, InterfaceC78716Uuu.LJJLIIIJILLIZJL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
