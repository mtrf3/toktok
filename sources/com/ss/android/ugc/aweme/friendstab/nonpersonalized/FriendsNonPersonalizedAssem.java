package com.ss.android.ugc.aweme.friendstab.nonpersonalized;

import X.C213688a4;
import X.C214298b3;
import X.C54454LYs;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BD;
import X.TBV;
import Y.AObserverS77S0100000_9;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;

/* loaded from: classes10.dex */
public final class FriendsNonPersonalizedAssem extends UIContentAssem {
    public final C214298b3 LJLIL;

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        ComplianceBusinessServiceImpl.LJJJJIZL().LJFF().observe(this, new AObserverS77S0100000_9(this, 12));
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBV() { // from class: X.LYt
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((C35644Dyq) obj).LJLIL;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((C35644Dyq) obj).LJLIL = (Boolean) obj2;
            }
        }, C213688a4.LIZLLL(), new AqS191S0100000_9(this, 21), 4);
    }

    public FriendsNonPersonalizedAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(FriendsNonPersonalizedVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9bd, new AqS159S0100000_9(LIZ, LiveCoverMinSizeSetting.DEFAULT), C54454LYs.INSTANCE, null);
    }
}
