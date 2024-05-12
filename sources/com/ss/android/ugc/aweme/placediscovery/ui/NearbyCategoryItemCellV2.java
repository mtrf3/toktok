package com.ss.android.ugc.aweme.placediscovery.ui;

import X.C06490Nh;
import X.C110614Vt;
import X.C141335gf;
import X.C16880lQ;
import X.C214298b3;
import X.C32151Nz;
import X.C3C5;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78847Ux1;
import X.C78897Uxp;
import X.C7MY;
import X.C86384XvI;
import X.C86385XvJ;
import X.C86386XvK;
import X.C86388XvM;
import X.C86391XvP;
import X.C86392XvQ;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC72807Shn;
import X.InterfaceC65784Pro;
import X.M3Z;
import X.O6R;
import X.S3I;
import X.S3L;
import X.W5F;
import X.W5U;
import X.YE1;
import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.placediscovery.manager.NearbyCategoryTabViewModel;
import com.ss.android.ugc.aweme.placediscovery.model.PoiCategory;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class NearbyCategoryItemCellV2 extends PowerCell<PoiCategory> {
    public final /* synthetic */ C78847Ux1 LJLIL = new C78847Ux1();
    public TuxIconView LJLILLLLZI;
    public TuxTextView LJLJI;
    public final C214298b3 LJLJJI;

    public NearbyCategoryItemCellV2() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NearbyCategoryTabViewModel.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 504);
        C86388XvM c86388XvM = C86388XvM.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C86385XvJ.INSTANCE, new AqS165S0100000_15(this, 505), new AqS165S0100000_15(this, 506), C86392XvQ.INSTANCE, c86388XvM, new AqS165S0100000_15(this, 507), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C86386XvK.INSTANCE, new AqS165S0100000_15(this, 508), new AqS165S0100000_15(this, 499), C86391XvP.INSTANCE, c86388XvM, new AqS165S0100000_15(this, LiveMaxRetainAlogMessageSizeSetting.DEFAULT), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C86384XvI.INSTANCE, new AqS165S0100000_15(this, 501), new AqS165S0100000_15(this, 502), new AqS165S0100000_15(this, 503), c86388XvM, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJJI = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(PoiCategory poiCategory) {
        Object LIZ;
        C110614Vt c110614Vt;
        TuxIconView tuxIconView;
        PoiCategory t = poiCategory;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        String str = t.tabImg;
        if (str != null) {
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
            TuxIconView tuxIconView2 = this.LJLILLLLZI;
            if (tuxIconView2 != null) {
                LJIIIIZZ.LJJIIJZLJL = tuxIconView2;
                LJIIIIZZ.LJIJJ = EnumC72807Shn.CENTER_CROP;
                S3I s3i = new S3I();
                s3i.LIZLLL = C7MY.LIZIZ(8);
                LJIIIIZZ.LJIJJLI = new S3L(s3i);
                String str2 = t.tabColor;
                if (str2 != null) {
                    try {
                        int parseColor = Color.parseColor(str2);
                        c110614Vt = new C110614Vt();
                        c110614Vt.LIZJ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                        c110614Vt.LIZ = Integer.valueOf(parseColor);
                        tuxIconView = this.LJLILLLLZI;
                    } catch (Throwable th) {
                        LIZ = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ);
                    }
                    if (tuxIconView != null) {
                        Context context = tuxIconView.getContext();
                        o.LJIIIIZZ(context, "ivCategoryIcon.context");
                        LJIIIIZZ.LJIILIIL = c110614Vt.LIZ(context);
                        C3C5.m7constructorimpl(LJIIIIZZ);
                        LIZ = LJIIIIZZ;
                        C3C5.m6boximpl(LIZ);
                    } else {
                        o.LJIJI("ivCategoryIcon");
                        throw null;
                    }
                }
                C16880lQ.LLJJJ(LJIIIIZZ);
            } else {
                o.LJIJI("ivCategoryIcon");
                throw null;
            }
        }
        String str3 = t.tabName;
        if (str3 != null) {
            TuxTextView tuxTextView = this.LJLJI;
            if (tuxTextView != null) {
                String lowerCase = str3.toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                tuxTextView.setText(lowerCase);
            } else {
                o.LJIJI("tvCategoryName");
                throw null;
            }
        }
        IPoiService LIZIZ = PoiServiceImpl.LIZIZ();
        M3Z m3z = new M3Z("category_carousel_show");
        String str4 = t.tabName;
        if (str4 == null) {
            str4 = "";
        }
        m3z.LIZLLL = str4;
        LIZIZ.LJJLIIIJ(m3z);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bwl, viewGroup, false);
        View findViewById = LIZIZ.findViewById(R.id.b6u);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.category_icon)");
        this.LJLILLLLZI = (TuxIconView) findViewById;
        View findViewById2 = LIZIZ.findViewById(R.id.b6v);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.category_name)");
        this.LJLJI = (TuxTextView) findViewById2;
        C78897Uxp.LJJJJL(LIZIZ, C7MY.LIZIZ(8));
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 46), LIZIZ);
        return LIZIZ;
    }
}
