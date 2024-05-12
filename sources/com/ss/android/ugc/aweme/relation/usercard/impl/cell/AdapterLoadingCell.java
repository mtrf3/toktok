package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.AYY;
import X.AbstractC72932td;
import X.C223208pQ;
import X.C223338pd;
import X.C27484AqW;
import X.C32151Nz;
import X.C35583Dxr;
import X.C55096Ljo;
import X.C55230Lly;
import X.C57778Mly;
import X.C57822Mmg;
import X.C65352Pkq;
import X.C72912tb;
import X.C79234V7u;
import X.InterfaceC57784Mm4;
import X.InterfaceC57932MoS;
import X.O6R;
import X.X1D;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AdapterLoadingCell extends BasePowerCell<C35583Dxr> {
    public final C57822Mmg LJLIL = new C57822Mmg(this);
    public C223338pd LJLILLLLZI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.caq;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        Fragment LJIIIZ;
        Lifecycle lifecycle;
        String str;
        super.unBind();
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
        if (iUserCardListAbility != null) {
            iUserCardListAbility.K8(this.LJLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.chz);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.dual_ball_loading_view)");
        this.LJLILLLLZI = (C223338pd) findViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U(C57778Mly c57778Mly) {
        boolean z;
        AbstractC72932td<C223208pQ> abstractC72932td = c57778Mly.LIZIZ;
        if ((abstractC72932td instanceof C72912tb) && !((C223208pQ) ((C72912tb) abstractC72932td).LIZ).LJLILLLLZI) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            itemView.setVisibility(0);
            View itemView2 = this.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            C27484AqW.LJII(itemView2, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(52))), 1);
            C223338pd c223338pd = this.LJLILLLLZI;
            if (c223338pd != null) {
                c223338pd.LIZIZ();
                return;
            } else {
                o.LJIJI("loadingView");
                throw null;
            }
        }
        View itemView3 = this.itemView;
        o.LJIIIIZZ(itemView3, "itemView");
        itemView3.setVisibility(8);
        View itemView4 = this.itemView;
        o.LJIIIIZZ(itemView4, "itemView");
        C27484AqW.LJII(itemView4, null, 0, 1);
        C223338pd c223338pd2 = this.LJLILLLLZI;
        if (c223338pd2 != null) {
            c223338pd2.LIZJ();
        } else {
            o.LJIJI("loadingView");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC57784Mm4 t) {
        Fragment LJIIIZ;
        Lifecycle lifecycle;
        String str;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
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
        if (iUserCardListAbility != null) {
            U(iUserCardListAbility.getState());
            iUserCardListAbility.W7(this.LJLIL);
        }
    }
}
