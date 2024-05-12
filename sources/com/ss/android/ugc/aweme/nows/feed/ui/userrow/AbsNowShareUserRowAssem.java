package com.ss.android.ugc.aweme.nows.feed.ui.userrow;

import X.AbstractC193947jK;
import X.C16880lQ;
import X.C181847Bs;
import X.C193867jC;
import X.C194437k7;
import X.C196367nE;
import X.C214348b8;
import X.C3C8;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7MM;
import X.C8XO;
import X.InterfaceC115514g7;
import X.InterfaceC193877jD;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowShareViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class AbsNowShareUserRowAssem<T, RECEIVER extends C3C8> extends ReusedUIContentAssem<RECEIVER> implements C8XO<T>, InterfaceC193877jD {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLF;
    public TuxIconView LJZL;
    public final InterfaceC115514g7 LL;
    public final C55749LuL LLD;

    static {
        TBT tbt = new TBT(AbsNowShareUserRowAssem.class, "shareVM", "getShareVM()Lcom/ss/android/ugc/aweme/nows/interaction/viewmodel/NowShareViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLF = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    public abstract AbstractC193947jK a4();

    public abstract InterfaceC194547kI b4();

    @Override // X.C8XO
    public final boolean c2(T t) {
        return true;
    }

    @Override // X.C8XO
    public final void n3(T t) {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public AbsNowShareUserRowAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowShareViewModel.class);
        this.LL = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 648), null, C7MM.INSTANCE, null, null);
        this.LLD = new C55749LuL(C47704Ins.LIZJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
    }

    public final void c4() {
        TuxIconView tuxIconView = this.LJZL;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
            TuxIconView tuxIconView2 = this.LJZL;
            if (tuxIconView2 != null) {
                C16880lQ.LJJJ(tuxIconView2, null);
                return;
            } else {
                o.LJIJI("shareIcon");
                throw null;
            }
        }
        o.LJIJI("shareIcon");
        throw null;
    }

    @Override // X.InterfaceC193877jD
    public final void LLLLLLLZIL(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        c4();
    }

    @Override // X.InterfaceC193877jD
    public final void LLLZIL(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        c4();
    }

    @Override // X.InterfaceC193877jD
    public final void LLZL(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        c4();
    }

    public final void Z3(InterfaceC194547kI item) {
        int i;
        o.LJIIIZ(item, "item");
        C196367nE.LIZ.getClass();
        if (C196367nE.LJIIIZ(item)) {
            i = R.raw.icon_arrow_turn_up_right;
        } else {
            i = R.raw.icon_ellipsis_vertical;
        }
        TuxIconView tuxIconView = this.LJZL;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(i);
        } else {
            o.LJIJI("shareIcon");
            throw null;
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LJZL = (TuxIconView) view;
    }

    @Override // X.InterfaceC193877jD
    public final void t1(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        C196367nE c196367nE = C196367nE.LIZ;
        Aweme aweme = b4().getAweme();
        c196367nE.getClass();
        if (C196367nE.LIZ(aweme)) {
            TuxIconView tuxIconView = this.LJZL;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
                TuxIconView tuxIconView2 = this.LJZL;
                if (tuxIconView2 != null) {
                    tuxIconView2.setTintColorRes(R.attr.dj);
                    TuxIconView tuxIconView3 = this.LJZL;
                    if (tuxIconView3 != null) {
                        C16880lQ.LJJJ(tuxIconView3, new ACListenerS23S0100000_3(this, 336));
                        return;
                    } else {
                        o.LJIJI("shareIcon");
                        throw null;
                    }
                }
                o.LJIJI("shareIcon");
                throw null;
            }
            o.LJIJI("shareIcon");
            throw null;
        }
        c4();
    }

    @Override // X.InterfaceC193877jD
    public final void x1(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        c4();
    }

    @Override // X.InterfaceC193877jD
    public final void y1(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        c4();
        TuxIconView tuxIconView = this.LJZL;
        if (tuxIconView != null) {
            tuxIconView.setTintColorRes(R.attr.dm);
        } else {
            o.LJIJI("shareIcon");
            throw null;
        }
    }

    @Override // X.InterfaceC194257jp
    public final void LLIIJLIL(AbstractC193947jK abstractC193947jK, C194437k7 c194437k7) {
        C193867jC.LIZ(this, abstractC193947jK, c194437k7);
    }
}
