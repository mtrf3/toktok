package com.ss.android.ugc.aweme.nows.interaction.assem;

import X.AbstractC193947jK;
import X.C1804776l;
import X.C181847Bs;
import X.C185017Nx;
import X.C185027Ny;
import X.C194237jn;
import X.C194437k7;
import X.C213688a4;
import X.C214348b8;
import X.C3C8;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7ML;
import X.C7O0;
import X.C8VR;
import X.C8XO;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC194257jp;
import X.InterfaceC65350Pko;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import com.ss.android.ugc.now.interaction.api.IInteractionService;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowBubbleAssem extends ReusedUIContentAssem<NowBubbleAssem> implements C8XO<C7ML>, InterfaceC194257jp {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLD;
    public final InterfaceC115514g7 LJZL;
    public final C55749LuL LL;

    static {
        TBT tbt = new TBT(NowBubbleAssem.class, "nowCellVM", "getNowCellVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowPostCellViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLD = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowBubbleAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowPostCellViewModel.class);
        this.LJZL = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 655), null, C185027Ny.INSTANCE, null, null);
        this.LL = new C55749LuL(C47704Ins.LIZJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
    }

    public final NowPostCellViewModel a4() {
        return (NowPostCellViewModel) this.LJZL.LIZ(this, LLD[0]);
    }

    public final C181847Bs b4() {
        return (C181847Bs) this.LL.getValue();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C7ML item) {
        o.LJIIIZ(item, "item");
        C194237jn.LIZ(this, a4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if ((r1 instanceof X.C193997jP) == true) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z3(X.AbstractC193947jK r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "get post blur state "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "interactionBubble"
            X.C7XD.LIZ(r0, r1)
            r7.getClass()
            boolean r5 = r7 instanceof X.C193887jE
            r4 = 1
            r3 = 0
            r2 = 8
            if (r5 != 0) goto L32
            boolean r0 = X.MWW.LIZIZ()
            if (r0 != 0) goto La9
            X.7O2 r1 = r7.LIZ
            boolean r0 = r1 instanceof X.AbstractC194007jQ
            if (r0 == 0) goto La9
            if (r1 == 0) goto La9
            boolean r0 = r1 instanceof X.C193997jP
            if (r0 != r4) goto La9
        L32:
            android.view.View r0 = r6.getContainerView()
            r0.setVisibility(r3)
            if (r5 == 0) goto L68
            X.7nE r3 = X.C196367nE.LIZ
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r6)
            X.7ML r0 = (X.C7ML) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.getAweme()
            r3.getClass()
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            boolean r0 = X.C196367nE.LJFF(r1)
            if (r0 == 0) goto L68
            boolean r0 = X.C196367nE.LJIIJJI(r1)
            if (r0 == 0) goto L68
            boolean r0 = X.C195937mX.LJI(r1)
            if (r0 == 0) goto L68
            android.view.View r0 = r6.getContainerView()
            r0.setVisibility(r2)
        L68:
            java.lang.Object r1 = X.C51029K0z.LJIILLIIL(r6)
            X.7ML r1 = (X.C7ML) r1
            X.7O2 r0 = r7.LIZ
            boolean r0 = X.C195937mX.LJIILJJIL(r1, r0)
            if (r0 == 0) goto L93
            java.lang.Object r0 = X.C51029K0z.LJIILLIIL(r6)
            X.7ML r0 = (X.C7ML) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L93
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r0.getMatchedFriendStruct()
            if (r0 == 0) goto L93
            android.view.View r0 = r6.getContainerView()
            r0.setVisibility(r2)
        L93:
            java.lang.Object r1 = X.C51029K0z.LJIILLIIL(r6)
            X.7ML r1 = (X.C7ML) r1
            X.7O2 r0 = r7.LIZ
            boolean r0 = X.C195937mX.LJIILIIL(r1, r0)
            if (r0 == 0) goto La8
            android.view.View r0 = r6.getContainerView()
            r0.setVisibility(r2)
        La8:
            return
        La9:
            android.view.View r0 = r6.getContainerView()
            r0.setVisibility(r2)
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.interaction.assem.NowBubbleAssem.Z3(X.7jK):void");
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C7ML c7ml) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        a4().hv0(this, C213688a4.LIZLLL());
        IInteractionService.LIZ.getClass();
        C65776Prg LIZ = C1804776l.LIZ().LIZ();
        if (LIZ != null) {
            C8VR.LIZ(this, new AqS134S0200000_3(this, (NowBubbleAssem) LIZ, (InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>>) 116));
        }
        C8YN.LJII(this, a4(), new TBT() { // from class: X.7O1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C194437k7) obj).LJLJLLL;
            }
        }, null, C185017Nx.LJLIL, 6);
        C8YN.LJII(this, a4(), new TBT() { // from class: X.7Nz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C194437k7) obj).LJLLI);
            }
        }, C213688a4.LIZLLL(), C7O0.LJLIL, 4);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C7ML c7ml) {
    }

    @Override // X.InterfaceC194257jp
    public final void LLIIJLIL(AbstractC193947jK cellState, C194437k7 nowPostCellState) {
        o.LJIIIZ(cellState, "cellState");
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        Z3(cellState);
    }
}
