package com.ss.android.ugc.aweme.roaming;

import X.C0A2;
import X.C16880lQ;
import X.C2K0;
import X.C47261Igj;
import X.C47704Ins;
import X.C54537Lan;
import X.C55096Ljo;
import X.C55749LuL;
import X.C81215Vu7;
import X.C86753ap;
import X.InterfaceC54639LcR;
import X.InterfaceC55102Lju;
import X.InterfaceC57784Mm4;
import X.SYL;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RegionAllListAssem extends UIContentAssem implements IRegionAllListAbility, InterfaceC54639LcR, InterfaceC55102Lju {
    public SYL LJLIL;
    public C81215Vu7 LJLILLLLZI;
    public final C55749LuL LJLJI;
    public final Map<String, Integer> LJLJJI;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -786191505) {
            return null;
        }
        return this;
    }

    public RegionAllListAssem() {
        new LinkedHashMap();
        this.LJLJI = new C55749LuL(C47704Ins.LIZJ(this, C54537Lan.class, "NearbyRegionHierarchyData"), checkSupervisorPrepared());
        this.LJLJJI = new LinkedHashMap();
    }

    public final C54537Lan x3() {
        return (C54537Lan) this.LJLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.roaming.IRegionAllListAbility
    public final void hide() {
        View containerView = getContainerView();
        o.LJII(containerView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) containerView;
        SYL syl = this.LJLIL;
        if (syl != null) {
            if (viewGroup.indexOfChild(syl) != -1) {
                View containerView2 = getContainerView();
                o.LJII(containerView2, "null cannot be cast to non-null type android.widget.FrameLayout");
                FrameLayout frameLayout = (FrameLayout) containerView2;
                SYL syl2 = this.LJLIL;
                if (syl2 != null) {
                    C16880lQ.LJLLLL(syl2, frameLayout);
                } else {
                    o.LJIJI("powerList");
                    throw null;
                }
            }
            C81215Vu7 c81215Vu7 = this.LJLILLLLZI;
            if (c81215Vu7 != null) {
                c81215Vu7.setVisibility(8);
                return;
            } else {
                o.LJIJI("quickIndexBar");
                throw null;
            }
        }
        o.LJIJI("powerList");
        throw null;
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.roaming.IRegionAllListAbility
    public final void show() {
        v3();
        C81215Vu7 c81215Vu7 = this.LJLILLLLZI;
        if (c81215Vu7 != null) {
            c81215Vu7.setVisibility(0);
        } else {
            o.LJIJI("quickIndexBar");
            throw null;
        }
    }

    public final void v3() {
        View containerView = getContainerView();
        o.LJII(containerView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) containerView;
        SYL syl = this.LJLIL;
        if (syl != null) {
            if (viewGroup.indexOfChild(syl) != -1) {
                return;
            }
            View containerView2 = getContainerView();
            o.LJII(containerView2, "null cannot be cast to non-null type android.widget.FrameLayout");
            ViewGroup viewGroup2 = (ViewGroup) containerView2;
            SYL syl2 = this.LJLIL;
            if (syl2 != null) {
                viewGroup2.addView(syl2, new ViewGroup.LayoutParams(-1, -1));
                return;
            } else {
                o.LJIJI("powerList");
                throw null;
            }
        }
        o.LJIJI("powerList");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x015a, code lost:
    
        if ((!r3.isEmpty()) == true) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c8 A[SYNTHETIC] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r33) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.roaming.RegionAllListAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC54639LcR
    public final void w(String letter) {
        LinearLayoutManager linearLayoutManager;
        int i;
        o.LJIIIZ(letter, "letter");
        SYL syl = this.LJLIL;
        if (syl != null) {
            C0A2 layoutManager = syl.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
                return;
            }
            Integer num = (Integer) ((LinkedHashMap) this.LJLJJI).get(letter);
            if (num != null && num.intValue() >= 0) {
                i = num.intValue();
                if (i < 0) {
                    return;
                }
            } else {
                SYL syl2 = this.LJLIL;
                if (syl2 != null) {
                    Iterator it = ((ArrayList) syl2.getState().LJII()).iterator();
                    i = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i >= 0) {
                            InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) next;
                            if ((interfaceC57784Mm4 instanceof C86753ap) && o.LJ(((C86753ap) interfaceC57784Mm4).LJLIL, letter)) {
                                this.LJLJJI.put(letter, Integer.valueOf(i));
                            } else {
                                i = i2;
                            }
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    return;
                }
                o.LJIJI("powerList");
                throw null;
            }
            linearLayoutManager.LJFF(i, 0);
            return;
        }
        o.LJIJI("powerList");
        throw null;
    }
}
