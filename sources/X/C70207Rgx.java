package X;

import Y.ACListenerS22S0301000_12;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S1S0301000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS59S1100000_6;
import kotlin.jvm.internal.AqS61S0201000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rgx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70207Rgx extends AbstractC029409q<C70208Rgy> {
    public final PdpViewModel LJLIL;
    public final InterfaceC71003Rtn LJLILLLLZI;
    public final C70120RfY LJLJI;
    public final ECT LJLJJI;
    public final InterfaceC70119RfX LJLJJL;
    public List<Feed> LJLJJLL;
    public C69926RcQ LJLJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<Feed> list = this.LJLJJLL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C70208Rgy c70208Rgy, int i) {
        Feed feed;
        boolean z;
        RYM rym;
        Object obj;
        String str;
        Price price;
        String str2;
        String str3;
        boolean z2;
        String str4;
        String str5;
        List<Image> list;
        java.util.Map<String, RYM> map;
        String str6;
        C70208Rgy holder = c70208Rgy;
        o.LJIIIZ(holder, "holder");
        if (getItemCount() < 1) {
            return;
        }
        int itemCount = i % getItemCount();
        List<Feed> list2 = this.LJLJJLL;
        if (list2 == null || (feed = (Feed) ListProtector.get(list2, itemCount)) == null) {
            return;
        }
        C69926RcQ c69926RcQ = this.LJLJL;
        if (c69926RcQ != null && c69926RcQ.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = !z;
        if (c69926RcQ != null && (map = c69926RcQ.LIZ) != null) {
            FeedProduct feedProduct = feed.product;
            if (feedProduct != null) {
                str6 = feedProduct.id;
            } else {
                str6 = null;
            }
            rym = map.get(str6);
        } else {
            rym = null;
        }
        String str7 = feed.id;
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        holder.LJLJL = str7;
        FeedProduct feedProduct2 = feed.product;
        if (feedProduct2 != null && (list = feedProduct2.images) != null) {
            obj = ORZ.LJLLLL(list);
        } else {
            obj = null;
        }
        SmartImageView smartImageView = (SmartImageView) holder.itemView.findViewById(R.id.i5y);
        o.LJIIIIZZ(smartImageView, "itemView.product_img");
        if (obj != null) {
            W5F LIZLLL = C70759Rpr.LIZLLL(obj);
            LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
            LIZLLL.LJIJJLI = C70759Rpr.LIZLLL;
            LIZLLL.LJIILIIL = C7MY.LIZJ(holder.itemView, "itemView.context", R.attr.cj);
            LIZLLL.LJJIIJ = smartImageView;
            C16880lQ.LLJJJ(LIZLLL);
        }
        TextView textView = (TextView) holder.itemView.findViewById(R.id.mfc);
        FeedProduct feedProduct3 = feed.product;
        if (feedProduct3 == null || (str = feedProduct3.title) == null) {
            str = "";
        }
        textView.setText(str);
        if (rym == null || (price = rym.LJ) == null) {
            FeedProduct feedProduct4 = feed.product;
            if (feedProduct4 != null) {
                price = feedProduct4.price;
            } else {
                price = null;
            }
        }
        TextView textView2 = (TextView) holder.itemView.findViewById(R.id.mf6);
        if (price == null || (str2 = price.minPrice) == null) {
            str2 = "";
        }
        textView2.setText(str2);
        TextView textView3 = (TextView) holder.itemView.findViewById(R.id.mf2);
        if (price != null && (str5 = price.maxPrice) != null) {
            str8 = str5;
        }
        textView3.setText(str8);
        ((TextView) holder.itemView.findViewById(R.id.mf2)).getPaint().setFlags(16);
        ((TextView) holder.itemView.findViewById(R.id.mf2)).getPaint().setAntiAlias(true);
        View findViewById = holder.itemView.findViewById(R.id.jml);
        o.LJIIIIZZ(findViewById, "itemView.selected_props");
        findViewById.setVisibility(0);
        TextView textView4 = (TextView) holder.itemView.findViewById(R.id.jml);
        if (rym != null) {
            str3 = rym.LIZIZ;
        } else {
            str3 = null;
        }
        textView4.setText(str3);
        ((C71897SJp) holder.itemView.findViewById(R.id.i5r)).setEnabled(z3);
        C71897SJp c71897SJp = (C71897SJp) holder.itemView.findViewById(R.id.i5r);
        if (rym != null) {
            z2 = rym.LJFF;
        } else {
            z2 = false;
        }
        c71897SJp.setChecked(z2);
        holder.itemView.findViewById(R.id.i5r).setBackground((Drawable) holder.LJLJLJ.getValue());
        C16880lQ.LJJJI((C71897SJp) holder.itemView.findViewById(R.id.i5r), new ACListenerS22S0301000_12(rym, holder, feed, i, 2));
        View findViewById2 = holder.itemView.findViewById(R.id.i67);
        o.LJIIIIZZ(findViewById2, "itemView.product_layout");
        C16880lQ.LJIIJ(new Au2S1S0301000_12(feed, holder, i, price, 6), findViewById2);
        holder.itemView.findViewById(R.id.k2w).setEnabled(z3);
        View findViewById3 = holder.itemView.findViewById(R.id.k2w);
        o.LJIIIIZZ(findViewById3, "itemView.sku_entrance_layout");
        C16880lQ.LJIIJ(new Au2S1S0301000_12(feed, holder, i, rym, 7), findViewById3);
        FeedProduct feedProduct5 = feed.product;
        if (feedProduct5 != null) {
            str4 = feedProduct5.id;
            if (str4 != null && !((ArrayList) holder.LJLJJI.LLJJIII).contains(str4)) {
                ((ArrayList) holder.LJLJJI.LLJJIII).add(str4);
                if (holder.LJLJJI.LLFII == null || holder.LJLJL != null) {
                    C70120RfY c70120RfY = holder.LJLJI;
                    InterfaceC71003Rtn node = holder.LJLILLLLZI;
                    c70120RfY.getClass();
                    o.LJIIIZ(node, "node");
                    C78946Uyc.LJJII(node, new C70913RsL(), new AqS61S0201000_12(c70120RfY, feed, i, 19));
                    C70120RfY c70120RfY2 = holder.LJLJI;
                    InterfaceC71003Rtn node2 = holder.LJLILLLLZI;
                    c70120RfY2.getClass();
                    o.LJIIIZ(node2, "node");
                    C78946Uyc.LJJII(node2, new C70924RsW(0), new AqS61S0201000_12(c70120RfY2, feed, i, 17));
                } else {
                    o.LJIJI("requestId");
                    throw null;
                }
            }
        } else {
            str4 = null;
        }
        View itemView = holder.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        X6V.LIZIZ(itemView, new C2L9(str4, i), new AqS59S1100000_6(holder, str4, 2));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C70208Rgy com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        boolean z;
        o.LJIIIZ(parent, "parent");
        InterfaceC71003Rtn interfaceC71003Rtn = this.LJLILLLLZI;
        C70120RfY c70120RfY = this.LJLJI;
        PdpViewModel pdpViewModel = this.LJLIL;
        ECT ect = this.LJLJJI;
        InterfaceC70119RfX interfaceC70119RfX = this.LJLJJL;
        boolean z2 = true;
        if (getItemCount() > 2) {
            z = true;
        } else {
            z = false;
        }
        C70208Rgy c70208Rgy = new C70208Rgy(parent, interfaceC71003Rtn, c70120RfY, pdpViewModel, ect, interfaceC70119RfX, z);
        C0AX.LIZ(parent, c70208Rgy.itemView, R.id.lj7);
        View view = c70208Rgy.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c70208Rgy.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z2 = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z2) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C70208Rgy.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c70208Rgy.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c70208Rgy.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C70208Rgy.class.getName();
        return c70208Rgy;
    }

    public C70207Rgx(PdpViewModel pdpVM, InterfaceC71003Rtn trackNode, C70120RfY logger, ECT impressionUtil, InterfaceC70119RfX productChangeListener) {
        o.LJIIIZ(pdpVM, "pdpVM");
        o.LJIIIZ(trackNode, "trackNode");
        o.LJIIIZ(logger, "logger");
        o.LJIIIZ(impressionUtil, "impressionUtil");
        o.LJIIIZ(productChangeListener, "productChangeListener");
        this.LJLIL = pdpVM;
        this.LJLILLLLZI = trackNode;
        this.LJLJI = logger;
        this.LJLJJI = impressionUtil;
        this.LJLJJL = productChangeListener;
    }
}
