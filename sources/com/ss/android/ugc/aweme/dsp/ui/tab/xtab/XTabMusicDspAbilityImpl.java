package com.ss.android.ugc.aweme.dsp.ui.tab.xtab;

import X.C32I;
import X.C46420IJs;
import X.C76800UCe;
import X.C78983UzD;
import X.C91198Zqk;
import X.C91199Zql;
import X.C91200Zqm;
import X.C91203Zqp;
import X.C91211Zqx;
import X.C91215Zr1;
import X.C91249ZrZ;
import X.InterfaceC65784Pro;
import X.X1D;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.XTabAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class XTabMusicDspAbilityImpl implements XTabAbility {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final InterfaceC65784Pro<List<C46420IJs>> LJLJJL;
    public final InterfaceC65784Pro<IXTabPanelAbility> LJLJJLL;

    @Override // com.bytedance.tiktok.homepage.mainfragment.XTabAbility
    public final int F7() {
        return -1;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.XTabAbility
    public final void getPanel() {
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.XTabAbility
    public final void Ct0() {
        if (this.LJLJJLL.invoke() != null && (!r0.nf()) && C91198Zqk.LIZLLL > 0) {
            C91215Zr1.LIZ(true);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.XTabAbility
    public final void EI() {
        if (C91198Zqk.LIZLLL > 0) {
            C91215Zr1.LIZ(true);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.XTabAbility
    public final AnimatorSet Wq() {
        Collection<Animator> emptySet;
        HashMap<View, Animator> hashMap;
        AnimatorSet animatorSet = new AnimatorSet();
        Set<Fragment> keySet = C91200Zqm.LIZ.keySet();
        o.LJIIIIZZ(keySet, "map.keys");
        ArrayList arrayList = new ArrayList(C32I.LJJL(keySet, 10));
        Iterator<Fragment> it = keySet.iterator();
        while (it.hasNext()) {
            C91199Zql c91199Zql = C91200Zqm.LIZ.get(it.next());
            if (c91199Zql == null || (hashMap = c91199Zql.LIZ) == null || (emptySet = hashMap.values()) == null) {
                emptySet = Collections.emptySet();
                o.LJIIIIZZ(emptySet, "emptySet()");
            }
            arrayList.add(emptySet);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.addAll((Collection) it2.next());
        }
        boolean z = !arrayList2.isEmpty();
        animatorSet.playTogether(arrayList2);
        return animatorSet;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.XTabAbility
    public final AnimatorSet je() {
        Collection<Animator> emptySet;
        HashMap<View, Animator> hashMap;
        AnimatorSet animatorSet = new AnimatorSet();
        Set<Fragment> keySet = C91200Zqm.LIZ.keySet();
        o.LJIIIIZZ(keySet, "map.keys");
        ArrayList arrayList = new ArrayList(C32I.LJJL(keySet, 10));
        Iterator<Fragment> it = keySet.iterator();
        while (it.hasNext()) {
            C91199Zql c91199Zql = C91200Zqm.LIZ.get(it.next());
            if (c91199Zql == null || (hashMap = c91199Zql.LIZIZ) == null || (emptySet = hashMap.values()) == null) {
                emptySet = Collections.emptySet();
                o.LJIIIIZZ(emptySet, "emptySet()");
            }
            arrayList.add(emptySet);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.addAll((Collection) it2.next());
        }
        boolean z = !arrayList2.isEmpty();
        animatorSet.playTogether(arrayList2);
        return animatorSet;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.XTabAbility
    public final List<C46420IJs> st() {
        return this.LJLJJL.invoke();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.XTabAbility
    public final boolean l20() {
        if (C91211Zqx.LIZ() == 0) {
            return false;
        }
        C91215Zr1.LIZ(false);
        return true;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.XTabAbility
    public final C46420IJs rL() {
        return C91203Zqp.LIZIZ();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.XTabAbility
    public final void Al0(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onShowPanelSuccess,show reason:");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        String str = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        int i2 = 2;
        if (i != 2) {
            if (i != 1001) {
                if (i != 1002) {
                    C78983UzD.LJIILL("xtab reason is wrong");
                }
                i2 = 0;
            } else {
                i2 = 1;
            }
        }
        C91249ZrZ.LJII(i2, str, str2);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.XTabAbility
    public final void Yo(C46420IJs tabModel, View target) {
        o.LJIIIZ(tabModel, "tabModel");
        o.LJIIIZ(target, "target");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSubTabClick was called. tabModel: ");
        LIZ.append(tabModel);
        X1D.LIZIZ(LIZ);
        if (o.LJ(tabModel, C91203Zqp.LIZIZ())) {
            this.LJLJJI.invoke();
            C91249ZrZ.LJI(1, this.LJLIL, this.LJLILLLLZI);
        } else {
            if (!o.LJ(tabModel, C91203Zqp.LIZ())) {
                return;
            }
            this.LJLJI.invoke();
            C91249ZrZ.LJI(0, this.LJLIL, this.LJLILLLLZI);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.XTabAbility
    public final void b60(C46420IJs tabModel, View target) {
        o.LJIIIZ(tabModel, "tabModel");
        o.LJIIIZ(target, "target");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReClickSubTab was called ,tabModel:");
        LIZ.append(tabModel.LJLIL);
        X1D.LIZIZ(LIZ);
        if (o.LJ(tabModel, C91203Zqp.LIZIZ())) {
            this.LJLJJI.invoke();
        } else {
            if (!o.LJ(tabModel, C91203Zqp.LIZ())) {
                return;
            }
            this.LJLJI.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public XTabMusicDspAbilityImpl(String str, String str2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC65784Pro<? extends List<C46420IJs>> xTabModels, InterfaceC65784Pro<? extends IXTabPanelAbility> interfaceC65784Pro3) {
        o.LJIIIZ(xTabModels, "xTabModels");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = interfaceC65784Pro2;
        this.LJLJJL = xTabModels;
        this.LJLJJLL = interfaceC65784Pro3;
    }
}
