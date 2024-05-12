package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.ActivityC45651qj;
import X.C025908h;
import X.C110614Vt;
import X.C17N;
import X.C189107bW;
import X.C189117bX;
import X.C189127bY;
import X.C2068389v;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C2K0;
import X.C55096Ljo;
import X.C59242Ue;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C77123UOp;
import X.C78926UyI;
import X.C7MY;
import X.C86V;
import X.C8VC;
import X.C9BE;
import X.InterfaceC189137bZ;
import X.InterfaceC55102Lju;
import X.KL2;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiDetailFavoriteBottomAssem extends PoiCollectStatusBaseAssem implements IPoiDetailFavoriteBottomVAbility, InterfaceC55102Lju {
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C214298b3 LJZI;
    public long LJZL;
    public boolean LL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -997701040) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.bzr;
    }

    public PoiDetailFavoriteBottomAssem() {
        new LinkedHashMap();
        this.LJLLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 697));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 699));
        this.LJLZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 700));
        this.LJZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 698));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiDetailInfoViewModel.class);
        this.LJZI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 701), C189117bX.INSTANCE, null);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final View L3() {
        Object value = this.LJLLLL.getValue();
        o.LJIIIIZZ(value, "<get-poiCollectContainer>(...)");
        return (View) value;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final TuxIconView N3() {
        Object value = this.LJLLLLLL.getValue();
        o.LJIIIIZZ(value, "<get-poiCollectIcon>(...)");
        return (TuxIconView) value;
    }

    public final TuxTextView U3() {
        Object value = this.LJZ.getValue();
        o.LJIIIIZZ(value, "<get-poiCollectDesc>(...)");
        return (TuxTextView) value;
    }

    public final TuxTextView W3() {
        Object value = this.LJLZ.getValue();
        o.LJIIIIZZ(value, "<get-poiCollectText>(...)");
        return (TuxTextView) value;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.IPoiDetailFavoriteBottomVAbility
    public final void C2() {
        C59242Ue c59242Ue;
        View L3 = L3();
        if ((L3 instanceof C59242Ue) && (c59242Ue = (C59242Ue) L3) != null) {
            c59242Ue.LJLIL = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final String I3() {
        return M3().LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.IPoiDetailFavoriteBottomVAbility
    public final void jv() {
        C59242Ue c59242Ue;
        View L3 = L3();
        if ((L3 instanceof C59242Ue) && (c59242Ue = (C59242Ue) L3) != null) {
            c59242Ue.LJLIL = false;
        }
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void P3(boolean z) {
        C189127bY.LIZIZ((InterfaceC189137bZ) C8VC.LIZIZ(this, C65352Pkq.LIZ(InterfaceC189137bZ.class), null), z, "click_banner");
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void R3(boolean z) {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        if (z) {
            if (!this.LL) {
                X3(this.LJZL + 1);
            } else {
                X3(this.LJZL);
            }
            View L3 = L3();
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
            c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(18));
            L3.setBackground(c110614Vt.LIZ(LIZ));
            TuxIconView N3 = N3();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_bookmark_fill;
            c2068389v.LJ = Integer.valueOf(R.attr.go);
            c2068389v.LIZIZ = C7MY.LIZIZ(20);
            c2068389v.LIZJ = C7MY.LIZIZ(20);
            N3.setTuxIcon(c2068389v);
            W3().setText(R.string.oyx);
            W3().setTextColorRes(R.attr.go);
            return;
        }
        if (this.LL) {
            X3(this.LJZL - 1);
        } else {
            X3(this.LJZL);
        }
        View L32 = L3();
        C110614Vt c110614Vt2 = new C110614Vt();
        c110614Vt2.LIZIZ = Integer.valueOf(R.attr.eb);
        c110614Vt2.LIZJ = Float.valueOf(C7MY.LIZIZ(18));
        L32.setBackground(c110614Vt2.LIZ(LIZ));
        TuxIconView N32 = N3();
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_bookmark;
        c2068389v2.LJ = Integer.valueOf(R.attr.dj);
        c2068389v2.LIZIZ = C7MY.LIZIZ(20);
        c2068389v2.LIZJ = C7MY.LIZIZ(20);
        N32.setTuxIcon(c2068389v2);
        W3().setText(R.string.oyw);
        W3().setTextColorRes(R.attr.dj);
    }

    public final void X3(long j) {
        if (j <= 0) {
            C17N.LJJIIJZLJL(U3());
        } else if (U3().getVisibility() != 0) {
            C17N.LJJLIIIJJI(U3());
        }
        String LJFF = C86V.LJFF(R.string.oyy);
        o.LJIIIIZZ(LJFF, "getString(R.string.poiBu…lPage_addFavorite_banner)");
        C025908h.LJ(new Object[]{C77123UOp.LJJIIJ(j)}, 1, ujb.o.LJJJJZ(LJFF, "%d", "%s", false), "format(format, *args)", U3());
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        long j;
        boolean z;
        Long l;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        L3().setMinimumWidth((int) (KL2.LJIIJJI(getContext()) * 0.4f));
        PoiListApi.PoiDetailResponse poiDetailResponse = ((PoiDetailInfoViewModel) this.LJZI.getValue()).LJLILLLLZI;
        if (poiDetailResponse != null && (l = poiDetailResponse.realFavoriteCnt) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.LJZL = j;
        Boolean bool = (Boolean) withState((AssemViewModel) this.LJZI.getValue(), C189107bW.LJLIL);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LL = z;
        X3(j);
    }
}
