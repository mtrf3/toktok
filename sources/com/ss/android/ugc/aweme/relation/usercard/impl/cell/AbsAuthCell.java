package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.AYY;
import X.C110614Vt;
import X.C16880lQ;
import X.C27484AqW;
import X.C32151Nz;
import X.C55096Ljo;
import X.C55230Lly;
import X.C57834Mms;
import X.C57846Mn4;
import X.C57894Mnq;
import X.C57900Mnw;
import X.C57907Mo3;
import X.C65352Pkq;
import X.C79234V7u;
import X.C99W;
import X.C9AC;
import X.C9AE;
import X.EnumC57853MnB;
import X.InterfaceC57784Mm4;
import X.InterfaceC57932MoS;
import X.SY4;
import X.ViewOnLongClickListenerC57895Mnr;
import X.X1D;
import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardCellTrackAbility;
import com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS71S0201000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class AbsAuthCell<ITEM extends C57834Mms> extends BasePowerCell<ITEM> {
    public TuxIconView LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxTextView LJLJJI;
    public TuxIconView LJLJJL;
    public SY4 LJLJJLL;

    public abstract int Y();

    public abstract boolean a0();

    public final TuxIconView V() {
        TuxIconView tuxIconView = this.LJLIL;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        o.LJIJI("authIconView");
        throw null;
    }

    public final TuxTextView X() {
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("findTextView");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return Y();
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.hm0);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.permission_icon)");
        this.LJLIL = (TuxIconView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.hmd);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.permission_title_tv)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.hlx);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.permission_desc_tv)");
        this.LJLJI = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.d_q);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.find_text_view)");
        this.LJLJJI = (TuxTextView) findViewById4;
        float f = 0.0f;
        if (a0()) {
            SY4 sy4 = (SY4) this.itemView.findViewById(R.id.ivi);
            this.LJLJJLL = sy4;
            C9AE.LIZ(sy4, C9AC.ALPHA, 0.0f);
        } else {
            TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.hlw);
            this.LJLJJL = tuxIconView;
            C9AE.LIZ(tuxIconView, C9AC.ALPHA, 0.0f);
        }
        if (C99W.LIZ) {
            f = C32151Nz.LJIIZILJ(8);
        }
        C9AE.LIZ(X(), C9AC.LIGHT_MASK, f);
    }

    public void U(C57846Mn4 uiConfig) {
        int i;
        Integer num;
        int i2;
        Integer num2;
        boolean z;
        Integer num3;
        SY4 sy4;
        Integer num4;
        TuxIconView tuxIconView;
        o.LJIIIZ(uiConfig, "uiConfig");
        TuxIconView tuxIconView2 = this.LJLJJL;
        if (tuxIconView2 != null) {
            Integer num5 = uiConfig.LJIJJLI;
            if ((num5 == null || num5.intValue() != 203) && ((num = uiConfig.LJIJJLI) == null || num.intValue() != 200)) {
                i = 0;
            } else {
                i = 8;
            }
            tuxIconView2.setVisibility(i);
        }
        SY4 sy42 = this.LJLJJLL;
        if (sy42 != null) {
            Integer num6 = uiConfig.LJIJJLI;
            if ((num6 == null || num6.intValue() != 203) && ((num2 = uiConfig.LJIJJLI) == null || num2.intValue() != 200)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            sy42.setVisibility(i2);
        }
        TuxIconView tuxIconView3 = this.LJLJJL;
        if (tuxIconView3 != null && tuxIconView3.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (num4 = uiConfig.LJIJJLI) != null && num4.intValue() == 202 && (tuxIconView = this.LJLJJL) != null) {
            tuxIconView.setTuxIcon(null);
        }
        SY4 sy43 = this.LJLJJLL;
        if (sy43 != null && sy43.getVisibility() == 0 && (num3 = uiConfig.LJIJJLI) != null && num3.intValue() == 202 && (sy4 = this.LJLJJLL) != null) {
            sy4.setVisibility(8);
        }
        if (uiConfig.LIZJ) {
            TuxTextView tuxTextView = this.LJLJI;
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.dm);
                TuxTextView tuxTextView2 = this.LJLILLLLZI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTextColorRes(R.attr.dj);
                    TuxIconView tuxIconView4 = this.LJLJJL;
                    if (tuxIconView4 != null) {
                        tuxIconView4.setTintColorRes(R.attr.da);
                    }
                } else {
                    o.LJIJI("titleTextView");
                    throw null;
                }
            } else {
                o.LJIJI("contentTextView");
                throw null;
            }
        } else {
            TuxTextView tuxTextView3 = this.LJLJI;
            if (tuxTextView3 != null) {
                tuxTextView3.setTextColorRes(R.attr.gx);
                TuxTextView tuxTextView4 = this.LJLILLLLZI;
                if (tuxTextView4 != null) {
                    tuxTextView4.setTextColorRes(R.attr.go);
                    TuxIconView tuxIconView5 = this.LJLJJL;
                    if (tuxIconView5 != null) {
                        tuxIconView5.setTintColorRes(R.attr.gp);
                    }
                } else {
                    o.LJIJI("titleTextView");
                    throw null;
                }
            } else {
                o.LJIJI("contentTextView");
                throw null;
            }
        }
        Context ctx = X().getContext();
        if (uiConfig.LJFF == EnumC57853MnB.CUSTOM_TT_NOW_NORMAL) {
            X().setBackground(ctx.getDrawable(R.drawable.aup));
            return;
        }
        TuxTextView X2 = X();
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(BasePowerCell.N());
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
        o.LJIIIIZZ(ctx, "ctx");
        X2.setBackground(c110614Vt.LIZ(ctx));
    }

    public void c0(ITEM item) {
        SY4 sy4;
        o.LJIIIZ(item, "item");
        C57846Mn4 c57846Mn4 = item.LJLILLLLZI;
        C57900Mnw c57900Mnw = item.LJLJI;
        if (!c57846Mn4.LJIJI) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C16880lQ.LJIIJ(new C57894Mnq(this, item, c57900Mnw), itemView);
        }
        AqS156S0200000_9 aqS156S0200000_9 = new AqS156S0200000_9(this, (AbsAuthCell<int>) item, 40);
        Integer num = c57846Mn4.LJIJJLI;
        if (num != null && num.intValue() == 201) {
            TuxIconView tuxIconView = this.LJLJJL;
            if (tuxIconView != null && tuxIconView.getVisibility() == 0) {
                TuxIconView tuxIconView2 = this.LJLJJL;
                if (tuxIconView2 != null) {
                    C16880lQ.LJJJ(tuxIconView2, new ACListenerS29S0100000_9(aqS156S0200000_9, 61));
                }
            } else {
                SY4 sy42 = this.LJLJJLL;
                if (sy42 != null && sy42.getVisibility() == 0 && (sy4 = this.LJLJJLL) != null) {
                    C16880lQ.LJJIZ(sy4, new ACListenerS29S0100000_9(aqS156S0200000_9, 62));
                }
            }
        }
        Integer num2 = c57846Mn4.LJIJJLI;
        if (num2 == null || num2.intValue() != 200) {
            return;
        }
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC57895Mnr(this, c57900Mnw, aqS156S0200000_9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C57834Mms t = (C57834Mms) interfaceC57784Mm4;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        int i = C57907Mo3.LIZ[t.LJLJI.LJLIL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                V().setIconRes(R.raw.icon_color_contact_circle);
                TuxTextView tuxTextView = this.LJLILLLLZI;
                if (tuxTextView != null) {
                    tuxTextView.setText(R.string.dva);
                    TuxTextView tuxTextView2 = this.LJLJI;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(R.string.dv_);
                    } else {
                        o.LJIJI("contentTextView");
                        throw null;
                    }
                } else {
                    o.LJIJI("titleTextView");
                    throw null;
                }
            }
        } else {
            V().setIconRes(R.raw.icon_color_facebook_circle);
            TuxTextView tuxTextView3 = this.LJLILLLLZI;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(R.string.gau);
                TuxTextView tuxTextView4 = this.LJLJI;
                if (tuxTextView4 != null) {
                    tuxTextView4.setText(R.string.pfh);
                } else {
                    o.LJIJI("contentTextView");
                    throw null;
                }
            } else {
                o.LJIJI("titleTextView");
                throw null;
            }
        }
        U(t.LJLILLLLZI);
        c0(t);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell
    public final void P(int i, InterfaceC57784Mm4 interfaceC57784Mm4, boolean z) {
        Fragment LJIIIZ;
        Lifecycle lifecycle;
        String str;
        C57834Mms c57834Mms = (C57834Mms) interfaceC57784Mm4;
        Object obj = null;
        try {
            if (!o.LJ(this.itemView.getTag(R.id.n1_), Boolean.TRUE)) {
                LifecycleOwner lifecycleOwner = getLifecycleOwner();
                if ((((lifecycleOwner instanceof Fragment) && (LJIIIZ = (Fragment) lifecycleOwner) != null) || (LJIIIZ = C79234V7u.LJIIIZ(this.itemView)) != null) && (LJIIIZ.isDetached() || !LJIIIZ.isAdded())) {
                    AYY.LIZ.getClass();
                    AYY.LIZ("Ability", "attach fragment illegal!", null);
                } else {
                    LifecycleOwner lifecycleOwner2 = getLifecycleOwner();
                    if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                            AYY.LIZ.getClass();
                            AYY.LIZ("Ability", "get ability illegal!", null);
                        } else {
                            InterfaceC57932MoS L = L();
                            if (L != null) {
                                str = L.LJJIFFI();
                            } else {
                                str = null;
                            }
                            View itemView = this.itemView;
                            o.LJIIIIZZ(itemView, "itemView");
                            Object LIZ = C55096Ljo.LIZ(C55230Lly.LJ(itemView), AuthCardCellTrackAbility.class, str);
                            if (LIZ == null) {
                                AYY ayy = AYY.LIZ;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(str);
                                LIZ2.append("'s ");
                                LIZ2.append(C65352Pkq.LIZ(AuthCardCellTrackAbility.class).LJFF());
                                LIZ2.append(" not found, parent: ");
                                LIZ2.append(this.itemView.getParent());
                                String LIZIZ = X1D.LIZIZ(LIZ2);
                                ayy.getClass();
                                AYY.LIZ("Ability", LIZIZ, null);
                            }
                            obj = LIZ;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            AYY.LIZ.getClass();
            AYY.LIZ("Ability", "get ability error!", th);
        }
        AuthCardCellTrackAbility authCardCellTrackAbility = (AuthCardCellTrackAbility) obj;
        if (authCardCellTrackAbility != null) {
            boolean z2 = authCardCellTrackAbility.LJLIL.invoke().LJI;
            if (z) {
                if (z2) {
                    C27484AqW.LIZJ(new AqS71S0201000_9(authCardCellTrackAbility, i, c57834Mms, 1));
                }
            } else {
                if (z2) {
                    return;
                }
                C27484AqW.LIZJ(new AqS71S0201000_9(authCardCellTrackAbility, i, c57834Mms, 2));
            }
        }
    }
}
