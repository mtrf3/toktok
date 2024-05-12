package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel$favoriteProduct$1$7", f = "SkuPanelViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.AKm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26056AKm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ WeakReference<View> LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26056AKm(WeakReference<View> weakReference, boolean z, InterfaceC67352kd<? super C26056AKm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = weakReference;
        this.LJLILLLLZI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26056AKm(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C141335gf.LIZJ(obj);
        View view = this.LJLIL.get();
        if (view != null) {
            if (this.LJLILLLLZI) {
                string = view.getContext().getString(R.string.f9m);
            } else {
                string = view.getContext().getString(R.string.f9q);
            }
            o.LJIIIIZZ(string, "if (isFavorite) {\n      …                        }");
            C26048AKe c26048AKe = new C26048AKe(view);
            c26048AKe.LJI(string);
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
