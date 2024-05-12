package com.ss.android.ugc.aweme.nows.feed.ui;

import X.AbstractC193947jK;
import X.AbstractC194637kR;
import X.C181847Bs;
import X.C185117Oh;
import X.C194237jn;
import X.C194437k7;
import X.C195167lI;
import X.C195237lP;
import X.C195277lT;
import X.C195287lU;
import X.C195297lV;
import X.C195307lW;
import X.C212428Vi;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C3C8;
import X.C47704Ins;
import X.C51029K0z;
import X.C55749LuL;
import X.C5H3;
import X.C61845OOz;
import X.C62822Ol8;
import X.C65314PkE;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73318Sq2;
import X.C73849Syb;
import X.C73969T1h;
import X.C77266UUc;
import X.C77357UXp;
import X.C78897Uxp;
import X.C7XD;
import X.C82B;
import X.C8VR;
import X.C8XO;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC194257jp;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.InterfaceC88472Yns;
import X.TBT;
import Y.AObserverS71S0100000_3;
import Y.AfS55S0100000_3;
import Y.IDhS96S0100000_3;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionAbility;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowAreaMonitorViewModel;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowLikeViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class NowPostBaseCellAssem<ASSEM extends ReusedUISlotAssem<? extends C3C8>, T extends InterfaceC194547kI> extends ReusedUISlotAssem<ASSEM> implements C8XO<T>, InterfaceC194257jp {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLII;
    public final InterfaceC115514g7 LLFF;
    public final C5H3 LLFFF;
    public final InterfaceC115514g7 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final C62822Ol8 LLI;
    public final C73318Sq2 LLIFFJFJJ;

    static {
        TBT tbt = new TBT(NowPostBaseCellAssem.class, "nowCellVM", "getNowCellVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowPostCellViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLII = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(NowPostBaseCellAssem.class, "nowLikeViewModel", "getNowLikeViewModel()Lcom/ss/android/ugc/aweme/nows/interaction/viewmodel/NowLikeViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(NowPostBaseCellAssem.class, "areaMonitorVM", "getAreaMonitorVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowAreaMonitorViewModel;", 0, c65351Pkp)};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.byd;
    }

    public abstract void m4(Assembler assembler);

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowPostBaseCellAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowPostCellViewModel.class);
        this.LLFF = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 609), null, C195277lT.INSTANCE, null, null);
        this.LLFFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C195307lW.INSTANCE);
        C65776Prg LIZ2 = C65352Pkq.LIZ(NowLikeViewModel.class);
        this.LLFII = C214348b8.LIZ(this, LIZ2, null, new AqS153S0100000_3(LIZ2, 610), null, C195287lU.INSTANCE, null, null);
        C65776Prg LIZ3 = C65352Pkq.LIZ(NowAreaMonitorViewModel.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ3, null, new AqS153S0100000_3(LIZ3, 611), null, C195297lV.INSTANCE, null, null);
        this.LLI = C221108m2.LIZIZ(new AqS153S0100000_3((NowPostBaseCellAssem) this, 608));
        this.LLIFFJFJJ = new C73318Sq2();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        this.LLIFFJFJJ.LIZLLL();
    }

    public final NowPostCellViewModel n4() {
        return (NowPostCellViewModel) this.LLFF.LIZ(this, LLII[0]);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(Object obj) {
        NowOtherCollectionAbility LJJ;
        C73849Syb<C82B> oh0;
        C73849Syb<Integer> nY;
        InterfaceC194547kI item = (InterfaceC194547kI) obj;
        o.LJIIIZ(item, "item");
        if (getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        NowPostCellViewModel n4 = n4();
        AbstractC194637kR feedPostState = C65314PkE.LJII();
        n4.getClass();
        o.LJIIIZ(feedPostState, "feedPostState");
        n4.setState(new AqS107S0300000_3(item, n4, feedPostState, 2));
        C194237jn.LIZ(this, n4());
        if (!item.LLLIL() || !item.LLLLIIIILLL() || (LJJ = C78897Uxp.LJJ(this)) == null || (oh0 = LJJ.oh0()) == null) {
            return;
        }
        this.LLIFFJFJJ.LIZLLL();
        p4(oh0, new TBT() { // from class: X.7lX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                return ((C82B) obj2).LJLJI;
            }
        }, new AqS169S0100000_3((NowPostBaseCellAssem) this, 970));
        p4(oh0, new TBT() { // from class: X.7lY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                return ((C82B) obj2).LJLJJI;
            }
        }, new AqS169S0100000_3((NowPostBaseCellAssem) this, 971));
        NowOtherCollectionAbility LJJ2 = C78897Uxp.LJJ(this);
        if (LJJ2 == null || (nY = LJJ2.nY()) == null) {
            return;
        }
        this.LLIFFJFJJ.LIZ(nY.LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS55S0100000_3(this, 72)));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(Object obj) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Lifecycle lifecycle;
        o.LJIIIZ(view, "view");
        if (getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        C55749LuL c55749LuL = new C55749LuL(C47704Ins.LJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
        if (c55749LuL.getValue() == null) {
            StringBuilder sb = new StringBuilder("Hierarchy data not found. ");
            sb.append(getLifecycle());
            sb.append(", ");
            sb.append(C212428Vi.LIZLLL(this));
            sb.append(", ");
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null) {
                lifecycle = LIZLLL.getLifecycle();
            } else {
                lifecycle = null;
            }
            sb.append(lifecycle);
            C7XD.LIZIZ("PostAssem", sb.toString());
        }
        C181847Bs c181847Bs = (C181847Bs) c55749LuL.getValue();
        if (c181847Bs == null) {
            return;
        }
        C8VR.LIZ(this, new AqS107S0300000_3((NowPostBaseCellAssem) this, view, (View) c181847Bs, (C181847Bs) 16));
        n4().hv0(this, C213688a4.LIZLLL());
        NowPostCellViewModel n4 = n4();
        n4.getClass();
        n4.setStateImmediate(new AqS169S0100000_3(c181847Bs, 33));
        NowPostCellViewModel n42 = n4();
        AbstractC194637kR newFeedPostState = C65314PkE.LJII();
        n42.getClass();
        o.LJIIIZ(newFeedPostState, "newFeedPostState");
        n42.setStateImmediate(new AqS169S0100000_3(newFeedPostState, 36));
        C65314PkE.LJIIJJI(this, true, C195167lI.LJLIL);
        C195237lP.LIZ(this, C185117Oh.LIZ, new AqS169S0100000_3((NowPostBaseCellAssem) this, 314));
        InterfaceC115514g7 interfaceC115514g7 = this.LLFII;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLII;
        AssemViewModel.asyncSubscribe$default((AssemViewModel) interfaceC115514g7.LIZ(this, interfaceC74236TBoArr[1]), new TBT() { // from class: X.7lK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C7AH) obj).LJLIL;
            }
        }, null, null, null, new AqS169S0100000_3((NowPostBaseCellAssem) this, 315), 14, null);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.LIZ(this, interfaceC74236TBoArr[2]), new TBT() { // from class: X.7lL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C196287n6) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 60), 4);
        if (((InterfaceC194547kI) C51029K0z.LJIILLIIL(this)).LLLIL() && !((InterfaceC194547kI) C51029K0z.LJIILLIIL(this)).LLLLIIIILLL()) {
            C195237lP.LIZ(this, C185117Oh.LIZIZ, new AqS169S0100000_3((NowPostBaseCellAssem) this, 316));
        }
        C77266UUc.LIZIZ.getRelationService().LJFF().observe(this, new AObserverS71S0100000_3(this, 27));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(Object obj) {
    }

    @Override // X.InterfaceC194257jp
    public final void LLIIJLIL(AbstractC193947jK cellState, C194437k7 nowPostCellState) {
        NowOtherCollectionAbility LJJ;
        o.LJIIIZ(cellState, "cellState");
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        NowOtherCollectionAbility LJJ2 = C78897Uxp.LJJ(this);
        if (LJJ2 != null && LJJ2.Ck((InterfaceC194547kI) C51029K0z.LJIILLIIL(this)) && (LJJ = C78897Uxp.LJJ(this)) != null) {
            LJJ.Vs(cellState);
        }
    }

    public final void p4(C73849Syb c73849Syb, TBT tbt, InterfaceC88472Yns interfaceC88472Yns) {
        this.LLIFFJFJJ.LIZ(c73849Syb.LJJIJL(new IDhS96S0100000_3(tbt, 5)).LJIILJJIL(C77357UXp.LJLIL).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS55S0100000_3(interfaceC88472Yns, 73)));
    }
}
