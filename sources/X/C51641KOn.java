package X;

import Y.ALAdapterS6S0100000_8;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.LinkedHashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment$onBackToTopButtonVisibilityChanged$1", f = "FashionMallFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.KOn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51641KOn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ FashionMallFragment LJLILLLLZI;
    public final /* synthetic */ java.util.Map<String, String> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51641KOn(boolean z, FashionMallFragment fashionMallFragment, java.util.Map<String, String> map, InterfaceC67352kd<? super C51641KOn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = z;
        this.LJLILLLLZI = fashionMallFragment;
        this.LJLJI = map;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C51641KOn(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        boolean z = this.LJLIL;
        if (z) {
            this.LJLILLLLZI.LJLLILLLL = true;
            View _$_findCachedViewById = this.LJLILLLLZI._$_findCachedViewById(R.id.d2t);
            if (_$_findCachedViewById != null && _$_findCachedViewById.getVisibility() == 4) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLILLLLZI._$_findCachedViewById(R.id.d2t), "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(200L);
                new AccelerateDecelerateInterpolator();
                ofFloat.start();
            }
            View _$_findCachedViewById2 = this.LJLILLLLZI._$_findCachedViewById(R.id.d2t);
            if (_$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setVisibility(0);
            }
            FashionMallFragment fashionMallFragment = this.LJLILLLLZI;
            java.util.Map<String, String> map = this.LJLJI;
            fashionMallFragment.LJLLL = map;
            if (!fashionMallFragment.LJLLJ) {
                fashionMallFragment.LJLLJ = true;
                C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("button_name", "back_to_top");
                linkedHashMap.putAll(map);
                c56045Lz7.getClass();
                C56045Lz7.LJ(linkedHashMap);
            }
        } else if (!z) {
            this.LJLILLLLZI.LJLLILLLL = false;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJLILLLLZI._$_findCachedViewById(R.id.d2t), "alpha", 1.0f, 0.0f);
            FashionMallFragment fashionMallFragment2 = this.LJLILLLLZI;
            ofFloat2.setDuration(200L);
            ofFloat2.addListener(new ALAdapterS6S0100000_8(fashionMallFragment2, 1));
            new AccelerateDecelerateInterpolator();
            ofFloat2.start();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
