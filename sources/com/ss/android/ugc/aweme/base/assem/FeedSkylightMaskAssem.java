package com.ss.android.ugc.aweme.base.assem;

import X.C184077Kh;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C47704Ins;
import X.C54602Lbq;
import X.C54614Lc2;
import X.C54628LcG;
import X.C54629LcH;
import X.C54634LcM;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8W0;
import X.InterfaceC65784Pro;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FeedSkylightMaskAssem extends UIContentAssem {
    public final C214378bB LJLIL;
    public final C55749LuL LJLILLLLZI;

    public FeedSkylightMaskAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(FeedSkylightContainerViewModel.class);
        C54629LcH c54629LcH = C54629LcH.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS159S0100000_9((C8W0) this, 70);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLIL = new C214378bB(LIZ, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c54629LcH, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, C54602Lbq.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
    }

    public final FeedSkylightContainerViewModel v3() {
        return (FeedSkylightContainerViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View containerView = getContainerView();
        o.LJII(containerView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ui.FeedSkylightTouchEventMask");
        ((C54634LcM) containerView).setListener(new C54628LcG(this));
    }

    public final void x3(boolean z) {
        String str;
        FeedSkylightContainerViewModel v3 = v3();
        if (z) {
            str = "pull";
        } else {
            str = "";
        }
        FeedSkylightContainerViewModel.iv0(v3, z, str, false, 12);
        FeedSkylightContainerViewModel v32 = v3();
        v32.getClass();
        v32.setState(new C54614Lc2(!z, true));
    }
}
