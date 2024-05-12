package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C221108m2;
import X.C37090Eh4;
import X.C37091Eh5;
import X.C39684Fho;
import X.C55627LsN;
import X.C62822Ol8;
import X.InterfaceC250809sq;
import X.LFD;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.service.IRegionMockService;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MFLocalTestAssem extends UIContentAssem {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    public MFLocalTestAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(C55627LsN.LJLIL);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 304));
    }

    public final ViewGroup v3() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-flRootContainer>(...)");
        return (ViewGroup) value;
    }

    @Override // X.C8W0
    public final void onResume() {
        InterfaceC250809sq resFakerService;
        super.onResume();
        LocalTestApi localTestApi = C37090Eh4.LIZ.LIZ;
        if (localTestApi != null && (resFakerService = localTestApi.getResFakerService()) != null) {
            resFakerService.LIZIZ(v3());
        }
    }

    @Override // X.C8W0
    public final void onStart() {
        LFD tabletService;
        InterfaceC250809sq resFakerService;
        super.onStart();
        C37091Eh5 c37091Eh5 = C37090Eh4.LIZ;
        LocalTestApi localTestApi = c37091Eh5.LIZ;
        if (localTestApi != null && (resFakerService = localTestApi.getResFakerService()) != null) {
            resFakerService.LIZLLL(v3());
        }
        LocalTestApi localTestApi2 = c37091Eh5.LIZ;
        if (localTestApi2 != null && (tabletService = localTestApi2.getTabletService()) != null) {
            v3();
            tabletService.LIZ();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            Object value = this.LJLIL.getValue();
            ViewGroup v3 = v3();
            value.getClass();
            if (C39684Fho.LIZ()) {
                ((IRegionMockService) ServiceManager.get().getService(IRegionMockService.class)).LIZ(LIZ, v3);
            }
        }
    }
}
