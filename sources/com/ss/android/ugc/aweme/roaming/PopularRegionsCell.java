package com.ss.android.ugc.aweme.roaming;

import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.C110614Vt;
import X.C16880lQ;
import X.C1DG;
import X.C1DI;
import X.C214298b3;
import X.C35557DxR;
import X.C47261Igj;
import X.C54652Lce;
import X.C54675Ld1;
import X.C54755LeJ;
import X.C54756LeK;
import X.C56294M7m;
import X.C56295M7n;
import X.C56296M7o;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7MY;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.LJ5;
import X.YE1;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PopularRegionsCell extends PowerCell<C35557DxR> implements View.OnClickListener {
    public LinearLayout LJLIL;
    public final List<TuxTextView> LJLILLLLZI = new ArrayList();
    public final C214298b3 LJLJI;

    public PopularRegionsCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RegionSearchViewModel.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 598);
        C54675Ld1 c54675Ld1 = C54675Ld1.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C56295M7n.INSTANCE, new AqS159S0100000_9(this, 599), new AqS159S0100000_9(this, 600), C54756LeK.INSTANCE, c54675Ld1, new AqS159S0100000_9(this, 601), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C56296M7o.INSTANCE, new AqS159S0100000_9(this, 602), new AqS159S0100000_9(this, 593), C54755LeJ.INSTANCE, c54675Ld1, new AqS159S0100000_9(this, 594), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C56294M7m.INSTANCE, new AqS159S0100000_9(this, 595), new AqS159S0100000_9(this, 596), new AqS159S0100000_9(this, 597), c54675Ld1, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJI = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.g5_);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.ll_popular_regions)");
        this.LJLIL = (LinearLayout) findViewById;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C35557DxR c35557DxR) {
        C35557DxR t = c35557DxR;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        if (t.LJLIL.isEmpty()) {
            return;
        }
        boolean z = false;
        int i = 0;
        for (LocationRegion locationRegion : t.LJLIL) {
            int i2 = i + 1;
            if (i >= 0) {
                LocationRegion locationRegion2 = locationRegion;
                if (i >= ((ArrayList) this.LJLILLLLZI).size()) {
                    LayoutInflater LLZIL = C16880lQ.LLZIL(this.itemView.getContext());
                    LinearLayout linearLayout = this.LJLIL;
                    if (linearLayout != null) {
                        View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, R.layout.bwh, linearLayout, z);
                        TuxTextView tuxTextView = (TuxTextView) LLLLIILL.findViewById(R.id.l1o);
                        TuxTextView tuxTextView2 = (TuxTextView) LLLLIILL.findViewById(R.id.l1q);
                        C110614Vt c110614Vt = new C110614Vt();
                        c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(2));
                        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cs);
                        c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
                        c110614Vt.LJFF = Integer.valueOf(R.attr.e0);
                        Context context = this.itemView.getContext();
                        o.LJIIIIZZ(context, "itemView.context");
                        tuxTextView.setBackground(c110614Vt.LIZ(context));
                        tuxTextView.setTag(Integer.valueOf(i));
                        C16880lQ.LJJJJI(tuxTextView, this);
                        C110614Vt c110614Vt2 = new C110614Vt();
                        c110614Vt2.LIZJ = Float.valueOf(C7MY.LIZIZ(2));
                        c110614Vt2.LIZIZ = Integer.valueOf(R.attr.cs);
                        c110614Vt2.LIZLLL = AnonymousClass391.LIZJ(1);
                        c110614Vt2.LJFF = Integer.valueOf(R.attr.e0);
                        Context context2 = this.itemView.getContext();
                        o.LJIIIIZZ(context2, "itemView.context");
                        tuxTextView2.setBackground(c110614Vt2.LIZ(context2));
                        tuxTextView2.setTag(Integer.valueOf(i2));
                        C16880lQ.LJJJJI(tuxTextView2, this);
                        ((ArrayList) this.LJLILLLLZI).add(tuxTextView);
                        ((ArrayList) this.LJLILLLLZI).add(tuxTextView2);
                        LinearLayout linearLayout2 = this.LJLIL;
                        if (linearLayout2 != null) {
                            linearLayout2.addView(LLLLIILL, linearLayout2.getChildCount() - 1);
                        } else {
                            o.LJIJI("llPopularRegions");
                            throw null;
                        }
                    } else {
                        o.LJIJI("llPopularRegions");
                        throw null;
                    }
                }
                TextView textView = (TextView) ListProtector.get(this.LJLILLLLZI, i);
                textView.setText(locationRegion2.getName());
                textView.setVisibility(0);
                z = false;
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List<LocationRegion> list;
        String str;
        if (view == null) {
            return;
        }
        Object tag = view.getTag();
        o.LJII(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) tag).intValue();
        C35557DxR item = getItem();
        if (item == null || (list = item.LJLIL) == null) {
            return;
        }
        LocationRegion locationRegion = (LocationRegion) ListProtector.get(list, intValue);
        ActivityC45651qj LJ = C1DG.LJ(this.itemView, "itemView.context");
        if (LJ != null) {
            RoamingLocationInfo LIZIZ = LJ5.LIZIZ(LJ);
            String name = locationRegion.getName();
            if (LIZIZ != null) {
                str = LIZIZ.getManualRegionName();
            } else {
                str = null;
            }
            C54652Lce.LIZJ("popular_region", name, str);
        }
        this.LJLJI.getValue().setState(new AqS175S0100000_9(locationRegion, 528));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bwi, viewGroup, false, "from(parent.context)\n   …r_regions, parent, false)");
    }
}
