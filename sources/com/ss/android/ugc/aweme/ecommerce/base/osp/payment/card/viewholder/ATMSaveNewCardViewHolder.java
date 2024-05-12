package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.viewholder;

import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C45804HyK;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71716SCq;
import X.C71897SJp;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.OUP;
import X.SFI;
import X.SFJ;
import X.SFK;
import X.SFL;
import X.SFN;
import X.SFO;
import X.YE1;
import Y.ACListenerS32S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.ICcdcSaveNewCardStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.SaveNewCardViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class ATMSaveNewCardViewHolder extends PowerCell<C71716SCq> implements c {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C5H3 dynamicStyle$delegate;
    public final C214298b3 viewModel$delegate;

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public ATMSaveNewCardViewHolder() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ATMCardViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 282);
        SFL sfl = SFL.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SFJ.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 283), new AqS162S0100000_12((InterfaceC93923mO) this, 284), SFO.INSTANCE, sfl, new AqS162S0100000_12((InterfaceC93923mO) this, 285), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SFK.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 286), new AqS162S0100000_12((InterfaceC93923mO) this, 277), SFN.INSTANCE, sfl, new AqS162S0100000_12((InterfaceC93923mO) this, 278), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SFI.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 279), new AqS162S0100000_12((InterfaceC93923mO) this, 280), new AqS162S0100000_12((InterfaceC93923mO) this, 281), sfl, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.viewModel$delegate = c214298b3;
        this.dynamicStyle$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 276));
    }

    private final ICcdcSaveNewCardStyle getDynamicStyle() {
        return (ICcdcSaveNewCardStyle) this.dynamicStyle$delegate.getValue();
    }

    public View getContainerView() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    public final ATMCardViewModel getViewModel() {
        return (ATMCardViewModel) this.viewModel$delegate.getValue();
    }

    @Override // wg5.c
    public String getViewName() {
        String LJFF = C65352Pkq.LIZ(SaveNewCardViewHolder.class).LJFF();
        if (LJFF == null) {
            return "";
        }
        return LJFF;
    }

    private final void adjustCheckBox() {
        ((C71897SJp) _$_findCachedViewById(R.id.b75)).setSize(getDynamicStyle().getCheckBoxSize());
        ((C71897SJp) _$_findCachedViewById(R.id.b74)).setSize(getDynamicStyle().getCheckBoxSize());
        ((TuxTextView) _$_findCachedViewById(R.id.lxu)).setTuxFont(getDynamicStyle().getSaveDisplayTextFont());
        if (getDynamicStyle().getCheckBoxPosition() == 0) {
            View cbSave = _$_findCachedViewById(R.id.b75);
            o.LJIIIIZZ(cbSave, "cbSave");
            OUP.LJIJJLI(cbSave);
            View cbRightSave = _$_findCachedViewById(R.id.b74);
            o.LJIIIIZZ(cbRightSave, "cbRightSave");
            OUP.LJJLIIIJ(cbRightSave);
            return;
        }
        View cbSave2 = _$_findCachedViewById(R.id.b75);
        o.LJIIIIZZ(cbSave2, "cbSave");
        OUP.LJJLIIIJ(cbSave2);
        View cbRightSave2 = _$_findCachedViewById(R.id.b74);
        o.LJIIIIZZ(cbRightSave2, "cbRightSave");
        OUP.LJIJJLI(cbRightSave2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onBindItemView(C71716SCq t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView((ATMSaveNewCardViewHolder) t);
        adjustCheckBox();
        this.itemView.setPadding(C45804HyK.LJJI(16), this.itemView.getPaddingTop(), C45804HyK.LJJI(16), this.itemView.getPaddingBottom());
        ((TextView) _$_findCachedViewById(R.id.lxu)).setText(t.LJLIL);
        ((C71897SJp) _$_findCachedViewById(R.id.b74)).setChecked(getViewModel().LJLJI);
        ((C71897SJp) _$_findCachedViewById(R.id.b75)).setChecked(getViewModel().LJLJI);
        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 49), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return OUP.LJIL(R.layout.wm, parent, false);
    }
}
