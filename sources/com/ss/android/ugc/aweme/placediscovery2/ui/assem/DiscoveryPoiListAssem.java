package com.ss.android.ugc.aweme.placediscovery2.ui.assem;

import X.C199617sT;
import X.C214298b3;
import X.C47704Ins;
import X.C55749LuL;
import X.C56158M2g;
import X.C56161M2j;
import X.C56163M2l;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78924UyG;
import X.C78926UyI;
import X.C81139Vst;
import X.C9BE;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import Y.IDLListenerS60S0200000_9;
import Y.IDObjectS0S0101000;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes10.dex */
public final class DiscoveryPoiListAssem extends UIContentAssem {
    public final /* synthetic */ C199617sT LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final C214298b3 LJLJI;

    public DiscoveryPoiListAssem() {
        new LinkedHashMap();
        this.LJLIL = new C199617sT();
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, C56158M2g.class, "DiscoveryPoiListAssemHierarchyData"), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(DiscoveryLandingMapVM.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 493), C56161M2j.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C199617sT c199617sT = this.LJLIL;
        c199617sT.getClass();
        EventBus.LIZJ().LJIJ(c199617sT);
        ViewParent parent = getContainerView().getParent();
        o.LJII(parent, "null cannot be cast to non-null type com.ss.android.ugc.aweme.placediscovery2.ui.DragBottomSheet");
        Iterator<View> it = C78924UyG.LIZLLL(((C81139Vst) parent).getDragSheetContentContainer()).iterator();
        while (true) {
            IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
            if (iDObjectS0S0101000.hasNext()) {
                View view = (View) iDObjectS0S0101000.next();
                if (view instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ((SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) view);
                }
            } else {
                return;
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C199617sT c199617sT = this.LJLIL;
        c199617sT.getClass();
        EventBus.LIZJ().LJIILJJIL(c199617sT);
        ViewParent parent = getContainerView().getParent();
        o.LJII(parent, "null cannot be cast to non-null type com.ss.android.ugc.aweme.placediscovery2.ui.DragBottomSheet");
        ((C81139Vst) parent).setOnDragListener$nearby_release(new C56163M2l(this));
        view.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS60S0200000_9(this, view, 1));
    }
}
