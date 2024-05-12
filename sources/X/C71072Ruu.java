package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardStyle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.Au2S11S0300000_12;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ruu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71072Ruu extends AbstractC71071Rut<EcUgProduct, C71077Ruz> {
    @Override // X.AbstractC31414CUo
    public final void LIZ(Object obj, Object obj2) {
        int i;
        String text;
        C71077Ruz holder = (C71077Ruz) obj;
        EcUgProduct data = (EcUgProduct) obj2;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(data, "data");
        Context context = holder.itemView.getContext();
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        C16880lQ.LJIIJ(new Au2S11S0300000_12(context, data, this, 19), view);
        LJI(holder.LJLIL, data.getFirstImage(), 8);
        holder.LJLILLLLZI.setText(ED2.LIZ(data.getTitle()));
        LinearLayout linearLayout = holder.LJLJI;
        if (!C90193gN.LIZIZ(context)) {
            i = 8388611;
        } else {
            i = 8388613;
        }
        linearLayout.setGravity(i);
        AbstractC71071Rut.LJII(holder.LJLJJI, holder.LJLJJL, holder.LJLJJLL, data.getPrice());
        CharSequence text2 = holder.LJLJJLL.getText();
        if (text2 == null || ujb.o.LJJJJJL(text2)) {
            holder.LJLJJLL.setVisibility(8);
        } else {
            holder.LJLJJLL.setVisibility(0);
        }
        EcUgProduct.EcUgProductBtn btnBuy = data.getBtnBuy();
        if (btnBuy == null || (text = btnBuy.getText()) == null || ujb.o.LJJJJJL(text)) {
            holder.LJLJL.setVisibility(4);
            return;
        }
        SY4 sy4 = holder.LJLJL;
        sy4.setVisibility(0);
        sy4.setText(btnBuy.getText());
        OLQ.LIZLLL(sy4, "#FE2C55", "#FF0099", Integer.valueOf(R.attr.eb), 4, 100);
        C16880lQ.LJIIJ(new Au2S11S0300000_12(context, data, this, 20), sy4);
    }

    @Override // X.AbstractC31414CUo
    public final Object LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.apj, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…s_product, parent, false)");
        return new C71077Ruz(LLLLIILL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71072Ruu(Aweme aweme, FeedEcCardConfig cardConfig, FeedEcCardStyle cardStyle, C71076Ruy cardCache, boolean z) {
        super(aweme, cardConfig, cardStyle, cardCache, z);
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(cardConfig, "cardConfig");
        o.LJIIIZ(cardStyle, "cardStyle");
        o.LJIIIZ(cardCache, "cardCache");
    }
}
