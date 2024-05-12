package com.ss.android.ugc.aweme.relation.ffp.ui.cell;

import X.C214298b3;
import X.C57571Mid;
import X.C57572Mie;
import X.C63796P2a;
import X.C63802P2g;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72390Sb4;
import X.C72391Sb5;
import X.C72392Sb6;
import X.C72393Sb7;
import X.C72394Sb8;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC58046MqI;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.P2J;
import X.SY4;
import X.YE1;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.relation.ffp.vm.RecFriendsVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS56S0400000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class RecFriendsAuthCell extends RecFriendsTopBaseCell<P2J> {
    public final C214298b3 LJLJJL;

    public RecFriendsAuthCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RecFriendsVM.class);
        AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 321);
        C63802P2g c63802P2g = C63802P2g.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS160S0100000_10, C72393Sb7.INSTANCE, new AqS160S0100000_10((InterfaceC93923mO) this, 322), new AqS160S0100000_10((InterfaceC93923mO) this, 323), C72391Sb5.INSTANCE, c63802P2g, new AqS162S0100000_12(this, 879), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS160S0100000_10, C72394Sb8.INSTANCE, new AqS160S0100000_10((InterfaceC93923mO) this, 324), new AqS160S0100000_10((InterfaceC93923mO) this, 317), C72390Sb4.INSTANCE, c63802P2g, new AqS162S0100000_12(this, 878), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS160S0100000_10, C72392Sb6.INSTANCE, new AqS160S0100000_10((InterfaceC93923mO) this, 318), new AqS160S0100000_10((InterfaceC93923mO) this, 319), new AqS160S0100000_10((InterfaceC93923mO) this, 320), c63802P2g, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJJL = c214298b3;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsTopBaseCell
    public final void N(P2J p2j) {
        P2J item = p2j;
        o.LJIIIZ(item, "item");
        Context context = this.itemView.getContext();
        EnumC58046MqI enumC58046MqI = item.LJLIL;
        if (!item.LJLILLLLZI) {
            o.LJIIIIZZ(context, "context");
            C57572Mie.LIZ(enumC58046MqI, context, new C57571Mid(item.LJLJJI.LJLIL, "click", null, 12), new AqS56S0400000_10(this, context, enumC58046MqI, item, 1));
        } else {
            o.LJIIIIZZ(context, "context");
            Q(enumC58046MqI, context, item);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsTopBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(P2J item) {
        String num;
        int i;
        View view;
        String num2;
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        Context context = this.itemView.getContext();
        int i2 = C63796P2a.LIZ[item.LJLIL.ordinal()];
        String str = "";
        int i3 = 0;
        if (i2 != 1) {
            if (i2 == 2) {
                TuxIconView tuxIconView = this.LJLIL;
                if (tuxIconView != null) {
                    tuxIconView.setIconRes(R.raw.icon_color_facebook_circle);
                    TuxTextView tuxTextView = this.LJLILLLLZI;
                    if (tuxTextView != null) {
                        tuxTextView.setText(context.getText(R.string.gh_));
                        TuxTextView L = L();
                        Integer valueOf = Integer.valueOf(item.LJLJI);
                        if (valueOf.intValue() > 0 && (num2 = valueOf.toString()) != null) {
                            str = num2;
                        }
                        L.setText(str);
                    } else {
                        o.LJIJI("titleTextView");
                        throw null;
                    }
                } else {
                    o.LJIJI("iconView");
                    throw null;
                }
            }
        } else {
            TuxIconView tuxIconView2 = this.LJLIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_color_contact_circle);
                TuxTextView tuxTextView2 = this.LJLILLLLZI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(context.getText(R.string.gh7));
                    TuxTextView L2 = L();
                    Integer valueOf2 = Integer.valueOf(item.LJLJI);
                    if (valueOf2.intValue() > 0 && (num = valueOf2.toString()) != null) {
                        str = num;
                    }
                    L2.setText(str);
                } else {
                    o.LJIJI("titleTextView");
                    throw null;
                }
            } else {
                o.LJIJI("iconView");
                throw null;
            }
        }
        SY4 sy4 = this.LJLJI;
        if (sy4 != null) {
            if (!item.LJLILLLLZI) {
                i = 0;
            } else {
                i = 8;
            }
            sy4.setVisibility(i);
            Object parent = L().getParent();
            if (!(parent instanceof View) || (view = (View) parent) == null) {
                return;
            }
            if (!item.LJLILLLLZI) {
                i3 = 8;
            }
            view.setVisibility(i3);
            return;
        }
        o.LJIJI("connectBtn");
        throw null;
    }

    public static void Q(EnumC58046MqI enumC58046MqI, Context context, P2J p2j) {
        int i = C63796P2a.LIZ[enumC58046MqI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//friends/facebook");
            buildRoute.withParam("enter_from", p2j.LJLJJI.LJLIL);
            buildRoute.open();
            return;
        }
        SmartRoute buildRoute2 = SmartRouter.buildRoute(context, "//friends/contact");
        buildRoute2.addFlags(536870912);
        buildRoute2.open();
    }
}
