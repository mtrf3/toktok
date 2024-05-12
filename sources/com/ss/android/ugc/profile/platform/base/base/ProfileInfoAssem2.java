package com.ss.android.ugc.profile.platform.base.base;

import X.C186557Tv;
import X.C26362AWg;
import X.C80896Voy;
import X.C8BJ;
import X.C9IJ;
import X.C9IL;
import X.EnumC235129Kq;
import X.InterfaceC235069Kk;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class ProfileInfoAssem2 extends UIContentAssem implements InterfaceC235069Kk {
    public C80896Voy LJLIL;
    public boolean LJLILLLLZI;
    public Map<Integer, View> LJLJI = new LinkedHashMap();

    public void A3() {
    }

    public void C3() {
    }

    public void _$_clearFindViewByIdCache() {
        this.LJLJI.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJI;
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

    public abstract String getEnterFrom();

    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public void v3(int i, EnumC235129Kq action, String methodFrom) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(methodFrom, "methodFrom");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0081, code lost:
    
        r0 = (X.InterfaceC238569Xw) X.C8VC.LJII(r4, X.C65352Pkq.LIZ(X.InterfaceC238569Xw.class));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008d, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008f, code lost:
    
        r0.Qb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0092, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
    
        r0 = X.C212428Vi.LIZLLL(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r0 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        r0 = X.C212428Vi.LIZIZ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r0 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r0 = r0.LJLLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        if (r0 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        if (r3.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        r1 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        if ((r1 instanceof com.ss.android.ugc.profile.platform.base.assemble.ProfileRootComponent) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        r0 = X.C212428Vi.LIZJ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (r0 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        r0 = r0.LJLLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        if (r0 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        r2 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005a, code lost:
    
        if (r2.hasNext() == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        r1 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0064, code lost:
    
        if ((r1 instanceof com.ss.android.ugc.profile.platform.business.tabs.container.MineAwemePagerAssemV2) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0068, code lost:
    
        if ((r1 instanceof com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006a, code lost:
    
        r0 = (X.InterfaceC238569Xw) X.C8VC.LJII(r1, X.C65352Pkq.LIZ(X.InterfaceC238569Xw.class));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0076, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0078, code lost:
    
        r0.Qb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r0.L7() == true) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x007c, code lost:
    
        if (r1 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r1 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (X.C235099Kn.LIZ() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Qb() {
        /*
            r4 = this;
            X.Lm3 r2 = X.C55096Ljo.LJIIZILJ(r4)
            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility> r1 = com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility.class
            r0 = 0
            X.2K0 r0 = X.C55096Ljo.LIZ(r2, r1, r0)
            com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility r0 = (com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility) r0
            if (r0 == 0) goto L7f
            boolean r0 = r0.L7()
            r1 = 1
            if (r0 != r1) goto L7f
        L16:
            boolean r0 = X.AXO.LIZ()
            if (r0 == 0) goto L7c
            if (r1 != 0) goto L24
        L1e:
            boolean r0 = X.C235099Kn.LIZ()
            if (r0 == 0) goto L81
        L24:
            androidx.fragment.app.Fragment r0 = X.C212428Vi.LIZLLL(r4)
            if (r0 == 0) goto L92
            com.bytedance.assem.arch.core.AssemSupervisor r0 = X.C212428Vi.LIZIZ(r0)
            if (r0 == 0) goto L92
            java.util.concurrent.CopyOnWriteArrayList<X.8W0> r0 = r0.LJLLI
            if (r0 == 0) goto L92
            java.util.Iterator r3 = r0.iterator()
        L38:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r1 = r3.next()
            X.8W0 r1 = (X.C8W0) r1
            boolean r0 = r1 instanceof com.ss.android.ugc.profile.platform.base.assemble.ProfileRootComponent
            if (r0 == 0) goto L38
            com.bytedance.assem.arch.core.AssemSupervisor r0 = X.C212428Vi.LIZJ(r1)
            if (r0 == 0) goto L38
            java.util.concurrent.CopyOnWriteArrayList<X.8W0> r0 = r0.LJLLI
            if (r0 == 0) goto L38
            java.util.Iterator r2 = r0.iterator()
        L56:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r1 = r2.next()
            X.8W0 r1 = (X.C8W0) r1
            boolean r0 = r1 instanceof com.ss.android.ugc.profile.platform.business.tabs.container.MineAwemePagerAssemV2
            if (r0 != 0) goto L6a
            boolean r0 = r1 instanceof com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2
            if (r0 == 0) goto L56
        L6a:
            java.lang.Class<X.9Xw> r0 = X.InterfaceC238569Xw.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            X.8V9 r0 = X.C8VC.LJII(r1, r0)
            X.9Xw r0 = (X.InterfaceC238569Xw) r0
            if (r0 == 0) goto L56
            r0.Qb()
            goto L56
        L7c:
            if (r1 != 0) goto L81
            goto L1e
        L7f:
            r1 = 0
            goto L16
        L81:
            java.lang.Class<X.9Xw> r0 = X.InterfaceC238569Xw.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            X.8V9 r0 = X.C8VC.LJII(r4, r0)
            X.9Xw r0 = (X.InterfaceC238569Xw) r0
            if (r0 == 0) goto L92
            r0.Qb()
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem2.Qb():void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LJLIL = (C80896Voy) view.findViewById(R.id.itq);
        if (C186557Tv.LIZ()) {
            C80896Voy c80896Voy = this.LJLIL;
            if (c80896Voy != null) {
                c80896Voy.setOnRefreshListener(new AqS154S0100000_4(this, 924));
            }
        } else {
            C80896Voy c80896Voy2 = this.LJLIL;
            if (c80896Voy2 != null) {
                c80896Voy2.setNestedHeader(null);
            }
            C80896Voy c80896Voy3 = this.LJLIL;
            if (c80896Voy3 != null) {
                c80896Voy3.setScrollMode(C8BJ.NONE);
            }
        }
        C80896Voy c80896Voy4 = this.LJLIL;
        if (c80896Voy4 == null) {
            return;
        }
        c80896Voy4.setOverScrollMode(C26362AWg.LIZ());
    }

    @Override // X.InterfaceC235069Kk
    public void y6(boolean z, C9IL contentType, String infoCollectValue, boolean z2) {
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(infoCollectValue, "infoCollectValue");
        C9IJ.LIZJ(z, contentType, infoCollectValue, z2);
    }

    public static /* synthetic */ void x3(ProfileInfoAssem2 profileInfoAssem2, int i, EnumC235129Kq enumC235129Kq, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                enumC235129Kq = EnumC235129Kq.NORMAL;
            }
            if ((i2 & 4) != 0) {
                str = "";
            }
            profileInfoAssem2.v3(i, enumC235129Kq, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchProfilePlatformInfo");
    }
}
