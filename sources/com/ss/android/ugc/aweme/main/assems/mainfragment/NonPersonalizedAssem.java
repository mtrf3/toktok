package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.AbstractC48820JEa;
import X.C116694i1;
import X.C16880lQ;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C2NH;
import X.C54459LYx;
import X.C54461LYz;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BD;
import X.LST;
import X.TBV;
import Y.ACListenerS29S0100000_9;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS45S0100000_9;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tiktok.homepage.mainfragment.NonPersonalizedVM;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NonPersonalizedAssem extends UISlotAssem {
    public View LJLJLLL;
    public TuxTextView LJLL;
    public int LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C214298b3 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final ARunnableS45S0100000_9 LJLLLLLL;

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        ComplianceBusinessServiceImpl.LJJJJIZL().LJFF().observe(this, new AObserverS77S0100000_9(this, 22));
        C8YN.LJII(this, I3(), new TBV() { // from class: X.LYu
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((C35667DzD) obj).LJLIL;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((C35667DzD) obj).LJLIL = (Boolean) obj2;
            }
        }, C213688a4.LIZLLL(), new AqS191S0100000_9(this, 23), 4);
        C8YN.LJII(this, I3(), new TBV() { // from class: X.LYy
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C35667DzD) obj).LJLILLLLZI);
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((C35667DzD) obj).LJLILLLLZI = ((Number) obj2).intValue();
            }
        }, C213688a4.LIZLLL(), new AqS191S0100000_9(this, 24), 4);
        C116694i1.LIZ(C212428Vi.LIZ(this)).hv0(new C54459LYx(this));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.b05;
    }

    public NonPersonalizedAssem() {
        new LinkedHashMap();
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 317));
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 316));
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NonPersonalizedVM.class);
        this.LJLLL = C78926UyI.LJ(this, LIZ, c9bd, new AqS159S0100000_9(LIZ, 318), LST.INSTANCE, null);
        this.LJLLLL = C221108m2.LIZIZ(C54461LYz.LJLIL);
        this.LJLLLLLL = new ARunnableS45S0100000_9(this, 78);
    }

    public final AbstractC48820JEa H3() {
        return (AbstractC48820JEa) this.LJLLLL.getValue();
    }

    public final NonPersonalizedVM I3() {
        return (NonPersonalizedVM) this.LJLLL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        getContainerView().setVisibility(8);
        this.LJLJLLL = x3().findViewById(R.id.h8g);
        this.LJLL = (TuxTextView) x3().findViewById(R.id.h8h);
        View view2 = this.LJLJLLL;
        if (view2 != null) {
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 165), view2);
        }
        C2NH.LIZ.post(new ARunnableS45S0100000_9(this, 216));
    }
}
