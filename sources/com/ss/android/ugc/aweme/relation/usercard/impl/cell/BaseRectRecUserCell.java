package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.AYY;
import X.C16880lQ;
import X.C221108m2;
import X.C26338AVi;
import X.C32151Nz;
import X.C46104I7o;
import X.C53341Kwb;
import X.C53691L5j;
import X.C55096Ljo;
import X.C55230Lly;
import X.C57820Mme;
import X.C57826Mmk;
import X.C57846Mn4;
import X.C58036Mq8;
import X.C58049MqL;
import X.C58050MqM;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C78897Uxp;
import X.C79045V0n;
import X.C79234V7u;
import X.C9AC;
import X.C9AE;
import X.EnumC53695L5n;
import X.EnumC57435MgR;
import X.InterfaceC100393wp;
import X.InterfaceC57784Mm4;
import X.InterfaceC57932MoS;
import X.SJO;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS44S0200000_9;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import q03.IDaS487S0100000_9;

/* loaded from: classes10.dex */
public abstract class BaseRectRecUserCell<ITEM extends C57826Mmk> extends AbsRecUserCell<C57826Mmk> {
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9((BaseRectRecUserCell) this, 573));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9((BaseRectRecUserCell) this, 575));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9((BaseRectRecUserCell) this, 574));
    public final int LJLJJL = R.layout.cai;

    public final C53691L5j getSocPubAvatarFrameLayout() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-socPubAvatarFrameLayout>(...)");
        return (C53691L5j) value;
    }

    public final SJO s0() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-avatarView>(...)");
        return (SJO) value;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public int V() {
        return this.LJLJJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void a0(EnumC57435MgR followStatus) {
        int i;
        o.LJIIIZ(followStatus, "followStatus");
        super.a0(followStatus);
        C57826Mmk c57826Mmk = (C57826Mmk) getItem();
        if (c57826Mmk == null) {
            return;
        }
        RecUser recUser = c57826Mmk.LJLJI;
        C57846Mn4 c57846Mn4 = c57826Mmk.LJLILLLLZI;
        boolean t0 = t0(recUser, c57846Mn4);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.c66);
        o.LJIIIIZZ(imageView, "itemView.deleteIconView");
        if (t0) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        o0(recUser, c57846Mn4);
        n0(recUser, c57846Mn4);
        i0(c57846Mn4, c57826Mmk);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void c0(C57826Mmk item) {
        Set<String> Sb0;
        Fragment LJIIIZ;
        Lifecycle lifecycle;
        String str;
        o.LJIIIZ(item, "item");
        super.c0(item);
        if (item.LJLILLLLZI.LJJ) {
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
                                Object LIZ = C55096Ljo.LIZ(C55230Lly.LJ(itemView), IUserCardListAbility.class, str);
                                if (LIZ == null) {
                                    AYY ayy = AYY.LIZ;
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(str);
                                    LIZ2.append("'s ");
                                    LIZ2.append(C65352Pkq.LIZ(IUserCardListAbility.class).LJFF());
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
            IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) obj;
            if (iUserCardListAbility != null && (Sb0 = iUserCardListAbility.Sb0()) != null) {
                Sb0.add(item.LJLIL.getElementId());
            }
            Integer LJI = C79045V0n.LJI(R.attr.cl, Q());
            if (LJI != null) {
                this.itemView.setBackgroundColor(LJI.intValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell, com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    public /* bridge */ /* synthetic */ void onBindItemView(InterfaceC57784Mm4 interfaceC57784Mm4) {
        onBindItemView((C57826Mmk) interfaceC57784Mm4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void g0(RecUser user, C57846Mn4 uiConfig) {
        C57826Mmk c57826Mmk;
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        U(s0(), new AqS156S0200000_9(user, uiConfig, 95));
        if (uiConfig.LJIL) {
            getSocPubAvatarFrameLayout().setMode(EnumC53695L5n.NONE);
            InterfaceC100393wp interfaceC100393wp = (InterfaceC100393wp) this.LJLJJI.getValue();
            if (interfaceC100393wp == null || !interfaceC100393wp.LJI(user)) {
                C58036Mq8.LIZIZ(s0(), user, uiConfig);
            }
        } else {
            C58036Mq8.LIZIZ(s0(), user, uiConfig);
        }
        if (C53341Kwb.LIZ() && !uiConfig.LJIJI && (c57826Mmk = (C57826Mmk) getItem()) != null) {
            s0().setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS44S0200000_9(c57826Mmk, this, 34)));
            C78897Uxp.LJJJJL(s0(), C32151Nz.LJIIZILJ(28));
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void h0(RecUser user, C57846Mn4 uiConfig) {
        int i;
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        RelationButton relationButton = (RelationButton) this.itemView.findViewById(R.id.iu_);
        o.LJIIIIZZ(relationButton, "itemView.relationBtn");
        m0(relationButton, user, uiConfig, true);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.c66);
        o.LJIIIIZZ(imageView, "itemView.deleteIconView");
        if (t0(user, uiConfig)) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        if (imageView.getVisibility() == 0) {
            C16880lQ.LJIIJ(new IDaS487S0100000_9(this, 3), imageView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public void l0(RecUser user, C57846Mn4 uiConfig) {
        C57826Mmk c57826Mmk;
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.h19);
        o.LJIIIIZZ(tuxTextView, "itemView.nickNameView");
        C57820Mme.LIZIZ(user, tuxTextView);
        if (C53341Kwb.LIZ() && !uiConfig.LJIJI && (c57826Mmk = (C57826Mmk) getItem()) != null) {
            C16880lQ.LJJJJI((TuxTextView) this.itemView.findViewById(R.id.h19), new ACListenerS44S0200000_9(c57826Mmk, this, 35));
            View findViewById = this.itemView.findViewById(R.id.h19);
            o.LJIIIIZZ(findViewById, "itemView.nickNameView");
            C78897Uxp.LJJJJLI(findViewById, null);
        }
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct != null) {
            this.itemView.findViewById(R.id.iuj).setVisibility(0);
            if (uiConfig.LIZJ) {
                ((C58049MqL) this.itemView.findViewById(R.id.iuj)).LJJJJ(matchedFriendStruct, C58050MqM.LIZJ);
            } else {
                ((C58049MqL) this.itemView.findViewById(R.id.iuj)).LJJJJ(matchedFriendStruct, C58050MqM.LIZIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public void o0(RecUser user, C57846Mn4 uiConfig) {
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26338AVi.LJIIIZ(itemView, null, Integer.valueOf(uiConfig.LJIIJJI), null, Integer.valueOf(uiConfig.LJIIJJI), 21);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void p0(RecUser user, C57846Mn4 uiConfig) {
        boolean z;
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        if (uiConfig.LIZJ) {
            ((TuxTextView) this.itemView.findViewById(R.id.h19)).setTextColorRes(R.attr.dj);
            ((TuxTextView) this.itemView.findViewById(R.id.iuj)).setTextColorRes(R.attr.dm);
            ((TuxIconView) this.itemView.findViewById(R.id.c66)).setTintColorRes(R.attr.da);
        } else {
            ((TuxTextView) this.itemView.findViewById(R.id.h19)).setTextColorRes(R.attr.go);
            ((TuxTextView) this.itemView.findViewById(R.id.iuj)).setTextColorRes(R.attr.gx);
            ((TuxIconView) this.itemView.findViewById(R.id.c66)).setTintColorRes(R.attr.gp);
            C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS156S0200000_9((BaseRectRecUserCell) this, (BaseRectRecUserCell<C57826Mmk>) user, (RecUser) 96));
            if (uiConfig.LJJ && C46104I7o.LJJIJIL(user) && !((Boolean) LIZIZ.getValue()).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Integer LJI = C79045V0n.LJI(R.attr.dd, Q());
                if (LJI != null) {
                    int intValue = LJI.intValue();
                    this.itemView.setBackgroundColor(intValue);
                    if (C53341Kwb.LIZ()) {
                        View itemView = this.itemView;
                        o.LJIIIIZZ(itemView, "itemView");
                        C78897Uxp.LJJJJJ(itemView, intValue);
                    }
                }
            } else {
                Integer LJI2 = C79045V0n.LJI(R.attr.cl, Q());
                if (LJI2 != null) {
                    int intValue2 = LJI2.intValue();
                    this.itemView.setBackgroundColor(intValue2);
                    if (C53341Kwb.LIZ()) {
                        View itemView2 = this.itemView;
                        o.LJIIIIZZ(itemView2, "itemView");
                        C78897Uxp.LJJJJJ(itemView2, intValue2);
                    }
                }
            }
        }
        C9AE.LIZ(this.itemView.findViewById(R.id.c66), C9AC.ALPHA, 0.0f);
    }

    public final boolean t0(RecUser user, C57846Mn4 uiConfig) {
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        int i = uiConfig.LIZLLL;
        if (i != 203 && i != 200 && user.getFollowStatus() == 0) {
            return true;
        }
        return false;
    }
}
