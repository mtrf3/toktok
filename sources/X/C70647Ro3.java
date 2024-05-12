package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.GlobalSpecUiStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle;
import com.ss.android.ugc.aweme.utils.Au2S4S0101000_12;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Ro3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70647Ro3 extends AbstractC26784AfE<Object> {
    public final ISpecUiStyle LJLJJLL;
    public C70287RiF LJLJL;

    @Override // X.AbstractC26784AfE
    public final void LL(C73242Soo c73242Soo) {
        Object obj;
        ISpecUiStyle globalSpecUiStyle;
        java.util.Map<String, Object> map = this.LJLJJI;
        if (map != null) {
            obj = map.get("style");
        } else {
            obj = null;
        }
        if (!(obj instanceof ISpecUiStyle) || (globalSpecUiStyle = (ISpecUiStyle) obj) == null) {
            globalSpecUiStyle = new GlobalSpecUiStyle();
        }
        c73242Soo.LJFF(new AqS178S0100000_12(this, 656), new AqS178S0100000_12(globalSpecUiStyle, 657), null);
        c73242Soo.LJFF(new AqS178S0100000_12(this, 658), new AqS178S0100000_12(globalSpecUiStyle, 659), null);
        c73242Soo.LJFF(new AqS178S0100000_12(this, 660), C26477AaH.LJLIL, null);
    }

    @Override // X.AbstractC73237Soj, X.C4II
    public final int getBasicItemViewType(int i) {
        return this.LJLJJL.LIZIZ(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70647Ro3(Fragment parent, ISpecUiStyle iSpecUiStyle) {
        super(parent, new C26782AfC(), null, C51029K0z.LJJIIZI(new OSZ("style", iSpecUiStyle)));
        o.LJIIIZ(parent, "parent");
        this.LJLJJLL = iSpecUiStyle;
    }

    @Override // X.AbstractC73237Soj, X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<Object> payloads) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        super.onBindViewHolder(holder, i, payloads);
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        C16880lQ.LJIIJ(new Au2S4S0101000_12(this, i, 1), view);
        C70287RiF c70287RiF = this.LJLJL;
        if (c70287RiF != null) {
            LJZL(i, false);
            c70287RiF.LJJLIIIJL(i, holder);
        }
    }
}
