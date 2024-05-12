package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.AbstractC234519Ih;
import X.C187327Wu;
import X.C187337Wv;
import X.C189257bl;
import X.C189367bw;
import X.C189427c2;
import X.C19N;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C221138m5;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C43921HLp;
import X.C54838Lfe;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C88913eJ;
import X.C8YN;
import X.C9BD;
import X.C9KF;
import X.KR8;
import X.TBT;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS166S0200000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryViewerNavBarAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C221138m5 LJLJI;
    public C252709vu LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    public StoryViewerNavBarAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StoryGalleryListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 1014), C187327Wu.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(StoryViewerListViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ2, c9bd, new AqS153S0100000_3(LIZ2, 1015), C187337Wv.INSTANCE, null);
        this.LJLJI = KR8.LJIIJJI(new AqS153S0100000_3(this, 1016));
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1013));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1011));
    }

    public final Aweme v3() {
        C189367bw c189367bw = ((C189257bl) ((AssemViewModel) this.LJLILLLLZI.getValue()).getState()).LJLILLLLZI;
        if (c189367bw != null) {
            return c189367bw.LIZ;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C43921HLp.LIZ.LIZLLL("StoryViewerNavBarAssem");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C252709vu c252709vu;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C252709vu c252709vu2 = (C252709vu) view.findViewById(R.id.gwg);
        this.LJLJJI = c252709vu2;
        if (c252709vu2 != null) {
            C235119Kp c235119Kp = new C235119Kp();
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_trash_bin;
            LIZJ.LIZIZ = "start_action";
            LIZJ.LIZIZ(new AqS150S0200000_3(this, view, 48));
            C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
            LIZLLL.LIZJ = C88913eJ.LIZ(view, R.string.rq9, "view.context.getString(R…ry_viewerPanel_headline2)");
            c235119Kp.LIZJ = LIZLLL;
            C234529Ii LIZJ2 = s1.LIZJ();
            LIZJ2.LIZJ = R.raw.icon_x_mark;
            LIZJ2.LIZIZ(new AqS153S0100000_3(this, 1012));
            c235119Kp.LIZIZ(LIZJ2);
            c252709vu2.setNavActions(c235119Kp);
        }
        Integer LIZIZ = C19N.LIZIZ(view, "view.context", R.attr.cr);
        if (LIZIZ != null) {
            int intValue = LIZIZ.intValue();
            C252709vu c252709vu3 = this.LJLJJI;
            if (c252709vu3 != null) {
                c252709vu3.setNavBackground(intValue);
            }
        }
        Aweme v3 = v3();
        if (C54838Lfe.LJIILL(v3) && ((v3 == null || !C54838Lfe.LJIILJJIL(v3)) && (c252709vu = this.LJLJJI) != null)) {
            c252709vu.LJIJ("start_action", new AqS8S0010000_3(false, 2));
        }
        Context context = view.getContext();
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.7bv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C189257bl) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS166S0200000_3(context, this, 17), 4);
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.7bu
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C189257bl) obj).LJLILLLLZI;
            }
        }, null, new AqS166S0200000_3(context, this, 18), 6);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.7bz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C189257bl c189257bl = (C189257bl) obj;
                c189257bl.getClass();
                return C208708Ha.LIZLLL(c189257bl);
            }
        }, null, null, new AqS150S0200000_3(context, this, 49), null, 22, null);
        C43921HLp.LIZ.LJIIL("StoryViewerNavBarAssem", (C189427c2) this.LJLJJL.getValue());
    }

    public final void x3(long j, Context context) {
        String string;
        if (j > 0) {
            string = context.getResources().getQuantityString(R.plurals.tb, (int) j, Long.valueOf(j));
        } else {
            string = context.getString(R.string.rq9);
        }
        o.LJIIIIZZ(string, "when {\n            num >…)\n            }\n        }");
        C252709vu c252709vu = this.LJLJJI;
        if (c252709vu != null) {
            C9KF c9kf = new C9KF();
            c9kf.LIZJ = string;
            c252709vu.LJIILLIIL(c9kf);
        }
    }
}
