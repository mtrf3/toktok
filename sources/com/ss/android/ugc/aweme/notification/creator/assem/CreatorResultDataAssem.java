package com.ss.android.ugc.aweme.notification.creator.assem;

import X.C213688a4;
import X.C214298b3;
import X.C56873MTt;
import X.C56874MTu;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BD;
import X.C9BE;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeTabVM;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CreatorResultDataAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;

    public CreatorResultDataAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CreatorNoticeResultVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 384), C56873MTt.INSTANCE, null);
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(CreatorNoticeTabVM.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ2, c9bd, new AqS159S0100000_9(LIZ2, 385), C56874MTu.INSTANCE, null);
    }

    public final CreatorNoticeResultVM v3() {
        return (CreatorNoticeResultVM) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.MTh
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT8) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), null, null, new AqS175S0100000_9(this, 156), 12, null);
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.MTw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT8) obj).LJLJJI;
            }
        }, C213688a4.LJ(), new AqS191S0100000_9(this, 36), 4);
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.MTi
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT0) obj).LJLJJL;
            }
        }, null, null, null, new AqS175S0100000_9(this, 157), 14, null);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.MTj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT0) obj).LJLILLLLZI;
            }
        }, C213688a4.LJ(), new AqS191S0100000_9(this, 37), 4);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.MTk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT0) obj).LJLJI;
            }
        }, C213688a4.LJ(), new AqS191S0100000_9(this, 35), 4);
    }
}
