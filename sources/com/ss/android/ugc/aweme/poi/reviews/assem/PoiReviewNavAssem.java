package com.ss.android.ugc.aweme.poi.reviews.assem;

import X.C16880lQ;
import X.C186727Um;
import X.C212428Vi;
import X.C214298b3;
import X.C47704Ins;
import X.C54081LKj;
import X.C54082LKk;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7V0;
import X.C8YN;
import X.C9BE;
import X.EF7;
import X.InterfaceC56322M8o;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiReviewNavAssem extends UIContentAssem implements InterfaceC56322M8o {
    public static final int LJLJJL = (int) EF7.LIZIZ().getResources().getDimension(R.dimen.aje);
    public final C55749LuL LJLIL;
    public final C214298b3 LJLILLLLZI;
    public TuxTextView LJLJI;
    public boolean LJLJJI;

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    public PoiReviewNavAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LJ(this, C7V0.class, "PoiReviewHierarchyData"), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 782);
        C65776Prg LIZ = C65352Pkq.LIZ(PoiReviewListViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 783), C186727Um.INSTANCE, aqS153S0100000_3);
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return PoiReviewNavAssem.class.getName();
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        Context context = getContext();
        if (context != null) {
            return C54081LKj.LIZ(context, this);
        }
        return null;
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL == null || (lifecycle = LIZLLL.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.aeg);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 132), findViewById);
        }
        View findViewById2 = view.findViewById(R.id.eca);
        if (findViewById2 != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 133), findViewById2);
        }
        View findViewById3 = view.findViewById(R.id.title);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.title)");
        this.LJLJI = (TuxTextView) findViewById3;
        C8YN.LJII(this, this.LJLILLLLZI.getValue(), new TBT() { // from class: X.7Us
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C7VC) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 67), 6);
    }
}
