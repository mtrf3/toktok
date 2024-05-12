package com.ss.android.ugc.aweme.nows.feed.ui.userrow;

import X.AbstractC193947jK;
import X.C194237jn;
import X.C194437k7;
import X.C196367nE;
import X.C213688a4;
import X.C214348b8;
import X.C51029K0z;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7MN;
import X.InterfaceC115514g7;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowShareUserRowAssem extends AbsNowShareUserRowAssem<InterfaceC194547kI, NowShareUserRowAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFFF;
    public final InterfaceC115514g7 LLFF;

    static {
        TBT tbt = new TBT(NowShareUserRowAssem.class, "nowCellVM", "getNowCellVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowPostCellViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLFFF = new InterfaceC74236TBo[]{tbt};
    }

    public NowShareUserRowAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowPostCellViewModel.class);
        this.LLFF = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 654), null, C7MN.INSTANCE, null, null);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.userrow.AbsNowShareUserRowAssem
    public final AbstractC193947jK a4() {
        return ((C194437k7) ((AssemViewModel) this.LLFF.LIZ(this, LLFFF[0])).getState()).LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.userrow.AbsNowShareUserRowAssem
    public final InterfaceC194547kI b4() {
        return (InterfaceC194547kI) C51029K0z.LJIILLIIL(this);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(Object obj) {
        InterfaceC194547kI item = (InterfaceC194547kI) obj;
        o.LJIIIZ(item, "item");
        C194237jn.LIZ(this, (NowPostCellViewModel) this.LLFF.LIZ(this, LLFFF[0]));
        C196367nE c196367nE = C196367nE.LIZ;
        Aweme aweme = item.getAweme();
        c196367nE.getClass();
        if (C196367nE.LIZ(aweme)) {
            Z3(item);
        } else {
            c4();
        }
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.userrow.AbsNowShareUserRowAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        ((NowPostCellViewModel) this.LLFF.LIZ(this, LLFFF[0])).hv0(this, C213688a4.LIZLLL());
    }
}
