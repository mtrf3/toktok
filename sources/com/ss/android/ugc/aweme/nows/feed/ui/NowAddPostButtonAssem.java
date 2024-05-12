package com.ss.android.ugc.aweme.nows.feed.ui;

import X.AbstractC193947jK;
import X.C110614Vt;
import X.C16880lQ;
import X.C17N;
import X.C181847Bs;
import X.C189767ca;
import X.C189777cb;
import X.C189807ce;
import X.C189817cf;
import X.C193887jE;
import X.C194237jn;
import X.C194437k7;
import X.C195937mX;
import X.C213688a4;
import X.C214348b8;
import X.C47704Ins;
import X.C51029K0z;
import X.C55749LuL;
import X.C5H3;
import X.C61328O5c;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7MY;
import X.C8XO;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC194257jp;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.SY4;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS13S2100000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowAddPostButtonAssem extends ReusedUIContentAssem<NowAddPostButtonAssem> implements C8XO<InterfaceC194547kI>, InterfaceC194257jp {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFFF;
    public SY4 LJZL;
    public final InterfaceC115514g7 LL;
    public final C5H3 LLD;
    public final C55749LuL LLF;
    public boolean LLFF;

    static {
        TBT tbt = new TBT(NowAddPostButtonAssem.class, "nowCellVM", "getNowCellVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowPostCellViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLFFF = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowAddPostButtonAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowPostCellViewModel.class);
        this.LL = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 578), null, C189807ce.INSTANCE, null, null);
        this.LLD = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C189817cf.INSTANCE);
        this.LLF = new C55749LuL(C47704Ins.LIZJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
    }

    public final C181847Bs Z3() {
        return (C181847Bs) this.LLF.getValue();
    }

    @Override // X.C8XO
    public final void F0(InterfaceC194547kI item) {
        o.LJIIIZ(item, "item");
        C194237jn.LIZ(this, (NowPostCellViewModel) this.LL.LIZ(this, LLFFF[0]));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC194547kI interfaceC194547kI) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        SY4 sy4 = (SY4) C7MY.LIZLLL(view, "view", R.id.vv, "view.findViewById(R.id.add_post_button)");
        this.LJZL = sy4;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.dj);
        c110614Vt.LIZJ = C61328O5c.LIZJ(98);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        sy4.setBackground(c110614Vt.LIZ(context));
        ((NowPostCellViewModel) this.LL.LIZ(this, LLFFF[0])).hv0(this, C213688a4.LIZLLL());
        if (((InterfaceC194547kI) C51029K0z.LJIILLIIL(this)).LLLIL()) {
            C8YN.LJII(this, (AssemViewModel) this.LLD.getValue(), new TBT() { // from class: X.7cc
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJI;
                }
            }, null, C189767ca.LJLIL, 6);
            C8YN.LJII(this, (AssemViewModel) this.LLD.getValue(), new TBT() { // from class: X.7cd
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJJI;
                }
            }, null, C189777cb.LJLIL, 6);
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC194547kI interfaceC194547kI) {
    }

    @Override // X.InterfaceC194257jp
    public final void LLIIJLIL(AbstractC193947jK cellState, C194437k7 nowPostCellState) {
        o.LJIIIZ(cellState, "cellState");
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        if (nowPostCellState.LJLIL instanceof C193887jE) {
            if (!C195937mX.LIZ((InterfaceC194547kI) C51029K0z.LJIILLIIL(this))) {
                SY4 sy4 = this.LJZL;
                if (sy4 != null) {
                    C17N.LJJIIJZLJL(sy4);
                    return;
                } else {
                    o.LJIJI("addPostButton");
                    throw null;
                }
            }
            SY4 sy42 = this.LJZL;
            if (sy42 != null) {
                C17N.LJJLIIIJJI(sy42);
                if (this.LLFF) {
                    C8YN.LJIJI((AssemViewModel) this.LL.LIZ(this, LLFFF[0]), new AqS13S2100000_3(this, "show", 12));
                }
                SY4 sy43 = this.LJZL;
                if (sy43 != null) {
                    C16880lQ.LJJIZ(sy43, new ACListenerS23S0100000_3(this, 312));
                    return;
                } else {
                    o.LJIJI("addPostButton");
                    throw null;
                }
            }
            o.LJIJI("addPostButton");
            throw null;
        }
        SY4 sy44 = this.LJZL;
        if (sy44 != null) {
            C17N.LJJIIJZLJL(sy44);
        } else {
            o.LJIJI("addPostButton");
            throw null;
        }
    }
}
