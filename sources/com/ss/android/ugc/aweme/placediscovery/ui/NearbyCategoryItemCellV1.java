package com.ss.android.ugc.aweme.placediscovery.ui;

import X.C06490Nh;
import X.C110614Vt;
import X.C16880lQ;
import X.C214298b3;
import X.C32151Nz;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78847Ux1;
import X.C78897Uxp;
import X.C86381XvF;
import X.C86382XvG;
import X.C86383XvH;
import X.C86387XvL;
import X.C86389XvN;
import X.C86390XvO;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC72807Shn;
import X.InterfaceC65784Pro;
import X.M3Z;
import X.O6R;
import X.W5F;
import X.W5U;
import X.YE1;
import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.placediscovery.manager.NearbyCategoryTabViewModel;
import com.ss.android.ugc.aweme.placediscovery.model.PoiCategory;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class NearbyCategoryItemCellV1 extends PowerCell<PoiCategory> {
    public final /* synthetic */ C78847Ux1 LJLIL = new C78847Ux1();
    public TuxIconView LJLILLLLZI;
    public TuxTextView LJLJI;
    public final C214298b3 LJLJJI;

    public NearbyCategoryItemCellV1() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NearbyCategoryTabViewModel.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 494);
        C86387XvL c86387XvL = C86387XvL.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C86382XvG.INSTANCE, new AqS165S0100000_15(this, 495), new AqS165S0100000_15(this, 496), C86390XvO.INSTANCE, c86387XvL, new AqS165S0100000_15(this, 497), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C86383XvH.INSTANCE, new AqS165S0100000_15(this, 498), new AqS165S0100000_15(this, 489), C86389XvN.INSTANCE, c86387XvL, new AqS165S0100000_15(this, 490), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C86381XvF.INSTANCE, new AqS165S0100000_15(this, 491), new AqS165S0100000_15(this, 492), new AqS165S0100000_15(this, 493), c86387XvL, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJJI = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(PoiCategory poiCategory) {
        PoiCategory t = poiCategory;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        String str = t.tabImg;
        if (str != null) {
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
            TuxIconView tuxIconView = this.LJLILLLLZI;
            if (tuxIconView != null) {
                LJIIIIZZ.LJJIIJZLJL = tuxIconView;
                LJIIIIZZ.LJIJJ = EnumC72807Shn.CENTER_INSIDE;
                C16880lQ.LLJJJ(LJIIIIZZ);
            } else {
                o.LJIJI("ivCategoryIcon");
                throw null;
            }
        }
        String str2 = t.tabName;
        if (str2 != null) {
            TuxTextView tuxTextView = this.LJLJI;
            if (tuxTextView != null) {
                tuxTextView.setText(str2);
            } else {
                o.LJIJI("tvCategoryName");
                throw null;
            }
        }
        IPoiService LIZIZ = PoiServiceImpl.LIZIZ();
        M3Z m3z = new M3Z("category_carousel_show");
        String str3 = t.tabName;
        if (str3 == null) {
            str3 = "";
        }
        m3z.LIZLLL = str3;
        LIZIZ.LJJLIIIJ(m3z);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bwk, viewGroup, false);
        View findViewById = LIZIZ.findViewById(R.id.b6u);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.category_icon)");
        this.LJLILLLLZI = (TuxIconView) findViewById;
        View findViewById2 = LIZIZ.findViewById(R.id.b6v);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.category_name)");
        this.LJLJI = (TuxTextView) findViewById2;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.db);
        c110614Vt.LIZJ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "parent.context");
        LIZIZ.setBackground(c110614Vt.LIZ(context));
        C78897Uxp.LJJJJL(LIZIZ, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 45), LIZIZ);
        return LIZIZ;
    }
}
