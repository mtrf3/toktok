package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.ttf.osp.module.shop.TtfShopInfoVH;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Abx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26581Abx extends AbstractC73230Soc<Object> {
    public final /* synthetic */ TtfShopInfoVH LJLJJI;

    @Override // X.AbstractC73237Soj
    public final void LJZ(C73242Soo c73242Soo) {
        c73242Soo.LJFF(new AqS170S0100000_4(this, 357), new AqS170S0100000_4(this.LJLJJI, 358), null);
    }

    @Override // X.AbstractC73237Soj, X.C4II
    public final int getBasicItemViewType(int i) {
        return this.LJLILLLLZI.LIZIZ(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26581Abx(TtfShopInfoVH ttfShopInfoVH, Fragment owner) {
        super(owner, new C26578Abu(), 4);
        o.LJIIIZ(owner, "owner");
        this.LJLJJI = ttfShopInfoVH;
    }
}