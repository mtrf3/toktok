package com.ss.android.ugc.aweme.nows.interaction.assem;

import X.AV1;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C178436zP;
import X.C1801875i;
import X.C181707Be;
import X.C181727Bg;
import X.C181847Bs;
import X.C184737Mv;
import X.C194237jn;
import X.C194437k7;
import X.C195937mX;
import X.C1B3;
import X.C212428Vi;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C26045AKb;
import X.C47704Ins;
import X.C51029K0z;
import X.C55749LuL;
import X.C5H3;
import X.C61845OOz;
import X.C62822Ol8;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65777Prh;
import X.C77123UOp;
import X.C78963Uyt;
import X.C7A3;
import X.C7A4;
import X.C7AB;
import X.C7AD;
import X.C7MK;
import X.C7ML;
import X.C8XO;
import X.C8YN;
import X.EnumC178426zO;
import X.InterfaceC115514g7;
import X.InterfaceC1805076o;
import X.InterfaceC194257jp;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowCommentViewModel;
import com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowEventDispatcherViewModel;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.api.InteractionSyncViewModelState;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowCommentAssem extends ReusedUISlotAssem<NowCommentAssem> implements C8XO<InterfaceC194547kI>, InterfaceC194257jp {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIJ;
    public final InterfaceC115514g7 LLFF;
    public final InterfaceC115514g7 LLFFF;
    public final C5H3 LLFII;
    public final C55749LuL LLFZ;
    public final C55749LuL LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public TuxTextView LLII;
    public ConstraintLayout LLIIII;
    public final C62822Ol8 LLIIIILZ;

    static {
        TBT tbt = new TBT(NowCommentAssem.class, "nowCellVM", "getNowCellVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowPostCellViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIIJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(NowCommentAssem.class, "commentVM", "getCommentVM()Lcom/ss/android/ugc/aweme/nows/interaction/viewmodel/NowCommentViewModel;", 0, c65351Pkp)};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.by0;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowCommentAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowPostCellViewModel.class);
        this.LLFF = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 657), null, C181707Be.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(NowCommentViewModel.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ2, null, new AqS153S0100000_3(LIZ2, 658), null, C7AD.INSTANCE, null, null);
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(NowEventDispatcherViewModel.class), C181727Bg.INSTANCE);
        this.LLFZ = new C55749LuL(C47704Ins.LIZJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
        this.LLI = new C55749LuL(C47704Ins.LJ(this, C184737Mv.class, null), checkSupervisorPrepared());
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 659));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 656));
    }

    public final NowCommentViewModel m4() {
        return (NowCommentViewModel) this.LLFFF.LIZ(this, LLIIIJ[1]);
    }

    public final C181847Bs n4() {
        return (C181847Bs) this.LLFZ.getValue();
    }

    @Override // X.C8XO
    public final void F0(InterfaceC194547kI interfaceC194547kI) {
        String str;
        String str2;
        Fragment LJJJIL;
        long j;
        String str3;
        InterfaceC194547kI item = interfaceC194547kI;
        o.LJIIIZ(item, "item");
        C194237jn.LIZ(this, (NowPostCellViewModel) this.LLFF.LIZ(this, LLIIIJ[0]));
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        Aweme aweme = item.getAweme();
        FragmentManager fragmentManager = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (str != null) {
            if (LIZ != null) {
                fragmentManager = LIZ.getSupportFragmentManager();
                str2 = C1801875i.LIZIZ(LIZ, str);
            } else {
                str2 = null;
            }
            Iterator it = C1801875i.LIZ().iterator();
            boolean z = false;
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (o.LJ(str4, str2)) {
                    if (fragmentManager != null && (LJJJIL = fragmentManager.LJJJIL(str4)) != null) {
                        fragmentManager.getClass();
                        C1B3 c1b3 = new C1B3(fragmentManager);
                        c1b3.LJJI(LJJJIL);
                        c1b3.LJI();
                    }
                    z = true;
                }
            }
            if (z) {
                C65777Prh.LIZ(C1801875i.LIZ()).remove(str2);
            }
        }
        AwemeStatistics statistics = item.getAweme().getStatistics();
        if (statistics != null) {
            j = statistics.getCommentCount();
        } else {
            j = 0;
        }
        q4(j);
        NowCommentViewModel m4 = m4();
        NowFeedMobHierarchyData nowFeedMobHierarchyData = new NowFeedMobHierarchyData(C7MK.LIZLLL(n4().LJLILLLLZI, item), C195937mX.LJIIL(item.getAweme().getAuthor(), item.z()) ? 1 : 0, C7MK.LJ(n4().LJLJJI, item), Integer.valueOf(C7MK.LIZJ(((C194437k7) ((AssemViewModel) this.LLFF.LIZ(this, LLIIIJ[0])).getState()).LJLIL, item.getAweme())), Integer.valueOf(item.z()), n4().LJLIL.LIZIZ(), n4().LJLJJL, n4().LJLJJLL, n4().LJLIL.LJFF());
        m4.getClass();
        m4.setState(new AqS169S0100000_3(nowFeedMobHierarchyData, 654));
        if (getContainerView().getVisibility() == 0) {
            C184737Mv c184737Mv = (C184737Mv) this.LLI.getValue();
            if (c184737Mv != null && (str3 = c184737Mv.LJLJI) != null) {
                NowCommentViewModel.jv0(m4(), ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme(), C212428Vi.LIZ(this), 0, str3, "click_push", 66);
                return;
            }
            C184737Mv c184737Mv2 = (C184737Mv) this.LLI.getValue();
            if (c184737Mv2 == null || !c184737Mv2.LJLJJI) {
                return;
            }
            NowCommentViewModel.jv0(m4(), ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme(), C212428Vi.LIZ(this), 2, null, "click_push", 82);
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC194547kI interfaceC194547kI) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        ((NowPostCellViewModel) this.LLFF.LIZ(this, LLIIIJ[0])).hv0(this, C213688a4.LIZLLL());
        View findViewById = view.findViewById(R.id.bk2);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.comment_count)");
        this.LLII = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.bkw);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.comment_layout_root)");
        this.LLIIII = (ConstraintLayout) findViewById2;
        TuxTextView tuxTextView = this.LLII;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(72);
            ConstraintLayout constraintLayout = this.LLIIII;
            if (constraintLayout != null) {
                C16880lQ.LJIL(constraintLayout, new ACListenerS23S0100000_3(this, 109));
                C8YN.LJIILJJIL(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.7Bj
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C181777Bl) obj).LJLIL;
                    }
                }, null, C7AB.LJLIL, 6);
                C8YN.LJII(this, m4(), new TBT() { // from class: X.7AC
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Long.valueOf(((C7AA) obj).LJLIL);
                    }
                }, null, C7A4.LJLIL, 6);
                Object obj = (InterfaceC1805076o) this.LLIFFJFJJ.getValue();
                if (obj != null) {
                    C8YN.LJII(this, (AssemViewModel) obj, new TBT() { // from class: X.75v
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj2) {
                            return ((InteractionSyncViewModelState) obj2).getCommentCountState();
                        }
                    }, null, C7A3.LJLIL, 6);
                    return;
                }
                return;
            }
            o.LJIJI("commentLayout");
            throw null;
        }
        o.LJIJI("commentCount");
        throw null;
    }

    public final void p4(View view) {
        int i;
        Aweme aweme = ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme();
        aweme.setCommentClicked(true);
        EnumC178426zO LJJ = CommentServiceImpl.LJJL().LJJ(aweme);
        CommentService.LIZ.getClass();
        CommentServiceImpl.LJJL().LJJJJLL();
        int i2 = C178436zP.LIZ[LJJ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            NowCommentViewModel m4 = m4();
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            ((C7ML) C51029K0z.LJIILLIIL(this)).z();
            NowCommentViewModel.jv0(m4, aweme, LIZ, 0, null, "click_comment_icon", 18);
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(view);
        if (AV1.LJIJI(aweme.getAuthorUid())) {
            i = R.string.dks;
        } else {
            i = R.string.dkt;
        }
        c26045AKb.LJIIIIZZ(i);
        c26045AKb.LJIIJ();
    }

    public final void q4(long j) {
        String LJJIIJ;
        Aweme aweme;
        TuxTextView tuxTextView = this.LLII;
        if (tuxTextView != null) {
            C7ML c7ml = (C7ML) C51029K0z.LJIILLIIL(this);
            if (c7ml != null && (aweme = c7ml.getAweme()) != null && C78963Uyt.LJJIIJ(aweme)) {
                LJJIIJ = CardStruct.IStatusCode.DEFAULT;
            } else {
                LJJIIJ = C77123UOp.LJJIIJ(j);
            }
            tuxTextView.setText(LJJIIJ);
            return;
        }
        o.LJIJI("commentCount");
        throw null;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC194547kI interfaceC194547kI) {
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC194257jp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIJLIL(X.AbstractC193947jK r7, X.C194437k7 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "cellState"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "nowPostCellState"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            X.7jK r0 = r8.LJLIL
            r0.getClass()
            boolean r0 = r0 instanceof X.C193887jE
            r3 = 1
            java.lang.String r5 = "commentLayout"
            r4 = 0
            if (r0 == 0) goto L40
            androidx.constraintlayout.widget.ConstraintLayout r2 = r6.LLIIII
            if (r2 == 0) goto Ld8
            Y.ACListenerS23S0100000_3 r1 = new Y.ACListenerS23S0100000_3
            r0 = 107(0x6b, float:1.5E-43)
            r1.<init>(r6, r0)
            X.C16880lQ.LJIL(r2, r1)
            com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowCommentViewModel r0 = r6.m4()
            X.8YR r0 = r0.getVmDispatcher()
            X.33Q r0 = r0.getState()
            X.7AA r0 = (X.C7AA) r0
            com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData r1 = r0.LJLILLLLZI
            if (r1 != 0) goto L38
        L37:
            return
        L38:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.setNowClear(r0)
            goto L37
        L40:
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r6)
            X.7ML r0 = (X.C7ML) r0
            if (r0 == 0) goto Lcd
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto Lcd
            com.ss.android.ugc.aweme.now.NowPostInfo r0 = r0.nowPostInfo
            if (r0 == 0) goto Lcd
            com.ss.android.ugc.aweme.now.NowInteractionControl r0 = r0.getNowInteractionControl()
            if (r0 == 0) goto Lcd
            int r0 = r0.getBlurCommentAction()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L60:
            X.7Bc r0 = X.EnumC181687Bc.IGNORE
            int r1 = r0.getValue()
            r3 = 0
            if (r2 != 0) goto Lb7
        L69:
            X.7Bc r0 = X.EnumC181687Bc.SHOOT
            int r1 = r0.getValue()
            if (r2 != 0) goto Lb0
        L71:
            X.7Bc r0 = X.EnumC181687Bc.ENTER_COMMENT
            int r1 = r0.getValue()
            if (r2 != 0) goto L9b
        L79:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r6.LLIIII
            if (r1 == 0) goto Ldc
            X.Ol8 r0 = r6.LLIIIILZ
            java.lang.Object r0 = r0.getValue()
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            X.C16880lQ.LJIL(r1, r0)
        L88:
            com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowCommentViewModel r0 = r6.m4()
            X.8YR r0 = r0.getVmDispatcher()
            X.33Q r0 = r0.getState()
            X.7AA r0 = (X.C7AA) r0
            com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData r1 = r0.LJLILLLLZI
            if (r1 != 0) goto Lcf
            goto L37
        L9b:
            int r0 = r2.intValue()
            if (r0 != r1) goto L79
            androidx.constraintlayout.widget.ConstraintLayout r2 = r6.LLIIII
            if (r2 == 0) goto Le0
            Y.ACListenerS23S0100000_3 r1 = new Y.ACListenerS23S0100000_3
            r0 = 108(0x6c, float:1.51E-43)
            r1.<init>(r6, r0)
            X.C16880lQ.LJIL(r2, r1)
            goto L88
        Lb0:
            int r0 = r2.intValue()
            if (r0 != r1) goto L71
            goto Lbd
        Lb7:
            int r0 = r2.intValue()
            if (r0 != r1) goto L69
        Lbd:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r6.LLIIII
            if (r1 == 0) goto Le4
            X.Ol8 r0 = r6.LLIIIILZ
            java.lang.Object r0 = r0.getValue()
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            X.C16880lQ.LJIL(r1, r0)
            goto L88
        Lcd:
            r2 = r4
            goto L60
        Lcf:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.setNowClear(r0)
            goto L37
        Ld8:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r4
        Ldc:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r4
        Le0:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r4
        Le4:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.interaction.assem.NowCommentAssem.LLIIJLIL(X.7jK, X.7k7):void");
    }
}
