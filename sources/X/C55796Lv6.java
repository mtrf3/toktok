package X;

import Y.ACListenerS44S0200000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lv6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55796Lv6 extends C8HS<C55794Lv4> {
    public final InterfaceC55798Lv8 LJLIL;

    public C55796Lv6(InterfaceC55798Lv8 interfaceC55798Lv8) {
        super(false, 1, null);
        this.LJLIL = interfaceC55798Lv8;
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<C55794Lv4> data;
        InterfaceC59973NgH interfaceC59973NgH;
        InterfaceC59973NgH interfaceC59973NgH2;
        String str;
        List<T> list = this.mmItems;
        if (list != 0 && (data = getData()) != null && (viewHolder instanceof C55797Lv7)) {
            C55797Lv7 c55797Lv7 = (C55797Lv7) viewHolder;
            C55794Lv4 productInfo = (C55794Lv4) ListProtector.get(list, i);
            ArrayList arrayList = new ArrayList();
            for (C55794Lv4 c55794Lv4 : data) {
                if (c55794Lv4 instanceof C55794Lv4) {
                    arrayList.add(c55794Lv4);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                o.LJII(next, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.mall.ui.floating.MallProductItemInfo");
                arrayList2.add(next);
            }
            c55797Lv7.getClass();
            o.LJIIIZ(productInfo, "productInfo");
            productInfo.LJIILJJIL = Integer.valueOf(i + 1);
            if (productInfo.LIZ == 0) {
                c55797Lv7.LJLJJL.setVisibility(0);
                c55797Lv7.LJLJJI.setVisibility(0);
                c55797Lv7.LJLL.setVisibility(8);
                C62846OlW c62846OlW = c55797Lv7.LJLJI;
                String str2 = productInfo.LJIIIIZZ;
                if (str2 == null) {
                    str2 = "";
                }
                C78765Uvh.LJIIIZ(c62846OlW, C70657RoD.LJIIJJI(str2, EnumC70569Rmn.MALL_RACUN_PRODUCT), -1, -1);
                c55797Lv7.LJLJJLL.setText(productInfo.LJIIIZ);
                OJD ojd = new OJD("[A-Za-z]+");
                OJD ojd2 = new OJD("[^A-Za-z]+");
                String str3 = productInfo.LJIIJ;
                String str4 = null;
                if (str3 != null) {
                    interfaceC59973NgH = OJD.find$default(ojd, str3, 0, 2, null);
                } else {
                    interfaceC59973NgH = null;
                }
                String str5 = productInfo.LJIIJ;
                if (str5 != null) {
                    interfaceC59973NgH2 = OJD.find$default(ojd2, str5, 0, 2, null);
                } else {
                    interfaceC59973NgH2 = null;
                }
                TuxTextView tuxTextView = c55797Lv7.LJLJL;
                if (interfaceC59973NgH != null) {
                    str = interfaceC59973NgH.getValue();
                } else {
                    str = null;
                }
                tuxTextView.setText(str);
                TuxTextView tuxTextView2 = c55797Lv7.LJLJLJ;
                if (interfaceC59973NgH2 != null) {
                    str4 = interfaceC59973NgH2.getValue();
                }
                tuxTextView2.setText(str4);
                c55797Lv7.LJLJLLL.setText(productInfo.LJIIJJI);
                if (arrayList2.size() == 1) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    Context context = c55797Lv7.LJLILLLLZI.getContext();
                    o.LJIIIIZZ(context, "root.context");
                    C26338AVi.LJFF(layoutParams, context, Integer.valueOf(C45804HyK.LJJI(12)), 0, Integer.valueOf(C45804HyK.LJJI(12)), 0, true);
                    c55797Lv7.LJLILLLLZI.setLayoutParams(layoutParams);
                } else {
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C45804HyK.LJJI(270), C45804HyK.LJJI(48));
                    if (i == 0) {
                        Context context2 = c55797Lv7.LJLILLLLZI.getContext();
                        o.LJIIIIZZ(context2, "root.context");
                        C26338AVi.LJFF(layoutParams2, context2, Integer.valueOf(C45804HyK.LJJI(12)), 0, 0, 0, true);
                        c55797Lv7.LJLILLLLZI.setLayoutParams(layoutParams2);
                    } else if (i == arrayList2.size() - 1) {
                        Context context3 = c55797Lv7.LJLILLLLZI.getContext();
                        o.LJIIIIZZ(context3, "root.context");
                        C26338AVi.LJFF(layoutParams2, context3, Integer.valueOf(C45804HyK.LJJI(8)), 0, Integer.valueOf(C45804HyK.LJJI(12)), 0, true);
                        c55797Lv7.LJLILLLLZI.setLayoutParams(layoutParams2);
                    } else {
                        Context context4 = c55797Lv7.LJLILLLLZI.getContext();
                        o.LJIIIIZZ(context4, "root.context");
                        C26338AVi.LJFF(layoutParams2, context4, Integer.valueOf(C45804HyK.LJJI(8)), 0, 0, 0, true);
                        c55797Lv7.LJLILLLLZI.setLayoutParams(layoutParams2);
                    }
                }
                C16880lQ.LJIIJ(new ACListenerS44S0200000_9(productInfo, c55797Lv7, 46), c55797Lv7.LJLILLLLZI);
                C55793Lv3.LIZIZ("tiktokec_product_show", productInfo);
                return;
            }
            c55797Lv7.LJLJJL.setVisibility(8);
            c55797Lv7.LJLJJI.setVisibility(8);
            c55797Lv7.LJLL.setVisibility(0);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            Context context5 = c55797Lv7.LJLILLLLZI.getContext();
            o.LJIIIIZZ(context5, "root.context");
            C26338AVi.LJFF(layoutParams3, context5, Integer.valueOf(C45804HyK.LJJI(8)), 0, Integer.valueOf(C45804HyK.LJJI(12)), 0, true);
            c55797Lv7.LJLILLLLZI.setLayoutParams(layoutParams3);
            C16880lQ.LJIIJ(new ACListenerS44S0200000_9(productInfo, c55797Lv7, 47), c55797Lv7.LJLILLLLZI);
            C55793Lv3.LIZIZ("tiktokec_product_entrance_show", productInfo);
        }
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a05, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        return new C55797Lv7(view, this.LJLIL);
    }
}
