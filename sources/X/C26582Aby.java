package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.shop.USShopInfoVH;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Aby, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26582Aby extends AbstractC73230Soc<Object> {
    public final /* synthetic */ USShopInfoVH LJLJJI;

    @Override // X.AbstractC73237Soj
    public final void LJZ(C73242Soo c73242Soo) {
        c73242Soo.LJFF(new AqS170S0100000_4(this, 368), new AqS170S0100000_4(this.LJLJJI, 369), null);
    }

    @Override // X.AbstractC73237Soj, X.C4II
    public final int getBasicItemViewType(int i) {
        return this.LJLILLLLZI.LIZIZ(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26582Aby(USShopInfoVH uSShopInfoVH, Fragment owner) {
        super(owner, new C26578Abu(), 4);
        o.LJIIIZ(owner, "owner");
        this.LJLJJI = uSShopInfoVH;
    }
}
