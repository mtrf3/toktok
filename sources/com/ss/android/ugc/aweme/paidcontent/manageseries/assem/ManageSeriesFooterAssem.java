package com.ss.android.ugc.aweme.paidcontent.manageseries.assem;

import X.A0N;
import X.A0O;
import X.A0S;
import X.A15;
import X.A16;
import X.C16880lQ;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C25524A0a;
import X.C25532A0i;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78685UuP;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.ORZ;
import X.SY4;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.model.ManagementPagePaidCollectionInfo;
import com.ss.android.ugc.aweme.model.ManagementPagePaidCollectionStatus;
import com.ss.android.ugc.aweme.model.ManagementPagePaidVideo;
import com.ss.android.ugc.aweme.paidcontent.manageseries.viewmodel.ManageSeriesNotificationViewModel;
import com.ss.android.ugc.aweme.paidcontent.manageseries.viewmodel.ManageSeriesViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ManageSeriesFooterAssem extends UIContentAssem {
    public SY4 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C55749LuL LJLJJL;

    public ManageSeriesFooterAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ManageSeriesNotificationViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 578), A0N.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(ManageSeriesViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ2, c9be, new AqS154S0100000_4(LIZ2, 579), A0O.INSTANCE, null);
        this.LJLJJI = C221108m2.LIZIZ(A0S.LJLIL);
        this.LJLJJL = new C55749LuL(C47704Ins.LIZJ(this, C25524A0a.class, "manage_series_hierarchy_data_key"), checkSupervisorPrepared());
    }

    public final C25524A0a A3() {
        return (C25524A0a) this.LJLJJL.getValue();
    }

    public final ManageSeriesViewModel C3() {
        return (ManageSeriesViewModel) this.LJLJI.getValue();
    }

    public static boolean v3(ManagementPagePaidCollectionInfo managementPagePaidCollectionInfo) {
        ManagementPagePaidCollectionStatus managementPagePaidCollectionStatus;
        if (managementPagePaidCollectionInfo != null) {
            managementPagePaidCollectionStatus = managementPagePaidCollectionInfo.status;
        } else {
            managementPagePaidCollectionStatus = null;
        }
        if (managementPagePaidCollectionStatus == ManagementPagePaidCollectionStatus.DRAFT && C78685UuP.LJJJZ(managementPagePaidCollectionInfo.coverUrl) && C78685UuP.LJJJZ(managementPagePaidCollectionInfo.name) && C78685UuP.LJJJZ(managementPagePaidCollectionInfo.description) && C78685UuP.LJJJZ(managementPagePaidCollectionInfo.priceInUsd)) {
            return true;
        }
        return false;
    }

    public static boolean x3(C25532A0i c25532A0i) {
        List<ManagementPagePaidVideo> list = c25532A0i.LJLJLJ;
        if (list == null) {
            return false;
        }
        if (list.size() <= 1 && (c25532A0i.LJLJLJ.size() != 1 || ((ManagementPagePaidVideo) ORZ.LJLLJ(c25532A0i.LJLJLJ)).isIntro)) {
            return false;
        }
        Map<A15, A16> map = c25532A0i.LJLL;
        if (map != null && !map.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        SY4 sy4 = (SY4) view.findViewById(R.id.jpj);
        this.LJLIL = sy4;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS24S0100000_4(this, 273));
        }
        SY4 sy42 = this.LJLIL;
        if (sy42 != null) {
            sy42.setEnabled(false);
        }
        ((AssemViewModel) this.LJLILLLLZI.getValue()).asyncSubscribe(new TBT() { // from class: X.A0K
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A0J) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS170S0100000_4(this, 1222), new AqS154S0100000_4(this, 1182), new AqS170S0100000_4(this, 1223));
        C8YN.LJII(this, C3(), new TBT() { // from class: X.A0Q
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25532A0i) obj).LJLJLJ;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 283), 4);
        C8YN.LJII(this, C3(), new TBT() { // from class: X.A0P
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25532A0i) obj).LJLL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 284), 4);
        SY4 sy43 = (SY4) view.findViewById(R.id.jpg);
        if (sy43 != null) {
            C16880lQ.LJJIZ(sy43, new ACListenerS24S0100000_4(this, 272));
        }
    }
}
