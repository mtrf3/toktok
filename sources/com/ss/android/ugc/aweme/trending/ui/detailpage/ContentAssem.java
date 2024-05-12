package com.ss.android.ugc.aweme.trending.ui.detailpage;

import X.ActivityC45651qj;
import X.C184077Kh;
import X.C1FJ;
import X.C212428Vi;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C26045AKb;
import X.C38333F2r;
import X.C47704Ins;
import X.C55749LuL;
import X.C56393MBh;
import X.C56394MBi;
import X.C56425MCn;
import X.C57191McV;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C80796VnM;
import X.C8W0;
import X.C8YN;
import X.InterfaceC65784Pro;
import X.M8U;
import X.MBK;
import X.SY4;
import X.TBT;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailOperatorWrapper;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.AqS97S0101000_9;
import kotlin.jvm.internal.IDqS454S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ContentAssem extends UIContentAssem {
    public final C214378bB LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public C57191McV LJLJI;
    public C56425MCn LJLJJI;
    public final C55749LuL LJLJJL;
    public boolean LJLJJLL;

    public ContentAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(this, 668);
        C65776Prg LIZ = C65352Pkq.LIZ(TrendingDetailOperatorWrapper.class);
        M8U m8u = M8U.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS159S0100000_9((C8W0) this, 669);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLIL = new C214378bB(LIZ, aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, m8u, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 670));
        this.LJLJJL = new C55749LuL(C47704Ins.LIZJ(this, MBK.class, null), checkSupervisorPrepared());
        this.LJLJJLL = true;
    }

    public final TrendingDetailOperatorWrapper v3() {
        return (TrendingDetailOperatorWrapper) this.LJLIL.getValue();
    }

    public final void A3() {
        Context context = getContext();
        if (context != null) {
            SY4 sy4 = new SY4(context, null, 6, 0);
            sy4.setButtonSize(3);
            sy4.setButtonVariant(0);
        }
        withState(v3(), new AqS175S0100000_9(this, 326));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.lkz);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.lku);
        View findViewById = view.findViewById(R.id.lkn);
        C80796VnM viewPager = (C80796VnM) view.findViewById(R.id.ncx);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C63081OpJ.LJJJJLI(context);
        this.LJLJI = (C57191McV) view.findViewById(R.id.lko);
        o.LJIIIIZZ(viewPager, "viewPager");
        C57191McV c57191McV = this.LJLJI;
        getContext();
        o.LJ(((MBK) this.LJLJJL.getValue()).LJLILLLLZI, "homepage_hot_trending_bar");
        C56425MCn c56425MCn = new C56425MCn(viewPager, tuxTextView, tuxTextView2, c57191McV, findViewById);
        this.LJLJJI = c56425MCn;
        viewPager.LJJJJ(false, c56425MCn);
        viewPager.LJI(new C56393MBh(this));
        C8YN.LJIIJJI(this, v3(), new TBT() { // from class: X.MBc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C56386MBa) obj).LJLJLLL);
            }
        }, new TBT() { // from class: X.MBl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C56386MBa) obj).LJLJLJ);
            }
        }, new TBT() { // from class: X.MBg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C56386MBa) obj).LJLILLLLZI;
            }
        }, null, new IDqS454S0100000_9(this, 1), 24);
        viewPager.setDisableScroll(true);
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.MBj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C56386MBa c56386MBa = (C56386MBa) obj;
                c56386MBa.getClass();
                return C208708Ha.LIZLLL(c56386MBa);
            }
        }, null, new AqS140S0200000_9(viewPager, this, 32), null, new AqS140S0200000_9(viewPager, this, 33), 10, null);
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.MBk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C56386MBa c56386MBa = (C56386MBa) obj;
                c56386MBa.getClass();
                return C208708Ha.LIZJ(c56386MBa);
            }
        }, null, new AqS175S0100000_9(this, 324), null, new AqS175S0100000_9(this, 325), 10, null);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.MBd
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C56386MBa) obj).LJLJJI;
            }
        }, null, new AqS191S0100000_9(this, 55), 6);
        C8YN.LJIIJ(this, v3(), new TBT() { // from class: X.MBf
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C56386MBa) obj).LJLILLLLZI;
            }
        }, new TBT() { // from class: X.MBX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C56386MBa) obj).LJLJL);
            }
        }, null, new C56394MBi(findViewById, this, tuxTextView2, tuxTextView), 12);
    }

    public final void x3(int i, Throwable th) {
        if (th instanceof C38333F2r) {
            C38333F2r c38333F2r = (C38333F2r) th;
            if (c38333F2r.getErrorCode() != 1 && c38333F2r.getErrorCode() != 2) {
                ActivityC45651qj LIZ = C212428Vi.LIZ(this);
                if (LIZ != null) {
                    C1FJ.LJI(c38333F2r, new C26045AKb(LIZ));
                    return;
                }
                return;
            }
            withState(v3(), new AqS97S0101000_9(i, this, 4));
        }
    }
}
