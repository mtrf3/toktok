package com.ss.android.ugc.aweme.relation.feed.v4;

import X.ActivityC45651qj;
import X.C17N;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C221018lt;
import X.C221108m2;
import X.C53946LFe;
import X.C57434MgQ;
import X.C57586Mis;
import X.C57588Miu;
import X.C57591Mix;
import X.C57616MjM;
import X.C57622MjS;
import X.C57623MjT;
import X.C57624MjU;
import X.C57625MjV;
import X.C57638Mji;
import X.C57651Mjv;
import X.C57657Mk1;
import X.C57659Mk3;
import X.C57660Mk4;
import X.C57669MkD;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C77413UZt;
import X.C78926UyI;
import X.C8YN;
import X.C9BD;
import X.C9XU;
import X.TBT;
import Y.AObserverS77S0100000_9;
import Y.IDrS48S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.userservice.UserService;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RecSwipeCardListAssem extends ReusedUIContentAssem<RecSwipeCardListAssem> {
    public final C62822Ol8 LJZL;
    public C57586Mis LL;
    public final C214298b3 LLD;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;
    public final C57625MjV LLFII;
    public String LLFZ;
    public String LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public final C62822Ol8 LLIIIJ;

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void X3() {
        this.LLII = true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Y3() {
        this.LLII = false;
        if (this.LLIFFJFJJ && c4().LJLJLJ) {
            this.LLIFFJFJJ = false;
            int i = a4().LJZL + 1;
            C57586Mis c57586Mis = this.LL;
            if (c57586Mis != null) {
                if (i < c57586Mis.getItemCount()) {
                    b4().LJLIL(a4().LJZL + 1);
                    return;
                }
                return;
            }
            o.LJIJI("adapter");
            throw null;
        }
    }

    public RecSwipeCardListAssem() {
        new LinkedHashMap();
        this.LJZL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 523));
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RecSwipeViewModel.class);
        this.LLD = C78926UyI.LJ(this, LIZ, c9bd, new AqS159S0100000_9(LIZ, 524), C57651Mjv.INSTANCE, null);
        this.LLF = C221108m2.LIZIZ(C57669MkD.LJLIL);
        this.LLFF = C221108m2.LIZIZ(C57638Mji.LJLIL);
        this.LLFFF = C221108m2.LIZIZ(C57660Mk4.LJLIL);
        this.LLFII = new C57625MjV(this);
        this.LLIIIJ = C221108m2.LIZIZ(C57659Mk3.LJLIL);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        C9XU.LIZLLL(this.LLFII);
    }

    public final RecSwipeGalleryLayoutManager a4() {
        return (RecSwipeGalleryLayoutManager) this.LLF.getValue();
    }

    public final RecyclerView b4() {
        Object value = this.LJZL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (RecyclerView) value;
    }

    public final RecSwipeViewModel c4() {
        return (RecSwipeViewModel) this.LLD.getValue();
    }

    public final void Z3(ViewGroup.LayoutParams layoutParams) {
        double LJJJJJL;
        double d;
        Context context = getContext();
        if (context != null) {
            C57591Mix c57591Mix = (C57591Mix) this.LLFFF.getValue();
            c57591Mix.getClass();
            if (C63081OpJ.LJJJJJL(context) > C63081OpJ.LJJJJL(context)) {
                LJJJJJL = C63081OpJ.LJJJJL(context) * 0.5d;
                d = c57591Mix.LIZ.LIZJ;
            } else {
                LJJJJJL = C63081OpJ.LJJJJJL(context);
                d = 0.6d;
            }
            layoutParams.height = (int) (LJJJJJL * d);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        LifecycleOwner LIZIZ;
        o.LJIIIZ(view, "view");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C9XU.LIZIZ(LIZ, this.LLFII);
        }
        ViewGroup.LayoutParams layoutParams = getContainerView().getLayoutParams();
        o.LJIIIIZZ(layoutParams, "containerView.layoutParams");
        float LJIJJLI = C17N.LJIJJLI(320);
        float LJIJJLI2 = C53946LFe.LIZJ(C212428Vi.LIZ(this), null).LIZIZ - C17N.LJIJJLI(80);
        if (LJIJJLI > LJIJJLI2) {
            LJIJJLI = LJIJJLI2;
        }
        layoutParams.height = (int) (LJIJJLI * ((C57588Miu) this.LLIIIJ.getValue()).LIZJ);
        if (((Boolean) this.LLFF.getValue()).booleanValue()) {
            C221018lt.LIZ("RecSwipeCardListAssem", "[tablet]detected");
            Z3(layoutParams);
        }
        getContainerView().setLayoutParams(layoutParams);
        String str = c4().LJLJJLL;
        this.LLFZ = str;
        if (str != null) {
            String str2 = "homepage_hot";
            if (o.LJ(str, "homepage_hot")) {
                str2 = "no_fyp_feed";
            }
            this.LLI = str2;
            RecSwipeGalleryLayoutManager a4 = a4();
            RecyclerView b4 = b4();
            a4.LLIIII = b4;
            a4.LJZI = Math.max(0, 0);
            b4.setLayoutManager(a4);
            a4.LLF.LIZIZ(b4);
            b4.LJIIJJI(a4.LLFF);
            a4().LLIFFJFJJ = new C77413UZt();
            C57586Mis c57586Mis = new C57586Mis(c4());
            c57586Mis.setShowFooter(false);
            b4().setAdapter(c57586Mis);
            this.LL = c57586Mis;
            b4().setEdgeEffectFactory(new C57657Mk1());
            C57586Mis c57586Mis2 = this.LL;
            if (c57586Mis2 != null) {
                RecSwipeViewModel c4 = c4();
                String str3 = this.LLFZ;
                if (str3 != null) {
                    c57586Mis2.addData(c4.kv0(str3));
                    a4().LLII = new C57616MjM(this);
                    AssemViewModel.asyncSubscribe$default(c4(), new TBT() { // from class: X.Mjs
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C57629MjZ) obj).LJLJJI;
                        }
                    }, C213688a4.LIZLLL(), null, null, new AqS175S0100000_9(this, 237), 12, null);
                    C8YN.LJII(this, c4(), new TBT() { // from class: X.Mjt
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C57629MjZ) obj).LJLJJLL;
                        }
                    }, C213688a4.LIZLLL(), C57622MjS.LJLIL, 4);
                    C8YN.LJII(this, c4(), new TBT() { // from class: X.Mju
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C57629MjZ) obj).LJLJLJ;
                        }
                    }, C213688a4.LIZLLL(), C57624MjU.LJLIL, 4);
                    b4().LJIIJJI(new IDrS48S0100000_9(this, 5));
                    C8YN.LJII(this, c4(), new TBT() { // from class: X.Mjr
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C57629MjZ) obj).LJLJLLL;
                        }
                    }, null, C57623MjT.LJLIL, 6);
                    RecSwipeViewModel c42 = c4();
                    Context context = getContext();
                    c42.getClass();
                    if (context != null && (LIZIZ = C57434MgQ.LIZIZ(context)) != null) {
                        UserService.LIZ().LJII().observe(LIZIZ, new AObserverS77S0100000_9(c42, 115));
                        return;
                    }
                    return;
                }
                o.LJIJI("ownEventType");
                throw null;
            }
            o.LJIJI("adapter");
            throw null;
        }
        o.LJIJI("ownEventType");
        throw null;
    }
}
