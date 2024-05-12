package com.ss.android.ugc.aweme.nows.feed.ui.userrow;

import X.AbstractC193947jK;
import X.C194237jn;
import X.C194337jx;
import X.C194347jy;
import X.C194357jz;
import X.C214348b8;
import X.C51029K0z;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8VR;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowPostUserRowAssem extends AbsNowPostUserRowAssem<InterfaceC194547kI, NowPostUserRowAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFII;
    public final InterfaceC115514g7 LLFFF;

    static {
        TBT tbt = new TBT(NowPostUserRowAssem.class, "nowCellVM", "getNowCellVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowPostCellViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLFII = new InterfaceC74236TBo[]{tbt};
    }

    public NowPostUserRowAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowPostCellViewModel.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 651), null, C194357jz.INSTANCE, null, null);
    }

    public final NowPostCellViewModel p4() {
        return (NowPostCellViewModel) this.LLFFF.LIZ(this, LLFII[0]);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.userrow.AbsNowPostUserRowAssem
    public final AbstractC193947jK b4() {
        return p4().getState().LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.userrow.AbsNowPostUserRowAssem
    public final InterfaceC194547kI c4() {
        return (InterfaceC194547kI) C51029K0z.LJIILLIIL(this);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.userrow.AbsNowPostUserRowAssem
    public final boolean l4() {
        return ((InterfaceC194547kI) C51029K0z.LJIILLIIL(this)).LLLLIIIILLL();
    }

    @Override // X.C8XO
    public final void F0(Object obj) {
        InterfaceC194547kI item = (InterfaceC194547kI) obj;
        o.LJIIIZ(item, "item");
        Z3(item);
        C194237jn.LIZ(this, p4());
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.userrow.AbsNowPostUserRowAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8VR.LIZ(this, new AqS134S0200000_3(this, view, 113));
        NowPostCellViewModel p4 = p4();
        C56412MCa c56412MCa = new C56412MCa();
        c56412MCa.LIZ = true;
        p4.hv0(this, c56412MCa);
        C8YN.LJII(this, p4(), new TBT() { // from class: X.7jw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C194437k7) obj).LJLJLJ;
            }
        }, null, C194337jx.LJLIL, 6);
        C8YN.LJII(this, p4(), new TBT() { // from class: X.7k0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C194437k7) obj).LJLL;
            }
        }, null, C194347jy.LJLIL, 6);
    }
}
