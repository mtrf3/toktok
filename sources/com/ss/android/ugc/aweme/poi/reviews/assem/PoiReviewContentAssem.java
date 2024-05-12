package com.ss.android.ugc.aweme.poi.reviews.assem;

import X.C16880lQ;
import X.C186817Uv;
import X.C186827Uw;
import X.C2068389v;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C32151Nz;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7MY;
import X.C7V0;
import X.C8YN;
import X.C9BE;
import X.InterfaceC199107re;
import X.O6R;
import X.SY9;
import X.SYL;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import Y.IDrS43S0100000_3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewListViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiReviewContentAssem extends UIListContentAssem<PoiReviewListViewModel> implements PoiReviewListItemCell.PoiReviewCellVAbility {
    public final C55749LuL LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public ViewGroup LJLJJI;
    public TuxTextView LJLJJL;
    public TuxTextView LJLJJLL;
    public ViewGroup LJLJL;
    public ViewGroup LJLJLJ;

    public PoiReviewContentAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LJ(this, C7V0.class, "PoiReviewHierarchyData"), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 777);
        C65776Prg LIZ = C65352Pkq.LIZ(PoiReviewListViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 779), C186827Uw.INSTANCE, aqS153S0100000_3);
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 778));
    }

    public final PoiReviewListViewModel C3() {
        return (PoiReviewListViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.PoiReviewListItemCell.PoiReviewCellVAbility
    public final C186817Uv di0() {
        return new C186817Uv(true);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        return c57939MoZ;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final PoiReviewListViewModel A3() {
        return C3();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.PoiReviewListItemCell.PoiReviewCellVAbility
    public final InterfaceC199107re Um() {
        return C3();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        ViewGroup viewGroup2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        ViewGroup viewGroup3 = null;
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, PoiReviewListItemCell.PoiReviewCellVAbility.class, null);
        }
        SYL v3 = v3();
        v3.setLifecycleOwner(this);
        v3.LLLF.LJZL(PoiReviewListItemCell.class);
        v3.getContext();
        v3.setLayoutManager(new LinearLayoutManager());
        v3.setItemAnimator(null);
        v3.LJIIJJI(new IDrS43S0100000_3(this, 5));
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(v3().getContext()), R.layout.c12, v3(), false);
        if (LLLLIILL instanceof ViewGroup) {
            viewGroup = (ViewGroup) LLLLIILL;
        } else {
            viewGroup = null;
        }
        this.LJLJJI = viewGroup;
        if (viewGroup != null) {
            tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.huy);
        } else {
            tuxTextView = null;
        }
        this.LJLJJL = tuxTextView;
        ViewGroup viewGroup4 = this.LJLJJI;
        if (viewGroup4 != null) {
            tuxTextView2 = (TuxTextView) viewGroup4.findViewById(R.id.hux);
        } else {
            tuxTextView2 = null;
        }
        this.LJLJJLL = tuxTextView2;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_star_fill;
        c2068389v.LIZIZ = C7MY.LIZIZ(16);
        c2068389v.LIZJ = C7MY.LIZIZ(16);
        c2068389v.LJ = Integer.valueOf(R.attr.c6);
        Context context = getContainerView().getContext();
        o.LJIIIIZZ(context, "containerView.context");
        SY9 LIZ = c2068389v.LIZ(context);
        LIZ.setBounds(0, 0, LIZ.LJI, LIZ.LJII);
        TuxTextView tuxTextView3 = this.LJLJJL;
        if (tuxTextView3 != null) {
            tuxTextView3.setCompoundDrawablesWithIntrinsicBounds(LIZ, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        TuxTextView tuxTextView4 = this.LJLJJL;
        if (tuxTextView4 != null) {
            tuxTextView4.setCompoundDrawablePadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
        }
        ViewGroup viewGroup5 = this.LJLJJI;
        if (viewGroup5 != null) {
            viewGroup5.setVisibility(8);
        }
        v3().LJLJL(0, this.LJLJJI);
        C8YN.LJII(this, C3(), new TBT() { // from class: X.7Ut
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C7VC) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 217), 6);
        View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(v3().getContext()), R.layout.c11, v3(), false);
        if (LLLLIILL2 instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) LLLLIILL2;
        } else {
            viewGroup2 = null;
        }
        this.LJLJL = viewGroup2;
        if (viewGroup2 != null) {
            viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.huv);
        }
        this.LJLJLJ = viewGroup3;
        v3().LJLJJLL(this.LJLJL);
        ViewGroup viewGroup6 = this.LJLJL;
        if (viewGroup6 != null) {
            ViewGroup viewGroup7 = this.LJLJLJ;
            if (viewGroup7 != null) {
                viewGroup7.setVisibility(8);
            }
            C16880lQ.LJIIL(viewGroup6, new ACListenerS23S0100000_3(this, 304));
        }
        C8YN.LJII(this, C3(), new TBT() { // from class: X.7Uy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C7VC) obj).LJLJJI);
            }
        }, null, new AqS185S0100000_3(this, 216), 6);
    }
}
