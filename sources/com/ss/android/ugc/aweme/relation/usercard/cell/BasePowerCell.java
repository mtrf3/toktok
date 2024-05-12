package com.ss.android.ugc.aweme.relation.usercard.cell;

import X.AYY;
import X.ActivityC45651qj;
import X.C13930gf;
import X.C1DG;
import X.C2K0;
import X.C32151Nz;
import X.C55096Ljo;
import X.C55230Lly;
import X.C57839Mmx;
import X.C57859MnH;
import X.C65352Pkq;
import X.C79234V7u;
import X.C99W;
import X.InterfaceC57784Mm4;
import X.InterfaceC57932MoS;
import X.InterfaceC93923mO;
import X.X1D;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerStub;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class BasePowerCell<ITEM extends InterfaceC57784Mm4> extends PowerCell<ITEM> {
    public void P(int i, ITEM item, boolean z) {
    }

    public static float N() {
        if (C99W.LIZ) {
            return C32151Nz.LJIIZILJ(5);
        }
        return C32151Nz.LJIIZILJ(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Mm4] */
    public final int M() {
        Fragment LJIIIZ;
        Lifecycle lifecycle;
        String str;
        C2K0 c2k0 = null;
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
                            C2K0 LIZ = C55096Ljo.LIZ(C55230Lly.LJ(itemView), IUserCardListAbility.class, str);
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
                            c2k0 = LIZ;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            AYY.LIZ.getClass();
            AYY.LIZ("Ability", "get ability error!", th);
        }
        IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) c2k0;
        if (iUserCardListAbility != 0) {
            ?? item = getItem();
            if (item != 0) {
                return iUserCardListAbility.GM(item);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        return -1;
    }

    public final Context Q() {
        Context context = this.itemView.getContext();
        if (context != null) {
            return context;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final InterfaceC57932MoS L() {
        InterfaceC93923mO interfaceC93923mO;
        InterfaceC57932MoS interfaceC57932MoS;
        PowerStub stub = getStub();
        if (stub != null) {
            interfaceC93923mO = stub.LJLILLLLZI;
        } else {
            interfaceC93923mO = null;
        }
        if (!(interfaceC93923mO instanceof InterfaceC57932MoS) || (interfaceC57932MoS = (InterfaceC57932MoS) interfaceC93923mO) == null) {
            Object bindingAdapter = getBindingAdapter();
            if (!(bindingAdapter instanceof InterfaceC57932MoS)) {
                return null;
            }
            return (InterfaceC57932MoS) bindingAdapter;
        }
        return interfaceC57932MoS;
    }

    public final LifecycleOwner getLifecycleOwner() {
        C57859MnH config;
        ActivityC45651qj hostActivity;
        C57859MnH config2;
        Fragment hostFragment;
        InterfaceC57932MoS L = L();
        if (L == null || (config2 = L.getConfig()) == null || (hostFragment = config2.getHostFragment()) == null) {
            InterfaceC57932MoS L2 = L();
            if (L2 == null || (config = L2.getConfig()) == null || (hostActivity = config.getHostActivity()) == null) {
                LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
                if (currentLifecycleOwner == null) {
                    Fragment LJIIIZ = C79234V7u.LJIIIZ(this.itemView);
                    if (LJIIIZ != null) {
                        return LJIIIZ;
                    }
                    return C1DG.LJ(this.itemView, "itemView.context");
                }
                return currentLifecycleOwner;
            }
            return hostActivity;
        }
        return hostFragment;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C13930gf.LIZ(itemView, new C57839Mmx(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        InterfaceC57784Mm4 item = getItem();
        if (item != null) {
            P(M(), item, false);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void unBind() {
        super.unBind();
        this.itemView.setTag(R.id.n1_, Boolean.TRUE);
    }

    public void T(ITEM item) {
        o.LJIIIZ(item, "item");
        this.itemView.setTag(R.id.n1_, Boolean.FALSE);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onBindItemView(ITEM t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        T(t);
        setItem(t);
    }
}
