package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardStyle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.Au2S11S0300000_12;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Rux, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71075Rux extends AbstractC71071Rut<EcUgProduct, C71078Rv0> {
    @Override // X.AbstractC31414CUo
    public final void LIZ(Object obj, Object obj2) {
        C71078Rv0 holder = (C71078Rv0) obj;
        EcUgProduct data = (EcUgProduct) obj2;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(data, "data");
        Context context = holder.itemView.getContext();
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        C16880lQ.LJIIJ(new Au2S11S0300000_12(context, data, this, 18), view);
        LJI(holder.LJLIL, data.getFirstImage(), 4);
        AbstractC71071Rut.LJII(holder.LJLILLLLZI, holder.LJLJI, holder.LJLJJI, data.getPrice());
    }

    @Override // X.AbstractC31414CUo
    public final Object LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.api, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…s_product, parent, false)");
        return new C71078Rv0(LLLLIILL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71075Rux(Aweme aweme, FeedEcCardConfig cardConfig, FeedEcCardStyle cardStyle, C71076Ruy cardCache, boolean z) {
        super(aweme, cardConfig, cardStyle, cardCache, z);
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(cardConfig, "cardConfig");
        o.LJIIIZ(cardStyle, "cardStyle");
        o.LJIIIZ(cardCache, "cardCache");
    }
}
