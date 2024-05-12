package com.ss.android.ugc.aweme.im.sdk.chatdetail.group.functions;

import X.AD5;
import X.AI2;
import X.AI8;
import X.AIF;
import X.C16880lQ;
import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72360Saa;
import X.C72361Sab;
import X.C72362Sac;
import X.C72363Sad;
import X.C72364Sae;
import X.C77339UWx;
import X.C95493ov;
import X.C95543p0;
import X.C96083ps;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC95523oy;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FunctionCell extends PowerCell<C95493ov> {
    public final C214298b3 LJLIL;

    public FunctionCell() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(GroupDetailViewModel.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 464);
        C96083ps c96083ps = C96083ps.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72363Sad.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 465), new AqS162S0100000_12(this, 607), C72361Sab.INSTANCE, c96083ps, new AqS162S0100000_12(this, 608), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72364Sae.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 466), new AqS151S0100000_1((InterfaceC93923mO) this, 460), C72360Saa.INSTANCE, c96083ps, new AqS162S0100000_12(this, 606), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72362Sac.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 461), new AqS151S0100000_1((InterfaceC93923mO) this, 462), new AqS151S0100000_1((InterfaceC93923mO) this, 463), c96083ps, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLIL = c214298b3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C95493ov c95493ov) {
        AI8 ai8;
        AI2 ai2;
        String str;
        Integer subTitle;
        final C95493ov t = c95493ov;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        View view = this.itemView;
        final AI2 ai22 = null;
        if (!(view instanceof AI8) || (ai8 = (AI8) view) == null) {
            return;
        }
        EnumC95523oy enumC95523oy = t.LJLIL;
        int i = C95543p0.LIZ[enumC95523oy.getAccessory().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ai8.setOnClickListener(new AqS167S0100000_1(t, 258));
                } else {
                    Context context = this.itemView.getContext();
                    o.LJIIIIZZ(context, "itemView.context");
                    AIF aif = new AIF(context, null);
                    aif.LJIILJJIL(new ACListenerS21S0100000_1(t, 151));
                    ai2 = aif;
                }
            } else {
                Context context2 = this.itemView.getContext();
                o.LJIIIIZZ(context2, "itemView.context");
                ai22 = new AI2(context2);
                ai22.LJIILL(new CompoundButton.OnCheckedChangeListener() { // from class: X.3ox
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        C95493ov.this.LJLILLLLZI.invoke(Boolean.valueOf(z));
                        ai22.LJIILIIL(((Boolean) C95493ov.this.LJLIL.getDefaultValue().invoke(((AssemViewModel) this.LJLIL.getValue()).getState())).booleanValue());
                    }
                });
                ai22.LJIILIIL(((Boolean) t.LJLIL.getDefaultValue().invoke(((AssemViewModel) this.LJLIL.getValue()).getState())).booleanValue());
            }
            ai8.setAccessory(ai22);
            ai8.setTitle(ai8.getContext().getString(enumC95523oy.getTitle()));
            if (enumC95523oy.getSubTitle() == null && ((subTitle = enumC95523oy.getSubTitle()) == null || subTitle.intValue() != 0)) {
                str = ai8.getContext().getString(enumC95523oy.getSubTitle().intValue());
            } else {
                str = "";
            }
            ai8.setSubtitle(str);
            ai8.setVariant(enumC95523oy.getVariant());
        }
        Context context3 = this.itemView.getContext();
        o.LJIIIIZZ(context3, "itemView.context");
        AD5 ad5 = new AD5(context3, null);
        C16880lQ.LJJJJI(ad5.LIZIZ, new ACListenerS21S0100000_1(t, 150));
        ai2 = ad5;
        ai22 = ai2;
        ai8.setAccessory(ai22);
        ai8.setTitle(ai8.getContext().getString(enumC95523oy.getTitle()));
        if (enumC95523oy.getSubTitle() == null) {
        }
        str = "";
        ai8.setSubtitle(str);
        ai8.setVariant(enumC95523oy.getVariant());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        AI8 ai8 = new AI8(context, null, 6);
        ai8.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return ai8;
    }
}
