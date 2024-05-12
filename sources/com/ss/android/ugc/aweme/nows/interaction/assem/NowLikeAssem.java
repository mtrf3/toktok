package com.ss.android.ugc.aweme.nows.interaction.assem;

import X.AbstractC193947jK;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C181697Bd;
import X.C181717Bf;
import X.C181737Bh;
import X.C181747Bi;
import X.C181787Bm;
import X.C181837Br;
import X.C181847Bs;
import X.C193887jE;
import X.C194237jn;
import X.C194437k7;
import X.C196387nG;
import X.C212428Vi;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C241249dQ;
import X.C40328FsC;
import X.C44384HbQ;
import X.C47704Ins;
import X.C51029K0z;
import X.C55749LuL;
import X.C5H3;
import X.C61845OOz;
import X.C62822Ol8;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C6ZT;
import X.C7A5;
import X.C7A6;
import X.C7AF;
import X.C7MK;
import X.C7ML;
import X.C7XD;
import X.C8XO;
import X.C8YN;
import X.EnumC181687Bc;
import X.EnumC181857Bt;
import X.InterfaceC115514g7;
import X.InterfaceC1805076o;
import X.InterfaceC194257jp;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.TBT;
import X.X1D;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowInteractionControl;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowEventDispatcherViewModel;
import com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowLikeViewModel;
import com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowShareViewModel;
import com.ss.android.ugc.now.interaction.api.InteractionSyncViewModelState;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS28S0001000_3;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowLikeAssem extends ReusedUISlotAssem<NowLikeAssem> implements C8XO<InterfaceC194547kI>, InterfaceC194257jp {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIL;
    public final InterfaceC115514g7 LLFF;
    public final InterfaceC115514g7 LLFFF;
    public final InterfaceC115514g7 LLFII;
    public final C5H3 LLFZ;
    public final C55749LuL LLI;
    public TuxIconView LLIFFJFJJ;
    public TuxTextView LLII;
    public ConstraintLayout LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;

    static {
        TBT tbt = new TBT(NowLikeAssem.class, "nowCellVM", "getNowCellVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowPostCellViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(NowLikeAssem.class, "shareVM", "getShareVM()Lcom/ss/android/ugc/aweme/nows/interaction/viewmodel/NowShareViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(NowLikeAssem.class, "likeVM", "getLikeVM()Lcom/ss/android/ugc/aweme/nows/interaction/viewmodel/NowLikeViewModel;", 0, c65351Pkp)};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.by1;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowLikeAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowPostCellViewModel.class);
        this.LLFF = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 661), null, C181717Bf.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(NowShareViewModel.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ2, null, new AqS153S0100000_3(LIZ2, 662), null, C181747Bi.INSTANCE, null, null);
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ3 = C65352Pkq.LIZ(NowLikeViewModel.class);
        this.LLFII = C214348b8.LIZ(this, LIZ3, c241249dQ, new AqS153S0100000_3(LIZ3, 663), null, C181697Bd.INSTANCE, null, null);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(NowEventDispatcherViewModel.class), C181737Bh.INSTANCE);
        this.LLI = new C55749LuL(C47704Ins.LIZJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 664));
        this.LLIIIJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 660));
    }

    public final NowLikeViewModel m4() {
        return (NowLikeViewModel) this.LLFII.LIZ(this, LLIIIL[2]);
    }

    public final C181847Bs n4() {
        return (C181847Bs) this.LLI.getValue();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(InterfaceC194547kI interfaceC194547kI) {
        InterfaceC194547kI item = interfaceC194547kI;
        o.LJIIIZ(item, "item");
        C194237jn.LIZ(this, (NowPostCellViewModel) this.LLFF.LIZ(this, LLIIIL[0]));
        NowLikeViewModel m4 = m4();
        int z = item.z();
        m4.getClass();
        m4.setState(new AqS28S0001000_3(z, 16));
        NowLikeViewModel m42 = m4();
        String LIZLLL = C7MK.LIZLLL(n4().LJLILLLLZI, item);
        m42.getClass();
        m42.setState(new AqS28S1000000_3(LIZLLL, 10));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC194547kI interfaceC194547kI) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        ((NowPostCellViewModel) this.LLFF.LIZ(this, LLIIIL[0])).hv0(this, C213688a4.LIZLLL());
        View findViewById = view.findViewById(R.id.fr9);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.like_icon)");
        this.LLIFFJFJJ = (TuxIconView) findViewById;
        View findViewById2 = view.findViewById(R.id.fr4);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.like_count)");
        this.LLII = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.frb);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.like_layout_root)");
        this.LLIIII = (ConstraintLayout) findViewById3;
        TuxTextView tuxTextView = this.LLII;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(72);
            C8YN.LJIILJJIL(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.7Bk
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C181777Bl) obj).LJLILLLLZI;
                }
            }, null, C7A5.LJLIL, 6);
            Object obj = (InterfaceC1805076o) this.LLIIIILZ.getValue();
            if (obj != null) {
                C8YN.LJII(this, (AssemViewModel) obj, new TBT() { // from class: X.761
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj2) {
                        return ((InteractionSyncViewModelState) obj2).getLikeState();
                    }
                }, null, new AqS185S0100000_3(this, 61), 6);
            }
            C8YN.LJIIJ(this, m4(), new TBT() { // from class: X.7AG
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj2) {
                    return ((C7AH) obj2).LJLILLLLZI;
                }
            }, new TBT() { // from class: X.7A7
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj2) {
                    return ((C7AH) obj2).LJLJI;
                }
            }, C213688a4.LIZLLL(), C7AF.LJLIL, 8);
            C8YN.LJII(this, m4(), new TBT() { // from class: X.7AI
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj2) {
                    return ((C7AH) obj2).LJLJJI;
                }
            }, C213688a4.LIZLLL(), C7A6.LJLIL, 4);
            return;
        }
        o.LJIJI("likeCount");
        throw null;
    }

    public final void p4(View view) {
        Aweme aweme;
        if (C6ZT.LIZIZ(view, 500L)) {
            return;
        }
        C7ML c7ml = (C7ML) C51029K0z.LJIILLIIL(this);
        if (c7ml != null && (aweme = c7ml.getAweme()) != null && aweme.isPrivate()) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null) {
                C40328FsC.LIZLLL(LIZ, R.string.j2p);
                return;
            }
            return;
        }
        if (((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().getUserDigg() != 1 && C44384HbQ.LJIIJJI(((C7ML) C51029K0z.LJIILLIIL(this)).getAweme())) {
            C196387nG c196387nG = (C196387nG) C196387nG.LIZJ.getValue();
            String aid = ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().getAid();
            o.LJIIIIZZ(aid, "item.aweme.aid");
            c196387nG.getClass();
            CopyOnWriteArrayList<String> copyOnWriteArrayList = c196387nG.LIZ;
            o.LJI(copyOnWriteArrayList);
            if (!copyOnWriteArrayList.contains(aid)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onClickLike(");
                LIZ2.append(((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().getAid());
                LIZ2.append(", ");
                C181787Bm c181787Bm = C181787Bm.LIZ;
                LIZ2.append(c181787Bm);
                LIZ2.append(')');
                C7XD.LIZ("NowLikeAssem", X1D.LIZIZ(LIZ2));
                C181837Br.LIZ = c181787Bm;
                ((NowShareViewModel) this.LLFFF.LIZ(this, LLIIIL[1])).jv0(EnumC181857Bt.FLIP, (InterfaceC194547kI) C51029K0z.LJIILLIIL(this));
            }
        }
        m4().kv0(view, false, n4().LJLIL, n4(), C7MK.LIZJ(((C194437k7) ((AssemViewModel) this.LLFF.LIZ(this, LLIIIL[0])).getState()).LJLIL, ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme()));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC194547kI interfaceC194547kI) {
    }

    @Override // X.InterfaceC194257jp
    public final void LLIIJLIL(AbstractC193947jK cellState, C194437k7 nowPostCellState) {
        Integer num;
        Aweme aweme;
        NowPostInfo nowPostInfo;
        NowInteractionControl nowInteractionControl;
        o.LJIIIZ(cellState, "cellState");
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        AbstractC193947jK abstractC193947jK = nowPostCellState.LJLIL;
        abstractC193947jK.getClass();
        if (abstractC193947jK instanceof C193887jE) {
            ConstraintLayout constraintLayout = this.LLIIII;
            if (constraintLayout != null) {
                C16880lQ.LJIL(constraintLayout, new ACListenerS23S0100000_3(this, 110));
                return;
            } else {
                o.LJIJI("likeLayout");
                throw null;
            }
        }
        C7ML c7ml = (C7ML) C51029K0z.LJIILLIIL(this);
        if (c7ml != null && (aweme = c7ml.getAweme()) != null && (nowPostInfo = aweme.nowPostInfo) != null && (nowInteractionControl = nowPostInfo.getNowInteractionControl()) != null) {
            num = Integer.valueOf(nowInteractionControl.getBlurLikeAction());
        } else {
            num = null;
        }
        int value = EnumC181687Bc.IGNORE.getValue();
        if (num == null || num.intValue() != value) {
            int value2 = EnumC181687Bc.SHOOT.getValue();
            if (num == null || num.intValue() != value2) {
                int value3 = EnumC181687Bc.DIGG.getValue();
                if (num == null || num.intValue() != value3) {
                    ConstraintLayout constraintLayout2 = this.LLIIII;
                    if (constraintLayout2 != null) {
                        C16880lQ.LJIL(constraintLayout2, (View.OnClickListener) this.LLIIIJ.getValue());
                        return;
                    } else {
                        o.LJIJI("likeLayout");
                        throw null;
                    }
                }
                ConstraintLayout constraintLayout3 = this.LLIIII;
                if (constraintLayout3 != null) {
                    C16880lQ.LJIL(constraintLayout3, new ACListenerS23S0100000_3(this, 111));
                    return;
                } else {
                    o.LJIJI("likeLayout");
                    throw null;
                }
            }
        }
        ConstraintLayout constraintLayout4 = this.LLIIII;
        if (constraintLayout4 != null) {
            C16880lQ.LJIL(constraintLayout4, (View.OnClickListener) this.LLIIIJ.getValue());
        } else {
            o.LJIJI("likeLayout");
            throw null;
        }
    }
}
