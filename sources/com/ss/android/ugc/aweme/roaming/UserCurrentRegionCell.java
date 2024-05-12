package com.ss.android.ugc.aweme.roaming;

import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.C04330Ez;
import X.C110614Vt;
import X.C16880lQ;
import X.C1DG;
import X.C1DI;
import X.C214298b3;
import X.C32151Nz;
import X.C54579LbT;
import X.C54652Lce;
import X.C54671Lcx;
import X.C54757LeL;
import X.C54758LeM;
import X.C56179M3b;
import X.C56297M7p;
import X.C56298M7q;
import X.C56299M7r;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7MY;
import X.C85258Xd8;
import X.C85296Xdk;
import X.C86V;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.LJ5;
import X.LJ9;
import X.O6R;
import X.YE1;
import Y.IDLListenerS196S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class UserCurrentRegionCell extends PowerCell<LJ9> implements View.OnClickListener {
    public TuxIconView LJLIL;
    public TuxTextView LJLILLLLZI;
    public LinearLayout LJLJI;
    public final C214298b3 LJLJJI;

    public UserCurrentRegionCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RegionSearchViewModel.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 612);
        C54671Lcx c54671Lcx = C54671Lcx.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C56298M7q.INSTANCE, new AqS159S0100000_9(this, 613), new AqS159S0100000_9(this, 614), C54758LeM.INSTANCE, c54671Lcx, new AqS159S0100000_9(this, 615), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C56299M7r.INSTANCE, new AqS159S0100000_9(this, 616), new AqS159S0100000_9(this, 607), C54757LeL.INSTANCE, c54671Lcx, new AqS159S0100000_9(this, 608), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C56297M7p.INSTANCE, new AqS159S0100000_9(this, 609), new AqS159S0100000_9(this, 610), new AqS159S0100000_9(this, 611), c54671Lcx, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJJI = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.f9q);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_region_icon)");
        this.LJLIL = (TuxIconView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.mbx);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tv_my_region)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.g2n);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.ll_current_region)");
        LinearLayout linearLayout = (LinearLayout) findViewById3;
        this.LJLJI = linearLayout;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(2));
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cs);
        c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
        c110614Vt.LJFF = Integer.valueOf(R.attr.e0);
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        linearLayout.setBackground(c110614Vt.LIZ(context));
        LinearLayout linearLayout2 = this.LJLJI;
        if (linearLayout2 != null) {
            C16880lQ.LJIIZILJ(linearLayout2, this);
            if (this.itemView.getMeasuredWidth() > 0) {
                LinearLayout linearLayout3 = this.LJLJI;
                if (linearLayout3 != null) {
                    linearLayout3.setMinimumWidth((this.itemView.getMeasuredWidth() - O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))) / 2);
                    return;
                } else {
                    o.LJIJI("llCurrentRegion");
                    throw null;
                }
            }
            this.itemView.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS196S0100000_9(this, 1));
            return;
        }
        o.LJIJI("llCurrentRegion");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(LJ9 lj9) {
        LJ9 t = lj9;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        ILocationService LJIJJ = LocationServiceImpl.LJIJJ();
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        if (!LJIJJ.LJIILLIIL(0, context)) {
            C85296Xdk.LIZ.getClass();
            if (C85296Xdk.LIZLLL("poi", "nearby_change_region")) {
                TuxIconView tuxIconView = this.LJLIL;
                if (tuxIconView != null) {
                    tuxIconView.setIconRes(R.raw.icon_arrow_clockwise);
                    TuxIconView tuxIconView2 = this.LJLIL;
                    if (tuxIconView2 != null) {
                        tuxIconView2.setTintColorRes(R.attr.go);
                        TuxTextView tuxTextView = this.LJLILLLLZI;
                        if (tuxTextView != null) {
                            tuxTextView.setText(C86V.LJFF(R.string.ilr));
                            return;
                        } else {
                            o.LJIJI("tvRegionName");
                            throw null;
                        }
                    }
                    o.LJIJI("ivRegionIcon");
                    throw null;
                }
                o.LJIJI("ivRegionIcon");
                throw null;
            }
        }
        LocationRegion locationRegion = t.LJLIL;
        if (locationRegion != null) {
            TuxIconView tuxIconView3 = this.LJLIL;
            if (tuxIconView3 != null) {
                tuxIconView3.setIconRes(R.raw.icon_map_pin_fill);
                TuxIconView tuxIconView4 = this.LJLIL;
                if (tuxIconView4 != null) {
                    tuxIconView4.setTintColor(C04330Ez.LIZIZ(tuxIconView4.getContext(), R.color.pz));
                    TuxTextView tuxTextView2 = this.LJLILLLLZI;
                    if (tuxTextView2 != null) {
                        String name = locationRegion.getName();
                        if (name == null && (name = locationRegion.getParentName()) == null) {
                            name = "";
                        }
                        tuxTextView2.setText(name);
                        return;
                    }
                    o.LJIJI("tvRegionName");
                    throw null;
                }
                o.LJIJI("ivRegionIcon");
                throw null;
            }
            o.LJIJI("ivRegionIcon");
            throw null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LocationRegion locationRegion;
        String str;
        TokenCert with;
        ILocationService LJIJJ = LocationServiceImpl.LJIJJ();
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        if (!LJIJJ.LJIILLIIL(0, context)) {
            C85296Xdk.LIZ.getClass();
            if (C85296Xdk.LIZLLL("poi", "nearby_change_region")) {
                if (((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isSupportedPreciseGps()) {
                    with = TokenCert.Companion.with("bpea-nearby_roaming_current_region_fetch_permission_for_precise");
                } else {
                    with = TokenCert.Companion.with("bpea-nearby_roaming_current_region_fetch_permission_for_coarse");
                }
                ActivityC45651qj LJ = C1DG.LJ(this.itemView, "itemView.context");
                if (LJ == null) {
                    return;
                }
                C56179M3b.LIZ.LJIJI("poi", "nearby_change_region", with, LJ, new C85258Xd8("change_region", null, null, false, 254), new C54579LbT(this), null);
                return;
            }
        }
        LJ9 item = getItem();
        if (item != null && (locationRegion = item.LJLIL) != null) {
            ActivityC45651qj LJ2 = C1DG.LJ(this.itemView, "itemView.context");
            if (LJ2 != null) {
                RoamingLocationInfo LIZIZ = LJ5.LIZIZ(LJ2);
                String name = locationRegion.getName();
                if (name == null && (name = locationRegion.getParentName()) == null) {
                    name = "";
                }
                if (LIZIZ != null) {
                    str = LIZIZ.getManualRegionName();
                } else {
                    str = null;
                }
                C54652Lce.LIZJ("current_region", name, str);
            }
            this.LJLJJI.getValue().setState(new AqS175S0100000_9(locationRegion, 528));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bwg, viewGroup, false, "from(parent.context)\n   …nt_region, parent, false)");
    }
}
