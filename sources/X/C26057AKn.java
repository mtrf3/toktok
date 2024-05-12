package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel$favoriteProduct$1$5", f = "SkuPanelViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.AKn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26057AKn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ WeakReference<View> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26057AKn(boolean z, String str, WeakReference<View> weakReference, InterfaceC67352kd<? super C26057AKn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = weakReference;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26057AKn(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C141335gf.LIZJ(obj);
        C26059AKp.LIZ().LIZ("pdp_save_product", C27739Aud.LJI(C113554cx.LJJL(new OSZ("saved", new Integer(this.LJLIL ? 1 : 0)), new OSZ("pid", this.LJLILLLLZI))));
        View view = this.LJLJI.get();
        if (view != null) {
            boolean z = this.LJLIL;
            if (z) {
                string = view.getContext().getString(R.string.f9n);
            } else {
                string = view.getContext().getString(R.string.f9r);
            }
            o.LJIIIIZZ(string, "if (isFavorite) {\n      …                        }");
            C26048AKe c26048AKe = new C26048AKe(view);
            c26048AKe.LJI(string);
            if (z) {
                c26048AKe.LIZJ(R.raw.icon_tick_fill);
                Context context = view.getContext();
                o.LJIIIIZZ(context, "view.context");
                c26048AKe.LIZLLL(AnonymousClass636.LJIIIIZZ(R.attr.e8, context));
            }
            c26048AKe.LIZIZ(1000L);
            c26048AKe.LJII();
            return C76800UCe.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
