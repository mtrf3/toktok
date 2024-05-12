package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.adapter.IPdpListUIRegisterService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.engine.DefaultPdpStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Af8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26778Af8 extends AbstractC26779Af9<Object> {
    public final ECBaseFragment LJLJJLL;
    public final Integer LJLJL;

    @Override // X.AbstractC26779Af9
    public final IComponentStrategyService LLD() {
        return new DefaultPdpStrategyService();
    }

    @Override // X.AbstractC26779Af9, X.AbstractC26784AfE
    public final void LL(C73242Soo c73242Soo) {
        Integer num;
        Object obj;
        String obj2;
        C69855RbH.LIZ.getClass();
        if (C69855RbH.LIZ()) {
            java.util.Map<String, Object> map = this.LJLJJI;
            if (map != null && (obj = map.get("biz_type")) != null && (obj2 = obj.toString()) != null) {
                num = C38350F3i.LJJIL(obj2);
            } else {
                num = null;
            }
            EnumC28000Ayq biz = C78866UxK.LJJZZIII(num);
            o.LJIIIZ(biz, "biz");
            int LJ = C27206Am2.LJ(biz, "product_detail", null);
            EnumC26549AbR.Companion.getClass();
            C26555AbX bizEnv = C26550AbS.LIZ(LJ, "product_detail").getBizEnv();
            java.util.Set services = ServiceManager.get().getServices(IPdpListUIRegisterService.class);
            o.LJFF(services, "ServiceManager.get().get…ices(SERVICE::class.java)");
            Iterator it = services.iterator();
            while (it.hasNext()) {
                ((IPdpListUIRegisterService) it.next()).LIZ(this, c73242Soo, bizEnv);
            }
            return;
        }
        super.LL(c73242Soo);
    }

    @Override // X.AbstractC73237Soj, X.C4II
    public final int getBasicItemViewType(int i) {
        return this.LJLJJL.LIZIZ(i);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (holder instanceof AbsFullSpanVH) {
            ((AbsFullSpanVH) holder).setFullSpan();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26778Af8(PdpFragment parent, Integer num) {
        super(parent, new C26782AfC(), "product_detail", num, null, null, 112);
        o.LJIIIZ(parent, "parent");
        this.LJLJJLL = parent;
        this.LJLJL = num;
    }
}
