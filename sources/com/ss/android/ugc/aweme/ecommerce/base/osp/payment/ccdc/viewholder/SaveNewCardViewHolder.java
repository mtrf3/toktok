package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.ARV;
import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C26706Ady;
import X.C27500Aqm;
import X.C28121B1x;
import X.C45804HyK;
import X.C59082To;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71897SJp;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.OUP;
import X.SFF;
import X.SFG;
import X.SFH;
import X.SFM;
import X.SFP;
import X.SFQ;
import X.YE1;
import Y.ACListenerS21S0100000_1;
import Y.IDCSpanS0S0200000_1;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.ICcdcSaveNewCardStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class SaveNewCardViewHolder extends PowerCell<C59082To> implements c {
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

    public SaveNewCardViewHolder() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CCDCAddCardViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 335);
        SFM sfm = SFM.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SFG.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 336), new AqS162S0100000_12((InterfaceC93923mO) this, 337), SFQ.INSTANCE, sfm, new AqS162S0100000_12((InterfaceC93923mO) this, 338), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SFH.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 339), new AqS162S0100000_12((InterfaceC93923mO) this, 330), SFP.INSTANCE, sfm, new AqS162S0100000_12((InterfaceC93923mO) this, 331), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SFF.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 332), new AqS162S0100000_12((InterfaceC93923mO) this, 333), new AqS162S0100000_12((InterfaceC93923mO) this, 334), sfm, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.viewModel$delegate = c214298b3;
        this.dynamicStyle$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 329));
    }

    private final ICcdcSaveNewCardStyle getDynamicStyle() {
        return (ICcdcSaveNewCardStyle) this.dynamicStyle$delegate.getValue();
    }

    public View getContainerView() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    public final CCDCAddCardViewModel getViewModel() {
        return (CCDCAddCardViewModel) this.viewModel$delegate.getValue();
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

    private final void showSaveForNextTimeSwitch() {
        View saveForNextTimeSwitch = _$_findCachedViewById(R.id.jaj);
        o.LJIIIIZZ(saveForNextTimeSwitch, "saveForNextTimeSwitch");
        OUP.LJJLIIIJ(saveForNextTimeSwitch);
        View cbSave = _$_findCachedViewById(R.id.b75);
        o.LJIIIIZZ(cbSave, "cbSave");
        OUP.LJIJJLI(cbSave);
        View cbRightSave = _$_findCachedViewById(R.id.b74);
        o.LJIIIIZZ(cbRightSave, "cbRightSave");
        OUP.LJIJJLI(cbRightSave);
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onBindItemView(C59082To t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView((SaveNewCardViewHolder) t);
        adjustCheckBox();
        this.itemView.setPadding(C45804HyK.LJJI(16), this.itemView.getPaddingTop(), C45804HyK.LJJI(16), this.itemView.getPaddingBottom());
        if (C27500Aqm.LIZ()) {
            showSaveForNextTimeSwitch();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t.LJLIL);
        C28121B1x.LIZ.getClass();
        if (C28121B1x.LIZ() && t.LJLILLLLZI != null) {
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            String str = t.LJLILLLLZI.name;
            if (str == null) {
                str = "";
            }
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(new IDCSpanS0S0200000_1(this, t, 1), length, spannableStringBuilder.length(), 33);
            ((TextView) _$_findCachedViewById(R.id.lxu)).setMovementMethod(LinkMovementMethod.getInstance());
            spannableStringBuilder.append((CharSequence) " ");
        }
        ((TextView) _$_findCachedViewById(R.id.lxu)).setText(spannableStringBuilder);
        ((C71897SJp) _$_findCachedViewById(R.id.b74)).setChecked(getViewModel().getState().LJLJJL);
        ((C71897SJp) _$_findCachedViewById(R.id.b75)).setChecked(getViewModel().getState().LJLJJL);
        ((ARV) _$_findCachedViewById(R.id.jaj)).setChecked(getViewModel().getState().LJLJJL);
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 34), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return OUP.LJIL(R.layout.wm, parent, false);
    }
}
